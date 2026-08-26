package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda26;
import org.telegram.ui.CameraScanActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.ShareTopicCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.ChatUsersActivity$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda8;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda41;
import org.telegram.ui.MessageSeenView;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;
import org.telegram.ui.QrActivity;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.UsersSelectActivity;

public class ShareAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public AnimatorSet animatorSet;
    public final QrActivity.AnonymousClass2 bottomFadeView;
    public final FrameLayout bulletinContainer;
    public final FrameLayout bulletinContainer2;
    public final BlurredBackgroundDrawable captionContainerBg;
    public float captionEditTextTopOffset;
    public float chatActivityEnterViewAnimateFromTop;
    public final AnonymousClass22 commentTextView;
    public int containerViewTop;
    public boolean copyLinkOnEnd;
    public float currentPanTranslationY;
    public final boolean darkTheme;
    public ShareAlertDelegate delegate;
    public final BlurredBackgroundDrawable emojiViewChildBg;
    public TLRPC.TL_exportedMessageLink exportedMessageLink;
    public final BlurredBackgroundWithFadeDrawable fadeDrawable;
    public boolean forceDarkThemeForHint;
    public final FrameLayout frameLayout;
    public final AnonymousClass21 frameLayout2;
    public boolean fullyShown;
    public final AnonymousClass12 gridView;
    public final int hasPoll;
    public final ViewGroupPartRenderer iBlur3Capture;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryFade;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    public final RectF iBlur3PositionMainTabs;
    public final ArrayList iBlur3Positions;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public final boolean includeStory;
    public boolean includeStoryFromMessage;
    public final boolean isChannel;
    public int keyboardSize2;
    public int lastOffset;
    public final GridLayoutManager layoutManager;
    public final SimpleTextView linkTextView;
    public final String[] linkToCopy;
    public final ShareDialogsAdapter listAdapter;
    public boolean loadingLink;
    public boolean panTranslationMoveLayout;
    public final Activity parentActivity;
    public final ChatActivity parentFragment;
    public final FrameLayout pickerBottom;
    public final FrameLayout pickerBottomLayout;
    public int previousScrollOffsetY;
    public ArrayList recentSearchObjects;
    public final RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    public int scrollOffsetY;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public final ShareSearchAdapter searchAdapter;
    public final StickerEmptyView searchEmptyView;
    public final AnonymousClass12 searchGridView;
    public boolean searchIsVisible;
    public final FillLastGridLayoutManager searchLayoutManager;
    public final FragmentSearchField searchView;
    public boolean searchWasVisibleBeforeTopics;
    public final HashMap selectedDialogTopics;
    public final LongSparseArray selectedDialogs;
    public TLRPC.Dialog selectedTopicDialog;
    public ActionBarPopupWindow sendPopupWindow;
    public final ArrayList sendingMessageObjects;
    public final String[] sendingText;
    public final View[] shadow;
    public final AnimatorSet[] shadowAnimation;
    public final Drawable shadowDrawable;
    public final ShareTopicsAdapter shareTopicsAdapter;
    public final LinearLayout sharesCountLayout;
    public int shiftDp;
    public boolean showSendersName;
    public final AnonymousClass5 sizeNotifierFrameLayout;
    public TL_stories.StoryItem storyItem;
    public final AnonymousClass6 switchView;
    public Insets systemInsets;
    public final TextPaint textPaint;
    public final int timestamp;
    public final CheckBox2 timestampCheckbox;
    public final FrameLayout timestampFrameLayout;
    public final LinearLayout timestampLayout;
    public ValueAnimator topBackgroundAnimator;
    public SpringAnimation topicsAnimation;
    public final ActionBar topicsBackActionBar;
    public final RecyclerListView topicsGridView;
    public final GridLayoutManager topicsLayoutManager;
    public boolean updateSearchAdapter;
    public final AnonymousClass25 writeButton;
    public final ChatActivity.AnonymousClass60 writeButtonContainer;

    public final class AnonymousClass12 extends RecyclerListView {
        public final int $r8$classId;
        public final ShareAlert this$0;

        public AnonymousClass12(int i, Context context, Theme.ResourcesProvider resourcesProvider, ShareAlert shareAlert) {
            super(context, resourcesProvider);
            this.$r8$classId = i;
            this.this$0 = shareAlert;
        }

        @Override
        public final boolean allowSelectChildAtPosition(float f) {
            switch (this.$r8$classId) {
                case 0:
                    ShareAlert shareAlert = this.this$0;
                    return f >= ((float) (AndroidUtilities.dp((!shareAlert.darkTheme || shareAlert.linkToCopy[1] == null) ? 58.0f : 111.0f) + shareAlert.systemInsets.top));
                default:
                    ShareAlert shareAlert2 = this.this$0;
                    return f >= ((float) (AndroidUtilities.dp((!shareAlert2.darkTheme || shareAlert2.linkToCopy[1] == null) ? 58.0f : 111.0f) + shareAlert2.systemInsets.top));
            }
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    ShareAlert shareAlert = this.this$0;
                    if (shareAlert.topicsGridView.getVisibility() != 8) {
                        canvas.save();
                        canvas.clipRect(0, AndroidUtilities.dp((!shareAlert.darkTheme || shareAlert.linkToCopy[1] == null) ? 58.0f : 111.0f) + shareAlert.scrollOffsetY, getWidth(), getHeight());
                    }
                    super.draw(canvas);
                    if (shareAlert.topicsGridView.getVisibility() != 8) {
                        canvas.restore();
                    }
                    break;
                default:
                    ShareAlert shareAlert2 = this.this$0;
                    if (shareAlert2.topicsGridView.getVisibility() != 8) {
                        canvas.save();
                        canvas.clipRect(0, AndroidUtilities.dp((!shareAlert2.darkTheme || shareAlert2.linkToCopy[1] == null) ? 58.0f : 111.0f) + shareAlert2.scrollOffsetY, getWidth(), getHeight());
                    }
                    super.draw(canvas);
                    if (shareAlert2.topicsGridView.getVisibility() != 8) {
                        canvas.restore();
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass21 extends FrameLayout {
        public AnonymousClass21(Context context) {
            super(context);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            ShareAlert shareAlert = ShareAlert.this;
            shareAlert.captionContainerBg.setBounds(0, (int) shareAlert.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            shareAlert.captionContainerBg.draw(canvas);
            canvas.save();
            canvas.clipRect(0.0f, shareAlert.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            ShareAlert shareAlert = ShareAlert.this;
            float f = shareAlert.chatActivityEnterViewAnimateFromTop;
            AnonymousClass21 anonymousClass21 = shareAlert.frameLayout2;
            if (f != 0.0f && f != anonymousClass21.getTop() + shareAlert.chatActivityEnterViewAnimateFromTop) {
                ValueAnimator valueAnimator = shareAlert.topBackgroundAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float top = shareAlert.chatActivityEnterViewAnimateFromTop - (anonymousClass21.getTop() + shareAlert.captionEditTextTopOffset);
                shareAlert.captionEditTextTopOffset = top;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(top, 0.0f);
                shareAlert.topBackgroundAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 16));
                shareAlert.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                shareAlert.topBackgroundAnimator.setDuration(200L);
                shareAlert.topBackgroundAnimator.start();
                shareAlert.chatActivityEnterViewAnimateFromTop = 0.0f;
            }
            shareAlert.shadow[1].setTranslationY((-(anonymousClass21.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + shareAlert.captionEditTextTopOffset + shareAlert.currentPanTranslationY + ((1.0f - getAlpha()) * (anonymousClass21.getMeasuredHeight() - AndroidUtilities.dp(48.0f))));
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                ShareAlert.this.shadow[1].setTranslationY(0.0f);
            }
        }
    }

    public final class AnonymousClass27 implements NotificationCenter.NotificationCenterDelegate {
        public final View val$cell;
        public final TLRPC.Dialog val$dialog;
        public final AtomicReference val$timeoutRef;

        public AnonymousClass27(TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
            this.val$dialog = dialog;
            this.val$timeoutRef = atomicReference;
            this.val$cell = view;
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            long jLongValue = ((Long) objArr[0]).longValue();
            TLRPC.Dialog dialog = this.val$dialog;
            if (jLongValue == (-dialog.id)) {
                ShareAlert shareAlert = ShareAlert.this;
                ArrayList arrayList = shareAlert.shareTopicsAdapter.topics;
                AtomicReference atomicReference = this.val$timeoutRef;
                boolean z = (arrayList == null && MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getTopicsController().getTopics(-dialog.id) != null) || atomicReference.get() == null;
                ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getTopicsController().getTopics(-dialog.id);
                ShareTopicsAdapter shareTopicsAdapter = shareAlert.shareTopicsAdapter;
                shareTopicsAdapter.topics = topics;
                shareTopicsAdapter.isBotForum = UserObject.isBotForum(((BottomSheet) shareAlert).currentAccount, dialog.id);
                shareTopicsAdapter.isBotForumWithManageTopics = UserObject.isBotForumWithEditableTopics(((BottomSheet) shareAlert).currentAccount, dialog.id);
                if (z) {
                    shareTopicsAdapter.mObservable.notifyChanged();
                }
                if (shareTopicsAdapter.topics != null) {
                    NotificationCenter.getInstance(((BottomSheet) shareAlert).currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
                }
                if (z) {
                    RecyclerListView recyclerListView = shareAlert.topicsGridView;
                    recyclerListView.setVisibility(0);
                    recyclerListView.setAlpha(0.0f);
                    ActionBar actionBar = shareAlert.topicsBackActionBar;
                    actionBar.setVisibility(0);
                    actionBar.setAlpha(0.0f);
                    if (UserObject.isBotForum(((BottomSheet) shareAlert).currentAccount, dialog.id)) {
                        actionBar.setTitle(DialogObject.getShortName(MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getUser(Long.valueOf(dialog.id))));
                        actionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                    } else if (ChatObject.isMonoForum(((BottomSheet) shareAlert).currentAccount, dialog.id)) {
                        actionBar.setTitle(ForumUtilities.getMonoForumTitle(MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getChat(Long.valueOf(-dialog.id)), ((BottomSheet) shareAlert).currentAccount, false));
                        actionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                    } else {
                        actionBar.setTitle(MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getChat(Long.valueOf(-dialog.id)).title);
                        actionBar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                    }
                    shareAlert.searchWasVisibleBeforeTopics = shareAlert.searchIsVisible;
                    SpringAnimation springAnimation = shareAlert.topicsAnimation;
                    if (springAnimation != null) {
                        springAnimation.cancel();
                    }
                    int[] iArr = new int[2];
                    SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(0.0f));
                    SpringForce springForce = new SpringForce(1000.0f);
                    ChatActivity chatActivity = shareAlert.parentFragment;
                    springForce.setStiffness((chatActivity == null || !chatActivity.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f);
                    springForce.setDampingRatio(1.0f);
                    springAnimation2.mSpring = springForce;
                    shareAlert.topicsAnimation = springAnimation2;
                    springAnimation2.addUpdateListener(new ShareAlert$$ExternalSyntheticLambda0(this, this.val$cell, iArr, 1));
                    shareAlert.topicsAnimation.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda14(this, 7));
                    shareAlert.topicsAnimation.start();
                    if (atomicReference.get() != null) {
                        AndroidUtilities.cancelRunOnUIThread((Runnable) atomicReference.get());
                        atomicReference.set(null);
                    }
                }
            }
        }
    }

    public final class AnonymousClass3 extends DarkThemeResourceProvider {
        public final int $r8$classId;

        public AnonymousClass3(int i) {
            this.$r8$classId = i;
        }

        @Override
        public void appendColors() {
            switch (this.$r8$classId) {
                case 0:
                    int i = Theme.key_windowBackgroundGray;
                    int i2 = Theme.key_dialogBackground;
                    int color = getColor(i2);
                    SparseIntArray sparseIntArray = this.sparseIntArray;
                    sparseIntArray.put(i, color);
                    sparseIntArray.put(Theme.key_divider, -15264235);
                    sparseIntArray.put(Theme.key_chat_messagePanelIcons, Theme.multAlpha(0.45f, -1));
                    sparseIntArray.put(Theme.key_dialogBackgroundGray, 352321535);
                    sparseIntArray.put(Theme.key_chat_emojiPanelBackground, getColor(i2));
                    break;
                case 2:
                    this.sparseIntArray.put(Theme.key_divider, 352321535);
                    break;
            }
        }

        public AnonymousClass3() {
            this.$r8$classId = 1;
            this.sparseIntArray.put(Theme.key_windowBackgroundWhite, -14537933);
            this.sparseIntArray.put(Theme.key_dialogBackground, -14537933);
            this.sparseIntArray.put(Theme.key_windowBackgroundGray, -13616313);
            this.sparseIntArray.put(Theme.key_graySection, -14142917);
            this.sparseIntArray.put(Theme.key_graySectionText, -8090220);
            this.sparseIntArray.put(Theme.key_groupcreate_spanBackground, -14142917);
            this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuBackground, -13616313);
            this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuSeparator, -14733761);
            this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuItemIcon, -1);
            this.sparseIntArray.put(Theme.key_actionBarDefaultSubmenuItem, -1);
            this.sparseIntArray.put(Theme.key_undo_background, -231982259);
            this.sparseIntArray.put(Theme.key_windowBackgroundWhiteBlueIcon, -11683585);
            this.sparseIntArray.put(Theme.key_windowBackgroundWhiteBlueButton, -10637330);
            this.sparseIntArray.put(Theme.key_checkboxSquareBackground, -12692893);
            this.sparseIntArray.put(Theme.key_checkbox, -15033089);
        }
    }

    public final class AnonymousClass30 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ShareAlert this$0;
        public final boolean val$show;

        public AnonymousClass30(ShareAlert shareAlert, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = shareAlert;
            this.val$show = z;
        }

        @Override
        public final void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ShareAlert shareAlert = this.this$0;
                    AnimatorSet animatorSet = shareAlert.shadowAnimation[0];
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        shareAlert.shadowAnimation[0] = null;
                        break;
                    }
                    break;
                default:
                    ShareAlert shareAlert2 = this.this$0;
                    if (animator.equals(shareAlert2.animatorSet)) {
                        shareAlert2.animatorSet = null;
                    }
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ShareAlert shareAlert = this.this$0;
                    AnimatorSet animatorSet = shareAlert.shadowAnimation[0];
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        if (!this.val$show) {
                            shareAlert.shadow[0].setVisibility(4);
                        }
                        shareAlert.shadowAnimation[0] = null;
                        break;
                    }
                    break;
                default:
                    ShareAlert shareAlert2 = this.this$0;
                    if (animator.equals(shareAlert2.animatorSet)) {
                        FrameLayout frameLayout = shareAlert2.pickerBottom;
                        if (!this.val$show) {
                            shareAlert2.frameLayout2.setVisibility(4);
                            FrameLayout frameLayout2 = shareAlert2.timestampFrameLayout;
                            if (frameLayout2 != null && frameLayout == null) {
                                frameLayout2.setVisibility(4);
                            }
                            shareAlert2.writeButtonContainer.setVisibility(4);
                        } else if (frameLayout != null) {
                            frameLayout.setVisibility(4);
                        }
                        shareAlert2.animatorSet = null;
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass5 extends SizeNotifierFrameLayout {
        public int fromOffsetTop;
        public int fromScrollY;
        public boolean fullHeight;
        public boolean ignoreLayout;
        public final boolean lightStatusBar;
        public final AnimatedFloat pinnedToTop;
        public int previousTopOffset;
        public final RectF rect1;
        public int toOffsetTop;
        public int toScrollY;
        public int topOffset;

        public AnonymousClass5(Context context) {
            super(context, null);
            this.ignoreLayout = false;
            this.rect1 = new RectF();
            this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                @Override
                public final boolean heightAnimationEnabled() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    if (ShareAlert.this.isDismissed()) {
                        return false;
                    }
                    ShareAlert shareAlert = ShareAlert.this;
                    if (shareAlert.fullyShown) {
                        return !shareAlert.commentTextView.isPopupVisible();
                    }
                    return false;
                }

                @Override
                public final void onPanTranslationUpdate(float f, float f2, boolean z) {
                    ShareAlert shareAlert;
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    ShareAlert shareAlert2 = ShareAlert.this;
                    int i = ShareAlert.$r8$clinit;
                    shareAlert2.getClass();
                    int i2 = 0;
                    while (true) {
                        shareAlert = ShareAlert.this;
                        if (i2 >= ((BottomSheet) shareAlert).containerView.getChildCount()) {
                            break;
                        }
                        View childAt = ((BottomSheet) shareAlert).containerView.getChildAt(i2);
                        if (childAt != shareAlert.pickerBottom && childAt != shareAlert.bulletinContainer && childAt != shareAlert.shadow[1] && childAt != shareAlert.sharesCountLayout && childAt != shareAlert.frameLayout2 && childAt != shareAlert.timestampFrameLayout && childAt != shareAlert.writeButtonContainer) {
                            childAt.setTranslationY(f);
                        }
                        i2++;
                    }
                    shareAlert.currentPanTranslationY = f;
                    int i3 = anonymousClass5.fromScrollY;
                    AnonymousClass12 anonymousClass12 = shareAlert.gridView;
                    if (i3 != -1) {
                        if (!z) {
                            f2 = 1.0f - f2;
                        }
                        float f3 = 1.0f - f2;
                        int i4 = anonymousClass5.toScrollY;
                        shareAlert.scrollOffsetY = (int) ((i4 * f2) + (i3 * f3));
                        float f4 = ((i3 - i4) * f3) + f;
                        anonymousClass12.setTranslationY(f4);
                        if (z) {
                            shareAlert.searchGridView.setTranslationY(f4);
                        } else {
                            shareAlert.searchGridView.setTranslationY(f4 + shareAlert.gridView.getPaddingTop());
                        }
                    } else {
                        int i5 = anonymousClass5.fromOffsetTop;
                        if (i5 != -1) {
                            float f5 = 1.0f - f2;
                            int i6 = anonymousClass5.toOffsetTop;
                            shareAlert.scrollOffsetY = (int) ((i6 * f2) + (i5 * f5));
                            if (!z) {
                                f5 = f2;
                            }
                            if (z) {
                                anonymousClass12.setTranslationY(f - ((i5 - i6) * f2));
                            } else {
                                anonymousClass12.setTranslationY(((i6 - i5) * f5) + f);
                            }
                        }
                    }
                    shareAlert.gridView.setTopGlowOffset((int) (shareAlert.scrollOffsetY + shareAlert.currentPanTranslationY));
                    shareAlert.frameLayout.setTranslationY(shareAlert.scrollOffsetY + shareAlert.currentPanTranslationY);
                    shareAlert.searchEmptyView.setTranslationY(shareAlert.scrollOffsetY + shareAlert.currentPanTranslationY);
                    shareAlert.frameLayout2.invalidate();
                    shareAlert.setCurrentPanTranslationY(shareAlert.currentPanTranslationY);
                    shareAlert.updateBottomOverlay$1();
                    anonymousClass5.invalidate();
                }

                @Override
                public final void onTransitionEnd() {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    AnonymousClass22 anonymousClass22 = ShareAlert.this.commentTextView;
                    if (anonymousClass22 == null || !anonymousClass22.isPopupVisible()) {
                        int i = ShareAlert.this.keyboardSize2;
                        AndroidUtilities.dp(20.0f);
                    }
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.panTranslationMoveLayout = false;
                    int i2 = shareAlert.scrollOffsetY;
                    shareAlert.previousScrollOffsetY = i2;
                    shareAlert.gridView.setTopGlowOffset(i2);
                    ShareAlert shareAlert2 = ShareAlert.this;
                    shareAlert2.frameLayout.setTranslationY(shareAlert2.scrollOffsetY);
                    ShareAlert shareAlert3 = ShareAlert.this;
                    shareAlert3.searchEmptyView.setTranslationY(shareAlert3.scrollOffsetY);
                    ShareAlert.this.gridView.setTranslationY(0.0f);
                    ShareAlert.this.searchGridView.setTranslationY(0.0f);
                    ShareAlert.this.updateBottomOverlay$1();
                }

                @Override
                public final void onTransitionStart(int i, boolean z) {
                    AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                    ShareAlert shareAlert = ShareAlert.this;
                    int i2 = shareAlert.previousScrollOffsetY;
                    int i3 = shareAlert.scrollOffsetY;
                    if (i2 != i3) {
                        anonymousClass5.fromScrollY = i2;
                        anonymousClass5.toScrollY = i3;
                        shareAlert.panTranslationMoveLayout = true;
                        shareAlert.scrollOffsetY = i2;
                    } else {
                        anonymousClass5.fromScrollY = -1;
                    }
                    int i4 = anonymousClass5.topOffset;
                    int i5 = anonymousClass5.previousTopOffset;
                    if (i4 != i5) {
                        anonymousClass5.fromOffsetTop = 0;
                        anonymousClass5.toOffsetTop = 0;
                        shareAlert.panTranslationMoveLayout = true;
                        if (z) {
                            anonymousClass5.toOffsetTop = i4 - i5;
                        } else {
                            anonymousClass5.toOffsetTop = 0 - (i4 - i5);
                        }
                        shareAlert.scrollOffsetY = z ? anonymousClass5.fromScrollY : anonymousClass5.toScrollY;
                    } else {
                        anonymousClass5.fromOffsetTop = -1;
                    }
                    shareAlert.gridView.setTopGlowOffset((int) (shareAlert.currentPanTranslationY + shareAlert.scrollOffsetY));
                    ShareAlert shareAlert2 = ShareAlert.this;
                    shareAlert2.frameLayout.setTranslationY(shareAlert2.currentPanTranslationY + shareAlert2.scrollOffsetY);
                    ShareAlert shareAlert3 = ShareAlert.this;
                    shareAlert3.searchEmptyView.setTranslationY(shareAlert3.currentPanTranslationY + shareAlert3.scrollOffsetY);
                    anonymousClass5.invalidate();
                }
            };
            this.lightStatusBar = AndroidUtilities.computePerceivedBrightness(ShareAlert.this.getThemedColor(Theme.key_dialogBackground)) > 0.721f;
            this.pinnedToTop = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            int i = Build.VERSION.SDK_INT;
            ShareAlert shareAlert = ShareAlert.this;
            if (i >= 31 && shareAlert.scrollableViewNoiseSuppressor != null) {
                ShareAlert.access$7200(shareAlert);
                BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = shareAlert.iBlur3SourceGlassFrosted;
                if (blurredBackgroundSourceRenderNode != null) {
                    blurredBackgroundSourceRenderNode.setSize(((BottomSheet) shareAlert).containerView.getMeasuredWidth(), ((BottomSheet) shareAlert).containerView.getMeasuredHeight());
                    blurredBackgroundSourceRenderNode.renderNodeWithHash.updateDisplayListIfNeeded();
                }
                BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = shareAlert.iBlur3SourceGlass;
                if (blurredBackgroundSourceRenderNode2 != null) {
                    blurredBackgroundSourceRenderNode2.setSize(((BottomSheet) shareAlert).containerView.getMeasuredWidth(), ((BottomSheet) shareAlert).containerView.getMeasuredHeight());
                    blurredBackgroundSourceRenderNode2.renderNodeWithHash.updateDisplayListIfNeeded();
                }
            }
            canvas.save();
            canvas.clipRect(0.0f, getPaddingTop() + shareAlert.currentPanTranslationY, getMeasuredWidth(), getMeasuredHeight() + shareAlert.currentPanTranslationY + AndroidUtilities.dp(50.0f));
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view instanceof EmojiView) {
                ShareAlert shareAlert = ShareAlert.this;
                if (shareAlert.emojiViewChildBg != null) {
                    canvas.save();
                    shareAlert.emojiViewChildBg.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                    canvas.clipPath(shareAlert.emojiViewChildBg.boundProps.path);
                    shareAlert.emojiViewChildBg.draw(canvas);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return zDrawChild;
                }
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        public final void drawList(Canvas canvas, ArrayList arrayList) {
            ShareAlert shareAlert = ShareAlert.this;
            if (shareAlert.gridView.getVisibility() == 0 && shareAlert.gridView.getAlpha() >= 0.0f) {
                canvas.save();
                canvas.translate(shareAlert.gridView.getX(), shareAlert.gridView.getY());
                shareAlert.gridView.draw(canvas);
                canvas.restore();
            }
            if (shareAlert.topicsGridView.getVisibility() == 0 && shareAlert.topicsGridView.getAlpha() >= 0.0f) {
                canvas.save();
                canvas.translate(shareAlert.topicsGridView.getX(), shareAlert.topicsGridView.getY());
                shareAlert.topicsGridView.draw(canvas);
                canvas.restore();
            }
            if (shareAlert.searchGridView.getVisibility() != 0 || shareAlert.searchGridView.getAlpha() < 0.0f) {
                return;
            }
            canvas.save();
            canvas.translate(shareAlert.searchGridView.getX(), shareAlert.searchGridView.getY());
            shareAlert.searchGridView.draw(canvas);
            canvas.restore();
        }

        @Override
        public final Theme.ResourcesProvider getResourceProvider() {
            return ((BottomSheet) ShareAlert.this).resourcesProvider;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            AdjustPanLayoutHelper adjustPanLayoutHelper = this.adjustPanLayoutHelper;
            adjustPanLayoutHelper.resizableViewToSet = this;
            adjustPanLayoutHelper.onAttach();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.adjustPanLayoutHelper.onDetach();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            canvas.save();
            ShareAlert shareAlert = ShareAlert.this;
            canvas.translate(0.0f, shareAlert.currentPanTranslationY);
            int iDp = AndroidUtilities.dp(6.0f) + (shareAlert.scrollOffsetY - ((BottomSheet) shareAlert).backgroundPaddingTop) + this.topOffset;
            int iDp2 = ((shareAlert.scrollOffsetY - ((BottomSheet) shareAlert).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) + this.topOffset;
            shareAlert.containerViewTop = iDp2;
            int iDp3 = ((BottomSheet) shareAlert).backgroundPaddingTop + AndroidUtilities.dp(60.0f) + getMeasuredHeight();
            if (((BottomSheet) shareAlert).isFullscreen) {
                f = 0.0f;
            } else {
                iDp += shareAlert.systemInsets.top;
                boolean z = this.fullHeight && ((BottomSheet) shareAlert).backgroundPaddingTop + iDp2 < shareAlert.systemInsets.top;
                int i = iDp2 + shareAlert.systemInsets.top;
                int i2 = -((BottomSheet) shareAlert).backgroundPaddingTop;
                f = this.pinnedToTop.set(z);
                iDp2 = AndroidUtilities.lerp(i, i2, f);
            }
            int measuredWidth = getMeasuredWidth();
            Drawable drawable = shareAlert.shadowDrawable;
            drawable.setBounds(0, iDp2, measuredWidth, iDp3);
            drawable.draw(canvas);
            FrameLayout frameLayout = shareAlert.bulletinContainer2;
            if (frameLayout != null) {
                if (iDp2 > shareAlert.systemInsets.top || frameLayout.getChildCount() <= 0) {
                    frameLayout.setTranslationY(Math.max(0, ((((BottomSheet) shareAlert).backgroundPaddingTop + iDp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
                } else {
                    frameLayout.setTranslationY(0.0f);
                    Bulletin bulletin = Bulletin.visibleBulletin;
                    if (bulletin != null) {
                        Bulletin.Layout layout = bulletin.layout;
                        if (layout != null) {
                            layout.setTop(true);
                        }
                        bulletin.hide();
                    }
                }
            }
            if (f < 1.0f) {
                int iDp4 = AndroidUtilities.dp(36.0f);
                RectF rectF = this.rect1;
                rectF.set((getMeasuredWidth() - iDp4) / 2, iDp, (getMeasuredWidth() + iDp4) / 2, AndroidUtilities.dp(4.0f) + iDp);
                Theme.dialogs_onlineCirclePaint.setColor(shareAlert.getThemedColor(Theme.key_sheet_scrollUp));
                Paint paint = Theme.dialogs_onlineCirclePaint;
                paint.setAlpha((int) ((1.0f - f) * paint.getAlpha()));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                int systemUiVisibility = getSystemUiVisibility();
                boolean z2 = this.lightStatusBar && ((float) 0) > ((float) shareAlert.systemInsets.top) * 0.5f;
                if (z2 != ((systemUiVisibility & 8192) > 0)) {
                    setSystemUiVisibility(z2 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                }
            }
            canvas.restore();
            this.previousTopOffset = this.topOffset;
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z = this.fullHeight;
            ShareAlert shareAlert = ShareAlert.this;
            if (z) {
                if (motionEvent.getAction() == 0 && shareAlert.scrollOffsetY != 0 && motionEvent.getY() < shareAlert.scrollOffsetY - AndroidUtilities.dp(30.0f)) {
                    shareAlert.lambda$showGiftOfferSheet$15();
                    return true;
                }
            } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.topOffset - AndroidUtilities.dp(30.0f)) {
                shareAlert.lambda$showGiftOfferSheet$15();
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int paddingRight;
            int i5;
            int paddingLeft;
            int i6;
            int i7;
            int paddingTop;
            int measuredHeight;
            int measuredHeight2;
            int childCount = getChildCount();
            int iMeasureKeyboardHeight = measureKeyboardHeight();
            ShareAlert shareAlert = ShareAlert.this;
            boolean z2 = ((BottomSheet) shareAlert).keyboardVisible;
            AnonymousClass22 anonymousClass22 = shareAlert.commentTextView;
            int iMax = (z2 || iMeasureKeyboardHeight > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(shareAlert.systemInsets.bottom, anonymousClass22.getEmojiPadding());
            setBottomClip(iMax);
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    int i9 = layoutParams.gravity;
                    if (i9 == -1) {
                        i9 = 51;
                    }
                    int i10 = i9 & 112;
                    int i11 = i9 & 7;
                    if (i11 != 1) {
                        if (i11 != 5) {
                            paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                        } else {
                            paddingRight = (((i3 - i) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                            i5 = ((BottomSheet) shareAlert).backgroundPaddingLeft;
                        }
                        if (i10 != 16) {
                            if (i10 != 48) {
                                paddingTop = this.topOffset + getPaddingTop() + layoutParams.topMargin;
                            } else if (i10 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i6 = ((i4 - iMax) - i2) - measuredHeight3;
                                i7 = layoutParams.bottomMargin;
                            }
                            if (anonymousClass22 != null && anonymousClass22.isPopupView(childAt)) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            if (childAt == shareAlert.bottomFadeView) {
                                paddingTop += shareAlert.systemInsets.bottom;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        } else {
                            i6 = ((((i4 - iMax) - (this.topOffset + i2)) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i7 = layoutParams.bottomMargin;
                        }
                        paddingTop = i6 - i7;
                        if (anonymousClass22 != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        if (childAt == shareAlert.bottomFadeView) {
                            paddingTop += shareAlert.systemInsets.bottom;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    } else {
                        paddingRight = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                        i5 = layoutParams.rightMargin;
                    }
                    paddingLeft = paddingRight - i5;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            paddingTop = this.topOffset + getPaddingTop() + layoutParams.topMargin;
                        } else if (i10 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i6 = ((i4 - iMax) - i2) - measuredHeight3;
                            i7 = layoutParams.bottomMargin;
                        }
                        if (anonymousClass22 != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        if (childAt == shareAlert.bottomFadeView) {
                            paddingTop += shareAlert.systemInsets.bottom;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    } else {
                        i6 = ((((i4 - iMax) - (this.topOffset + i2)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i7 = layoutParams.bottomMargin;
                    }
                    paddingTop = i6 - i7;
                    if (anonymousClass22 != null) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight() + iMeasureKeyboardHeight;
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    if (childAt == shareAlert.bottomFadeView) {
                        paddingTop += shareAlert.systemInsets.bottom;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                }
            }
            notifyHeightChanged();
            shareAlert.updateBottomOverlay$1();
            ShareAlert.access$6000(shareAlert);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            AnonymousClass5 anonymousClass5 = this;
            int size = anonymousClass5.getLayoutParams().height > 0 ? anonymousClass5.getLayoutParams().height : View.MeasureSpec.getSize(i2);
            ShareAlert shareAlert = ShareAlert.this;
            shareAlert.layoutManager.needFixGap = anonymousClass5.getLayoutParams().height <= 0;
            shareAlert.searchLayoutManager.needFixGap = anonymousClass5.getLayoutParams().height <= 0;
            if (!((BottomSheet) shareAlert).isFullscreen) {
                anonymousClass5.ignoreLayout = true;
                anonymousClass5.setPadding(((BottomSheet) shareAlert).backgroundPaddingLeft, shareAlert.systemInsets.top, ((BottomSheet) shareAlert).backgroundPaddingLeft, 0);
                anonymousClass5.ignoreLayout = false;
            }
            int paddingTop = size - anonymousClass5.getPaddingTop();
            int iM = ((BottomSheet) shareAlert).backgroundPaddingTop + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(Math.max(2, (int) Math.ceil(Math.max(shareAlert.searchAdapter.getItemCount(), shareAlert.listAdapter.getItemCount() - 1) / 4.0f)), 103.0f, AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            RecyclerListView recyclerListView = shareAlert.topicsGridView;
            if (recyclerListView.getVisibility() != 8) {
                int iM2 = ((BottomSheet) shareAlert).backgroundPaddingTop + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(Math.max(2, (int) Math.ceil((shareAlert.shareTopicsAdapter.getItemCount() - 1) / 4.0f)), 103.0f, AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
                if (iM2 > iM) {
                    iM = AndroidUtilities.lerp(iM, iM2, recyclerListView.getAlpha());
                }
            }
            int i3 = iM < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
            FrameLayout frameLayout = shareAlert.timestampFrameLayout;
            int iDp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + shareAlert.systemInsets.bottom;
            AnonymousClass12 anonymousClass12 = shareAlert.gridView;
            if (anonymousClass12.getPaddingTop() != i3 || anonymousClass12.getPaddingBottom() != iDp) {
                anonymousClass5.ignoreLayout = true;
                anonymousClass12.setPadding(0, i3, 0, iDp);
                recyclerListView.setPadding(0, i3, 0, iDp);
                anonymousClass5.ignoreLayout = false;
            }
            if (((BottomSheet) shareAlert).keyboardVisible && anonymousClass5.getLayoutParams().height <= 0) {
                AnonymousClass12 anonymousClass13 = shareAlert.searchGridView;
                if (anonymousClass13.getPaddingTop() != i3) {
                    anonymousClass5.ignoreLayout = true;
                    anonymousClass13.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + shareAlert.systemInsets.bottom);
                    anonymousClass5.ignoreLayout = false;
                }
            }
            boolean z = iM >= size;
            anonymousClass5.fullHeight = z;
            anonymousClass5.topOffset = z ? 0 : size - iM;
            anonymousClass5.ignoreLayout = true;
            shareAlert.checkCurrentList(false);
            anonymousClass5.ignoreLayout = false;
            anonymousClass5.setMeasuredDimension(View.MeasureSpec.getSize(i), size);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(iMakeMeasureSpec);
            int i4 = size2 - (((BottomSheet) shareAlert).backgroundPaddingLeft * 2);
            int iMeasureKeyboardHeight = anonymousClass5.measureKeyboardHeight();
            shareAlert.keyboardSize2 = iMeasureKeyboardHeight;
            AnonymousClass22 anonymousClass22 = shareAlert.commentTextView;
            if (!anonymousClass22.waitingForKeyboardOpen && iMeasureKeyboardHeight <= AndroidUtilities.dp(20.0f) && !anonymousClass22.emojiViewVisible && !anonymousClass22.isAnimatePopupClosing) {
                anonymousClass5.ignoreLayout = true;
                anonymousClass22.hideEmojiView();
                anonymousClass5.ignoreLayout = false;
            }
            anonymousClass5.ignoreLayout = true;
            int i5 = shareAlert.keyboardSize2;
            int iDp2 = AndroidUtilities.dp(20.0f);
            FrameLayout frameLayout2 = shareAlert.pickerBottomLayout;
            if (i5 <= iDp2) {
                if (!AndroidUtilities.isInMultiwindow) {
                    size3 -= ((BottomSheet) shareAlert).keyboardVisible ? 0 : anonymousClass22.getEmojiPadding();
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                }
                int i6 = anonymousClass22.emojiViewVisible ? 8 : 0;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(i6);
                }
            } else {
                if (!anonymousClass22.isPopupVisible()) {
                    anonymousClass22.hideEmojiView();
                }
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            int i7 = iMakeMeasureSpec;
            int i8 = size3;
            anonymousClass5.ignoreLayout = false;
            int childCount = anonymousClass5.getChildCount();
            int i9 = 0;
            while (i9 < childCount) {
                View childAt = anonymousClass5.getChildAt(i9);
                if (childAt != null && childAt.getVisibility() != 8) {
                    if (anonymousClass22 == null || !anonymousClass22.isPopupView(childAt)) {
                        anonymousClass5.measureChildWithMargins(childAt, i, 0, i7, 0);
                    } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (AndroidUtilities.isTablet()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), anonymousClass5.getPaddingTop() + (i8 - shareAlert.systemInsets.top)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(anonymousClass5.getPaddingTop() + (i8 - shareAlert.systemInsets.top), 1073741824));
                    }
                }
                i9++;
                anonymousClass5 = this;
            }
            shareAlert.updateBottomOverlay$1();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return !ShareAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public final class AnonymousClass6 extends SwitchView {
        public AnonymousClass6(Context context) {
            super(ShareAlert.this, context);
        }
    }

    public final class DialogSearchResult {
        public int date;
        public final TLRPC.TL_dialog dialog = new TLRPC.TL_dialog();
        public CharSequence name;
        public TLObject object;
    }

    public interface ShareAlertDelegate {
        void didCopy();

        void didShare();
    }

    public final class ShareDialogsAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;
        public final ArrayList dialogs = new ArrayList();
        public final LongSparseArray dialogsMap = new LongSparseArray();

        public final class MyStoryDialog extends TLRPC.Dialog {
        }

        public ShareDialogsAdapter(Context context) {
            this.context = context;
            fetchDialogs();
        }

        public final void fetchDialogs() {
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            ArrayList arrayList = this.dialogs;
            arrayList.clear();
            LongSparseArray longSparseArray = this.dialogsMap;
            longSparseArray.clear();
            ShareAlert shareAlert = ShareAlert.this;
            long j = UserConfig.getInstance(((BottomSheet) shareAlert).currentAccount).clientUserId;
            if (shareAlert.includeStory) {
                MyStoryDialog myStoryDialog = new MyStoryDialog();
                myStoryDialog.id = Long.MAX_VALUE;
                arrayList.add(myStoryDialog);
                longSparseArray.put(myStoryDialog, myStoryDialog.id);
            }
            if (!MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).dialogsForward.isEmpty()) {
                TLRPC.Dialog dialog = MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).dialogsForward.get(0);
                arrayList.add(dialog);
                longSparseArray.put(dialog, dialog.id);
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getAllDialogs();
            for (int i = 0; i < allDialogs.size(); i++) {
                TLRPC.Dialog dialog2 = allDialogs.get(i);
                if (dialog2 instanceof TLRPC.TL_dialog) {
                    long j2 = dialog2.id;
                    if (j2 != j && !DialogObject.isEncryptedDialog(j2)) {
                        if (DialogObject.isUserDialog(dialog2.id)) {
                            if (dialog2.folder_id == 1) {
                                arrayList2.add(dialog2);
                            } else {
                                arrayList.add(dialog2);
                            }
                            longSparseArray.put(dialog2, dialog2.id);
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getChat(Long.valueOf(-dialog2.id));
                            if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog2.folder_id == 1) {
                                    arrayList2.add(dialog2);
                                } else {
                                    arrayList.add(dialog2);
                                }
                                longSparseArray.put(dialog2, dialog2.id);
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            ChatActivity chatActivity = shareAlert.parentFragment;
            if (chatActivity != null) {
                int i2 = chatActivity.shareAlertDebugMode;
                if (i2 == 1) {
                    ArrayList arrayList3 = new ArrayList(arrayList.subList(0, Math.min(4, arrayList.size())));
                    arrayList.clear();
                    arrayList.addAll(arrayList3);
                } else if (i2 == 2) {
                    while (!arrayList.isEmpty() && arrayList.size() < 80) {
                        arrayList.add((TLRPC.Dialog) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList));
                    }
                }
            }
            this.mObservable.notifyChanged();
        }

        @Override
        public final int getItemCount() {
            int size = this.dialogs.size();
            return size != 0 ? size + 1 : size;
        }

        @Override
        public final int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Dialog dialog;
            if (viewHolder.mItemViewType == 0) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) viewHolder.itemView;
                int i2 = i - 1;
                if (i2 >= 0) {
                    ArrayList arrayList = this.dialogs;
                    if (i2 >= arrayList.size()) {
                        dialog = null;
                    } else {
                        dialog = (TLRPC.Dialog) arrayList.get(i2);
                    }
                } else {
                    dialog = null;
                }
                if (dialog == null) {
                    return;
                }
                ShareAlert shareAlert = ShareAlert.this;
                shareDialogCell.setTopic((TLRPC.TL_forumTopic) shareAlert.selectedDialogTopics.get(dialog), MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).isMonoForum(dialog.id), false);
                long j = dialog.id;
                shareDialogCell.setDialog(j, shareAlert.selectedDialogs.indexOfKey(j) >= 0, null);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            ShareAlert shareAlert = ShareAlert.this;
            Context context = this.context;
            if (i != 0) {
                view = new View(context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!shareAlert.darkTheme || shareAlert.linkToCopy[1] == null) ? 56.0f : 109.0f)));
            } else {
                view = new ShareDialogCell(context, ((BottomSheet) shareAlert).resourcesProvider) {
                    @Override
                    public final String repostToCustomName() {
                        return ShareAlert.this.includeStoryFromMessage ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
                    }
                };
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            }
            return new RecyclerListView.Holder(view);
        }
    }

    public final class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        public AnonymousClass5 categoryAdapter;
        public final Context context;
        public int itemsCount;
        public int lastGlobalSearchId;
        public int lastItemCont;
        public int lastLocalSearchId;
        public int lastSearchId;
        public String lastSearchText;
        public final AnonymousClass1 searchAdapterHelper;
        public ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 searchRunnable;
        public ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 searchRunnable2;
        public ArrayList searchResult = new ArrayList();
        public int hintsCell = -1;
        public int resentTitleCell = -1;
        public int firstEmptyViewCell = -1;
        public int recentDialogsStartRow = -1;
        public int lastFilledItem = -1;
        public boolean internalDialogsIsSearching = false;

        public final class AnonymousClass1 extends SearchAdapterHelper {
            @Override
            public final boolean filter(TLObject tLObject) {
                return !(tLObject instanceof TLRPC.Chat) || ChatObject.canWriteToChat((TLRPC.Chat) tLObject);
            }
        }

        public ShareSearchAdapter(Context context) {
            this.context = context;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(false);
            this.searchAdapterHelper = anonymousClass1;
            anonymousClass1.delegate = new Stripe(this, 26);
        }

        @Override
        public final int getItemCount() {
            this.itemsCount = 0;
            this.hintsCell = -1;
            this.resentTitleCell = -1;
            this.recentDialogsStartRow = -1;
            this.lastFilledItem = -1;
            if (!TextUtils.isEmpty(this.lastSearchText)) {
                int i = this.itemsCount;
                int i2 = i + 1;
                this.itemsCount = i2;
                this.firstEmptyViewCell = i;
                int size = this.searchAdapterHelper.localServerSearch.size() + this.searchResult.size() + i2;
                this.itemsCount = size;
                if (size == 1) {
                    this.firstEmptyViewCell = -1;
                    this.itemsCount = 0;
                    this.lastItemCont = 0;
                    return 0;
                }
                int i3 = size + 1;
                this.itemsCount = i3;
                this.lastFilledItem = size;
                this.lastItemCont = i3;
                return i3;
            }
            int i4 = this.itemsCount;
            this.firstEmptyViewCell = i4;
            this.itemsCount = i4 + 2;
            this.hintsCell = i4 + 1;
            ShareAlert shareAlert = ShareAlert.this;
            if (shareAlert.recentSearchObjects.size() > 0) {
                int i5 = this.itemsCount;
                int i6 = i5 + 1;
                this.itemsCount = i6;
                this.resentTitleCell = i5;
                this.recentDialogsStartRow = i6;
                this.itemsCount = shareAlert.recentSearchObjects.size() + i6;
            }
            int i7 = this.itemsCount;
            int i8 = i7 + 1;
            this.itemsCount = i8;
            this.lastFilledItem = i7;
            this.lastItemCont = i8;
            return i8;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == this.lastFilledItem) {
                return 4;
            }
            if (i == this.firstEmptyViewCell) {
                return 1;
            }
            if (i == this.hintsCell) {
                return 2;
            }
            if (i == this.resentTitleCell) {
                return 3;
            }
            return TextUtils.isEmpty(this.lastSearchText) ? 0 : 5;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return (i == 1 || i == 4) ? false : true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            long j;
            String name;
            CharSequence charSequence;
            long j2;
            int iIndexOfIgnoreCase;
            TLObject tLObject2;
            CharSequence charSequence2;
            int iIndexOfIgnoreCase2;
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 != 0 && i2 != 5) {
                if (i2 == 2) {
                    ((RecyclerListView) view).getAdapter().notifyDataSetChanged();
                    return;
                }
                return;
            }
            boolean zIsEmpty = TextUtils.isEmpty(this.lastSearchText);
            String name2 = null;
            AnonymousClass1 anonymousClass1 = this.searchAdapterHelper;
            ShareAlert shareAlert = ShareAlert.this;
            TLRPC.TL_encryptedChat tL_encryptedChat = null;
            if (!zIsEmpty) {
                int size = i - 1;
                if (size < this.searchResult.size()) {
                    DialogSearchResult dialogSearchResult = (DialogSearchResult) this.searchResult.get(size);
                    j2 = dialogSearchResult.dialog.id;
                    charSequence = dialogSearchResult.name;
                    tLObject = null;
                } else {
                    size -= this.searchResult.size();
                    tLObject = (TLObject) anonymousClass1.localServerSearch.get(size);
                    if (tLObject instanceof TLRPC.User) {
                        TLRPC.User user = (TLRPC.User) tLObject;
                        j = user.id;
                        name = ContactsController.formatName(user.first_name, user.last_name);
                    } else {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        j = -chat.id;
                        name = chat.title;
                    }
                    String str = anonymousClass1.lastFoundUsername;
                    if (TextUtils.isEmpty(str) || name == null || (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(name.toString(), str)) == -1) {
                        charSequence = name;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
                        spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) shareAlert).resourcesProvider), iIndexOfIgnoreCase, str.length() + iIndexOfIgnoreCase, 33);
                        charSequence = spannableStringBuilder;
                    }
                    j2 = j;
                }
                if (view instanceof ProfileSearchCell) {
                    ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                    profileSearchCell.setData(tLObject, null, charSequence, null, false, false);
                    profileSearchCell.useSeparator = size < getItemCount() - 2;
                    return;
                } else {
                    if (view instanceof ShareDialogCell) {
                        ((ShareDialogCell) view).setDialog(j2, shareAlert.selectedDialogs.indexOfKey(j2) >= 0, charSequence);
                        return;
                    }
                    return;
                }
            }
            int i3 = this.recentDialogsStartRow;
            long j3 = 0;
            if (i3 < 0 || i < i3) {
                tLObject2 = null;
                charSequence2 = null;
            } else {
                TLObject tLObject3 = ((DialogsSearchAdapter.RecentSearchObject) shareAlert.recentSearchObjects.get(i - i3)).object;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject3;
                    j3 = user2.id;
                    name2 = ContactsController.formatName(user2.first_name, user2.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                    j3 = -chat2.id;
                    name2 = chat2.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    TLRPC.User user3 = MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user3 != null) {
                        j3 = user3.id;
                        name2 = ContactsController.formatName(user3.first_name, user3.last_name);
                    }
                }
                String str2 = anonymousClass1.lastFoundUsername;
                if (TextUtils.isEmpty(str2) || name2 == null || (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(name2.toString(), str2)) == -1) {
                    tLObject2 = tLObject3;
                    charSequence2 = name2;
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(name2);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) shareAlert).resourcesProvider), iIndexOfIgnoreCase2, str2.length() + iIndexOfIgnoreCase2, 33);
                    tLObject2 = tLObject3;
                    charSequence2 = spannableStringBuilder2;
                }
            }
            TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
            if (view instanceof ProfileSearchCell) {
                ProfileSearchCell profileSearchCell2 = (ProfileSearchCell) view;
                profileSearchCell2.setData(tLObject2, tL_encryptedChat2, charSequence2, null, false, false);
                profileSearchCell2.useSeparator = i < getItemCount() - 2;
            } else {
                CharSequence charSequence3 = charSequence2;
                if (view instanceof ShareDialogCell) {
                    ((ShareDialogCell) view).setDialog(j3, shareAlert.selectedDialogs.indexOfKey(j3) >= 0, charSequence3);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ?? anonymousClass2;
            int i2 = 1;
            Context context = this.context;
            ShareAlert shareAlert = ShareAlert.this;
            if (i != 0) {
                boolean z = false;
                if (i == 2) {
                    ?? anonymousClass1 = new MessageSeenView.AnonymousClass1(context, 6, ((BottomSheet) shareAlert).resourcesProvider);
                    anonymousClass1.setItemAnimator(null);
                    anonymousClass1.setLayoutAnimation(null);
                    PhotoViewer.AnonymousClass36 anonymousClass36 = new PhotoViewer.AnonymousClass36(i2, 10, z);
                    anonymousClass36.setOrientation(0);
                    anonymousClass1.setLayoutManager(anonymousClass36);
                    ?? r6 = new DialogsSearchAdapter.CategoryAdapterRecycler(context, ((BottomSheet) shareAlert).currentAccount, ((BottomSheet) shareAlert).resourcesProvider) {
                        @Override
                        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i3) {
                            TLRPC.Chat chat;
                            String firstName;
                            HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
                            ShareAlert shareAlert2 = ShareAlert.this;
                            TLRPC.User user = null;
                            if (shareAlert2.darkTheme || shareAlert2.forceDarkThemeForHint) {
                                int i4 = Theme.key_voipgroup_nameText;
                                int i5 = Theme.key_voipgroup_inviteMembersBackground;
                                hintDialogCell.nameTextView.setTextColor(Theme.getColor(null, i4, false));
                                hintDialogCell.backgroundColorKey = i5;
                                hintDialogCell.checkBox.checkBoxBase.setColor(Theme.key_dialogRoundCheckBox, i5, Theme.key_dialogRoundCheckBoxCheck);
                            }
                            TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) shareAlert2).currentAccount).hints.get(i3);
                            TLRPC.Peer peer = tL_topPeer.peer;
                            long j = peer.user_id;
                            if (j != 0) {
                                user = MessagesController.getInstance(((BottomSheet) shareAlert2).currentAccount).getUser(Long.valueOf(tL_topPeer.peer.user_id));
                                chat = null;
                            } else {
                                long j2 = peer.channel_id;
                                if (j2 != 0) {
                                    j = -j2;
                                    chat = MessagesController.getInstance(((BottomSheet) shareAlert2).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
                                } else {
                                    long j3 = peer.chat_id;
                                    if (j3 != 0) {
                                        j = -j3;
                                        chat = MessagesController.getInstance(((BottomSheet) shareAlert2).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                                    } else {
                                        chat = null;
                                        j = 0;
                                    }
                                }
                            }
                            boolean z2 = j == hintDialogCell.getDialogId();
                            hintDialogCell.setTag(Long.valueOf(j));
                            if (user != null) {
                                firstName = UserObject.getFirstName(user);
                            } else {
                                firstName = chat != null ? chat.title : "";
                            }
                            hintDialogCell.setDialog(j, firstName);
                            boolean z3 = shareAlert2.selectedDialogs.indexOfKey(j) >= 0;
                            if (hintDialogCell.drawCheckbox) {
                                hintDialogCell.checkBox.checkBoxBase.setChecked(-1, z3, z2);
                            }
                        }
                    };
                    this.categoryAdapter = r6;
                    anonymousClass1.setAdapter(r6);
                    anonymousClass1.setOnItemClickListener(new ChatLinkActivity$$ExternalSyntheticLambda4(this, 26));
                    anonymousClass2 = anonymousClass1;
                } else if (i == 3) {
                    GraySectionCell graySectionCell = new GraySectionCell(context, 16, ((BottomSheet) shareAlert).resourcesProvider);
                    graySectionCell.setTextColor(Theme.key_graySectionText);
                    graySectionCell.setBackgroundColor(shareAlert.getThemedColor(Theme.key_graySection));
                    graySectionCell.setText(LocaleController.getString(R.string.Recent));
                    anonymousClass2 = graySectionCell;
                } else if (i == 4) {
                    anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 15);
                } else if (i != 5) {
                    View view = new View(context);
                    view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!shareAlert.darkTheme || shareAlert.linkToCopy[1] == null) ? 56.0f : 109.0f)));
                    anonymousClass2 = view;
                } else {
                    ShareDialogCell shareDialogCell = new ShareDialogCell(context, 0, ((BottomSheet) shareAlert).resourcesProvider);
                    shareDialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
                    anonymousClass2 = shareDialogCell;
                }
            } else {
                ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, ((BottomSheet) shareAlert).resourcesProvider);
                profileSearchCell.customPaints = true;
                profileSearchCell.showPremiumBlocked = true;
                anonymousClass2 = profileSearchCell;
            }
            return new RecyclerListView.Holder(anonymousClass2);
        }

        public final void searchDialogs(String str) {
            if (str == null || !str.equals(this.lastSearchText)) {
                this.lastSearchText = str;
                if (this.searchRunnable != null) {
                    Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                    this.searchRunnable = null;
                }
                ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 = this.searchRunnable2;
                if (shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 != null) {
                    AndroidUtilities.cancelRunOnUIThread(shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0);
                    this.searchRunnable2 = null;
                }
                this.searchResult.clear();
                this.searchAdapterHelper.mergeResults(null, null);
                this.searchAdapterHelper.queryServerSearch(null, true, true, true, true, false, 0L, false, 0, 0, 0L, null);
                this.mObservable.notifyChanged();
                ShareAlert.this.checkCurrentList(true);
                if (TextUtils.isEmpty(str)) {
                    ShareAlert.access$8200(ShareAlert.this);
                    this.lastSearchId = -1;
                    this.internalDialogsIsSearching = false;
                } else {
                    this.internalDialogsIsSearching = true;
                    int i = this.lastSearchId + 1;
                    this.lastSearchId = i;
                    ShareAlert.this.searchEmptyView.showProgress(true, true);
                    DispatchQueue dispatchQueue = Utilities.searchQueue;
                    ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0 shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda1 = new ShareAlert$ShareSearchAdapter$$ExternalSyntheticLambda0(this, str, i, 0);
                    this.searchRunnable = shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda1;
                    dispatchQueue.postRunnable(shareAlert$ShareSearchAdapter$$ExternalSyntheticLambda1, 300L);
                }
                ShareAlert.this.checkCurrentList(false);
            }
        }
    }

    public final class ShareTopicsAdapter extends RecyclerListView.SelectionAdapter {
        public final Context context;
        public boolean isBotForum;
        public boolean isBotForumWithManageTopics;
        public ArrayList topics;

        public ShareTopicsAdapter(Context context) {
            this.context = context;
        }

        @Override
        public final int getItemCount() {
            ArrayList arrayList = this.topics;
            return (arrayList != null ? arrayList.size() + 1 : 0) + (this.isBotForum ? 1 : 0);
        }

        @Override
        public final int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 1;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            float f;
            if (viewHolder.mItemViewType == 0) {
                ShareTopicCell shareTopicCell = (ShareTopicCell) viewHolder.itemView;
                if (i == 1 && this.isBotForum) {
                    shareTopicCell.setAsNewBotForumTopic(this.isBotForumWithManageTopics);
                    return;
                }
                ArrayList arrayList = this.topics;
                if (arrayList != null) {
                    int i2 = i - 1;
                    if (this.isBotForum) {
                        i2 = i - 2;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic = (i2 < 0 || i2 >= arrayList.size()) ? null : (TLRPC.TL_forumTopic) this.topics.get(i2);
                    ShareAlert shareAlert = ShareAlert.this;
                    TLRPC.Dialog dialog = shareAlert.selectedTopicDialog;
                    if (tL_forumTopic != null) {
                        if (shareAlert.selectedDialogs.indexOfKey(tL_forumTopic.id) >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (dialog == null) {
                        shareTopicCell.getClass();
                        return;
                    }
                    TLRPC.Chat chat = MessagesController.getInstance(shareTopicCell.currentAccount).getChat(Long.valueOf(-dialog.id));
                    long j = dialog.id;
                    TextView textView = shareTopicCell.nameTextView;
                    int i3 = shareTopicCell.currentAccount;
                    if (j > 0) {
                        textView.setText(tL_forumTopic.title);
                    } else if (chat == null) {
                        textView.setText("");
                    } else if (chat.monoforum) {
                        textView.setText(MessagesController.getInstance(i3).getPeerName(DialogObject.getPeerDialogId(tL_forumTopic.from_id)));
                    } else {
                        textView.setText(tL_forumTopic.title);
                    }
                    boolean zIsMonoForum = ChatObject.isMonoForum(chat);
                    BackupImageView backupImageView = shareTopicCell.imageView;
                    if (zIsMonoForum) {
                        backupImageView.setAnimatedEmojiDrawable(null);
                        backupImageView.setImageDrawable(null);
                        long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                        boolean zIsUserDialog = DialogObject.isUserDialog(peerDialogId);
                        ShareTopicCell.AnonymousClass1 anonymousClass1 = shareTopicCell.avatarDrawable;
                        if (zIsUserDialog) {
                            TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(peerDialogId));
                            textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, shareTopicCell.resourcesProvider));
                            anonymousClass1.setInfo(i3, user);
                            if (user != null) {
                                textView.setText(ContactsController.formatName(user.first_name, user.last_name));
                            } else {
                                textView.setText("");
                            }
                            backupImageView.imageReceiver.setForUserOrChat(user, anonymousClass1);
                            backupImageView.onNewImageSet();
                            backupImageView.setRoundRadius(AndroidUtilities.dp(28.0f));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i3).getChat(Long.valueOf(peerDialogId));
                            if (chat2 != null) {
                                textView.setText(chat2.title);
                            } else {
                                textView.setText("");
                            }
                            anonymousClass1.setInfo(i3, chat2);
                            backupImageView.imageReceiver.setForUserOrChat(chat, anonymousClass1);
                            backupImageView.onNewImageSet();
                        }
                        f = 28.0f;
                    } else {
                        f = 28.0f;
                        if (tL_forumTopic.icon_emoji_id != 0) {
                            backupImageView.setImageDrawable(null);
                            backupImageView.setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(13, UserConfig.selectedAccount, tL_forumTopic.icon_emoji_id));
                        } else {
                            backupImageView.setAnimatedEmojiDrawable(null);
                            ForumBubbleDrawable forumBubbleDrawable = new ForumBubbleDrawable(tL_forumTopic.icon_color);
                            LetterDrawable letterDrawable = new LetterDrawable(1, null);
                            String upperCase = tL_forumTopic.title.trim().toUpperCase();
                            letterDrawable.setTitle(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                            letterDrawable.scale = 1.8f;
                            CombinedDrawable combinedDrawable = new CombinedDrawable(forumBubbleDrawable, letterDrawable, 0, 0);
                            combinedDrawable.fullSize = true;
                            backupImageView.setImageDrawable(combinedDrawable);
                        }
                    }
                    backupImageView.setRoundRadius((chat == null || !chat.forum || z) ? AndroidUtilities.dp(f) : AndroidUtilities.dp(16.0f));
                    shareTopicCell.currentDialog = dialog.id;
                    shareTopicCell.currentTopic = tL_forumTopic.id;
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shareTopicCell;
            Context context = this.context;
            if (i == 0 || i == 2) {
                shareTopicCell = new ShareTopicCell(context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                shareTopicCell = new View(context);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, ActionBar.getCurrentActionBarHeight()));
            }
            return new RecyclerListView.Holder(shareTopicCell);
        }
    }

    public abstract class SwitchView extends FrameLayout {
        public AnimatorSet animator;
        public int currentTab;
        public final SimpleTextView leftTab;
        public LinearGradient linearGradient;
        public final Paint paint;
        public final RectF rect;
        public final SimpleTextView rightTab;
        public final AnonymousClass1 slidingView;

        public final class AnonymousClass1 extends View {
            public final AnonymousClass6 this$1;

            public AnonymousClass1(AnonymousClass6 anonymousClass6, Context context) {
                super(context);
                this.this$1 = anonymousClass6;
            }

            @Override
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                AnonymousClass6 anonymousClass6 = this.this$1;
                if (offsetColor != 0) {
                    anonymousClass6.linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP);
                    anonymousClass6.paint.setShader(anonymousClass6.linearGradient);
                }
                anonymousClass6.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(anonymousClass6.rect, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), anonymousClass6.paint);
            }

            @Override
            public final void setTranslationX(float f) {
                super.setTranslationX(f);
                invalidate();
            }
        }

        public SwitchView(ShareAlert shareAlert, Context context) {
            super(context);
            final int i = 1;
            this.paint = new Paint(1);
            this.rect = new RectF();
            View view = new View(context);
            int iDp = AndroidUtilities.dp(18.0f);
            int i2 = Theme.key_dialogSearchBackground;
            int i3 = ShareAlert.$r8$clinit;
            view.setBackgroundDrawable(Theme.createRoundRectDrawable(iDp, shareAlert.getThemedColor(i2)));
            addView(view, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((AnonymousClass6) this, context);
            this.slidingView = anonymousClass1;
            addView(anonymousClass1, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.leftTab = simpleTextView;
            int i4 = Theme.key_voipgroup_nameText;
            simpleTextView.setTextColor(shareAlert.getThemedColor(i4));
            simpleTextView.setTextSize(13);
            simpleTextView.setLeftDrawable(R.drawable.msg_tabs_mic1);
            final int i5 = 0;
            simpleTextView.setText(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
            simpleTextView.setGravity(17);
            addView(simpleTextView, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
            final AnonymousClass6 anonymousClass6 = (AnonymousClass6) this;
            simpleTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i5) {
                        case 0:
                            anonymousClass6.switchToTab(0);
                            break;
                        default:
                            anonymousClass6.switchToTab(1);
                            break;
                    }
                }
            });
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.rightTab = simpleTextView2;
            simpleTextView2.setTextColor(shareAlert.getThemedColor(i4));
            simpleTextView2.setTextSize(13);
            simpleTextView2.setLeftDrawable(R.drawable.msg_tabs_mic2);
            simpleTextView2.setText(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
            simpleTextView2.setGravity(17);
            addView(simpleTextView2, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
            simpleTextView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            anonymousClass6.switchToTab(0);
                            break;
                        default:
                            anonymousClass6.switchToTab(1);
                            break;
                    }
                }
            });
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(28.0f)) / 2;
            ((FrameLayout.LayoutParams) this.leftTab.getLayoutParams()).width = size;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.rightTab.getLayoutParams();
            layoutParams.width = size;
            layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
            AnonymousClass1 anonymousClass1 = this.slidingView;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anonymousClass1.getLayoutParams();
            layoutParams2.width = size;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            anonymousClass1.setTranslationX(this.currentTab == 0 ? 0.0f : layoutParams2.width);
            super.onMeasure(i, i2);
        }

        public final void switchToTab(int i) {
            if (this.currentTab == i) {
                return;
            }
            this.currentTab = i;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animator = animatorSet2;
            int i2 = this.currentTab;
            AnonymousClass1 anonymousClass1 = this.slidingView;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) View.TRANSLATION_X, i2 == 0 ? 0.0f : anonymousClass1.getMeasuredWidth()));
            this.animator.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.addListener(new Tooltip.AnonymousClass1(this, 3));
            this.animator.start();
            ShareAlert.this.updateLinkTextView();
        }
    }

    public ShareAlert(Context context, String str, String str2, Theme.ResourcesProvider resourcesProvider) {
        this(context, null, null, str, null, false, str2, null, false, false, null, resourcesProvider);
    }

    public static void access$6000(ShareAlert shareAlert) {
        if (shareAlert.panTranslationMoveLayout) {
            return;
        }
        boolean z = shareAlert.searchIsVisible;
        AnonymousClass12 anonymousClass12 = shareAlert.gridView;
        AnonymousClass12 anonymousClass13 = shareAlert.searchGridView;
        AnonymousClass12 anonymousClass14 = z ? anonymousClass13 : anonymousClass12;
        if (anonymousClass14.getChildCount() <= 0) {
            return;
        }
        View childAt = anonymousClass14.getChildAt(0);
        for (int i = 0; i < anonymousClass14.getChildCount(); i++) {
            if (anonymousClass14.getChildAt(i).getTop() < childAt.getTop()) {
                childAt = anonymousClass14.getChildAt(i);
            }
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass14.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i2 = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top < 0 || holder == null || holder.getAdapterPosition() != 0) {
            shareAlert.lastOffset = Integer.MAX_VALUE;
            shareAlert.runShadowAnimation$1$1(true);
            top = i2;
        } else {
            shareAlert.lastOffset = childAt.getTop();
            shareAlert.runShadowAnimation$1$1(false);
        }
        RecyclerListView recyclerListView = shareAlert.topicsGridView;
        if (recyclerListView.getVisibility() == 0) {
            if (recyclerListView.getChildCount() <= 0) {
                return;
            }
            View childAt2 = recyclerListView.getChildAt(0);
            for (int i3 = 0; i3 < recyclerListView.getChildCount(); i3++) {
                if (recyclerListView.getChildAt(i3).getTop() < childAt2.getTop()) {
                    childAt2 = recyclerListView.getChildAt(i3);
                }
            }
            RecyclerListView.Holder holder2 = (RecyclerListView.Holder) recyclerListView.findContainingViewHolder(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i4 = (top2 <= 0 || holder2 == null || holder2.getAdapterPosition() != 0) ? 0 : top2;
            if (top2 < 0 || holder2 == null || holder2.getAdapterPosition() != 0) {
                shareAlert.lastOffset = Integer.MAX_VALUE;
                shareAlert.runShadowAnimation$1$1(true);
                top2 = i4;
            } else {
                shareAlert.lastOffset = childAt2.getTop();
                shareAlert.runShadowAnimation$1$1(false);
            }
            top = AndroidUtilities.lerp(top, top2, recyclerListView.getAlpha());
        }
        int i5 = shareAlert.scrollOffsetY;
        if (i5 != top) {
            shareAlert.previousScrollOffsetY = i5;
            float f = top;
            int i6 = (int) (shareAlert.currentPanTranslationY + f);
            shareAlert.scrollOffsetY = i6;
            anonymousClass12.setTopGlowOffset(i6);
            int i7 = (int) (shareAlert.currentPanTranslationY + f);
            shareAlert.scrollOffsetY = i7;
            anonymousClass13.setTopGlowOffset(i7);
            int i8 = (int) (f + shareAlert.currentPanTranslationY);
            shareAlert.scrollOffsetY = i8;
            recyclerListView.setTopGlowOffset(i8);
            shareAlert.frameLayout.setTranslationY(shareAlert.scrollOffsetY + shareAlert.currentPanTranslationY);
            shareAlert.searchEmptyView.setTranslationY(shareAlert.scrollOffsetY + shareAlert.currentPanTranslationY);
            shareAlert.containerView.invalidate();
        }
    }

    public static void access$7200(ShareAlert shareAlert) {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        shareAlert.getClass();
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = shareAlert.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        RectF rectF = shareAlert.iBlur3PositionMainTabs;
        rectF.set(0.0f, 0.0f, shareAlert.containerView.getMeasuredWidth(), shareAlert.containerView.getMeasuredHeight());
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        downscaleScrollableNoiseSuppressor.setupRenderNodes(1, shareAlert.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(shareAlert.iBlur3Capture, shareAlert.containerView.getMeasuredWidth(), shareAlert.containerView.getMeasuredHeight());
    }

    public static int access$8200(ShareAlert shareAlert) {
        if (shareAlert.gridView.getChildCount() == 0) {
            return -1000;
        }
        AnonymousClass12 anonymousClass12 = shareAlert.gridView;
        int top = 0;
        View childAt = anonymousClass12.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass12.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = anonymousClass12.getPaddingTop();
        if (holder.getLayoutPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    public static ShareAlert createShareAlert(Context context, MessageObject messageObject, String str, boolean z, String str2) {
        return new ShareAlert(context, null, messageObject != null ? MediaController$$ExternalSyntheticOutline1.m(messageObject) : null, str, null, z, str2, null, false, false, null, null);
    }

    @Override
    public final boolean canDismissWithSwipe() {
        return false;
    }

    public final void checkCurrentList(boolean z) {
        FragmentSearchField fragmentSearchField = this.searchView;
        boolean zIsEmpty = TextUtils.isEmpty(fragmentSearchField.editText.getText());
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = fragmentSearchField.editText;
        AnonymousClass12 anonymousClass12 = this.gridView;
        AnonymousClass12 anonymousClass13 = this.searchGridView;
        boolean z2 = true;
        if (!zIsEmpty || ((this.keyboardVisible && anonymousClass4.hasFocus()) || this.searchWasVisibleBeforeTopics)) {
            this.updateSearchAdapter = true;
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(anonymousClass12, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(anonymousClass13, true);
            }
        } else {
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(anonymousClass12, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(anonymousClass13, false);
            }
            z2 = false;
        }
        if (this.searchIsVisible != z2 || z) {
            this.searchIsVisible = z2;
            ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
            shareSearchAdapter.mObservable.notifyChanged();
            this.listAdapter.mObservable.notifyChanged();
            if (this.searchIsVisible) {
                if (this.lastOffset == Integer.MAX_VALUE) {
                    ((LinearLayoutManager) anonymousClass13.getLayoutManager()).scrollToPositionWithOffset(0, -anonymousClass13.getPaddingTop());
                } else {
                    ((LinearLayoutManager) anonymousClass13.getLayoutManager()).scrollToPositionWithOffset(0, this.lastOffset - anonymousClass13.getPaddingTop());
                }
                shareSearchAdapter.searchDialogs(anonymousClass4.getText().toString());
                return;
            }
            int i = this.lastOffset;
            GridLayoutManager gridLayoutManager = this.layoutManager;
            if (i == Integer.MAX_VALUE) {
                gridLayoutManager.scrollToPositionWithOffset(0, 0, gridLayoutManager.mShouldReverseLayout);
            } else {
                gridLayoutManager.scrollToPositionWithOffset(0, 0, gridLayoutManager.mShouldReverseLayout);
            }
        }
    }

    public final void collapseTopics() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        View view = null;
        this.selectedTopicDialog = null;
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if ((childAt instanceof ShareDialogCell) && ((ShareDialogCell) childAt).getCurrentDialog() == dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        SpringAnimation springAnimation = this.topicsAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        getMainGridView().setVisibility(0);
        FragmentSearchField fragmentSearchField = this.searchView;
        fragmentSearchField.setVisibility(0);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            this.sizeNotifierFrameLayout.adjustPanLayoutHelper.ignoreOnce = true;
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = fragmentSearchField.editText;
            anonymousClass4.requestFocus();
            AndroidUtilities.showKeyboard(anonymousClass4);
        }
        int[] iArr = new int[2];
        SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(1000.0f));
        SpringForce springForce = new SpringForce(0.0f);
        ChatActivity chatActivity = this.parentFragment;
        springForce.setStiffness((chatActivity == null || !chatActivity.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f);
        springForce.setDampingRatio(1.0f);
        springAnimation2.mSpring = springForce;
        this.topicsAnimation = springAnimation2;
        springAnimation2.addUpdateListener(new ShareAlert$$ExternalSyntheticLambda0(this, (ShareDialogCell) view, iArr, 0));
        this.topicsAnimation.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda14(this, 6));
        this.topicsAnimation.start();
    }

    public final void copyLink() {
        boolean z = false;
        if (this.exportedMessageLink == null && this.linkToCopy[0] == null) {
            return;
        }
        try {
            ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", getLink()));
            ShareAlertDelegate shareAlertDelegate = this.delegate;
            if (shareAlertDelegate != null) {
                shareAlertDelegate.didCopy();
                return;
            }
            if (this.parentActivity instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.parentActivity).showBulletin(new LoginActivity$$ExternalSyntheticLambda41(3, z));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.dialogsNeedReload;
        if (i == i3) {
            ShareDialogsAdapter shareDialogsAdapter = this.listAdapter;
            if (shareDialogsAdapter != null) {
                shareDialogsAdapter.fetchDialogs();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i3);
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        AnonymousClass22 anonymousClass22 = this.commentTextView;
        if (anonymousClass22 != null) {
            AndroidUtilities.hideKeyboard(anonymousClass22.getEditText());
        }
        this.fullyShown = false;
        super.lambda$showGiftOfferSheet$15();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        AnonymousClass22 anonymousClass22 = this.commentTextView;
        if (anonymousClass22 != null) {
            anonymousClass22.onDestroy();
        }
    }

    @Override
    public final int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.containerViewTop;
    }

    public final String getLink() {
        String string;
        String[] strArr = this.linkToCopy;
        AnonymousClass6 anonymousClass6 = this.switchView;
        if (anonymousClass6 != null) {
            string = strArr[anonymousClass6.currentTab];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
            String str = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            string = str == null ? strArr[0] : str;
        }
        CheckBox2 checkBox2 = this.timestampCheckbox;
        if (checkBox2 != null && checkBox2.checkBoxBase.isChecked) {
            try {
                string = Uri.parse(string).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.timestamp)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return string == null ? "" : string;
    }

    public final RecyclerListView getMainGridView() {
        return (this.searchIsVisible || this.searchWasVisibleBeforeTopics) ? this.searchGridView : this.gridView;
    }

    public final void invalidateTopicsAnimation(View view, int[] iArr, float f) {
        RecyclerListView recyclerListView = this.topicsGridView;
        recyclerListView.setPivotX((view.getWidth() / 2.0f) + view.getX());
        recyclerListView.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        recyclerListView.setScaleX(f3);
        recyclerListView.setScaleY(f3);
        recyclerListView.setAlpha(f);
        RecyclerListView mainGridView = getMainGridView();
        mainGridView.setPivotX((view.getWidth() / 2.0f) + view.getX());
        mainGridView.setPivotY((view.getHeight() / 2.0f) + view.getY());
        float f4 = f2 + 1.0f;
        mainGridView.setScaleX(f4);
        mainGridView.setScaleY(f4);
        float f5 = 1.0f - f;
        mainGridView.setAlpha(f5);
        FragmentSearchField fragmentSearchField = this.searchView;
        fragmentSearchField.setPivotX(fragmentSearchField.getWidth() / 2.0f);
        fragmentSearchField.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        fragmentSearchField.setScaleX(f6);
        fragmentSearchField.setScaleY(f6);
        fragmentSearchField.setAlpha(f5);
        ActionBar actionBar = this.topicsBackActionBar;
        actionBar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f5);
        actionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        actionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        actionBar.setAlpha(f);
        recyclerListView.getLocationInWindow(iArr);
        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f);
        for (int i = 0; i < mainGridView.getChildCount(); i++) {
            View childAt = mainGridView.getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < recyclerListView.getChildCount(); i2++) {
            View childAt2 = recyclerListView.getChildAt(i2);
            if (childAt2 instanceof ShareTopicCell) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) (((double) (-(childAt2.getX() - view.getX()))) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) (Math.pow(d, 2.0d) * ((double) (-((recyclerListView.getTranslationY() + childAt2.getY()) - view.getY())))));
            }
        }
        this.containerView.requestLayout();
        mainGridView.invalidate();
    }

    public final boolean lambda$new$17() {
        ChatActivity chatActivity;
        Activity activity = this.parentActivity;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        ArrayList arrayList = this.sendingMessageObjects;
        boolean z = this.darkTheme;
        if (arrayList != null) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, activity, this.resourcesProvider);
            if (z) {
                actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_voipgroup_inviteMembersBackground));
            }
            actionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener(this, 0) {
                public final int $r8$classId;
                public final Rect popupRect;
                public final ShareAlert this$0;

                {
                    this.$r8$classId = i;
                    switch (i) {
                        case 1:
                            this.this$0 = this;
                            this.popupRect = new Rect();
                            break;
                        default:
                            this.this$0 = this;
                            this.popupRect = new Rect();
                            break;
                    }
                }

                @Override
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    ShareAlert shareAlert;
                    ActionBarPopupWindow actionBarPopupWindow;
                    ShareAlert shareAlert2;
                    ActionBarPopupWindow actionBarPopupWindow2;
                    switch (this.$r8$classId) {
                        case 0:
                            if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow = (shareAlert = this.this$0).sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
                                Rect rect = this.popupRect;
                                view.getHitRect(rect);
                                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    shareAlert.sendPopupWindow.dismiss(true);
                                }
                                break;
                            }
                            break;
                        default:
                            if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow2 = (shareAlert2 = this.this$0).sendPopupWindow) != null && actionBarPopupWindow2.isShowing()) {
                                Rect rect2 = this.popupRect;
                                view.getHitRect(rect2);
                                if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                    shareAlert2.sendPopupWindow.dismiss(true);
                                }
                                break;
                            }
                            break;
                    }
                    return false;
                }
            });
            actionBarPopupWindowLayout.setDispatchKeyEventListener(new ShareAlert$$ExternalSyntheticLambda12(this, 1));
            actionBarPopupWindowLayout.setShownFromBottom(false);
            final ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, getContext(), this.resourcesProvider, true, false);
            if (z) {
                actionBarMenuSubItem.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(-1, 48);
            ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
            anonymousClass2.addView(actionBarMenuSubItem, layoutParamsCreateLinear);
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ShowSendersName), 0, null);
            this.showSendersName = true;
            actionBarMenuSubItem.setChecked(true);
            final ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(1, getContext(), this.resourcesProvider, false, true);
            if (z) {
                actionBarMenuSubItem2.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            anonymousClass2.addView(actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.HideSendersName), 0, null);
            actionBarMenuSubItem2.setChecked(!this.showSendersName);
            final int i = 0;
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener(this) {
                public final ShareAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            ShareAlert shareAlert = this.f$0;
                            shareAlert.showSendersName = true;
                            actionBarMenuSubItem.setChecked(true);
                            actionBarMenuSubItem2.setChecked(!shareAlert.showSendersName);
                            break;
                        default:
                            ShareAlert shareAlert2 = this.f$0;
                            shareAlert2.showSendersName = false;
                            actionBarMenuSubItem.setChecked(false);
                            actionBarMenuSubItem2.setChecked(!shareAlert2.showSendersName);
                            break;
                    }
                }
            });
            final int i2 = 1;
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener(this) {
                public final ShareAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            ShareAlert shareAlert = this.f$0;
                            shareAlert.showSendersName = true;
                            actionBarMenuSubItem.setChecked(true);
                            actionBarMenuSubItem2.setChecked(!shareAlert.showSendersName);
                            break;
                        default:
                            ShareAlert shareAlert2 = this.f$0;
                            shareAlert2.showSendersName = false;
                            actionBarMenuSubItem.setChecked(false);
                            actionBarMenuSubItem2.setChecked(!shareAlert2.showSendersName);
                            break;
                    }
                }
            });
            actionBarPopupWindowLayout.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
            linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, activity, this.resourcesProvider);
        if (z) {
            actionBarPopupWindowLayout2.setBackgroundColor(Theme.getColor(null, Theme.key_voipgroup_inviteMembersBackground, false));
        }
        actionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindowLayout2.setOnTouchListener(new View.OnTouchListener(this, 1) {
            public final int $r8$classId;
            public final Rect popupRect;
            public final ShareAlert this$0;

            {
                this.$r8$classId = i;
                switch (i) {
                    case 1:
                        this.this$0 = this;
                        this.popupRect = new Rect();
                        break;
                    default:
                        this.this$0 = this;
                        this.popupRect = new Rect();
                        break;
                }
            }

            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ShareAlert shareAlert;
                ActionBarPopupWindow actionBarPopupWindow;
                ShareAlert shareAlert2;
                ActionBarPopupWindow actionBarPopupWindow2;
                switch (this.$r8$classId) {
                    case 0:
                        if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow = (shareAlert = this.this$0).sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
                            Rect rect = this.popupRect;
                            view.getHitRect(rect);
                            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                shareAlert.sendPopupWindow.dismiss(true);
                            }
                            break;
                        }
                        break;
                    default:
                        if (motionEvent.getActionMasked() == 0 && (actionBarPopupWindow2 = (shareAlert2 = this.this$0).sendPopupWindow) != null && actionBarPopupWindow2.isShowing()) {
                            Rect rect2 = this.popupRect;
                            view.getHitRect(rect2);
                            if (!rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                                shareAlert2.sendPopupWindow.dismiss(true);
                            }
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ShareAlert$$ExternalSyntheticLambda12(this, 2));
        actionBarPopupWindowLayout2.setShownFromBottom(false);
        ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, true);
        if (z) {
            actionBarMenuSubItem3.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem3.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off, null);
        actionBarMenuSubItem3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        LinearLayout.LayoutParams layoutParamsCreateLinear2 = LayoutHelper.createLinear(-1, 48);
        ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass3 = actionBarPopupWindowLayout2.linearLayout;
        anonymousClass3.addView(actionBarMenuSubItem3, layoutParamsCreateLinear2);
        actionBarMenuSubItem3.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda3(this, 2));
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, true, true);
        if (z) {
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send, null);
        actionBarMenuSubItem4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        anonymousClass3.addView(actionBarMenuSubItem4, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem4.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda3(this, 3));
        actionBarPopupWindowLayout2.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
        linearLayout.addView(actionBarPopupWindowLayout2, LayoutHelper.createLinear(-1, -2));
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout);
        this.sendPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.animationEnabled = false;
        actionBarPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
        this.sendPopupWindow.setOutsideTouchable(true);
        this.sendPopupWindow.setClippingEnabled(true);
        this.sendPopupWindow.setInputMethodMode(2);
        this.sendPopupWindow.setSoftInputMode(0);
        this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.sendPopupWindow.setFocusable(true);
        int[] iArr = new int[2];
        AnonymousClass25 anonymousClass25 = this.writeButton;
        anonymousClass25.getLocationInWindow(iArr);
        this.sendPopupWindow.showAtLocation(anonymousClass25, 51, AndroidUtilities.dp(8.0f) + ((anonymousClass25.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!this.keyboardVisible || (chatActivity = this.parentFragment) == null || chatActivity.contentView.getMeasuredHeight() <= AndroidUtilities.dp(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f) : anonymousClass25.getMeasuredHeight() + iArr[1]);
        this.sendPopupWindow.dimBehind(0.2f);
        try {
            anonymousClass25.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public final void lambda$new$5(int i) {
        TLRPC.Dialog dialog;
        ShareTopicsAdapter shareTopicsAdapter = this.shareTopicsAdapter;
        boolean z = shareTopicsAdapter.isBotForum;
        FragmentSearchField fragmentSearchField = this.searchView;
        HashMap map = this.selectedDialogTopics;
        TLRPC.TL_forumTopic tL_forumTopic = null;
        LongSparseArray longSparseArray = this.selectedDialogs;
        ShareDialogsAdapter shareDialogsAdapter = this.listAdapter;
        if (z && i == 1) {
            TLRPC.Dialog dialog2 = this.selectedTopicDialog;
            if (dialog2 == null) {
                return;
            }
            longSparseArray.put(dialog2, dialog2.id);
            map.remove(dialog2);
            updateSelectedCount(2);
            if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
                if (((TLRPC.Dialog) shareDialogsAdapter.dialogsMap.get(dialog2.id)) == null) {
                    shareDialogsAdapter.dialogsMap.put(dialog2, dialog2.id);
                    ArrayList arrayList = shareDialogsAdapter.dialogs;
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                shareDialogsAdapter.mObservable.notifyChanged();
                this.updateSearchAdapter = false;
                fragmentSearchField.editText.setText("");
                checkCurrentList(false);
            }
            for (int i2 = 0; i2 < getMainGridView().getChildCount(); i2++) {
                View childAt = getMainGridView().getChildAt(i2);
                if (childAt instanceof ShareDialogCell) {
                    ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                    if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                        shareDialogCell.setTopic(null, false, true);
                        shareDialogCell.setChecked(true, true);
                    }
                }
            }
            collapseTopics();
            return;
        }
        int i3 = i - 1;
        if (z) {
            i3 = i - 2;
        }
        ArrayList arrayList2 = shareTopicsAdapter.topics;
        if (arrayList2 != null && i3 >= 0 && i3 < arrayList2.size()) {
            tL_forumTopic = (TLRPC.TL_forumTopic) shareTopicsAdapter.topics.get(i3);
        }
        if (tL_forumTopic == null || (dialog = this.selectedTopicDialog) == null) {
            return;
        }
        long j = dialog.id;
        boolean zIsMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(j);
        TLRPC.Dialog dialog3 = this.selectedTopicDialog;
        longSparseArray.put(dialog3, j);
        map.put(dialog3, tL_forumTopic);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) shareDialogsAdapter.dialogsMap.get(dialog3.id)) == null) {
                shareDialogsAdapter.dialogsMap.put(dialog3, dialog3.id);
                ArrayList arrayList3 = shareDialogsAdapter.dialogs;
                arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, dialog3);
            }
            shareDialogsAdapter.mObservable.notifyChanged();
            this.updateSearchAdapter = false;
            fragmentSearchField.editText.setText("");
            checkCurrentList(false);
        }
        for (int i4 = 0; i4 < getMainGridView().getChildCount(); i4++) {
            View childAt2 = getMainGridView().getChildAt(i4);
            if (childAt2 instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell2 = (ShareDialogCell) childAt2;
                if (shareDialogCell2.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell2.setTopic(tL_forumTopic, zIsMonoForum, true);
                    shareDialogCell2.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    public final void lambda$selectDialog$21(AtomicReference atomicReference, AnonymousClass27 anonymousClass27, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        anonymousClass27.didReceivedNotification(NotificationCenter.topicsDidLoaded, this.currentAccount, Long.valueOf(-dialog.id));
    }

    public final void lambda$sendInternal$30(CharSequence[] charSequenceArr, ArrayList arrayList, boolean z, int i, HashMap map) {
        int i2;
        boolean z2;
        char c;
        MessageObject messageObject;
        long j;
        SendMessagesHelper.SendMessageParams sendMessageParamsOf;
        TLRPC.TL_forumTopic tL_forumTopic;
        MessageObject messageObject2;
        HashMap map2 = map;
        HashMap map3 = this.selectedDialogTopics;
        Long l = 0L;
        AnonymousClass22 anonymousClass22 = this.commentTextView;
        AnonymousClass21 anonymousClass21 = this.frameLayout2;
        LongSparseArray longSparseArray = this.selectedDialogs;
        ArrayList arrayList2 = this.sendingMessageObjects;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            boolean z3 = false;
            while (true) {
                if (i3 >= longSparseArray.size()) {
                    tL_forumTopic = null;
                    break;
                }
                long jKeyAt = longSparseArray.keyAt(i3);
                boolean zIsMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt);
                Long l2 = map2 == null ? l : (Long) map2.get(Long.valueOf(jKeyAt));
                if (l2 != null && l2.longValue() > 0) {
                    z3 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) map3.get(longSparseArray.get(jKeyAt));
                long peerDialogId = (tL_forumTopic2 == null || !zIsMonoForum) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                MessageObject messageObject3 = (tL_forumTopic2 == null || zIsMonoForum) ? null : new MessageObject(this.currentAccount, tL_forumTopic2.topicStartMessage, false, false);
                if (messageObject3 != null) {
                    messageObject3.isTopicMainMessage = true;
                }
                if (anonymousClass21.getTag() == null || anonymousClass22.editText.length() <= 0) {
                    messageObject2 = messageObject3;
                } else {
                    CharSequence charSequence = charSequenceArr[0];
                    MessageObject messageObject4 = messageObject3;
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), jKeyAt, messageObject4, messageObject3, null, true, arrayList, null, null, z, 0, 0, null, false);
                    messageObject2 = messageObject4;
                    sendMessageParamsOf2.payStars = l2 == null ? 0L : l2.longValue();
                    sendMessageParamsOf2.monoForumPeer = peerDialogId;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf2);
                }
                int iSendMessage = SendMessagesHelper.getInstance(this.currentAccount).sendMessage(this.sendingMessageObjects, jKeyAt, !this.showSendersName, false, z, 0, 0, messageObject2, i, l2 == null ? 0L : l2.longValue(), peerDialogId, null);
                if (iSendMessage != 0) {
                    arrayList3.add(Long.valueOf(jKeyAt));
                }
                if (longSparseArray.size() == 1) {
                    tL_forumTopic = null;
                    AlertsCreator.showSendMediaAlert(iSendMessage, this.parentFragment, null);
                    if (iSendMessage != 0) {
                        break;
                    }
                }
                i3++;
                l = l;
                anonymousClass21 = anonymousClass21;
            }
            int size = arrayList3.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList3.get(i4);
                i4++;
                long jLongValue = ((Long) obj).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) longSparseArray.get(jLongValue);
                longSparseArray.remove(jLongValue);
                if (dialog != null) {
                    map3.remove(dialog);
                }
            }
            if (!longSparseArray.isEmpty()) {
                onSend(longSparseArray, arrayList2.size(), longSparseArray.size() == 1 ? (TLRPC.TL_forumTopic) map3.get(longSparseArray.valueAt(0)) : tL_forumTopic, !z3);
            }
        } else {
            AnonymousClass6 anonymousClass6 = this.switchView;
            int i5 = anonymousClass6 != null ? anonymousClass6.currentTab : 0;
            TL_stories.StoryItem storyItem = this.storyItem;
            String[] strArr = this.sendingText;
            if (storyItem != null) {
                boolean z4 = false;
                for (int i6 = 0; i6 < longSparseArray.size(); i6++) {
                    long jKeyAt2 = longSparseArray.keyAt(i6);
                    boolean zIsMonoForum2 = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt2);
                    Long l3 = map2 == null ? l : (Long) map2.get(Long.valueOf(jKeyAt2));
                    if (l3 != null && l3.longValue() > 0) {
                        z4 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) map3.get(longSparseArray.get(jKeyAt2));
                    long peerDialogId2 = (tL_forumTopic3 == null || !zIsMonoForum2) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    MessageObject messageObject5 = (tL_forumTopic3 == null || zIsMonoForum2) ? null : new MessageObject(this.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    if (this.storyItem != null) {
                        if (anonymousClass21.getTag() != null && anonymousClass22.editText.length() > 0 && charSequenceArr[0] != null) {
                            MessageObject messageObject6 = messageObject5;
                            messageObject5 = messageObject6;
                            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), jKeyAt2, null, messageObject6, null, true, null, null, null, z, 0, 0, null, false));
                        }
                        sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(null, jKeyAt2, messageObject5, messageObject5, null, true, null, null, null, z, 0, 0, null, false);
                        sendMessageParamsOf.sendingStory = this.storyItem;
                    } else if (anonymousClass21.getTag() == null || anonymousClass22.editText.length() <= 0) {
                        sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(strArr[i5], jKeyAt2, messageObject5, messageObject5, null, true, null, null, null, z, 0, 0, null, false);
                    } else {
                        CharSequence charSequence2 = charSequenceArr[0];
                        sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(charSequence2 == null ? null : charSequence2.toString(), jKeyAt2, messageObject5, messageObject5, null, true, arrayList, null, null, z, 0, 0, null, false);
                    }
                    sendMessageParamsOf.payStars = l3 == null ? 0L : l3.longValue();
                    sendMessageParamsOf.monoForumPeer = peerDialogId2;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
                }
                z2 = z4;
            } else {
                if (strArr[i5] != null) {
                    int i7 = 0;
                    boolean z5 = false;
                    while (i7 < longSparseArray.size()) {
                        long jKeyAt3 = longSparseArray.keyAt(i7);
                        boolean zIsMonoForum3 = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt3);
                        Long l4 = map2 == null ? l : (Long) map2.get(Long.valueOf(jKeyAt3));
                        if (l4 != null && l4.longValue() > 0) {
                            z5 = true;
                        }
                        TLRPC.TL_forumTopic tL_forumTopic4 = (TLRPC.TL_forumTopic) map3.get(longSparseArray.get(jKeyAt3));
                        long peerDialogId3 = (tL_forumTopic4 == null || !zIsMonoForum3) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic4.from_id);
                        if (tL_forumTopic4 == null || zIsMonoForum3) {
                            c = 0;
                            messageObject = null;
                        } else {
                            c = 0;
                            messageObject = new MessageObject(this.currentAccount, tL_forumTopic4.topicStartMessage, false, false);
                        }
                        if (anonymousClass21.getTag() == null || anonymousClass22.editText.length() <= 0) {
                            j = jKeyAt3;
                        } else {
                            CharSequence charSequence3 = charSequenceArr[c];
                            SendMessagesHelper.SendMessageParams sendMessageParamsOf3 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), jKeyAt3, messageObject, messageObject, null, true, arrayList, null, null, z, 0, 0, null, false);
                            j = jKeyAt3;
                            sendMessageParamsOf3.payStars = l4 == null ? 0L : l4.longValue();
                            sendMessageParamsOf3.monoForumPeer = peerDialogId3;
                            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf3);
                        }
                        SendMessagesHelper.SendMessageParams sendMessageParamsOf4 = SendMessagesHelper.SendMessageParams.of(strArr[i5], j, messageObject, messageObject, null, true, null, null, null, z, 0, 0, null, false);
                        sendMessageParamsOf4.payStars = l4 == null ? 0L : l4.longValue();
                        sendMessageParamsOf4.monoForumPeer = peerDialogId3;
                        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf4);
                        i7++;
                        map2 = map;
                    }
                    z2 = z5;
                } else {
                    i2 = 0;
                    z2 = false;
                }
                onSend(longSparseArray, 1, (TLRPC.TL_forumTopic) map3.get(longSparseArray.valueAt(i2)), !z2);
            }
            i2 = 0;
            onSend(longSparseArray, 1, (TLRPC.TL_forumTopic) map3.get(longSparseArray.valueAt(i2)), !z2);
        }
        ShareAlertDelegate shareAlertDelegate = this.delegate;
        if (shareAlertDelegate != null) {
            shareAlertDelegate.didShare();
        }
        lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void lambda$openCrafting$8() {
        if (this.selectedTopicDialog != null) {
            collapseTopics();
            return;
        }
        AnonymousClass22 anonymousClass22 = this.commentTextView;
        if (anonymousClass22 == null || !anonymousClass22.emojiViewVisible) {
            super.lambda$openCrafting$8();
        } else {
            anonymousClass22.hidePopup(true);
        }
    }

    public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    public void onShareStory(View view) {
    }

    public final void runShadowAnimation$1$1(boolean z) {
        View[] viewArr = this.shadow;
        int i = 0;
        if ((!z || viewArr[0].getTag() == null) && (z || viewArr[0].getTag() != null)) {
            return;
        }
        viewArr[0].setTag(z ? null : 1);
        if (z) {
            viewArr[0].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.shadowAnimation;
        AnimatorSet animatorSet = animatorSetArr[0];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[0] = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(viewArr[0], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        animatorSetArr[0].setDuration(150L);
        animatorSetArr[0].addListener(new AnonymousClass30(this, z, i));
        animatorSetArr[0].start();
    }

    public final void selectDialog(View view, TLRPC.Dialog dialog) {
        boolean z;
        Activity activity;
        ArrayList<TLRPC.TL_forumTopic> topics;
        ShareSearchAdapter.AnonymousClass5 anonymousClass5;
        int i;
        if (dialog instanceof ShareDialogsAdapter.MyStoryDialog) {
            onShareStory(view);
            return;
        }
        boolean z2 = view instanceof ShareDialogCell;
        if ((z2 && ((ShareDialogCell) view).premiumBlocked) || (((z = view instanceof ProfileSearchCell)) && ((ProfileSearchCell) view).premiumBlocked)) {
            showPremiumBlockedToast$1(dialog.id, view);
            return;
        }
        RecyclerListView recyclerListView = this.topicsGridView;
        if (recyclerListView.getVisibility() != 8 || (activity = this.parentActivity) == null) {
            return;
        }
        boolean zIsChatDialog = DialogObject.isChatDialog(dialog.id);
        int i2 = this.hasPoll;
        if (zIsChatDialog) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || i2 == 2 || i2 == 3)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity, 0, null);
                String string = LocaleController.getString(R.string.SendMessageTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                if (i2 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedTodoAll);
                    } else {
                        alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedTodo);
                    }
                } else if (i2 != 2) {
                    alertDialog.message = LocaleController.getString(R.string.ChannelCantSendMessage);
                } else if (this.isChannel) {
                    alertDialog.message = LocaleController.getString(R.string.PublicPollCantForward);
                } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                    alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedPollsAll);
                } else {
                    alertDialog.message = LocaleController.getString(R.string.ErrorSendRestrictedPolls);
                }
                ArticleViewer.IBlock.CC.m(R.string.OK, builder, (AlertDialog.OnButtonClickListener) null);
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && i2 != 0) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(activity, 0, null);
            String string2 = LocaleController.getString(R.string.SendMessageTitle);
            AlertDialog alertDialog2 = builder2.alertDialog;
            alertDialog2.title = string2;
            if (i2 == 3) {
                alertDialog2.message = LocaleController.getString(R.string.TodoCantForwardSecretChat);
            } else if (i2 != 0) {
                alertDialog2.message = LocaleController.getString(R.string.PollCantForwardSecretChat);
            } else {
                alertDialog2.message = LocaleController.getString(R.string.InvoiceCantForwardSecretChat);
            }
            ArticleViewer.IBlock.CC.m(R.string.OK, builder2, (AlertDialog.OnButtonClickListener) null);
            return;
        }
        long j = dialog.id;
        LongSparseArray longSparseArray = this.selectedDialogs;
        if (longSparseArray.indexOfKey(j) >= 0) {
            longSparseArray.remove(dialog.id);
            this.selectedDialogTopics.remove(dialog);
            if (z) {
                i = 1;
                ((ProfileSearchCell) view).setChecked(false, true);
            } else {
                i = 1;
                if (z2) {
                    ((ShareDialogCell) view).setChecked(false, true);
                }
            }
            updateSelectedCount(i);
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if ((UserObject.isBotForum(user) && !(((topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id)) == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id))) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.selectedTopicDialog = dialog;
                GridLayoutManager gridLayoutManager = this.topicsLayoutManager;
                gridLayoutManager.scrollToPositionWithOffset(0, this.scrollOffsetY - recyclerListView.getPaddingTop(), gridLayoutManager.mShouldReverseLayout);
                AtomicReference atomicReference = new AtomicReference();
                AnonymousClass27 anonymousClass27 = new AnonymousClass27(dialog, atomicReference, view);
                atomicReference.set(new ChatUsersActivity$$ExternalSyntheticLambda13(this, atomicReference, anonymousClass27, dialog, 22));
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i3 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(anonymousClass27, i3);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    anonymousClass27.didReceivedNotification(i3, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            longSparseArray.put(dialog, dialog.id);
            if (z) {
                ((ProfileSearchCell) view).setChecked(true, true);
            } else if (z2) {
                ((ShareDialogCell) view).setChecked(true, true);
            }
            updateSelectedCount(2);
            long j2 = UserConfig.getInstance(this.currentAccount).clientUserId;
            if (this.searchIsVisible) {
                ShareDialogsAdapter shareDialogsAdapter = this.listAdapter;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) shareDialogsAdapter.dialogsMap.get(dialog.id);
                ArrayList arrayList = shareDialogsAdapter.dialogs;
                if (dialog2 == null) {
                    shareDialogsAdapter.dialogsMap.put(dialog, dialog.id);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog);
                } else if (dialog2.id != j2) {
                    arrayList.remove(dialog2);
                    arrayList.add(!arrayList.isEmpty() ? 1 : 0, dialog2);
                }
                shareDialogsAdapter.mObservable.notifyChanged();
                this.updateSearchAdapter = false;
                FragmentSearchField fragmentSearchField = this.searchView;
                fragmentSearchField.editText.setText("");
                checkCurrentList(false);
                AndroidUtilities.hideKeyboard(fragmentSearchField.editText);
            }
        }
        ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
        if (shareSearchAdapter == null || (anonymousClass5 = shareSearchAdapter.categoryAdapter) == null) {
            return;
        }
        anonymousClass5.mObservable.notifyItemRangeChanged(0, MediaDataController.getInstance(anonymousClass5.currentAccount).hints.size(), null);
    }

    public final void sendInternal(final boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.selectedDialogs;
            int size = longSparseArray.size();
            AnonymousClass21 anonymousClass21 = this.frameLayout2;
            AnonymousClass22 anonymousClass22 = this.commentTextView;
            if (i2 >= size) {
                int i3 = 0;
                final CharSequence[] charSequenceArr = {anonymousClass22.getText()};
                final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                CheckBox2 checkBox2 = this.timestampCheckbox;
                int i4 = (checkBox2 == null || !checkBox2.checkBoxBase.isChecked) ? -1 : this.timestamp;
                ArrayList arrayList = new ArrayList();
                EditTextEmoji.AnonymousClass2 anonymousClass2 = anonymousClass22.editText;
                if (this.sendingMessageObjects != null) {
                    i = 0;
                    while (i3 < longSparseArray.size()) {
                        long jKeyAt = longSparseArray.keyAt(i3);
                        long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt);
                        if (sendPaidMessagesStars <= 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt));
                        }
                        if (anonymousClass21.getTag() != null && anonymousClass2.length() > 0 && sendPaidMessagesStars > 0) {
                            i++;
                        }
                        if (sendPaidMessagesStars > 0) {
                            i++;
                        }
                        if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(jKeyAt))) {
                            arrayList.add(Long.valueOf(jKeyAt));
                        }
                        i3++;
                    }
                } else {
                    AnonymousClass6 anonymousClass6 = this.switchView;
                    int i5 = anonymousClass6 != null ? anonymousClass6.currentTab : 0;
                    if (this.storyItem != null) {
                        int i6 = 0;
                        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
                            long jKeyAt2 = longSparseArray.keyAt(i7);
                            long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt2);
                            if (sendPaidMessagesStars2 <= 0) {
                                sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt2));
                            }
                            if (this.storyItem != null && anonymousClass21.getTag() != null && anonymousClass2.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                                i6++;
                            }
                            if (sendPaidMessagesStars2 > 0) {
                                i6++;
                            }
                            if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(jKeyAt2))) {
                                arrayList.add(Long.valueOf(jKeyAt2));
                            }
                        }
                        i = i6;
                    } else if (this.sendingText[i5] != null) {
                        int i8 = 0;
                        while (i3 < longSparseArray.size()) {
                            long jKeyAt3 = longSparseArray.keyAt(i3);
                            long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt3);
                            if (sendPaidMessagesStars3 <= 0) {
                                sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt3));
                            }
                            if (anonymousClass21.getTag() != null && anonymousClass2.length() > 0 && sendPaidMessagesStars3 > 0) {
                                i8++;
                            }
                            if (sendPaidMessagesStars3 > 0) {
                                i8++;
                            }
                            if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(jKeyAt3))) {
                                arrayList.add(Long.valueOf(jKeyAt3));
                            }
                            i3++;
                        }
                        i = i8;
                    } else {
                        i = 0;
                    }
                }
                final int i9 = i4;
                AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList, i, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        CharSequence[] charSequenceArr2 = charSequenceArr;
                        ArrayList arrayList2 = entities;
                        boolean z2 = z;
                        this.f$0.lambda$sendInternal$30(charSequenceArr2, arrayList2, z2, i9, (HashMap) obj);
                    }
                });
                return;
            }
            if (AlertsCreator.checkSlowMode(getContext(), this.currentAccount, longSparseArray.keyAt(i2), anonymousClass21.getTag() != null && anonymousClass22.editText.length() > 0)) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void showCommentTextView(boolean z) {
        AnonymousClass21 anonymousClass21 = this.frameLayout2;
        int i = 1;
        if (z == (anonymousClass21.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        anonymousClass21.setTag(z ? 1 : null);
        AnonymousClass22 anonymousClass22 = this.commentTextView;
        if (anonymousClass22.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(anonymousClass22.getEditText());
        }
        anonymousClass22.hidePopup(true);
        FrameLayout frameLayout = this.timestampFrameLayout;
        FrameLayout frameLayout2 = this.pickerBottom;
        ChatActivity.AnonymousClass60 anonymousClass60 = this.writeButtonContainer;
        if (z) {
            anonymousClass21.setVisibility(0);
            if (frameLayout != null && frameLayout2 == null) {
                frameLayout.setVisibility(0);
            }
            anonymousClass60.setVisibility(0);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        if (frameLayout2 != null) {
            int i2 = z ? 4 : 1;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            frameLayout2.setImportantForAccessibility(i2);
        }
        LinearLayout linearLayout = this.sharesCountLayout;
        if (linearLayout != null) {
            int i3 = z ? 4 : 1;
            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
            linearLayout.setImportantForAccessibility(i3);
        }
        this.animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float fDp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass21, (Property<AnonymousClass21, Float>) property, z ? 1.0f : 0.0f));
        if (frameLayout != null && frameLayout2 == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) View.SCALE_X, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) View.SCALE_Y, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(anonymousClass60, (Property<ChatActivity.AnonymousClass60, Float>) property, z ? 1.0f : 0.0f));
        if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.shadow[1], (Property<View, Float>) property, z ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout3 = this.pickerBottomLayout;
        if (frameLayout3 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.darkTheme && z) {
                fDp = AndroidUtilities.dp(this.timestampLayout != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) property2, fDp));
        }
        this.animatorSet.playTogether(arrayList);
        this.animatorSet.setInterpolator(new DecelerateInterpolator());
        this.animatorSet.setDuration(180L);
        this.animatorSet.addListener(new AnonymousClass30(this, z, i));
        this.animatorSet.start();
    }

    public final void showPremiumBlockedToast$1(long j, View view) {
        int i = 1;
        int i2 = -this.shiftDp;
        this.shiftDp = i2;
        AndroidUtilities.shakeViewSpring(view, i2);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) : "";
        boolean zPremiumFeaturesBlocked = MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked();
        FrameLayout frameLayout = this.bulletinContainer;
        (zPremiumFeaturesBlocked ? new BulletinFactory(frameLayout, this.resourcesProvider).createSimpleBulletinWithIconSize(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : new BulletinFactory(frameLayout, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), new ShareAlert$$ExternalSyntheticLambda14(this, i), LocaleController.getString(R.string.UserBlockedNonPremiumButton))).show();
    }

    public final void updateBottomOverlay$1() {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        AnonymousClass21 anonymousClass21 = this.frameLayout2;
        if (anonymousClass21 == null) {
            return;
        }
        AnonymousClass22 anonymousClass22 = this.commentTextView;
        if (anonymousClass22 == null || !anonymousClass22.isPopupVisible()) {
            AnonymousClass5 anonymousClass5 = this.sizeNotifierFrameLayout;
            if (anonymousClass5 != null && (adjustPanLayoutHelper = anonymousClass5.adjustPanLayoutHelper) != null && !adjustPanLayoutHelper.animationInProgress) {
                AndroidUtilities.dp(20.0f);
            }
        } else {
            anonymousClass22.getEmojiPaddingShown();
        }
        FrameLayout frameLayout = this.timestampFrameLayout;
        float fDp = 0.0f;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-0.0f);
            fDp = 0.0f + AndroidUtilities.dp(48.0f);
        }
        FrameLayout frameLayout2 = this.pickerBottom;
        if (frameLayout2 != null) {
            float f = -fDp;
            frameLayout2.setTranslationY(f);
            LinearLayout linearLayout = this.sharesCountLayout;
            if (linearLayout != null) {
                linearLayout.setTranslationY(f);
            }
        }
        float f2 = -fDp;
        anonymousClass21.setTranslationY(f2);
        this.writeButtonContainer.setTranslationY(f2);
    }

    public final void updateLinkTextView() {
        SimpleTextView simpleTextView = this.linkTextView;
        if (simpleTextView != null) {
            String link = getLink();
            if (link.startsWith("https://")) {
                link = link.substring(8);
            } else if (link.startsWith("http://")) {
                link = link.substring(7);
            }
            simpleTextView.setText(link, false);
        }
    }

    public final void updateSelectedCount(int i) {
        LongSparseArray longSparseArray = this.selectedDialogs;
        if (longSparseArray.size() == 0) {
            showCommentTextView(false);
            return;
        }
        ArrayList arrayList = this.sendingMessageObjects;
        int size = arrayList == null ? 1 : arrayList.size();
        Object tag = this.frameLayout2.getTag();
        AnonymousClass22 anonymousClass22 = this.commentTextView;
        if (tag != null && anonymousClass22.editText.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
            long j2 = ((TLRPC.Dialog) longSparseArray.valueAt(i2)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j2);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j2));
            }
            j += sendPaidMessagesStars;
        }
        int iMax = Math.max(1, longSparseArray.size());
        boolean z = i != 0;
        AnonymousClass25 anonymousClass25 = this.writeButton;
        anonymousClass25.setCount(iMax, z);
        anonymousClass25.setStarsPrice(size, j, i != 0);
        showCommentTextView(true);
        int iDp = AndroidUtilities.dp(84.0f);
        anonymousClass25.getMeasuredHeight();
        anonymousClass22.setPadding(0, 0, Math.max(iDp, anonymousClass25.width$1()), 0);
    }

    public ShareAlert(Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, Integer num, Theme.ResourcesProvider resourcesProvider) {
        int i;
        float f;
        float f2;
        AnonymousClass12 anonymousClass12;
        AnonymousClass12 anonymousClass13;
        LinearLayout linearLayoutM;
        int i2;
        super(context, resourcesProvider, true, false);
        int i3 = 25;
        String[] strArr = new String[2];
        this.sendingText = strArr;
        this.shadow = new View[2];
        this.shadowAnimation = new AnimatorSet[2];
        this.selectedDialogs = new LongSparseArray();
        this.selectedDialogTopics = new HashMap();
        this.containerViewTop = -1;
        this.fullyShown = false;
        new RectF();
        new Paint(1);
        this.textPaint = new TextPaint(1);
        String[] strArr2 = new String[2];
        this.linkToCopy = strArr2;
        this.recentSearchObjects = new ArrayList();
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                i = 80;
                break;
            }
            i = (1 << i4) - 12;
            if (80 <= i) {
                break;
            } else {
                i4++;
            }
        }
        int i5 = i / 8;
        long[] jArr = new long[i5];
        Object[] objArr = new Object[i5];
        this.systemInsets = Insets.NONE;
        this.shiftDp = 4;
        this.showSendersName = true;
        this.lastOffset = Integer.MAX_VALUE;
        ArrayList arrayList2 = new ArrayList();
        this.iBlur3Positions = arrayList2;
        RectF rectF = new RectF();
        this.iBlur3PositionMainTabs = rectF;
        arrayList2.add(rectF);
        AndroidUtilities.enableEdgeToEdge(getWindow());
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        int i6 = Theme.key_windowBackgroundWhite;
        int themedColor = getThemedColor(i6);
        Paint paint = blurredBackgroundSourceColor.paint;
        paint.setColor(themedColor);
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new ChatActivity.AnonymousClass1(this, i3));
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new PhotoViewer.AnonymousClass49(this, 1));
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        this.iBlur3FactoryFade = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        this.resourcesProvider = resourcesProvider;
        this.includeStory = z3;
        this.parentActivity = AndroidUtilities.findActivity(context);
        this.darkTheme = z2;
        if (z2) {
            this.resourcesProvider = new AnonymousClass3(0);
        }
        paint.setColor(getThemedColor(i6));
        this.parentFragment = chatActivity;
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int i7 = Theme.key_dialogBackground;
        this.behindKeyboardColorKey = i7;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i7), PorterDuff.Mode.MULTIPLY));
        this.occupyNavigationBarWithoutKeyboard = true;
        this.isFullscreen = false;
        strArr2[0] = str3;
        strArr2[1] = str4;
        if (str3 == null && str4 == null && arrayList != null && arrayList.size() > 0) {
            MessageObject messageObject = (MessageObject) arrayList.get(0);
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(messageObject.getDialogId()));
            if (!TextUtils.isEmpty(publicUsername)) {
                StringBuilder sb = new StringBuilder("https://");
                SurfaceContainer$$ExternalSyntheticOutline0.m(sb, MessagesController.getInstance(this.currentAccount).linkPrefix, "/", publicUsername, "/");
                sb.append(messageObject.getId());
                strArr2[0] = sb.toString();
                if (arrayList.size() == 1 && messageObject.hasValidGroupId()) {
                    strArr2[0] = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), strArr2[0], "?single");
                }
            }
        }
        this.sendingMessageObjects = arrayList;
        this.searchAdapter = new ShareSearchAdapter(context);
        this.isChannel = z;
        strArr[0] = str;
        strArr[1] = str2;
        this.useSmoothKeyboard = true;
        setDelegate(new ArticleViewer.AnonymousClass11(this, 1));
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                MessageObject messageObject2 = (MessageObject) this.sendingMessageObjects.get(i8);
                if (messageObject2.isTodo()) {
                    this.hasPoll = 3;
                } else if (messageObject2.isPoll()) {
                    int i9 = messageObject2.isPublicPoll() ? 2 : 1;
                    this.hasPoll = i9;
                    if (i9 == 2) {
                        break;
                    }
                }
            }
        }
        if (z) {
            this.loadingLink = true;
            TLRPC.TL_channels_exportMessageLink tL_channels_exportMessageLink = new TLRPC.TL_channels_exportMessageLink();
            tL_channels_exportMessageLink.id = ((MessageObject) arrayList.get(0)).getId();
            tL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(((MessageObject) arrayList.get(0)).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_exportMessageLink, new LinkManager$$ExternalSyntheticLambda8(7, this, context));
        }
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
        this.sizeNotifierFrameLayout = anonymousClass5;
        this.containerView = anonymousClass5;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = this.iBlur3FactoryLiquidGlass;
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup = this.containerView;
        blurredBackgroundDrawableViewFactory3.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory3.parent = viewGroup;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory4 = this.iBlur3FactoryFrostedLiquidGlass;
        ViewPositionWatcher viewPositionWatcher2 = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup2 = this.containerView;
        blurredBackgroundDrawableViewFactory4.viewPositionWatcher = viewPositionWatcher2;
        blurredBackgroundDrawableViewFactory4.parent = viewGroup2;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory5 = this.iBlur3FactoryFade;
        ViewPositionWatcher viewPositionWatcher3 = new ViewPositionWatcher(this.containerView);
        ViewGroup viewGroup3 = this.containerView;
        blurredBackgroundDrawableViewFactory5.viewPositionWatcher = viewPositionWatcher3;
        blurredBackgroundDrawableViewFactory5.parent = viewGroup3;
        viewGroup3.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup4 = this.containerView;
        int i10 = this.backgroundPaddingLeft;
        viewGroup4.setPadding(i10, 0, i10, this.systemInsets.bottom);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        int i11 = Theme.key_dialogBackground;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        if (this.darkTheme && this.linkToCopy[1] != null) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(context);
            this.switchView = anonymousClass6;
            frameLayout.addView(anonymousClass6, LayoutHelper.createFrame(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, this.resourcesProvider);
        this.searchView = fragmentSearchField;
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                ShareAlert shareAlert = ShareAlert.this;
                if (!TextUtils.isEmpty(shareAlert.searchView.editText.getText())) {
                    shareAlert.checkCurrentList(false);
                }
                if (shareAlert.updateSearchAdapter) {
                    String string = shareAlert.searchView.editText.getText().toString();
                    int length = string.length();
                    StickerEmptyView stickerEmptyView = shareAlert.searchEmptyView;
                    if (length == 0) {
                        RecyclerView.Adapter adapter = shareAlert.gridView.getAdapter();
                        ShareDialogsAdapter shareDialogsAdapter = shareAlert.listAdapter;
                        if (adapter != shareDialogsAdapter) {
                            int iAccess$8200 = ShareAlert.access$8200(shareAlert);
                            stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                            stickerEmptyView.showProgress(false, true);
                            shareAlert.checkCurrentList(false);
                            shareDialogsAdapter.mObservable.notifyChanged();
                            if (iAccess$8200 > 0) {
                                GridLayoutManager gridLayoutManager = shareAlert.layoutManager;
                                gridLayoutManager.scrollToPositionWithOffset(0, -iAccess$8200, gridLayoutManager.mShouldReverseLayout);
                            }
                        }
                    } else if (stickerEmptyView != null) {
                        stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
                    }
                    ShareSearchAdapter shareSearchAdapter = shareAlert.searchAdapter;
                    if (shareSearchAdapter != null) {
                        shareSearchAdapter.searchDialogs(string);
                    }
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }
        };
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = fragmentSearchField.editText;
        anonymousClass4.addTextChangedListener(textWatcher);
        anonymousClass4.setHint(LocaleController.getString(R.string.ShareSendTo));
        anonymousClass4.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 11));
        fragmentSearchField.setCloseButtonOnClickListener(new ShareAlert$$ExternalSyntheticLambda14(this, 0));
        frameLayout.addView(fragmentSearchField, LayoutHelper.createFrame(-1, 40.0f, 83, 11.0f, 7.0f, 11.0f, 11.0f));
        ActionBar actionBar = new ActionBar(context, null);
        this.topicsBackActionBar = actionBar;
        actionBar.setOccupyStatusBar(false);
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i12 = Theme.key_dialogTextBlack;
        actionBar.setTitleColor(getThemedColor(i12));
        actionBar.setSubtitleColor(getThemedColor(Theme.key_dialogTextGray2));
        actionBar.setItemsColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), false);
        actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
        actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 6));
        actionBar.setVisibility(8);
        frameLayout.addView(actionBar, LayoutHelper.createFrame(-1, 58, 83));
        RecyclerListView recyclerListView = new RecyclerListView(context, this.resourcesProvider);
        this.topicsGridView = recyclerListView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        this.topicsLayoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        final int i13 = 0;
        gridLayoutManager.mSpanSizeLookup = new BaseMenuWrapper(this) {
            public final ShareAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final int getSpanSize(int i14) {
                switch (i13) {
                    case 0:
                        if (i14 == 0) {
                            return this.this$0.topicsLayoutManager.mSpanCount;
                        }
                        return 1;
                    case 1:
                        if (i14 == 0) {
                            return this.this$0.layoutManager.mSpanCount;
                        }
                        return 1;
                    default:
                        ShareSearchAdapter shareSearchAdapter = this.this$0.searchAdapter;
                        return (i14 == shareSearchAdapter.hintsCell || i14 == shareSearchAdapter.resentTitleCell || i14 == shareSearchAdapter.firstEmptyViewCell || i14 == shareSearchAdapter.lastFilledItem || shareSearchAdapter.getItemViewType(i14) == 0) ? 4 : 1;
                }
            }
        };
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener(this) {
            public final ShareAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i14, int i15) {
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                Bulletin.Layout layout;
                Bulletin bulletin;
                switch (i13) {
                    case 0:
                        if (i15 != 0) {
                            ShareAlert shareAlert = this.this$0;
                            ShareAlert.access$6000(shareAlert);
                            shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                        }
                        break;
                    case 1:
                        ShareAlert shareAlert2 = this.this$0;
                        if (i15 != 0) {
                            ShareAlert.access$6000(shareAlert2);
                            shareAlert2.previousScrollOffsetY = shareAlert2.scrollOffsetY;
                        }
                        Bulletin bulletin2 = Bulletin.visibleBulletin;
                        if (bulletin2 != null && (layout = bulletin2.layout) != null && (layout.getParent() instanceof View) && ((View) Bulletin.visibleBulletin.layout.getParent()).getParent() == shareAlert2.bulletinContainer2 && (bulletin = Bulletin.visibleBulletin) != null) {
                            bulletin.hide();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = shareAlert2.scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor.onScrolled(i14, i15);
                            ShareAlert.access$7200(shareAlert2);
                            break;
                        }
                        break;
                    default:
                        if (i15 != 0) {
                            ShareAlert shareAlert3 = this.this$0;
                            ShareAlert.access$6000(shareAlert3);
                            shareAlert3.previousScrollOffsetY = shareAlert3.scrollOffsetY;
                        }
                        break;
                }
            }
        });
        ShareTopicsAdapter shareTopicsAdapter = new ShareTopicsAdapter(context);
        this.shareTopicsAdapter = shareTopicsAdapter;
        recyclerListView.setAdapter(shareTopicsAdapter);
        int i14 = Theme.key_dialogScrollGlow;
        recyclerListView.setGlowColor(getThemedColor(i14));
        recyclerListView.setVerticalScrollBarEnabled(false);
        recyclerListView.setHorizontalScrollBarEnabled(false);
        recyclerListView.setOverScrollMode(2);
        recyclerListView.setSelectorDrawableColor(0);
        recyclerListView.setItemSelectorColorProvider(new ShareAlert$$ExternalSyntheticLambda15(i13));
        recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        recyclerListView.setClipToPadding(false);
        recyclerListView.addItemDecoration(new FiltersView.AnonymousClass2(3));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ShareAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i15, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                switch (i13) {
                    case 0:
                        this.f$0.lambda$new$5(i15);
                        break;
                    case 1:
                        ShareAlert shareAlert = this.f$0;
                        if (i15 >= 0) {
                            int i16 = i15 - 1;
                            ShareAlert.ShareDialogsAdapter shareDialogsAdapter = shareAlert.listAdapter;
                            if (i16 >= 0) {
                                if (i16 < shareDialogsAdapter.dialogs.size()) {
                                    dialog = (TLRPC.Dialog) shareDialogsAdapter.dialogs.get(i16);
                                }
                                if (dialog == null) {
                                    shareAlert.selectDialog(view, dialog);
                                    break;
                                }
                            } else {
                                shareDialogsAdapter.getClass();
                            }
                            dialog = null;
                            if (dialog == null) {
                                shareAlert.selectDialog(view, dialog);
                                break;
                            }
                        } else {
                            shareAlert.getClass();
                            break;
                        }
                        break;
                    default:
                        ShareAlert shareAlert2 = this.f$0;
                        if (i15 >= 0) {
                            ShareAlert.ShareSearchAdapter shareSearchAdapter = shareAlert2.searchAdapter;
                            int i17 = shareSearchAdapter.recentDialogsStartRow;
                            if (i15 < i17 || i17 < 0) {
                                int i18 = i15 - 1;
                                if (i18 < 0) {
                                    tL_dialog = null;
                                } else if (i18 < shareSearchAdapter.searchResult.size()) {
                                    tL_dialog = ((ShareAlert.DialogSearchResult) shareSearchAdapter.searchResult.get(i18)).dialog;
                                } else {
                                    int size2 = i18 - shareSearchAdapter.searchResult.size();
                                    ArrayList arrayList3 = shareSearchAdapter.searchAdapterHelper.localServerSearch;
                                    if (size2 < arrayList3.size()) {
                                        TLObject tLObject = (TLObject) arrayList3.get(size2);
                                        tL_dialog = new TLRPC.TL_dialog();
                                        if (tLObject instanceof TLRPC.User) {
                                            tL_dialog.id = ((TLRPC.User) tLObject).id;
                                        } else if (tLObject instanceof TLRPC.Chat) {
                                            tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                        } else {
                                            tL_dialog = null;
                                        }
                                    } else {
                                        tL_dialog = null;
                                    }
                                }
                            } else {
                                int i19 = i15 - i17;
                                if (i19 >= 0) {
                                    ShareAlert shareAlert3 = ShareAlert.this;
                                    if (i19 >= shareAlert3.recentSearchObjects.size()) {
                                        tL_dialog = null;
                                    } else {
                                        TLObject tLObject2 = ((DialogsSearchAdapter.RecentSearchObject) shareAlert3.recentSearchObjects.get(i19)).object;
                                        tL_dialog = new TLRPC.TL_dialog();
                                        if (tLObject2 instanceof TLRPC.User) {
                                            tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                        } else if (tLObject2 instanceof TLRPC.Chat) {
                                            tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                        } else {
                                            tL_dialog = null;
                                        }
                                    }
                                } else {
                                    tL_dialog = null;
                                }
                            }
                            if (tL_dialog != null) {
                                shareAlert2.selectDialog(view, tL_dialog);
                                break;
                            }
                        } else {
                            shareAlert2.getClass();
                            break;
                        }
                        break;
                }
            }
        });
        recyclerListView.setVisibility(8);
        this.containerView.addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 51));
        AnonymousClass12 anonymousClass14 = new AnonymousClass12(i13, context, this.resourcesProvider, this);
        this.gridView = anonymousClass14;
        anonymousClass14.setSelectorDrawableColor(0);
        anonymousClass14.setItemSelectorColorProvider(new ShareAlert$$ExternalSyntheticLambda15(i13));
        anonymousClass14.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        anonymousClass14.setClipToPadding(false);
        getContext();
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(4);
        this.layoutManager = gridLayoutManager2;
        anonymousClass14.setLayoutManager(gridLayoutManager2);
        this.iBlur3Capture = new ViewGroupPartRenderer(anonymousClass14, this.containerView, new TopicsFragment$$ExternalSyntheticLambda7(anonymousClass14, 5));
        final int i15 = 1;
        gridLayoutManager2.mSpanSizeLookup = new BaseMenuWrapper(this) {
            public final ShareAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final int getSpanSize(int i16) {
                switch (i15) {
                    case 0:
                        if (i16 == 0) {
                            return this.this$0.topicsLayoutManager.mSpanCount;
                        }
                        return 1;
                    case 1:
                        if (i16 == 0) {
                            return this.this$0.layoutManager.mSpanCount;
                        }
                        return 1;
                    default:
                        ShareSearchAdapter shareSearchAdapter = this.this$0.searchAdapter;
                        return (i16 == shareSearchAdapter.hintsCell || i16 == shareSearchAdapter.resentTitleCell || i16 == shareSearchAdapter.firstEmptyViewCell || i16 == shareSearchAdapter.lastFilledItem || shareSearchAdapter.getItemViewType(i16) == 0) ? 4 : 1;
                }
            }
        };
        anonymousClass14.setHorizontalScrollBarEnabled(false);
        anonymousClass14.setVerticalScrollBarEnabled(false);
        anonymousClass14.setOverScrollMode(2);
        anonymousClass14.addItemDecoration(new FiltersView.AnonymousClass2(4));
        this.containerView.addView(anonymousClass14, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        ShareDialogsAdapter shareDialogsAdapter = new ShareDialogsAdapter(context);
        this.listAdapter = shareDialogsAdapter;
        anonymousClass14.setAdapter(shareDialogsAdapter);
        anonymousClass14.setGlowColor(getThemedColor(i14));
        final int i16 = 1;
        anonymousClass14.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ShareAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i17, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                switch (i16) {
                    case 0:
                        this.f$0.lambda$new$5(i17);
                        break;
                    case 1:
                        ShareAlert shareAlert = this.f$0;
                        if (i17 >= 0) {
                            int i18 = i17 - 1;
                            ShareAlert.ShareDialogsAdapter shareDialogsAdapter2 = shareAlert.listAdapter;
                            if (i18 >= 0) {
                                if (i18 < shareDialogsAdapter2.dialogs.size()) {
                                    dialog = (TLRPC.Dialog) shareDialogsAdapter2.dialogs.get(i18);
                                }
                                if (dialog == null) {
                                    shareAlert.selectDialog(view, dialog);
                                    break;
                                }
                            } else {
                                shareDialogsAdapter2.getClass();
                            }
                            dialog = null;
                            if (dialog == null) {
                                shareAlert.selectDialog(view, dialog);
                                break;
                            }
                        } else {
                            shareAlert.getClass();
                            break;
                        }
                        break;
                    default:
                        ShareAlert shareAlert2 = this.f$0;
                        if (i17 >= 0) {
                            ShareAlert.ShareSearchAdapter shareSearchAdapter = shareAlert2.searchAdapter;
                            int i19 = shareSearchAdapter.recentDialogsStartRow;
                            if (i17 < i19 || i19 < 0) {
                                int i110 = i17 - 1;
                                if (i110 < 0) {
                                    tL_dialog = null;
                                } else if (i110 < shareSearchAdapter.searchResult.size()) {
                                    tL_dialog = ((ShareAlert.DialogSearchResult) shareSearchAdapter.searchResult.get(i110)).dialog;
                                } else {
                                    int size2 = i110 - shareSearchAdapter.searchResult.size();
                                    ArrayList arrayList3 = shareSearchAdapter.searchAdapterHelper.localServerSearch;
                                    if (size2 < arrayList3.size()) {
                                        TLObject tLObject = (TLObject) arrayList3.get(size2);
                                        tL_dialog = new TLRPC.TL_dialog();
                                        if (tLObject instanceof TLRPC.User) {
                                            tL_dialog.id = ((TLRPC.User) tLObject).id;
                                        } else if (tLObject instanceof TLRPC.Chat) {
                                            tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                        } else {
                                            tL_dialog = null;
                                        }
                                    } else {
                                        tL_dialog = null;
                                    }
                                }
                            } else {
                                int i111 = i17 - i19;
                                if (i111 >= 0) {
                                    ShareAlert shareAlert3 = ShareAlert.this;
                                    if (i111 >= shareAlert3.recentSearchObjects.size()) {
                                        tL_dialog = null;
                                    } else {
                                        TLObject tLObject2 = ((DialogsSearchAdapter.RecentSearchObject) shareAlert3.recentSearchObjects.get(i111)).object;
                                        tL_dialog = new TLRPC.TL_dialog();
                                        if (tLObject2 instanceof TLRPC.User) {
                                            tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                        } else if (tLObject2 instanceof TLRPC.Chat) {
                                            tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                        } else {
                                            tL_dialog = null;
                                        }
                                    }
                                } else {
                                    tL_dialog = null;
                                }
                            }
                            if (tL_dialog != null) {
                                shareAlert2.selectDialog(view, tL_dialog);
                                break;
                            }
                        } else {
                            shareAlert2.getClass();
                            break;
                        }
                        break;
                }
            }
        });
        anonymousClass14.setOnScrollListener(new RecyclerView.OnScrollListener(this) {
            public final ShareAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i17, int i18) {
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                Bulletin.Layout layout;
                Bulletin bulletin;
                switch (i16) {
                    case 0:
                        if (i18 != 0) {
                            ShareAlert shareAlert = this.this$0;
                            ShareAlert.access$6000(shareAlert);
                            shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                        }
                        break;
                    case 1:
                        ShareAlert shareAlert2 = this.this$0;
                        if (i18 != 0) {
                            ShareAlert.access$6000(shareAlert2);
                            shareAlert2.previousScrollOffsetY = shareAlert2.scrollOffsetY;
                        }
                        Bulletin bulletin2 = Bulletin.visibleBulletin;
                        if (bulletin2 != null && (layout = bulletin2.layout) != null && (layout.getParent() instanceof View) && ((View) Bulletin.visibleBulletin.layout.getParent()).getParent() == shareAlert2.bulletinContainer2 && (bulletin = Bulletin.visibleBulletin) != null) {
                            bulletin.hide();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = shareAlert2.scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor.onScrolled(i17, i18);
                            ShareAlert.access$7200(shareAlert2);
                            break;
                        }
                        break;
                    default:
                        if (i18 != 0) {
                            ShareAlert shareAlert3 = this.this$0;
                            ShareAlert.access$6000(shareAlert3);
                            shareAlert3.previousScrollOffsetY = shareAlert3.scrollOffsetY;
                        }
                        break;
                }
            }
        });
        AnonymousClass12 anonymousClass15 = new AnonymousClass12(i16, context, this.resourcesProvider, this);
        this.searchGridView = anonymousClass15;
        anonymousClass15.setItemSelectorColorProvider(new ShareAlert$$ExternalSyntheticLambda15(0));
        anonymousClass15.setSelectorDrawableColor(0);
        anonymousClass15.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        anonymousClass15.setClipToPadding(false);
        getContext();
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(4, 0, anonymousClass15);
        this.searchLayoutManager = fillLastGridLayoutManager;
        anonymousClass15.setLayoutManager(fillLastGridLayoutManager);
        final int i17 = 2;
        fillLastGridLayoutManager.mSpanSizeLookup = new BaseMenuWrapper(this) {
            public final ShareAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final int getSpanSize(int i18) {
                switch (i17) {
                    case 0:
                        if (i18 == 0) {
                            return this.this$0.topicsLayoutManager.mSpanCount;
                        }
                        return 1;
                    case 1:
                        if (i18 == 0) {
                            return this.this$0.layoutManager.mSpanCount;
                        }
                        return 1;
                    default:
                        ShareSearchAdapter shareSearchAdapter = this.this$0.searchAdapter;
                        return (i18 == shareSearchAdapter.hintsCell || i18 == shareSearchAdapter.resentTitleCell || i18 == shareSearchAdapter.firstEmptyViewCell || i18 == shareSearchAdapter.lastFilledItem || shareSearchAdapter.getItemViewType(i18) == 0) ? 4 : 1;
                }
            }
        };
        anonymousClass15.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ShareAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i18, View view) {
                TLRPC.Dialog dialog;
                TLRPC.TL_dialog tL_dialog;
                switch (i17) {
                    case 0:
                        this.f$0.lambda$new$5(i18);
                        break;
                    case 1:
                        ShareAlert shareAlert = this.f$0;
                        if (i18 >= 0) {
                            int i19 = i18 - 1;
                            ShareAlert.ShareDialogsAdapter shareDialogsAdapter2 = shareAlert.listAdapter;
                            if (i19 >= 0) {
                                if (i19 < shareDialogsAdapter2.dialogs.size()) {
                                    dialog = (TLRPC.Dialog) shareDialogsAdapter2.dialogs.get(i19);
                                }
                                if (dialog == null) {
                                    shareAlert.selectDialog(view, dialog);
                                    break;
                                }
                            } else {
                                shareDialogsAdapter2.getClass();
                            }
                            dialog = null;
                            if (dialog == null) {
                                shareAlert.selectDialog(view, dialog);
                                break;
                            }
                        } else {
                            shareAlert.getClass();
                            break;
                        }
                        break;
                    default:
                        ShareAlert shareAlert2 = this.f$0;
                        if (i18 >= 0) {
                            ShareAlert.ShareSearchAdapter shareSearchAdapter = shareAlert2.searchAdapter;
                            int i110 = shareSearchAdapter.recentDialogsStartRow;
                            if (i18 < i110 || i110 < 0) {
                                int i111 = i18 - 1;
                                if (i111 < 0) {
                                    tL_dialog = null;
                                } else if (i111 < shareSearchAdapter.searchResult.size()) {
                                    tL_dialog = ((ShareAlert.DialogSearchResult) shareSearchAdapter.searchResult.get(i111)).dialog;
                                } else {
                                    int size2 = i111 - shareSearchAdapter.searchResult.size();
                                    ArrayList arrayList3 = shareSearchAdapter.searchAdapterHelper.localServerSearch;
                                    if (size2 < arrayList3.size()) {
                                        TLObject tLObject = (TLObject) arrayList3.get(size2);
                                        tL_dialog = new TLRPC.TL_dialog();
                                        if (tLObject instanceof TLRPC.User) {
                                            tL_dialog.id = ((TLRPC.User) tLObject).id;
                                        } else if (tLObject instanceof TLRPC.Chat) {
                                            tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                                        } else {
                                            tL_dialog = null;
                                        }
                                    } else {
                                        tL_dialog = null;
                                    }
                                }
                            } else {
                                int i112 = i18 - i110;
                                if (i112 >= 0) {
                                    ShareAlert shareAlert3 = ShareAlert.this;
                                    if (i112 >= shareAlert3.recentSearchObjects.size()) {
                                        tL_dialog = null;
                                    } else {
                                        TLObject tLObject2 = ((DialogsSearchAdapter.RecentSearchObject) shareAlert3.recentSearchObjects.get(i112)).object;
                                        tL_dialog = new TLRPC.TL_dialog();
                                        if (tLObject2 instanceof TLRPC.User) {
                                            tL_dialog.id = ((TLRPC.User) tLObject2).id;
                                        } else if (tLObject2 instanceof TLRPC.Chat) {
                                            tL_dialog.id = -((TLRPC.Chat) tLObject2).id;
                                        } else {
                                            tL_dialog = null;
                                        }
                                    }
                                } else {
                                    tL_dialog = null;
                                }
                            }
                            if (tL_dialog != null) {
                                shareAlert2.selectDialog(view, tL_dialog);
                                break;
                            }
                        } else {
                            shareAlert2.getClass();
                            break;
                        }
                        break;
                }
            }
        });
        anonymousClass15.setHasFixedSize(true);
        anonymousClass15.setItemAnimator(null);
        anonymousClass15.setHorizontalScrollBarEnabled(false);
        anonymousClass15.setVerticalScrollBarEnabled(false);
        anonymousClass15.setOnScrollListener(new RecyclerView.OnScrollListener(this) {
            public final ShareAlert this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i18, int i19) {
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                Bulletin.Layout layout;
                Bulletin bulletin;
                switch (i17) {
                    case 0:
                        if (i19 != 0) {
                            ShareAlert shareAlert = this.this$0;
                            ShareAlert.access$6000(shareAlert);
                            shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                        }
                        break;
                    case 1:
                        ShareAlert shareAlert2 = this.this$0;
                        if (i19 != 0) {
                            ShareAlert.access$6000(shareAlert2);
                            shareAlert2.previousScrollOffsetY = shareAlert2.scrollOffsetY;
                        }
                        Bulletin bulletin2 = Bulletin.visibleBulletin;
                        if (bulletin2 != null && (layout = bulletin2.layout) != null && (layout.getParent() instanceof View) && ((View) Bulletin.visibleBulletin.layout.getParent()).getParent() == shareAlert2.bulletinContainer2 && (bulletin = Bulletin.visibleBulletin) != null) {
                            bulletin.hide();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = shareAlert2.scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor.onScrolled(i18, i19);
                            ShareAlert.access$7200(shareAlert2);
                            break;
                        }
                        break;
                    default:
                        if (i19 != 0) {
                            ShareAlert shareAlert3 = this.this$0;
                            ShareAlert.access$6000(shareAlert3);
                            shareAlert3.previousScrollOffsetY = shareAlert3.scrollOffsetY;
                        }
                        break;
                }
            }
        });
        anonymousClass15.addItemDecoration(new FiltersView.AnonymousClass2(5));
        anonymousClass15.setAdapter(this.searchAdapter);
        anonymousClass15.setGlowColor(getThemedColor(i14));
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(anonymousClass15, true);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, this.resourcesProvider);
        flickerLoadingView.setViewType(12);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, this.resourcesProvider, context, flickerLoadingView);
        this.searchEmptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        stickerEmptyView.setAnimateLayoutChange(true);
        stickerEmptyView.showProgress(false, false);
        boolean z4 = this.darkTheme;
        SpoilersTextView spoilersTextView = stickerEmptyView.title;
        if (z4) {
            spoilersTextView.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
        }
        spoilersTextView.setText(LocaleController.getString(R.string.NoResult));
        anonymousClass15.setEmptyView(stickerEmptyView);
        anonymousClass15.setHideIfEmpty(false);
        anonymousClass15.animateEmptyView = true;
        anonymousClass15.emptyViewAnimationType = 0;
        this.containerView.addView(stickerEmptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(anonymousClass15, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        QrActivity.AnonymousClass2 anonymousClass2 = new QrActivity.AnonymousClass2(this, context, 14);
        this.bottomFadeView = anonymousClass2;
        this.containerView.addView(anonymousClass2, LayoutHelper.createFrame(-1, 300, 80));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.darkTheme || this.linkToCopy[1] == null) ? 58.0f : 111.0f);
        this.shadow[0] = new View(context);
        View view = this.shadow[0];
        int i18 = Theme.key_dialogShadowLine;
        view.setBackgroundColor(getThemedColor(i18));
        this.shadow[0].setAlpha(0.0f);
        this.shadow[0].setTag(1);
        this.containerView.addView(this.shadow[0], layoutParams);
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, (!this.darkTheme || this.linkToCopy[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.shadow[1] = new View(context);
        this.shadow[1].setBackgroundColor(getThemedColor(i18));
        this.shadow[1].setLayoutParams(layoutParams2);
        if (this.isChannel || this.linkToCopy[0] != null) {
            f = 4.0f;
            f2 = 22.0f;
            if (this.darkTheme) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.pickerBottom = frameLayout2;
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.pickerBottomLayout = frameLayout3;
                frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                frameLayout3.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                ScaleStateListAnimator.apply(linearLayout2, 0.015f, 1.2f);
                linearLayout2.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda3(this, 0));
                SimpleTextView simpleTextView = new SimpleTextView(context);
                this.linkTextView = simpleTextView;
                simpleTextView.setTextSize(15);
                simpleTextView.setTextColor(getThemedColor(Theme.key_share_linkText));
                simpleTextView.setEllipsizeByGradient(true);
                updateLinkTextView();
                linearLayout2.addView(simpleTextView, LayoutHelper.createLinear(-1, 20, 1.0f, 23, 16, 0, 16, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                textView.setText(LocaleController.getString(R.string.Copy).toUpperCase());
                textView.setPadding(AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f), 0);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                int i19 = Theme.key_listSelector;
                textView.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i19), 4, 4));
                linearLayout2.addView(textView, LayoutHelper.createLinear(-2, 28, 0.0f, 21, 0, 0, 7, 0));
                textView.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda3(this, 4));
                ScaleStateListAnimator.apply(textView);
                anonymousClass12 = anonymousClass14;
                anonymousClass13 = anonymousClass15;
                this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, 58, 83));
                ArrayList arrayList3 = this.sendingMessageObjects;
                if (arrayList3 == null || arrayList3.size() <= 0 || ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner == null || ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner.forwards <= 0) {
                    linearLayoutM = null;
                    i2 = 11;
                } else {
                    final MessageObject messageObject3 = (MessageObject) this.sendingMessageObjects.get(0);
                    if (!ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject3.getDialogId()))) || messageObject3.isForwarded()) {
                        linearLayoutM = null;
                        i2 = 11;
                    } else {
                        final int i20 = 0;
                        linearLayoutM = zzkf.m(context, 0);
                        linearLayoutM.setOnClickListener(new View.OnClickListener(this) {
                            public final ShareAlert f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i20) {
                                    case 0:
                                        ShareAlert shareAlert = this.f$0;
                                        BaseFragment safeLastFragment = shareAlert.parentFragment;
                                        if (safeLastFragment == null) {
                                            safeLastFragment = LaunchActivity.getSafeLastFragment();
                                        }
                                        if (safeLastFragment != null) {
                                            shareAlert.lambda$showGiftOfferSheet$15();
                                            safeLastFragment.presentFragment(new MessageStatisticActivity(messageObject3));
                                            break;
                                        }
                                        break;
                                    default:
                                        ShareAlert shareAlert2 = this.f$0;
                                        BaseFragment safeLastFragment2 = shareAlert2.parentFragment;
                                        if (safeLastFragment2 == null) {
                                            safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                        }
                                        if (safeLastFragment2 != null) {
                                            shareAlert2.lambda$showGiftOfferSheet$15();
                                            safeLastFragment2.presentFragment(new MessageStatisticActivity(messageObject3));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        linearLayoutM.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                        linearLayoutM.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i19), 6, 6));
                        ScaleStateListAnimator.apply(linearLayoutM);
                        ImageView imageView = new ImageView(context);
                        imageView.setImageResource(R.drawable.mini_stats_shares);
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i21 = Theme.key_share_icon;
                        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i21), PorterDuff.Mode.SRC_IN));
                        linearLayoutM.addView(imageView, LayoutHelper.createLinear(-2, -2, 0.0f, 16));
                        TextView textView2 = new TextView(context);
                        textView2.setTextColor(getThemedColor(i21));
                        textView2.setTextSize(1, 15.0f);
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.formatNumber(messageObject3.messageOwner.forwards, ','));
                        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 4, -1, 0, 0));
                        i2 = 8;
                    }
                }
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, 42, 1.0f, 23, 11, 0, i2, 0));
                if (linearLayoutM != null) {
                    linearLayout.addView(linearLayoutM, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 5, 8, 0));
                }
            } else {
                anonymousClass12 = anonymousClass14;
                anonymousClass13 = anonymousClass15;
                FrameLayout frameLayout4 = new FrameLayout(context);
                this.pickerBottom = frameLayout4;
                FrameLayout frameLayout5 = new FrameLayout(context);
                this.pickerBottomLayout = frameLayout5;
                frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-1, -1.0f, 119, -2.0f, 0.0f, -2.0f, 0.0f));
                TextView textView3 = new TextView(context);
                int i22 = Theme.key_listSelector;
                textView3.setBackground(Theme.createSelectorDrawable(getThemedColor(i22), 2, AndroidUtilities.dp(22.0f)));
                textView3.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setGravity(17);
                if (!this.darkTheme || this.linkToCopy[1] == null) {
                    textView3.setText(LocaleController.getString(R.string.CopyLink).toUpperCase());
                } else {
                    textView3.setText(LocaleController.getString(R.string.VoipGroupCopySpeakerLinkNoCaps).toUpperCase());
                }
                textView3.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda3(this, 5));
                frameLayout5.addView(textView3, LayoutHelper.createFrame(-1, -1, 119));
                this.containerView.addView(frameLayout4, LayoutHelper.createFrame(-1, 58, 87));
                ArrayList arrayList4 = this.sendingMessageObjects;
                if (arrayList4 != null && arrayList4.size() > 0 && ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner != null && ((MessageObject) this.sendingMessageObjects.get(0)).messageOwner.forwards > 0) {
                    final MessageObject messageObject4 = (MessageObject) this.sendingMessageObjects.get(0);
                    if (ChatObject.hasAdminRights(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-messageObject4.getDialogId()))) && !messageObject4.isForwarded()) {
                        LinearLayout linearLayout3 = new LinearLayout(context);
                        this.sharesCountLayout = linearLayout3;
                        linearLayout3.setOrientation(0);
                        linearLayout3.setGravity(16);
                        linearLayout3.setBackground(Theme.createSelectorDrawable(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listSelector : i22), 2, AndroidUtilities.dp(22.0f)));
                        frameLayout5.addView(linearLayout3, LayoutHelper.createFrame(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                        final int i23 = 1;
                        linearLayout3.setOnClickListener(new View.OnClickListener(this) {
                            public final ShareAlert f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i23) {
                                    case 0:
                                        ShareAlert shareAlert = this.f$0;
                                        BaseFragment safeLastFragment = shareAlert.parentFragment;
                                        if (safeLastFragment == null) {
                                            safeLastFragment = LaunchActivity.getSafeLastFragment();
                                        }
                                        if (safeLastFragment != null) {
                                            shareAlert.lambda$showGiftOfferSheet$15();
                                            safeLastFragment.presentFragment(new MessageStatisticActivity(messageObject4));
                                            break;
                                        }
                                        break;
                                    default:
                                        ShareAlert shareAlert2 = this.f$0;
                                        BaseFragment safeLastFragment2 = shareAlert2.parentFragment;
                                        if (safeLastFragment2 == null) {
                                            safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                                        }
                                        if (safeLastFragment2 != null) {
                                            shareAlert2.lambda$showGiftOfferSheet$15();
                                            safeLastFragment2.presentFragment(new MessageStatisticActivity(messageObject4));
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        ImageView imageView2 = new ImageView(context);
                        imageView2.setImageResource(R.drawable.share_arrow);
                        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2), PorterDuff.Mode.MULTIPLY));
                        linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -1, 16, 20, 0, 0, 0));
                        TextView textView4 = new TextView(context);
                        textView4.setText(String.format("%d", Integer.valueOf(messageObject4.messageOwner.forwards)));
                        textView4.setTextSize(1, 14.0f);
                        textView4.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
                        textView4.setGravity(16);
                        textView4.setTypeface(AndroidUtilities.bold());
                        linearLayout3.addView(textView4, LayoutHelper.createLinear(-2, -1, 16, 8, 0, 20, 0));
                    }
                }
            }
        } else {
            f = 4.0f;
            this.shadow[1].setAlpha(0.0f);
            anonymousClass12 = anonymousClass14;
            anonymousClass13 = anonymousClass15;
            f2 = 22.0f;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.bulletinContainer = frameLayout6;
        this.containerView.addView(frameLayout6, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.pickerBottomLayout != null ? 48.0f : 0.0f));
        FrameLayout frameLayout7 = new FrameLayout(context);
        this.bulletinContainer2 = frameLayout7;
        this.containerView.addView(frameLayout7, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        AnonymousClass21 anonymousClass21 = new AnonymousClass21(context);
        this.frameLayout2 = anonymousClass21;
        anonymousClass21.setWillNotDraw(false);
        anonymousClass21.setAlpha(0.0f);
        anonymousClass21.setVisibility(4);
        this.containerView.addView(anonymousClass21, LayoutHelper.createFrame(-1, -2.0f, 83, -2.0f, 0.0f, -2.0f, 0.0f));
        anonymousClass21.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(21));
        AndroidUtilities.setLightNavigationBar(this.container, AndroidUtilities.computePerceivedBrightness(getThemedColor(i11)) > 0.721f);
        ?? r4 = new EditTextEmoji(context, anonymousClass5, this.resourcesProvider) {
            public ValueAnimator messageEditTextAnimator;
            public int messageEditTextPredrawHeigth;
            public int messageEditTextPredrawScrollY;
            public boolean shouldAnimateEditTextWithBounds;

            @Override
            public final void bottomPanelTranslationY(float f3) {
                ShareAlert.this.updateBottomOverlay$1();
            }

            @Override
            public final void createEmojiView() {
                super.createEmojiView();
                EmojiView emojiView = getEmojiView();
                ShareAlert shareAlert = ShareAlert.this;
                if (emojiView != null) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                    emojiView.setBottomInset(shareAlert.systemInsets.bottom);
                }
                FrameLayout frameLayout8 = shareAlert.timestampFrameLayout;
                if (frameLayout8 != null) {
                    frameLayout8.bringToFront();
                }
                AnonymousClass21 anonymousClass22 = shareAlert.frameLayout2;
                if (anonymousClass22 != null) {
                    anonymousClass22.bringToFront();
                }
                ChatActivity.AnonymousClass60 anonymousClass60 = shareAlert.writeButtonContainer;
                if (anonymousClass60 != null) {
                    anonymousClass60.bringToFront();
                }
            }

            @Override
            public final void dispatchDraw(Canvas canvas) {
                if (this.shouldAnimateEditTextWithBounds) {
                    EditTextCaption editText = getEditText();
                    editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawScrollY - editText.getScrollY()) + (this.messageEditTextPredrawHeigth - editText.getMeasuredHeight())));
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(editText, 17));
                    ValueAnimator valueAnimator = this.messageEditTextAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    this.messageEditTextAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    valueAnimatorOfFloat.start();
                    this.shouldAnimateEditTextWithBounds = false;
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public final void onLineCountChanged(int i24, int i25) {
                if (TextUtils.isEmpty(getEditText().getText())) {
                    getEditText().animate().cancel();
                    getEditText().setOffsetY(0.0f);
                    this.shouldAnimateEditTextWithBounds = false;
                } else {
                    this.shouldAnimateEditTextWithBounds = true;
                    this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                    this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                    invalidate();
                }
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.chatActivityEnterViewAnimateFromTop = shareAlert.frameLayout2.getTop() + shareAlert.captionEditTextTopOffset;
                shareAlert.frameLayout2.invalidate();
            }
        };
        this.commentTextView = r4;
        r4.includeNavigationBar = true;
        if (this.darkTheme) {
            EditTextCaption editText = r4.getEditText();
            int i24 = Theme.key_voipgroup_nameText;
            editText.setTextColor(getThemedColor(i24));
            r4.getEditText().setCursorColor(getThemedColor(i24));
        }
        r4.setHint(LocaleController.getString(R.string.ShareComment));
        r4.onResume();
        r4.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        anonymousClass21.addView((View) r4, LayoutHelper.createFrame(-1, -2, 51));
        anonymousClass21.setClipChildren(false);
        anonymousClass21.setClipToPadding(false);
        r4.setClipChildren(false);
        r4.getEditText().addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 17));
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 25);
        this.writeButtonContainer = anonymousClass60;
        anonymousClass60.setFocusable(true);
        anonymousClass60.setFocusableInTouchMode(true);
        anonymousClass60.setVisibility(4);
        anonymousClass60.setScaleX(0.2f);
        anonymousClass60.setScaleY(0.2f);
        anonymousClass60.setAlpha(0.0f);
        this.containerView.addView(anonymousClass60, LayoutHelper.createFrame(110, 50, 85));
        ?? r5 = new ChatActivityEnterView.SendButton(R.drawable.send_plane_24, context, this.resourcesProvider) {
            @Override
            public final int getFillColor() {
                return this.getThemedColor(Theme.key_dialogFloatingButton);
            }

            @Override
            public final boolean isOpen() {
                return true;
            }

            @Override
            public final boolean shouldDrawBackground() {
                return true;
            }
        };
        this.writeButton = r5;
        int iDp = AndroidUtilities.dp(52.0f);
        int iDp2 = AndroidUtilities.dp(38.0f);
        r5.circleWidth = iDp;
        r5.circleHeight = iDp2;
        float fDp = AndroidUtilities.dp(1.0f);
        float fDp2 = AndroidUtilities.dp(6.0f);
        r5.circlePadX = fDp;
        r5.circlePadY = fDp2;
        r5.newCounterPos = true;
        anonymousClass60.addView((View) r5, LayoutHelper.createFrame(-1.0f, -1));
        r5.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda3(this, 6));
        r5.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 9));
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        if (num != null) {
            this.timestamp = num.intValue();
            FrameLayout frameLayout8 = new FrameLayout(context);
            this.timestampFrameLayout = frameLayout8;
            LinearLayout linearLayout4 = new LinearLayout(context);
            this.timestampLayout = linearLayout4;
            linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(f));
            linearLayout4.setClipToPadding(false);
            linearLayout4.setOrientation(0);
            linearLayout4.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 6, 6));
            CheckBox2 checkBox2 = new CheckBox2(context, 24, this.resourcesProvider);
            this.timestampCheckbox = checkBox2;
            int i25 = Theme.key_radioBackgroundChecked;
            int i26 = Theme.key_checkboxDisabled;
            int i27 = Theme.key_checkboxCheck;
            CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
            checkBoxBase.setColor(i25, i26, i27);
            checkBox2.setDrawUnchecked(true);
            checkBoxBase.setChecked(-1, false, false);
            checkBox2.setDrawBackgroundAsArc(10);
            linearLayout4.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16, 0, 0, 0, 0));
            TextView textView5 = new TextView(context);
            textView5.setTextColor(getThemedColor(i12));
            textView5.setTextSize(1, 14.0f);
            textView5.setText(LocaleController.formatString(R.string.VideoShareAddTimestamp, AndroidUtilities.formatShortDuration(num.intValue())));
            linearLayout4.addView(textView5, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
            ScaleStateListAnimator.apply(linearLayout4, 0.025f, 1.5f);
            linearLayout4.setOnClickListener(new ShareAlert$$ExternalSyntheticLambda3(this, 1));
            frameLayout8.addView(linearLayout4, LayoutHelper.createFrame(-2, -2, 17));
            if (this.pickerBottom == null) {
                View view2 = new View(context);
                view2.setBackgroundColor(getThemedColor(Theme.key_divider));
                frameLayout8.addView(view2, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(this.darkTheme ? 0.66f : 1.0f / AndroidUtilities.density), 55));
            }
            this.containerView.addView(frameLayout8, LayoutHelper.createFrame(-1, 58, 83));
            if (this.pickerBottom == null) {
                frameLayout8.setAlpha(0.0f);
                frameLayout8.setVisibility(4);
            }
        }
        BlurredBackgroundWithFadeDrawable blurredBackgroundWithFadeDrawable = new BlurredBackgroundWithFadeDrawable(this.iBlur3FactoryFade.create(anonymousClass2, null, false));
        this.fadeDrawable = blurredBackgroundWithFadeDrawable;
        if (SharedConfig.chatBlurEnabled()) {
            LiteMode.isEnabled(262144);
        }
        blurredBackgroundWithFadeDrawable.setFadeHeight(AndroidUtilities.dp(72.0f), true);
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryFrostedLiquidGlass.create(anonymousClass5, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider), false);
        this.emojiViewChildBg = blurredBackgroundDrawableCreate;
        blurredBackgroundDrawableCreate.inAppKeyboardOptimization = true;
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        int iDp3 = AndroidUtilities.dp(32.0f);
        BlurredBackgroundDrawable.Props props = blurredBackgroundDrawableCreate.boundProps;
        props.liquidThickness = iDp3;
        blurredBackgroundDrawableCreate.onBoundPropsChanged();
        props.liquidIntensity = 0.4f;
        blurredBackgroundDrawableCreate.onBoundPropsChanged();
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = this.iBlur3FactoryLiquidGlass.create(anonymousClass21, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider), false);
        this.captionContainerBg = blurredBackgroundDrawableCreate2;
        blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(f2));
        blurredBackgroundDrawableCreate2.setPadding(AndroidUtilities.dp(9.0f));
        anonymousClass21.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(7.0f));
        FrameLayout frameLayout9 = this.pickerBottomLayout;
        if (frameLayout9 != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = this.iBlur3FactoryLiquidGlass.create(frameLayout9, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider), false);
            blurredBackgroundDrawableCreate3.setPadding(AndroidUtilities.dp(9.0f));
            blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(f2));
            this.pickerBottomLayout.setBackground(blurredBackgroundDrawableCreate3);
            this.pickerBottomLayout.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        FrameLayout frameLayout10 = this.timestampFrameLayout;
        if (frameLayout10 != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = this.iBlur3FactoryLiquidGlass.create(frameLayout10, BlurredBackgroundProviderImpl.inputFieldShareAlert(this.resourcesProvider), false);
            blurredBackgroundDrawableCreate4.setPadding(AndroidUtilities.dp(9.0f));
            blurredBackgroundDrawableCreate4.setRadius(AndroidUtilities.dp(f2));
            this.timestampFrameLayout.setBackground(blurredBackgroundDrawableCreate4);
            this.timestampFrameLayout.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        }
        updateSelectedCount(0);
        DialogsActivity.loadDialogs(AccountInstance.getInstance(this.currentAccount));
        if (shareDialogsAdapter.dialogs.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        int i28 = this.currentAccount;
        int i29 = 0;
        MessagesStorage.getInstance(i28).getStorageQueue().postRunnable(new ArticleViewer$$ExternalSyntheticLambda26(i28, i29, new DialogsSearchAdapter.OnRecentSearchLoaded() {
            @Override
            public final void setRecentSearch(ArrayList arrayList5, LongSparseArray longSparseArray) {
                int i30 = 0;
                while (i30 < arrayList5.size()) {
                    TLObject tLObject = ((DialogsSearchAdapter.RecentSearchObject) arrayList5.get(i30)).object;
                    if ((tLObject instanceof TLRPC.Chat) && !ChatObject.canWriteToChat((TLRPC.Chat) tLObject)) {
                        arrayList5.remove(i30);
                        i30--;
                    }
                    i30++;
                }
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.recentSearchObjects = arrayList5;
                for (int i31 = 0; i31 < shareAlert.recentSearchObjects.size(); i31++) {
                    DialogsSearchAdapter.RecentSearchObject recentSearchObject = (DialogsSearchAdapter.RecentSearchObject) shareAlert.recentSearchObjects.get(i31);
                    TLObject tLObject2 = recentSearchObject.object;
                    if (tLObject2 instanceof TLRPC.User) {
                        MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).putUser((TLRPC.User) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).putChat((TLRPC.Chat) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC.EncryptedChat) {
                        MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).putEncryptedChat((TLRPC.EncryptedChat) recentSearchObject.object, true);
                    }
                }
                shareAlert.searchAdapter.mObservable.notifyChanged();
            }
        }, 6));
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(anonymousClass12, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(anonymousClass13, false, 1.0f, false);
        BottomSheet.ContainerView container = getContainer();
        ShareAlert$$ExternalSyntheticLambda12 shareAlert$$ExternalSyntheticLambda12 = new ShareAlert$$ExternalSyntheticLambda12(this, i29);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(container, shareAlert$$ExternalSyntheticLambda12);
    }
}

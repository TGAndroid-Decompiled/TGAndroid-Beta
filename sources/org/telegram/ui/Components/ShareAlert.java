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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.arch.core.util.Function;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
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
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
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
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.ShareTopicCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.BlurredBackgroundWithFadeDrawable;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

public class ShareAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private AnimatorSet animatorSet;
    private View bottomFadeView;
    private FrameLayout bulletinContainer;
    public FrameLayout bulletinContainer2;
    private BlurredBackgroundDrawable captionContainerBg;
    private float captionEditTextTopOffset;
    private float chatActivityEnterViewAnimateFromTop;
    private EditTextEmoji commentTextView;
    private int containerViewTop;
    private boolean copyLinkOnEnd;
    private float currentPanTranslationY;
    private boolean darkTheme;
    private ShareAlertDelegate delegate;
    private BlurredBackgroundDrawable emojiViewChildBg;
    private TLRPC.TL_exportedMessageLink exportedMessageLink;
    private BlurredBackgroundWithFadeDrawable fadeDrawable;
    public boolean forceDarkThemeForHint;
    private FrameLayout frameLayout;
    private FrameLayout frameLayout2;
    private boolean fullyShown;
    private RecyclerListView gridView;
    private int hasPoll;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFade;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private boolean includeStory;
    public boolean includeStoryFromMessage;
    private boolean isChannel;
    private int keyboardSize2;
    private float keyboardT;
    int lastOffset;
    private GridLayoutManager layoutManager;
    private LinearLayout linkContainer;
    private TextView linkCopyButton;
    private SimpleTextView linkTextView;
    private String[] linkToCopy;
    private ShareDialogsAdapter listAdapter;
    private boolean loadingLink;
    private Paint paint;
    private boolean panTranslationMoveLayout;
    private Activity parentActivity;
    private ChatActivity parentFragment;
    private FrameLayout pickerBottom;
    private FrameLayout pickerBottomLayout;
    private int previousScrollOffsetY;
    private ArrayList recentSearchObjects;
    private LongSparseArray recentSearchObjectsById;
    private RectF rect;
    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    private int scrollOffsetY;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private ShareSearchAdapter searchAdapter;
    private StickerEmptyView searchEmptyView;
    private RecyclerListView searchGridView;
    private boolean searchIsVisible;
    private FillLastGridLayoutManager searchLayoutManager;
    FragmentSearchField searchView;
    private boolean searchWasVisibleBeforeTopics;
    protected Map selectedDialogTopics;
    protected LongSparseArray selectedDialogs;
    private TLRPC.Dialog selectedTopicDialog;
    private ActionBarPopupWindow sendPopupWindow;
    protected ArrayList sendingMessageObjects;
    private String[] sendingText;
    private View[] shadow;
    private AnimatorSet[] shadowAnimation;
    private Drawable shadowDrawable;
    private ShareTopicsAdapter shareTopicsAdapter;
    private LinearLayout sharesCountLayout;
    private int shiftDp;
    private boolean showSendersName;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    TL_stories.StoryItem storyItem;
    private SwitchView switchView;
    private Insets systemInsets;
    private TextPaint textPaint;
    public int timestamp;
    public CheckBox2 timestampCheckbox;
    public FrameLayout timestampFrameLayout;
    public LinearLayout timestampLayout;
    public TextView timestampTextView;
    private ValueAnimator topBackgroundAnimator;
    private int topBeforeSwitch;
    private SpringAnimation topicsAnimation;
    ActionBar topicsBackActionBar;
    private RecyclerListView topicsGridView;
    private GridLayoutManager topicsLayoutManager;
    private boolean updateSearchAdapter;
    private ChatActivityEnterView.SendButton writeButton;
    private FrameLayout writeButtonContainer;

    public static class DialogSearchResult {
        public int date;
        public TLRPC.Dialog dialog = new TLRPC.TL_dialog();
        public CharSequence name;
        public TLObject object;
    }

    public interface ShareAlertDelegate {

        public abstract class CC {
            public static void $default$didShare(ShareAlertDelegate shareAlertDelegate) {
            }
        }

        boolean didCopy();

        void didShare();
    }

    public static boolean lambda$new$15(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    protected void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
    }

    protected void onShareStory(View view) {
    }

    public void setStoryToShare(TL_stories.StoryItem storyItem) {
        this.storyItem = storyItem;
    }

    class SwitchView extends FrameLayout {
        private AnimatorSet animator;
        private int currentTab;
        private int lastColor;
        private SimpleTextView leftTab;
        private LinearGradient linearGradient;
        private Paint paint;
        private RectF rect;
        private SimpleTextView rightTab;
        private View searchBackground;
        private View slidingView;

        protected abstract void onTabSwitch(int i);

        public SwitchView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.rect = new RectF();
            View view = new View(context);
            this.searchBackground = view;
            view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), ShareAlert.this.getThemedColor(Theme.key_dialogSearchBackground)));
            addView(this.searchBackground, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            View view2 = new View(context) {
                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    invalidate();
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                    int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                    if (offsetColor != SwitchView.this.lastColor) {
                        SwitchView.this.linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP);
                        SwitchView.this.paint.setShader(SwitchView.this.linearGradient);
                    }
                    SwitchView.this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(SwitchView.this.rect, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), SwitchView.this.paint);
                }
            };
            this.slidingView = view2;
            addView(view2, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.leftTab = simpleTextView;
            int i = Theme.key_voipgroup_nameText;
            simpleTextView.setTextColor(ShareAlert.this.getThemedColor(i));
            this.leftTab.setTextSize(13);
            this.leftTab.setLeftDrawable(R.drawable.msg_tabs_mic1);
            this.leftTab.setText(LocaleController.getString(R.string.VoipGroupInviteCanSpeak));
            this.leftTab.setGravity(17);
            addView(this.leftTab, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
            this.leftTab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.lambda$new$0(view3);
                }
            });
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.rightTab = simpleTextView2;
            simpleTextView2.setTextColor(ShareAlert.this.getThemedColor(i));
            this.rightTab.setTextSize(13);
            this.rightTab.setLeftDrawable(R.drawable.msg_tabs_mic2);
            this.rightTab.setText(LocaleController.getString(R.string.VoipGroupInviteListenOnly));
            this.rightTab.setGravity(17);
            addView(this.rightTab, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
            this.rightTab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.lambda$new$1(view3);
                }
            });
        }

        public void lambda$new$0(View view) {
            switchToTab(0);
        }

        public void lambda$new$1(View view) {
            switchToTab(1);
        }

        private void switchToTab(int i) {
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
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.slidingView, (Property<View, Float>) View.TRANSLATION_X, this.currentTab == 0 ? 0.0f : r2.getMeasuredWidth()));
            this.animator.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SwitchView.this.animator = null;
                }
            });
            this.animator.start();
            onTabSwitch(this.currentTab);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(28.0f)) / 2;
            ((FrameLayout.LayoutParams) this.leftTab.getLayoutParams()).width = size;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.rightTab.getLayoutParams();
            layoutParams.width = size;
            layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
            ((FrameLayout.LayoutParams) this.slidingView.getLayoutParams()).width = size;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.slidingView.setTranslationX(this.currentTab == 0 ? 0.0f : r1.width);
            super.onMeasure(i, i2);
        }
    }

    public static ShareAlert createShareAlert(Context context, MessageObject messageObject, String str, boolean z, String str2, boolean z2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = new ArrayList();
            arrayList.add(messageObject);
        } else {
            arrayList = null;
        }
        return new ShareAlert(context, null, arrayList, str, null, z, str2, null, z2, false);
    }

    public ShareAlert(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2) {
        this(context, arrayList, str, z, str2, z2, null);
    }

    public ShareAlert(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, null, resourcesProvider);
    }

    public ShareAlert(Context context, ChatActivity chatActivity, ArrayList arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3) {
        this(context, chatActivity, arrayList, str, str2, z, str3, str4, z2, z3, false, null, null);
    }

    public ShareAlert(final android.content.Context r34, org.telegram.ui.ChatActivity r35, java.util.ArrayList r36, java.lang.String r37, java.lang.String r38, boolean r39, java.lang.String r40, java.lang.String r41, boolean r42, boolean r43, boolean r44, java.lang.Integer r45, org.telegram.ui.ActionBar.Theme.ResourcesProvider r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShareAlert.<init>(android.content.Context, org.telegram.ui.ChatActivity, java.util.ArrayList, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.Integer, org.telegram.ui.ActionBar.Theme$ResourcesProvider):void");
    }

    public void lambda$new$1(final Context context, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$0(tLObject, context);
            }
        });
    }

    public void lambda$new$0(TLObject tLObject, Context context) {
        if (tLObject != null) {
            this.exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject;
            updateLinkTextView();
            if (this.copyLinkOnEnd) {
                copyLink(context);
            }
        }
        this.loadingLink = false;
    }

    public boolean lambda$new$2(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.searchView.editText);
        return false;
    }

    public void lambda$new$3() {
        this.updateSearchAdapter = true;
        this.searchView.editText.setText("");
        AndroidUtilities.showKeyboard(this.searchView.editText);
    }

    public static Integer lambda$new$4(Integer num) {
        return 0;
    }

    public void lambda$new$5(View view, int i) {
        if (this.shareTopicsAdapter.botforumWithManageTopics && i == 1) {
            onTopicCreateCellClick();
            return;
        }
        TLRPC.TL_forumTopic itemTopic = this.shareTopicsAdapter.getItemTopic(i);
        if (itemTopic != null) {
            onTopicCellClick(itemTopic);
        }
    }

    public static Integer lambda$new$6(Integer num) {
        return 0;
    }

    public void lambda$new$7(View view, int i) {
        TLRPC.Dialog item;
        if (i >= 0 && (item = this.listAdapter.getItem(i)) != null) {
            selectDialog(view, item);
        }
    }

    public static Integer lambda$new$8(Integer num) {
        return 0;
    }

    public void lambda$new$9(View view, int i) {
        TLRPC.Dialog item;
        if (i >= 0 && (item = this.searchAdapter.getItem(i)) != null) {
            selectDialog(view, item);
        }
    }

    public void lambda$new$10(View view) throws NumberFormatException {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$new$0();
                PhotoViewer.getInstance().closePhoto(true, false);
                if (this.linkToCopy[0] == null && this.loadingLink) {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    copyLink(getContext());
                }
            }
        }
    }

    public void lambda$new$11(View view) {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$new$0();
                if (this.linkToCopy[0] == null && this.loadingLink) {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    copyLink(getContext());
                }
            }
        }
    }

    public void lambda$new$12(MessageObject messageObject, View view) {
        BaseFragment safeLastFragment = this.parentFragment;
        if (safeLastFragment == null) {
            safeLastFragment = LaunchActivity.getSafeLastFragment();
        }
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        safeLastFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    public void lambda$new$13(View view) {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                lambda$new$0();
                if (this.linkToCopy[0] == null && this.loadingLink) {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString(R.string.Loading), 0).show();
                } else {
                    copyLink(getContext());
                }
            }
        }
    }

    public void lambda$new$14(MessageObject messageObject, View view) {
        BaseFragment safeLastFragment = this.parentFragment;
        if (safeLastFragment == null) {
            safeLastFragment = LaunchActivity.getSafeLastFragment();
        }
        if (safeLastFragment == null) {
            return;
        }
        lambda$new$0();
        safeLastFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    class AnonymousClass21 extends FrameLayout {
        AnonymousClass21(Context context) {
            super(context);
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                ShareAlert.this.shadow[1].setTranslationY(0.0f);
            }
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (ShareAlert.this.chatActivityEnterViewAnimateFromTop != 0.0f && ShareAlert.this.chatActivityEnterViewAnimateFromTop != ShareAlert.this.frameLayout2.getTop() + ShareAlert.this.chatActivityEnterViewAnimateFromTop) {
                if (ShareAlert.this.topBackgroundAnimator != null) {
                    ShareAlert.this.topBackgroundAnimator.cancel();
                }
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.captionEditTextTopOffset = shareAlert.chatActivityEnterViewAnimateFromTop - (ShareAlert.this.frameLayout2.getTop() + ShareAlert.this.captionEditTextTopOffset);
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(shareAlert2.captionEditTextTopOffset, 0.0f);
                ShareAlert.this.topBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$onDraw$0(valueAnimator);
                    }
                });
                ShareAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ShareAlert.this.topBackgroundAnimator.setDuration(200L);
                ShareAlert.this.topBackgroundAnimator.start();
                ShareAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
            }
            ShareAlert.this.shadow[1].setTranslationY((-(ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + ShareAlert.this.captionEditTextTopOffset + ShareAlert.this.currentPanTranslationY + ((ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f)) * (1.0f - getAlpha())));
        }

        public void lambda$onDraw$0(ValueAnimator valueAnimator) {
            ShareAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShareAlert.this.frameLayout2.invalidate();
            invalidate();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            ShareAlert.this.captionContainerBg.setBounds(0, (int) ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            ShareAlert.this.captionContainerBg.draw(canvas);
            canvas.save();
            canvas.clipRect(0.0f, ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    class AnonymousClass22 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        AnonymousClass22(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
        }

        @Override
        protected void bottomPanelTranslationY(float f) {
            super.bottomPanelTranslationY(f);
            ShareAlert.this.updateBottomOverlay();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                final EditTextCaption editText = ShareAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawHeigth - editText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - editText.getScrollY())));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ShareAlert.AnonymousClass22.lambda$dispatchDraw$0(editText, valueAnimator);
                    }
                });
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

        public static void lambda$dispatchDraw$0(EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        protected void onLineCountChanged(int i, int i2) {
            if (!TextUtils.isEmpty(getEditText().getText())) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            } else {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            }
            ShareAlert.this.chatActivityEnterViewAnimateFromTop = r2.frameLayout2.getTop() + ShareAlert.this.captionEditTextTopOffset;
            ShareAlert.this.frameLayout2.invalidate();
        }

        @Override
        protected void showPopup(int i) {
            super.showPopup(i);
        }

        @Override
        public void hidePopup(boolean z) {
            super.hidePopup(z);
        }

        @Override
        protected void createEmojiView() {
            super.createEmojiView();
            EmojiView emojiView = getEmojiView();
            if (emojiView != null) {
                emojiView.shouldLightenBackground = false;
                emojiView.fixBottomTabContainerTranslation = false;
                emojiView.setShouldDrawBackground(false);
                emojiView.setBottomInset(ShareAlert.this.systemInsets.bottom);
            }
            FrameLayout frameLayout = ShareAlert.this.timestampFrameLayout;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
            if (ShareAlert.this.frameLayout2 != null) {
                ShareAlert.this.frameLayout2.bringToFront();
            }
            if (ShareAlert.this.writeButtonContainer != null) {
                ShareAlert.this.writeButtonContainer.bringToFront();
            }
        }
    }

    class AnonymousClass23 implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AnonymousClass23() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$afterTextChanged$0();
                }
            });
        }

        public void lambda$afterTextChanged$0() {
            ShareAlert.this.updateSelectedCount(1);
        }
    }

    public void lambda$new$16(View view) {
        sendInternal(true);
    }

    public boolean lambda$new$17(View view) {
        return onSendLongClick(this.writeButton);
    }

    public void lambda$new$18(View view) {
        this.timestampCheckbox.setChecked(!r3.isChecked(), true);
        updateLinkTextView();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        processLegacyContainerInsets(windowInsetsCompat.toWindowInsets());
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        if (!this.systemInsets.equals(insets)) {
            this.systemInsets = insets;
            this.container.requestLayout();
        }
        return WindowInsetsCompat.CONSUMED;
    }

    public void showPremiumBlockedToast(View view, long j) {
        String userName;
        Bulletin bulletinCreateSimpleBulletin;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j < 0) {
            userName = "";
        } else {
            userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
        }
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            bulletinCreateSimpleBulletin = BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)));
        } else {
            bulletinCreateSimpleBulletin = BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showPremiumBlockedToast$20();
                }
            });
        }
        bulletinCreateSimpleBulletin.show();
    }

    public void lambda$showPremiumBlockedToast$20() {
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                ShareAlert.lambda$showPremiumBlockedToast$19();
            }
        };
        if (isKeyboardVisible()) {
            FragmentSearchField fragmentSearchField = this.searchView;
            if (fragmentSearchField != null) {
                AndroidUtilities.hideKeyboard(fragmentSearchField.editText);
            }
            AndroidUtilities.runOnUIThread(runnable, 300L);
            return;
        }
        runnable.run();
    }

    public static void lambda$showPremiumBlockedToast$19() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new PremiumPreviewFragment("noncontacts"), bottomSheetParams);
        }
    }

    public void selectDialog(View view, final TLRPC.Dialog dialog) {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler;
        int i;
        if (dialog instanceof ShareDialogsAdapter.MyStoryDialog) {
            onShareStory(view);
            return;
        }
        if (dialog != null && (((view instanceof ShareDialogCell) && ((ShareDialogCell) view).isBlocked()) || ((view instanceof ProfileSearchCell) && ((ProfileSearchCell) view).isBlocked()))) {
            showPremiumBlockedToast(view, dialog.id);
            return;
        }
        if (this.topicsGridView.getVisibility() != 8 || this.parentActivity == null) {
            return;
        }
        if (DialogObject.isChatDialog(dialog.id)) {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-dialog.id, this.currentAccount) || (i = this.hasPoll) == 2 || i == 3)) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity);
                builder.setTitle(LocaleController.getString(R.string.SendMessageTitle));
                int i2 = this.hasPoll;
                if (i2 == 3) {
                    if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodoAll));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedTodo));
                    }
                } else if (i2 == 2) {
                    if (this.isChannel) {
                        builder.setMessage(LocaleController.getString(R.string.PublicPollCantForward));
                    } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPollsAll));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ErrorSendRestrictedPolls));
                    }
                } else {
                    builder.setMessage(LocaleController.getString(R.string.ChannelCantSendMessage));
                }
                builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                builder.show();
                return;
            }
        } else if (DialogObject.isEncryptedDialog(dialog.id) && this.hasPoll != 0) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this.parentActivity);
            builder2.setTitle(LocaleController.getString(R.string.SendMessageTitle));
            int i3 = this.hasPoll;
            if (i3 == 3) {
                builder2.setMessage(LocaleController.getString(R.string.TodoCantForwardSecretChat));
            } else if (i3 != 0) {
                builder2.setMessage(LocaleController.getString(R.string.PollCantForwardSecretChat));
            } else {
                builder2.setMessage(LocaleController.getString(R.string.InvoiceCantForwardSecretChat));
            }
            builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
            builder2.show();
            return;
        }
        if (this.selectedDialogs.indexOfKey(dialog.id) >= 0) {
            this.selectedDialogs.remove(dialog.id);
            this.selectedDialogTopics.remove(dialog);
            if (view instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view).setChecked(false, true);
            } else if (view instanceof ShareDialogCell) {
                ((ShareDialogCell) view).setChecked(false, true);
            }
            updateSelectedCount(1);
        } else {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(dialog.id));
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-dialog.id));
            if (UserObject.isBotForum(user) || (DialogObject.isChatDialog(dialog.id) && (ChatObject.isForum(chat2) || (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2))))) {
                this.selectedTopicDialog = dialog;
                this.topicsLayoutManager.scrollToPositionWithOffset(0, this.scrollOffsetY - this.topicsGridView.getPaddingTop());
                final AtomicReference atomicReference = new AtomicReference();
                final AnonymousClass27 anonymousClass27 = new AnonymousClass27(dialog, atomicReference, view);
                atomicReference.set(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$selectDialog$21(atomicReference, anonymousClass27, dialog);
                    }
                });
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i4 = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(anonymousClass27, i4);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-dialog.id) != null) {
                    anonymousClass27.didReceivedNotification(i4, this.currentAccount, Long.valueOf(-dialog.id));
                    return;
                } else {
                    MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-dialog.id);
                    AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                    return;
                }
            }
            this.selectedDialogs.put(dialog.id, dialog);
            if (view instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view).setChecked(true, true);
            } else if (view instanceof ShareDialogCell) {
                ((ShareDialogCell) view).setChecked(true, true);
            }
            updateSelectedCount(2);
            long j = UserConfig.getInstance(this.currentAccount).clientUserId;
            if (this.searchIsVisible) {
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog.id);
                if (dialog2 == null) {
                    this.listAdapter.dialogsMap.put(dialog.id, dialog);
                    this.listAdapter.dialogs.add(1 ^ (this.listAdapter.dialogs.isEmpty() ? 1 : 0), dialog);
                } else if (dialog2.id != j) {
                    this.listAdapter.dialogs.remove(dialog2);
                    this.listAdapter.dialogs.add(1 ^ (this.listAdapter.dialogs.isEmpty() ? 1 : 0), dialog2);
                }
                this.listAdapter.notifyDataSetChanged();
                this.updateSearchAdapter = false;
                this.searchView.editText.setText("");
                checkCurrentList(false);
                AndroidUtilities.hideKeyboard(this.searchView.editText);
            }
        }
        ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
        if (shareSearchAdapter == null || (categoryAdapterRecycler = shareSearchAdapter.categoryAdapter) == null) {
            return;
        }
        categoryAdapterRecycler.notifyItemRangeChanged(0, categoryAdapterRecycler.getItemCount());
    }

    class AnonymousClass27 implements NotificationCenter.NotificationCenterDelegate {
        final View val$cell;
        final TLRPC.Dialog val$dialog;
        final AtomicReference val$timeoutRef;

        AnonymousClass27(TLRPC.Dialog dialog, AtomicReference atomicReference, View view) {
            this.val$dialog = dialog;
            this.val$timeoutRef = atomicReference;
            this.val$cell = view;
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (((Long) objArr[0]).longValue() == (-this.val$dialog.id)) {
                boolean z = (ShareAlert.this.shareTopicsAdapter.topics == null && MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id) != null) || this.val$timeoutRef.get() == null;
                ShareAlert.this.shareTopicsAdapter.topics = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id);
                ShareAlert.this.shareTopicsAdapter.botforumWithManageTopics = UserObject.isBotForumWithEditableTopics(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id);
                if (z) {
                    ShareAlert.this.shareTopicsAdapter.notifyDataSetChanged();
                }
                if (ShareAlert.this.shareTopicsAdapter.topics != null) {
                    NotificationCenter.getInstance(((BottomSheet) ShareAlert.this).currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
                }
                if (z) {
                    ShareAlert.this.topicsGridView.setVisibility(0);
                    ShareAlert.this.topicsGridView.setAlpha(0.0f);
                    ShareAlert.this.topicsBackActionBar.setVisibility(0);
                    ShareAlert.this.topicsBackActionBar.setAlpha(0.0f);
                    if (!UserObject.isBotForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id)) {
                        if (ChatObject.isMonoForum(((BottomSheet) ShareAlert.this).currentAccount, this.val$dialog.id)) {
                            ShareAlert shareAlert = ShareAlert.this;
                            shareAlert.topicsBackActionBar.setTitle(ForumUtilities.getMonoForumTitle(((BottomSheet) shareAlert).currentAccount, MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-this.val$dialog.id))));
                            ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                        } else {
                            ShareAlert shareAlert2 = ShareAlert.this;
                            shareAlert2.topicsBackActionBar.setTitle(MessagesController.getInstance(((BottomSheet) shareAlert2).currentAccount).getChat(Long.valueOf(-this.val$dialog.id)).title);
                            ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                        }
                    } else {
                        ShareAlert shareAlert3 = ShareAlert.this;
                        shareAlert3.topicsBackActionBar.setTitle(DialogObject.getShortName(MessagesController.getInstance(((BottomSheet) shareAlert3).currentAccount).getUser(Long.valueOf(this.val$dialog.id))));
                        ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectChat));
                    }
                    ShareAlert shareAlert4 = ShareAlert.this;
                    shareAlert4.searchWasVisibleBeforeTopics = shareAlert4.searchIsVisible;
                    if (ShareAlert.this.topicsAnimation != null) {
                        ShareAlert.this.topicsAnimation.cancel();
                    }
                    final int[] iArr = new int[2];
                    ShareAlert.this.topicsAnimation = new SpringAnimation(new FloatValueHolder(0.0f)).setSpring(new SpringForce(1000.0f).setStiffness((ShareAlert.this.parentFragment == null || !ShareAlert.this.parentFragment.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f).setDampingRatio(1.0f));
                    SpringAnimation springAnimation = ShareAlert.this.topicsAnimation;
                    final View view = this.val$cell;
                    springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                            this.f$0.lambda$didReceivedNotification$0(view, iArr, dynamicAnimation, f, f2);
                        }
                    });
                    ShareAlert.this.topicsAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                            this.f$0.lambda$didReceivedNotification$1(dynamicAnimation, z2, f, f2);
                        }
                    });
                    ShareAlert.this.topicsAnimation.start();
                    if (this.val$timeoutRef.get() != null) {
                        AndroidUtilities.cancelRunOnUIThread((Runnable) this.val$timeoutRef.get());
                        this.val$timeoutRef.set(null);
                    }
                }
            }
        }

        public void lambda$didReceivedNotification$0(View view, int[] iArr, DynamicAnimation dynamicAnimation, float f, float f2) {
            ShareAlert.this.invalidateTopicsAnimation(view, iArr, f / 1000.0f);
        }

        public void lambda$didReceivedNotification$1(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ShareAlert.this.gridView.setVisibility(8);
            ShareAlert.this.searchGridView.setVisibility(8);
            ShareAlert.this.searchView.setVisibility(8);
            ShareAlert.this.topicsAnimation = null;
        }
    }

    public void lambda$selectDialog$21(AtomicReference atomicReference, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC.Dialog dialog) {
        atomicReference.set(null);
        notificationCenterDelegate.didReceivedNotification(NotificationCenter.topicsDidLoaded, this.currentAccount, Long.valueOf(-dialog.id));
    }

    private void collapseTopics() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        final View view = null;
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
        this.searchView.setVisibility(0);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            this.sizeNotifierFrameLayout.adjustPanLayoutHelper.ignoreOnce();
            this.searchView.editText.requestFocus();
            AndroidUtilities.showKeyboard(this.searchView.editText);
        }
        final int[] iArr = new int[2];
        SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(1000.0f));
        SpringForce springForce = new SpringForce(0.0f);
        ChatActivity chatActivity = this.parentFragment;
        SpringAnimation spring = springAnimation2.setSpring(springForce.setStiffness((chatActivity == null || !chatActivity.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f).setDampingRatio(1.0f));
        this.topicsAnimation = spring;
        spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                this.f$0.lambda$collapseTopics$22(view, iArr, dynamicAnimation, f, f2);
            }
        });
        this.topicsAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                this.f$0.lambda$collapseTopics$23(dynamicAnimation, z, f, f2);
            }
        });
        this.topicsAnimation.start();
    }

    public void lambda$collapseTopics$22(View view, int[] iArr, DynamicAnimation dynamicAnimation, float f, float f2) {
        invalidateTopicsAnimation(view, iArr, f / 1000.0f);
    }

    public void lambda$collapseTopics$23(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.topicsGridView.setVisibility(8);
        this.topicsBackActionBar.setVisibility(8);
        this.shareTopicsAdapter.topics = null;
        this.shareTopicsAdapter.notifyDataSetChanged();
        this.topicsAnimation = null;
        this.searchWasVisibleBeforeTopics = false;
    }

    public void invalidateTopicsAnimation(View view, int[] iArr, float f) {
        this.topicsGridView.setPivotX(view.getX() + (view.getWidth() / 2.0f));
        this.topicsGridView.setPivotY(view.getY() + (view.getHeight() / 2.0f));
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        this.topicsGridView.setScaleX(f3);
        this.topicsGridView.setScaleY(f3);
        this.topicsGridView.setAlpha(f);
        RecyclerListView mainGridView = getMainGridView();
        mainGridView.setPivotX(view.getX() + (view.getWidth() / 2.0f));
        mainGridView.setPivotY(view.getY() + (view.getHeight() / 2.0f));
        float f4 = f2 + 1.0f;
        mainGridView.setScaleX(f4);
        mainGridView.setScaleY(f4);
        float f5 = 1.0f - f;
        mainGridView.setAlpha(f5);
        this.searchView.setPivotX(r4.getWidth() / 2.0f);
        this.searchView.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        this.searchView.setScaleX(f6);
        this.searchView.setScaleY(f6);
        this.searchView.setAlpha(f5);
        this.topicsBackActionBar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f5);
        this.topicsBackActionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.setAlpha(f);
        this.topicsGridView.getLocationInWindow(iArr);
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
        for (int i2 = 0; i2 < this.topicsGridView.getChildCount(); i2++) {
            View childAt2 = this.topicsGridView.getChildAt(i2);
            if (childAt2 instanceof ShareTopicCell) {
                double d = 1.0f - interpolation;
                childAt2.setTranslationX((float) ((-(childAt2.getX() - view.getX())) * Math.pow(d, 2.0d)));
                childAt2.setTranslationY((float) ((-((childAt2.getY() + this.topicsGridView.getTranslationY()) - view.getY())) * Math.pow(d, 2.0d)));
            }
        }
        this.containerView.requestLayout();
        mainGridView.invalidate();
    }

    @Override
    public int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.containerViewTop;
    }

    private boolean onSendLongClick(View view) {
        int measuredHeight;
        ChatActivity chatActivity;
        if (this.parentActivity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        if (this.sendingMessageObjects != null) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_voipgroup_inviteMembersBackground));
            }
            actionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() {
                private Rect popupRect = new Rect();

                @Override
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() != 0 || ShareAlert.this.sendPopupWindow == null || !ShareAlert.this.sendPopupWindow.isShowing()) {
                        return false;
                    }
                    view2.getHitRect(this.popupRect);
                    if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                    ShareAlert.this.sendPopupWindow.dismiss();
                    return false;
                }
            });
            actionBarPopupWindowLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                @Override
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    this.f$0.lambda$onSendLongClick$24(keyEvent);
                }
            });
            actionBarPopupWindowLayout.setShownFromBottom(false);
            final ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, true, false, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarMenuSubItem.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.ShowSendersName), 0);
            this.showSendersName = true;
            actionBarMenuSubItem.setChecked(true);
            final ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getContext(), true, false, true, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarMenuSubItem2.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.HideSendersName), 0);
            actionBarMenuSubItem2.setChecked(!this.showSendersName);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$onSendLongClick$25(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    this.f$0.lambda$onSendLongClick$26(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarPopupWindowLayout.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
            linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, -8.0f));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarPopupWindowLayout2.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
        }
        actionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindowLayout2.setOnTouchListener(new View.OnTouchListener() {
            private Rect popupRect = new Rect();

            @Override
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0 || ShareAlert.this.sendPopupWindow == null || !ShareAlert.this.sendPopupWindow.isShowing()) {
                    return false;
                }
                view2.getHitRect(this.popupRect);
                if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                ShareAlert.this.sendPopupWindow.dismiss();
                return false;
            }
        });
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
            @Override
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                this.f$0.lambda$onSendLongClick$27(keyEvent);
            }
        });
        actionBarPopupWindowLayout2.setShownFromBottom(false);
        ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getContext(), true, true, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarMenuSubItem3.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem3.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.SendWithoutSound), R.drawable.input_notify_off);
        actionBarMenuSubItem3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$onSendLongClick$28(view2);
            }
        });
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(getContext(), true, true, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString(R.string.SendMessage), R.drawable.msg_send);
        actionBarMenuSubItem4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem4, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$onSendLongClick$29(view2);
            }
        });
        actionBarPopupWindowLayout2.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
        linearLayout.addView(actionBarPopupWindowLayout2, LayoutHelper.createLinear(-1, -2));
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout, -2, -2);
        this.sendPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setAnimationEnabled(false);
        this.sendPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
        this.sendPopupWindow.setOutsideTouchable(true);
        this.sendPopupWindow.setClippingEnabled(true);
        this.sendPopupWindow.setInputMethodMode(2);
        this.sendPopupWindow.setSoftInputMode(0);
        this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.sendPopupWindow.setFocusable(true);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (this.keyboardVisible && (chatActivity = this.parentFragment) != null && chatActivity.contentView.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = iArr[1] + view.getMeasuredHeight();
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        this.sendPopupWindow.showAtLocation(view, 51, ((iArr[0] + view.getMeasuredWidth()) - linearLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f), measuredHeight);
        this.sendPopupWindow.dimBehind();
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    public void lambda$onSendLongClick$24(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$25(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        this.showSendersName = true;
        actionBarMenuSubItem.setChecked(true);
        actionBarMenuSubItem2.setChecked(!this.showSendersName);
    }

    public void lambda$onSendLongClick$26(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        this.showSendersName = false;
        actionBarMenuSubItem.setChecked(false);
        actionBarMenuSubItem2.setChecked(!this.showSendersName);
    }

    public void lambda$onSendLongClick$27(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$28(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        sendInternal(false);
    }

    public void lambda$onSendLongClick$29(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        sendInternal(true);
    }

    protected void sendInternal(final boolean z) {
        int i;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.selectedDialogs.size(); i4++) {
            if (AlertsCreator.checkSlowMode(getContext(), this.currentAccount, this.selectedDialogs.keyAt(i4), this.frameLayout2.getTag() != null && this.commentTextView.length() > 0)) {
                return;
            }
        }
        final CharSequence[] charSequenceArr = {this.commentTextView.getText()};
        final ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CheckBox2 checkBox2 = this.timestampCheckbox;
        final int i5 = (checkBox2 == null || !checkBox2.isChecked()) ? -1 : this.timestamp;
        ArrayList arrayList = new ArrayList();
        if (this.sendingMessageObjects != null) {
            i2 = 0;
            while (i3 < this.selectedDialogs.size()) {
                long jKeyAt = this.selectedDialogs.keyAt(i3);
                long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt);
                if (sendPaidMessagesStars <= 0) {
                    sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt));
                }
                if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && sendPaidMessagesStars > 0) {
                    i2++;
                }
                if (sendPaidMessagesStars > 0) {
                    i2++;
                }
                if (sendPaidMessagesStars > 0 && !arrayList.contains(Long.valueOf(jKeyAt))) {
                    arrayList.add(Long.valueOf(jKeyAt));
                }
                i3++;
            }
        } else {
            SwitchView switchView = this.switchView;
            int i6 = switchView != null ? switchView.currentTab : 0;
            if (this.storyItem != null) {
                i = 0;
                for (int i7 = 0; i7 < this.selectedDialogs.size(); i7++) {
                    long jKeyAt2 = this.selectedDialogs.keyAt(i7);
                    long sendPaidMessagesStars2 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt2);
                    if (sendPaidMessagesStars2 <= 0) {
                        sendPaidMessagesStars2 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt2));
                    }
                    if (this.storyItem != null && this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && charSequenceArr[0] != null && sendPaidMessagesStars2 > 0) {
                        i++;
                    }
                    if (sendPaidMessagesStars2 > 0) {
                        i++;
                    }
                    if (sendPaidMessagesStars2 > 0 && !arrayList.contains(Long.valueOf(jKeyAt2))) {
                        arrayList.add(Long.valueOf(jKeyAt2));
                    }
                }
            } else if (this.sendingText[i6] != null) {
                i2 = 0;
                while (i3 < this.selectedDialogs.size()) {
                    long jKeyAt3 = this.selectedDialogs.keyAt(i3);
                    long sendPaidMessagesStars3 = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(jKeyAt3);
                    if (sendPaidMessagesStars3 <= 0) {
                        sendPaidMessagesStars3 = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(jKeyAt3));
                    }
                    if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && sendPaidMessagesStars3 > 0) {
                        i2++;
                    }
                    if (sendPaidMessagesStars3 > 0) {
                        i2++;
                    }
                    if (sendPaidMessagesStars3 > 0 && !arrayList.contains(Long.valueOf(jKeyAt3))) {
                        arrayList.add(Long.valueOf(jKeyAt3));
                    }
                    i3++;
                }
            } else {
                i = 0;
            }
            AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList, i, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$sendInternal$30(charSequenceArr, entities, z, i5, (HashMap) obj);
                }
            });
        }
        i = i2;
        AlertsCreator.ensurePaidMessagesMultiConfirmation(this.currentAccount, arrayList, i, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$sendInternal$30(charSequenceArr, entities, z, i5, (HashMap) obj);
            }
        });
    }

    public void lambda$sendInternal$30(CharSequence[] charSequenceArr, ArrayList arrayList, boolean z, int i, HashMap map) {
        boolean z2;
        long j;
        char c;
        MessageObject messageObject;
        boolean z3;
        Long l;
        long j2;
        long j3;
        long j4;
        SendMessagesHelper.SendMessageParams sendMessageParamsOf;
        long j5;
        long peerDialogId = 0;
        Long l2 = 0L;
        ?? r8 = 0;
        if (this.sendingMessageObjects != null) {
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            boolean z4 = false;
            while (i2 < this.selectedDialogs.size()) {
                long jKeyAt = this.selectedDialogs.keyAt(i2);
                boolean zIsMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt);
                Long l3 = map == null ? l2 : (Long) map.get(Long.valueOf(jKeyAt));
                if (l3 != null && l3.longValue() > peerDialogId) {
                    z4 = true;
                }
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt));
                if (tL_forumTopic != null && zIsMonoForum) {
                    peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                }
                MessageObject messageObject2 = (tL_forumTopic == null || zIsMonoForum) ? null : new MessageObject(this.currentAccount, tL_forumTopic.topicStartMessage, false, false);
                if (messageObject2 != null) {
                    messageObject2.isTopicMainMessage = true;
                }
                if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) {
                    j5 = jKeyAt;
                } else {
                    CharSequence charSequence = charSequenceArr[0];
                    j5 = jKeyAt;
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf2 = SendMessagesHelper.SendMessageParams.of(charSequence == null ? null : charSequence.toString(), jKeyAt, messageObject2, messageObject2, null, true, arrayList, null, null, z, 0, 0, null, false);
                    sendMessageParamsOf2.payStars = l3 == null ? 0L : l3.longValue();
                    sendMessageParamsOf2.monoForumPeer = peerDialogId;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf2);
                }
                int iSendMessage = SendMessagesHelper.getInstance(this.currentAccount).sendMessage(this.sendingMessageObjects, j5, !this.showSendersName, false, z, 0, 0, messageObject2, i, l3 == null ? 0L : l3.longValue(), peerDialogId, null);
                if (iSendMessage != 0) {
                    arrayList2.add(Long.valueOf(j5));
                }
                if (this.selectedDialogs.size() == 1) {
                    AlertsCreator.showSendMediaAlert(iSendMessage, this.parentFragment, null);
                    if (iSendMessage != 0) {
                        break;
                    }
                }
                i2++;
                peerDialogId = 0;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Long) it.next()).longValue();
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.selectedDialogs.get(jLongValue);
                this.selectedDialogs.remove(jLongValue);
                if (dialog != null) {
                    this.selectedDialogTopics.remove(dialog);
                }
            }
            if (!this.selectedDialogs.isEmpty()) {
                onSend(this.selectedDialogs, this.sendingMessageObjects.size(), this.selectedDialogs.size() == 1 ? (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(this.selectedDialogs.valueAt(0)) : null, true ^ z4);
            }
        } else {
            SwitchView switchView = this.switchView;
            int i3 = switchView != null ? switchView.currentTab : 0;
            if (this.storyItem != null) {
                int i4 = 0;
                z2 = false;
                while (i4 < this.selectedDialogs.size()) {
                    long jKeyAt2 = this.selectedDialogs.keyAt(i4);
                    boolean zIsMonoForum2 = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt2);
                    Long l4 = map == null ? l2 : (Long) map.get(Long.valueOf(jKeyAt2));
                    if (l4 != null && l4.longValue() > 0) {
                        z2 = true;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt2));
                    long peerDialogId2 = (tL_forumTopic2 == null || !zIsMonoForum2) ? 0L : DialogObject.getPeerDialogId(tL_forumTopic2.from_id);
                    Object messageObject3 = (tL_forumTopic2 == null || zIsMonoForum2) ? tL_forumTopic : new MessageObject(this.currentAccount, tL_forumTopic2.topicStartMessage, r8, r8);
                    if (this.storyItem == null) {
                        if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0) {
                            CharSequence charSequence2 = charSequenceArr[r8];
                            ?? string = charSequence2 == null ? tL_forumTopic : charSequence2.toString();
                            j3 = peerDialogId2;
                            sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(string, jKeyAt2, messageObject3, messageObject3, null, true, arrayList, null, null, z, 0, 0, null, false);
                        } else {
                            j3 = peerDialogId2;
                            sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(this.sendingText[i3], jKeyAt2, messageObject3, messageObject3, null, true, null, null, null, z, 0, 0, null, false);
                        }
                    } else {
                        j3 = peerDialogId2;
                        if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0 || charSequenceArr[r8] == null) {
                            j4 = jKeyAt2;
                        } else {
                            j4 = jKeyAt2;
                            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[r8].toString(), jKeyAt2, null, messageObject3, null, true, null, null, null, z, 0, 0, null, false));
                        }
                        sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(null, j4, messageObject3, messageObject3, null, true, null, null, null, z, 0, 0, null, false);
                        sendMessageParamsOf.sendingStory = this.storyItem;
                    }
                    sendMessageParamsOf.payStars = l4 == null ? 0L : l4.longValue();
                    sendMessageParamsOf.monoForumPeer = j3;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf);
                    i4++;
                    tL_forumTopic = null;
                    r8 = 0;
                }
            } else if (this.sendingText[i3] != null) {
                int i5 = 0;
                z2 = false;
                while (i5 < this.selectedDialogs.size()) {
                    long jKeyAt3 = this.selectedDialogs.keyAt(i5);
                    boolean zIsMonoForum3 = MessagesController.getInstance(this.currentAccount).isMonoForum(jKeyAt3);
                    Long l5 = map == null ? l2 : (Long) map.get(Long.valueOf(jKeyAt3));
                    if (l5 != null) {
                        j = 0;
                        if (l5.longValue() > 0) {
                            z2 = true;
                        }
                    } else {
                        j = 0;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic3 = (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(this.selectedDialogs.get(jKeyAt3));
                    long peerDialogId3 = (tL_forumTopic3 == null || !zIsMonoForum3) ? j : DialogObject.getPeerDialogId(tL_forumTopic3.from_id);
                    if (tL_forumTopic3 == null || zIsMonoForum3) {
                        c = 0;
                        messageObject = null;
                    } else {
                        c = 0;
                        messageObject = new MessageObject(this.currentAccount, tL_forumTopic3.topicStartMessage, false, false);
                    }
                    if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) {
                        z3 = z2;
                        l = l2;
                        j2 = peerDialogId3;
                    } else {
                        CharSequence charSequence3 = charSequenceArr[c];
                        z3 = z2;
                        l = l2;
                        j2 = peerDialogId3;
                        SendMessagesHelper.SendMessageParams sendMessageParamsOf3 = SendMessagesHelper.SendMessageParams.of(charSequence3 == null ? null : charSequence3.toString(), jKeyAt3, messageObject, messageObject, null, true, arrayList, null, null, z, 0, 0, null, false);
                        sendMessageParamsOf3.payStars = l5 == null ? j : l5.longValue();
                        sendMessageParamsOf3.monoForumPeer = j2;
                        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf3);
                    }
                    SendMessagesHelper.SendMessageParams sendMessageParamsOf4 = SendMessagesHelper.SendMessageParams.of(this.sendingText[i3], jKeyAt3, messageObject, messageObject, null, true, null, null, null, z, 0, 0, null, false);
                    sendMessageParamsOf4.payStars = l5 == null ? j : l5.longValue();
                    sendMessageParamsOf4.monoForumPeer = j2;
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(sendMessageParamsOf4);
                    i5++;
                    z2 = z3;
                    l2 = l;
                }
            } else {
                z2 = false;
            }
            LongSparseArray longSparseArray = this.selectedDialogs;
            onSend(longSparseArray, 1, (TLRPC.TL_forumTopic) this.selectedDialogTopics.get(longSparseArray.valueAt(0)), !z2);
        }
        ShareAlertDelegate shareAlertDelegate = this.delegate;
        if (shareAlertDelegate != null) {
            shareAlertDelegate.didShare();
        }
        lambda$new$0();
    }

    public int getCurrentTop() {
        if (this.gridView.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = this.gridView.getPaddingTop();
        if (holder.getLayoutPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    private RecyclerListView getMainGridView() {
        return (this.searchIsVisible || this.searchWasVisibleBeforeTopics) ? this.searchGridView : this.gridView;
    }

    public void setDelegate(ShareAlertDelegate shareAlertDelegate) {
        this.delegate = shareAlertDelegate;
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override
    public void lambda$openCrafting$8() {
        if (this.selectedTopicDialog != null) {
            collapseTopics();
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null && editTextEmoji.isPopupShowing()) {
            this.commentTextView.hidePopup(true);
        } else {
            super.lambda$openCrafting$8();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.dialogsNeedReload;
        if (i == i3) {
            ShareDialogsAdapter shareDialogsAdapter = this.listAdapter;
            if (shareDialogsAdapter != null) {
                shareDialogsAdapter.fetchDialogs();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i3);
        }
    }

    public void updateLayout() {
        if (this.panTranslationMoveLayout) {
            return;
        }
        RecyclerListView recyclerListView = this.searchIsVisible ? this.searchGridView : this.gridView;
        if (recyclerListView.getChildCount() <= 0) {
            return;
        }
        View childAt = recyclerListView.getChildAt(0);
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            if (recyclerListView.getChildAt(i).getTop() < childAt.getTop()) {
                childAt = recyclerListView.getChildAt(i);
            }
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerListView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i2 = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top >= 0 && holder != null && holder.getAdapterPosition() == 0) {
            this.lastOffset = childAt.getTop();
            runShadowAnimation(0, false);
        } else {
            this.lastOffset = Integer.MAX_VALUE;
            runShadowAnimation(0, true);
            top = i2;
        }
        if (this.topicsGridView.getVisibility() == 0) {
            RecyclerListView recyclerListView2 = this.topicsGridView;
            if (recyclerListView2.getChildCount() <= 0) {
                return;
            }
            View childAt2 = recyclerListView2.getChildAt(0);
            for (int i3 = 0; i3 < recyclerListView2.getChildCount(); i3++) {
                if (recyclerListView2.getChildAt(i3).getTop() < childAt2.getTop()) {
                    childAt2 = recyclerListView2.getChildAt(i3);
                }
            }
            RecyclerListView.Holder holder2 = (RecyclerListView.Holder) recyclerListView2.findContainingViewHolder(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i4 = (top2 <= 0 || holder2 == null || holder2.getAdapterPosition() != 0) ? 0 : top2;
            if (top2 >= 0 && holder2 != null && holder2.getAdapterPosition() == 0) {
                this.lastOffset = childAt2.getTop();
                runShadowAnimation(0, false);
            } else {
                this.lastOffset = Integer.MAX_VALUE;
                runShadowAnimation(0, true);
                top2 = i4;
            }
            top = AndroidUtilities.lerp(top, top2, this.topicsGridView.getAlpha());
        }
        int i5 = this.scrollOffsetY;
        if (i5 != top) {
            this.previousScrollOffsetY = i5;
            RecyclerListView recyclerListView3 = this.gridView;
            float f = top;
            int i6 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i6;
            recyclerListView3.setTopGlowOffset(i6);
            RecyclerListView recyclerListView4 = this.searchGridView;
            int i7 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i7;
            recyclerListView4.setTopGlowOffset(i7);
            RecyclerListView recyclerListView5 = this.topicsGridView;
            int i8 = (int) (f + this.currentPanTranslationY);
            this.scrollOffsetY = i8;
            recyclerListView5.setTopGlowOffset(i8);
            this.frameLayout.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.searchEmptyView.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.containerView.invalidate();
        }
    }

    private void runShadowAnimation(final int i, final boolean z) {
        if ((!z || this.shadow[i].getTag() == null) && (z || this.shadow[i].getTag() != null)) {
            return;
        }
        this.shadow[i].setTag(z ? null : 1);
        if (z) {
            this.shadow[i].setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.shadowAnimation[i] = new AnimatorSet();
        this.shadowAnimation[i].playTogether(ObjectAnimator.ofFloat(this.shadow[i], (Property<View, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.shadowAnimation[i].setDuration(150L);
        this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                if (!z) {
                    ShareAlert.this.shadow[i].setVisibility(4);
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }
        });
        this.shadowAnimation[i].start();
    }

    private void copyLink(Context context) {
        final boolean z = false;
        if (this.exportedMessageLink == null && this.linkToCopy[0] == null) {
            return;
        }
        try {
            String link = getLink();
            ClipboardManager clipboardManager = (ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard");
            if (link == null) {
                link = this.exportedMessageLink.link;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", link));
            ShareAlertDelegate shareAlertDelegate = this.delegate;
            if (shareAlertDelegate != null && shareAlertDelegate.didCopy()) {
                return;
            }
            if (this.parentActivity instanceof LaunchActivity) {
                TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
                if (tL_exportedMessageLink != null && tL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.parentActivity).showBulletin(new Function() {
                    @Override
                    public final Object apply(Object obj) {
                        return ShareAlert.lambda$copyLink$31(z, (BulletinFactory) obj);
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static Bulletin lambda$copyLink$31(boolean z, BulletinFactory bulletinFactory) {
        return bulletinFactory.createCopyLinkBulletin(z);
    }

    private boolean showCommentTextView(final boolean z) {
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        if (z) {
            this.frameLayout2.setVisibility(0);
            FrameLayout frameLayout = this.timestampFrameLayout;
            if (frameLayout != null && this.pickerBottom == null) {
                frameLayout.setVisibility(0);
            }
            this.writeButtonContainer.setVisibility(0);
        } else {
            FrameLayout frameLayout2 = this.pickerBottom;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        }
        FrameLayout frameLayout3 = this.pickerBottom;
        if (frameLayout3 != null) {
            ViewCompat.setImportantForAccessibility(frameLayout3, z ? 4 : 1);
        }
        LinearLayout linearLayout = this.sharesCountLayout;
        if (linearLayout != null) {
            ViewCompat.setImportantForAccessibility(linearLayout, z ? 4 : 1);
        }
        this.animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout4 = this.frameLayout2;
        Property property = View.ALPHA;
        float fDp = 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout4, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout5 = this.timestampFrameLayout;
        if (frameLayout5 != null && this.pickerBottom == null) {
            arrayList.add(ObjectAnimator.ofFloat(frameLayout5, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) View.SCALE_X, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) View.SCALE_Y, z ? 1.0f : 0.2f));
        arrayList.add(ObjectAnimator.ofFloat(this.writeButtonContainer, (Property<FrameLayout, Float>) property, z ? 1.0f : 0.0f));
        FrameLayout frameLayout6 = this.pickerBottom;
        if (frameLayout6 == null || frameLayout6.getVisibility() != 0) {
            arrayList.add(ObjectAnimator.ofFloat(this.shadow[1], (Property<View, Float>) property, z ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout7 = this.pickerBottomLayout;
        if (frameLayout7 != null) {
            Property property2 = View.TRANSLATION_Y;
            if (this.darkTheme && z) {
                fDp = AndroidUtilities.dp(this.timestampLayout != null ? 5.0f : 16.0f);
            }
            arrayList.add(ObjectAnimator.ofFloat(frameLayout7, (Property<FrameLayout, Float>) property2, fDp));
        }
        this.animatorSet.playTogether(arrayList);
        this.animatorSet.setInterpolator(new DecelerateInterpolator());
        this.animatorSet.setDuration(180L);
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    if (!z) {
                        ShareAlert.this.frameLayout2.setVisibility(4);
                        ShareAlert shareAlert = ShareAlert.this;
                        if (shareAlert.timestampFrameLayout != null && shareAlert.pickerBottom == null) {
                            ShareAlert.this.timestampFrameLayout.setVisibility(4);
                        }
                        ShareAlert.this.writeButtonContainer.setVisibility(4);
                    } else if (ShareAlert.this.pickerBottom != null) {
                        ShareAlert.this.pickerBottom.setVisibility(4);
                    }
                    ShareAlert.this.animatorSet = null;
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    ShareAlert.this.animatorSet = null;
                }
            }
        });
        this.animatorSet.start();
        return true;
    }

    public void updateSelectedCount(int i) {
        if (this.selectedDialogs.size() == 0) {
            showCommentTextView(false);
            return;
        }
        ArrayList arrayList = this.sendingMessageObjects;
        int size = arrayList == null ? 1 : arrayList.size();
        if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0) {
            size++;
        }
        long j = 0;
        for (int i2 = 0; i2 < this.selectedDialogs.size(); i2++) {
            long j2 = ((TLRPC.Dialog) this.selectedDialogs.valueAt(i2)).id;
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(j2);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(j2));
            }
            j += sendPaidMessagesStars;
        }
        this.writeButton.setCount(Math.max(1, this.selectedDialogs.size()), i != 0);
        this.writeButton.setStarsPrice(j, size, i != 0);
        showCommentTextView(true);
        this.commentTextView.setPadding(0, 0, Math.max(AndroidUtilities.dp(84.0f), this.writeButton.width()), 0);
    }

    @Override
    public void lambda$new$0() {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji.getEditText());
        }
        this.fullyShown = false;
        super.lambda$new$0();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    private class ShareDialogsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private ArrayList dialogs = new ArrayList();
        private LongSparseArray dialogsMap = new LongSparseArray();

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        private class MyStoryDialog extends TLRPC.Dialog {
            private MyStoryDialog() {
                this.id = Long.MAX_VALUE;
            }
        }

        public ShareDialogsAdapter(Context context) {
            this.context = context;
            fetchDialogs();
        }

        public void fetchDialogs() {
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            this.dialogs.clear();
            this.dialogsMap.clear();
            long j = UserConfig.getInstance(((BottomSheet) ShareAlert.this).currentAccount).clientUserId;
            if (ShareAlert.this.includeStory) {
                MyStoryDialog myStoryDialog = new MyStoryDialog();
                this.dialogs.add(myStoryDialog);
                this.dialogsMap.put(myStoryDialog.id, myStoryDialog);
            }
            if (!MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.isEmpty()) {
                TLRPC.Dialog dialog = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.get(0);
                this.dialogs.add(dialog);
                this.dialogsMap.put(dialog.id, dialog);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getAllDialogs();
            for (int i = 0; i < allDialogs.size(); i++) {
                TLRPC.Dialog dialog2 = allDialogs.get(i);
                if (dialog2 instanceof TLRPC.TL_dialog) {
                    long j2 = dialog2.id;
                    if (j2 != j && !DialogObject.isEncryptedDialog(j2)) {
                        if (!DialogObject.isUserDialog(dialog2.id)) {
                            TLRPC.Chat chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-dialog2.id));
                            if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog2.folder_id == 1) {
                                    arrayList.add(dialog2);
                                } else {
                                    this.dialogs.add(dialog2);
                                }
                                this.dialogsMap.put(dialog2.id, dialog2);
                            }
                        } else {
                            if (dialog2.folder_id == 1) {
                                arrayList.add(dialog2);
                            } else {
                                this.dialogs.add(dialog2);
                            }
                            this.dialogsMap.put(dialog2.id, dialog2);
                        }
                    }
                }
            }
            this.dialogs.addAll(arrayList);
            if (ShareAlert.this.parentFragment != null) {
                int i2 = ShareAlert.this.parentFragment.shareAlertDebugMode;
                if (i2 == 1) {
                    ArrayList arrayList2 = this.dialogs;
                    ArrayList arrayList3 = new ArrayList(arrayList2.subList(0, Math.min(4, arrayList2.size())));
                    this.dialogs.clear();
                    this.dialogs.addAll(arrayList3);
                } else if (i2 == 2) {
                    while (!this.dialogs.isEmpty() && this.dialogs.size() < 80) {
                        ArrayList arrayList4 = this.dialogs;
                        arrayList4.add((TLRPC.Dialog) arrayList4.get(arrayList4.size() - 1));
                    }
                }
            }
            notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            int size = this.dialogs.size();
            return size != 0 ? size + 1 : size;
        }

        public TLRPC.Dialog getItem(int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.dialogs.size()) {
                return null;
            }
            return (TLRPC.Dialog) this.dialogs.get(i2);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new ShareDialogCell(this.context, 0, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    protected String repostToCustomName() {
                        if (ShareAlert.this.includeStoryFromMessage) {
                            return LocaleController.getString(R.string.RepostToStory);
                        }
                        return super.repostToCustomName();
                    }
                };
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) viewHolder.itemView;
                TLRPC.Dialog item = getItem(i);
                if (item == null) {
                    return;
                }
                shareDialogCell.setTopic((TLRPC.TL_forumTopic) ShareAlert.this.selectedDialogTopics.get(item), MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).isMonoForum(item.id), false);
                long j = item.id;
                shareDialogCell.setDialog(j, ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, null);
            }
        }
    }

    private class ShareTopicsAdapter extends RecyclerListView.SelectionAdapter {
        private boolean botforumWithManageTopics;
        private Context context;
        private List topics;

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        public ShareTopicsAdapter(Context context) {
            this.context = context;
        }

        @Override
        public int getItemCount() {
            List list = this.topics;
            return (list != null ? list.size() + 1 : 0) + (this.botforumWithManageTopics ? 1 : 0);
        }

        public TLRPC.TL_forumTopic getItemTopic(int i) {
            int i2 = i - 1;
            if (this.botforumWithManageTopics) {
                i2 = i - 2;
            }
            List list = this.topics;
            if (list == null || i2 < 0 || i2 >= list.size()) {
                return null;
            }
            return (TLRPC.TL_forumTopic) this.topics.get(i2);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shareTopicCell;
            if (i == 0 || i == 2) {
                shareTopicCell = new ShareTopicCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                shareTopicCell = new View(this.context);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, ActionBar.getCurrentActionBarHeight()));
            }
            return new RecyclerListView.Holder(shareTopicCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareTopicCell shareTopicCell = (ShareTopicCell) viewHolder.itemView;
                if (i == 1 && this.botforumWithManageTopics) {
                    shareTopicCell.setAsNewBotForumTopic(ShareAlert.this.selectedTopicDialog);
                } else if (this.topics != null) {
                    TLRPC.TL_forumTopic itemTopic = getItemTopic(i);
                    shareTopicCell.setTopic(ShareAlert.this.selectedTopicDialog, itemTopic, itemTopic != null && ShareAlert.this.selectedDialogs.indexOfKey((long) itemTopic.id) >= 0, null);
                }
            }
        }
    }

    public class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapter;
        RecyclerView categoryListView;
        private Context context;
        int itemsCount;
        private int lastGlobalSearchId;
        int lastItemCont;
        private int lastLocalSearchId;
        private int lastSearchId;
        private String lastSearchText;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private Runnable searchRunnable2;
        private ArrayList searchResult = new ArrayList();
        int hintsCell = -1;
        int resentTitleCell = -1;
        int firstEmptyViewCell = -1;
        int recentDialogsStartRow = -1;
        int searchResultsStartRow = -1;
        int lastFilledItem = -1;
        boolean internalDialogsIsSearching = false;

        public ShareSearchAdapter(Context context) {
            this.context = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(false) {
                @Override
                protected boolean filter(TLObject tLObject) {
                    return !(tLObject instanceof TLRPC.Chat) || ChatObject.canWriteToChat((TLRPC.Chat) tLObject);
                }
            };
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap map) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, map);
                }

                @Override
                public void onDataSetChanged(int r4) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.AnonymousClass2.onDataSetChanged(int):void");
                }

                @Override
                public boolean canApplySearchResults(int i) {
                    return i == ShareSearchAdapter.this.lastSearchId;
                }
            });
        }

        private void searchDialogsInternal(final String str, final int i) {
            MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchDialogsInternal$1(str, i);
                }
            });
        }

        public void lambda$searchDialogsInternal$1(java.lang.String r22, int r23) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.lambda$searchDialogsInternal$1(java.lang.String, int):void");
        }

        public static int lambda$searchDialogsInternal$0(Object obj, Object obj2) {
            int i = ((DialogSearchResult) obj).date;
            int i2 = ((DialogSearchResult) obj2).date;
            if (i < i2) {
                return 1;
            }
            return i > i2 ? -1 : 0;
        }

        private void updateSearchResults(final ArrayList arrayList, final int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateSearchResults$2(i, arrayList);
                }
            });
        }

        public void lambda$updateSearchResults$2(int i, ArrayList arrayList) {
            if (i != this.lastSearchId) {
                return;
            }
            getItemCount();
            this.internalDialogsIsSearching = false;
            this.lastLocalSearchId = i;
            if (this.lastGlobalSearchId != i) {
                this.searchAdapterHelper.clear();
            }
            if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.searchAdapter) {
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLObject tLObject = ((DialogSearchResult) arrayList.get(i2)).object;
                if (tLObject instanceof TLRPC.User) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC.User) tLObject, true);
                } else if (tLObject instanceof TLRPC.Chat) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC.Chat) tLObject, true);
                }
            }
            boolean z = !this.searchResult.isEmpty() && arrayList.isEmpty();
            if (this.searchResult.isEmpty()) {
                arrayList.isEmpty();
            }
            if (z) {
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBeforeSwitch = shareAlert2.getCurrentTop();
            }
            this.searchResult = arrayList;
            this.searchAdapterHelper.mergeResults(arrayList, null);
            int i3 = this.lastItemCont;
            if (getItemCount() == 0 && !this.searchAdapterHelper.isSearchInProgress() && !this.internalDialogsIsSearching) {
                ShareAlert.this.searchEmptyView.showProgress(false, true);
            } else {
                ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i3);
            }
            notifyDataSetChanged();
            ShareAlert.this.checkCurrentList(true);
        }

        public void searchDialogs(final String str) {
            if (str == null || !str.equals(this.lastSearchText)) {
                this.lastSearchText = str;
                if (this.searchRunnable != null) {
                    Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                    this.searchRunnable = null;
                }
                Runnable runnable = this.searchRunnable2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.searchRunnable2 = null;
                }
                this.searchResult.clear();
                this.searchAdapterHelper.mergeResults(null);
                this.searchAdapterHelper.queryServerSearch(null, true, true, true, true, false, 0L, false, 0, 0);
                notifyDataSetChanged();
                ShareAlert.this.checkCurrentList(true);
                if (TextUtils.isEmpty(str)) {
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                    this.lastSearchId = -1;
                    this.internalDialogsIsSearching = false;
                } else {
                    this.internalDialogsIsSearching = true;
                    final int i = this.lastSearchId + 1;
                    this.lastSearchId = i;
                    ShareAlert.this.searchEmptyView.showProgress(true, true);
                    DispatchQueue dispatchQueue = Utilities.searchQueue;
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$searchDialogs$4(str, i);
                        }
                    };
                    this.searchRunnable = runnable2;
                    dispatchQueue.postRunnable(runnable2, 300L);
                }
                ShareAlert.this.checkCurrentList(false);
            }
        }

        public void lambda$searchDialogs$4(final String str, final int i) {
            this.searchRunnable = null;
            searchDialogsInternal(str, i);
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchDialogs$3(i, str);
                }
            };
            this.searchRunnable2 = runnable;
            AndroidUtilities.runOnUIThread(runnable);
        }

        public void lambda$searchDialogs$3(int i, String str) {
            this.searchRunnable2 = null;
            if (i != this.lastSearchId) {
                return;
            }
            this.searchAdapterHelper.queryServerSearch(str, true, true, true, true, false, 0L, false, 0, i);
        }

        @Override
        public int getItemCount() {
            this.itemsCount = 0;
            this.hintsCell = -1;
            this.resentTitleCell = -1;
            this.recentDialogsStartRow = -1;
            this.searchResultsStartRow = -1;
            this.lastFilledItem = -1;
            if (TextUtils.isEmpty(this.lastSearchText)) {
                int i = this.itemsCount;
                this.firstEmptyViewCell = i;
                this.itemsCount = i + 2;
                this.hintsCell = i + 1;
                if (ShareAlert.this.recentSearchObjects.size() > 0) {
                    int i2 = this.itemsCount;
                    int i3 = i2 + 1;
                    this.itemsCount = i3;
                    this.resentTitleCell = i2;
                    this.recentDialogsStartRow = i3;
                    this.itemsCount = i3 + ShareAlert.this.recentSearchObjects.size();
                }
                int i4 = this.itemsCount;
                int i5 = i4 + 1;
                this.itemsCount = i5;
                this.lastFilledItem = i4;
                this.lastItemCont = i5;
                return i5;
            }
            int i6 = this.itemsCount;
            int i7 = i6 + 1;
            this.itemsCount = i7;
            this.firstEmptyViewCell = i6;
            this.searchResultsStartRow = i7;
            int size = i7 + this.searchResult.size() + this.searchAdapterHelper.getLocalServerSearch().size();
            this.itemsCount = size;
            if (size == 1) {
                this.firstEmptyViewCell = -1;
                this.itemsCount = 0;
                this.lastItemCont = 0;
                return 0;
            }
            int i8 = size + 1;
            this.itemsCount = i8;
            this.lastFilledItem = size;
            this.lastItemCont = i8;
            return i8;
        }

        public TLRPC.Dialog getItem(int i) {
            int i2 = this.recentDialogsStartRow;
            if (i >= i2 && i2 >= 0) {
                int i3 = i - i2;
                if (i3 >= 0 && i3 < ShareAlert.this.recentSearchObjects.size()) {
                    TLObject tLObject = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i3)).object;
                    TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                    if (tLObject instanceof TLRPC.User) {
                        tL_dialog.id = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        tL_dialog.id = -((TLRPC.Chat) tLObject).id;
                    }
                    return tL_dialog;
                }
                return null;
            }
            int i4 = i - 1;
            if (i4 < 0) {
                return null;
            }
            if (i4 < this.searchResult.size()) {
                return ((DialogSearchResult) this.searchResult.get(i4)).dialog;
            }
            int size = i4 - this.searchResult.size();
            ArrayList localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
            if (size < localServerSearch.size()) {
                TLObject tLObject2 = (TLObject) localServerSearch.get(size);
                TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                if (tLObject2 instanceof TLRPC.User) {
                    tL_dialog2.id = ((TLRPC.User) tLObject2).id;
                } else if (tLObject2 instanceof TLRPC.Chat) {
                    tL_dialog2.id = -((TLRPC.Chat) tLObject2).id;
                }
                return tL_dialog2;
            }
            return null;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return (viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4) ? false : true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewShowPremiumBlock;
            if (i == 0) {
                viewShowPremiumBlock = new ProfileSearchCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider).useCustomPaints().showPremiumBlock(true);
            } else if (i == 2) {
                RecyclerListView recyclerListView = new RecyclerListView(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (getParent() != null && getParent().getParent() != null) {
                            ViewParent parent = getParent().getParent();
                            boolean z = true;
                            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                                z = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z);
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                };
                this.categoryListView = recyclerListView;
                recyclerListView.setItemAnimator(null);
                recyclerListView.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.context) {
                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler = new DialogsSearchAdapter.CategoryAdapterRecycler(this.context, ((BottomSheet) ShareAlert.this).currentAccount, true, true, ((BottomSheet) ShareAlert.this).resourcesProvider) {
                    @Override
                    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                        TLRPC.Chat chat;
                        String firstName;
                        HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
                        if (ShareAlert.this.darkTheme || ShareAlert.this.forceDarkThemeForHint) {
                            hintDialogCell.setColors(Theme.key_voipgroup_nameText, Theme.key_voipgroup_inviteMembersBackground);
                        }
                        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i2);
                        TLRPC.Peer peer = tL_topPeer.peer;
                        long j = peer.user_id;
                        TLRPC.User user = null;
                        if (j != 0) {
                            user = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(tL_topPeer.peer.user_id));
                            chat = null;
                        } else {
                            long j2 = peer.channel_id;
                            if (j2 != 0) {
                                j = -j2;
                                chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
                            } else {
                                long j3 = peer.chat_id;
                                if (j3 != 0) {
                                    j = -j3;
                                    chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                                } else {
                                    chat = null;
                                    j = 0;
                                }
                            }
                        }
                        boolean z = j == hintDialogCell.getDialogId();
                        hintDialogCell.setTag(Long.valueOf(j));
                        if (user != null) {
                            firstName = UserObject.getFirstName(user);
                        } else {
                            firstName = chat != null ? chat.title : "";
                        }
                        hintDialogCell.setDialog(j, true, firstName);
                        hintDialogCell.setChecked(ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, z);
                    }
                };
                this.categoryAdapter = categoryAdapterRecycler;
                recyclerListView.setAdapter(categoryAdapterRecycler);
                recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view, int i2) {
                        this.f$0.lambda$onCreateViewHolder$5(view, i2);
                    }
                });
                viewShowPremiumBlock = recyclerListView;
            } else if (i == 3) {
                GraySectionCell graySectionCell = new GraySectionCell(this.context, ((BottomSheet) ShareAlert.this).resourcesProvider);
                graySectionCell.setTextColor(Theme.key_graySectionText);
                graySectionCell.setBackgroundColor(ShareAlert.this.getThemedColor(Theme.key_graySection));
                graySectionCell.setText(LocaleController.getString(R.string.Recent));
                viewShowPremiumBlock = graySectionCell;
            } else if (i == 4) {
                viewShowPremiumBlock = new View(this.context) {
                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ShareAlert.this.searchLayoutManager.lastItemHeight, 1073741824));
                    }
                };
            } else if (i == 5) {
                View shareDialogCell = new ShareDialogCell(this.context, 0, ((BottomSheet) ShareAlert.this).resourcesProvider);
                shareDialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
                viewShowPremiumBlock = shareDialogCell;
            } else {
                View view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
                viewShowPremiumBlock = view;
            }
            return new RecyclerListView.Holder(viewShowPremiumBlock);
        }

        public void lambda$onCreateViewHolder$5(android.view.View r7, int r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.lambda$onCreateViewHolder$5(android.view.View, int):void");
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            long j;
            String name;
            String str;
            long j2;
            int iIndexOfIgnoreCase;
            TLObject tLObject;
            int iIndexOfIgnoreCase2;
            if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 5) {
                TLObject tLObject2 = null;
                name = null;
                name = null;
                String name2 = null;
                TLRPC.TL_encryptedChat tL_encryptedChat = null;
                if (TextUtils.isEmpty(this.lastSearchText)) {
                    int i2 = this.recentDialogsStartRow;
                    long j3 = 0;
                    if (i2 < 0 || i < i2) {
                        tLObject = null;
                    } else {
                        TLObject tLObject3 = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i - i2)).object;
                        if (tLObject3 instanceof TLRPC.User) {
                            TLRPC.User user = (TLRPC.User) tLObject3;
                            j3 = user.id;
                            name2 = ContactsController.formatName(user.first_name, user.last_name);
                        } else if (tLObject3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                            j3 = -chat.id;
                            name2 = chat.title;
                        } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                            tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                            TLRPC.User user2 = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(tL_encryptedChat.user_id));
                            if (user2 != null) {
                                j3 = user2.id;
                                name2 = ContactsController.formatName(user2.first_name, user2.last_name);
                            }
                        }
                        String lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                        if (TextUtils.isEmpty(lastFoundUsername) || name2 == null || (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(name2.toString(), lastFoundUsername)) == -1) {
                            tLObject = tLObject3;
                        } else {
                            ?? spannableStringBuilder = new SpannableStringBuilder(name2);
                            spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) ShareAlert.this).resourcesProvider), iIndexOfIgnoreCase2, lastFoundUsername.length() + iIndexOfIgnoreCase2, 33);
                            tLObject = tLObject3;
                            name2 = spannableStringBuilder;
                        }
                    }
                    TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
                    View view = viewHolder.itemView;
                    if (view instanceof ProfileSearchCell) {
                        ((ProfileSearchCell) view).setData(tLObject, tL_encryptedChat2, name2, null, false, false);
                        ((ProfileSearchCell) viewHolder.itemView).useSeparator = i < getItemCount() - 2;
                        return;
                    } else {
                        if (view instanceof ShareDialogCell) {
                            ((ShareDialogCell) view).setDialog(j3, ShareAlert.this.selectedDialogs.indexOfKey(j3) >= 0, name2);
                            return;
                        }
                        return;
                    }
                }
                int size = i - 1;
                if (size < this.searchResult.size()) {
                    DialogSearchResult dialogSearchResult = (DialogSearchResult) this.searchResult.get(size);
                    j2 = dialogSearchResult.dialog.id;
                    str = dialogSearchResult.name;
                } else {
                    size -= this.searchResult.size();
                    tLObject2 = (TLObject) this.searchAdapterHelper.getLocalServerSearch().get(size);
                    if (tLObject2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) tLObject2;
                        j = user3.id;
                        name = ContactsController.formatName(user3.first_name, user3.last_name);
                    } else {
                        TLRPC.Chat chat2 = (TLRPC.Chat) tLObject2;
                        j = -chat2.id;
                        name = chat2.title;
                    }
                    String lastFoundUsername2 = this.searchAdapterHelper.getLastFoundUsername();
                    if (TextUtils.isEmpty(lastFoundUsername2) || name == null || (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(name.toString(), lastFoundUsername2)) == -1) {
                        str = name;
                    } else {
                        ?? spannableStringBuilder2 = new SpannableStringBuilder(name);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ((BottomSheet) ShareAlert.this).resourcesProvider), iIndexOfIgnoreCase, lastFoundUsername2.length() + iIndexOfIgnoreCase, 33);
                        str = spannableStringBuilder2;
                    }
                    j2 = j;
                }
                TLObject tLObject4 = tLObject2;
                View view2 = viewHolder.itemView;
                if (view2 instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) view2).setData(tLObject4, null, str, null, false, false);
                    ((ProfileSearchCell) viewHolder.itemView).useSeparator = size < getItemCount() - 2;
                    return;
                } else {
                    if (view2 instanceof ShareDialogCell) {
                        ((ShareDialogCell) view2).setDialog(j2, ShareAlert.this.selectedDialogs.indexOfKey(j2) >= 0, str);
                        return;
                    }
                    return;
                }
            }
            if (viewHolder.getItemViewType() == 2) {
                ((RecyclerListView) viewHolder.itemView).getAdapter().notifyDataSetChanged();
            }
        }

        @Override
        public int getItemViewType(int i) {
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

        public int getSpanSize(int i, int i2) {
            if (i2 == this.hintsCell || i2 == this.resentTitleCell || i2 == this.firstEmptyViewCell || i2 == this.lastFilledItem || getItemViewType(i2) == 0) {
                return i;
            }
            return 1;
        }
    }

    public void checkCurrentList(boolean z) {
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.searchView.editText.getText()) || ((this.keyboardVisible && this.searchView.editText.hasFocus()) || this.searchWasVisibleBeforeTopics)) {
            this.updateSearchAdapter = true;
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, true);
            }
        } else {
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false);
            }
            z2 = false;
        }
        if (this.searchIsVisible != z2 || z) {
            this.searchIsVisible = z2;
            this.searchAdapter.notifyDataSetChanged();
            this.listAdapter.notifyDataSetChanged();
            if (this.searchIsVisible) {
                if (this.lastOffset == Integer.MAX_VALUE) {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, -this.searchGridView.getPaddingTop());
                } else {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, this.lastOffset - this.searchGridView.getPaddingTop());
                }
                this.searchAdapter.searchDialogs(this.searchView.editText.getText().toString());
                return;
            }
            if (this.lastOffset == Integer.MAX_VALUE) {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            } else {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            }
        }
    }

    private String getLink() {
        String string;
        SwitchView switchView = this.switchView;
        if (switchView != null) {
            string = this.linkToCopy[switchView.currentTab];
        } else {
            TLRPC.TL_exportedMessageLink tL_exportedMessageLink = this.exportedMessageLink;
            string = tL_exportedMessageLink != null ? tL_exportedMessageLink.link : null;
            if (string == null) {
                string = this.linkToCopy[0];
            }
        }
        CheckBox2 checkBox2 = this.timestampCheckbox;
        if (checkBox2 != null && checkBox2.isChecked()) {
            try {
                string = Uri.parse(string).buildUpon().appendQueryParameter("t", AndroidUtilities.formatTimestamp(this.timestamp)).build().toString();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return string == null ? "" : string;
    }

    public void updateLinkTextView() {
        if (this.linkTextView != null) {
            String link = getLink();
            if (link != null) {
                if (link.startsWith("https://")) {
                    link = link.substring(8);
                } else if (link.startsWith("http://")) {
                    link = link.substring(7);
                }
            }
            this.linkTextView.setText(link);
        }
    }

    public void updateBottomOverlay() {
        AdjustPanLayoutHelper adjustPanLayoutHelper;
        if (this.frameLayout2 == null) {
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        float fDp = 0.0f;
        if (editTextEmoji != null && editTextEmoji.isPopupVisible()) {
            this.keyboardT = this.commentTextView.getEmojiPaddingShown();
        } else {
            SizeNotifierFrameLayout sizeNotifierFrameLayout = this.sizeNotifierFrameLayout;
            if (sizeNotifierFrameLayout != null && (adjustPanLayoutHelper = sizeNotifierFrameLayout.adjustPanLayoutHelper) != null && !adjustPanLayoutHelper.animationInProgress()) {
                this.keyboardT = this.keyboardSize2 > AndroidUtilities.dp(20.0f) ? 1.0f : 0.0f;
            }
        }
        FrameLayout frameLayout = this.timestampFrameLayout;
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
        this.frameLayout2.setTranslationY(f2);
        this.writeButtonContainer.setTranslationY(f2);
    }

    private void onTopicCellClick(TLRPC.TL_forumTopic tL_forumTopic) {
        TLRPC.Dialog dialog;
        if (tL_forumTopic == null || (dialog = this.selectedTopicDialog) == null) {
            return;
        }
        long j = dialog.id;
        boolean zIsMonoForum = MessagesController.getInstance(this.currentAccount).isMonoForum(j);
        TLRPC.Dialog dialog2 = this.selectedTopicDialog;
        this.selectedDialogs.put(j, dialog2);
        this.selectedDialogTopics.put(dialog2, tL_forumTopic);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog2.id)) == null) {
                this.listAdapter.dialogsMap.put(dialog2.id, dialog2);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty() ? 1 : 0, dialog2);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.editText.setText("");
            checkCurrentList(false);
        }
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell.setTopic(tL_forumTopic, zIsMonoForum, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    private void onTopicCreateCellClick() {
        TLRPC.Dialog dialog = this.selectedTopicDialog;
        if (dialog == null) {
            return;
        }
        this.selectedDialogs.put(dialog.id, dialog);
        this.selectedDialogTopics.remove(dialog);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC.Dialog) this.listAdapter.dialogsMap.get(dialog.id)) == null) {
                this.listAdapter.dialogsMap.put(dialog.id, dialog);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty() ? 1 : 0, dialog);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.editText.setText("");
            checkCurrentList(false);
        }
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id) {
                    shareDialogCell.setTopic(null, false, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        this.iBlur3PositionMainTabs.set(0.0f, 0.0f, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }
}

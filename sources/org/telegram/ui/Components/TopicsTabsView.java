package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.ChatListItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.GradientClip;

public abstract class TopicsTabsView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private long animateFromSelectedTopicId;
    private ValueAnimator animator;
    private final boolean bot;
    private final ImageView button;
    private final boolean canShowProgress;
    private final ImageView closeButton;
    private final int currentAccount;
    private long currentTopicId;
    private final long dialogId;
    private final HashSet excludeTopics;
    private final BaseFragment fragment;
    private long lastSelectedTopicId;
    private final boolean mono;
    private boolean notificationsAttached;
    private Utilities.Callback2 onDialogSelected;
    private Runnable onTopicCreated;
    private Utilities.Callback2 onTopicSelected;
    private Boolean pendingSidemenu;
    private final Theme.ResourcesProvider resourcesProvider;
    private final UniversalRecyclerView sideTabs;
    private final FrameLayout sideTabsContainer;
    private final View sideTabsShadowView;
    public boolean sidemenuAnimating;
    public boolean sidemenuEnabled;
    public float sidemenuT;
    private final UniversalRecyclerView topTabs;
    private final BlurredFrameLayout topTabsContainer;
    private final View topTabsShadowView;

    public static void lambda$onTabLongClick$17() {
    }

    public TopicsTabsView(Context context, BaseFragment baseFragment, SizeNotifierFrameLayout sizeNotifierFrameLayout, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.sidemenuT = 0.0f;
        this.excludeTopics = new HashSet();
        this.fragment = baseFragment;
        this.currentAccount = i;
        this.dialogId = j;
        this.resourcesProvider = resourcesProvider;
        long j2 = -j;
        this.mono = ChatObject.isMonoForum(MessagesController.getInstance(i).getChat(Long.valueOf(j2)));
        this.bot = UserObject.isBotForum(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        SharedPreferences preferences = UserConfig.getInstance(i).getPreferences();
        this.canShowProgress = !preferences.getBoolean("topics_end_reached_" + j2, false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        View view = new View(context);
        this.topTabsShadowView = view;
        view.setBackgroundResource(R.drawable.header_shadow);
        addView(view, LayoutHelper.createFrame(-1, 3.0f, 55, 0.0f, 48.0f, 0.0f, 0.0f));
        BlurredFrameLayout blurredFrameLayout = new BlurredFrameLayout(context, sizeNotifierFrameLayout);
        this.topTabsContainer = blurredFrameLayout;
        int i2 = Theme.key_windowBackgroundWhite;
        blurredFrameLayout.setBackgroundColor(Theme.getColor(i2, resourcesProvider));
        addView(blurredFrameLayout, LayoutHelper.createFrame(-1, 48, 55));
        BlurredFrameLayout blurredFrameLayout2 = new BlurredFrameLayout(context, sizeNotifierFrameLayout);
        this.sideTabsContainer = blurredFrameLayout2;
        blurredFrameLayout2.setBackgroundColor(Theme.getColor(i2, resourcesProvider));
        addView(blurredFrameLayout2, LayoutHelper.createFrame(64, -1, 115));
        View view2 = new View(context);
        this.sideTabsShadowView = view2;
        view2.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
        blurredFrameLayout2.addView(view2, LayoutHelper.createFrame(1.0f / AndroidUtilities.density, -1.0f, 117));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                TopicsTabsView.this.fillHorizontalTabs((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                TopicsTabsView.this.onTabClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean onTabLongClick;
                onTabLongClick = TopicsTabsView.this.onTabLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                return Boolean.valueOf(onTabLongClick);
            }
        }, resourcesProvider) {
            private final AnimatedFloat animateTab;
            private final AnimatedFloat animatedClip;
            private final GradientClip clip = new GradientClip();
            private final Paint linePaint;
            private final RectF lineRect;
            private Drawable pinIcon;
            private int pinIconColor;
            private final Paint pinnedBackgroundPaint;

            {
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedClip = new AnimatedFloat(this, 320L, cubicBezierInterpolator);
                this.lineRect = new RectF();
                this.linePaint = new Paint(1);
                this.animateTab = new AnimatedFloat(this, 420L, cubicBezierInterpolator);
                this.pinnedBackgroundPaint = new Paint(1);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                float f = this.animatedClip.set(canScrollHorizontally(-1));
                if (f > 0.0f) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                }
                drawPinnedBackground(canvas);
                super.dispatchDraw(canvas);
                if (TopicsTabsView.this.lastSelectedTopicId != TopicsTabsView.this.currentTopicId) {
                    TopicsTabsView topicsTabsView = TopicsTabsView.this;
                    topicsTabsView.animateFromSelectedTopicId = topicsTabsView.lastSelectedTopicId;
                    this.animateTab.force(0.0f);
                }
                TopicsTabsView topicsTabsView2 = TopicsTabsView.this;
                topicsTabsView2.lastSelectedTopicId = topicsTabsView2.currentTopicId;
                HorizontalTabView horizontalTabView = null;
                HorizontalTabView horizontalTabView2 = null;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt instanceof HorizontalTabView) {
                        HorizontalTabView horizontalTabView3 = (HorizontalTabView) childAt;
                        if (horizontalTabView3.getTopicId() == TopicsTabsView.this.currentTopicId) {
                            horizontalTabView = horizontalTabView3;
                        }
                        if (horizontalTabView3.getTopicId() == TopicsTabsView.this.animateFromSelectedTopicId) {
                            horizontalTabView2 = horizontalTabView3;
                        }
                    }
                }
                if (horizontalTabView != null) {
                    this.lineRect.set(horizontalTabView.getX() + AndroidUtilities.dp(6.0f), getHeight() - AndroidUtilities.dp(3.0f), (horizontalTabView.getX() + horizontalTabView.getWidth()) - AndroidUtilities.dp(6.0f), horizontalTabView.getY() + getHeight() + AndroidUtilities.dp(3.0f));
                    if (horizontalTabView2 != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(horizontalTabView2.getX() + AndroidUtilities.dp(6.0f), getHeight() - AndroidUtilities.dp(3.0f), (horizontalTabView2.getX() + horizontalTabView2.getWidth()) - AndroidUtilities.dp(6.0f), horizontalTabView2.getY() + getHeight() + AndroidUtilities.dp(3.0f));
                        AndroidUtilities.lerp(rectF, this.lineRect, this.animateTab.set(1.0f), this.lineRect);
                    }
                    this.linePaint.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                    canvas.drawRoundRect(this.lineRect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.linePaint);
                }
                if (f > 0.0f) {
                    canvas.save();
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                    this.clip.draw(canvas, rectF2, 0, f);
                    canvas.restore();
                    canvas.restore();
                }
            }

            private void drawPinnedBackground(Canvas canvas) {
                float width = getWidth();
                float f = 0.0f;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt instanceof HorizontalTabView) {
                        HorizontalTabView horizontalTabView = (HorizontalTabView) childAt;
                        if (horizontalTabView.pinned) {
                            if (width > horizontalTabView.getX()) {
                                width = horizontalTabView.getX();
                                getChildAdapterPosition(horizontalTabView);
                            }
                            if (f < horizontalTabView.getX() + horizontalTabView.getWidth()) {
                                f = horizontalTabView.getX() + horizontalTabView.getWidth();
                                getChildAdapterPosition(horizontalTabView);
                            }
                        }
                    }
                }
                if (f > width) {
                    this.pinnedBackgroundPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(width, (getHeight() - AndroidUtilities.dp(38.0f)) / 2.0f, f, (getHeight() + AndroidUtilities.dp(38.0f)) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.pinnedBackgroundPaint);
                    if (this.pinIcon == null) {
                        this.pinIcon = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
                    }
                    int color = Theme.getColor(Theme.key_chats_pinnedIcon, this.resourcesProvider);
                    if (this.pinIconColor != color) {
                        Drawable drawable = this.pinIcon;
                        this.pinIconColor = color;
                        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    }
                    this.pinIcon.setBounds((int) (AndroidUtilities.dp(4.0f) + width), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (width + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
                    this.pinIcon.draw(canvas);
                }
            }

            @Override
            public Integer getSelectorColor(int i3) {
                return 0;
            }
        };
        this.topTabs = universalRecyclerView;
        universalRecyclerView.listenReorder(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                TopicsTabsView.this.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        universalRecyclerView.setWillNotDraw(false);
        universalRecyclerView.adapter.setApplyBackground(false);
        universalRecyclerView.makeHorizontal();
        blurredFrameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f, 119, 64.0f, 0.0f, 0.0f, 0.0f));
        universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                if (TopicsTabsView.this.isLoadingVisible()) {
                    TopicsTabsView.this.loadMore();
                }
            }
        });
        UniversalRecyclerView universalRecyclerView2 = new UniversalRecyclerView(context, i, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                TopicsTabsView.this.fillVerticalTabs((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                TopicsTabsView.this.onTabClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean onTabLongClick;
                onTabLongClick = TopicsTabsView.this.onTabLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                return Boolean.valueOf(onTabLongClick);
            }
        }, resourcesProvider) {
            private Drawable pinIcon;
            private int pinIconColor;
            private final GradientClip clip = new GradientClip();
            private final AnimatedFloat animatedClip = new AnimatedFloat(this, 320, CubicBezierInterpolator.EASE_OUT_QUINT);
            private final Paint pinnedBackgroundPaint = new Paint(1);

            @Override
            public void dispatchDraw(Canvas canvas) {
                float f = this.animatedClip.set(canScrollVertically(-1));
                if (f > 0.0f) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                }
                drawPinnedBackground(canvas);
                super.dispatchDraw(canvas);
                if (f > 0.0f) {
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
                    this.clip.draw(canvas, rectF, 1, f);
                    canvas.restore();
                    canvas.restore();
                }
            }

            private void drawPinnedBackground(Canvas canvas) {
                float height = getHeight();
                float f = 0.0f;
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt instanceof VerticalTabView) {
                        VerticalTabView verticalTabView = (VerticalTabView) childAt;
                        if (verticalTabView.pinned) {
                            if (height > verticalTabView.getY()) {
                                height = verticalTabView.getY();
                                getChildAdapterPosition(verticalTabView);
                            }
                            if (f < verticalTabView.getY() + verticalTabView.getHeight()) {
                                f = verticalTabView.getY() + verticalTabView.getHeight();
                                getChildAdapterPosition(verticalTabView);
                            }
                        }
                    }
                }
                if (f > height) {
                    this.pinnedBackgroundPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (getWidth() + AndroidUtilities.dp(56.0f)) / 2.0f, f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.pinnedBackgroundPaint);
                    if (this.pinIcon == null) {
                        this.pinIcon = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
                    }
                    int color = Theme.getColor(Theme.key_chats_pinnedIcon, this.resourcesProvider);
                    if (this.pinIconColor != color) {
                        Drawable drawable = this.pinIcon;
                        this.pinIconColor = color;
                        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    }
                    this.pinIcon.setBounds((int) (rectF.left + AndroidUtilities.dp(4.0f)), (int) (rectF.top + AndroidUtilities.dp(2.66f)), (int) (rectF.left + AndroidUtilities.dp(13.66f)), (int) (rectF.top + AndroidUtilities.dp(12.32f)));
                    this.pinIcon.draw(canvas);
                }
            }
        };
        this.sideTabs = universalRecyclerView2;
        universalRecyclerView2.listenReorder(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                TopicsTabsView.this.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        universalRecyclerView2.adapter.setApplyBackground(false);
        universalRecyclerView2.setClipToPadding(false);
        universalRecyclerView2.setClipChildren(false);
        universalRecyclerView2.setPadding(0, 0, 0, 0);
        blurredFrameLayout2.addView(universalRecyclerView2, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 48.0f, 0.0f, 0.0f));
        universalRecyclerView2.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                if (TopicsTabsView.this.isLoadingVisible()) {
                    TopicsTabsView.this.loadMore();
                }
            }
        });
        ImageView imageView = new ImageView(context);
        this.button = imageView;
        imageView.setImageResource(R.drawable.menu_sidebar);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, LayoutHelper.createFrame(64, 48, 51));
        ScaleStateListAnimator.apply(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                TopicsTabsView.this.lambda$new$0(view3);
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.closeButton = imageView2;
        imageView2.setImageResource(R.drawable.msg_select);
        imageView2.setScaleType(scaleType);
        addView(imageView2, LayoutHelper.createFrame(64, 48, 51));
        ScaleStateListAnimator.apply(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                TopicsTabsView.this.lambda$new$1(view3);
            }
        });
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.4f);
        imageView2.setScaleY(0.4f);
        imageView2.setVisibility(8);
        MessagesController.getInstance(i).getTopicsController().loadTopics(j2, false, 3);
        if (MessagesController.getInstance(i).getMainSettings().getBoolean("topicssidetabs" + j, false)) {
            this.sidemenuT = 1.0f;
            this.sidemenuEnabled = true;
        }
        updateSidemenuPosition();
        updateTabs();
    }

    public void lambda$new$0(View view) {
        Boolean bool = this.pendingSidemenu;
        animateSidemenuTo(bool == null ? !this.sidemenuEnabled : !bool.booleanValue());
    }

    public void lambda$new$1(View view) {
        this.sideTabs.allowReorder(false);
        this.topTabs.allowReorder(false);
        animateButton(false);
        AndroidUtilities.updateVisibleRows(this.sideTabs);
        AndroidUtilities.updateVisibleRows(this.topTabs);
    }

    private void animateButton(boolean z) {
        if (z) {
            this.closeButton.setVisibility(0);
            ViewPropertyAnimator scaleY = this.closeButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            scaleY.setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
            this.button.setVisibility(0);
            this.button.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setInterpolator(cubicBezierInterpolator).setDuration(320L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    TopicsTabsView.this.lambda$animateButton$2();
                }
            }).start();
            return;
        }
        this.button.setVisibility(0);
        ViewPropertyAnimator scaleY2 = this.button.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f);
        CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
        scaleY2.setInterpolator(cubicBezierInterpolator2).setDuration(320L).start();
        this.closeButton.setVisibility(0);
        this.closeButton.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setInterpolator(cubicBezierInterpolator2).setDuration(320L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.this.lambda$animateButton$3();
            }
        }).start();
    }

    public void lambda$animateButton$2() {
        this.button.setVisibility(8);
    }

    public void lambda$animateButton$3() {
        this.closeButton.setVisibility(8);
    }

    public void setBottomMargin(int i) {
        this.sideTabs.setPadding(0, 0, 0, i);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void updateSidemenuPosition() {
        this.topTabsContainer.setTranslationY((-AndroidUtilities.dp(48.0f)) * this.sidemenuT);
        this.topTabsContainer.setAlpha(AndroidUtilities.lerp(1.0f, 0.85f, this.sidemenuT));
        this.topTabsContainer.setVisibility(this.sidemenuT >= 1.0f ? 8 : 0);
        this.topTabsShadowView.setTranslationY((-AndroidUtilities.dp(51.0f)) * this.sidemenuT);
        this.topTabsShadowView.setAlpha(1.0f - this.sidemenuT);
        this.topTabsShadowView.setVisibility(this.sidemenuT >= 1.0f ? 8 : 0);
        this.sideTabsContainer.setTranslationX((-AndroidUtilities.dp(64.0f)) * (1.0f - this.sidemenuT));
        this.sideTabsContainer.setVisibility(this.sidemenuT <= 0.0f ? 8 : 0);
        this.sideTabsShadowView.setVisibility(this.sidemenuT <= 0.0f ? 8 : 0);
        ImageView imageView = this.button;
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider);
        int i = Theme.key_featuredStickers_addButton;
        int blendARGB = ColorUtils.blendARGB(color, Theme.getColor(i, this.resourcesProvider), this.sidemenuT);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(blendARGB, mode));
        this.closeButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), mode));
    }

    public void animateSidemenuTo(boolean z) {
        if (this.sidemenuEnabled == z) {
            return;
        }
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            if (this.sidemenuAnimating) {
                this.pendingSidemenu = Boolean.valueOf(z);
                return;
            }
        }
        this.sidemenuEnabled = z;
        this.sidemenuAnimating = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.sidemenuT, z ? 1.0f : 0.0f);
        this.animator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TopicsTabsView.this.lambda$animateSidemenuTo$4(valueAnimator2);
            }
        });
        this.animator.addListener(new AnonymousClass5(z));
        this.animator.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
        this.animator.setDuration(250L);
        this.animator.start();
    }

    public void lambda$animateSidemenuTo$4(ValueAnimator valueAnimator) {
        this.sidemenuT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateSidemenuPosition();
    }

    public class AnonymousClass5 extends AnimatorListenerAdapter {
        final boolean val$side;

        AnonymousClass5(boolean z) {
            this.val$side = z;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (TopicsTabsView.this.animator == animator) {
                TopicsTabsView topicsTabsView = TopicsTabsView.this;
                topicsTabsView.sidemenuT = this.val$side ? 1.0f : 0.0f;
                topicsTabsView.updateSidemenuPosition();
                TopicsTabsView topicsTabsView2 = TopicsTabsView.this;
                topicsTabsView2.sidemenuAnimating = false;
                topicsTabsView2.animator = null;
                MessagesController.getInstance(TopicsTabsView.this.currentAccount).getMainSettings().edit().putBoolean("topicssidetabs" + TopicsTabsView.this.dialogId, TopicsTabsView.this.sidemenuEnabled).apply();
                if (TopicsTabsView.this.pendingSidemenu != null && this.val$side != TopicsTabsView.this.pendingSidemenu.booleanValue()) {
                    boolean booleanValue = TopicsTabsView.this.pendingSidemenu.booleanValue();
                    TopicsTabsView.this.pendingSidemenu = null;
                    TopicsTabsView.this.animateSidemenuTo(booleanValue);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.AnonymousClass5.this.lambda$onAnimationEnd$0();
                    }
                });
            }
        }

        public void lambda$onAnimationEnd$0() {
            if (TopicsTabsView.this.isLoadingVisible()) {
                TopicsTabsView.this.loadMore();
            }
        }
    }

    private void updateTabs() {
        boolean canScrollHorizontally = this.topTabs.canScrollHorizontally(-1);
        this.topTabs.adapter.update(true);
        if (!canScrollHorizontally) {
            this.topTabs.scrollToPosition(0);
        }
        boolean canScrollVertically = this.sideTabs.canScrollVertically(-1);
        this.sideTabs.adapter.update(true);
        if (!canScrollVertically) {
            this.sideTabs.scrollToPosition(0);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.this.lambda$updateTabs$5();
            }
        });
    }

    public void lambda$updateTabs$5() {
        if (isLoadingVisible()) {
            loadMore();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.topicsDidLoaded) {
            if (((Long) objArr[0]).longValue() != (-this.dialogId)) {
                return;
            }
            updateTabs();
        } else {
            if (i != NotificationCenter.updateInterfaces || (((Integer) objArr[0]).intValue() & MessagesController.UPDATE_MASK_SELECT_DIALOG) <= 0) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).getTopicsController().sortTopics(-this.dialogId, false);
            updateTabs();
        }
    }

    public void whenReordered(int i, ArrayList arrayList) {
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(Integer.valueOf(((UItem) arrayList.get(i2)).id));
        }
        topicsController.reorderPinnedTopics(-this.dialogId, arrayList2);
        topicsController.sortTopics(-this.dialogId, false);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
    }

    private void setAttached(boolean z) {
        if (this.notificationsAttached == z) {
            return;
        }
        this.notificationsAttached = z;
        if (z) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
            MessagesController.getInstance(this.currentAccount).getTopicsController().onTopicFragmentResume(-this.dialogId);
        } else {
            MessagesController.getInstance(this.currentAccount).getTopicsController().onTopicFragmentPause(-this.dialogId);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        }
    }

    public void fillVerticalTabs(ArrayList arrayList, UniversalAdapter universalAdapter) {
        boolean z;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(-this.dialogId);
        arrayList.add(VerticalTabView.Factory.asAll(this.bot, this.mono).setChecked(this.currentTopicId == 0));
        if (topics != null) {
            Iterator<TLRPC.TL_forumTopic> it = topics.iterator();
            z = false;
            while (it.hasNext()) {
                TLRPC.TL_forumTopic next = it.next();
                if (!this.bot || next.id != 1) {
                    if (!this.excludeTopics.contains(Integer.valueOf(next.id))) {
                        boolean z2 = next.pinned;
                        if (!z2 && z) {
                            universalAdapter.reorderSectionEnd();
                            z = false;
                        } else if (z2 && !z) {
                            universalAdapter.reorderSectionStart();
                            z = true;
                        }
                        arrayList.add(VerticalTabView.Factory.asTab(this.dialogId, next, this.mono).setChecked(this.currentTopicId == getTopicId(next)));
                    }
                }
            }
        } else {
            z = false;
        }
        if (z) {
            universalAdapter.reorderSectionEnd();
        }
        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(-this.dialogId) && this.canShowProgress) {
            arrayList.add(VerticalTabView.Factory.asLoading(-2));
            arrayList.add(VerticalTabView.Factory.asLoading(-3));
            arrayList.add(VerticalTabView.Factory.asLoading(-4));
        }
        if (this.bot || this.mono || !ChatObject.canCreateTopic(chat)) {
            return;
        }
        arrayList.add(VerticalTabView.Factory.asAdd(false));
    }

    public void fillHorizontalTabs(ArrayList arrayList, UniversalAdapter universalAdapter) {
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(-this.dialogId);
        boolean z = false;
        arrayList.add(HorizontalTabView.Factory.asAll(this.bot, this.mono).setChecked(this.currentTopicId == 0));
        if (topics != null) {
            Iterator<TLRPC.TL_forumTopic> it = topics.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                TLRPC.TL_forumTopic next = it.next();
                if (!this.bot || next.id != 1) {
                    if (!this.excludeTopics.contains(Integer.valueOf(next.id))) {
                        boolean z3 = next.pinned;
                        if (!z3 && z2) {
                            universalAdapter.reorderSectionEnd();
                            z2 = false;
                        } else if (z3 && !z2) {
                            universalAdapter.reorderSectionStart();
                            z2 = true;
                        }
                        arrayList.add(HorizontalTabView.Factory.asTab(this.dialogId, next, this.mono).setChecked(this.currentTopicId == getTopicId(next)));
                    }
                }
            }
            z = z2;
        }
        if (z) {
            universalAdapter.reorderSectionEnd();
        }
        if (topics != null && !topics.isEmpty() && !topicsController.endIsReached(-this.dialogId) && this.canShowProgress) {
            arrayList.add(HorizontalTabView.Factory.asLoading(-2));
            arrayList.add(HorizontalTabView.Factory.asLoading(-3));
            arrayList.add(HorizontalTabView.Factory.asLoading(-4));
        }
        if (this.bot || this.mono || !ChatObject.canCreateTopic(chat)) {
            return;
        }
        arrayList.add(HorizontalTabView.Factory.asAdd());
    }

    public boolean isLoadingVisible() {
        if (this.sidemenuT > 0.5f) {
            for (int i = 0; i < this.sideTabs.getChildCount(); i++) {
                UItem item = this.sideTabs.adapter.getItem(this.sideTabs.getChildAdapterPosition(this.sideTabs.getChildAt(i)));
                if (item != null && item.red) {
                    return true;
                }
            }
        } else {
            for (int i2 = 0; i2 < this.topTabs.getChildCount(); i2++) {
                UItem item2 = this.topTabs.adapter.getItem(this.topTabs.getChildAdapterPosition(this.topTabs.getChildAt(i2)));
                if (item2 != null && item2.red) {
                    return true;
                }
            }
        }
        return false;
    }

    public void loadMore() {
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        if (topicsController.endIsReached(-this.dialogId)) {
            return;
        }
        topicsController.loadTopics(-this.dialogId);
    }

    public void onTabClick(UItem uItem, View view, int i, float f, float f2) {
        if (this.mono) {
            Utilities.Callback2 callback2 = this.onDialogSelected;
            if (callback2 != null) {
                callback2.run(Long.valueOf(uItem.longValue), Boolean.FALSE);
                return;
            }
            return;
        }
        if (uItem.longValue == -2) {
            Runnable runnable = this.onTopicCreated;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.onTopicSelected;
        if (callback22 != null) {
            callback22.run(Integer.valueOf(uItem.id), Boolean.FALSE);
        }
    }

    public boolean onTabLongClick(UItem uItem, View view, int i, float f, float f2) {
        final ItemOptions itemOptions;
        final long j;
        final TLRPC.Chat chat;
        final TLRPC.User user;
        if (this.sideTabs.isReorderAllowed() || this.topTabs.isReorderAllowed()) {
            return false;
        }
        Object obj = uItem.object;
        if (!(obj instanceof TLRPC.TL_forumTopic)) {
            return false;
        }
        final TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj;
        final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        long j2 = this.dialogId;
        TLRPC.Chat chat2 = j2 < 0 ? messagesController.getChat(Long.valueOf(-j2)) : null;
        long j3 = this.dialogId;
        TLRPC.User user2 = j3 > 0 ? messagesController.getUser(Long.valueOf(j3)) : null;
        final ItemOptions makeOptions = ItemOptions.makeOptions(this.fragment, view, true);
        if (ChatObject.isMonoForum(chat2)) {
            final long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                return false;
            }
            itemOptions = makeOptions;
            final TLRPC.Chat chat3 = chat2;
            itemOptions.add(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new Runnable() {
                @Override
                public final void run() {
                    TopicsTabsView.this.lambda$onTabLongClick$7(makeOptions, peerDialogId, chat3);
                }
            });
            long j4 = chat2.id;
            if (ChatObject.isMonoForum(chat2) && ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                long j5 = chat2.linked_monoforum_id;
                if (j5 != 0) {
                    j = j5;
                    chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
                    user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (user != null && ChatObject.canBlockUsers(chat)) {
                        itemOptions.add(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), (Runnable) null);
                        final ActionBarMenuSubItem last = itemOptions.getLast();
                        last.setVisibility(8);
                        MessagesController.getInstance(this.currentAccount).checkIsInChat(true, chat, user, new MessagesController.IsInChatCheckedCallback() {
                            @Override
                            public final void run(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
                                TopicsTabsView.this.lambda$onTabLongClick$12(last, itemOptions, j, user, chat, z, tL_chatAdminRights, str);
                            }
                        });
                    }
                }
            }
            j = j4;
            chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                itemOptions.add(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), (Runnable) null);
                final ActionBarMenuSubItem last2 = itemOptions.getLast();
                last2.setVisibility(8);
                MessagesController.getInstance(this.currentAccount).checkIsInChat(true, chat, user, new MessagesController.IsInChatCheckedCallback() {
                    @Override
                    public final void run(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
                        TopicsTabsView.this.lambda$onTabLongClick$12(last2, itemOptions, j, user, chat, z, tL_chatAdminRights, str);
                    }
                });
            }
        } else {
            itemOptions = makeOptions;
            if (ChatObject.canManageTopics(chat2) || UserObject.isBotForum(user2)) {
                boolean z = tL_forumTopic.pinned;
                itemOptions.add(z ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z ? R.string.DialogUnpin : R.string.DialogPin), new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.this.lambda$onTabLongClick$13(itemOptions, messagesController, tL_forumTopic);
                    }
                });
                if (tL_forumTopic.pinned) {
                    itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new Runnable() {
                        @Override
                        public final void run() {
                            TopicsTabsView.this.lambda$onTabLongClick$14();
                        }
                    });
                }
            }
            final ItemOptions addAsItemOptions = ChatNotificationsPopupWrapper.addAsItemOptions(this.fragment, itemOptions, this.dialogId, tL_forumTopic.id);
            boolean isDialogMuted = messagesController.isDialogMuted(this.dialogId, tL_forumTopic.id);
            itemOptions.add(isDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute, LocaleController.getString(isDialogMuted ? R.string.Unmute : R.string.Mute), new Runnable() {
                @Override
                public final void run() {
                    TopicsTabsView.this.lambda$onTabLongClick$15(messagesController, tL_forumTopic, itemOptions, addAsItemOptions);
                }
            });
            if (ChatObject.canManageTopic(this.currentAccount, chat2, tL_forumTopic) && !UserObject.isBotForum(user2)) {
                boolean z2 = tL_forumTopic.closed;
                itemOptions.add(z2 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, LocaleController.getString(z2 ? R.string.RestartTopic : R.string.CloseTopic), new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.this.lambda$onTabLongClick$16(itemOptions, tL_forumTopic);
                    }
                });
            }
            if (ChatObject.canDeleteTopic(this.currentAccount, chat2, tL_forumTopic)) {
                itemOptions.add(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.this.lambda$onTabLongClick$18(itemOptions, tL_forumTopic);
                    }
                });
            }
        }
        if (view instanceof HorizontalTabView) {
            itemOptions.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), 0, 0, Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
            itemOptions.translate(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            itemOptions.setScrimViewBackground(Theme.createRoundRectDrawable(0, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), 0, Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
        }
        itemOptions.show();
        return true;
    }

    public void lambda$onTabLongClick$7(ItemOptions itemOptions, final long j, TLRPC.Chat chat) {
        itemOptions.dismiss();
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        if (user != null) {
            AlertsCreator.createClearDaysDialogAlert(this.fragment, -1, user, chat, true, new MessagesStorage.BooleanCallback() {
                @Override
                public final void run(boolean z) {
                    TopicsTabsView.this.lambda$onTabLongClick$6(j, z);
                }
            }, this.fragment.getResourceProvider());
        }
    }

    public void lambda$onTabLongClick$6(long j, boolean z) {
        BaseFragment baseFragment = this.fragment;
        if (baseFragment instanceof ChatActivity) {
            ((ChatActivity) baseFragment).performHistoryClear(j, false, true);
        }
    }

    public void lambda$onTabLongClick$12(final ActionBarMenuSubItem actionBarMenuSubItem, final ItemOptions itemOptions, final long j, final TLRPC.User user, final TLRPC.Chat chat, final boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.this.lambda$onTabLongClick$11(z, actionBarMenuSubItem, itemOptions, j, user, chat);
            }
        });
    }

    public void lambda$onTabLongClick$11(boolean z, ActionBarMenuSubItem actionBarMenuSubItem, final ItemOptions itemOptions, final long j, final TLRPC.User user, final TLRPC.Chat chat) {
        final boolean z2 = !z;
        actionBarMenuSubItem.setVisibility(0);
        actionBarMenuSubItem.setText(LocaleController.getString(!z ? R.string.UnbanUserMonoforum : R.string.BanUserMonoforum));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TopicsTabsView.this.lambda$onTabLongClick$10(itemOptions, z2, j, user, chat, view);
            }
        });
    }

    public void lambda$onTabLongClick$10(ItemOptions itemOptions, boolean z, long j, TLRPC.User user, TLRPC.Chat chat, View view) {
        itemOptions.dismiss();
        if (!z) {
            MessagesController.getInstance(this.currentAccount).deleteParticipantFromChat(j, user, (TLRPC.Chat) null, false, false);
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = MessagesController.getInputPeer(user);
        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TopicsTabsView.this.lambda$onTabLongClick$9(tLObject, tL_error);
            }
        });
    }

    public void lambda$onTabLongClick$9(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            if (updates.chats.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TopicsTabsView.this.lambda$onTabLongClick$8(updates);
                }
            }, 1000L);
        }
    }

    public void lambda$onTabLongClick$8(TLRPC.Updates updates) {
        MessagesController.getInstance(this.currentAccount).loadFullChat(updates.chats.get(0).id, 0, true);
    }

    public void lambda$onTabLongClick$13(ItemOptions itemOptions, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        itemOptions.dismiss();
        messagesController.getTopicsController().pinTopic(-this.dialogId, tL_forumTopic.id, !tL_forumTopic.pinned, this.fragment);
    }

    public void lambda$onTabLongClick$14() {
        this.sideTabs.allowReorder(true);
        this.topTabs.allowReorder(true);
        animateButton(true);
        AndroidUtilities.updateVisibleRows(this.topTabs);
        AndroidUtilities.updateVisibleRows(this.sideTabs);
    }

    public void lambda$onTabLongClick$15(MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic, ItemOptions itemOptions, ItemOptions itemOptions2) {
        if (messagesController.isDialogMuted(this.dialogId, tL_forumTopic.id)) {
            itemOptions.dismiss();
            NotificationsController.getInstance(this.currentAccount).muteDialog(this.dialogId, tL_forumTopic.id, false);
            if (BulletinFactory.canShowBulletin(this.fragment)) {
                BulletinFactory.createMuteBulletin(this.fragment, 4, 0, this.resourcesProvider).show();
                return;
            }
            return;
        }
        itemOptions.openSwipeback(itemOptions2);
    }

    public void lambda$onTabLongClick$16(ItemOptions itemOptions, TLRPC.TL_forumTopic tL_forumTopic) {
        itemOptions.dismiss();
        MessagesController.getInstance(this.currentAccount).getTopicsController().toggleCloseTopic(-this.dialogId, tL_forumTopic.id, !tL_forumTopic.closed);
    }

    public void lambda$onTabLongClick$18(ItemOptions itemOptions, TLRPC.TL_forumTopic tL_forumTopic) {
        itemOptions.dismiss();
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(tL_forumTopic.id));
        deleteTopics(hashSet, new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.lambda$onTabLongClick$17();
            }
        });
    }

    public TLRPC.TL_forumTopic getTopic(long j) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-this.dialogId);
        if (topics == null) {
            return null;
        }
        Iterator<TLRPC.TL_forumTopic> it = topics.iterator();
        while (it.hasNext()) {
            TLRPC.TL_forumTopic next = it.next();
            if (next.id == j) {
                return next;
            }
        }
        return null;
    }

    public void setCurrentTopic(long j) {
        this.currentTopicId = j;
        this.topTabs.adapter.update(true);
        this.topTabs.invalidate();
        this.sideTabs.adapter.update(true);
    }

    public void setOnTopicSelected(Utilities.Callback2<Integer, Boolean> callback2) {
        this.onTopicSelected = callback2;
    }

    public void setOnNewTopicSelected(Runnable runnable) {
        this.onTopicCreated = runnable;
    }

    public void selectTopic(long j, boolean z) {
        if (this.mono) {
            Utilities.Callback2 callback2 = this.onDialogSelected;
            if (callback2 != null) {
                callback2.run(Long.valueOf(j), Boolean.valueOf(z));
                return;
            }
            return;
        }
        Utilities.Callback2 callback22 = this.onTopicSelected;
        if (callback22 != null) {
            callback22.run(Integer.valueOf((int) j), Boolean.valueOf(z));
        }
    }

    public void setOnDialogSelected(Utilities.Callback2<Long, Boolean> callback2) {
        this.onDialogSelected = callback2;
    }

    public static class VerticalTabView extends FrameLayout {
        private final AvatarDrawable avatarDrawable;
        private float countScale;
        private ValueAnimator counterAnimator;
        private int counterBackgroundColorKey;
        private final AnimatedTextView.AnimatedTextDrawable counterText;
        private final int currentAccount;
        private final FrameLayout imageLayoutView;
        private final BackupImageView imageView;
        private final FrameLayout.LayoutParams imageViewParams;
        private boolean isAdd;
        private boolean lastMention;
        private boolean lastReactions;
        private int lastUnread;
        private final LinearLayout layout;
        private final View lineView;
        private LoadingDrawable loadingDrawable;
        private CharSequence mentionString;
        private boolean mono;
        private boolean pinned;
        private CharSequence reactionString;
        private boolean reorder;
        private final Theme.ResourcesProvider resourcesProvider;
        private ValueAnimator selectAnimator;
        private float selectT;
        private boolean selected;
        private Shaker shaker;
        private boolean staticImage;
        private final TextView textView;
        private long topicId;

        public void setReorder(boolean z) {
            this.reorder = z;
            this.layout.invalidate();
        }

        public VerticalTabView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.mono = false;
            this.pinned = false;
            this.counterBackgroundColorKey = Theme.key_chats_unreadCounter;
            this.countScale = 1.0f;
            this.topicId = 0L;
            this.isAdd = false;
            this.staticImage = false;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            LinearLayout linearLayout = new LinearLayout(context) {
                private final AnimatedFloat shakeAlpha = new AnimatedFloat(this, 360, CubicBezierInterpolator.EASE_OUT_QUINT);

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    canvas.save();
                    float f = this.shakeAlpha.set(VerticalTabView.this.reorder);
                    if (f > 0.0f) {
                        if (VerticalTabView.this.shaker == null) {
                            VerticalTabView.this.shaker = new Shaker(this);
                        }
                        canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                        VerticalTabView.this.shaker.concat(canvas, f);
                        canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                    }
                    super.dispatchDraw(canvas);
                    canvas.restore();
                }
            };
            this.layout = linearLayout;
            linearLayout.setWillNotDraw(false);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 119, 1.0f, 0.0f, 0.0f, 0.0f));
            ScaleStateListAnimator.apply(linearLayout);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.counterText = animatedTextDrawable;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setTextColor(Theme.getColor(Theme.key_chats_unreadCounterText, resourcesProvider));
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(context, resourcesProvider) {
                private final AnimatedPaint backgroundPaint;
                private final Paint clipPaint;
                final Theme.ResourcesProvider val$resourcesProvider;

                {
                    this.val$resourcesProvider = resourcesProvider;
                    Paint paint = new Paint(1);
                    this.clipPaint = paint;
                    this.backgroundPaint = new AnimatedPaint(this, resourcesProvider);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    VerticalTabView.this.counterText.setCallback(this);
                }

                @Override
                protected boolean verifyDrawable(Drawable drawable) {
                    return VerticalTabView.this.counterText == drawable || super.verifyDrawable(drawable);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    float f;
                    float f2;
                    float f3;
                    float f4;
                    float isNotEmpty = VerticalTabView.this.counterText.isNotEmpty();
                    boolean z = isNotEmpty > 0.0f;
                    float lerp = AndroidUtilities.lerp(0.5f, 1.0f, isNotEmpty) * VerticalTabView.this.countScale;
                    float dp = AndroidUtilities.dp(10.0f);
                    float dp2 = AndroidUtilities.dp(8.33f);
                    float width = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                    float dp3 = AndroidUtilities.dp(12.0f);
                    float max = Math.max(dp2 + dp2, VerticalTabView.this.counterText.getCurrentWidth() + AndroidUtilities.dp(10.0f));
                    if (z) {
                        f = dp3;
                        f2 = width;
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    } else {
                        f = dp3;
                        f2 = width;
                    }
                    super.dispatchDraw(canvas);
                    if (z) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f5 = max / 2.0f;
                        f4 = f2;
                        f3 = f;
                        rectF.set((f4 - f5) - AndroidUtilities.dp(1.33f), f3 - dp, f5 + f4 + AndroidUtilities.dp(1.33f), f3 + dp);
                        AndroidUtilities.scaleRect(rectF, isNotEmpty);
                        float f6 = dp * isNotEmpty;
                        canvas.drawRoundRect(rectF, f6, f6, this.clipPaint);
                        canvas.restore();
                    } else {
                        f3 = f;
                        f4 = f2;
                    }
                    if (isNotEmpty > 0.0f) {
                        canvas.save();
                        canvas.scale(lerp, lerp, f4, f3);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f7 = max / 2.0f;
                        rectF2.set(f4 - f7, f3 - dp2, f4 + f7, f3 + dp2);
                        canvas.drawRoundRect(rectF2, dp2, dp2, this.backgroundPaint.setByKey(VerticalTabView.this.counterBackgroundColorKey, isNotEmpty));
                        VerticalTabView.this.counterText.setBounds(rectF2);
                        VerticalTabView.this.counterText.setAlpha((int) (isNotEmpty * 255.0f));
                        VerticalTabView.this.counterText.draw(canvas);
                        canvas.restore();
                    }
                }
            };
            this.imageLayoutView = frameLayout;
            frameLayout.setWillNotDraw(false);
            frameLayout.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(34, 34, 17);
            this.imageViewParams = createFrame;
            frameLayout.addView(backupImageView, createFrame);
            this.avatarDrawable = new AvatarDrawable();
            TextView textView = new TextView(context);
            this.textView = textView;
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider);
            int i2 = Theme.key_featuredStickers_addButton;
            textView.setTextColor(ColorUtils.blendARGB(color, Theme.getColor(i2, resourcesProvider), this.selectT));
            textView.setTextSize(1, 10.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(3);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 4, 0, 4, 0));
            linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
            View imageView = new ImageView(context);
            this.lineView = imageView;
            imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(2.33f), Theme.getColor(i2, resourcesProvider)));
            addView(imageView, LayoutHelper.createFrame(6, -1.0f, 115, -3.0f, 3.0f, 0.0f, 3.0f));
            imageView.setTranslationX(-AndroidUtilities.dp(3.0f));
            imageView.setVisibility(8);
        }

        private void setLayout(boolean z) {
            if (this.mono == z) {
                return;
            }
            this.mono = z;
            this.imageView.setRoundRadius(AndroidUtilities.dp(z ? 36.0f : 3.0f));
            this.imageLayoutView.setPadding(0, AndroidUtilities.dp(z ? 7.0f : 4.0f), 0, 0);
            this.imageViewParams.width = z ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
            this.imageViewParams.height = z ? AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(30.0f);
        }

        private void setPinned(boolean z, boolean z2) {
            if (this.pinned != z) {
                this.pinned = z;
            }
        }

        private void setCounter(boolean z, int i, boolean z2, boolean z3, boolean z4) {
            if (z3) {
                this.counterBackgroundColorKey = Theme.key_dialogReactionMentionBackground;
                if (this.reactionString == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.reactionchatslist);
                    coloredImageSpan.setScale(0.8f, 0.8f);
                    coloredImageSpan.spaceScaleX = 0.5f;
                    coloredImageSpan.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, spannableStringBuilder.length(), 33);
                    this.reactionString = spannableStringBuilder;
                }
                this.counterText.setText(this.reactionString, z4);
            } else if (z2) {
                this.counterBackgroundColorKey = z ? Theme.key_chats_unreadCounterMuted : Theme.key_chats_unreadCounter;
                if (this.mentionString == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mentionchatslist);
                    coloredImageSpan2.setScale(0.8f, 0.8f);
                    coloredImageSpan2.spaceScaleX = 0.5f;
                    coloredImageSpan2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                    spannableStringBuilder2.setSpan(coloredImageSpan2, 0, 1, 33);
                    this.mentionString = spannableStringBuilder2;
                }
                this.counterText.setText(this.mentionString, z4);
            } else if (i > 0) {
                this.counterBackgroundColorKey = z ? Theme.key_chats_unreadCounterMuted : Theme.key_chats_unreadCounter;
                this.counterText.setText(LocaleController.formatNumber(i, ','), z4);
            } else {
                this.counterBackgroundColorKey = Theme.key_chats_unreadCounterMuted;
                this.counterText.setText("", z4);
            }
            if (z4 && (this.lastUnread < i || ((!this.lastMention && z2) || (!this.lastReactions && z3)))) {
                animateCounterBounce();
            }
            this.lastUnread = i;
            this.lastMention = z2;
            this.lastReactions = z3;
            this.imageLayoutView.invalidate();
        }

        private void animateCounterBounce() {
            ValueAnimator valueAnimator = this.counterAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.counterAnimator = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.counterAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TopicsTabsView.VerticalTabView.this.lambda$animateCounterBounce$0(valueAnimator2);
                }
            });
            this.counterAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VerticalTabView.this.countScale = 1.0f;
                    VerticalTabView.this.imageLayoutView.invalidate();
                }
            });
            this.counterAnimator.setInterpolator(new OvershootInterpolator(2.0f));
            this.counterAnimator.setDuration(200L);
            this.counterAnimator.start();
        }

        public void lambda$animateCounterBounce$0(ValueAnimator valueAnimator) {
            this.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.imageLayoutView.invalidate();
        }

        public void setAll(boolean z, boolean z2, boolean z3) {
            setLayout(z2);
            this.topicId = -1L;
            this.staticImage = true;
            this.isAdd = false;
            this.textView.setText(LocaleController.getString(z ? R.string.BotForumNewTopic : R.string.AllTopicsSide));
            this.textView.setVisibility(z ? 8 : 0);
            this.imageView.clearImage();
            this.imageView.setAnimatedEmojiDrawable(null);
            if (z) {
                BotNewTopicDrawable botNewTopicDrawable = new BotNewTopicDrawable(getContext());
                botNewTopicDrawable.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                this.imageView.setImageDrawable(botNewTopicDrawable);
            } else {
                this.imageView.setImageResource(R.drawable.other_chats);
            }
            this.imageView.setScaleX(1.0f);
            this.imageView.setScaleY(1.0f);
            setSelected(z3);
            updateImageColor();
            updateState();
            setCounter(true, 0, false, false, false);
            setPinned(false, false);
        }

        public void setAdd(boolean z, boolean z2) {
            setLayout(z);
            this.staticImage = true;
            this.isAdd = true;
            this.textView.setText(LocaleController.getString(R.string.NewTopic));
            this.textView.setVisibility(0);
            this.imageView.clearImage();
            this.imageView.setAnimatedEmojiDrawable(null);
            this.imageView.setImageResource(R.drawable.emoji_tabs_new3);
            this.imageView.setScaleX(1.0f);
            this.imageView.setScaleY(1.0f);
            setSelected(z2);
            updateImageColor();
            updateState();
            setCounter(true, 0, false, false, false);
            setPinned(false, false);
        }

        public void setLoading() {
            setLayout(false);
            this.topicId = -1L;
            this.staticImage = true;
            this.isAdd = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
            LoadingSpan loadingSpan = new LoadingSpan(this.textView, AndroidUtilities.dp(38.0f));
            loadingSpan.setScaleY(0.75f);
            spannableStringBuilder.setSpan(loadingSpan, 0, 1, 33);
            this.textView.setText(spannableStringBuilder);
            this.textView.setVisibility(0);
            this.imageView.clearImage();
            this.imageView.setAnimatedEmojiDrawable(null);
            if (this.loadingDrawable == null) {
                LoadingDrawable loadingDrawable = new LoadingDrawable(this.resourcesProvider);
                this.loadingDrawable = loadingDrawable;
                loadingDrawable.setRadiiDp(38.0f);
                this.loadingDrawable.setCallback(this.imageView);
                int color = Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider);
                this.loadingDrawable.setColors(Theme.multAlpha(color, 0.15f), Theme.multAlpha(color, 0.5f), Theme.multAlpha(color, 0.6f), Theme.multAlpha(color, 0.15f));
                this.loadingDrawable.stroke = false;
            }
            this.imageView.setImageDrawable(this.loadingDrawable);
            this.imageView.setScaleX(1.0f);
            this.imageView.setScaleY(1.0f);
            setSelected(false);
            updateImageColor();
            setCounter(true, 0, false, false, false);
            setPinned(false, false);
            updateState();
        }

        public void set(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            setLayout(false);
            long j2 = this.topicId;
            long j3 = tL_forumTopic.id;
            boolean z2 = j2 == j3;
            this.staticImage = false;
            this.topicId = j3;
            this.isAdd = false;
            this.textView.setText(tL_forumTopic.title);
            this.textView.setVisibility(0);
            if (tL_forumTopic.id == 1) {
                this.staticImage = true;
                this.imageView.clearImage();
                this.imageView.setAnimatedEmojiDrawable(null);
                this.imageView.setImageResource(R.drawable.msg_filled_general);
                this.imageView.setScaleX(0.66f);
                this.imageView.setScaleY(0.66f);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                this.imageView.clearImage();
                this.imageView.setAnimatedEmojiDrawable(AnimatedEmojiDrawable.make(UserConfig.selectedAccount, 3, tL_forumTopic.icon_emoji_id));
                this.imageView.setScaleX(1.0f);
                this.imageView.setScaleY(1.0f);
            } else {
                this.imageView.setAnimatedEmojiDrawable(null);
                this.imageView.setImageDrawable(ForumUtilities.createTopicDrawable(tL_forumTopic, false));
                this.imageView.setScaleX(1.0f);
                this.imageView.setScaleY(1.0f);
            }
            setSelected(z);
            updateImageColor();
            setCounter(MessagesController.getInstance(this.currentAccount).isDialogMuted(j, tL_forumTopic.id), tL_forumTopic.unread_count, tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z2);
            setPinned(tL_forumTopic.pinned, z2);
            updateState();
        }

        public void updateImageColor() {
            int blendARGB = ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), this.isAdd ? 1.0f : this.selectT);
            if (!this.staticImage) {
                this.imageView.setColorFilter(null);
            } else {
                this.imageView.setColorFilter(new PorterDuffColorFilter(blendARGB, PorterDuff.Mode.SRC_IN));
            }
            this.imageView.setEmojiColorFilter(new PorterDuffColorFilter(blendARGB, PorterDuff.Mode.SRC_IN));
            this.imageView.invalidate();
        }

        public void setMf(TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            setLayout(true);
            this.isAdd = false;
            this.staticImage = false;
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            boolean z2 = peerDialogId == this.topicId;
            this.topicId = peerDialogId;
            this.textView.setText(DialogObject.getName(peerDialogId));
            this.textView.setVisibility(0);
            if (peerDialogId >= 0) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                this.avatarDrawable.setInfo(user);
                this.imageView.setForUserOrChat(user, this.avatarDrawable);
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-peerDialogId));
                this.avatarDrawable.setInfo(chat);
                this.imageView.setForUserOrChat(chat, this.avatarDrawable);
            }
            this.imageView.setScaleX(1.0f);
            this.imageView.setScaleY(1.0f);
            updateState();
            setSelected(z);
            setCounter(false, tL_forumTopic.unread_count, false, tL_forumTopic.unread_reactions_count > 0, z2);
            setPinned(false, z2);
        }

        @Override
        public void setSelected(final boolean z) {
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            ValueAnimator valueAnimator = this.selectAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.selectT, z ? 1.0f : 0.0f);
            this.selectAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TopicsTabsView.VerticalTabView.this.lambda$setSelected$1(valueAnimator2);
                }
            });
            this.selectAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VerticalTabView.this.selectT = z ? 1.0f : 0.0f;
                    VerticalTabView.this.updateState();
                    VerticalTabView.this.updateImageColor();
                }
            });
            this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.selectAnimator.setDuration(320L);
            this.selectAnimator.start();
        }

        public void lambda$setSelected$1(ValueAnimator valueAnimator) {
            this.selectT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateState();
            updateImageColor();
        }

        public void updateState() {
            this.lineView.setTranslationX((-AndroidUtilities.dp(3.0f)) * (1.0f - this.selectT));
            this.lineView.setVisibility(this.selectT <= 0.0f ? 8 : 0);
            this.textView.setTextColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), this.isAdd ? 1.0f : this.selectT));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), 1073741824), i2);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public VerticalTabView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new VerticalTabView(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                VerticalTabView verticalTabView = (VerticalTabView) view;
                boolean z2 = false;
                if (uItem.red) {
                    verticalTabView.setLoading();
                } else {
                    Object obj = uItem.object;
                    if (obj == null) {
                        if (uItem.longValue == -2) {
                            verticalTabView.setAdd(uItem.accent, uItem.checked);
                        } else {
                            verticalTabView.setAll((uItem.flags & 1) != 0, uItem.accent, uItem.checked);
                        }
                    } else if (obj instanceof TLRPC.TL_forumTopic) {
                        if (!uItem.withUsername) {
                            verticalTabView.setMf((TLRPC.TL_forumTopic) obj, uItem.checked);
                        } else {
                            verticalTabView.set(uItem.dialogId, (TLRPC.TL_forumTopic) obj, uItem.checked);
                        }
                    }
                }
                if (universalRecyclerView != null && universalRecyclerView.isReorderAllowed() && verticalTabView.pinned) {
                    z2 = true;
                }
                verticalTabView.setReorder(z2);
            }

            public static UItem asAll(boolean z, boolean z2) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = 0;
                ofFactory.longValue = 0L;
                ofFactory.object = null;
                ofFactory.accent = z2;
                ofFactory.flags = z ? 1 : 0;
                return ofFactory;
            }

            public static UItem asAdd(boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = -2;
                ofFactory.longValue = -2L;
                ofFactory.object = null;
                ofFactory.accent = z;
                return ofFactory;
            }

            public static UItem asTab(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.dialogId = j;
                ofFactory.id = tL_forumTopic.id;
                ofFactory.object = tL_forumTopic;
                if (z) {
                    ofFactory.longValue = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                    ofFactory.withUsername = false;
                }
                return ofFactory;
            }

            public static UItem asLoading(int i) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.red = true;
                ofFactory.checked = false;
                return ofFactory;
            }
        }
    }

    public static class HorizontalTabView extends FrameLayout {
        private AvatarSpan avatarSpan;
        private ValueAnimator counterAnimator;
        private int counterBackgroundColorKey;
        private final AnimatedTextView.AnimatedTextDrawable counterText;
        private final View counterView;
        int counterViewX;
        private final int currentAccount;
        private boolean isAdd;
        private boolean lastMention;
        private boolean lastReactions;
        private int lastUnread;
        private CharSequence mentionString;
        private boolean mono;
        private boolean pinned;
        private CharSequence reactionString;
        private boolean reorder;
        private final Theme.ResourcesProvider resourcesProvider;
        private ValueAnimator selectAnimator;
        private float selectT;
        private boolean selected;
        private final AnimatedFloat shakeAlpha;
        private Shaker shaker;
        private boolean staticImage;
        private final LinkSpanDrawable.LinksTextView textView;
        private long topicId;

        public void setReorder(boolean z) {
            this.reorder = z;
            invalidate();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.textView) {
                canvas.save();
                float f = this.shakeAlpha.set(this.reorder);
                if (f > 0.0f) {
                    if (this.shaker == null) {
                        this.shaker = new Shaker(this);
                    }
                    canvas.translate(getWidth() / 2.0f, getHeight() / 2.0f);
                    this.shaker.concat(canvas, f);
                    canvas.translate((-getWidth()) / 2.0f, (-getHeight()) / 2.0f);
                }
                boolean drawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return drawChild;
            }
            return super.drawChild(canvas, view, j);
        }

        public HorizontalTabView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.shakeAlpha = new AnimatedFloat(this, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.pinned = false;
            this.isAdd = false;
            this.mono = false;
            this.staticImage = false;
            this.counterBackgroundColorKey = Theme.key_chats_unreadCounter;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            setClipChildren(false);
            setClipToPadding(false);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.textView = linksTextView;
            linksTextView.setTextSize(1, 14.66f);
            linksTextView.setTypeface(AndroidUtilities.bold());
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 12.0f, 0.0f, 12.0f, 0.0f));
            ScaleStateListAnimator.apply(linksTextView);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.counterText = animatedTextDrawable;
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(11.0f));
            animatedTextDrawable.setTypeface(AndroidUtilities.bold());
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable.setGravity(17);
            View view = new View(context, resourcesProvider) {
                private final AnimatedPaint backgroundPaint;
                final Theme.ResourcesProvider val$resourcesProvider;

                {
                    this.val$resourcesProvider = resourcesProvider;
                    this.backgroundPaint = new AnimatedPaint(this, resourcesProvider);
                    HorizontalTabView.this.counterText.setCallback(this);
                }

                @Override
                protected boolean verifyDrawable(Drawable drawable) {
                    return HorizontalTabView.this.counterText == drawable || super.verifyDrawable(drawable);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    float isNotEmpty = HorizontalTabView.this.counterText.isNotEmpty();
                    float lerp = AndroidUtilities.lerp(0.6f, 1.0f, isNotEmpty);
                    float max = Math.max(AndroidUtilities.dp(16.66f), HorizontalTabView.this.counterText.getCurrentWidth() + AndroidUtilities.dp(10.0f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, max, getHeight());
                    canvas.save();
                    canvas.scale(lerp, lerp, rectF.centerX(), rectF.centerY());
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), this.backgroundPaint.setByKey(HorizontalTabView.this.counterBackgroundColorKey).blendTo(HorizontalTabView.this.getTextColor(), HorizontalTabView.this.selectT).multAlpha(isNotEmpty));
                    canvas.translate(0.0f, -AndroidUtilities.dp(1.0f));
                    HorizontalTabView.this.counterText.setBounds(rectF);
                    HorizontalTabView.this.counterText.setAlpha((int) (isNotEmpty * 255.0f));
                    HorizontalTabView.this.counterText.setTextColor(Theme.getColor(Theme.key_chats_unreadCounterText, this.val$resourcesProvider));
                    HorizontalTabView.this.counterText.draw(canvas);
                    canvas.restore();
                    super.dispatchDraw(canvas);
                }

                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), HorizontalTabView.this.counterText.getAnimateToWidth() + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                }
            };
            this.counterView = view;
            addView(view, LayoutHelper.createFrame(-2, -2.0f, 21, 4.66f, 0.0f, 12.0f, 0.0f));
            ScaleStateListAnimator.apply(view);
            updateTextColor();
        }

        private void setPinned(boolean z, boolean z2) {
            if (this.pinned != z) {
                this.pinned = z;
            }
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = i3 - i;
            int i6 = (i4 - i2) / 2;
            this.textView.layout(AndroidUtilities.dp(12.0f), i6 - (this.textView.getMeasuredHeight() / 2), AndroidUtilities.dp(12.0f) + this.textView.getMeasuredWidth(), (this.textView.getMeasuredHeight() / 2) + i6);
            if (this.counterText.getAnimateToWidth() > 0.0f) {
                this.counterView.layout((i5 - AndroidUtilities.dp(12.0f)) - this.counterView.getMeasuredWidth(), i6 - (this.counterView.getMeasuredHeight() / 2), i5 - AndroidUtilities.dp(12.0f), i6 + (this.counterView.getMeasuredHeight() / 2));
            } else {
                this.counterView.layout(AndroidUtilities.dp(12.0f) + this.textView.getMeasuredWidth() + AndroidUtilities.dp(4.66f), i6 - (this.counterView.getMeasuredHeight() / 2), AndroidUtilities.dp(12.0f) + this.textView.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + this.counterView.getMeasuredWidth(), i6 + (this.counterView.getMeasuredHeight() / 2));
            }
            if (this.counterViewX != 0 && this.counterView.getLeft() != this.counterViewX) {
                this.counterView.setTranslationX((-r4.getLeft()) + this.counterViewX);
                this.counterView.animate().translationX(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            this.counterViewX = this.counterView.getLeft();
        }

        private void setLayout(boolean z) {
            if (this.mono == z) {
                return;
            }
            this.mono = z;
        }

        public long getTopicId() {
            return this.topicId;
        }

        public void setAll(boolean z, boolean z2, boolean z3) {
            setLayout(z2);
            this.topicId = 0L;
            this.isAdd = false;
            this.staticImage = true;
            this.textView.setText(LocaleController.getString(z ? R.string.BotForumNewTopic : R.string.AllTopicsShort));
            setSelected(z3);
            updateTextColor();
            setCounter(true, 0, false, false, false);
            setPinned(false, false);
        }

        public void setAdd() {
            setLayout(false);
            this.topicId = 0L;
            this.isAdd = true;
            this.staticImage = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("e\u200b");
            spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.menu_topic_add), 0, 1, 33);
            this.textView.setText(spannableStringBuilder);
            setSelected(false);
            updateTextColor();
            setCounter(true, 0, false, false, false);
            setPinned(false, false);
        }

        public void setLoading() {
            setLayout(false);
            this.topicId = -1L;
            this.staticImage = true;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
            LoadingSpan loadingSpan = new LoadingSpan(this.textView, AndroidUtilities.dp(42.0f));
            loadingSpan.setScaleY(0.95f);
            spannableStringBuilder.setSpan(loadingSpan, 0, 1, 33);
            this.textView.setText(spannableStringBuilder);
            setSelected(false);
            updateTextColor();
            setCounter(true, 0, false, false, false);
            setPinned(false, false);
        }

        public void set(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            setLayout(false);
            long j2 = this.topicId;
            long j3 = tL_forumTopic.id;
            boolean z2 = j2 == j3;
            this.topicId = j3;
            this.staticImage = false;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (tL_forumTopic.id == 1) {
                spannableStringBuilder.append((CharSequence) "#");
                spannableStringBuilder.append((CharSequence) (tL_forumTopic.hidden ? "\u200b" : " "));
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.msg_filled_general);
                coloredImageSpan.setScale(0.66f, 0.66f);
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 18);
            } else if (tL_forumTopic.icon_emoji_id != 0) {
                spannableStringBuilder.append((CharSequence) "x ");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(tL_forumTopic.icon_emoji_id, this.textView.getPaint().getFontMetricsInt()), 0, 1, 33);
            }
            if (!tL_forumTopic.hidden) {
                spannableStringBuilder.append((CharSequence) tL_forumTopic.title);
            }
            this.textView.setText(spannableStringBuilder);
            setSelected(z);
            updateTextColor();
            setCounter(MessagesController.getInstance(this.currentAccount).isDialogMuted(j, this.topicId), tL_forumTopic.unread_count, false, false, z2);
            setPinned(tL_forumTopic.pinned, z2);
        }

        public void updateTextColor() {
            int textColor = getTextColor();
            this.textView.setTextColor(textColor);
            this.textView.setEmojiColor(textColor);
            this.counterView.invalidate();
        }

        public int getTextColor() {
            return ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), this.isAdd ? 1.0f : this.selectT);
        }

        public void setMf(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            setLayout(true);
            long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            boolean z2 = this.topicId == peerDialogId;
            this.topicId = peerDialogId;
            this.staticImage = false;
            if (this.avatarSpan == null) {
                AvatarSpan avatarSpan = new AvatarSpan(this.textView, this.currentAccount, 18.0f);
                this.avatarSpan = avatarSpan;
                avatarSpan.usePaintAlpha = false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TLObject userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId);
            if (userOrChat != null) {
                spannableStringBuilder.append((CharSequence) "x  ");
                this.avatarSpan.setObject(userOrChat);
                spannableStringBuilder.setSpan(this.avatarSpan, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) DialogObject.getName(peerDialogId));
            LinkSpanDrawable.LinksTextView linksTextView = this.textView;
            linksTextView.setText(TextUtils.ellipsize(spannableStringBuilder, linksTextView.getPaint(), AndroidUtilities.dp(150.0f), TextUtils.TruncateAt.END));
            setSelected(z);
            setCounter(MessagesController.getInstance(this.currentAccount).isDialogMuted(j, peerDialogId), tL_forumTopic.unread_count, false, false, z2);
            setPinned(false, z2);
        }

        @Override
        public void setSelected(final boolean z) {
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            ValueAnimator valueAnimator = this.selectAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.selectT, z ? 1.0f : 0.0f);
            this.selectAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TopicsTabsView.HorizontalTabView.this.lambda$setSelected$0(valueAnimator2);
                }
            });
            this.selectAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    HorizontalTabView.this.selectT = z ? 1.0f : 0.0f;
                    HorizontalTabView.this.updateTextColor();
                }
            });
            this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.selectAnimator.setDuration(320L);
            this.selectAnimator.start();
        }

        public void lambda$setSelected$0(ValueAnimator valueAnimator) {
            this.selectT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            updateTextColor();
        }

        private void setCounter(boolean z, int i, boolean z2, boolean z3, boolean z4) {
            if (z3) {
                this.counterBackgroundColorKey = Theme.key_dialogReactionMentionBackground;
                if (this.reactionString == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.reactionchatslist);
                    coloredImageSpan.setScale(0.8f, 0.8f);
                    coloredImageSpan.spaceScaleX = 0.5f;
                    coloredImageSpan.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                    spannableStringBuilder.setSpan(coloredImageSpan, 0, spannableStringBuilder.length(), 33);
                    this.reactionString = spannableStringBuilder;
                }
                this.counterText.setText(this.reactionString, z4);
            } else if (z2) {
                this.counterBackgroundColorKey = z ? Theme.key_chats_unreadCounterMuted : Theme.key_chats_unreadCounter;
                if (this.mentionString == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("@");
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mentionchatslist);
                    coloredImageSpan2.setScale(0.8f, 0.8f);
                    coloredImageSpan2.spaceScaleX = 0.5f;
                    coloredImageSpan2.translate(-AndroidUtilities.dp(3.0f), 0.0f);
                    spannableStringBuilder2.setSpan(coloredImageSpan2, 0, 1, 33);
                    this.mentionString = spannableStringBuilder2;
                }
                this.counterText.setText(this.mentionString, z4);
            } else if (i > 0) {
                this.counterBackgroundColorKey = z ? Theme.key_chats_unreadCounterMuted : Theme.key_chats_unreadCounter;
                this.counterText.setText(LocaleController.formatNumber(i, ','), z4);
            } else {
                this.counterBackgroundColorKey = Theme.key_chats_unreadCounterMuted;
                this.counterText.setText("", z4);
            }
            if (z4 && (this.lastUnread < i || ((!this.lastMention && z2) || (!this.lastReactions && z3)))) {
                animateCounterBounce();
            }
            this.lastUnread = i;
            this.lastMention = z2;
            this.lastReactions = z3;
            this.counterView.invalidate();
            if (getMeasuringWidth() != getMeasuredWidth()) {
                requestLayout();
            }
        }

        private void animateCounterBounce() {
            ValueAnimator valueAnimator = this.counterAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.counterAnimator = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.counterAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TopicsTabsView.HorizontalTabView.this.lambda$animateCounterBounce$1(valueAnimator2);
                }
            });
            this.counterAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    HorizontalTabView.this.counterView.setScaleX(1.0f);
                    HorizontalTabView.this.counterView.setScaleY(1.0f);
                    HorizontalTabView.this.counterView.invalidate();
                }
            });
            this.counterAnimator.setInterpolator(new OvershootInterpolator(2.0f));
            this.counterAnimator.setDuration(200L);
            this.counterAnimator.start();
        }

        public void lambda$animateCounterBounce$1(ValueAnimator valueAnimator) {
            this.counterView.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            this.counterView.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            this.counterView.invalidate();
        }

        private int getMeasuringWidth() {
            return AndroidUtilities.dp(12.0f) + this.textView.getMeasuredWidth() + (this.counterText.getAnimateToWidth() > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(AndroidUtilities.dp(16.66f), this.counterText.getAnimateToWidth() + AndroidUtilities.dp(10.0f))) : 0) + AndroidUtilities.dp(12.0f);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.textView.measure(i, i2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public HorizontalTabView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new HorizontalTabView(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                HorizontalTabView horizontalTabView = (HorizontalTabView) view;
                boolean z2 = false;
                if (uItem.red) {
                    horizontalTabView.setLoading();
                } else {
                    Object obj = uItem.object;
                    if (obj == null) {
                        if (uItem.id == -2) {
                            horizontalTabView.setAdd();
                        } else {
                            horizontalTabView.setAll((uItem.flags & 1) != 0, uItem.accent, uItem.checked);
                        }
                    } else if (obj instanceof TLRPC.TL_forumTopic) {
                        if (!uItem.withUsername) {
                            horizontalTabView.setMf(uItem.dialogId, (TLRPC.TL_forumTopic) obj, uItem.checked);
                        } else {
                            horizontalTabView.set(uItem.dialogId, (TLRPC.TL_forumTopic) obj, uItem.checked);
                        }
                    }
                }
                if (universalRecyclerView != null && universalRecyclerView.isReorderAllowed() && horizontalTabView.pinned) {
                    z2 = true;
                }
                horizontalTabView.setReorder(z2);
            }

            public static UItem asAll(boolean z, boolean z2) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = 0;
                ofFactory.longValue = 0L;
                ofFactory.object = null;
                ofFactory.accent = z2;
                ofFactory.flags = z ? 1 : 0;
                return ofFactory;
            }

            public static UItem asTab(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.dialogId = j;
                ofFactory.id = tL_forumTopic.id;
                ofFactory.object = tL_forumTopic;
                if (z) {
                    ofFactory.longValue = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                    ofFactory.withUsername = false;
                }
                return ofFactory;
            }

            public static UItem asLoading(int i) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.red = true;
                return ofFactory;
            }

            public static UItem asAdd() {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = -2;
                ofFactory.longValue = -2L;
                ofFactory.object = null;
                return ofFactory;
            }
        }
    }

    private void deleteTopics(final HashSet hashSet, final Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.getPluralString("DeleteTopics", hashSet.size()));
        final ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            builder.setMessage(LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-this.dialogId, ((Integer) arrayList.get(0)).intValue()).title));
        } else {
            builder.setMessage(LocaleController.getString(R.string.DeleteSelectedTopics));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                TopicsTabsView.this.lambda$deleteTopics$21(hashSet, arrayList, runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$deleteTopics$21(final HashSet hashSet, final ArrayList arrayList, final Runnable runnable, AlertDialog alertDialog, int i) {
        this.excludeTopics.addAll(hashSet);
        updateTabs();
        BulletinFactory.of(this.fragment).createUndoBulletin(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.this.lambda$deleteTopics$19(hashSet);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.this.lambda$deleteTopics$20(arrayList, runnable);
            }
        }).show();
        alertDialog.dismiss();
    }

    public void lambda$deleteTopics$19(HashSet hashSet) {
        this.excludeTopics.removeAll(hashSet);
        updateTabs();
    }

    public void lambda$deleteTopics$20(ArrayList arrayList, Runnable runnable) {
        MessagesController.getInstance(this.currentAccount).getTopicsController().deleteTopics(-this.dialogId, arrayList);
        runnable.run();
    }

    private long getTopicId(TLRPC.TL_forumTopic tL_forumTopic) {
        return this.mono ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
    }

    public static class BotNewTopicDrawable extends Drawable {
        private final Drawable drawable;
        private final Paint paint = new Paint(1);
        private final RectF rectF = new RectF();

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public BotNewTopicDrawable(Context context) {
            this.drawable = context.getResources().getDrawable(R.drawable.menu_topic_add).mutate();
        }

        public void setColor(int i) {
            this.paint.setColor(i);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawRoundRect(this.rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.paint);
            this.drawable.draw(canvas);
        }

        @Override
        protected void onBoundsChange(android.graphics.Rect rect) {
            super.onBoundsChange(rect);
            this.rectF.set(rect);
            int centerX = rect.centerX() - AndroidUtilities.dp(12.0f);
            int centerY = rect.centerY() - AndroidUtilities.dp(12.0f);
            this.drawable.setBounds(centerX, centerY, AndroidUtilities.dp(24.0f) + centerX, AndroidUtilities.dp(24.0f) + centerY);
        }

        @Override
        public void setAlpha(int i) {
            this.paint.setAlpha(i);
            this.drawable.setAlpha(i);
        }
    }
}

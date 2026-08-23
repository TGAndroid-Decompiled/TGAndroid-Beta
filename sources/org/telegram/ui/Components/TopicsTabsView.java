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
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.core.BitwiseUtils;
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
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.GradientClip;
import org.telegram.ui.TopicCreateFragment;
import org.telegram.ui.recyclerview.ChatListItemAnimator;

public class TopicsTabsView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    private boolean allTopicsHidden;
    private long animateFromSelectedTopicId;
    private ValueAnimator animator;
    private final BoolAnimator animatorCloseButtonVisibility;
    private final BoolAnimator animatorTopicsVisibility;
    private final boolean bot;
    private final HorizontalTabView botCreateTopicButtonHorizontal;
    private final VerticalTabView botCreateTopicButtonVertical;
    private final boolean canShowProgress;
    private final ImageView closeButtonSide;
    private final ImageView closeButtonTop;
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
    private Runnable onUpdateSideMenuPosition;
    private Boolean pendingSidemenu;
    private final Theme.ResourcesProvider resourcesProvider;
    private BlurredBackgroundDrawable sideMenuBackgroundDrawable;
    private float sideMenuBackgroundMarginBottom;
    private float sideMenuBackgroundMarginTop;
    private final UniversalRecyclerView sideTabs;
    private final FrameLayout sideTabsContainer;
    private boolean sidemenuAnimating;
    private boolean sidemenuEnabled;
    private float sidemenuT;
    private final ImageView toggleButtonSide;
    private final ImageView toggleButtonTop;
    private BlurredBackgroundDrawable topMenuBackgroundDrawable;
    private final UniversalRecyclerView topTabs;
    private final FrameLayout topTabsContainer;
    private boolean topicBottom;

    public enum Position {
        TOP,
        LEFT,
        BOTTOM
    }

    public static void $r8$lambda$whz9_2q0Ul6L4zdHpqUqnJxFQVc() {
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public TopicsTabsView(Context context, BaseFragment baseFragment, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        ViewGroup viewGroup;
        super(context);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorTopicsVisibility = new BoolAnimator(0, this, cubicBezierInterpolator, 380L, true);
        this.animatorCloseButtonVisibility = new BoolAnimator(0, new FactorAnimator.Target() {
            @Override
            public void onFactorChangeFinished(int i2, float f, FactorAnimator factorAnimator) {
                FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i2, f, factorAnimator);
            }

            @Override
            public final void onFactorChanged(int i2, float f, float f2, FactorAnimator factorAnimator) {
                this.f$0.checkUi_closeButtonVisibility();
            }
        }, cubicBezierInterpolator, 320L);
        this.sidemenuT = 0.0f;
        this.excludeTopics = new HashSet();
        this.fragment = baseFragment;
        this.currentAccount = i;
        this.dialogId = j;
        this.resourcesProvider = resourcesProvider;
        long j2 = -j;
        this.mono = ChatObject.isMonoForum(MessagesController.getInstance(i).getChat(Long.valueOf(j2)));
        boolean zIsBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        this.bot = zIsBotForumWithEditableTopics;
        this.canShowProgress = !UserConfig.getInstance(i).getPreferences().getBoolean("topics_end_reached_" + j2, false);
        setClipChildren(true);
        setClipToPadding(true);
        setWillNotDraw(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.topTabsContainer = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, 36.0f, 55, 7.0f, 7.0f, 7.0f, 7.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.sideTabsContainer = frameLayout2;
        addView(frameLayout2, LayoutHelper.createFrame(64, -1.0f, 115, 7.0f, 7.0f, 7.0f, 7.0f));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, i, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillHorizontalTabs((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onTabClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onTabLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        }, resourcesProvider) {
            private final AnimatedFloat animateTab;
            private final AnimatedFloat animatedClipL;
            private final AnimatedFloat animatedClipR;
            private final GradientClip clip = new GradientClip();
            private final Paint linePaint;
            private final RectF lineRect;
            private Drawable pinIcon;
            private int pinIconColor;
            private final Paint pinnedBackgroundPaint;

            {
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedClipL = new AnimatedFloat(this, 320L, cubicBezierInterpolator2);
                this.animatedClipR = new AnimatedFloat(this, 320L, cubicBezierInterpolator2);
                this.lineRect = new RectF();
                this.linePaint = new Paint(1);
                this.animateTab = new AnimatedFloat(this, 420L, cubicBezierInterpolator2);
                this.pinnedBackgroundPaint = new Paint(1);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                float f = this.animatedClipL.set(canScrollHorizontally(-1));
                float f2 = this.animatedClipR.set(canScrollHorizontally(1));
                boolean z = f > 0.0f || f2 > 0.0f;
                if (z) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    canvas2 = canvas;
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
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof HorizontalTabView) {
                        HorizontalTabView horizontalTabView3 = (HorizontalTabView) childAt;
                        if (!horizontalTabView3.isAdd) {
                            if (horizontalTabView3.getTopicId() == TopicsTabsView.this.currentTopicId) {
                                horizontalTabView = horizontalTabView3;
                            }
                            if (horizontalTabView3.getTopicId() == TopicsTabsView.this.animateFromSelectedTopicId) {
                                horizontalTabView2 = horizontalTabView3;
                            }
                        }
                    }
                }
                if (horizontalTabView != null) {
                    this.lineRect.set(horizontalTabView.getX() + AndroidUtilities.dp(1.0f), horizontalTabView.getY() + AndroidUtilities.dp(4.0f), (horizontalTabView.getX() + horizontalTabView.getWidth()) - AndroidUtilities.dp(1.0f), (horizontalTabView.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                    if (horizontalTabView2 != null) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(horizontalTabView2.getX() + AndroidUtilities.dp(1.0f), horizontalTabView2.getY() + AndroidUtilities.dp(4.0f), (horizontalTabView2.getX() + horizontalTabView2.getWidth()) - AndroidUtilities.dp(1.0f), (horizontalTabView2.getY() + getHeight()) - AndroidUtilities.dp(4.0f));
                        AndroidUtilities.lerp(rectF, this.lineRect, this.animateTab.set(1.0f), this.lineRect);
                    }
                    this.linePaint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), 31));
                    canvas2.drawRoundRect(this.lineRect, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.linePaint);
                }
                if (z) {
                    canvas2.save();
                    if (f > 0.0f) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(12.0f), getHeight());
                        this.clip.draw(canvas2, rectF2, 0, f);
                    }
                    if (f2 > 0.0f) {
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(getWidth() - AndroidUtilities.dp(12.0f), 0.0f, getWidth(), getHeight());
                        this.clip.draw(canvas2, rectF3, 2, f2);
                    }
                    canvas2.restore();
                    canvas2.restore();
                }
            }

            private void drawPinnedBackground(Canvas canvas) {
                float width = getWidth();
                float x = 0.0f;
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof HorizontalTabView) {
                        HorizontalTabView horizontalTabView = (HorizontalTabView) childAt;
                        if (horizontalTabView.pinned) {
                            if (width > horizontalTabView.getX()) {
                                width = horizontalTabView.getX();
                                getChildAdapterPosition(horizontalTabView);
                            }
                            if (x < horizontalTabView.getX() + horizontalTabView.getWidth()) {
                                x = horizontalTabView.getX() + horizontalTabView.getWidth();
                                getChildAdapterPosition(horizontalTabView);
                            }
                        }
                    }
                }
                if (x > width) {
                    this.pinnedBackgroundPaint.setColor(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider), 0.06f));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(width + AndroidUtilities.dp(1.0f), (getHeight() - AndroidUtilities.dp(28.0f)) / 2.0f, x - AndroidUtilities.dp(1.0f), (getHeight() + AndroidUtilities.dp(28.0f)) / 2.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.pinnedBackgroundPaint);
                    if (this.pinIcon == null) {
                        this.pinIcon = getContext().getResources().getDrawable(R.drawable.msg_limit_pin).mutate();
                    }
                    int color = Theme.getColor(Theme.key_chats_pinnedIcon, this.resourcesProvider);
                    if (this.pinIconColor != color) {
                        Drawable drawable = this.pinIcon;
                        this.pinIconColor = color;
                        drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    }
                    this.pinIcon.setBounds((int) (AndroidUtilities.dp(-17.0f) + x), (int) (rectF.top + AndroidUtilities.dp(10.0f)), (int) (x + AndroidUtilities.dp(-7.0f)), (int) (rectF.top + AndroidUtilities.dp(20.0f)));
                    this.pinIcon.draw(canvas);
                }
            }

            @Override
            public Integer getSelectorColor(int i2) {
                return 0;
            }
        };
        this.topTabs = universalRecyclerView;
        universalRecyclerView.listenReorder(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        universalRecyclerView.setWillNotDraw(false);
        universalRecyclerView.adapter.setApplyBackground(false);
        universalRecyclerView.makeHorizontal();
        frameLayout.addView(universalRecyclerView, LayoutHelper.createFrame(-1, -1.0f, 119, 41.0f, 0.0f, 0.0f, 0.0f));
        universalRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (TopicsTabsView.this.isLoadingVisible()) {
                    TopicsTabsView.this.loadMore();
                }
            }
        });
        if (zIsBotForumWithEditableTopics) {
            this.botCreateTopicButtonHorizontal = null;
            VerticalTabView verticalTabView = new VerticalTabView(context, i, resourcesProvider);
            this.botCreateTopicButtonVertical = verticalTabView;
            verticalTabView.setAll(true, false, this.currentTopicId == 0);
            verticalTabView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.onTopicSelected.run(0, Boolean.FALSE);
                }
            });
            viewGroup = frameLayout2;
            viewGroup.addView(verticalTabView, LayoutHelper.createFrame(64, 42.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        } else {
            viewGroup = frameLayout2;
            this.botCreateTopicButtonHorizontal = null;
            this.botCreateTopicButtonVertical = null;
        }
        ViewGroup viewGroup2 = viewGroup;
        UniversalRecyclerView universalRecyclerView2 = new UniversalRecyclerView(context, i, 0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillVerticalTabs((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onTabClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onTabLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        }, resourcesProvider) {
            private Drawable pinIcon;
            private int pinIconColor;
            private final GradientClip clip = new GradientClip();
            private final AnimatedFloat animatedClip = new AnimatedFloat(this, 320, CubicBezierInterpolator.EASE_OUT_QUINT);
            private final Paint pinnedBackgroundPaint = new Paint(1);

            @Override
            protected void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                float f = this.animatedClip.set(canScrollVertically(-1));
                if (f > 0.0f) {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                } else {
                    canvas2 = canvas;
                }
                drawPinnedBackground(canvas2);
                super.dispatchDraw(canvas2);
                if (f > 0.0f) {
                    canvas2.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(12.0f));
                    this.clip.draw(canvas2, rectF, 1, f);
                    canvas2.restore();
                    canvas2.restore();
                }
            }

            private void drawPinnedBackground(Canvas canvas) {
                float height = getHeight();
                float y = 0.0f;
                for (int i2 = 0; i2 < getChildCount(); i2++) {
                    View childAt = getChildAt(i2);
                    if (childAt instanceof VerticalTabView) {
                        VerticalTabView verticalTabView2 = (VerticalTabView) childAt;
                        if (verticalTabView2.pinned) {
                            if (height > verticalTabView2.getY()) {
                                height = verticalTabView2.getY();
                                getChildAdapterPosition(verticalTabView2);
                            }
                            if (y < verticalTabView2.getY() + verticalTabView2.getHeight()) {
                                y = verticalTabView2.getY() + verticalTabView2.getHeight();
                                getChildAdapterPosition(verticalTabView2);
                            }
                        }
                    }
                }
                if (y > height) {
                    this.pinnedBackgroundPaint.setColor(Theme.getColor(Theme.key_chats_pinnedOverlay, this.resourcesProvider));
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getWidth() - AndroidUtilities.dp(56.0f)) / 2.0f, height, (getWidth() + AndroidUtilities.dp(56.0f)) / 2.0f, y);
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
                this.f$0.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        universalRecyclerView2.adapter.setApplyBackground(false);
        universalRecyclerView2.setClipToPadding(false);
        universalRecyclerView2.setClipChildren(false);
        viewGroup2.addView(universalRecyclerView2, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, zIsBotForumWithEditableTopics ? 90.0f : 48.0f, 0.0f, 0.0f));
        universalRecyclerView2.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (TopicsTabsView.this.isLoadingVisible()) {
                    TopicsTabsView.this.loadMore();
                }
            }
        });
        int i2 = R.drawable.menu_sidebar_left;
        ImageView imageViewCreateButton = createButton(context, i2, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.onSideMenuButtonClick(view);
            }
        });
        this.toggleButtonTop = imageViewCreateButton;
        ImageView imageViewCreateButton2 = createButton(context, i2, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.onSideMenuButtonClick(view);
            }
        });
        this.toggleButtonSide = imageViewCreateButton2;
        frameLayout.addView(imageViewCreateButton, LayoutHelper.createFrame(44, 36, 51));
        viewGroup2.addView(imageViewCreateButton2, LayoutHelper.createFrame(64, 48, 51));
        int i3 = R.drawable.msg_select;
        ImageView imageViewCreateButton3 = createButton(context, i3, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.onCloseButtonClick(view);
            }
        });
        this.closeButtonTop = imageViewCreateButton3;
        ImageView imageViewCreateButton4 = createButton(context, i3, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.onCloseButtonClick(view);
            }
        });
        this.closeButtonSide = imageViewCreateButton4;
        frameLayout.addView(imageViewCreateButton3, LayoutHelper.createFrame(44, 36, 51));
        viewGroup2.addView(imageViewCreateButton4, LayoutHelper.createFrame(64, 48, 51));
        MessagesController.getInstance(i).getTopicsController().loadTopics(j2, false, 3);
        SharedPreferences mainSettings = MessagesController.getInstance(i).getMainSettings();
        if (mainSettings.getBoolean("topicssidetabs" + j, false)) {
            this.sidemenuT = 1.0f;
            this.sidemenuEnabled = true;
        }
        boolean z = mainSettings.getBoolean("topicssidetabsb" + j, false);
        this.topicBottom = z;
        imageViewCreateButton2.setImageResource(z ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
        checkTopicsVisibility(false);
        checkUi_closeButtonVisibility();
        updateSidemenuPosition();
        updateTabs();
    }

    private void checkTopicsVisibility(boolean z) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-this.dialogId);
        this.animatorTopicsVisibility.setValue((topics == null || topics.isEmpty() || this.allTopicsHidden) ? false : true, z);
    }

    public void onSideMenuButtonClick(View view) {
        Boolean bool = this.pendingSidemenu;
        animateSidemenuTo(bool == null ? !this.sidemenuEnabled : !bool.booleanValue());
    }

    public void onCloseButtonClick(View view) {
        this.sideTabs.allowReorder(false);
        this.topTabs.allowReorder(false);
        this.animatorCloseButtonVisibility.setValue(false, true);
        AndroidUtilities.updateVisibleRows(this.sideTabs);
        AndroidUtilities.updateVisibleRows(this.topTabs);
    }

    private ImageView createButton(Context context, int i, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setOnClickListener(onClickListener);
        ScaleStateListAnimator.apply(imageView);
        return imageView;
    }

    public void checkUi_closeButtonVisibility() {
        float floatValue = this.animatorCloseButtonVisibility.getFloatValue();
        this.closeButtonTop.setAlpha(floatValue);
        this.closeButtonTop.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, floatValue));
        this.closeButtonTop.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, floatValue));
        this.closeButtonTop.setVisibility(floatValue > 0.0f ? 0 : 8);
        this.closeButtonSide.setAlpha(floatValue);
        this.closeButtonSide.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, floatValue));
        this.closeButtonSide.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, floatValue));
        this.closeButtonSide.setVisibility(floatValue > 0.0f ? 0 : 8);
        float floatValue2 = 1.0f - this.animatorCloseButtonVisibility.getFloatValue();
        this.toggleButtonTop.setAlpha(floatValue2);
        this.toggleButtonTop.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, floatValue2));
        this.toggleButtonTop.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, floatValue2));
        this.toggleButtonTop.setVisibility(floatValue2 > 0.0f ? 0 : 8);
        this.toggleButtonSide.setAlpha(floatValue2);
        this.toggleButtonSide.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, floatValue2));
        this.toggleButtonSide.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, floatValue2));
        this.toggleButtonSide.setVisibility(floatValue2 > 0.0f ? 0 : 8);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.sideTabsContainer.getVisibility() == 0) {
            this.sideMenuBackgroundDrawable.setBounds((int) this.sideTabsContainer.getTranslationX(), (int) this.sideMenuBackgroundMarginTop, (int) (this.sideTabsContainer.getTranslationX() + AndroidUtilities.dp(78.0f)), (int) (getMeasuredHeight() - this.sideMenuBackgroundMarginBottom));
            this.sideMenuBackgroundDrawable.draw(canvas);
        }
        if (this.topTabsContainer.getVisibility() == 0) {
            this.topMenuBackgroundDrawable.setAlpha((int) (this.topTabsContainer.getAlpha() * 255.0f));
            this.topMenuBackgroundDrawable.setBounds(0, (int) this.topTabsContainer.getTranslationY(), getMeasuredWidth(), (int) (this.topTabsContainer.getTranslationY() + AndroidUtilities.dp(50.0f)));
            this.topMenuBackgroundDrawable.draw(canvas);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        canvas.save();
        if (view == this.sideTabsContainer) {
            canvas.clipPath(this.sideMenuBackgroundDrawable.getPath());
        }
        if (view == this.topTabsContainer) {
            canvas.clipPath(this.topMenuBackgroundDrawable.getPath());
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public void setSideMenuBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.sideMenuBackgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(16.0f));
        this.sideMenuBackgroundDrawable.setPadding(AndroidUtilities.dp(7.0f));
    }

    public void setTopMenuBackgroundDrawable(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.topMenuBackgroundDrawable = blurredBackgroundDrawable;
        blurredBackgroundDrawable.setRadius(AndroidUtilities.dp(18.0f));
        this.topMenuBackgroundDrawable.setPadding(AndroidUtilities.dp(7.0f));
    }

    public void setSideMenuBackgroundMarginBottom(float f) {
        this.sideMenuBackgroundMarginBottom = f;
        checkUi_topicsVerticalPosition();
        checkSideTabsPadding(true);
        invalidate();
    }

    public void setSideMenuBackgroundMarginTop(float f) {
        this.sideMenuBackgroundMarginTop = f;
        this.sideTabsContainer.setTranslationY(f);
        checkUi_topicsVerticalPosition();
        checkSideTabsPadding(true);
        invalidate();
    }

    private void checkSideTabsPadding(boolean z) {
        int paddingBottom = this.sideTabsContainer.getPaddingBottom();
        int iRound = Math.round(this.sideMenuBackgroundMarginBottom + this.sideMenuBackgroundMarginTop);
        if (paddingBottom == iRound) {
            return;
        }
        if (z) {
            this.sideTabsContainer.setPadding(0, 0, 0, iRound);
        } else if (iRound < paddingBottom) {
            this.sideTabsContainer.setPadding(0, 0, 0, 0);
        }
    }

    public void doOnUpdateSideMenuPosition(Runnable runnable) {
        this.onUpdateSideMenuPosition = runnable;
    }

    public void updateSidemenuPosition() {
        Runnable runnable = this.onUpdateSideMenuPosition;
        if (runnable != null) {
            runnable.run();
        }
        checkUi_topicsVerticalPosition();
        float tabsVisibility = getTabsVisibility(Position.LEFT);
        this.sideTabsContainer.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(78.0f), 0, tabsVisibility));
        this.sideTabsContainer.setVisibility(tabsVisibility <= 0.0f ? 8 : 0);
        ImageView imageView = this.toggleButtonTop;
        int i = Theme.key_windowBackgroundWhiteGrayText2;
        int color = Theme.getColor(i, this.resourcesProvider);
        int i2 = Theme.key_featuredStickers_addButton;
        int iBlendARGB = ColorUtils.blendARGB(color, Theme.getColor(i2, this.resourcesProvider), 1.0f - this.sidemenuT);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
        this.toggleButtonSide.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(Theme.getColor(i, this.resourcesProvider), Theme.getColor(i2, this.resourcesProvider), this.sidemenuT), mode));
        this.closeButtonTop.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourcesProvider), mode));
        this.closeButtonSide.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourcesProvider), mode));
        invalidate();
    }

    private void checkUi_topicsVerticalPosition() {
        this.topTabsContainer.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, this.sidemenuT));
        this.topTabsContainer.setVisibility((1.0f - this.sidemenuT) * this.animatorTopicsVisibility.getFloatValue() > 0.0f ? 0 : 8);
        if (this.topicBottom) {
            this.topTabsContainer.setTranslationY(((getMeasuredHeight() - AndroidUtilities.dp(50.0f)) - this.sideMenuBackgroundMarginBottom) + AndroidUtilities.lerp(AndroidUtilities.dp(43.0f), 0, getTabsVisibility(Position.BOTTOM)));
        } else {
            this.topTabsContainer.setTranslationY(this.sideMenuBackgroundMarginTop + AndroidUtilities.lerp(-AndroidUtilities.dp(43.0f), 0, getTabsVisibility(Position.TOP)));
        }
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
        if (!z) {
            this.topicBottom = !this.topicBottom;
        }
        this.sidemenuEnabled = z;
        this.sidemenuAnimating = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.sidemenuT, z ? 1.0f : 0.0f);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TopicsTabsView.m2898$r8$lambda$Ouv9jPHE0DZAjZ_M6zd3mS0s(this.f$0, valueAnimator2);
            }
        });
        this.animator.addListener(new AnonymousClass5(z));
        this.animator.setInterpolator(ChatListItemAnimator.DEFAULT_INTERPOLATOR);
        this.animator.setDuration(250L);
        this.animator.start();
    }

    public static void m2898$r8$lambda$Ouv9jPHE0DZAjZ_M6zd3mS0s(TopicsTabsView topicsTabsView, ValueAnimator valueAnimator) {
        topicsTabsView.getClass();
        topicsTabsView.sidemenuT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        topicsTabsView.updateSidemenuPosition();
    }

    class AnonymousClass5 extends AnimatorListenerAdapter {
        final boolean val$side;

        AnonymousClass5(boolean z) {
            this.val$side = z;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (TopicsTabsView.this.animator == animator) {
                TopicsTabsView.this.sidemenuT = this.val$side ? 1.0f : 0.0f;
                TopicsTabsView.this.updateSidemenuPosition();
                TopicsTabsView.this.sidemenuAnimating = false;
                TopicsTabsView.this.toggleButtonSide.setImageResource(TopicsTabsView.this.topicBottom ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                TopicsTabsView.this.animator = null;
                MessagesController.getInstance(TopicsTabsView.this.currentAccount).getMainSettings().edit().putBoolean("topicssidetabs" + TopicsTabsView.this.dialogId, TopicsTabsView.this.sidemenuEnabled).putBoolean("topicssidetabsb" + TopicsTabsView.this.dialogId, TopicsTabsView.this.topicBottom).apply();
                if (TopicsTabsView.this.pendingSidemenu != null && this.val$side != TopicsTabsView.this.pendingSidemenu.booleanValue()) {
                    boolean zBooleanValue = TopicsTabsView.this.pendingSidemenu.booleanValue();
                    TopicsTabsView.this.pendingSidemenu = null;
                    TopicsTabsView.this.animateSidemenuTo(zBooleanValue);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.AnonymousClass5.$r8$lambda$qkMRXbWslKDkei0DJsDToQDQOL8(this.f$0);
                    }
                });
            }
        }

        public static void $r8$lambda$qkMRXbWslKDkei0DJsDToQDQOL8(AnonymousClass5 anonymousClass5) {
            if (TopicsTabsView.this.isLoadingVisible()) {
                TopicsTabsView.this.loadMore();
            }
        }
    }

    private void updateTabs() {
        checkTopicsVisibility(true);
        boolean zCanScrollHorizontally = this.topTabs.canScrollHorizontally(-1);
        this.topTabs.adapter.update(true);
        if (!zCanScrollHorizontally) {
            this.topTabs.scrollToPosition(0);
        }
        boolean zCanScrollVertically = this.sideTabs.canScrollVertically(-1);
        this.sideTabs.adapter.update(true);
        if (!zCanScrollVertically) {
            this.sideTabs.scrollToPosition(0);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.m2900$r8$lambda$chbCGYqgTG1VKxaseTE3IqgPAU(this.f$0);
            }
        });
    }

    public static void m2900$r8$lambda$chbCGYqgTG1VKxaseTE3IqgPAU(TopicsTabsView topicsTabsView) {
        if (topicsTabsView.isLoadingVisible()) {
            topicsTabsView.loadMore();
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
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(-this.dialogId);
        boolean z2 = this.bot;
        if (!z2) {
            arrayList.add(VerticalTabView.Factory.asAll(z2, this.mono).setChecked(this.currentTopicId == 0));
        }
        if (topics != null) {
            int size = topics.size();
            int i = 0;
            z = false;
            while (i < size) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i);
                i++;
                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                if (!this.bot || tL_forumTopic2.id != 1) {
                    if (!this.excludeTopics.contains(Integer.valueOf(tL_forumTopic2.id))) {
                        boolean z3 = tL_forumTopic2.pinned;
                        if (!z3 && z) {
                            universalAdapter.reorderSectionEnd();
                            z = false;
                        } else if (z3 && !z) {
                            universalAdapter.reorderSectionStart();
                            z = true;
                        }
                        arrayList.add(VerticalTabView.Factory.asTab(this.dialogId, tL_forumTopic2, this.mono).setChecked(this.currentTopicId == getTopicId(tL_forumTopic2)));
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
        if (this.bot || this.mono) {
            return;
        }
        if ((chat == null || !ChatObject.canCreateTopic(chat)) && !UserObject.isBotForumWithEditableTopics(user)) {
            return;
        }
        arrayList.add(VerticalTabView.Factory.asAdd(false));
    }

    public void fillHorizontalTabs(ArrayList arrayList, UniversalAdapter universalAdapter) {
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId));
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
        TopicsController topicsController = MessagesController.getInstance(this.currentAccount).getTopicsController();
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(-this.dialogId);
        boolean z = false;
        arrayList.add(HorizontalTabView.Factory.asAll(this.bot, this.mono).setChecked(this.currentTopicId == 0));
        if (topics != null) {
            int size = topics.size();
            int i = 0;
            boolean z2 = false;
            while (i < size) {
                TLRPC.TL_forumTopic tL_forumTopic = topics.get(i);
                i++;
                TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                if (!this.bot || tL_forumTopic2.id != 1) {
                    if (!this.excludeTopics.contains(Integer.valueOf(tL_forumTopic2.id))) {
                        boolean z3 = tL_forumTopic2.pinned;
                        if (!z3 && z2) {
                            if (!arrayList.isEmpty()) {
                                ((UItem) arrayList.get(arrayList.size() - 1)).flags |= 8;
                            }
                            universalAdapter.reorderSectionEnd();
                            z2 = false;
                        } else if (z3 && !z2) {
                            universalAdapter.reorderSectionStart();
                            z2 = true;
                        }
                        arrayList.add(HorizontalTabView.Factory.asTab(this.dialogId, tL_forumTopic2, this.mono).setChecked(this.currentTopicId == getTopicId(tL_forumTopic2)));
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
        if (this.bot || this.mono) {
            return;
        }
        if ((chat == null || !ChatObject.canCreateTopic(chat)) && !UserObject.isBotForumWithEditableTopics(user)) {
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
        Utilities.Callback2 callback3 = this.onTopicSelected;
        if (callback3 != null) {
            callback3.run(Integer.valueOf(uItem.id), Boolean.FALSE);
        }
    }

    public boolean onTabLongClick(UItem uItem, View view, int i, float f, float f2) {
        long j;
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
        final TLRPC.Chat chat2 = j2 < 0 ? messagesController.getChat(Long.valueOf(-j2)) : null;
        long j3 = this.dialogId;
        TLRPC.User user2 = j3 > 0 ? messagesController.getUser(Long.valueOf(j3)) : null;
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.fragment, view, true);
        if (ChatObject.isMonoForum(chat2)) {
            final long peerDialogId = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
            if (peerDialogId == 0 || !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                return false;
            }
            TLRPC.Chat chat3 = chat2;
            itemOptionsMakeOptions.add(R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory), new Runnable() {
                @Override
                public final void run() {
                    TopicsTabsView.$r8$lambda$H3pg8oaliy71k8nUnLqYB3e0N5s(this.f$0, itemOptionsMakeOptions, peerDialogId, chat2);
                }
            });
            long j4 = chat3.id;
            if (ChatObject.isMonoForum(chat3) && ChatObject.canManageMonoForum(this.currentAccount, chat3)) {
                long j5 = chat3.linked_monoforum_id;
                if (j5 != 0) {
                    j = j5;
                }
                chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
                user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                if (user != null && ChatObject.canBlockUsers(chat)) {
                    itemOptionsMakeOptions.add(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), (Runnable) null);
                    final ActionBarMenuSubItem last = itemOptionsMakeOptions.getLast();
                    last.setVisibility(8);
                    final long j6 = j;
                    MessagesController.getInstance(this.currentAccount).checkIsInChat(true, chat, user, new MessagesController.IsInChatCheckedCallback() {
                        @Override
                        public final void run(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
                            TopicsTabsView.$r8$lambda$CHEE0iteoykqD1u0nq_vfkeDmI4(this.f$0, last, itemOptionsMakeOptions, j6, user, chat, z, tL_chatAdminRights, str);
                        }
                    });
                }
            }
            j = j4;
            chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                itemOptionsMakeOptions.add(R.drawable.msg_remove, LocaleController.getString(R.string.BanUserMonoforum), (Runnable) null);
                final ActionBarMenuSubItem last2 = itemOptionsMakeOptions.getLast();
                last2.setVisibility(8);
                final long j7 = j;
                MessagesController.getInstance(this.currentAccount).checkIsInChat(true, chat, user, new MessagesController.IsInChatCheckedCallback() {
                    @Override
                    public final void run(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
                        TopicsTabsView.$r8$lambda$CHEE0iteoykqD1u0nq_vfkeDmI4(this.f$0, last2, itemOptionsMakeOptions, j7, user, chat, z, tL_chatAdminRights, str);
                    }
                });
            }
        } else {
            TLRPC.Chat chat4 = chat2;
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user2)) {
                boolean z = tL_forumTopic.pinned;
                itemOptionsMakeOptions.add(z ? R.drawable.msg_unpin : R.drawable.msg_pin, LocaleController.getString(z ? R.string.DialogUnpin : R.string.DialogPin), new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.$r8$lambda$pqwEVMPm1UjEaaFUSeApc4D0y78(this.f$0, itemOptionsMakeOptions, messagesController, tL_forumTopic);
                    }
                });
                if (tL_forumTopic.pinned) {
                    itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.FilterReorder), new Runnable() {
                        @Override
                        public final void run() {
                            TopicsTabsView.$r8$lambda$H_PX4rLQwsiyGCicQEU78JRZFso(this.f$0);
                        }
                    });
                }
            }
            if (ChatObject.canManageTopics(chat4) || UserObject.isBotForumWithEditableTopics(user2)) {
                itemOptionsMakeOptions.add(R.drawable.outline_profile_edit_24, LocaleController.getString(R.string.EditTopic), new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.$r8$lambda$0bkULLEAuZg9k06eb2dTmzKDyeA(this.f$0, itemOptionsMakeOptions, tL_forumTopic);
                    }
                });
            }
            final ItemOptions itemOptionsAddAsItemOptions = ChatNotificationsPopupWrapper.addAsItemOptions(this.fragment, itemOptionsMakeOptions, this.dialogId, tL_forumTopic.id);
            boolean zIsDialogMuted = messagesController.isDialogMuted(this.dialogId, tL_forumTopic.id);
            itemOptionsMakeOptions.add(zIsDialogMuted ? R.drawable.msg_unmute : R.drawable.msg_mute, LocaleController.getString(zIsDialogMuted ? R.string.Unmute : R.string.Mute), new Runnable() {
                @Override
                public final void run() {
                    TopicsTabsView.$r8$lambda$htwAUMZ30Grzge039tXNQqnqgnI(this.f$0, messagesController, tL_forumTopic, itemOptionsMakeOptions, itemOptionsAddAsItemOptions);
                }
            });
            if (ChatObject.canManageTopic(this.currentAccount, chat4, tL_forumTopic) && !UserObject.isBotForum(user2)) {
                boolean z2 = tL_forumTopic.closed;
                itemOptionsMakeOptions.add(z2 ? R.drawable.msg_topic_restart : R.drawable.msg_topic_close, LocaleController.getString(z2 ? R.string.RestartTopic : R.string.CloseTopic), new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.$r8$lambda$OKOumX3GJZh5HAalSTnlZuV7xpc(this.f$0, itemOptionsMakeOptions, tL_forumTopic);
                    }
                });
            }
            if (ChatObject.canDeleteTopic(this.currentAccount, chat4, tL_forumTopic)) {
                itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getPluralString("DeleteTopics", 1), new Runnable() {
                    @Override
                    public final void run() {
                        TopicsTabsView.m2901$r8$lambda$xefYQ3LMmbHgrxWAmYharA3yVQ(this.f$0, itemOptionsMakeOptions, tL_forumTopic);
                    }
                });
            }
        }
        if (view instanceof HorizontalTabView) {
            itemOptionsMakeOptions.setScrimViewBackground(new Drawable() {
                private Paint paint = new Paint(1);
                private RectF bound = new RectF();

                @Override
                public int getOpacity() {
                    return -2;
                }

                @Override
                public void setColorFilter(ColorFilter colorFilter) {
                }

                {
                    this.paint.setColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground, TopicsTabsView.this.resourcesProvider));
                }

                @Override
                public void draw(Canvas canvas) {
                    this.bound.set(getBounds());
                    this.bound.inset(AndroidUtilities.dp(1.0f), (this.bound.height() - AndroidUtilities.dp(28.0f)) / 2.0f);
                    canvas.drawRoundRect(this.bound, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.paint);
                }

                @Override
                public void setAlpha(int i2) {
                    this.paint.setAlpha(i2);
                }
            });
            itemOptionsMakeOptions.translate(AndroidUtilities.dp(16.0f), 0.0f);
        } else {
            itemOptionsMakeOptions.setScrimViewBackground(Theme.createRoundRectDrawable(0, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), 0, Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)));
        }
        itemOptionsMakeOptions.show();
        return true;
    }

    public static void $r8$lambda$H3pg8oaliy71k8nUnLqYB3e0N5s(final TopicsTabsView topicsTabsView, ItemOptions itemOptions, final long j, TLRPC.Chat chat) {
        topicsTabsView.getClass();
        itemOptions.dismiss();
        TLRPC.User user = MessagesController.getInstance(topicsTabsView.currentAccount).getUser(Long.valueOf(j));
        if (user != null) {
            AlertsCreator.createClearDaysDialogAlert(topicsTabsView.fragment, -1, user, chat, true, new MessagesStorage.BooleanCallback() {
                @Override
                public final void run(boolean z) {
                    TopicsTabsView.$r8$lambda$j9bSSRoBD7GWgREN02JpHt3eE0w(this.f$0, j, z);
                }
            }, topicsTabsView.fragment.getResourceProvider());
        }
    }

    public static void $r8$lambda$j9bSSRoBD7GWgREN02JpHt3eE0w(TopicsTabsView topicsTabsView, long j, boolean z) {
        BaseFragment baseFragment = topicsTabsView.fragment;
        if (baseFragment instanceof ChatActivity) {
            ((ChatActivity) baseFragment).performHistoryClear(j, false, true);
        }
    }

    public static void $r8$lambda$CHEE0iteoykqD1u0nq_vfkeDmI4(final TopicsTabsView topicsTabsView, final ActionBarMenuSubItem actionBarMenuSubItem, final ItemOptions itemOptions, final long j, final TLRPC.User user, final TLRPC.Chat chat, final boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        topicsTabsView.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.$r8$lambda$M7WNlu3iI_DVX_SgSEj9sKBOh7A(this.f$0, z, actionBarMenuSubItem, itemOptions, j, user, chat);
            }
        });
    }

    public static void $r8$lambda$M7WNlu3iI_DVX_SgSEj9sKBOh7A(final TopicsTabsView topicsTabsView, boolean z, ActionBarMenuSubItem actionBarMenuSubItem, final ItemOptions itemOptions, final long j, final TLRPC.User user, final TLRPC.Chat chat) {
        topicsTabsView.getClass();
        final boolean z2 = !z;
        actionBarMenuSubItem.setVisibility(0);
        actionBarMenuSubItem.setText(LocaleController.getString(!z ? R.string.UnbanUserMonoforum : R.string.BanUserMonoforum));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TopicsTabsView.$r8$lambda$9Dgzy8NZ8X8PbgIJ5oU8CK4Pgek(this.f$0, itemOptions, z2, j, user, chat, view);
            }
        });
    }

    public static void $r8$lambda$9Dgzy8NZ8X8PbgIJ5oU8CK4Pgek(final TopicsTabsView topicsTabsView, ItemOptions itemOptions, boolean z, long j, TLRPC.User user, TLRPC.Chat chat, View view) {
        topicsTabsView.getClass();
        itemOptions.dismiss();
        if (!z) {
            MessagesController.getInstance(topicsTabsView.currentAccount).deleteParticipantFromChat(j, user, (TLRPC.Chat) null, false, false);
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = MessagesController.getInputPeer(user);
        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        ConnectionsManager.getInstance(topicsTabsView.currentAccount).sendRequest(tL_channels_editBanned, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                TopicsTabsView.$r8$lambda$CqwX8pfku09eHuRDy6_JO9_d5QM(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$CqwX8pfku09eHuRDy6_JO9_d5QM(final TopicsTabsView topicsTabsView, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        topicsTabsView.getClass();
        if (tLObject != null) {
            final TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(topicsTabsView.currentAccount).processUpdates(updates, false);
            if (updates.chats.isEmpty()) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TopicsTabsView.m2902$r8$lambda$zIF3WS6gBDJ7yjSwFuk0hefuu4(this.f$0, updates);
                }
            }, 1000L);
        }
    }

    public static void m2902$r8$lambda$zIF3WS6gBDJ7yjSwFuk0hefuu4(TopicsTabsView topicsTabsView, TLRPC.Updates updates) {
        topicsTabsView.getClass();
        MessagesController.getInstance(topicsTabsView.currentAccount).loadFullChat(updates.chats.get(0).id, 0, true);
    }

    public static void $r8$lambda$pqwEVMPm1UjEaaFUSeApc4D0y78(TopicsTabsView topicsTabsView, ItemOptions itemOptions, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic) {
        topicsTabsView.getClass();
        itemOptions.dismiss();
        messagesController.getTopicsController().pinTopic(-topicsTabsView.dialogId, tL_forumTopic.id, !tL_forumTopic.pinned, topicsTabsView.fragment);
    }

    public static void $r8$lambda$H_PX4rLQwsiyGCicQEU78JRZFso(TopicsTabsView topicsTabsView) {
        topicsTabsView.sideTabs.allowReorder(true);
        topicsTabsView.topTabs.allowReorder(true);
        topicsTabsView.animatorCloseButtonVisibility.setValue(true, true);
        AndroidUtilities.updateVisibleRows(topicsTabsView.topTabs);
        AndroidUtilities.updateVisibleRows(topicsTabsView.sideTabs);
    }

    public static void $r8$lambda$0bkULLEAuZg9k06eb2dTmzKDyeA(TopicsTabsView topicsTabsView, ItemOptions itemOptions, TLRPC.TL_forumTopic tL_forumTopic) {
        topicsTabsView.getClass();
        itemOptions.dismiss();
        topicsTabsView.fragment.presentFragment(TopicCreateFragment.create(-topicsTabsView.dialogId, tL_forumTopic.id));
    }

    public static void $r8$lambda$htwAUMZ30Grzge039tXNQqnqgnI(TopicsTabsView topicsTabsView, MessagesController messagesController, TLRPC.TL_forumTopic tL_forumTopic, ItemOptions itemOptions, ItemOptions itemOptions2) {
        if (messagesController.isDialogMuted(topicsTabsView.dialogId, tL_forumTopic.id)) {
            itemOptions.dismiss();
            NotificationsController.getInstance(topicsTabsView.currentAccount).muteDialog(topicsTabsView.dialogId, tL_forumTopic.id, false);
            if (BulletinFactory.canShowBulletin(topicsTabsView.fragment)) {
                BulletinFactory.createMuteBulletin(topicsTabsView.fragment, 4, 0, topicsTabsView.resourcesProvider).show();
                return;
            }
            return;
        }
        itemOptions.openSwipeback(itemOptions2);
    }

    public static void $r8$lambda$OKOumX3GJZh5HAalSTnlZuV7xpc(TopicsTabsView topicsTabsView, ItemOptions itemOptions, TLRPC.TL_forumTopic tL_forumTopic) {
        topicsTabsView.getClass();
        itemOptions.dismiss();
        MessagesController.getInstance(topicsTabsView.currentAccount).getTopicsController().toggleCloseTopic(-topicsTabsView.dialogId, tL_forumTopic.id, !tL_forumTopic.closed);
    }

    public static void m2901$r8$lambda$xefYQ3LMmbHgrxWAmYharA3yVQ(TopicsTabsView topicsTabsView, ItemOptions itemOptions, TLRPC.TL_forumTopic tL_forumTopic) {
        topicsTabsView.getClass();
        itemOptions.dismiss();
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(tL_forumTopic.id));
        topicsTabsView.deleteTopics(hashSet, new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.$r8$lambda$whz9_2q0Ul6L4zdHpqUqnJxFQVc();
            }
        });
    }

    public TLRPC.TL_forumTopic getTopic(long j) {
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-this.dialogId);
        if (topics == null) {
            return null;
        }
        int size = topics.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_forumTopic tL_forumTopic = topics.get(i);
            i++;
            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
            if (tL_forumTopic2.id == j) {
                return tL_forumTopic2;
            }
        }
        return null;
    }

    public void setCurrentTopic(long j) {
        this.currentTopicId = j;
        this.topTabs.adapter.update(true);
        this.topTabs.invalidate();
        this.sideTabs.adapter.update(true);
        VerticalTabView verticalTabView = this.botCreateTopicButtonVertical;
        if (verticalTabView != null) {
            verticalTabView.setAll(true, false, j == 0);
        }
        HorizontalTabView horizontalTabView = this.botCreateTopicButtonHorizontal;
        if (horizontalTabView != null) {
            horizontalTabView.setAll(true, false, j == 0);
        }
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
        Utilities.Callback2 callback3 = this.onTopicSelected;
        if (callback3 != null) {
            callback3.run(Integer.valueOf((int) j), Boolean.valueOf(z));
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
                    Canvas canvas2;
                    float f;
                    float f2;
                    float fIsNotEmpty = VerticalTabView.this.counterText.isNotEmpty();
                    boolean z = fIsNotEmpty > 0.0f;
                    float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, fIsNotEmpty) * VerticalTabView.this.countScale;
                    float fDp = AndroidUtilities.dp(10.0f);
                    float fDp2 = AndroidUtilities.dp(8.33f);
                    float width = (getWidth() / 2.0f) + AndroidUtilities.dp(12.0f);
                    float fDp3 = AndroidUtilities.dp(12.0f);
                    float fMax = Math.max(fDp2 + fDp2, VerticalTabView.this.counterText.getCurrentWidth() + AndroidUtilities.dp(10.0f));
                    if (z) {
                        f = fDp3;
                        f2 = 2.0f;
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    } else {
                        canvas2 = canvas;
                        f = fDp3;
                        f2 = 2.0f;
                    }
                    super.dispatchDraw(canvas);
                    if (z) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f3 = fMax / f2;
                        rectF.set((width - f3) - AndroidUtilities.dp(1.33f), f - fDp, f3 + width + AndroidUtilities.dp(1.33f), f + fDp);
                        AndroidUtilities.scaleRect(rectF, fIsNotEmpty);
                        float f4 = fDp * fIsNotEmpty;
                        canvas2.drawRoundRect(rectF, f4, f4, this.clipPaint);
                        canvas2.restore();
                    }
                    if (fIsNotEmpty > 0.0f) {
                        canvas2.save();
                        canvas2.scale(fLerp, fLerp, width, f);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f5 = fMax / f2;
                        rectF2.set(width - f5, f - fDp2, width + f5, f + fDp2);
                        canvas2.drawRoundRect(rectF2, fDp2, fDp2, this.backgroundPaint.setByKey(VerticalTabView.this.counterBackgroundColorKey, fIsNotEmpty));
                        VerticalTabView.this.counterText.setBounds(rectF2);
                        VerticalTabView.this.counterText.setAlpha((int) (fIsNotEmpty * 255.0f));
                        VerticalTabView.this.counterText.draw(canvas2);
                        canvas2.restore();
                    }
                }
            };
            this.imageLayoutView = frameLayout;
            frameLayout.setWillNotDraw(false);
            frameLayout.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(34, 34, 17);
            this.imageViewParams = layoutParamsCreateFrame;
            frameLayout.addView(backupImageView, layoutParamsCreateFrame);
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
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_like_filled);
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
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_mention_filled_16);
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.counterAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TopicsTabsView.VerticalTabView.$r8$lambda$nUmeB4RAwrPjocveR25TZsEApvg(this.f$0, valueAnimator2);
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

        public static void $r8$lambda$nUmeB4RAwrPjocveR25TZsEApvg(VerticalTabView verticalTabView, ValueAnimator valueAnimator) {
            verticalTabView.getClass();
            verticalTabView.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            verticalTabView.imageLayoutView.invalidate();
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
            boolean z3 = z2;
            setCounter(MessagesController.getInstance(this.currentAccount).isDialogMuted(j, tL_forumTopic.id), tL_forumTopic.unread_count, tL_forumTopic.unread_mentions_count > 0, tL_forumTopic.unread_reactions_count > 0, z3);
            setPinned(tL_forumTopic.pinned, z3);
            updateState();
        }

        public void updateImageColor() {
            int iBlendARGB = ColorUtils.blendARGB(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider), Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), this.isAdd ? 1.0f : this.selectT);
            if (!this.staticImage) {
                this.imageView.setColorFilter(null);
            } else {
                this.imageView.setColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
            }
            this.imageView.setEmojiColorFilter(new PorterDuffColorFilter(iBlendARGB, PorterDuff.Mode.SRC_IN));
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.selectT, z ? 1.0f : 0.0f);
            this.selectAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TopicsTabsView.VerticalTabView.$r8$lambda$oLmUvK2qIKlO7Aj_gF3CkoVIUHw(this.f$0, valueAnimator2);
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

        public static void $r8$lambda$oLmUvK2qIKlO7Aj_gF3CkoVIUHw(VerticalTabView verticalTabView, ValueAnimator valueAnimator) {
            verticalTabView.getClass();
            verticalTabView.selectT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            verticalTabView.updateState();
            verticalTabView.updateImageColor();
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
            public VerticalTabView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
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
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = 0;
                uItemOfFactory.longValue = 0L;
                uItemOfFactory.object = null;
                uItemOfFactory.accent = z2;
                uItemOfFactory.flags = z ? 1 : 0;
                return uItemOfFactory;
            }

            public static UItem asAdd(boolean z) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = -2;
                uItemOfFactory.longValue = -2L;
                uItemOfFactory.object = null;
                uItemOfFactory.accent = z;
                return uItemOfFactory;
            }

            public static UItem asTab(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.dialogId = j;
                uItemOfFactory.id = tL_forumTopic.id;
                uItemOfFactory.object = tL_forumTopic;
                if (z) {
                    uItemOfFactory.longValue = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                    uItemOfFactory.withUsername = false;
                }
                return uItemOfFactory;
            }

            public static UItem asLoading(int i) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.red = true;
                uItemOfFactory.checked = false;
                return uItemOfFactory;
            }
        }
    }

    public static class HorizontalTabView extends FrameLayout {
        private int addW;
        private AvatarSpan avatarSpan;
        private ValueAnimator counterAnimator;
        private int counterBackgroundColorKey;
        private final AnimatedTextView.AnimatedTextDrawable counterText;
        private final View counterView;
        int counterViewX;
        private final int currentAccount;
        private final ImageView imageView;
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
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
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
            this.addW = 0;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            setClipChildren(false);
            setClipToPadding(false);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.textView = linksTextView;
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTypeface(AndroidUtilities.bold());
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, 19, 11.0f, 0.0f, 11.0f, 0.0f));
            ScaleStateListAnimator.apply(linksTextView);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            addView(imageView, LayoutHelper.createFrame(34, 34, 17));
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
                    float fIsNotEmpty = HorizontalTabView.this.counterText.isNotEmpty();
                    if (fIsNotEmpty > 0.0f) {
                        float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, fIsNotEmpty);
                        float fMax = Math.max(AndroidUtilities.dp(16.66f), HorizontalTabView.this.counterText.getCurrentWidth() + AndroidUtilities.dp(10.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, fMax, getHeight());
                        canvas.save();
                        canvas.scale(fLerp, fLerp, rectF.centerX(), rectF.centerY());
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.33f), AndroidUtilities.dp(8.33f), this.backgroundPaint.setByKey(HorizontalTabView.this.counterBackgroundColorKey).blendTo(HorizontalTabView.this.getTextColor(), HorizontalTabView.this.selectT).multAlpha(fIsNotEmpty));
                        HorizontalTabView.this.counterText.setBounds(rectF);
                        HorizontalTabView.this.counterText.setAlpha((int) (fIsNotEmpty * 255.0f));
                        HorizontalTabView.this.counterText.setTextColor(Theme.getColor(Theme.key_chats_unreadCounterText, this.val$resourcesProvider));
                        HorizontalTabView.this.counterText.draw(canvas);
                        canvas.restore();
                    }
                    super.dispatchDraw(canvas);
                }

                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(AndroidUtilities.dp(16.66f), HorizontalTabView.this.counterText.getAnimateToWidth() + AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.66f), 1073741824));
                }
            };
            this.counterView = view;
            addView(view, LayoutHelper.createFrame(-2, -2.0f, 21, 4.66f, 0.0f, 11.0f, 0.0f));
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
            int i6 = i4 - i2;
            int measuredWidth = (i5 - this.imageView.getMeasuredWidth()) / 2;
            int measuredHeight = (i6 - this.imageView.getMeasuredHeight()) / 2;
            ImageView imageView = this.imageView;
            imageView.layout(measuredWidth, measuredHeight, imageView.getMeasuredWidth() + measuredWidth, this.imageView.getMeasuredHeight() + measuredHeight);
            int i7 = i6 / 2;
            this.textView.layout(AndroidUtilities.dp(11.0f), i7 - (this.textView.getMeasuredHeight() / 2), AndroidUtilities.dp(11.0f) + this.textView.getMeasuredWidth(), (this.textView.getMeasuredHeight() / 2) + i7);
            if (this.counterText.getAnimateToWidth() > 0.0f) {
                this.counterView.layout((i5 - AndroidUtilities.dp(11.0f)) - this.counterView.getMeasuredWidth(), i7 - (this.counterView.getMeasuredHeight() / 2), i5 - AndroidUtilities.dp(11.0f), i7 + (this.counterView.getMeasuredHeight() / 2));
            } else {
                this.counterView.layout(AndroidUtilities.dp(11.0f) + this.textView.getMeasuredWidth() + AndroidUtilities.dp(4.66f), i7 - (this.counterView.getMeasuredHeight() / 2), AndroidUtilities.dp(11.0f) + this.textView.getMeasuredWidth() + AndroidUtilities.dp(4.66f) + this.counterView.getMeasuredWidth(), i7 + (this.counterView.getMeasuredHeight() / 2));
            }
            if (this.counterViewX != 0 && this.counterView.getLeft() != this.counterViewX) {
                View view = this.counterView;
                view.setTranslationX((-view.getLeft()) + this.counterViewX);
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
            this.imageView.setVisibility(z ? 0 : 8);
            if (z) {
                BotNewTopicDrawable botNewTopicDrawable = new BotNewTopicDrawable(getContext());
                botNewTopicDrawable.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider));
                this.imageView.setImageDrawable(botNewTopicDrawable);
            }
            this.textView.setText(LocaleController.getString(z ? R.string.BotForumNewTopic : R.string.AllTopicsShort));
            this.textView.setVisibility(z ? 8 : 0);
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
            this.imageView.setVisibility(8);
            this.textView.setVisibility(0);
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
            this.imageView.setVisibility(8);
            this.textView.setVisibility(0);
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
            this.imageView.setVisibility(8);
            this.textView.setVisibility(0);
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
            boolean z3 = z2;
            setCounter(MessagesController.getInstance(this.currentAccount).isDialogMuted(j, this.topicId), tL_forumTopic.unread_count, false, false, z3);
            setPinned(tL_forumTopic.pinned, z3);
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
            this.imageView.setVisibility(8);
            this.textView.setVisibility(0);
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.selectT, z ? 1.0f : 0.0f);
            this.selectAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TopicsTabsView.HorizontalTabView.m2903$r8$lambda$TDsOFi3FwdP_MUlURVFg_7rA(this.f$0, valueAnimator2);
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

        public static void m2903$r8$lambda$TDsOFi3FwdP_MUlURVFg_7rA(HorizontalTabView horizontalTabView, ValueAnimator valueAnimator) {
            horizontalTabView.getClass();
            horizontalTabView.selectT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            horizontalTabView.updateTextColor();
        }

        private void setCounter(boolean z, int i, boolean z2, boolean z3, boolean z4) {
            if (z3) {
                this.counterBackgroundColorKey = Theme.key_dialogReactionMentionBackground;
                if (this.reactionString == null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("❤️");
                    ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_like_filled);
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
                    ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.mini_mention_filled_16);
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.counterAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TopicsTabsView.HorizontalTabView.$r8$lambda$CAUY9cu7iJQQ5ROLvCeKkqJLX6E(this.f$0, valueAnimator2);
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

        public static void $r8$lambda$CAUY9cu7iJQQ5ROLvCeKkqJLX6E(HorizontalTabView horizontalTabView, ValueAnimator valueAnimator) {
            horizontalTabView.counterView.setScaleX(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            horizontalTabView.counterView.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            horizontalTabView.counterView.invalidate();
        }

        private int getMeasuringWidth() {
            return AndroidUtilities.dp(11.0f) + this.textView.getMeasuredWidth() + (this.counterText.getAnimateToWidth() > 0.0f ? AndroidUtilities.dp(4.66f) + ((int) Math.max(AndroidUtilities.dp(16.66f), this.counterText.getAnimateToWidth() + AndroidUtilities.dp(10.0f))) : 0) + AndroidUtilities.dp(11.0f) + this.addW;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            this.textView.measure(i, i2);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(getMeasuringWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), 1073741824));
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public HorizontalTabView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
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
                horizontalTabView.addW = BitwiseUtils.hasFlag(uItem.flags, 8) ? AndroidUtilities.dp(10.0f) : 0;
                if (universalRecyclerView != null && universalRecyclerView.isReorderAllowed() && horizontalTabView.pinned) {
                    z2 = true;
                }
                horizontalTabView.setReorder(z2);
            }

            public static UItem asAll(boolean z, boolean z2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = 0;
                uItemOfFactory.longValue = 0L;
                uItemOfFactory.object = null;
                uItemOfFactory.accent = z2;
                return uItemOfFactory;
            }

            public static UItem asTab(long j, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.dialogId = j;
                uItemOfFactory.id = tL_forumTopic.id;
                uItemOfFactory.object = tL_forumTopic;
                if (z) {
                    uItemOfFactory.longValue = DialogObject.getPeerDialogId(tL_forumTopic.from_id);
                    uItemOfFactory.withUsername = false;
                }
                return uItemOfFactory;
            }

            public static UItem asLoading(int i) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.red = true;
                return uItemOfFactory;
            }

            public static UItem asAdd() {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = -2;
                uItemOfFactory.longValue = -2L;
                uItemOfFactory.object = null;
                return uItemOfFactory;
            }
        }
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        checkUi_topicsVerticalPosition();
    }

    public void setAllTopicsHidden(boolean z) {
        if (this.allTopicsHidden != z) {
            this.allTopicsHidden = z;
            checkTopicsVisibility(true);
        }
    }

    private void deleteTopics(final HashSet hashSet, final Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.getPluralString("DeleteTopics", hashSet.size()));
        final ArrayList arrayList = new ArrayList(hashSet);
        final long j = this.currentTopicId;
        if (hashSet.size() == 1) {
            builder.setMessage(LocaleController.formatString(R.string.DeleteSelectedTopic, MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(-this.dialogId, ((Integer) arrayList.get(0)).intValue()).title));
        } else {
            builder.setMessage(LocaleController.getString(R.string.DeleteSelectedTopics));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                TopicsTabsView.$r8$lambda$mNQdYxCjpevtYZt4zGmssfjlZ8U(this.f$0, arrayList, j, hashSet, runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void $r8$lambda$mNQdYxCjpevtYZt4zGmssfjlZ8U(final TopicsTabsView topicsTabsView, final ArrayList arrayList, final long j, final HashSet hashSet, final Runnable runnable, AlertDialog alertDialog, int i) {
        topicsTabsView.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (j == ((Integer) obj).intValue()) {
                topicsTabsView.selectTopic(0L, false);
            }
        }
        topicsTabsView.excludeTopics.addAll(hashSet);
        topicsTabsView.updateTabs();
        BulletinFactory.of(topicsTabsView.fragment).createUndoBulletin(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.m2896$r8$lambda$J9vP3WN3JX9LdWejzzbScFixRI(this.f$0, hashSet, arrayList, j);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                TopicsTabsView.$r8$lambda$1m4OhoONJqhkVLEuLvPndGXLWUo(this.f$0, arrayList, runnable);
            }
        }).show();
        alertDialog.dismiss();
    }

    public static void m2896$r8$lambda$J9vP3WN3JX9LdWejzzbScFixRI(TopicsTabsView topicsTabsView, HashSet hashSet, ArrayList arrayList, long j) {
        topicsTabsView.excludeTopics.removeAll(hashSet);
        topicsTabsView.updateTabs();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long jIntValue = ((Integer) obj).intValue();
            if (j == jIntValue) {
                topicsTabsView.selectTopic(jIntValue, false);
                return;
            }
        }
    }

    public static void $r8$lambda$1m4OhoONJqhkVLEuLvPndGXLWUo(TopicsTabsView topicsTabsView, ArrayList arrayList, Runnable runnable) {
        MessagesController.getInstance(topicsTabsView.currentAccount).getTopicsController().deleteTopics(-topicsTabsView.dialogId, arrayList);
        runnable.run();
    }

    private long getTopicId(TLRPC.TL_forumTopic tL_forumTopic) {
        return this.mono ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
    }

    private static class BotNewTopicDrawable extends Drawable {
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
        protected void onBoundsChange(Rect rect) {
            super.onBoundsChange(rect);
            this.rectF.set(rect);
            int iCenterX = rect.centerX() - AndroidUtilities.dp(12.0f);
            int iCenterY = rect.centerY() - AndroidUtilities.dp(12.0f);
            this.drawable.setBounds(iCenterX, iCenterY, AndroidUtilities.dp(24.0f) + iCenterX, AndroidUtilities.dp(24.0f) + iCenterY);
        }

        @Override
        public void setAlpha(int i) {
            this.paint.setAlpha(i);
            this.drawable.setAlpha(i);
        }
    }

    private static int getTabsSize(Position position) {
        return AndroidUtilities.dp(position == Position.LEFT ? 64.0f : 36.0f);
    }

    public float getSideMenuT() {
        return this.sidemenuT * this.animatorTopicsVisibility.getFloatValue();
    }

    public boolean isSideMenuEnabled() {
        return this.sidemenuEnabled && this.animatorTopicsVisibility.getValue();
    }

    private float getTabsVisibility(Position position) {
        float floatValue = this.animatorTopicsVisibility.getFloatValue();
        if (position == Position.LEFT) {
            return this.sidemenuT * floatValue;
        }
        if ((position != Position.TOP || this.topicBottom) && !(position == Position.BOTTOM && this.topicBottom)) {
            return 0.0f;
        }
        return (1.0f - this.sidemenuT) * floatValue;
    }

    public Position getCurrentTabsPosition() {
        if (this.sidemenuEnabled) {
            return Position.LEFT;
        }
        return this.topicBottom ? Position.BOTTOM : Position.TOP;
    }

    public float getTabsVisibleSpaceWithPadding(Position position, float f) {
        return (getTabsSize(position) + f) * getTabsVisibility(position);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        updateSidemenuPosition();
    }
}

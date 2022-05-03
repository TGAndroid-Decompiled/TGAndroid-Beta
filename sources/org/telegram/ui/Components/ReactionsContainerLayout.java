package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$TL_availableReaction;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;

public class ReactionsContainerLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final Property<ReactionsContainerLayout, Float> TRANSITION_PROGRESS_VALUE = new Property<ReactionsContainerLayout, Float>(Float.class, "transitionProgress") {
        public Float get(ReactionsContainerLayout reactionsContainerLayout) {
            return Float.valueOf(reactionsContainerLayout.transitionProgress);
        }

        public void set(ReactionsContainerLayout reactionsContainerLayout, Float f) {
            reactionsContainerLayout.setTransitionProgress(f.floatValue());
        }
    };
    private final boolean animationEnabled;
    private float bigCircleRadius;
    ValueAnimator cancelPressedAnimation;
    private float cancelPressedProgress;
    private boolean clicked;
    private int currentAccount;
    private ReactionsContainerDelegate delegate;
    long lastReactionSentTime;
    private float leftAlpha;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView.Adapter listAdapter;
    private MessageObject messageObject;
    private float otherViewsScale;
    private float pressedProgress;
    private String pressedReaction;
    private int pressedReactionPosition;
    private float pressedViewScale;
    public final RecyclerListView recyclerListView;
    Theme.ResourcesProvider resourcesProvider;
    private float rightAlpha;
    private Drawable shadow;
    private float smallCircleRadius;
    private long waitingLoadingChatId;
    private Paint bgPaint = new Paint(1);
    private Paint leftShadowPaint = new Paint(1);
    private Paint rightShadowPaint = new Paint(1);
    private float transitionProgress = 1.0f;
    private RectF rect = new RectF();
    private Path mPath = new Path();
    private float radius = AndroidUtilities.dp(72.0f);
    private int bigCircleOffset = AndroidUtilities.dp(36.0f);
    private List<TLRPC$TL_availableReaction> reactionsList = Collections.emptyList();
    private int[] location = new int[2];
    private Rect shadowPad = new Rect();
    HashSet<View> lastVisibleViews = new HashSet<>();
    HashSet<View> lastVisibleViewsTmp = new HashSet<>();

    public interface ReactionsContainerDelegate {
        void onReactionClicked(View view, TLRPC$TL_availableReaction tLRPC$TL_availableReaction, boolean z);
    }

    public ReactionsContainerLayout(final Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        boolean z = true;
        float dp = AndroidUtilities.dp(8.0f);
        this.bigCircleRadius = dp;
        this.smallCircleRadius = dp / 2.0f;
        new ArrayList();
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i;
        this.animationEnabled = (!MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) || SharedConfig.getDevicePerformanceClass() == 0) ? false : z;
        this.shadow = ContextCompat.getDrawable(context, R.drawable.reactions_bubble_shadow).mutate();
        Rect rect = this.shadowPad;
        int dp2 = AndroidUtilities.dp(7.0f);
        rect.bottom = dp2;
        rect.right = dp2;
        rect.top = dp2;
        rect.left = dp2;
        this.shadow.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_messagePanelShadow"), PorterDuff.Mode.MULTIPLY));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (ReactionsContainerLayout.this.pressedReaction == null || !((ReactionHolderView) view).currentReaction.reaction.equals(ReactionsContainerLayout.this.pressedReaction)) {
                    return super.drawChild(canvas, view, j);
                }
                return true;
            }
        };
        this.recyclerListView = recyclerListView;
        this.linearLayoutManager = new LinearLayoutManager(context, 0, false);
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect2, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect2, view, recyclerView, state);
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == 0) {
                    rect2.left = AndroidUtilities.dp(6.0f);
                }
                rect2.right = AndroidUtilities.dp(4.0f);
                if (childAdapterPosition == ReactionsContainerLayout.this.listAdapter.getItemCount() - 1) {
                    rect2.right = AndroidUtilities.dp(6.0f);
                }
            }
        });
        recyclerListView.setLayoutManager(this.linearLayoutManager);
        recyclerListView.setOverScrollMode(2);
        RecyclerView.Adapter adapter = new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
                ReactionHolderView reactionHolderView = new ReactionHolderView(context);
                int paddingTop = (ReactionsContainerLayout.this.getLayoutParams().height - ReactionsContainerLayout.this.getPaddingTop()) - ReactionsContainerLayout.this.getPaddingBottom();
                reactionHolderView.setLayoutParams(new RecyclerView.LayoutParams(paddingTop - AndroidUtilities.dp(12.0f), paddingTop));
                return new RecyclerListView.Holder(reactionHolderView);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                ReactionHolderView reactionHolderView = (ReactionHolderView) viewHolder.itemView;
                reactionHolderView.setScaleX(1.0f);
                reactionHolderView.setScaleY(1.0f);
                reactionHolderView.setReaction((TLRPC$TL_availableReaction) ReactionsContainerLayout.this.reactionsList.get(i2));
            }

            @Override
            public int getItemCount() {
                return ReactionsContainerLayout.this.reactionsList.size();
            }
        };
        this.listAdapter = adapter;
        recyclerListView.setAdapter(adapter);
        recyclerListView.addOnScrollListener(new LeftRightShadowsListener());
        recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (recyclerView.getChildCount() > 2) {
                    recyclerView.getLocationInWindow(ReactionsContainerLayout.this.location);
                    int i4 = ReactionsContainerLayout.this.location[0];
                    View childAt = recyclerView.getChildAt(0);
                    childAt.getLocationInWindow(ReactionsContainerLayout.this.location);
                    float min = ((1.0f - Math.min(1.0f, (-Math.min(ReactionsContainerLayout.this.location[0] - i4, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min)) {
                        min = 1.0f;
                    }
                    ((ReactionHolderView) childAt).sideScale = min;
                    View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                    childAt2.getLocationInWindow(ReactionsContainerLayout.this.location);
                    float min2 = ((1.0f - Math.min(1.0f, (-Math.min((i4 + recyclerView.getWidth()) - (ReactionsContainerLayout.this.location[0] + childAt2.getWidth()), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                    if (Float.isNaN(min2)) {
                        min2 = 1.0f;
                    }
                    ((ReactionHolderView) childAt2).sideScale = min2;
                }
                for (int i5 = 1; i5 < ReactionsContainerLayout.this.recyclerListView.getChildCount() - 1; i5++) {
                    ((ReactionHolderView) ReactionsContainerLayout.this.recyclerListView.getChildAt(i5)).sideScale = 1.0f;
                }
                ReactionsContainerLayout.this.invalidate();
            }
        });
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect2, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == 0) {
                    rect2.left = AndroidUtilities.dp(8.0f);
                }
                if (childAdapterPosition == ReactionsContainerLayout.this.listAdapter.getItemCount() - 1) {
                    rect2.right = AndroidUtilities.dp(8.0f);
                }
            }
        });
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        invalidateShaders();
        this.bgPaint.setColor(Theme.getColor("actionBarDefaultSubmenuBackground", resourcesProvider));
    }

    public void setDelegate(ReactionsContainerDelegate reactionsContainerDelegate) {
        this.delegate = reactionsContainerDelegate;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void setReactionsList(List<TLRPC$TL_availableReaction> list) {
        this.reactionsList = list;
        if (((getLayoutParams().height - getPaddingTop()) - getPaddingBottom()) * list.size() < AndroidUtilities.dp(200.0f)) {
            getLayoutParams().width = -2;
        }
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        this.lastVisibleViewsTmp.clear();
        this.lastVisibleViewsTmp.addAll(this.lastVisibleViews);
        this.lastVisibleViews.clear();
        if (this.pressedReaction != null) {
            float f5 = this.pressedProgress;
            if (f5 != 1.0f) {
                float f6 = f5 + 0.010666667f;
                this.pressedProgress = f6;
                if (f6 >= 1.0f) {
                    this.pressedProgress = 1.0f;
                }
                invalidate();
            }
        }
        float max = (Math.max(0.25f, Math.min(this.transitionProgress, 1.0f)) - 0.25f) / 0.75f;
        float f7 = this.bigCircleRadius * max;
        float f8 = this.smallCircleRadius * max;
        float f9 = this.pressedProgress;
        this.pressedViewScale = (f9 * 2.0f) + 1.0f;
        this.otherViewsScale = 1.0f - (f9 * 0.15f);
        int save = canvas.save();
        if (LocaleController.isRTL) {
            f2 = getWidth();
            f = 0.125f;
        } else {
            f2 = getWidth();
            f = 0.875f;
        }
        float f10 = f2 * f;
        float f11 = this.transitionProgress;
        if (f11 <= 0.75f) {
            float f12 = f11 / 0.75f;
            canvas.scale(f12, f12, f10, getHeight() / 2.0f);
        }
        if (LocaleController.isRTL) {
            f3 = Math.max(0.25f, this.transitionProgress);
            f4 = 0.0f;
        } else {
            f4 = 1.0f - Math.max(0.25f, this.transitionProgress);
            f3 = 1.0f;
        }
        this.rect.set(getPaddingLeft() + ((getWidth() - getPaddingRight()) * f4), getPaddingTop() + (this.recyclerListView.getMeasuredHeight() * (1.0f - this.otherViewsScale)), (getWidth() - getPaddingRight()) * f3, getHeight() - getPaddingBottom());
        this.radius = this.rect.height() / 2.0f;
        Drawable drawable = this.shadow;
        int width = getWidth() - getPaddingRight();
        Rect rect = this.shadowPad;
        drawable.setBounds((int) ((getPaddingLeft() + ((width + rect.right) * f4)) - rect.left), getPaddingTop() - this.shadowPad.top, (int) (((getWidth() - getPaddingRight()) + this.shadowPad.right) * f3), (getHeight() - getPaddingBottom()) + this.shadowPad.bottom);
        this.shadow.draw(canvas);
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        float f13 = this.transitionProgress;
        if (f13 <= 0.75f) {
            float f14 = f13 / 0.75f;
            canvas.scale(f14, f14, f10, getHeight() / 2.0f);
        }
        RectF rectF = this.rect;
        float f15 = this.radius;
        canvas.drawRoundRect(rectF, f15, f15, this.bgPaint);
        canvas.restoreToCount(save2);
        this.mPath.rewind();
        Path path = this.mPath;
        RectF rectF2 = this.rect;
        float f16 = this.radius;
        path.addRoundRect(rectF2, f16, f16, Path.Direction.CW);
        int save3 = canvas.save();
        float f17 = this.transitionProgress;
        if (f17 <= 0.75f) {
            float f18 = f17 / 0.75f;
            canvas.scale(f18, f18, f10, getHeight() / 2.0f);
        }
        if (this.transitionProgress != 0.0f && getAlpha() == 1.0f) {
            int i = 0;
            for (int i2 = 0; i2 < this.recyclerListView.getChildCount(); i2++) {
                ReactionHolderView reactionHolderView = (ReactionHolderView) this.recyclerListView.getChildAt(i2);
                checkPressedProgress(canvas, reactionHolderView);
                if (reactionHolderView.backupImageView.getImageReceiver().getLottieAnimation() != null) {
                    if (reactionHolderView.getX() + (reactionHolderView.getMeasuredWidth() / 2.0f) > 0.0f && reactionHolderView.getX() + (reactionHolderView.getMeasuredWidth() / 2.0f) < this.recyclerListView.getWidth()) {
                        if (!this.lastVisibleViewsTmp.contains(reactionHolderView)) {
                            reactionHolderView.play(i);
                            i += 30;
                        }
                        this.lastVisibleViews.add(reactionHolderView);
                    } else if (!reactionHolderView.isEnter) {
                        reactionHolderView.resetAnimation();
                    }
                }
            }
        }
        canvas.clipPath(this.mPath);
        canvas.translate((LocaleController.isRTL ? -1 : 1) * getWidth() * (1.0f - this.transitionProgress), 0.0f);
        super.dispatchDraw(canvas);
        if (this.leftShadowPaint != null) {
            this.leftShadowPaint.setAlpha((int) (Utilities.clamp(this.leftAlpha * this.transitionProgress, 1.0f, 0.0f) * 255.0f));
            canvas.drawRect(this.rect, this.leftShadowPaint);
        }
        if (this.rightShadowPaint != null) {
            this.rightShadowPaint.setAlpha((int) (Utilities.clamp(this.rightAlpha * this.transitionProgress, 1.0f, 0.0f) * 255.0f));
            canvas.drawRect(this.rect, this.rightShadowPaint);
        }
        canvas.restoreToCount(save3);
        canvas.save();
        canvas.clipRect(0.0f, this.rect.bottom, getMeasuredWidth(), getMeasuredHeight());
        float width2 = LocaleController.isRTL ? this.bigCircleOffset : getWidth() - this.bigCircleOffset;
        float height = getHeight() - getPaddingBottom();
        float dp = AndroidUtilities.dp(3.0f);
        float f19 = dp * max;
        this.shadow.setBounds((int) ((width2 - f7) - f19), (int) ((height - f7) - f19), (int) (width2 + f7 + f19), (int) (height + f7 + f19));
        this.shadow.draw(canvas);
        canvas.drawCircle(width2, height, f7, this.bgPaint);
        float width3 = LocaleController.isRTL ? this.bigCircleOffset - this.bigCircleRadius : (getWidth() - this.bigCircleOffset) + this.bigCircleRadius;
        float height2 = (getHeight() - this.smallCircleRadius) - dp;
        float f20 = (-AndroidUtilities.dp(1.0f)) * max;
        this.shadow.setBounds((int) ((width3 - f7) - f20), (int) ((height2 - f7) - f20), (int) (width3 + f7 + f20), (int) (f7 + height2 + f20));
        this.shadow.draw(canvas);
        canvas.drawCircle(width3, height2, f8, this.bgPaint);
        canvas.restore();
    }

    private void checkPressedProgress(Canvas canvas, ReactionHolderView reactionHolderView) {
        if (reactionHolderView.currentReaction.reaction.equals(this.pressedReaction)) {
            reactionHolderView.setPivotX(reactionHolderView.getMeasuredWidth() >> 1);
            reactionHolderView.setPivotY(reactionHolderView.backupImageView.getY() + reactionHolderView.backupImageView.getMeasuredHeight());
            reactionHolderView.setScaleX(this.pressedViewScale);
            reactionHolderView.setScaleY(this.pressedViewScale);
            if (!this.clicked) {
                if (this.cancelPressedAnimation == null) {
                    reactionHolderView.pressedBackupImageView.setVisibility(0);
                    reactionHolderView.pressedBackupImageView.setAlpha(1.0f);
                    if (reactionHolderView.pressedBackupImageView.getImageReceiver().hasBitmapImage()) {
                        reactionHolderView.backupImageView.setAlpha(0.0f);
                    }
                } else {
                    reactionHolderView.pressedBackupImageView.setAlpha(1.0f - this.cancelPressedProgress);
                    reactionHolderView.backupImageView.setAlpha(this.cancelPressedProgress);
                }
                if (this.pressedProgress == 1.0f) {
                    this.clicked = true;
                    if (System.currentTimeMillis() - this.lastReactionSentTime > 300) {
                        this.lastReactionSentTime = System.currentTimeMillis();
                        this.delegate.onReactionClicked(reactionHolderView, reactionHolderView.currentReaction, true);
                    }
                }
            }
            canvas.save();
            float x = this.recyclerListView.getX() + reactionHolderView.getX();
            float measuredWidth = ((reactionHolderView.getMeasuredWidth() * reactionHolderView.getScaleX()) - reactionHolderView.getMeasuredWidth()) / 2.0f;
            float f = x - measuredWidth;
            if (f < 0.0f && reactionHolderView.getTranslationX() >= 0.0f) {
                reactionHolderView.setTranslationX(-f);
            } else if (reactionHolderView.getMeasuredWidth() + x + measuredWidth <= getMeasuredWidth() || reactionHolderView.getTranslationX() > 0.0f) {
                reactionHolderView.setTranslationX(0.0f);
            } else {
                reactionHolderView.setTranslationX(((getMeasuredWidth() - x) - reactionHolderView.getMeasuredWidth()) - measuredWidth);
            }
            canvas.translate(this.recyclerListView.getX() + reactionHolderView.getX(), this.recyclerListView.getY() + reactionHolderView.getY());
            canvas.scale(reactionHolderView.getScaleX(), reactionHolderView.getScaleY(), reactionHolderView.getPivotX(), reactionHolderView.getPivotY());
            reactionHolderView.draw(canvas);
            canvas.restore();
            return;
        }
        int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(reactionHolderView);
        float measuredWidth2 = ((reactionHolderView.getMeasuredWidth() * (this.pressedViewScale - 1.0f)) / 3.0f) - ((reactionHolderView.getMeasuredWidth() * (1.0f - this.otherViewsScale)) * (Math.abs(this.pressedReactionPosition - childAdapterPosition) - 1));
        if (childAdapterPosition < this.pressedReactionPosition) {
            reactionHolderView.setPivotX(0.0f);
            reactionHolderView.setTranslationX(-measuredWidth2);
        } else {
            reactionHolderView.setPivotX(reactionHolderView.getMeasuredWidth());
            reactionHolderView.setTranslationX(measuredWidth2);
        }
        reactionHolderView.setPivotY(reactionHolderView.backupImageView.getY() + reactionHolderView.backupImageView.getMeasuredHeight());
        reactionHolderView.setScaleX(this.otherViewsScale);
        reactionHolderView.setScaleY(this.otherViewsScale);
        reactionHolderView.backupImageView.setScaleX(reactionHolderView.sideScale);
        reactionHolderView.backupImageView.setScaleY(reactionHolderView.sideScale);
        reactionHolderView.pressedBackupImageView.setVisibility(4);
        reactionHolderView.backupImageView.setAlpha(1.0f);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateShaders();
    }

    private void invalidateShaders() {
        int dp = AndroidUtilities.dp(24.0f);
        float height = getHeight() / 2.0f;
        int color = Theme.getColor("actionBarDefaultSubmenuBackground");
        this.leftShadowPaint.setShader(new LinearGradient(0.0f, height, dp, height, color, 0, Shader.TileMode.CLAMP));
        this.rightShadowPaint.setShader(new LinearGradient(getWidth(), height, getWidth() - dp, height, color, 0, Shader.TileMode.CLAMP));
        invalidate();
    }

    public void setTransitionProgress(float f) {
        this.transitionProgress = f;
        invalidate();
    }

    public void setMessage(MessageObject messageObject, TLRPC$ChatFull tLRPC$ChatFull) {
        List<TLRPC$TL_availableReaction> list;
        this.messageObject = messageObject;
        if (!messageObject.isForwardedChannelPost() || (tLRPC$ChatFull = MessagesController.getInstance(this.currentAccount).getChatFull(-messageObject.getFromChatId())) != null) {
            if (tLRPC$ChatFull != null) {
                list = new ArrayList<>(tLRPC$ChatFull.available_reactions.size());
                Iterator<String> it = tLRPC$ChatFull.available_reactions.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    Iterator<TLRPC$TL_availableReaction> it2 = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            TLRPC$TL_availableReaction next2 = it2.next();
                            if (next2.reaction.equals(next)) {
                                list.add(next2);
                                break;
                            }
                        }
                    }
                }
            } else {
                list = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
            }
            checkPremiumReactions(list);
            setReactionsList(list);
            return;
        }
        this.waitingLoadingChatId = -messageObject.getFromChatId();
        MessagesController.getInstance(this.currentAccount).loadFullChat(-messageObject.getFromChatId(), 0, true);
        setVisibility(4);
    }

    private void checkPremiumReactions(List<TLRPC$TL_availableReaction> list) {
        if (!AccountInstance.getInstance(this.currentAccount).getUserConfig().getCurrentUser().premium) {
            int i = 0;
            while (i < list.size()) {
                if (list.get(i).premium) {
                    list.remove(i);
                    i--;
                }
                i++;
            }
        }
    }

    public void startEnterAnimation() {
        setTransitionProgress(0.0f);
        setAlpha(1.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, TRANSITION_PROGRESS_VALUE, 0.0f, 1.0f).setDuration(400L);
        duration.setInterpolator(new OvershootInterpolator(1.004f));
        duration.start();
    }

    public int getTotalWidth() {
        return (AndroidUtilities.dp(36.0f) * this.reactionsList.size()) + AndroidUtilities.dp(16.0f);
    }

    public int getItemsCount() {
        return this.reactionsList.size();
    }

    public final class LeftRightShadowsListener extends RecyclerView.OnScrollListener {
        private ValueAnimator leftAnimator;
        private boolean leftVisible;
        private ValueAnimator rightAnimator;
        private boolean rightVisible;

        private LeftRightShadowsListener() {
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z = false;
            boolean z2 = ReactionsContainerLayout.this.linearLayoutManager.findFirstVisibleItemPosition() != 0;
            float f = 1.0f;
            if (z2 != this.leftVisible) {
                ValueAnimator valueAnimator = this.leftAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.leftAnimator = startAnimator(ReactionsContainerLayout.this.leftAlpha, z2 ? 1.0f : 0.0f, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        ReactionsContainerLayout.LeftRightShadowsListener.this.lambda$onScrolled$0((Float) obj);
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        ReactionsContainerLayout.LeftRightShadowsListener.this.lambda$onScrolled$1();
                    }
                });
                this.leftVisible = z2;
            }
            if (ReactionsContainerLayout.this.linearLayoutManager.findLastVisibleItemPosition() != ReactionsContainerLayout.this.listAdapter.getItemCount() - 1) {
                z = true;
            }
            if (z != this.rightVisible) {
                ValueAnimator valueAnimator2 = this.rightAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f2 = ReactionsContainerLayout.this.rightAlpha;
                if (!z) {
                    f = 0.0f;
                }
                this.rightAnimator = startAnimator(f2, f, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        ReactionsContainerLayout.LeftRightShadowsListener.this.lambda$onScrolled$2((Float) obj);
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        ReactionsContainerLayout.LeftRightShadowsListener.this.lambda$onScrolled$3();
                    }
                });
                this.rightVisible = z;
            }
        }

        public void lambda$onScrolled$0(Float f) {
            ReactionsContainerLayout.this.leftShadowPaint.setAlpha((int) (ReactionsContainerLayout.this.leftAlpha = f.floatValue() * 255.0f));
            ReactionsContainerLayout.this.invalidate();
        }

        public void lambda$onScrolled$1() {
            this.leftAnimator = null;
        }

        public void lambda$onScrolled$2(Float f) {
            ReactionsContainerLayout.this.rightShadowPaint.setAlpha((int) (ReactionsContainerLayout.this.rightAlpha = f.floatValue() * 255.0f));
            ReactionsContainerLayout.this.invalidate();
        }

        public void lambda$onScrolled$3() {
            this.rightAnimator = null;
        }

        private ValueAnimator startAnimator(float f, float f2, final Consumer<Float> consumer, final Runnable runnable) {
            ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(Math.abs(f2 - f) * 150.0f);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionsContainerLayout.LeftRightShadowsListener.lambda$startAnimator$4(Consumer.this, valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter(this) {
                @Override
                public void onAnimationEnd(Animator animator) {
                    runnable.run();
                }
            });
            duration.start();
            return duration;
        }

        public static void lambda$startAnimator$4(Consumer consumer, ValueAnimator valueAnimator) {
            consumer.accept((Float) valueAnimator.getAnimatedValue());
        }
    }

    public final class ReactionHolderView extends FrameLayout {
        public BackupImageView backupImageView;
        public TLRPC$TL_availableReaction currentReaction;
        private boolean isEnter;
        boolean pressed;
        public BackupImageView pressedBackupImageView;
        float pressedX;
        float pressedY;
        public float sideScale = 1.0f;
        Runnable playRunnable = new Runnable() {
            @Override
            public void run() {
                if (ReactionHolderView.this.backupImageView.getImageReceiver().getLottieAnimation() != null && !ReactionHolderView.this.backupImageView.getImageReceiver().getLottieAnimation().isRunning() && !ReactionHolderView.this.backupImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                    ReactionHolderView.this.backupImageView.getImageReceiver().getLottieAnimation().start();
                }
            }
        };
        Runnable longPressRunnable = new Runnable() {
            @Override
            public void run() {
                ReactionHolderView.this.performHapticFeedback(0);
                ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                reactionsContainerLayout.pressedReactionPosition = reactionsContainerLayout.reactionsList.indexOf(ReactionHolderView.this.currentReaction);
                ReactionHolderView reactionHolderView = ReactionHolderView.this;
                ReactionsContainerLayout.this.pressedReaction = reactionHolderView.currentReaction.reaction;
                ReactionsContainerLayout.this.invalidate();
            }
        };

        ReactionHolderView(Context context) {
            super(context);
            BackupImageView backupImageView = new BackupImageView(context, ReactionsContainerLayout.this) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    ReactionsContainerLayout.this.invalidate();
                }
            };
            this.backupImageView = backupImageView;
            backupImageView.getImageReceiver().setAutoRepeat(0);
            this.backupImageView.getImageReceiver().setAllowStartLottieAnimation(false);
            this.pressedBackupImageView = new BackupImageView(context, ReactionsContainerLayout.this) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    ReactionsContainerLayout.this.invalidate();
                }
            };
            addView(this.backupImageView, LayoutHelper.createFrame(34, 34, 17));
            addView(this.pressedBackupImageView, LayoutHelper.createFrame(34, 34, 17));
        }

        public void setReaction(TLRPC$TL_availableReaction tLRPC$TL_availableReaction) {
            TLRPC$TL_availableReaction tLRPC$TL_availableReaction2 = this.currentReaction;
            if (tLRPC$TL_availableReaction2 == null || !tLRPC$TL_availableReaction2.reaction.equals(tLRPC$TL_availableReaction.reaction)) {
                resetAnimation();
                this.currentReaction = tLRPC$TL_availableReaction;
                SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(tLRPC$TL_availableReaction.activate_animation, "windowBackgroundGray", 1.0f);
                this.backupImageView.getImageReceiver().setImage(ImageLocation.getForDocument(this.currentReaction.appear_animation), "60_60_nolimit", null, null, svgThumb, 0, "tgs", tLRPC$TL_availableReaction, 0);
                this.pressedBackupImageView.getImageReceiver().setImage(ImageLocation.getForDocument(this.currentReaction.select_animation), "60_60_nolimit", null, null, svgThumb, 0, "tgs", tLRPC$TL_availableReaction, 0);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            resetAnimation();
        }

        public boolean play(int i) {
            if (!ReactionsContainerLayout.this.animationEnabled) {
                resetAnimation();
                this.isEnter = true;
                return false;
            }
            AndroidUtilities.cancelRunOnUIThread(this.playRunnable);
            if (this.backupImageView.getImageReceiver().getLottieAnimation() == null || this.backupImageView.getImageReceiver().getLottieAnimation().isGeneratingCache() || this.isEnter) {
                if (this.backupImageView.getImageReceiver().getLottieAnimation() != null && this.isEnter && !this.backupImageView.getImageReceiver().getLottieAnimation().isRunning() && !this.backupImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                    this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(this.backupImageView.getImageReceiver().getLottieAnimation().getFramesCount() - 1, false);
                }
                return false;
            }
            this.isEnter = true;
            if (i == 0) {
                this.backupImageView.getImageReceiver().getLottieAnimation().stop();
                this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                this.playRunnable.run();
            } else {
                this.backupImageView.getImageReceiver().getLottieAnimation().stop();
                this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                AndroidUtilities.runOnUIThread(this.playRunnable, i);
            }
            return true;
        }

        public void resetAnimation() {
            AndroidUtilities.cancelRunOnUIThread(this.playRunnable);
            if (this.backupImageView.getImageReceiver().getLottieAnimation() != null && !this.backupImageView.getImageReceiver().getLottieAnimation().isGeneratingCache()) {
                this.backupImageView.getImageReceiver().getLottieAnimation().stop();
                if (ReactionsContainerLayout.this.animationEnabled) {
                    this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false, true);
                } else {
                    this.backupImageView.getImageReceiver().getLottieAnimation().setCurrentFrame(this.backupImageView.getImageReceiver().getLottieAnimation().getFramesCount() - 1, false, true);
                }
            }
            this.isEnter = false;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (ReactionsContainerLayout.this.cancelPressedAnimation != null) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                this.pressed = true;
                this.pressedX = motionEvent.getX();
                this.pressedY = motionEvent.getY();
                if (this.sideScale == 1.0f) {
                    AndroidUtilities.runOnUIThread(this.longPressRunnable, ViewConfiguration.getLongPressTimeout());
                }
            }
            float scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2.0f;
            if ((motionEvent.getAction() == 2 && (Math.abs(this.pressedX - motionEvent.getX()) > scaledTouchSlop || Math.abs(this.pressedY - motionEvent.getY()) > scaledTouchSlop)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && this.pressed && ((ReactionsContainerLayout.this.pressedReaction == null || ReactionsContainerLayout.this.pressedProgress > 0.8f) && ReactionsContainerLayout.this.delegate != null)) {
                    ReactionsContainerLayout.this.clicked = true;
                    long currentTimeMillis = System.currentTimeMillis();
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    if (currentTimeMillis - reactionsContainerLayout.lastReactionSentTime > 300) {
                        reactionsContainerLayout.lastReactionSentTime = System.currentTimeMillis();
                        ReactionsContainerLayout.this.delegate.onReactionClicked(this, this.currentReaction, ReactionsContainerLayout.this.pressedProgress > 0.8f);
                    }
                }
                if (!ReactionsContainerLayout.this.clicked) {
                    ReactionsContainerLayout.this.cancelPressed();
                }
                AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
                this.pressed = false;
            }
            return true;
        }
    }

    public void cancelPressed() {
        if (this.pressedReaction != null) {
            this.cancelPressedProgress = 0.0f;
            final float f = this.pressedProgress;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.cancelPressedAnimation = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ReactionsContainerLayout.this.cancelPressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    reactionsContainerLayout.pressedProgress = f * (1.0f - reactionsContainerLayout.cancelPressedProgress);
                    ReactionsContainerLayout.this.invalidate();
                }
            });
            this.cancelPressedAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    ReactionsContainerLayout reactionsContainerLayout = ReactionsContainerLayout.this;
                    reactionsContainerLayout.cancelPressedAnimation = null;
                    reactionsContainerLayout.pressedProgress = 0.0f;
                    ReactionsContainerLayout.this.pressedReaction = null;
                    ReactionsContainerLayout.this.invalidate();
                }
            });
            this.cancelPressedAnimation.setDuration(150L);
            this.cancelPressedAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.cancelPressedAnimation.start();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull = (TLRPC$ChatFull) objArr[0];
            if (tLRPC$ChatFull.id == this.waitingLoadingChatId && getVisibility() != 0 && !tLRPC$ChatFull.available_reactions.isEmpty()) {
                setMessage(this.messageObject, null);
                setVisibility(0);
                startEnterAnimation();
            }
        }
    }

    @Override
    public void setAlpha(float f) {
        if (getAlpha() != f && f == 0.0f) {
            this.lastVisibleViews.clear();
            for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
                ((ReactionHolderView) this.recyclerListView.getChildAt(i)).resetAnimation();
            }
        }
        super.setAlpha(f);
    }
}

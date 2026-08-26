package org.telegram.ui.Stories;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ListAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarAnimatedSubtitleOverlayContainer;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.AvatarPreviewer;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda151;
import org.telegram.ui.ChatEditActivity$$ExternalSyntheticLambda65;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RadialProgress;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$25$$ExternalSyntheticLambda0;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda12;
import org.telegram.ui.QrActivity;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda9;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda31;

public abstract class DialogStoriesCell extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public final float K;
    public ActionBar actionBar;
    public final Adapter adapter;
    public final Paint addCirclePaint;
    public final Drawable addNewStoryDrawable;
    public int addNewStoryLastColor;
    public final ArrayList afterNextLayout;
    public boolean allowGlobalUpdates;
    public final ArrayList animateToDialogIds;
    public DialogStoriesCell$StoryCell$$ExternalSyntheticLambda2 animationRunnable;
    public final BoolAnimator animatorHasTitleText;
    public final Paint backgroundPaint;
    public long checkedStoryNotificationDeletion;
    public int clipTop;
    public boolean collapsed;
    public ValueAnimator collapsedOvershootAnimator;
    public float collapsedOvershootProgress;
    public float collapsedProgress;
    public float collapsedProgress1;
    public float collapsedProgress2;
    public final float collapsedSpringCoef;
    public final OAuthSheet$$ExternalSyntheticLambda3 comparator;
    public final int currentAccount;
    public int currentCellWidth;
    public int currentState;
    public CharSequence currentTitle;
    public LinearGradient ellipsizeGradient;
    public Matrix ellipsizeGradientMatrix;
    public Paint ellipsizePaint;
    public final AvatarPreviewer ellipsizeSpanAnimator;
    public final ImageView emojiStatusView;
    public ValueAnimator expandOvershootAnimator;
    public float expandOvershootAnimatorProgress;
    public final float expandedSpringCoef;
    public final DialogsActivity fragment;
    public StoriesUtilities.EnsureStoryFileLoadedObject globalCancelable;
    public boolean hasOverlayText;
    public final DefaultItemAnimator itemAnimator;
    public final ArrayList items;
    public boolean lastUploadingCloseFriends;
    public final LinearLayoutManager layoutManager;
    public final AnonymousClass1 listViewMini;
    public float menuItemsOffset;
    public final Adapter miniAdapter;
    public final AnonymousClass9 miniItemAnimator;
    public final ArrayList miniItems;
    public final CanvasButton miniItemsClickArea;
    public final ArrayList oldItems;
    public final ArrayList oldMiniItems;
    public final float overScrollCoef;
    public int overlayTextId;
    public float overscrollProgress;
    public int overscrollSelectedPosition;
    public StoryCell overscrollSelectedView;
    public HintView2 premiumHint;
    public Drawable premiumStar;
    public RadialProgress radialProgress;
    public final AnonymousClass1 recyclerListView;
    public final AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    public AnimatorSet storiesAnimatorSet;
    public OvershootInterpolator storiesCollapseInterpolator;
    public final StoriesController storiesController;
    public final ActionBar.AnonymousClass9 subtitleOverlayContainer;
    public final ImageView telegramLogoView;
    public ValueAnimator textAnimator;
    public final AnimatedTextView titleView;
    public final int type;
    public boolean updateOnIdleState;
    public SpannableStringBuilder uploadingString;
    public ValueAnimator valueAnimator;
    public final ArrayList viewsDrawInParent;
    public ValueAnimator yStoriesAnimator;
    public float yStoriesProgress;

    public final class AnonymousClass12 extends AnimatedEmojiDrawable.WrapSizeDrawable {
        @Override
        public final void draw(Canvas canvas) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
            super.draw(canvas);
            canvas.restore();
        }
    }

    public final class AnonymousClass9 extends DefaultItemAnimator {
        @Override
        public final float animateByScale(View view) {
            return 0.6f;
        }
    }

    public final class Adapter extends AdapterWithDiffUtils {
        public final boolean mini;
        public final DialogsActivity.AnonymousClass25 this$0;

        public Adapter(DialogsActivity.AnonymousClass25 anonymousClass25, boolean z) {
            this.this$0 = anonymousClass25;
            this.mini = z;
        }

        @Override
        public final int getItemCount() {
            DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
            return (this.mini ? anonymousClass25.miniItems : anonymousClass25.items).size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            StoryCell storyCell = (StoryCell) viewHolder.itemView;
            storyCell.position = i;
            DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
            if (this.mini) {
                storyCell.setDialogId(((Item) anonymousClass25.miniItems.get(i)).dialogId);
            } else {
                storyCell.setDialogId(((Item) anonymousClass25.items.get(i)).dialogId);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StoryCell storyCell = new StoryCell(this.this$0, viewGroup.getContext());
            boolean z = this.mini;
            storyCell.mini = z;
            if (z) {
                storyCell.setProgressToCollapsed(1.0f, 1.0f, 0.0f, false);
            }
            return new RecyclerListView.Holder(storyCell);
        }
    }

    public final class Item extends AdapterWithDiffUtils.Item {
        public final long dialogId;

        public Item(long j) {
            super(0, false);
            this.dialogId = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Item) && this.dialogId == ((Item) obj).dialogId;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.dialogId));
        }
    }

    public DialogStoriesCell(Context context, DialogsActivity dialogsActivity, int i, int i2) {
        super(context);
        this.animatorHasTitleText = new BoolAnimator(1, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.oldItems = new ArrayList();
        this.oldMiniItems = new ArrayList();
        this.items = new ArrayList();
        this.miniItems = new ArrayList();
        final DialogsActivity.AnonymousClass25 anonymousClass25 = (DialogsActivity.AnonymousClass25) this;
        Adapter adapter = new Adapter(anonymousClass25, false);
        this.adapter = adapter;
        Adapter adapter2 = new Adapter(anonymousClass25, true);
        this.miniAdapter = adapter2;
        Paint paint = new Paint();
        this.addCirclePaint = new Paint(1);
        this.backgroundPaint = new Paint(1);
        CanvasButton canvasButton = new CanvasButton(this);
        this.miniItemsClickArea = canvasButton;
        this.collapsedProgress = -1.0f;
        this.currentState = -1;
        this.viewsDrawInParent = new ArrayList();
        this.animateToDialogIds = new ArrayList();
        this.afterNextLayout = new ArrayList();
        this.collapsedProgress1 = -1.0f;
        this.allowGlobalUpdates = true;
        this.overScrollCoef = 1.0f;
        this.collapsedSpringCoef = 0.95f;
        this.expandedSpringCoef = 0.9f;
        this.comparator = new OAuthSheet$$ExternalSyntheticLambda3(10);
        this.K = 0.3f;
        this.collapsedOvershootProgress = 1.0f;
        new OvershootInterpolator(0.9f);
        this.storiesCollapseInterpolator = new OvershootInterpolator(0.95f);
        AvatarPreviewer avatarPreviewer = new AvatarPreviewer(this);
        this.ellipsizeSpanAnimator = avatarPreviewer;
        this.type = i2;
        this.currentAccount = i;
        this.fragment = dialogsActivity;
        this.menuItemsOffset = AndroidUtilities.dp(68.0f);
        this.storiesController = MessagesController.getInstance(i).getStoriesController();
        final int i3 = 0;
        ?? r12 = new RecyclerListView(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                switch (i3) {
                    case 1:
                        DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                        ArrayList arrayList = anonymousClass26.viewsDrawInParent;
                        arrayList.clear();
                        int i4 = 0;
                        for (int i5 = 0; i5 < getChildCount(); i5++) {
                            StoryCell storyCell = (StoryCell) getChildAt(i5);
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(storyCell);
                            storyCell.position = childAdapterPosition;
                            boolean z = true;
                            storyCell.drawInParent = true;
                            storyCell.isFirst = childAdapterPosition == 0;
                            if (childAdapterPosition != anonymousClass26.miniItems.size() - 1) {
                                z = false;
                            }
                            storyCell.isLast = z;
                            arrayList.add(storyCell);
                        }
                        Collections.sort(arrayList, anonymousClass26.comparator);
                        while (i4 < arrayList.size()) {
                            StoryCell storyCell2 = (StoryCell) arrayList.get(i4);
                            int iSave = canvas.save();
                            canvas.translate(storyCell2.getX(), storyCell2.getY());
                            if (storyCell2.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (storyCell2.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                            }
                            canvas2.scale(storyCell2.getScaleX(), storyCell2.getScaleY(), AndroidUtilities.dp(14.0f), storyCell2.getCy());
                            storyCell2.draw(canvas2);
                            canvas2.restoreToCount(iSave);
                            i4++;
                            canvas = canvas2;
                        }
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                switch (i3) {
                    case 0:
                        if (motionEvent.getAction() == 0) {
                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                            if (anonymousClass26.collapsedProgress1 > 0.2f || anonymousClass26.getAlpha() == 0.0f) {
                                return false;
                            }
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    default:
                        return false;
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i3) {
                    case 0:
                        if (anonymousClass25.viewsDrawInParent.contains(view)) {
                            return true;
                        }
                        return super.drawChild(canvas, view, j);
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                switch (i3) {
                    case 1:
                        return false;
                    default:
                        return super.onInterceptTouchEvent(motionEvent);
                }
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                switch (i3) {
                    case 0:
                        super.onLayout(z, i4, i5, i6, i7);
                        int i8 = 0;
                        while (true) {
                            DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                            if (i8 >= anonymousClass26.afterNextLayout.size()) {
                                anonymousClass26.afterNextLayout.clear();
                            } else {
                                ((Runnable) anonymousClass26.afterNextLayout.get(i8)).run();
                                i8++;
                            }
                            break;
                        }
                        break;
                    default:
                        super.onLayout(z, i4, i5, i6, i7);
                        break;
                }
            }

            @Override
            public void onScrolled(int i4, int i5) {
                switch (i3) {
                    case 1:
                        HintView2 hintView2 = anonymousClass25.premiumHint;
                        if (hintView2 != null) {
                            hintView2.hide(true);
                        }
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i3) {
                    case 1:
                        return false;
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        this.recyclerListView = r12;
        r12.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        r12.setClipToPadding(false);
        r12.setClipChildren(false);
        DialogsActivity.AnonymousClass25 anonymousClass26 = (DialogsActivity.AnonymousClass25) this;
        canvasButton.delegate = new DialogsActivity$25$$ExternalSyntheticLambda0(anonymousClass26, 3);
        VoIPFragment$$ExternalSyntheticLambda31 voIPFragment$$ExternalSyntheticLambda31 = new VoIPFragment$$ExternalSyntheticLambda31(anonymousClass26, 1);
        canvasButton.longPressEnabled = true;
        canvasButton.longPressRunnable = voIPFragment$$ExternalSyntheticLambda31;
        r12.addOnScrollListener(new SettingsActivity.AnonymousClass5(anonymousClass25, 12));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.setDurations(150L);
        defaultItemAnimator.mSupportsChangeAnimations = false;
        r12.setItemAnimator(defaultItemAnimator);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.layoutManager = linearLayoutManager;
        r12.setLayoutManager(linearLayoutManager);
        r12.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(anonymousClass26, 13));
        r12.setOnItemLongClickListener(new StoriesViewPager$$ExternalSyntheticLambda0(anonymousClass26, 16));
        r12.setAdapter(adapter);
        addView((View) r12, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), true, true, false);
        this.titleView = animatedTextView;
        animatedTextView.setGravity(3);
        animatedTextView.setTextColor(getTextLogoColor());
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        animatedTextView.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        animatedTextView.setImportantForAccessibility(1);
        animatedTextView.setFocusableInTouchMode(true);
        addView(animatedTextView, LayoutHelper.createFrame(-2.0f, -1));
        ImageView imageView = new ImageView(context);
        this.telegramLogoView = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AppName));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(R.drawable.telegram_logo_2);
        imageView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        imageView.setImportantForAccessibility(1);
        imageView.setFocusableInTouchMode(true);
        addView(imageView, LayoutHelper.createFrame(22.0f, 90));
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(null, false, AndroidUtilities.dp(26.0f), 7);
        this.statusDrawable = swapAnimatedEmojiDrawable;
        swapAnimatedEmojiDrawable.center = true;
        swapAnimatedEmojiDrawable.setCallback(this);
        ImageView imageView2 = new ImageView(context);
        this.emojiStatusView = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageDrawable(swapAnimatedEmojiDrawable);
        addView(imageView2, LayoutHelper.createFrame(40.0f, 40));
        ActionBar.AnonymousClass9 anonymousClass9 = new ActionBar.AnonymousClass9(anonymousClass25, context, avatarPreviewer);
        this.subtitleOverlayContainer = anonymousClass9;
        addView(anonymousClass9, LayoutHelper.createFrame(-2.0f, -2));
        paint.setColor(-2762018);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.addNewStoryDrawable = getContext().getDrawable(R.drawable.msg_mini_addstory);
        final int i4 = 1;
        ?? r0 = new RecyclerListView(getContext()) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                Canvas canvas2;
                switch (i4) {
                    case 1:
                        DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                        ArrayList arrayList = anonymousClass27.viewsDrawInParent;
                        arrayList.clear();
                        int i5 = 0;
                        for (int i6 = 0; i6 < getChildCount(); i6++) {
                            StoryCell storyCell = (StoryCell) getChildAt(i6);
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(storyCell);
                            storyCell.position = childAdapterPosition;
                            boolean z = true;
                            storyCell.drawInParent = true;
                            storyCell.isFirst = childAdapterPosition == 0;
                            if (childAdapterPosition != anonymousClass27.miniItems.size() - 1) {
                                z = false;
                            }
                            storyCell.isLast = z;
                            arrayList.add(storyCell);
                        }
                        Collections.sort(arrayList, anonymousClass27.comparator);
                        while (i5 < arrayList.size()) {
                            StoryCell storyCell2 = (StoryCell) arrayList.get(i5);
                            int iSave = canvas.save();
                            canvas.translate(storyCell2.getX(), storyCell2.getY());
                            if (storyCell2.getAlpha() != 1.0f) {
                                canvas2 = canvas;
                                canvas2.saveLayerAlpha(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), (int) (storyCell2.getAlpha() * 255.0f), 31);
                            } else {
                                canvas2 = canvas;
                            }
                            canvas2.scale(storyCell2.getScaleX(), storyCell2.getScaleY(), AndroidUtilities.dp(14.0f), storyCell2.getCy());
                            storyCell2.draw(canvas2);
                            canvas2.restoreToCount(iSave);
                            i5++;
                            canvas = canvas2;
                        }
                        break;
                    default:
                        super.dispatchDraw(canvas);
                        break;
                }
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                switch (i4) {
                    case 0:
                        if (motionEvent.getAction() == 0) {
                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                            if (anonymousClass27.collapsedProgress1 > 0.2f || anonymousClass27.getAlpha() == 0.0f) {
                                return false;
                            }
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    default:
                        return false;
                }
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                switch (i4) {
                    case 0:
                        if (anonymousClass25.viewsDrawInParent.contains(view)) {
                            return true;
                        }
                        return super.drawChild(canvas, view, j);
                    default:
                        return super.drawChild(canvas, view, j);
                }
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                switch (i4) {
                    case 1:
                        return false;
                    default:
                        return super.onInterceptTouchEvent(motionEvent);
                }
            }

            @Override
            public void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                switch (i4) {
                    case 0:
                        super.onLayout(z, i5, i6, i7, i8);
                        int i9 = 0;
                        while (true) {
                            DialogsActivity.AnonymousClass25 anonymousClass27 = anonymousClass25;
                            if (i9 >= anonymousClass27.afterNextLayout.size()) {
                                anonymousClass27.afterNextLayout.clear();
                            } else {
                                ((Runnable) anonymousClass27.afterNextLayout.get(i9)).run();
                                i9++;
                            }
                            break;
                        }
                        break;
                    default:
                        super.onLayout(z, i5, i6, i7, i8);
                        break;
                }
            }

            @Override
            public void onScrolled(int i5, int i6) {
                switch (i4) {
                    case 1:
                        HintView2 hintView2 = anonymousClass25.premiumHint;
                        if (hintView2 != null) {
                            hintView2.hide(true);
                        }
                        break;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                switch (i4) {
                    case 1:
                        return false;
                    default:
                        return super.onTouchEvent(motionEvent);
                }
            }
        };
        this.listViewMini = r0;
        getContext();
        r0.setLayoutManager(new LinearLayoutManager(0, false));
        r0.addItemDecoration(new FiltersView.AnonymousClass2(8));
        AnonymousClass9 anonymousClass10 = new AnonymousClass9();
        this.miniItemAnimator = anonymousClass10;
        anonymousClass10.delayAnimations = false;
        anonymousClass10.mSupportsChangeAnimations = false;
        r0.setItemAnimator(anonymousClass10);
        r0.setAdapter(adapter2);
        r0.setClipChildren(false);
        addView((View) r0, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 4.0f, 0.0f, 0.0f));
        setClipChildren(false);
        setClipToPadding(false);
        checkUi_titleVisibility();
        updateItems(false, false);
    }

    public int getTextColor() {
        return this.type == 0 ? getThemedColor$18(Theme.key_actionBarDefaultTitle) : getThemedColor$18(Theme.key_actionBarDefaultArchivedTitle);
    }

    private int getTextLogoColor() {
        return getThemedColor$18(Theme.key_telegram_color_dialogsLogo);
    }

    public final void checkCollapsedProgress() {
        int i;
        this.collapsedProgress = 1.0f - AndroidUtilities.lerp(1.0f - this.collapsedProgress1, 1.0f, 1.0f - this.collapsedProgress2);
        checkUi_titleVisibility();
        float f = this.collapsedProgress;
        if (f == 1.0f) {
            i = 2;
        } else {
            i = f != 0.0f ? 1 : 0;
        }
        if (this.currentState != i) {
            this.currentState = i;
            if (i != 1 && this.updateOnIdleState) {
                AndroidUtilities.runOnUIThread(new DialogStoriesCell$$ExternalSyntheticLambda10(this, 1));
            }
            int i2 = this.currentState;
            AnonymousClass1 anonymousClass1 = this.listViewMini;
            AnonymousClass1 anonymousClass2 = this.recyclerListView;
            if (i2 == 0) {
                AndroidUtilities.forEachViews((RecyclerView) anonymousClass2, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(14));
                anonymousClass1.setVisibility(4);
                anonymousClass2.setVisibility(0);
                if (System.currentTimeMillis() >= this.checkedStoryNotificationDeletion) {
                    this.checkedStoryNotificationDeletion = System.currentTimeMillis() + 60000;
                }
            } else {
                int i3 = this.currentAccount;
                if (i2 == 1) {
                    ArrayList arrayList = this.animateToDialogIds;
                    arrayList.clear();
                    int i4 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.items;
                        if (i4 >= arrayList2.size()) {
                            break;
                        }
                        if (((Item) arrayList2.get(i4)).dialogId == UserConfig.getInstance(i3).getClientUserId()) {
                            long j = UserConfig.getInstance(i3).clientUserId;
                            StoriesController storiesController = this.storiesController;
                            if (storiesController.hasUnreadStories(j) || (storiesController.hasSelfStories() && storiesController.dialogListStories.size() <= 3)) {
                                arrayList.add(Long.valueOf(((Item) arrayList2.get(i4)).dialogId));
                                if (arrayList.size() == 3) {
                                    break;
                                }
                            }
                        } else {
                            arrayList.add(Long.valueOf(((Item) arrayList2.get(i4)).dialogId));
                            if (arrayList.size() == 3) {
                                break;
                                break;
                            }
                        }
                        i4++;
                    }
                    anonymousClass1.setVisibility(4);
                    anonymousClass2.setVisibility(0);
                } else if (i2 == 2) {
                    anonymousClass1.setVisibility(0);
                    anonymousClass2.setVisibility(4);
                    LinearLayoutManager linearLayoutManager = this.layoutManager;
                    linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                    StoriesController storiesController2 = MessagesController.getInstance(i3).getStoriesController();
                    AndroidUtilities.cancelRunOnUIThread(storiesController2.sortStoriesRunnable);
                    storiesController2.sortStoriesRunnable.run();
                    StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
                    if (ensureStoryFileLoadedObject != null) {
                        ensureStoryFileLoadedObject.cancelled = true;
                        ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
                        this.globalCancelable = null;
                    }
                }
            }
            invalidate();
        }
        invalidate();
    }

    public final void checkLoadMore() {
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        int iFindLastVisibleItemPosition2 = linearLayoutManager.findLastVisibleItemPosition() + 10;
        ArrayList arrayList = this.items;
        int size = arrayList.size();
        StoriesController storiesController = this.storiesController;
        if (iFindLastVisibleItemPosition2 > size || ((iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition() + 9) < arrayList.size() && storiesController.getUnreadState(0, ((Item) arrayList.get(iFindLastVisibleItemPosition)).dialogId) == 0)) {
            boolean z = this.type == 1;
            if (z) {
                if (!storiesController.hasMoreHidden) {
                    return;
                }
            } else if (!storiesController.hasMore) {
                return;
            }
            storiesController.loadFromServer(z);
        }
    }

    public final void checkUi_titleVisibility() {
        float fClamp = MathUtils.clamp(Math.min(this.collapsedProgress, this.collapsedProgress2), 0.0f, 1.0f);
        float f = this.animatorHasTitleText.floatValue;
        float f2 = 1.0f - f;
        float f3 = f * fClamp;
        float f4 = f2 * fClamp;
        AnimatedTextView animatedTextView = this.titleView;
        if (animatedTextView != null) {
            animatedTextView.setAlpha(f3);
            animatedTextView.setVisibility(f3 > 0.0f ? 0 : 8);
        }
        ImageView imageView = this.telegramLogoView;
        if (imageView != null) {
            imageView.setAlpha(f4);
            imageView.setVisibility(f4 > 0.0f ? 0 : 8);
        }
        ImageView imageView2 = this.emojiStatusView;
        if (imageView2 != null) {
            imageView2.setAlpha(f4);
            imageView2.setVisibility(f4 > 0.0f ? 0 : 8);
        }
        ActionBar.AnonymousClass9 anonymousClass9 = this.subtitleOverlayContainer;
        if (anonymousClass9 != null) {
            anonymousClass9.setAlpha(fClamp);
            anonymousClass9.setVisibility(fClamp > 0.0f ? 0 : 8);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storiesUpdated && this.allowGlobalUpdates) {
            updateItems(getVisibility() == 0, false);
            AndroidUtilities.runOnUIThread(new DialogStoriesCell$$ExternalSyntheticLambda10(this, 0));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int childAdapterPosition;
        float f;
        float f2;
        AnonymousClass1 anonymousClass1;
        float f3;
        float f4;
        float f5;
        AnonymousClass1 anonymousClass2;
        Canvas canvas2;
        boolean z;
        double d;
        float f6;
        float f7;
        float fLerp;
        float f8;
        float fLerp2;
        float f9;
        float f10;
        float fLerp3;
        float f11;
        float fLerp4;
        float fLerp5;
        int i;
        int i2;
        float fDp;
        boolean z2;
        boolean z3;
        boolean z4;
        float f12;
        int childAdapterPosition2;
        canvas.save();
        int i3 = this.clipTop;
        if (i3 > 0) {
            canvas.clipRect(0, i3, getMeasuredWidth(), getMeasuredHeight());
        }
        float measuredHeight = (getMeasuredHeight() - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(4.0f);
        float fLerp6 = AndroidUtilities.lerp(0.0f, measuredHeight, this.collapsedProgress1);
        AnonymousClass1 anonymousClass3 = this.recyclerListView;
        anonymousClass3.setTranslationY(fLerp6);
        AnonymousClass1 anonymousClass4 = this.listViewMini;
        anonymousClass4.setTranslationY(fLerp6);
        anonymousClass4.setTranslationX(this.menuItemsOffset);
        int i4 = 0;
        while (true) {
            arrayList = this.viewsDrawInParent;
            if (i4 >= arrayList.size()) {
                break;
            }
            ((StoryCell) arrayList.get(i4)).drawInParent = false;
            i4++;
        }
        arrayList.clear();
        int i5 = this.currentState;
        ArrayList arrayList2 = this.animateToDialogIds;
        int i6 = -1;
        if ((i5 == 1 || i5 == 0) && !arrayList2.isEmpty()) {
            int i7 = 0;
            childAdapterPosition = -1;
            f = 4.0f;
            while (i7 < anonymousClass3.getChildCount()) {
                StoryCell storyCell = (StoryCell) anonymousClass3.getChildAt(i7);
                float f13 = fLerp6;
                if (storyCell.dialogId == ((Long) arrayList2.get(0)).longValue()) {
                    childAdapterPosition = RecyclerView.getChildAdapterPosition(storyCell);
                }
                i7++;
                fLerp6 = f13;
            }
            f2 = fLerp6;
        } else {
            f2 = fLerp6;
            f = 4.0f;
            childAdapterPosition = this.currentState == 2 ? 0 : -1;
        }
        int i8 = this.currentState;
        if (i8 < 0 || i8 == 2) {
            anonymousClass1 = anonymousClass3;
            f3 = 16.0f;
            f4 = 2.0f;
            float f14 = 0.0f;
            for (int i9 = 0; i9 < anonymousClass4.getChildCount(); i9++) {
                StoryCell storyCell2 = (StoryCell) anonymousClass4.getChildAt(i9);
                float x = storyCell2.getX() + anonymousClass4.getX() + storyCell2.getMeasuredWidth();
                if (f14 == 0.0f || x > f14) {
                    f14 = x;
                }
            }
            f5 = f14;
        } else {
            if (childAdapterPosition == -1) {
                LinearLayoutManager linearLayoutManager = this.layoutManager;
                childAdapterPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                if (childAdapterPosition == -1) {
                    childAdapterPosition = linearLayoutManager.findFirstVisibleItemPosition();
                }
                z = true;
            } else {
                z = false;
            }
            f3 = 16.0f;
            anonymousClass3.setAlpha(1.0f - Utilities.clamp(this.collapsedProgress / this.K, 1.0f, 0.0f));
            this.overscrollSelectedPosition = -1;
            if (this.overscrollProgress != 0.0f) {
                int i10 = 0;
                int i11 = -1;
                while (i10 < anonymousClass3.getChildCount()) {
                    View childAt = anonymousClass3.getChildAt(i10);
                    if (childAt.getX() < 0.0f || childAt.getX() + childAt.getMeasuredWidth() > getMeasuredWidth() || (childAdapterPosition2 = RecyclerView.getChildAdapterPosition(childAt)) < 0 || (i11 != i6 && childAdapterPosition2 >= i11)) {
                        i11 = i11;
                    } else {
                        i11 = i11;
                        if (((Item) this.items.get(childAdapterPosition2)).dialogId != UserConfig.getInstance(this.currentAccount).clientUserId) {
                            this.overscrollSelectedView = (StoryCell) childAt;
                            i11 = childAdapterPosition2;
                        } else {
                            i11 = i11;
                        }
                    }
                    i10++;
                    i6 = -1;
                }
                f4 = 2.0f;
                this.overscrollSelectedPosition = i11;
            } else {
                f4 = 2.0f;
            }
            float f15 = 0.0f;
            int i12 = 0;
            while (i12 < anonymousClass3.getChildCount()) {
                StoryCell storyCell3 = (StoryCell) anonymousClass3.getChildAt(i12);
                storyCell3.setClipInParent(false);
                int childAdapterPosition3 = RecyclerView.getChildAdapterPosition(storyCell3);
                float fPow = this.collapsedProgress;
                if (childAdapterPosition3 < childAdapterPosition || childAdapterPosition3 >= arrayList2.size() + childAdapterPosition) {
                    d = 0.25d;
                } else {
                    int i13 = childAdapterPosition3 - childAdapterPosition;
                    if (i13 == childAdapterPosition + 2) {
                        fPow = this.collapsedProgress;
                        d = 0.25d;
                    } else if (i13 == childAdapterPosition + 1) {
                        fPow = (float) Math.pow(this.collapsedProgress, 0.5d);
                        d = 0.25d;
                    } else {
                        measuredHeight = measuredHeight;
                        d = 0.25d;
                        fPow = (float) Math.pow(this.collapsedProgress, 0.25d);
                    }
                }
                if (childAdapterPosition3 < childAdapterPosition) {
                    fPow = (float) Math.pow(this.collapsedProgress, d);
                }
                storyCell3.setProgressToCollapsed(fPow, this.collapsedProgress2, this.overscrollProgress, this.overscrollSelectedPosition == storyCell3.position);
                StoriesUtilities.AvatarStoryParams avatarStoryParams = storyCell3.params;
                if (childAdapterPosition3 <= childAdapterPosition || childAdapterPosition3 >= arrayList2.size() + childAdapterPosition) {
                    measuredHeight = measuredHeight;
                    anonymousClass3 = anonymousClass3;
                    f6 = 0.0f;
                    avatarStoryParams.rightTopAngleToExclude = 0.0f;
                    avatarStoryParams.rightBottomAngleToExclude = 0.0f;
                    avatarStoryParams.leftTopAngleToExclude = 0.0f;
                    avatarStoryParams.leftBottomAngleToExclude = 0.0f;
                    avatarStoryParams.useArcProgress = false;
                } else {
                    StoryCell storyCell4 = (StoryCell) anonymousClass3.getChildAt(i12 - 1);
                    if (storyCell4 != null) {
                        float fDp2 = AndroidUtilities.dp(48.0f);
                        float fDp3 = AndroidUtilities.dp(26.33f);
                        float fLerp7 = AndroidUtilities.lerp(fDp2, fDp3, storyCell4.progressToCollapsed) + AndroidUtilities.dp(8.0f);
                        float fLerp8 = AndroidUtilities.lerp(fDp2, fDp3, storyCell3.progressToCollapsed) + AndroidUtilities.dp(8.0f);
                        float f16 = fLerp7 / f4;
                        float f17 = fLerp8 / f4;
                        StoriesUtilities.AvatarStoryParams avatarStoryParams2 = storyCell4.params;
                        float x2 = storyCell4.getX() + avatarStoryParams2.originalAvatarRect.centerX();
                        float y = storyCell4.getY() + avatarStoryParams2.originalAvatarRect.centerY();
                        float x3 = (storyCell3.getX() + avatarStoryParams.originalAvatarRect.centerX()) - x2;
                        float y2 = (storyCell3.getY() + avatarStoryParams.originalAvatarRect.centerY()) - y;
                        float fSqrt = (float) Math.sqrt((y2 * y2) + (x3 * x3));
                        float f18 = f16 + f17;
                        if (fSqrt < f18) {
                            float degrees = (float) Math.toDegrees(Math.acos(fSqrt / f18) * 2.0d);
                            float degrees2 = (float) Math.toDegrees(Math.atan2(y2, x3));
                            float f19 = degrees / f4;
                            avatarStoryParams2.rightTopAngleToExclude = degrees2 - f19;
                            avatarStoryParams2.rightBottomAngleToExclude = degrees2 + f19;
                            float degrees3 = (float) Math.toDegrees(Math.atan2(-y2, -x3));
                            float f20 = -Math.abs(degrees3 - f19);
                            float fAbs = Math.abs(degrees3 + f19);
                            avatarStoryParams.leftTopAngleToExclude = f20;
                            avatarStoryParams.leftBottomAngleToExclude = fAbs;
                            f6 = 0.0f;
                        } else {
                            f6 = 0.0f;
                            avatarStoryParams2.rightTopAngleToExclude = 0.0f;
                            avatarStoryParams2.rightBottomAngleToExclude = 0.0f;
                            avatarStoryParams.leftTopAngleToExclude = 0.0f;
                            avatarStoryParams.leftBottomAngleToExclude = 0.0f;
                        }
                        avatarStoryParams2.useArcProgress = false;
                        avatarStoryParams.useArcProgress = false;
                    } else {
                        measuredHeight = measuredHeight;
                        anonymousClass3 = anonymousClass3;
                        f6 = 0.0f;
                    }
                }
                float fClamp = Utilities.clamp((this.overscrollProgress - 0.5f) / 0.5f, 1.0f, f6);
                float fDp4 = AndroidUtilities.dp(16.0f) * fClamp;
                float f21 = (float) (((double) ((1.0f - fClamp) * 0.5f)) + 0.5d);
                if (childAdapterPosition3 <= childAdapterPosition) {
                    f7 = 0.0f;
                    fLerp = 0.0f;
                } else if (childAdapterPosition3 == childAdapterPosition + 1) {
                    fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f), 0.0f, this.collapsedProgress) + ((AndroidUtilities.dp(16.0f) * fPow) - AndroidUtilities.dpf2(0.5f));
                    f7 = 0.0f;
                } else {
                    f7 = 0.0f;
                    fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), 0.0f, this.collapsedProgress) + (((AndroidUtilities.dp(16.0f) * fPow) + AndroidUtilities.dp(16.0f)) - AndroidUtilities.dpf2(0.5f));
                }
                float f22 = fLerp + this.menuItemsOffset;
                if (this.collapsed) {
                    f8 = 0.0f;
                    fLerp2 = AndroidUtilities.lerp(0.0f, f22 - storyCell3.getLeft(), this.storiesCollapseInterpolator.getInterpolation(this.collapsedOvershootProgress));
                } else {
                    if (this.overscrollProgress <= f7) {
                        f12 = 0.0f;
                    } else {
                        int i14 = storyCell3.position;
                        int i15 = this.overscrollSelectedPosition;
                        if (i14 < i15) {
                            f12 = -fDp4;
                        } else if (i14 > i15) {
                            f12 = fDp4;
                        } else {
                            f12 = 0.0f;
                        }
                    }
                    fLerp2 = AndroidUtilities.lerp(f22 - storyCell3.getLeft(), f12, 1.0f - this.expandOvershootAnimatorProgress);
                    f8 = 0.0f;
                }
                float fClamp2 = MathUtils.clamp((this.collapsedProgress1 - 0.2f) / 0.1f, f8, 1.0f);
                int i16 = childAdapterPosition3 - childAdapterPosition;
                if (i16 == 0) {
                    f9 = 0.65f;
                    fLerp3 = AndroidUtilities.lerp(f8, f2 - measuredHeight, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.collapsedProgress));
                } else {
                    f9 = 0.65f;
                    if (i16 == 1) {
                        fLerp3 = AndroidUtilities.lerp(f8, (f2 - measuredHeight) * 0.65f, CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(this.collapsedProgress));
                    } else {
                        f10 = 0.0f;
                    }
                    if (storyCell3.position == this.overscrollSelectedPosition || this.overscrollProgress <= f8) {
                        f11 = 0.0f;
                    } else {
                        f11 = (-fDp4) / f4;
                    }
                    if (i16 == 0) {
                        fLerp4 = AndroidUtilities.lerp(f11, f2 - measuredHeight, this.yStoriesProgress);
                    } else if (i16 == 1) {
                        fLerp4 = AndroidUtilities.lerp(f11, (f2 - measuredHeight) * f9, this.yStoriesProgress);
                    } else {
                        fLerp4 = 0.0f;
                    }
                    fLerp5 = AndroidUtilities.lerp(fLerp4, f10, fClamp2);
                    if (this.collapsedProgress > 0.0f) {
                        if (childAdapterPosition3 >= childAdapterPosition || childAdapterPosition3 > childAdapterPosition + 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z || i16 < 0 || i16 >= arrayList2.size()) {
                            storyCell3.setCrossfadeTo(-1L);
                        } else {
                            storyCell3.setCrossfadeTo(((Long) arrayList2.get(i16)).longValue());
                        }
                        storyCell3.drawInParent = z2;
                        if (childAdapterPosition3 == childAdapterPosition) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        storyCell3.isFirst = z3;
                        if (childAdapterPosition3 >= (arrayList2.size() + childAdapterPosition) - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        storyCell3.isLast = z4;
                        storyCell3.setTranslationX(fLerp2);
                        storyCell3.setTranslationY(fLerp5);
                        if (z2) {
                            arrayList.add(storyCell3);
                        }
                    } else if (anonymousClass3.getItemAnimator() != null || !anonymousClass3.getItemAnimator().isRunning()) {
                        if (this.overscrollProgress > 0.0f) {
                            i = storyCell3.position;
                            i2 = this.overscrollSelectedPosition;
                            if (i < i2 && i <= i2) {
                                storyCell3.setAlpha(1.0f);
                            } else {
                                storyCell3.setAlpha(f21);
                            }
                        } else {
                            storyCell3.setAlpha(1.0f);
                        }
                        storyCell3.setTranslationX(fLerp2);
                        storyCell3.setTranslationY(fLerp5);
                    }
                    if (storyCell3.drawInParent) {
                        fDp = (AndroidUtilities.dp(70.0f) / f4) + (storyCell3.getMeasuredWidth() / f4) + storyCell3.getX() + anonymousClass3.getX();
                        if (f15 != 0.0f || fDp > f15) {
                            f15 = fDp;
                        } else {
                            f15 = f15;
                        }
                    } else {
                        f15 = f15;
                    }
                    i12++;
                    z = z;
                    anonymousClass3 = anonymousClass3;
                    measuredHeight = measuredHeight;
                }
                f10 = fLerp3;
                if (storyCell3.position == this.overscrollSelectedPosition) {
                    f11 = 0.0f;
                } else {
                    f11 = 0.0f;
                }
                if (i16 == 0) {
                    fLerp4 = AndroidUtilities.lerp(f11, f2 - measuredHeight, this.yStoriesProgress);
                } else if (i16 == 1) {
                    fLerp4 = AndroidUtilities.lerp(f11, (f2 - measuredHeight) * f9, this.yStoriesProgress);
                } else {
                    fLerp4 = 0.0f;
                }
                fLerp5 = AndroidUtilities.lerp(fLerp4, f10, fClamp2);
                if (this.collapsedProgress > 0.0f) {
                    if (childAdapterPosition3 >= childAdapterPosition) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        storyCell3.setCrossfadeTo(-1L);
                    } else {
                        storyCell3.setCrossfadeTo(-1L);
                    }
                    storyCell3.drawInParent = z2;
                    if (childAdapterPosition3 == childAdapterPosition) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    storyCell3.isFirst = z3;
                    if (childAdapterPosition3 >= (arrayList2.size() + childAdapterPosition) - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    storyCell3.isLast = z4;
                    storyCell3.setTranslationX(fLerp2);
                    storyCell3.setTranslationY(fLerp5);
                    if (z2) {
                        arrayList.add(storyCell3);
                    }
                } else if (anonymousClass3.getItemAnimator() != null) {
                    if (this.overscrollProgress > 0.0f) {
                        i = storyCell3.position;
                        i2 = this.overscrollSelectedPosition;
                        if (i < i2) {
                            storyCell3.setAlpha(f21);
                        } else {
                            storyCell3.setAlpha(1.0f);
                        }
                    } else {
                        storyCell3.setAlpha(1.0f);
                    }
                    storyCell3.setTranslationX(fLerp2);
                    storyCell3.setTranslationY(fLerp5);
                } else {
                    if (this.overscrollProgress > 0.0f) {
                        i = storyCell3.position;
                        i2 = this.overscrollSelectedPosition;
                        if (i < i2) {
                            storyCell3.setAlpha(f21);
                        } else {
                            storyCell3.setAlpha(1.0f);
                        }
                    } else {
                        storyCell3.setAlpha(1.0f);
                    }
                    storyCell3.setTranslationX(fLerp2);
                    storyCell3.setTranslationY(fLerp5);
                }
                if (storyCell3.drawInParent) {
                    fDp = (AndroidUtilities.dp(70.0f) / f4) + (storyCell3.getMeasuredWidth() / f4) + storyCell3.getX() + anonymousClass3.getX();
                    if (f15 != 0.0f) {
                    }
                    f15 = fDp;
                } else {
                    f15 = f15;
                }
                i12++;
                z = z;
                anonymousClass3 = anonymousClass3;
                measuredHeight = measuredHeight;
            }
            f5 = f15;
            anonymousClass1 = anonymousClass3;
        }
        if (this.premiumHint != null) {
            float fLerp9 = AndroidUtilities.lerp(29, 74, CubicBezierInterpolator.EASE_OUT.getInterpolation(this.collapsedProgress));
            anonymousClass2 = anonymousClass1;
            if (anonymousClass1.getChildCount() > 0) {
                fLerp9 += anonymousClass2.getChildAt(0).getLeft();
            }
            this.premiumHint.setJoint(0.0f, fLerp9);
        } else {
            anonymousClass2 = anonymousClass1;
        }
        float fMin = Math.min(this.collapsedProgress, this.collapsedProgress2);
        float visibleItemsMeasuredWidthWithAlpha = (this.actionBar.menu.getVisibleItemsMeasuredWidthWithAlpha() * fMin) - AndroidUtilities.dp(6.0f);
        boolean z5 = fMin != 0.0f && visibleItemsMeasuredWidthWithAlpha > 0.0f;
        if (z5) {
            float width = getWidth() - visibleItemsMeasuredWidthWithAlpha;
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, width, getHeight());
        } else {
            canvas2 = canvas;
        }
        if (fMin != 0.0f) {
            ActionBar.AnonymousClass9 anonymousClass9 = this.subtitleOverlayContainer;
            float totalVisibility = anonymousClass9.getTotalVisibility() * (-AndroidUtilities.dp(10.0f));
            AnimatedTextView animatedTextView = this.titleView;
            float measuredHeight2 = (animatedTextView.getMeasuredHeight() - animatedTextView.getTextHeight()) / f4;
            animatedTextView.setPivotX(0.0f);
            animatedTextView.setScaleX(AndroidUtilities.lerp(1.0f, 0.95f, anonymousClass9.getTotalVisibility()));
            animatedTextView.setScaleY(AndroidUtilities.lerp(1.0f, 0.95f, anonymousClass9.getTotalVisibility()));
            animatedTextView.setTranslationY((((f2 + AndroidUtilities.dp(14.0f)) - measuredHeight2) + AndroidUtilities.dp(f)) - (anonymousClass9.getTotalVisibility() * AndroidUtilities.dp(6.0f)));
            int iDp = AndroidUtilities.dp(72.0f);
            float f23 = this.collapsedProgress;
            float fLerp10 = AndroidUtilities.lerp(AndroidUtilities.dp(48.0f), AndroidUtilities.dp(26.33f), f23) / f4;
            float fM = OKLCH.m(fLerp10, 2.0f, AndroidUtilities.lerp((iDp / f4) - fLerp10, 0.0f, f23), -iDp) + AndroidUtilities.dp(12.0f) + f5;
            animatedTextView.setTranslationX(fM);
            AnimatedTextView.AnimatedTextDrawable drawable = animatedTextView.getDrawable();
            drawable.rightPadding = (this.actionBar.menu.getVisibleItemsMeasuredWidthWithAlpha() * fMin) + (fM - AndroidUtilities.dp(12.0f));
            drawable.invalidateSelf();
            ImageView imageView = this.telegramLogoView;
            imageView.setTranslationX(animatedTextView.getTranslationX() + AndroidUtilities.dp(1.0f));
            imageView.setTranslationY(f2 + AndroidUtilities.dp(22.333f) + totalVisibility);
            ImageView imageView2 = this.emojiStatusView;
            imageView2.setTranslationX((animatedTextView.getTranslationX() - AndroidUtilities.dpf2(3.33f)) + imageView.getMeasuredWidth());
            imageView2.setTranslationY(f2 + AndroidUtilities.dp(11.333f) + totalVisibility);
            anonymousClass9.setTranslationX(animatedTextView.getTranslationX());
            anonymousClass9.setTranslationY(f2 + AndroidUtilities.dp(31.333f));
        }
        super.dispatchDraw(canvas);
        int i17 = this.currentState;
        if (i17 >= 0 && i17 != 2) {
            Collections.sort(arrayList, this.comparator);
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                StoryCell storyCell5 = (StoryCell) arrayList.get(i18);
                canvas2.save();
                canvas2.translate(storyCell5.getX() + anonymousClass2.getX(), storyCell5.getY() + anonymousClass2.getY());
                storyCell5.draw(canvas2);
                canvas2.restore();
            }
        }
        if (z5) {
            float fDp5 = AndroidUtilities.dp(f3);
            if (this.ellipsizeGradient == null) {
                this.ellipsizeGradient = new LinearGradient(0.0f, 0.0f, fDp5, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.ellipsizeGradientMatrix = new Matrix();
                Paint paint = new Paint(1);
                this.ellipsizePaint = paint;
                paint.setShader(this.ellipsizeGradient);
                this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            this.ellipsizeGradientMatrix.reset();
            this.ellipsizeGradientMatrix.postTranslate((getWidth() - visibleItemsMeasuredWidthWithAlpha) - fDp5, 0.0f);
            this.ellipsizeGradient.setLocalMatrix(this.ellipsizeGradientMatrix);
            canvas2.drawRect((getWidth() - visibleItemsMeasuredWidthWithAlpha) - fDp5, 0.0f, AndroidUtilities.dp(1.0f) + (getWidth() - visibleItemsMeasuredWidthWithAlpha), getHeight(), this.ellipsizePaint);
            canvas.restore();
            canvas.restore();
        }
        canvas.restore();
    }

    public final StoryCell findStoryCell(long j) {
        AnonymousClass1 anonymousClass1 = this.currentState == 2 ? this.listViewMini : this.recyclerListView;
        for (int i = 0; i < anonymousClass1.getChildCount(); i++) {
            View childAt = anonymousClass1.getChildAt(i);
            if (childAt instanceof StoryCell) {
                StoryCell storyCell = (StoryCell) childAt;
                if (storyCell.dialogId == j) {
                    return storyCell;
                }
            }
        }
        return null;
    }

    public float getCollapsedProgress() {
        return this.collapsedProgress;
    }

    public float getOverScrollCoef() {
        return this.overScrollCoef;
    }

    public HintView2 getPremiumHint() {
        return this.premiumHint;
    }

    public final int getThemedColor$18(int i) {
        DialogsActivity dialogsActivity = this.fragment;
        return (dialogsActivity == null || dialogsActivity.getResourceProvider() == null) ? Theme.getColor(null, i, false) : dialogsActivity.getThemedColor(i);
    }

    public final boolean isExpanded() {
        int i = this.currentState;
        return i == 0 || i == 1;
    }

    public final void makePremiumHint() {
        if (this.premiumHint != null) {
            return;
        }
        HintView2 hintView2 = new HintView2(getContext(), 1);
        int themedColor$18 = getThemedColor$18(Theme.key_undo_background);
        Paint paint = hintView2.backgroundPaint;
        if (paint.getColor() != themedColor$18) {
            paint.setColor(themedColor$18);
            hintView2.invalidate();
        }
        hintView2.setMultilineText(true);
        hintView2.textLayoutAlignment = Layout.Alignment.ALIGN_CENTER;
        hintView2.setJoint(0.0f, 29.0f);
        this.premiumHint = hintView2;
        SpannableStringBuilder spannableStringBuilderReplaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), Theme.key_undo_cancelColor, 0, new DialogStoriesCell$$ExternalSyntheticLambda10(this, 2));
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilderReplaceSingleTag.getSpans(0, spannableStringBuilderReplaceSingleTag.length(), ClickableSpan.class);
        if (clickableSpanArr != null && clickableSpanArr.length >= 1) {
            spannableStringBuilderReplaceSingleTag.setSpan(new TypefaceSpan(AndroidUtilities.bold()), spannableStringBuilderReplaceSingleTag.getSpanStart(clickableSpanArr[0]), spannableStringBuilderReplaceSingleTag.getSpanEnd(clickableSpanArr[0]), 33);
        }
        HintView2 hintView3 = this.premiumHint;
        hintView3.textMaxWidth = HintView2.cutInFancyHalf(spannableStringBuilderReplaceSingleTag, hintView3.getTextPaint());
        this.premiumHint.setText(spannableStringBuilderReplaceSingleTag);
        this.premiumHint.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), 0);
        if (getParent() instanceof FrameLayout) {
            ((FrameLayout) getParent()).addView(this.premiumHint, LayoutHelper.createFrame(-1, 150, 51));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateItems(false, false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        AvatarPreviewer avatarPreviewer = this.ellipsizeSpanAnimator;
        avatarPreviewer.visible = true;
        AnimatorSet animatorSet = (AnimatorSet) avatarPreviewer.windowManager;
        if (!animatorSet.isRunning()) {
            animatorSet.start();
        }
        this.statusDrawable.attach();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        AvatarPreviewer avatarPreviewer = this.ellipsizeSpanAnimator;
        avatarPreviewer.visible = false;
        ((AnimatorSet) avatarPreviewer.windowManager).cancel();
        StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
        if (ensureStoryFileLoadedObject != null) {
            ensureStoryFileLoadedObject.cancelled = true;
            ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
            this.globalCancelable = null;
        }
        this.statusDrawable.detach();
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 1) {
            checkUi_titleVisibility();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.titleView.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
        this.currentCellWidth = AndroidUtilities.dp(70.0f);
        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(89.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.currentState == 2) {
            int size = this.miniItems.size();
            int iDp = AndroidUtilities.dp((size * 26.33f) - (Math.max(0, size - 1) * 16.0f));
            AnonymousClass1 anonymousClass1 = this.listViewMini;
            int x = (int) anonymousClass1.getX();
            int y = (int) anonymousClass1.getY();
            int x2 = (int) (anonymousClass1.getX() + iDp);
            int y2 = (int) (anonymousClass1.getY() + anonymousClass1.getHeight());
            CanvasButton canvasButton = this.miniItemsClickArea;
            canvasButton.getClass();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x, y, x2, y2);
            canvasButton.pathCreated = false;
            canvasButton.usingRectCount = 0;
            canvasButton.addRect(rectF);
            if (canvasButton.checkTouchEvent(motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void openSelfStories() {
        if (this.storiesController.hasSelfStories()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(UserConfig.getInstance(this.currentAccount).clientUserId));
            this.fragment.getOrCreateStoryViewer().open(UserConfig.selectedAccount, getContext(), null, arrayList, 0, null, null, new StoriesListPlaceProvider(this.listViewMini, false), false);
        }
    }

    public final void openStoryForCell(StoryCell storyCell, boolean z) {
        ValueAnimator valueAnimator;
        if ((!z || (valueAnimator = this.expandOvershootAnimator) == null || !valueAnimator.isRunning()) && storyCell != null) {
            try {
                performHapticFeedback(3);
            } catch (Exception unused) {
            }
            boolean z2 = storyCell.isSelf;
            StoriesController storiesController = this.storiesController;
            if (!z2 || storiesController.hasSelfStories()) {
                if (storiesController.hasStories(storyCell.dialogId) || storiesController.hasUploadingStories(storyCell.dialogId)) {
                    TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.allStoriesMap.get(storyCell.dialogId);
                    long j = storyCell.dialogId;
                    StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.globalCancelable;
                    if (ensureStoryFileLoadedObject != null) {
                        ensureStoryFileLoadedObject.cancelled = true;
                        ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
                        this.globalCancelable = null;
                    }
                    PollItemMenu$$ExternalSyntheticLambda12 pollItemMenu$$ExternalSyntheticLambda12 = new PollItemMenu$$ExternalSyntheticLambda12(this, storyCell, j, 25);
                    if (z) {
                        pollItemMenu$$ExternalSyntheticLambda12.run();
                        return;
                    }
                    StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObjectEnsureStoryFileLoaded = StoriesUtilities.ensureStoryFileLoaded(peerStories, pollItemMenu$$ExternalSyntheticLambda12);
                    storyCell.cancellable = ensureStoryFileLoadedObjectEnsureStoryFileLoaded;
                    this.globalCancelable = ensureStoryFileLoadedObjectEnsureStoryFileLoaded;
                    if (ensureStoryFileLoadedObjectEnsureStoryFileLoaded != null) {
                        storiesController.setLoading(storyCell.dialogId, true);
                    }
                }
            } else if (MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                openStoryRecorder(0L);
            } else {
                makePremiumHint();
                HintView2 hintView2 = this.premiumHint;
                if (hintView2 != null) {
                    if (hintView2.shown) {
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    }
                    this.premiumHint.show();
                }
            }
        }
    }

    public final void openStoryRecorder(long j) {
        StoryCell storyCell;
        StoriesController.StoryLimit storyLimitCheckStoryLimit;
        DialogsActivity dialogsActivity = this.fragment;
        int i = this.currentAccount;
        if (j == 0 && (storyLimitCheckStoryLimit = MessagesController.getInstance(i).getStoriesController().checkStoryLimit()) != null && storyLimitCheckStoryLimit.active(i, 1)) {
            dialogsActivity.showDialog(new LimitReachedBottomSheet(storyLimitCheckStoryLimit.getLimitReachedType(), this.currentAccount, getContext(), this.fragment, null));
            return;
        }
        int i2 = 0;
        while (true) {
            AnonymousClass1 anonymousClass1 = this.recyclerListView;
            if (i2 >= anonymousClass1.getChildCount()) {
                storyCell = null;
                break;
            }
            storyCell = (StoryCell) anonymousClass1.getChildAt(i2);
            if (j == 0) {
                if (storyCell.isSelf) {
                    break;
                } else {
                    i2++;
                }
            } else if (storyCell.dialogId == j) {
                break;
            } else {
                i2++;
            }
        }
        if (storyCell == null) {
            return;
        }
        if (j == 0) {
            StoryRecorder.getInstance(dialogsActivity.getParentActivity(), i).open(StoryRecorder.SourceView.fromStoryCell(storyCell));
            return;
        }
        Theme.ResourcesProvider resourceProvider = dialogsActivity != null ? dialogsActivity.getResourceProvider() : null;
        AlertDialog alertDialog = new AlertDialog(getContext(), 3, resourceProvider);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 500L);
        MessagesController.getInstance(i).getStoriesController().canSendStoryFor(j, new ChatEditActivity$$ExternalSyntheticLambda65(this, alertDialog, j, storyCell, 2), true, resourceProvider);
    }

    public final boolean scrollTo(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.items;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            }
            if (((Item) arrayList.get(i)).dialogId == j) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            if (i < linearLayoutManager.findFirstCompletelyVisibleItemPosition()) {
                linearLayoutManager.scrollToPositionWithOffset(i, 0);
                return true;
            }
            if (i > linearLayoutManager.findLastCompletelyVisibleItemPosition()) {
                linearLayoutManager.scrollToPositionWithOffset(i, 0, true);
                return true;
            }
        }
        return false;
    }

    public void setActionBar(ActionBar actionBar) {
        this.actionBar = actionBar;
    }

    public void setClipTop(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.clipTop != i) {
            this.clipTop = i;
            invalidate();
        }
    }

    public void setMenuItemsOffset(float f) {
        this.menuItemsOffset = f;
    }

    public void setOverscroll(float f) {
        this.overscrollProgress = f / AndroidUtilities.dp(90.0f);
        invalidate();
        invalidate();
    }

    public void setProgressToCollapse(float f) {
        setProgressToCollapse(f, true);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        HintView2 hintView2 = this.premiumHint;
        if (hintView2 != null) {
            hintView2.setTranslationY(f);
        }
    }

    public final void updateColors$1() {
        GradientTools gradientTools = StoriesUtilities.closeFriendsGradientTools;
        int i = 0;
        if (gradientTools != null) {
            gradientTools.setColors(Theme.getColor(null, Theme.key_stories_circle_closeFriends1, false), Theme.getColor(null, Theme.key_stories_circle_closeFriends2, false), 0, 0);
        }
        GradientTools gradientTools2 = StoriesUtilities.liveGradientTools;
        if (gradientTools2 != null) {
            gradientTools2.setColors(Theme.getColor(null, Theme.key_stories_circle_live1, false), Theme.getColor(null, Theme.key_stories_circle_live2, false), 0, 0);
        }
        GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
        GradientTools gradientTools3 = gradientToolsArr[0];
        if (gradientTools3 != null) {
            gradientTools3.setColors(Theme.getColor(null, Theme.key_stories_circle_dialog1, false), Theme.getColor(null, Theme.key_stories_circle_dialog2, false), 0, 0);
        }
        GradientTools gradientTools4 = gradientToolsArr[1];
        if (gradientTools4 != null) {
            gradientTools4.setColors(Theme.getColor(null, Theme.key_stories_circle1, false), Theme.getColor(null, Theme.key_stories_circle2, false), 0, 0);
        }
        if (StoriesUtilities.errorGradientTools != null) {
            int color = Theme.getColor(null, Theme.key_color_orange, false);
            int color2 = Theme.getColor(null, Theme.key_text_RedBold, false);
            StoriesUtilities.errorGradientTools.setColors(ColorUtils.blendARGB(0.25f, color, color2), color2, 0, 0);
        }
        final int textColor = getTextColor();
        this.titleView.setTextColor(getTextLogoColor());
        ActionBar.AnonymousClass9 anonymousClass9 = this.subtitleOverlayContainer;
        if (anonymousClass9 != null) {
            ArrayList arrayList = anonymousClass9.titleOverlayAnimator.list.entries;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ListAnimator.Entry entry = (ListAnimator.Entry) obj;
                ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable simpleTextViewReplaceable = (ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable) entry.item;
                int i2 = Theme.key_telegram_color_dialogsLogo;
                Theme.ResourcesProvider resourcesProvider = anonymousClass9.resourcesProvider;
                simpleTextViewReplaceable.setTextColor(Theme.getColor(i2, resourcesProvider));
                ((ActionBarAnimatedSubtitleOverlayContainer.SimpleTextViewReplaceable) entry.item).setLinkTextColor(Theme.getColor(i2, resourcesProvider));
            }
        }
        this.telegramLogoView.setColorFilter(getTextLogoColor(), PorterDuff.Mode.MULTIPLY);
        AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, new Consumer() {
            @Override
            public final void accept(Object obj2) {
                DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) ((View) obj2);
                storyCell.invalidate();
                storyCell.textView.setTextColor(textColor);
            }
        });
        AndroidUtilities.forEachViews((RecyclerView) this.listViewMini, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(13));
    }

    public final void updateItems(boolean z, boolean z2) {
        boolean z3 = true;
        if ((this.currentState == 1 || this.overscrollProgress != 0.0f) && !z2) {
            this.updateOnIdleState = true;
            return;
        }
        ArrayList arrayList = this.oldItems;
        arrayList.clear();
        ArrayList arrayList2 = this.items;
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = this.oldMiniItems;
        arrayList3.clear();
        ArrayList arrayList4 = this.miniItems;
        arrayList3.addAll(arrayList4);
        arrayList2.clear();
        int i = this.type;
        int i2 = this.currentAccount;
        if (i != 1) {
            arrayList2.add(new Item(UserConfig.getInstance(i2).getClientUserId()));
        }
        StoriesController storiesController = this.storiesController;
        ArrayList arrayList5 = i == 1 ? storiesController.hiddenListStories : storiesController.dialogListStories;
        for (int i3 = 0; i3 < arrayList5.size(); i3++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList5.get(i3)).peer);
            if (peerDialogId != UserConfig.getInstance(i2).getClientUserId()) {
                arrayList2.add(new Item(peerDialogId));
            }
        }
        int size = arrayList2.size();
        if (!storiesController.hasSelfStories()) {
            size--;
        }
        int iMax = Math.max(1, Math.max(storiesController.getTotalStoriesCount(i == 1), size));
        this.currentTitle = null;
        boolean zHasOnlySelfStories = storiesController.hasOnlySelfStories();
        AnimatedTextView animatedTextView = this.titleView;
        if (!zHasOnlySelfStories) {
            this.currentTitle = this.menuItemsOffset < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.formatPluralString("Stories", iMax, new Object[0]);
        } else if (storiesController.hasUploadingStories(UserConfig.getInstance(i2).getClientUserId())) {
            String string = LocaleController.getString(R.string.UploadingStory);
            if (string.indexOf("…") > 0) {
                if (this.uploadingString == null) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
                    UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                    spannableStringBuilderValueOf.setSpan(uploadingDotsSpannable, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
                    uploadingDotsSpannable.parent = animatedTextView;
                    uploadingDotsSpannable.isMediumTypeface = true;
                    this.uploadingString = spannableStringBuilderValueOf;
                }
                this.currentTitle = this.uploadingString;
            } else {
                this.currentTitle = string;
            }
        } else {
            this.currentTitle = this.menuItemsOffset < ((float) AndroidUtilities.dp(50.0f)) ? null : LocaleController.getString(R.string.MyStory);
        }
        if (!this.hasOverlayText) {
            animatedTextView.setText(this.currentTitle, z && !LocaleController.isRTL, true);
        }
        if (TextUtils.isEmpty(this.currentTitle) && !this.hasOverlayText) {
            z3 = false;
        }
        this.animatorHasTitleText.setValue(z3, z);
        arrayList4.clear();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            if (((Item) arrayList2.get(i4)).dialogId != UserConfig.getInstance(i2).clientUserId || storiesController.hasUnreadStories(UserConfig.getInstance(i2).clientUserId) || (storiesController.hasSelfStories() && storiesController.dialogListStories.size() <= 3)) {
                arrayList4.add((Item) arrayList2.get(i4));
                if (arrayList4.size() >= 3) {
                    break;
                }
            }
        }
        AnonymousClass1 anonymousClass1 = this.recyclerListView;
        AnonymousClass1 anonymousClass2 = this.listViewMini;
        if (!z) {
            anonymousClass1.setItemAnimator(null);
            anonymousClass2.setItemAnimator(null);
        } else if (this.currentState == 2) {
            anonymousClass2.setItemAnimator(this.miniItemAnimator);
            anonymousClass1.setItemAnimator(null);
        } else {
            anonymousClass1.setItemAnimator(this.itemAnimator);
            anonymousClass2.setItemAnimator(null);
        }
        this.adapter.setItems(arrayList, arrayList2);
        this.miniAdapter.setItems(arrayList3, arrayList4);
        arrayList.clear();
        invalidate();
    }

    public final void setProgressToCollapse(float f, boolean z) {
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        if (this.collapsedProgress1 == f) {
            return;
        }
        this.collapsedProgress1 = f;
        checkCollapsedProgress();
        boolean z2 = f > this.K;
        if (z2 != this.collapsed) {
            this.collapsed = z2;
            AnimatorSet animatorSet = this.storiesAnimatorSet;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.storiesAnimatorSet.cancel();
                this.storiesAnimatorSet = null;
            }
            if (!z) {
                this.collapsedProgress2 = z2 ? 1.0f : 0.0f;
                checkCollapsedProgress();
                AndroidUtilities.forEachViews((RecyclerView) this.recyclerListView, (Consumer) new ChatActivity$$ExternalSyntheticLambda151(15));
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
            this.valueAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final DialogStoriesCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i2) {
                        case 0:
                            DialogStoriesCell dialogStoriesCell = this.f$0;
                            dialogStoriesCell.getClass();
                            dialogStoriesCell.collapsedProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            dialogStoriesCell.checkCollapsedProgress();
                            break;
                        case 1:
                            DialogStoriesCell dialogStoriesCell2 = this.f$0;
                            dialogStoriesCell2.getClass();
                            dialogStoriesCell2.yStoriesProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            DialogStoriesCell dialogStoriesCell3 = this.f$0;
                            dialogStoriesCell3.getClass();
                            dialogStoriesCell3.collapsedOvershootProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            DialogStoriesCell dialogStoriesCell4 = this.f$0;
                            dialogStoriesCell4.getClass();
                            dialogStoriesCell4.expandOvershootAnimatorProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            dialogStoriesCell4.invalidate();
                            break;
                    }
                }
            });
            this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            float f2 = this.collapsedProgress1;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f2, z2 ? f2 : 0.0f);
            this.yStoriesAnimator = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final DialogStoriesCell f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i3) {
                        case 0:
                            DialogStoriesCell dialogStoriesCell = this.f$0;
                            dialogStoriesCell.getClass();
                            dialogStoriesCell.collapsedProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            dialogStoriesCell.checkCollapsedProgress();
                            break;
                        case 1:
                            DialogStoriesCell dialogStoriesCell2 = this.f$0;
                            dialogStoriesCell2.getClass();
                            dialogStoriesCell2.yStoriesProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        case 2:
                            DialogStoriesCell dialogStoriesCell3 = this.f$0;
                            dialogStoriesCell3.getClass();
                            dialogStoriesCell3.collapsedOvershootProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            break;
                        default:
                            DialogStoriesCell dialogStoriesCell4 = this.f$0;
                            dialogStoriesCell4.getClass();
                            dialogStoriesCell4.expandOvershootAnimatorProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            dialogStoriesCell4.invalidate();
                            break;
                    }
                }
            });
            this.yStoriesAnimator.setDuration(100L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.storiesAnimatorSet = animatorSet2;
            animatorSet2.addListener(new LoginActivity.AnonymousClass9(29, this, z2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.valueAnimator);
            arrayList.add(this.yStoriesAnimator);
            if (this.collapsed) {
                this.storiesAnimatorSet.setDuration(1000L);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                this.collapsedOvershootAnimator = valueAnimatorOfFloat3;
                valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final DialogStoriesCell f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i) {
                            case 0:
                                DialogStoriesCell dialogStoriesCell = this.f$0;
                                dialogStoriesCell.getClass();
                                dialogStoriesCell.collapsedProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                dialogStoriesCell.checkCollapsedProgress();
                                break;
                            case 1:
                                DialogStoriesCell dialogStoriesCell2 = this.f$0;
                                dialogStoriesCell2.getClass();
                                dialogStoriesCell2.yStoriesProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                DialogStoriesCell dialogStoriesCell3 = this.f$0;
                                dialogStoriesCell3.getClass();
                                dialogStoriesCell3.collapsedOvershootProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                DialogStoriesCell dialogStoriesCell4 = this.f$0;
                                dialogStoriesCell4.getClass();
                                dialogStoriesCell4.expandOvershootAnimatorProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                dialogStoriesCell4.invalidate();
                                break;
                        }
                    }
                });
                OvershootInterpolator overshootInterpolator = new OvershootInterpolator(this.collapsedSpringCoef);
                this.storiesCollapseInterpolator = overshootInterpolator;
                this.collapsedOvershootAnimator.setInterpolator(overshootInterpolator);
                this.collapsedOvershootAnimator.setDuration(750L);
                arrayList.add(this.collapsedOvershootAnimator);
            } else {
                this.expandOvershootAnimator = ValueAnimator.ofFloat(this.collapsedProgress2, z2 ? 1.0f : 0.0f);
                this.expandOvershootAnimator.setInterpolator(new OvershootInterpolator(this.expandedSpringCoef));
                this.expandOvershootAnimator.setDuration(350L);
                final int i4 = 3;
                this.expandOvershootAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final DialogStoriesCell f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i4) {
                            case 0:
                                DialogStoriesCell dialogStoriesCell = this.f$0;
                                dialogStoriesCell.getClass();
                                dialogStoriesCell.collapsedProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                dialogStoriesCell.checkCollapsedProgress();
                                break;
                            case 1:
                                DialogStoriesCell dialogStoriesCell2 = this.f$0;
                                dialogStoriesCell2.getClass();
                                dialogStoriesCell2.yStoriesProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            case 2:
                                DialogStoriesCell dialogStoriesCell3 = this.f$0;
                                dialogStoriesCell3.getClass();
                                dialogStoriesCell3.collapsedOvershootProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                break;
                            default:
                                DialogStoriesCell dialogStoriesCell4 = this.f$0;
                                dialogStoriesCell4.getClass();
                                dialogStoriesCell4.expandOvershootAnimatorProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                dialogStoriesCell4.invalidate();
                                break;
                        }
                    }
                });
                arrayList.add(this.expandOvershootAnimator);
            }
            this.storiesAnimatorSet.playTogether(arrayList);
            this.storiesAnimatorSet.start();
        }
    }

    public final class StoryCell extends FrameLayout {
        public final AvatarDrawable avatarDrawable;
        public final ImageReceiver avatarImage;
        public final float bounceScale;
        public StoriesUtilities.EnsureStoryFileLoadedObject cancellable;
        public TLRPC.Chat chat;
        public final AvatarDrawable crossfadeAvatarDrawable;
        public final ImageReceiver crossfadeToAvatarImage;
        public boolean crossfadeToDialog;
        public long crossfadeToDialogId;
        public float cx;
        public float cy;
        public long dialogId;
        public boolean drawAvatar;
        public boolean drawInParent;
        public final AnimatedFloat failT;
        public boolean isFail;
        public boolean isFirst;
        public boolean isLast;
        public boolean isSelf;
        public boolean isUploadingState;
        public boolean mini;
        public final StoriesUtilities.AvatarStoryParams params;
        public int position;
        public float progressToCollapsed;
        public float progressToCollapsed2;
        public boolean progressWasDrawn;
        public RadialProgress radialProgress;
        public boolean selectedForOverscroll;
        public float textAlpha;
        public float textAlphaTransition;
        public SimpleTextView textView;
        public final FrameLayout textViewContainer;
        public final DialogsActivity.AnonymousClass25 this$0;
        public TLRPC.User user;
        public AnonymousClass11 verifiedDrawable;

        public StoryCell(DialogsActivity.AnonymousClass25 anonymousClass25, Context context) {
            super(context);
            this.this$0 = anonymousClass25;
            this.avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.avatarImage = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver(this);
            this.crossfadeToAvatarImage = imageReceiver2;
            this.crossfadeAvatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            this.drawAvatar = true;
            StoriesUtilities.AvatarStoryParams avatarStoryParams = new StoriesUtilities.AvatarStoryParams(null, true);
            this.params = avatarStoryParams;
            this.textAlpha = 1.0f;
            this.textAlphaTransition = 1.0f;
            this.bounceScale = 1.0f;
            this.failT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            avatarStoryParams.isArchive = anonymousClass25.type == 1;
            avatarStoryParams.isDialogStoriesCell = true;
            imageReceiver.setInvalidateAll(true);
            imageReceiver.setAllowLoadingOnAttachedOnly(true);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.textViewContainer = frameLayout;
            frameLayout.setClipChildren(false);
            if (!this.mini) {
                setClipChildren(false);
            }
            createTextView();
            addView(frameLayout, LayoutHelper.createFrame(-2.0f, -1));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
            imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        }

        public void setClipInParent(boolean z) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).setClipChildren(z);
            }
            if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
                return;
            }
            ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z);
        }

        public final void createTextView() {
            SimpleTextView simpleTextView = new SimpleTextView(getContext());
            this.textView = simpleTextView;
            simpleTextView.setTypeface(AndroidUtilities.bold());
            this.textView.setGravity(17);
            this.textView.setTextSize(11);
            this.textView.setTextColor(this.this$0.getTextColor());
            NotificationCenter.listenEmojiLoading(this.textView);
            this.textView.setMaxLines(1);
            this.textViewContainer.addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
            this.avatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
            this.crossfadeToAvatarImage.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            float size;
            boolean z;
            float f;
            float scale;
            float f2;
            float degrees;
            ?? r8;
            ImageReceiver imageReceiver;
            float f3;
            RadialProgress radialProgress;
            float fDp = AndroidUtilities.dp(48.0f);
            float fDp2 = AndroidUtilities.dp(26.33f);
            float fDp3 = AndroidUtilities.dp(8.0f);
            DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
            float fClamp = Utilities.clamp(anonymousClass25.overscrollProgress / 0.5f, 1.0f, 0.0f) * fDp3;
            if (this.selectedForOverscroll) {
                fClamp += Utilities.clamp((anonymousClass25.overscrollProgress - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
            }
            float fLerp = AndroidUtilities.lerp(fDp + fClamp, fDp2, this.progressToCollapsed);
            float f4 = fLerp / 2.0f;
            float measuredWidth = (getMeasuredWidth() / 2.0f) - f4;
            float fLerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.progressToCollapsed);
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (ActionBar.getCurrentActionBarHeight() - fDp2) / 2.0f, this.progressToCollapsed);
            float fClamp2 = Utilities.clamp(this.progressToCollapsed / 0.5f, 1.0f, 0.0f);
            StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
            avatarStoryParams.drawSegments = true;
            if (!avatarStoryParams.forceAnimateProgressToSegments) {
                avatarStoryParams.progressToSegments = 1.0f - anonymousClass25.collapsedProgress2;
            }
            RectF rectF = avatarStoryParams.originalAvatarRect;
            float f5 = fLerp3 + fLerp;
            rectF.set(fLerp2, fLerp3, fLerp2 + fLerp, f5);
            avatarStoryParams.additionalInset = AndroidUtilities.dpf2(1.33f) * this.progressToCollapsed;
            ImageReceiver imageReceiver2 = this.avatarImage;
            imageReceiver2.setAlpha(1.0f);
            imageReceiver2.setRoundRadius((int) f4);
            float f6 = fLerp2 + f4;
            this.cx = f6;
            float f7 = fLerp3 + f4;
            this.cy = f7;
            Paint paint = anonymousClass25.backgroundPaint;
            int i = anonymousClass25.type;
            if (i == 0) {
                paint.setColor(anonymousClass25.getThemedColor$18(Theme.key_actionBarDefault));
            } else {
                paint.setColor(anonymousClass25.getThemedColor$18(Theme.key_actionBarDefaultArchived));
            }
            if (this.progressToCollapsed != 0.0f) {
                canvas.drawCircle(this.cx, this.cy, AndroidUtilities.dpf2(1.5f) + f4, paint);
            }
            canvas.save();
            float f8 = this.cx;
            float f9 = this.cy;
            float f10 = this.bounceScale;
            canvas.scale(f10, f10, f8, f9);
            if (this.radialProgress == null) {
                this.radialProgress = anonymousClass25.radialProgress;
            }
            long j = this.dialogId;
            StoriesController storiesController = anonymousClass25.storiesController;
            ArrayList arrayList = (ArrayList) storiesController.uploadingAndEditingStories.get(j);
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            float f11 = fLerp2;
            if (z2 || (this.progressWasDrawn && (radialProgress = this.radialProgress) != null && radialProgress.animatedProgressValue < 0.98f)) {
                canvas2 = canvas;
                fLerp3 = fLerp3;
                f11 = f11;
                if (z2) {
                    float f12 = 0.0f;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        f12 += ((StoriesController.UploadingStory) arrayList.get(i2)).progress;
                    }
                    int i3 = storiesController.uploadedStories;
                    size = (i3 + f12) / (arrayList.size() + i3);
                    z = ((StoriesController.UploadingStory) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).isCloseFriends;
                    anonymousClass25.lastUploadingCloseFriends = z;
                } else {
                    z = anonymousClass25.lastUploadingCloseFriends;
                    size = 1.0f;
                }
                invalidate();
                if (this.radialProgress == null) {
                    RadialProgress radialProgress2 = anonymousClass25.radialProgress;
                    if (radialProgress2 != null) {
                        this.radialProgress = radialProgress2;
                    } else {
                        RadialProgress radialProgress3 = new RadialProgress(this);
                        this.radialProgress = radialProgress3;
                        anonymousClass25.radialProgress = radialProgress3;
                        radialProgress3.setBackground(null, true, false);
                    }
                }
                if (this.drawAvatar) {
                    canvas2.save();
                    ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
                    if (buttonBounce == null) {
                        scale = 1.0f;
                        f = 0.08f;
                    } else {
                        f = 0.08f;
                        scale = buttonBounce.getScale(0.08f);
                    }
                    ButtonBounce buttonBounce2 = avatarStoryParams.buttonBounce;
                    canvas2.scale(scale, buttonBounce2 == null ? 1.0f : buttonBounce2.getScale(f), rectF.centerX(), rectF.centerY());
                    imageReceiver2.setImageCoords(rectF);
                    imageReceiver2.draw(canvas2);
                    canvas2.restore();
                }
                this.radialProgress.diff = 0;
                Paint closeFriendsPaint = z ? StoriesUtilities.getCloseFriendsPaint(imageReceiver2) : StoriesUtilities.getUnreadCirclePaint(imageReceiver2, true);
                closeFriendsPaint.setAlpha(255);
                RadialProgress radialProgress4 = this.radialProgress;
                radialProgress4.overridePaint = closeFriendsPaint;
                radialProgress4.setProgressRect((int) (imageReceiver2.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver2.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver2.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver2.getImageY2() + AndroidUtilities.dp(3.0f)));
                this.radialProgress.setProgress(Utilities.clamp(size, 1.0f, 0.0f), this.progressWasDrawn);
                if (imageReceiver2.getVisible()) {
                    this.radialProgress.draw(canvas2);
                }
                this.progressWasDrawn = true;
                invalidate();
            } else {
                float f13 = this.failT.set(this.isFail);
                if (this.drawAvatar) {
                    if (this.progressWasDrawn) {
                        avatarStoryParams.forceAnimateProgressToSegments = true;
                        avatarStoryParams.progressToSegments = 0.0f;
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 20));
                        valueAnimatorOfFloat.addListener(new PhotoViewer.AnonymousClass78.AnonymousClass1(this, 18));
                        valueAnimatorOfFloat.setDuration(100L);
                        valueAnimatorOfFloat.start();
                    }
                    float f14 = f13 * avatarStoryParams.progressToSegments;
                    avatarStoryParams.animate = !this.progressWasDrawn;
                    if (this.isLast || anonymousClass25.overscrollProgress > 0.0f) {
                        degrees = 0.0f;
                    } else {
                        float fLerp4 = AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), CubicBezierInterpolator.EASE_OUT.getInterpolation(this.progressToCollapsed));
                        float fDpf2 = AndroidUtilities.dpf2(3.5f) + f4;
                        if (fLerp4 < fDpf2 * 2.0f) {
                            degrees = ((float) Math.toDegrees(Math.acos((fLerp4 / 2.0f) / fDpf2))) * 2.0f;
                        } else {
                            degrees = 0.0f;
                        }
                    }
                    avatarStoryParams.progressToArc = degrees;
                    avatarStoryParams.isLast = this.isLast;
                    avatarStoryParams.isFirst = this.isFirst;
                    avatarStoryParams.alpha = 1.0f - f14;
                    boolean z3 = this.isSelf;
                    if (z3 || !this.crossfadeToDialog) {
                        avatarStoryParams.crossfadeToDialog = 0L;
                    } else {
                        avatarStoryParams.crossfadeToDialog = this.crossfadeToDialogId;
                    }
                    if (z3) {
                        long j2 = this.dialogId;
                        boolean zHasSelfStories = storiesController.hasSelfStories();
                        imageReceiver = imageReceiver2;
                        r8 = 0;
                        StoriesUtilities.drawAvatarWithStory(j2, canvas, imageReceiver, zHasSelfStories, avatarStoryParams);
                        canvas2 = canvas;
                    } else {
                        r8 = 0;
                        long j3 = this.dialogId;
                        boolean zHasStories = storiesController.hasStories(j3);
                        imageReceiver = imageReceiver2;
                        StoriesUtilities.drawAvatarWithStory(j3, canvas, imageReceiver, zHasStories, avatarStoryParams);
                        canvas2 = canvas;
                    }
                    if (f14 > 0.0f) {
                        if (StoriesUtilities.errorGradientTools == null) {
                            GradientTools gradientTools = new GradientTools();
                            StoriesUtilities.errorGradientTools = gradientTools;
                            gradientTools.isDiagonal = true;
                            gradientTools.isRotate = true;
                            int color = Theme.getColor(null, Theme.key_color_orange, r8);
                            int color2 = Theme.getColor(null, Theme.key_text_RedBold, r8);
                            StoriesUtilities.errorGradientTools.setColors(ColorUtils.blendARGB(0.25f, color, color2), color2, r8, r8);
                            StoriesUtilities.errorGradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                            StoriesUtilities.errorGradientTools.paint.setStyle(Paint.Style.STROKE);
                            StoriesUtilities.errorGradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
                        }
                        GradientTools gradientTools2 = StoriesUtilities.errorGradientTools;
                        float imageX = imageReceiver.getImageX();
                        float imageY = imageReceiver.getImageY();
                        float imageX2 = imageReceiver.getImageX2();
                        float imageY2 = imageReceiver.getImageY2();
                        gradientTools2.getClass();
                        f3 = f14;
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(imageX, imageY, imageX2, imageY2);
                        gradientTools2.setBounds(rectF2);
                        Paint paint2 = StoriesUtilities.errorGradientTools.paint;
                        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                        paint2.setAlpha((int) (f3 * 255.0f));
                        float fDp4 = f4 + AndroidUtilities.dp(4.0f);
                        ButtonBounce buttonBounce3 = avatarStoryParams.buttonBounce;
                        canvas2.drawCircle(f6, f7, (buttonBounce3 == null ? 1.0f : buttonBounce3.getScale(0.08f)) * fDp4, paint2);
                    } else {
                        f3 = f14;
                    }
                    f13 = f3;
                } else {
                    canvas2 = canvas;
                    i = i;
                    fLerp3 = fLerp3;
                    f11 = f11;
                }
                this.progressWasDrawn = false;
                if (this.drawAvatar) {
                    canvas2.save();
                    float f15 = 1.0f - fClamp2;
                    canvas2.scale(f15, f15, this.cx + AndroidUtilities.dp(16.0f), this.cy + AndroidUtilities.dp(16.0f));
                    drawPlus(canvas2, this.cx, this.cy, 1.0f);
                    float f16 = this.cx;
                    float f17 = this.cy;
                    if (f13 > 0.0f) {
                        float fDp5 = f16 + AndroidUtilities.dp(17.0f);
                        float fDp6 = f17 + AndroidUtilities.dp(17.0f);
                        Paint paint3 = anonymousClass25.addCirclePaint;
                        paint3.setColor(Theme.multAlpha(f13, anonymousClass25.getThemedColor$18(Theme.key_text_RedBold)));
                        if (i == 0) {
                            paint.setColor(Theme.multAlpha(f13, anonymousClass25.getThemedColor$18(Theme.key_actionBarDefault)));
                        } else {
                            paint.setColor(Theme.multAlpha(f13, anonymousClass25.getThemedColor$18(Theme.key_actionBarDefaultArchived)));
                        }
                        float interpolation = CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(f13) * AndroidUtilities.dp(9.0f);
                        canvas2.drawCircle(fDp5, fDp6, AndroidUtilities.dp(2.0f) + interpolation, paint);
                        canvas2.drawCircle(fDp5, fDp6, interpolation, paint3);
                        paint3.setColor(Theme.multAlpha(f13, anonymousClass25.getTextColor()));
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(fDp5 - AndroidUtilities.dp(1.0f), fDp6 - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + fDp5, AndroidUtilities.dpf2(1.6f) + fDp6);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                        rectF3.set(fDp5 - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + fDp6, fDp5 + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(4.6f) + fDp6);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                    }
                    canvas2.restore();
                }
            }
            canvas2.restore();
            if (!this.crossfadeToDialog || this.progressToCollapsed2 <= 0.0f) {
                f2 = f11;
            } else {
                ImageReceiver imageReceiver3 = this.crossfadeToAvatarImage;
                f2 = f11;
                imageReceiver3.setImageCoords(f2, fLerp3, fLerp, fLerp);
                imageReceiver3.setAlpha(this.progressToCollapsed2);
                imageReceiver3.draw(canvas2);
            }
            FrameLayout frameLayout = this.textViewContainer;
            frameLayout.setTranslationY(((1.0f - this.progressToCollapsed) * AndroidUtilities.dp(7.0f)) + f5);
            frameLayout.setTranslationX(f2 - measuredWidth);
            if (!this.mini) {
                if (this.isSelf) {
                    this.textAlpha = 1.0f;
                } else {
                    this.textAlpha = avatarStoryParams.globalState == 2 ? 0.7f : 1.0f;
                }
                float f18 = this.textAlphaTransition * this.textAlpha;
                frameLayout.setAlpha(f18);
                frameLayout.setVisibility(f18 > 0.0f ? 0 : 4);
            }
            super.dispatchDraw(canvas);
        }

        public final void drawPlus(Canvas canvas, float f, float f2, float f3) {
            if (this.isSelf) {
                DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
                long j = this.dialogId;
                StoriesController storiesController = anonymousClass25.storiesController;
                if (storiesController.hasStories(j)) {
                    return;
                }
                if (Utilities.isNullOrEmpty((ArrayList) storiesController.uploadingStoriesByDialogId.get(this.dialogId))) {
                    float fDp = f + AndroidUtilities.dp(16.0f);
                    float fDp2 = f2 + AndroidUtilities.dp(16.0f);
                    Paint paint = anonymousClass25.addCirclePaint;
                    paint.setColor(Theme.multAlpha(f3, anonymousClass25.getThemedColor$18(Theme.key_telegram_color)));
                    Paint paint2 = anonymousClass25.backgroundPaint;
                    int i = anonymousClass25.type;
                    if (i == 0) {
                        paint2.setColor(Theme.multAlpha(f3, anonymousClass25.getThemedColor$18(Theme.key_actionBarDefault)));
                    } else {
                        paint2.setColor(Theme.multAlpha(f3, anonymousClass25.getThemedColor$18(Theme.key_actionBarDefaultArchived)));
                    }
                    canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(11.0f), paint2);
                    canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(9.0f), paint);
                    int themedColor$18 = anonymousClass25.getThemedColor$18(i == 0 ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived);
                    int i2 = anonymousClass25.addNewStoryLastColor;
                    Drawable drawable = anonymousClass25.addNewStoryDrawable;
                    if (themedColor$18 != i2) {
                        anonymousClass25.addNewStoryLastColor = themedColor$18;
                        drawable.setColorFilter(new PorterDuffColorFilter(themedColor$18, PorterDuff.Mode.MULTIPLY));
                    }
                    drawable.setAlpha((int) (f3 * 255.0f));
                    drawable.setBounds((int) (fDp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (fDp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + fDp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + fDp2));
                    drawable.draw(canvas);
                }
            }
        }

        public float getCy() {
            float fDp = AndroidUtilities.dp(48.0f);
            float fDp2 = AndroidUtilities.dp(26.33f);
            return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (ActionBar.getCurrentActionBarHeight() - fDp2) / 2.0f, this.this$0.collapsedProgress1) + (AndroidUtilities.lerp(fDp, fDp2, this.progressToCollapsed) / 2.0f);
        }

        @Override
        public final void invalidate() {
            if (this.mini || (this.drawInParent && getParent() != null)) {
                ViewParent parent = getParent();
                DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
                AnonymousClass1 anonymousClass1 = anonymousClass25.listViewMini;
                if (parent == anonymousClass1) {
                    anonymousClass1.invalidate();
                } else {
                    anonymousClass25.invalidate();
                }
            }
            super.invalidate();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.avatarImage.onAttachedToWindow();
            this.crossfadeToAvatarImage.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.avatarImage.onDetachedFromWindow();
            this.crossfadeToAvatarImage.onDetachedFromWindow();
            this.params.reset();
            StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.cancellable;
            if (ensureStoryFileLoadedObject != null) {
                ensureStoryFileLoadedObject.cancelled = true;
                ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
                this.cancellable = null;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.mini ? AndroidUtilities.dp(70.0f) : this.this$0.currentCellWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
        }

        public void setCrossfadeTo(long j) {
            TLRPC.Chat chat;
            TLObject tLObject;
            TLRPC.User user;
            if (this.crossfadeToDialogId != j) {
                this.crossfadeToDialogId = j;
                boolean z = j != -1;
                this.crossfadeToDialog = z;
                ImageReceiver imageReceiver = this.crossfadeToAvatarImage;
                if (!z) {
                    imageReceiver.clearImage();
                    return;
                }
                DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
                if (j > 0) {
                    user = MessagesController.getInstance(anonymousClass25.currentAccount).getUser(Long.valueOf(j));
                    this.user = user;
                    this.chat = null;
                } else {
                    chat = MessagesController.getInstance(anonymousClass25.currentAccount).getChat(Long.valueOf(-j));
                    this.chat = chat;
                    this.user = null;
                }
                if (tLObject == null) {
                    tLObject = chat;
                    tLObject = user;
                    return;
                }
                tLObject = chat;
                tLObject = user;
                AvatarDrawable avatarDrawable = this.crossfadeAvatarDrawable;
                avatarDrawable.setInfo(anonymousClass25.currentAccount, tLObject);
                imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            }
        }

        public void setDialogId(long j) {
            TLObject tLObject;
            StoriesController.UploadingStory uploadingStory;
            long j2 = this.dialogId;
            int i = 0;
            boolean z = j2 == j;
            final DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
            StoriesController storiesController = anonymousClass25.storiesController;
            if (!z && this.cancellable != null) {
                storiesController.setLoading(j2, false);
                StoriesUtilities.EnsureStoryFileLoadedObject ensureStoryFileLoadedObject = this.cancellable;
                ensureStoryFileLoadedObject.cancelled = true;
                ensureStoryFileLoadedObject.storiesController.setLoading(ensureStoryFileLoadedObject.dialogId, false);
                this.cancellable = null;
            }
            this.dialogId = j;
            int i2 = anonymousClass25.currentAccount;
            this.isSelf = j == UserConfig.getInstance(i2).getClientUserId();
            this.isFail = storiesController.isLastUploadingFailed(j);
            if (j > 0) {
                TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(j));
                this.user = user;
                this.chat = null;
                tLObject = user;
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-j));
                this.chat = chat;
                this.user = null;
                tLObject = chat;
            }
            ImageReceiver imageReceiver = this.avatarImage;
            if (tLObject == null) {
                this.textView.setText("", false);
                imageReceiver.clearImage();
                return;
            }
            AvatarDrawable avatarDrawable = this.avatarDrawable;
            avatarDrawable.setInfo(i2, tLObject);
            imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
            if (this.mini) {
                return;
            }
            this.textView.setRightDrawable((Drawable) null);
            if (storiesController.isLastUploadingFailed(j)) {
                this.textView.setTextSize(10);
                this.textView.setText(LocaleController.getString(R.string.FailedStory), false);
                this.isUploadingState = false;
                return;
            }
            if (!Utilities.isNullOrEmpty((ArrayList) storiesController.uploadingStoriesByDialogId.get(j))) {
                this.textView.setTextSize(10);
                SimpleTextView simpleTextView = this.textView;
                GradientTools[] gradientToolsArr = StoriesUtilities.storiesGradientTools;
                String string = LocaleController.getString(R.string.UploadingStory);
                if (string.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
                    UploadingDotsSpannable uploadingDotsSpannable = new UploadingDotsSpannable();
                    spannableStringBuilderValueOf.setSpan(uploadingDotsSpannable, spannableStringBuilderValueOf.length() - 1, spannableStringBuilderValueOf.length(), 0);
                    uploadingDotsSpannable.parent = simpleTextView;
                    uploadingDotsSpannable.isMediumTypeface = true;
                    simpleTextView.setText(spannableStringBuilderValueOf, false);
                } else {
                    simpleTextView.setText(string, false);
                }
                this.isUploadingState = true;
                return;
            }
            HashMap map = (HashMap) storiesController.editingStories.get(j);
            if (map == null || map.isEmpty()) {
                uploadingStory = null;
            } else {
                Collection collectionValues = map.values();
                if (collectionValues.isEmpty()) {
                    uploadingStory = null;
                } else {
                    uploadingStory = (StoriesController.UploadingStory) collectionValues.iterator().next();
                }
            }
            if (uploadingStory != null) {
                this.textView.setTextSize(10);
                SimpleTextView simpleTextView2 = this.textView;
                GradientTools[] gradientToolsArr2 = StoriesUtilities.storiesGradientTools;
                String string2 = LocaleController.getString(R.string.UploadingStory);
                if (string2.indexOf("…") > 0) {
                    SpannableStringBuilder spannableStringBuilderValueOf2 = SpannableStringBuilder.valueOf(string2);
                    UploadingDotsSpannable uploadingDotsSpannable2 = new UploadingDotsSpannable();
                    spannableStringBuilderValueOf2.setSpan(uploadingDotsSpannable2, spannableStringBuilderValueOf2.length() - 1, spannableStringBuilderValueOf2.length(), 0);
                    uploadingDotsSpannable2.parent = simpleTextView2;
                    uploadingDotsSpannable2.isMediumTypeface = true;
                    simpleTextView2.setText(spannableStringBuilderValueOf2, false);
                } else {
                    simpleTextView2.setText(string2, false);
                }
                this.isUploadingState = true;
                return;
            }
            if (this.isSelf) {
                if (z && this.isUploadingState && !this.mini) {
                    SimpleTextView simpleTextView3 = this.textView;
                    createTextView();
                    ValueAnimator valueAnimator = anonymousClass25.textAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        anonymousClass25.textAnimator = null;
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    anonymousClass25.textAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(26, this, simpleTextView3));
                    anonymousClass25.textAnimator.addListener(new QrActivity.AnonymousClass4(15, this, simpleTextView3));
                    anonymousClass25.textAnimator.setDuration(150L);
                    this.textView.setAlpha(0.0f);
                    this.textView.setTranslationY(AndroidUtilities.dp(5.0f));
                    anonymousClass25.animationRunnable = new DialogStoriesCell$StoryCell$$ExternalSyntheticLambda2(this, i);
                }
                AndroidUtilities.runOnUIThread(anonymousClass25.animationRunnable, 500L);
                this.isUploadingState = false;
                this.textView.setTextSize(10);
                this.textView.setText(LocaleController.getString(R.string.MyStory), false);
                return;
            }
            if (this.user == null) {
                this.textView.setTextSize(11);
                this.textView.setText(Emoji.replaceEmoji(this.chat.title, this.textView.getPaint().getFontMetricsInt(), false), false);
                this.textView.setRightDrawable((Drawable) null);
                return;
            }
            this.textView.setTextSize(11);
            String str = this.user.first_name;
            String strTrim = str != null ? str.trim() : "";
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf > 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
            String str2 = strTrim;
            if (!this.user.verified) {
                this.textView.setText(Emoji.replaceEmoji(str2, this.textView.getPaint().getFontMetricsInt(), false), false);
                this.textView.setRightDrawable((Drawable) null);
                return;
            }
            if (this.verifiedDrawable == null) {
                final Drawable drawableMutate = anonymousClass25.getContext().getDrawable(R.drawable.verified_area).mutate();
                final Drawable drawableMutate2 = anonymousClass25.getContext().getDrawable(R.drawable.verified_check).mutate();
                ?? r5 = new CombinedDrawable(drawableMutate, drawableMutate2) {
                    public int lastColor;

                    @Override
                    public final void draw(Canvas canvas) {
                        DialogsActivity.AnonymousClass25 anonymousClass26 = anonymousClass25;
                        int i3 = anonymousClass26.type;
                        int themedColor$18 = anonymousClass26.getThemedColor$18(i3 == 0 ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived);
                        if (this.lastColor != themedColor$18) {
                            this.lastColor = themedColor$18;
                            int iBlendARGB = ColorUtils.blendARGB(0.1f, anonymousClass26.getThemedColor$18(i3 == 0 ? Theme.key_actionBarDefaultTitle : Theme.key_actionBarDefaultArchivedTitle), themedColor$18);
                            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(iBlendARGB, mode));
                            drawableMutate2.setColorFilter(new PorterDuffColorFilter(themedColor$18, mode));
                        }
                        super.draw(canvas);
                    }
                };
                r5.fullSize = true;
                this.verifiedDrawable = r5;
            }
            this.textView.setText(Emoji.replaceEmoji(str2, this.textView.getPaint().getFontMetricsInt(), false), false);
            this.textView.setRightDrawable(this.verifiedDrawable);
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            StoriesUtilities.AvatarStoryParams avatarStoryParams = this.params;
            if (z && avatarStoryParams.buttonBounce == null) {
                avatarStoryParams.buttonBounce = new ButtonBounce(this, 1.5f, 5.0f);
            }
            ButtonBounce buttonBounce = avatarStoryParams.buttonBounce;
            if (buttonBounce != null) {
                buttonBounce.setPressed(z);
            }
        }

        public final void setProgressToCollapsed(float f, float f2, float f3, boolean z) {
            float f4 = this.progressToCollapsed;
            DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
            if (f4 != f || this.progressToCollapsed2 != f2 || 0.0f != f3 || this.selectedForOverscroll != z) {
                this.selectedForOverscroll = z;
                this.progressToCollapsed = f;
                this.progressToCollapsed2 = f2;
                invalidate();
                anonymousClass25.recyclerListView.invalidate();
            }
            float fClamp = this.mini ? 0.0f : 1.0f - Utilities.clamp(anonymousClass25.collapsedProgress / anonymousClass25.K, 1.0f, 0.0f);
            this.textAlphaTransition = fClamp;
            float f5 = fClamp * this.textAlpha;
            FrameLayout frameLayout = this.textViewContainer;
            frameLayout.setAlpha(f5);
            frameLayout.setVisibility(f5 > 0.0f ? 0 : 4);
        }

        @Override
        public final void invalidate(int i, int i2, int i3, int i4) {
            if (this.mini || (this.drawInParent && getParent() != null)) {
                ViewParent parent = getParent();
                DialogsActivity.AnonymousClass25 anonymousClass25 = this.this$0;
                AnonymousClass1 anonymousClass1 = anonymousClass25.listViewMini;
                if (parent == anonymousClass1) {
                    anonymousClass1.invalidate();
                }
                anonymousClass25.invalidate();
            }
            super.invalidate(i, i2, i3, i4);
        }
    }
}

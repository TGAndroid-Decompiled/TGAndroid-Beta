package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.util.SparseIntArray;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.PaddedListAdapter;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda29;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.blur3.Blur3HashImpl;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.CountrySelectActivity;
import org.telegram.ui.GradientHeaderActivity$$ExternalSyntheticLambda2;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.StakedDiceSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public class RecyclerListView extends RecyclerView implements IBlur3Capture {
    public static int[] attributes;
    public static boolean gotAttributes;
    public static final Method initializeScrollbars;
    public static final float[] radii;
    public static final Paint sectionBackgroundPaint;
    public static final Path sectionBackgroundPath;
    public static final Paint sectionBackgroundStrokePaint;
    public final AnonymousClass1 accessibilityDelegate;
    public boolean accessibilityEnabled;
    public int activeTouches;
    public boolean adaptiveOverScroll;
    public boolean allowItemsInteractionDuringAnimation;
    public boolean allowStopHeaveOperations;
    public boolean animateEmptyView;
    public Paint backgroundPaint;
    public boolean canCaptureSectionsDecorator;
    public RecyclerListView$RecyclerListViewItemClickListener$1.AnonymousClass1 clickRunnable;
    public final Path clipPath;
    public int currentChildPosition;
    public View currentChildView;
    public int currentFirst;
    public int currentSelectedPosition;
    public int currentVisible;
    public boolean disableHighlightState;
    public boolean disallowInterceptTouchEvents;
    public Utilities.Callback5 drawSectionBackground;
    public boolean drawSelection;
    public boolean drawSelectorBehind;
    public final EdgeEffectTrackerFactory edgeEffectTrackerFactory;
    public View emptyView;
    public int emptyViewAnimateToVisibility;
    public int emptyViewAnimationType;
    public FastScroll fastScroll;
    public boolean fastScrollAnimationRunning;
    public ArrayList forcedSections;
    public PhotoViewer.AnonymousClass18 gestureDetector;
    public GenericProvider getSelectorColor;
    public ArrayList headers;
    public ArrayList headersCache;
    public boolean hiddenByEmptyView;
    public boolean hideIfEmpty;
    public int highlightPosition;
    public boolean ignoreClipChild;
    public boolean ignoreLayout;
    public boolean instantClick;
    public boolean interceptedByChild;
    public boolean isChildViewEnabled;
    public boolean isHidden;
    public Utilities.CallbackReturn isViewTypeSection;
    public RecyclerItemsEnterAnimator itemsEnterAnimator;
    public long lastAlphaAnimationTime;
    public float lastX;
    public float lastY;
    public int[] listPaddings;
    public boolean longPressCalled;
    public boolean multiSelectionGesture;
    public boolean multiSelectionGestureStarted;
    public ChatActivity.AnonymousClass11 multiSelectionListener;
    public boolean multiselectScrollRunning;
    public boolean multiselectScrollToTop;
    public final PaddedListAdapter.AnonymousClass2 observer;
    public OnInterceptTouchListener onInterceptTouchListener;
    public OnItemClickListener onItemClickListener;
    public OnItemClickListenerExtended onItemClickListenerExtended;
    public OnItemLongClickListener onItemLongClickListener;
    public OnItemLongClickListenerExtended onItemLongClickListenerExtended;
    public RecyclerView.OnScrollListener onScrollListener;
    public ChatActivity.AnonymousClass60 overlayContainer;
    public IntReturnCallback pendingHighlightPosition;
    public View pinnedHeader;
    public float pinnedHeaderShadowAlpha;
    public Drawable pinnedHeaderShadowDrawable;
    public float pinnedHeaderShadowTargetAlpha;
    public SeekBarView$$ExternalSyntheticLambda1 removeHighlighSelectionRunnable;
    public boolean resetSelectorOnChanged;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean scrollEnabled;
    public boolean scrolledByUserOnce;
    public final BubbleActivity.AnonymousClass1 scroller;
    public boolean scrollingByUser;
    public int sectionOffset;
    public float sectionRadius;
    public float[] sectionRadiusBottom;
    public float[] sectionRadiusTop;
    public ArrayList sections;
    public SectionsAdapter sectionsAdapter;
    public int sectionsCount;
    public ListSectionsDecoration sectionsItemDecoration;
    public int sectionsType;
    public GLIconTextureView$1$$ExternalSyntheticLambda0 selectChildRunnable;
    public BaseCell.RippleDrawableSafe selectorDrawable;
    public int selectorPosition;
    public int selectorRadius;
    public final Rect selectorRect;
    public Consumer selectorTransformer;
    public int selectorType;
    public View selectorView;
    public boolean selfOnLayout;
    public Matrix selfTransformationsMatrix;
    public boolean skipDrawSection;
    public int startSection;
    public int startSelectionFrom;
    public boolean stoppedAllHeavyOperations;
    public int topBottomSelectorRadius;
    public int touchSlop;
    public int translateSelector;
    public boolean useLayoutPositionOnClick;

    public final class AnonymousClass1 extends View.AccessibilityDelegate {
        public final int $r8$classId;

        public AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            switch (this.$r8$classId) {
                case 0:
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    if (view.isEnabled()) {
                        accessibilityNodeInfo.addAction(16);
                    }
                    break;
                default:
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    accessibilityNodeInfo.setClassName("android.widget.ImageButton");
                    accessibilityNodeInfo.setClickable(true);
                    accessibilityNodeInfo.setLongClickable(true);
                    break;
            }
        }
    }

    public final class FastScroll extends View {
        public int activeColor;
        public final Path arrowPath;
        public BlurredBackgroundDrawable blurredCircleDrawable;
        public BlurredBackgroundDrawable blurredTagDrawable;
        public float bubbleProgress;
        public String currentLetter;
        public final Drawable fastScrollBackgroundDrawable;
        public final Drawable fastScrollShadowDrawable;
        public float floatingDateProgress;
        public boolean floatingDateVisible;
        public boolean fromTop;
        public float fromWidth;
        public final LaunchActivity.AnonymousClass18 hideFloatingDateRunnable;
        public StaticLayout inLetterLayout;
        public int inactiveColor;
        public boolean isMoving;
        public final boolean isRtl;
        public boolean isVisible;
        public float lastLetterY;
        public long lastUpdateTime;
        public float lastY;
        public StaticLayout letterLayout;
        public final TextPaint letterPaint;
        public StaticLayout oldLetterLayout;
        public StaticLayout outLetterLayout;
        public final Paint paint;
        public final Paint paint2;
        public final Path path;
        public final int[] positionWithOffset;
        public boolean pressed;
        public float progress;
        public final float[] radii;
        public final RectF rect;
        public float replaceLayoutProgress;
        public final int scrollX;
        public StaticLayout stableLetterLayout;
        public float startDy;
        public long startTime;
        public float startY;
        public float textX;
        public float textY;
        public int topOffset;
        public final float touchSlop;
        public final int type;
        public boolean usePadding;
        public float viewAlpha;
        public float visibilityAlpha;

        public FastScroll(Context context, int i) {
            super(context);
            this.usePadding = true;
            this.rect = new RectF();
            this.paint = new Paint(1);
            Paint paint = new Paint(1);
            this.paint2 = paint;
            this.replaceLayoutProgress = 1.0f;
            TextPaint textPaint = new TextPaint(1);
            this.letterPaint = textPaint;
            this.path = new Path();
            this.arrowPath = new Path();
            this.radii = new float[8];
            this.positionWithOffset = new int[2];
            this.hideFloatingDateRunnable = new LaunchActivity.AnonymousClass18(this, 1);
            this.viewAlpha = 1.0f;
            this.type = i;
            if (i == 0) {
                textPaint.setTextSize(AndroidUtilities.dp(45.0f));
                this.isRtl = LocaleController.isRTL;
            } else {
                this.isRtl = false;
                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                textPaint.setTypeface(AndroidUtilities.bold());
                int i2 = Theme.key_windowBackgroundWhite;
                Theme.ResourcesProvider resourcesProvider = RecyclerListView.this.resourcesProvider;
                paint.setColor(Theme.getColor(i2, resourcesProvider));
                Drawable drawableMutate = context.getDrawable(R.drawable.calendar_date).mutate();
                this.fastScrollBackgroundDrawable = drawableMutate;
                drawableMutate.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(0.1f, Theme.getColor(i2, resourcesProvider), -1), PorterDuff.Mode.MULTIPLY));
            }
            for (int i3 = 0; i3 < 8; i3++) {
                this.radii[i3] = AndroidUtilities.dp(44.0f);
            }
            int iDp = AndroidUtilities.dp(this.isRtl ? 10.0f : (i == 0 ? 132 : 240) - 15);
            this.scrollX = iDp;
            if (RecyclerListView.this.hasSections()) {
                this.scrollX = AndroidUtilities.dp(this.isRtl ? -4.0f : 6.0f) + iDp;
            }
            updateColors();
            setFocusableInTouchMode(true);
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.fastScrollShadowDrawable = context.getDrawable(R.drawable.fast_scroll_shadow);
        }

        @Override
        public float getAlpha() {
            return this.viewAlpha;
        }

        public final void getCurrentLetter(boolean z) {
            RecyclerListView recyclerListView = RecyclerListView.this;
            RecyclerView.LayoutManager layoutManager = recyclerListView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager.mOrientation == 1) {
                    RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                    if (adapter instanceof FastScrollAdapter) {
                        FastScrollAdapter fastScrollAdapter = (FastScrollAdapter) adapter;
                        float f = this.progress;
                        int[] iArr = this.positionWithOffset;
                        fastScrollAdapter.getPositionForScrollProgress(recyclerListView, f, iArr);
                        if (z) {
                            linearLayoutManager.scrollToPositionWithOffset(iArr[0], (-iArr[1]) + recyclerListView.sectionOffset);
                        }
                        String letter = fastScrollAdapter.getLetter(iArr[0]);
                        if (letter == null) {
                            StaticLayout staticLayout = this.letterLayout;
                            if (staticLayout != null) {
                                this.oldLetterLayout = staticLayout;
                            }
                            this.letterLayout = null;
                            return;
                        }
                        if (letter.equals(this.currentLetter)) {
                            return;
                        }
                        this.currentLetter = letter;
                        TextPaint textPaint = this.letterPaint;
                        if (this.type == 0) {
                            this.letterLayout = new StaticLayout(letter, textPaint, 1000, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        } else {
                            this.outLetterLayout = this.letterLayout;
                            int iMeasureText = ((int) textPaint.measureText(letter)) + 1;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                            this.letterLayout = new StaticLayout(letter, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
                            if (this.outLetterLayout != null) {
                                String[] strArrSplit = letter.split(" ");
                                String[] strArrSplit2 = this.outLetterLayout.getText().toString().split(" ");
                                if (strArrSplit != null && strArrSplit2 != null && strArrSplit.length == 2 && strArrSplit2.length == 2 && strArrSplit[1].equals(strArrSplit2[1])) {
                                    String string = this.outLetterLayout.getText().toString();
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                                    spannableStringBuilder.setSpan(new CountrySelectActivity.AnonymousClass5(false), strArrSplit2[0].length(), string.length(), 0);
                                    this.outLetterLayout = new StaticLayout(spannableStringBuilder, textPaint, ((int) textPaint.measureText(string)) + 1, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(letter);
                                    spannableStringBuilder2.setSpan(new CountrySelectActivity.AnonymousClass5(false), strArrSplit[0].length(), letter.length(), 0);
                                    this.inLetterLayout = new StaticLayout(spannableStringBuilder2, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
                                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(letter);
                                    spannableStringBuilder3.setSpan(new CountrySelectActivity.AnonymousClass5(false), 0, strArrSplit[0].length(), 0);
                                    this.stableLetterLayout = new StaticLayout(spannableStringBuilder3, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
                                } else {
                                    this.inLetterLayout = this.letterLayout;
                                    this.stableLetterLayout = null;
                                }
                                this.fromWidth = this.outLetterLayout.getWidth();
                                this.replaceLayoutProgress = 0.0f;
                                this.fromTop = getProgress() > this.lastLetterY;
                            }
                            this.lastLetterY = getProgress();
                        }
                        this.oldLetterLayout = null;
                        if (this.letterLayout.getLineCount() > 0) {
                            this.letterLayout.getLineWidth(0);
                            this.letterLayout.getLineLeft(0);
                            if (this.isRtl) {
                                this.textX = (((AndroidUtilities.dp(88.0f) - this.letterLayout.getLineWidth(0)) / 2.0f) + AndroidUtilities.dp(10.0f)) - this.letterLayout.getLineLeft(0);
                            } else {
                                this.textX = ((AndroidUtilities.dp(88.0f) - this.letterLayout.getLineWidth(0)) / 2.0f) - this.letterLayout.getLineLeft(0);
                            }
                            this.textY = (AndroidUtilities.dp(88.0f) - this.letterLayout.getHeight()) / 2;
                        }
                    }
                }
            }
        }

        public float getProgress() {
            return this.progress;
        }

        public int getScrollBarY() {
            return AndroidUtilities.dp(17.0f) + ((int) Math.ceil((getMeasuredHeight() - AndroidUtilities.dp(54.0f)) * this.progress));
        }

        @Override
        public final boolean isPressed() {
            return this.pressed;
        }

        @Override
        public final void layout(int i, int i2, int i3, int i4) {
            if (RecyclerListView.this.selfOnLayout) {
                super.layout(i, i2, i3, i4);
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            char c;
            float f4;
            float f5;
            int iDp;
            float fDp;
            float fDp2;
            float fDp3;
            int paddingTop = this.usePadding ? getPaddingTop() : 0;
            int iCeil = paddingTop + ((int) Math.ceil(((getMeasuredHeight() - paddingTop) - AndroidUtilities.dp(54.0f)) * this.progress));
            RectF rectF = this.rect;
            int i = this.scrollX;
            float f6 = i;
            rectF.set(f6, AndroidUtilities.dp(12.0f) + iCeil, AndroidUtilities.dp(5.0f) + i, AndroidUtilities.dp(42.0f) + iCeil);
            Paint paint = this.paint;
            int i2 = this.type;
            if (i2 == 0) {
                f = 12.0f;
                f2 = 36.0f;
                paint.setColor(ColorUtils.blendARGB(this.bubbleProgress, this.inactiveColor, this.activeColor));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                f3 = 8.0f;
                c = 2;
                f4 = 24.0f;
                f5 = 4.0f;
            } else {
                f = 12.0f;
                f2 = 36.0f;
                int i3 = Theme.key_windowBackgroundWhite;
                RecyclerListView recyclerListView = RecyclerListView.this;
                f3 = 8.0f;
                paint.setColor(ColorUtils.blendARGB(0.1f, Theme.getColor(i3, recyclerListView.resourcesProvider), -1));
                float fDp4 = AndroidUtilities.dp(27.0f) + iCeil;
                BlurredBackgroundDrawable blurredBackgroundDrawable = this.blurredCircleDrawable;
                if (blurredBackgroundDrawable != null) {
                    c = 2;
                    f4 = 24.0f;
                    blurredBackgroundDrawable.setBounds(AndroidUtilities.dp(-20.0f) + i, AndroidUtilities.dp(-1.0f) + iCeil, AndroidUtilities.dp(36.0f) + i, AndroidUtilities.dp(55.0f) + iCeil);
                    this.blurredCircleDrawable.draw(canvas);
                    f5 = 4.0f;
                } else {
                    c = 2;
                    f4 = 24.0f;
                    int measuredWidth = getMeasuredWidth();
                    Drawable drawable = this.fastScrollShadowDrawable;
                    f5 = 4.0f;
                    drawable.setBounds(measuredWidth - drawable.getIntrinsicWidth(), (int) (fDp4 - (drawable.getIntrinsicHeight() / 2)), getMeasuredWidth(), (int) (fDp4 + (drawable.getIntrinsicHeight() / 2)));
                    drawable.draw(canvas);
                    canvas.drawCircle(AndroidUtilities.dp(8.0f) + i, AndroidUtilities.dp(27.0f) + iCeil, AndroidUtilities.dp(24.0f), paint);
                }
                paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, recyclerListView.resourcesProvider));
                canvas.save();
                canvas.translate(AndroidUtilities.dp(f5) + i, (AndroidUtilities.dp(2.0f) * this.bubbleProgress) + AndroidUtilities.dp(34.0f) + iCeil);
                Path path = this.arrowPath;
                canvas.drawPath(path, paint);
                canvas.restore();
                canvas.save();
                canvas.translate(AndroidUtilities.dp(f5) + i, (AndroidUtilities.dp(f4) + iCeil) - (AndroidUtilities.dp(2.0f) * this.bubbleProgress));
                canvas.rotate(180.0f, 0.0f, -AndroidUtilities.dp(2.0f));
                canvas.drawPath(path, paint);
                canvas.restore();
            }
            if (i2 == 0) {
                if (this.isMoving || this.bubbleProgress != 0.0f) {
                    paint.setAlpha((int) (this.bubbleProgress * 255.0f));
                    int iDp2 = AndroidUtilities.dp(30.0f) + iCeil;
                    int iDp3 = iCeil - AndroidUtilities.dp(46.0f);
                    if (iDp3 <= AndroidUtilities.dp(f)) {
                        fDp = AndroidUtilities.dp(f) - iDp3;
                        iDp = AndroidUtilities.dp(f);
                    } else {
                        iDp = iDp3;
                        fDp = 0.0f;
                    }
                    canvas.translate(AndroidUtilities.dp(10.0f), iDp);
                    if (fDp <= AndroidUtilities.dp(29.0f)) {
                        fDp2 = AndroidUtilities.dp(44.0f);
                        fDp3 = ((fDp / AndroidUtilities.dp(29.0f)) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f5);
                    } else {
                        float fDp5 = fDp - AndroidUtilities.dp(29.0f);
                        float fDp6 = AndroidUtilities.dp(44.0f);
                        fDp2 = ((1.0f - (fDp5 / AndroidUtilities.dp(29.0f))) * AndroidUtilities.dp(40.0f)) + AndroidUtilities.dp(f5);
                        fDp3 = fDp6;
                    }
                    Path path2 = this.path;
                    boolean z = this.isRtl;
                    float[] fArr = this.radii;
                    if ((z && (fArr[0] != fDp2 || fArr[6] != fDp3)) || (!z && (fArr[c] != fDp2 || fArr[4] != fDp3))) {
                        if (z) {
                            fArr[1] = fDp2;
                            fArr[0] = fDp2;
                            fArr[7] = fDp3;
                            fArr[6] = fDp3;
                        } else {
                            fArr[3] = fDp2;
                            fArr[c] = fDp2;
                            fArr[5] = fDp3;
                            fArr[4] = fDp3;
                        }
                        path2.reset();
                        rectF.set(z ? AndroidUtilities.dp(10.0f) : 0.0f, 0.0f, AndroidUtilities.dp(z ? 98.0f : 88.0f), AndroidUtilities.dp(88.0f));
                        path2.addRoundRect(rectF, fArr, Path.Direction.CW);
                        path2.close();
                    }
                    StaticLayout staticLayout = this.letterLayout;
                    if (staticLayout == null) {
                        staticLayout = this.oldLetterLayout;
                    }
                    if (staticLayout != null) {
                        canvas.save();
                        float f7 = this.bubbleProgress;
                        canvas.scale(f7, f7, f6, iDp2 - iDp);
                        canvas.drawPath(path2, paint);
                        canvas.translate(this.textX, this.textY);
                        staticLayout.draw(canvas);
                        canvas.restore();
                    }
                }
            } else if (i2 == 1 && this.letterLayout != null && this.floatingDateProgress != 0.0f) {
                canvas.save();
                float f8 = (this.floatingDateProgress * 0.3f) + 0.7f;
                canvas.scale(f8, f8, rectF.right - AndroidUtilities.dp(f), rectF.centerY());
                float fCenterY = rectF.centerY();
                float fDp7 = (rectF.left - (AndroidUtilities.dp(30.0f) * this.bubbleProgress)) - AndroidUtilities.dp(f3);
                this.letterLayout.getHeight();
                AndroidUtilities.dp(6.0f);
                rectF.set((fDp7 - DiffUtil.m(1.0f, this.replaceLayoutProgress, this.fromWidth, this.replaceLayoutProgress * this.letterLayout.getWidth())) - AndroidUtilities.dp(f2), (fCenterY - (this.letterLayout.getHeight() / 2.0f)) - AndroidUtilities.dp(f3), fDp7 - AndroidUtilities.dp(f), (this.letterLayout.getHeight() / 2.0f) + fCenterY + AndroidUtilities.dp(f3));
                Paint paint2 = this.paint2;
                int alpha = paint2.getAlpha();
                TextPaint textPaint = this.letterPaint;
                int alpha2 = textPaint.getAlpha();
                paint2.setAlpha((int) (alpha * this.floatingDateProgress));
                if (this.blurredTagDrawable != null) {
                    Rect rect = AndroidUtilities.rectTmp2;
                    rectF.round(rect);
                    rect.inset(-AndroidUtilities.dp(f5), -AndroidUtilities.dp(f5));
                    this.blurredTagDrawable.setBounds(rect);
                    this.blurredTagDrawable.draw(canvas);
                } else {
                    int i4 = (int) rectF.left;
                    int i5 = (int) rectF.top;
                    int i6 = (int) rectF.right;
                    int i7 = (int) rectF.bottom;
                    Drawable drawable2 = this.fastScrollBackgroundDrawable;
                    drawable2.setBounds(i4, i5, i6, i7);
                    drawable2.setAlpha((int) (this.floatingDateProgress * 255.0f));
                    drawable2.draw(canvas);
                }
                float f9 = this.replaceLayoutProgress;
                if (f9 != 1.0f) {
                    float f10 = f9 + 0.10666667f;
                    this.replaceLayoutProgress = f10;
                    if (f10 > 1.0f) {
                        this.replaceLayoutProgress = 1.0f;
                    } else {
                        invalidate();
                    }
                }
                if (this.replaceLayoutProgress != 1.0f) {
                    canvas.save();
                    rectF.inset(AndroidUtilities.dp(f5), AndroidUtilities.dp(2.0f));
                    canvas.clipRect(rectF);
                    if (this.outLetterLayout != null) {
                        textPaint.setAlpha((int) ((1.0f - this.replaceLayoutProgress) * alpha2 * this.floatingDateProgress));
                        canvas.save();
                        canvas.translate((fDp7 - this.outLetterLayout.getWidth()) - AndroidUtilities.dp(f4), (AndroidUtilities.dp(15.0f) * (this.fromTop ? -1 : 1) * this.replaceLayoutProgress) + (fCenterY - (this.outLetterLayout.getHeight() / 2.0f)));
                        this.outLetterLayout.draw(canvas);
                        canvas.restore();
                    }
                    if (this.inLetterLayout != null) {
                        textPaint.setAlpha((int) (alpha2 * this.floatingDateProgress * this.replaceLayoutProgress));
                        canvas.save();
                        canvas.translate((fDp7 - this.inLetterLayout.getWidth()) - AndroidUtilities.dp(f4), DiffUtil.m(1.0f, this.replaceLayoutProgress, AndroidUtilities.dp(15.0f) * (this.fromTop ? 1 : -1), fCenterY - (this.inLetterLayout.getHeight() / 2.0f)));
                        this.inLetterLayout.draw(canvas);
                        canvas.restore();
                    }
                    if (this.stableLetterLayout != null) {
                        textPaint.setAlpha((int) (alpha2 * this.floatingDateProgress));
                        canvas.save();
                        canvas.translate((fDp7 - this.stableLetterLayout.getWidth()) - AndroidUtilities.dp(f4), fCenterY - (this.stableLetterLayout.getHeight() / 2.0f));
                        this.stableLetterLayout.draw(canvas);
                        canvas.restore();
                    }
                    canvas.restore();
                } else {
                    textPaint.setAlpha((int) (alpha2 * this.floatingDateProgress));
                    canvas.save();
                    canvas.translate((fDp7 - this.letterLayout.getWidth()) - AndroidUtilities.dp(f4), DiffUtil.m(1.0f, this.replaceLayoutProgress, AndroidUtilities.dp(15.0f), fCenterY - (this.letterLayout.getHeight() / 2.0f)));
                    this.letterLayout.draw(canvas);
                    canvas.restore();
                }
                paint2.setAlpha(alpha);
                textPaint.setAlpha(alpha2);
                canvas.restore();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = jCurrentTimeMillis - this.lastUpdateTime;
            if (j < 0 || j > 17) {
                j = 17;
            }
            boolean z2 = this.isMoving;
            if ((z2 && this.letterLayout != null && this.bubbleProgress < 1.0f) || ((!z2 || this.letterLayout == null) && this.bubbleProgress > 0.0f)) {
                this.lastUpdateTime = jCurrentTimeMillis;
                invalidate();
                if (!this.isMoving || this.letterLayout == null) {
                    float f11 = this.bubbleProgress - (j / 120.0f);
                    this.bubbleProgress = f11;
                    if (f11 < 0.0f) {
                        this.bubbleProgress = 0.0f;
                    }
                } else {
                    float f12 = (j / 120.0f) + this.bubbleProgress;
                    this.bubbleProgress = f12;
                    if (f12 > 1.0f) {
                        this.bubbleProgress = 1.0f;
                    }
                }
            }
            boolean z3 = this.floatingDateVisible;
            if (z3) {
                float f13 = this.floatingDateProgress;
                if (f13 != 1.0f) {
                    float f14 = (j / 120.0f) + f13;
                    this.floatingDateProgress = f14;
                    if (f14 > 1.0f) {
                        this.floatingDateProgress = 1.0f;
                    }
                    invalidate();
                    return;
                }
            }
            if (z3) {
                return;
            }
            float f15 = this.floatingDateProgress;
            if (f15 != 0.0f) {
                float f16 = f15 - (j / 120.0f);
                this.floatingDateProgress = f16;
                if (f16 < 0.0f) {
                    this.floatingDateProgress = 0.0f;
                }
                invalidate();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(AndroidUtilities.dp(this.type == 0 ? 132.0f : 240.0f), View.MeasureSpec.getSize(i2));
            Path path = this.arrowPath;
            path.reset();
            path.setLastPoint(0.0f, 0.0f);
            path.lineTo(AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            path.lineTo(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
            path.close();
        }

        @Override
        public final boolean onTouchEvent(android.view.MotionEvent r10) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.RecyclerListView.FastScroll.onTouchEvent(android.view.MotionEvent):boolean");
        }

        @Override
        public void setAlpha(float f) {
            if (this.viewAlpha != f) {
                this.viewAlpha = f;
                super.setAlpha(f * this.visibilityAlpha);
            }
        }

        public void setIsVisible(boolean z) {
            if (this.isVisible != z) {
                this.isVisible = z;
                float f = z ? 1.0f : 0.0f;
                this.visibilityAlpha = f;
                super.setAlpha(this.viewAlpha * f);
            }
        }

        public void setProgress(float f) {
            this.progress = f;
            invalidate();
        }

        public void setVisibilityAlpha(float f) {
            if (this.visibilityAlpha != f) {
                this.visibilityAlpha = f;
                super.setAlpha(this.viewAlpha * f);
            }
        }

        public final void showFloatingDate() {
            if (this.type != 1) {
                return;
            }
            if (!this.floatingDateVisible) {
                this.floatingDateVisible = true;
                invalidate();
            }
            LaunchActivity.AnonymousClass18 anonymousClass18 = this.hideFloatingDateRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass18);
            AndroidUtilities.runOnUIThread(anonymousClass18, 2000L);
        }

        public final void updateColors() {
            RecyclerListView recyclerListView = RecyclerListView.this;
            int i = this.type;
            this.inactiveColor = i == 0 ? Theme.getColor(Theme.key_fastScrollInactive, recyclerListView.resourcesProvider) : ColorUtils.setAlphaComponent(-16777216, 102);
            this.activeColor = Theme.getColor(Theme.key_fastScrollActive, recyclerListView.resourcesProvider);
            this.paint.setColor(this.inactiveColor);
            TextPaint textPaint = this.letterPaint;
            if (i == 0) {
                textPaint.setColor(Theme.getColor(Theme.key_fastScrollText, recyclerListView.resourcesProvider));
            } else {
                textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, recyclerListView.resourcesProvider));
            }
            invalidate();
        }
    }

    public abstract class FastScrollAdapter extends SelectionAdapter {
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            return true;
        }

        public abstract String getLetter(int i);

        public abstract void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr);

        public float getScrollProgress(RecyclerListView recyclerListView) {
            return recyclerListView.computeVerticalScrollOffset() / ((getTotalItemsCount() * recyclerListView.getChildAt(0).getMeasuredHeight()) - recyclerListView.getMeasuredHeight());
        }

        public void onFastScrollSingleTap() {
        }

        public void onFinishFastScroll(RecyclerListView recyclerListView) {
        }

        public void onStartFastScroll() {
        }
    }

    public final class FoucsableOnTouchListener implements View.OnTouchListener {
        public boolean onFocus;
        public float x;
        public float y;

        @Override
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                if (motionEvent.getAction() == 0) {
                    this.x = motionEvent.getX();
                    this.y = motionEvent.getY();
                    this.onFocus = true;
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                if (motionEvent.getAction() == 2) {
                    float x = this.x - motionEvent.getX();
                    float y = this.y - motionEvent.getY();
                    float scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                    if (this.onFocus) {
                        if (Math.sqrt((y * y) + (x * x)) > scaledTouchSlop) {
                            this.onFocus = false;
                            parent.requestDisallowInterceptTouchEvent(false);
                            return false;
                        }
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    this.onFocus = false;
                    parent.requestDisallowInterceptTouchEvent(false);
                    return false;
                }
            }
            return false;
        }
    }

    public final class Holder extends RecyclerView.ViewHolder {
    }

    public interface IntReturnCallback {
        int run();
    }

    public final class ListSectionsDecoration extends RecyclerView.ItemDecoration implements IBlur3Capture {
        public final boolean enableTopPadding;
        public final Utilities.CallbackReturn isSectionItem;
        public final int padding;
        public final RecyclerListView parent;

        public ListSectionsDecoration(RecyclerListView recyclerListView, Utilities.CallbackReturn callbackReturn, int i, boolean z) {
            this.parent = recyclerListView;
            this.isSectionItem = callbackReturn;
            this.padding = i;
            this.enableTopPadding = z;
        }

        @Override
        public final void capture(Canvas canvas, RectF rectF) {
            canvas.save();
            canvas.clipRect(rectF);
            this.parent.drawSectionsBackgrounds(canvas);
            canvas.restore();
        }

        @Override
        public final void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF) {
            blur3HashImpl.unsupported = true;
        }

        @Override
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int adapterPosition;
            if (((Boolean) this.isSectionItem.run(view)).booleanValue()) {
                int i = this.padding;
                rect.right = i;
                rect.left = i;
                RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (childViewHolder == null || adapter == null || (adapterPosition = childViewHolder.getAdapterPosition()) == -1) {
                    return;
                }
                boolean z = adapterPosition == 0;
                boolean z2 = adapterPosition == adapter.getItemCount() - 1;
                if (z) {
                    rect.top = this.enableTopPadding ? i : AndroidUtilities.dp(4.0f);
                }
                if (z2) {
                    rect.bottom = i;
                }
            }
        }

        @Override
        public final void onDraw(Canvas canvas, RecyclerView recyclerView) {
            if (recyclerView instanceof RecyclerListView) {
                ((RecyclerListView) recyclerView).drawSectionsBackgrounds(canvas);
            }
        }
    }

    public interface OnInterceptTouchListener {
    }

    public interface OnItemClickListener {
        void onItemClick(int i, View view);
    }

    public interface OnItemClickListenerExtended {
        boolean hasDoubleTap(View view);

        void onDoubleTap(View view, float f, float f2);

        void onItemClick(View view, int i, float f, float f2);
    }

    public interface OnItemLongClickListener {
        boolean onItemClick(int i, View view);
    }

    public interface OnItemLongClickListenerExtended {
        boolean mo1082onItemClick(View view, int i, float f, float f2);

        void onLongClickRelease();

        void onMove(float f);
    }

    public abstract class SectionsAdapter extends FastScrollAdapter {
        public int count;
        public final ArrayList hashes = new ArrayList();
        public SparseIntArray sectionCache;
        public int sectionCount;
        public SparseIntArray sectionCountCache;
        public SparseIntArray sectionPositionCache;

        public SectionsAdapter() {
            cleanupCache();
        }

        public final void cleanupCache() {
            SparseIntArray sparseIntArray = this.sectionCache;
            if (sparseIntArray == null) {
                this.sectionCache = new SparseIntArray();
                this.sectionPositionCache = new SparseIntArray();
                this.sectionCountCache = new SparseIntArray();
            } else {
                sparseIntArray.clear();
                this.sectionPositionCache.clear();
                this.sectionCountCache.clear();
            }
            this.count = -1;
            this.sectionCount = -1;
        }

        public abstract int getCountForSection(int i);

        public int getHash(int i, int i2) {
            return Objects.hash(Integer.valueOf((-49612) * i), getItem(i, i2));
        }

        public abstract Object getItem(int i, int i2);

        @Override
        public final int getItemCount() {
            int i = this.count;
            if (i >= 0) {
                return i;
            }
            this.count = 0;
            int sectionCount = this.sectionCount;
            if (sectionCount < 0) {
                sectionCount = getSectionCount();
                this.sectionCount = sectionCount;
            }
            for (int i2 = 0; i2 < sectionCount; i2++) {
                int i3 = this.count;
                int countForSection = this.sectionCountCache.get(i2, Integer.MAX_VALUE);
                if (countForSection == Integer.MAX_VALUE) {
                    countForSection = getCountForSection(i2);
                    this.sectionCountCache.put(i2, countForSection);
                }
                this.count = countForSection + i3;
            }
            return this.count;
        }

        @Override
        public final int getItemViewType(int i) {
            return getItemViewType(getSectionForPosition(i), getPositionInSectionForPosition(i));
        }

        public abstract int getItemViewType(int i, int i2);

        public final int getPositionInSectionForPosition(int i) {
            int i2 = this.sectionPositionCache.get(i, Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            int sectionCount = this.sectionCount;
            int i3 = 0;
            if (sectionCount < 0) {
                sectionCount = getSectionCount();
                this.sectionCount = sectionCount;
            }
            int i4 = 0;
            while (i3 < sectionCount) {
                int countForSection = this.sectionCountCache.get(i3, Integer.MAX_VALUE);
                if (countForSection == Integer.MAX_VALUE) {
                    countForSection = getCountForSection(i3);
                    this.sectionCountCache.put(i3, countForSection);
                }
                int i5 = countForSection + i4;
                if (i >= i4 && i < i5) {
                    int i6 = i - i4;
                    this.sectionPositionCache.put(i, i6);
                    return i6;
                }
                i3++;
                i4 = i5;
            }
            return -1;
        }

        public abstract int getSectionCount();

        public final int getSectionForPosition(int i) {
            int i2 = this.sectionCache.get(i, Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            int sectionCount = this.sectionCount;
            int i3 = 0;
            if (sectionCount < 0) {
                sectionCount = getSectionCount();
                this.sectionCount = sectionCount;
            }
            int i4 = 0;
            while (i3 < sectionCount) {
                int countForSection = this.sectionCountCache.get(i3, Integer.MAX_VALUE);
                if (countForSection == Integer.MAX_VALUE) {
                    countForSection = getCountForSection(i3);
                    this.sectionCountCache.put(i3, countForSection);
                }
                int i5 = countForSection + i4;
                if (i >= i4 && i < i5) {
                    this.sectionCache.put(i, i3);
                    return i3;
                }
                i3++;
                i4 = i5;
            }
            return -1;
        }

        public abstract View getSectionHeaderView$1(int i, View view);

        public abstract boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder);

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return isEnabled(getSectionForPosition(adapterPosition), getPositionInSectionForPosition(adapterPosition), viewHolder);
        }

        @Override
        public void notifyDataSetChanged() {
            update(false);
        }

        public abstract void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder);

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            onBindViewHolder(getSectionForPosition(i), getPositionInSectionForPosition(i), viewHolder);
        }

        public final void update(boolean z) {
            ArrayList arrayList = this.hashes;
            ArrayList arrayList2 = new ArrayList(arrayList);
            cleanupCache();
            arrayList.clear();
            int sectionCount = this.sectionCount;
            if (sectionCount < 0) {
                sectionCount = getSectionCount();
                this.sectionCount = sectionCount;
            }
            for (int i = 0; i < sectionCount; i++) {
                int countForSection = this.sectionCountCache.get(i, Integer.MAX_VALUE);
                if (countForSection == Integer.MAX_VALUE) {
                    countForSection = getCountForSection(i);
                    this.sectionCountCache.put(i, countForSection);
                }
                for (int i2 = 0; i2 < countForSection; i2++) {
                    arrayList.add(Integer.valueOf(getHash(i, i2)));
                }
            }
            if (z) {
                DiffUtil.calculateDiff(new DialogsAdapter.AnonymousClass1(this, arrayList2, 3), true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this, 1));
            } else {
                this.mObservable.notifyChanged();
            }
        }
    }

    public abstract class SectionsDrawer {
        public static final ArrayList groups = new ArrayList();

        public final class Section {
            public final float alpha;
            public final float from;
            public final float to;

            public Section(float f, float f2, float f3) {
                this.from = f;
                this.to = f2;
                this.alpha = f3;
            }
        }
    }

    public abstract class SelectionAdapter extends RecyclerView.Adapter {
        public abstract boolean isEnabled(RecyclerView.ViewHolder viewHolder);
    }

    static {
        Method declaredMethod;
        try {
            declaredMethod = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
        } catch (Exception unused) {
            declaredMethod = null;
        }
        initializeScrollbars = declaredMethod;
        sectionBackgroundPaint = new Paint(1);
        sectionBackgroundStrokePaint = new Paint(1);
        sectionBackgroundPath = new Path();
        radii = new float[8];
    }

    public RecyclerListView(Context context) {
        this(context, null);
    }

    public static float bottom(View view) {
        return view.getTag(R.id.dragging) != null ? view.getBottom() : view.getY() + view.getHeight();
    }

    public static void drawBackgroundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, Theme.ResourcesProvider resourcesProvider) {
        boolean z = SharedConfig.shadowsInSections;
        Paint paint = sectionBackgroundPaint;
        Paint paint2 = sectionBackgroundStrokePaint;
        if (z) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, Theme.multAlpha(f3, 201326592));
            paint2.setColor(0);
            paint.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), Theme.multAlpha(f3, 167772160));
        } else {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        paint.setColor(Theme.multAlpha(f3, Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
        if (f == f2) {
            if (SharedConfig.shadowsInSections) {
                canvas.drawRoundRect(rectF, f, f, paint2);
            }
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        Path path = sectionBackgroundPath;
        path.rewind();
        float[] fArr = radii;
        fArr[3] = f;
        fArr[2] = f;
        fArr[1] = f;
        fArr[0] = f;
        fArr[7] = f2;
        fArr[6] = f2;
        fArr[5] = f2;
        fArr[4] = f2;
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        if (SharedConfig.shadowsInSections) {
            canvas.drawPath(path, paint2);
        }
        canvas.drawPath(path, paint);
    }

    private int[] getDrawableStateForSelector() {
        int[] iArrOnCreateDrawableState = onCreateDrawableState(1);
        iArrOnCreateDrawableState[iArrOnCreateDrawableState.length - 1] = 16842919;
        return iArrOnCreateDrawableState;
    }

    public final void addEdgeEffectListener(Runnable runnable) {
        this.edgeEffectTrackerFactory.listeners.add(new RecyclerListView$$ExternalSyntheticLambda5(runnable, 0));
    }

    public final void addOverlayView(SharedMediaLayout.AnonymousClass26 anonymousClass26, FrameLayout.LayoutParams layoutParams) {
        if (this.overlayContainer == null) {
            this.overlayContainer = new ChatActivity.AnonymousClass60(22, getContext(), this);
        }
        this.overlayContainer.addView(anonymousClass26, layoutParams);
    }

    public boolean allowSelectChildAtPosition(float f) {
        return true;
    }

    public boolean canHighlightChildAt(View view, float f, float f2) {
        return true;
    }

    @Override
    public final boolean canScrollVertically(int i) {
        return this.scrollEnabled && super.canScrollVertically(i);
    }

    public final void cancelClickRunnables(boolean z) {
        GLIconTextureView$1$$ExternalSyntheticLambda0 gLIconTextureView$1$$ExternalSyntheticLambda0 = this.selectChildRunnable;
        if (gLIconTextureView$1$$ExternalSyntheticLambda0 != null) {
            AndroidUtilities.cancelRunOnUIThread(gLIconTextureView$1$$ExternalSyntheticLambda0);
            this.selectChildRunnable = null;
        }
        View view = this.currentChildView;
        if (view != null) {
            if (z) {
                onChildPressed(view, 0.0f, 0.0f, false);
            }
            this.currentChildView = null;
            removeSelection(null, view);
        }
        this.selectorRect.setEmpty();
        RecyclerListView$RecyclerListViewItemClickListener$1.AnonymousClass1 anonymousClass1 = this.clickRunnable;
        if (anonymousClass1 != null) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            this.clickRunnable = null;
        }
        this.interceptedByChild = false;
    }

    public void capture(Canvas canvas, RectF rectF) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (hasActiveEdgeEffects() && getOverScrollMode() != 2) {
            if (this.selfTransformationsMatrix == null) {
                this.selfTransformationsMatrix = new Matrix();
            }
            canvas.save();
            if (getMatrix().invert(this.selfTransformationsMatrix)) {
                canvas.concat(this.selfTransformationsMatrix);
            }
            canvas.translate(-getX(), -getY());
            try {
                super.drawChild(canvas, this, jUptimeMillis);
            } catch (Throwable th) {
                FileLog.e(th);
            }
            canvas.restore();
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            Object itemDecorationAt = getItemDecorationAt(i);
            if ((itemDecorationAt instanceof IBlur3Capture) && (itemDecorationAt != this.sectionsItemDecoration || this.canCaptureSectionsDecorator)) {
                ((IBlur3Capture) itemDecorationAt).capture(canvas, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float x = childAt.getX();
            float y = childAt.getY();
            if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                this.ignoreClipChild = true;
                drawChild(canvas, childAt, jUptimeMillis);
                this.ignoreClipChild = false;
            }
        }
    }

    @Override
    public final void captureCalculateHash(Blur3HashImpl blur3HashImpl, RectF rectF) {
        if (Build.VERSION.SDK_INT < 29) {
            blur3HashImpl.unsupported = true;
            return;
        }
        if (hasActiveEdgeEffects() && getOverScrollMode() != 2) {
            blur3HashImpl.unsupported = true;
            return;
        }
        int itemDecorationCount = getItemDecorationCount();
        for (int i = 0; i < itemDecorationCount; i++) {
            Object itemDecorationAt = getItemDecorationAt(i);
            if ((itemDecorationAt instanceof IBlur3Capture) && (itemDecorationAt != this.sectionsItemDecoration || this.canCaptureSectionsDecorator)) {
                ((IBlur3Capture) itemDecorationAt).captureCalculateHash(blur3HashImpl, rectF);
            }
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            float x = childAt.getX();
            float y = childAt.getY();
            if (rectF.intersects(x, y, childAt.getWidth() + x, childAt.getHeight() + y)) {
                if (Build.VERSION.SDK_INT >= 29) {
                    blur3HashImpl.getClass();
                    blur3HashImpl.hash = MediaDataController.calcHash(blur3HashImpl.hash, childAt.getUniqueDrawingId());
                } else {
                    blur3HashImpl.unsupported = true;
                }
            }
        }
    }

    public final void checkIfEmpty(boolean z) {
        if (this.isHidden) {
            return;
        }
        if (getAdapter() == null || this.emptyView == null) {
            if (!this.hiddenByEmptyView || getVisibility() == 0) {
                return;
            }
            setVisibility(0);
            this.hiddenByEmptyView = false;
            return;
        }
        boolean zEmptyViewIsVisible = emptyViewIsVisible();
        int i = zEmptyViewIsVisible ? 0 : 8;
        if (!this.animateEmptyView || !SharedConfig.animationsEnabled()) {
            z = false;
        }
        if (!z) {
            this.emptyViewAnimateToVisibility = i;
            this.emptyView.setVisibility(i);
            this.emptyView.setAlpha(1.0f);
        } else if (this.emptyViewAnimateToVisibility != i) {
            this.emptyViewAnimateToVisibility = i;
            if (i == 0) {
                this.emptyView.animate().setListener(null).cancel();
                if (this.emptyView.getVisibility() == 8) {
                    this.emptyView.setVisibility(0);
                    this.emptyView.setAlpha(0.0f);
                    if (this.emptyViewAnimationType == 1) {
                        this.emptyView.setScaleX(0.7f);
                        this.emptyView.setScaleY(0.7f);
                    }
                }
                this.emptyView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
            } else if (this.emptyView.getVisibility() != 8) {
                ViewPropertyAnimator viewPropertyAnimatorAlpha = this.emptyView.animate().alpha(0.0f);
                if (this.emptyViewAnimationType == 1) {
                    viewPropertyAnimatorAlpha.scaleY(0.7f).scaleX(0.7f);
                }
                viewPropertyAnimatorAlpha.setDuration(150L).setListener(new ItemOptions.AnonymousClass3(this, 27)).start();
            }
        }
        if (this.hideIfEmpty) {
            int i2 = zEmptyViewIsVisible ? 4 : 0;
            if (getVisibility() != i2) {
                setVisibility(i2);
            }
            this.hiddenByEmptyView = true;
        }
    }

    public final void checkSection(boolean z) {
        FastScroll fastScroll;
        RecyclerView.ViewHolder childViewHolder;
        FastScroll fastScroll2;
        View view;
        RecyclerView.ViewHolder childViewHolder2;
        int adapterPosition;
        int sectionForPosition;
        if (((this.scrollingByUser || z) && this.fastScroll != null) || !(this.sectionsType == 0 || this.sectionsAdapter == null)) {
            RecyclerView.LayoutManager layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager.mOrientation == 1) {
                    if (this.sectionsAdapter == null) {
                        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        Math.abs(linearLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition);
                        if (iFindFirstVisibleItemPosition == -1) {
                            return;
                        }
                        if ((!this.scrollingByUser && !z) || (fastScroll = this.fastScroll) == null || fastScroll.pressed) {
                            return;
                        }
                        RecyclerView.Adapter adapter = getAdapter();
                        if (adapter instanceof FastScrollAdapter) {
                            FastScrollAdapter fastScrollAdapter = (FastScrollAdapter) adapter;
                            float scrollProgress = fastScrollAdapter.getScrollProgress(this);
                            this.fastScroll.setIsVisible(fastScrollAdapter.fastScrollIsVisible(this));
                            this.fastScroll.setProgress(Math.min(1.0f, scrollProgress));
                            this.fastScroll.getCurrentLetter(false);
                            return;
                        }
                        return;
                    }
                    int paddingTop = this.sectionsType == 1 ? 0 : getPaddingTop();
                    int i = this.sectionsType;
                    int i2 = Integer.MAX_VALUE;
                    if (i != 1 && i != 3) {
                        if (i == 2) {
                            this.pinnedHeaderShadowTargetAlpha = 0.0f;
                            if (this.sectionsAdapter.getItemCount() == 0) {
                                return;
                            }
                            int childCount = getChildCount();
                            View view2 = null;
                            int i3 = Integer.MAX_VALUE;
                            View view3 = null;
                            int iMax = 0;
                            for (int i4 = 0; i4 < childCount; i4++) {
                                View childAt = getChildAt(i4);
                                int bottom = childAt.getBottom();
                                if (bottom > this.sectionOffset + paddingTop) {
                                    if (bottom < i2) {
                                        view3 = childAt;
                                        i2 = bottom;
                                    }
                                    iMax = Math.max(iMax, bottom);
                                    if (bottom >= AndroidUtilities.dp(32.0f) + this.sectionOffset + paddingTop && bottom < i3) {
                                        view2 = childAt;
                                        i3 = bottom;
                                    }
                                }
                            }
                            if (view3 == null || (childViewHolder2 = getChildViewHolder(view3)) == null || (sectionForPosition = this.sectionsAdapter.getSectionForPosition((adapterPosition = childViewHolder2.getAdapterPosition()))) < 0) {
                                return;
                            }
                            if (this.currentFirst != sectionForPosition || this.pinnedHeader == null) {
                                View view4 = this.pinnedHeader;
                                boolean z2 = view4 == null;
                                View sectionHeaderView$1 = this.sectionsAdapter.getSectionHeaderView$1(sectionForPosition, view4);
                                if (z2) {
                                    ensurePinnedHeaderLayout(sectionHeaderView$1, false);
                                }
                                this.pinnedHeader = sectionHeaderView$1;
                                sectionHeaderView$1.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0));
                                View view5 = this.pinnedHeader;
                                view5.layout(0, 0, view5.getMeasuredWidth(), this.pinnedHeader.getMeasuredHeight());
                                this.currentFirst = sectionForPosition;
                            }
                            if (this.pinnedHeader != null && view2 != null && view2.getClass() != this.pinnedHeader.getClass()) {
                                this.pinnedHeaderShadowTargetAlpha = 1.0f;
                            }
                            int countForSection = this.sectionsAdapter.getCountForSection(sectionForPosition);
                            int positionInSectionForPosition = this.sectionsAdapter.getPositionInSectionForPosition(adapterPosition);
                            int i5 = (iMax == 0 || iMax >= getMeasuredHeight() - getPaddingBottom()) ? this.sectionOffset : -paddingTop;
                            if (positionInSectionForPosition == countForSection - 1) {
                                int height = this.pinnedHeader.getHeight();
                                int height2 = view3.getHeight() + ((view3.getTop() - paddingTop) - this.sectionOffset);
                                int i6 = height2 < height ? height2 - height : paddingTop;
                                if (i6 < 0) {
                                    this.pinnedHeader.setTag(Integer.valueOf(paddingTop + i5 + i6));
                                } else {
                                    this.pinnedHeader.setTag(Integer.valueOf(paddingTop + i5));
                                }
                            } else {
                                this.pinnedHeader.setTag(Integer.valueOf(paddingTop + i5));
                            }
                            invalidate();
                            return;
                        }
                        return;
                    }
                    int childCount2 = getChildCount();
                    int i7 = Integer.MAX_VALUE;
                    View view6 = null;
                    int iMax2 = 0;
                    for (int i8 = 0; i8 < childCount2; i8++) {
                        View childAt2 = getChildAt(i8);
                        int bottom2 = childAt2.getBottom();
                        if (bottom2 > this.sectionOffset + paddingTop) {
                            if (bottom2 < i2) {
                                i2 = bottom2;
                                view6 = childAt2;
                            }
                            iMax2 = Math.max(iMax2, bottom2);
                            if (bottom2 >= AndroidUtilities.dp(32.0f) + this.sectionOffset + paddingTop && bottom2 < i7) {
                                i7 = bottom2;
                            }
                        }
                    }
                    if (view6 == null || (childViewHolder = getChildViewHolder(view6)) == null) {
                        return;
                    }
                    int adapterPosition2 = childViewHolder.getAdapterPosition();
                    int iAbs = Math.abs(linearLayoutManager.findLastVisibleItemPosition() - adapterPosition2) + 1;
                    if ((this.scrollingByUser || z) && (fastScroll2 = this.fastScroll) != null && !fastScroll2.pressed && (getAdapter() instanceof FastScrollAdapter)) {
                        this.fastScroll.setProgress(Math.min(1.0f, adapterPosition2 / ((this.sectionsAdapter.getItemCount() - iAbs) + 1)));
                    }
                    this.headersCache.addAll(this.headers);
                    this.headers.clear();
                    if (this.sectionsAdapter.getItemCount() == 0) {
                        return;
                    }
                    if (this.currentFirst != adapterPosition2 || this.currentVisible != iAbs) {
                        this.currentFirst = adapterPosition2;
                        this.currentVisible = iAbs;
                        this.sectionsCount = 1;
                        int sectionForPosition2 = this.sectionsAdapter.getSectionForPosition(adapterPosition2);
                        this.startSection = sectionForPosition2;
                        int countForSection2 = (this.sectionsAdapter.getCountForSection(sectionForPosition2) + adapterPosition2) - this.sectionsAdapter.getPositionInSectionForPosition(adapterPosition2);
                        while (countForSection2 < adapterPosition2 + iAbs) {
                            countForSection2 += this.sectionsAdapter.getCountForSection(this.startSection + this.sectionsCount);
                            this.sectionsCount++;
                        }
                    }
                    if (this.sectionsType != 3) {
                        int positionInSectionForPosition2 = adapterPosition2;
                        for (int i9 = this.startSection; i9 < this.startSection + this.sectionsCount; i9++) {
                            if (this.headersCache.isEmpty()) {
                                view = null;
                            } else {
                                view = (View) this.headersCache.get(0);
                                this.headersCache.remove(0);
                            }
                            boolean z3 = view == null;
                            View sectionHeaderView$2 = this.sectionsAdapter.getSectionHeaderView$1(i9, view);
                            if (z3) {
                                ensurePinnedHeaderLayout(sectionHeaderView$2, false);
                            }
                            this.headers.add(sectionHeaderView$2);
                            int countForSection3 = this.sectionsAdapter.getCountForSection(i9);
                            if (i9 == this.startSection) {
                                int positionInSectionForPosition3 = this.sectionsAdapter.getPositionInSectionForPosition(positionInSectionForPosition2);
                                if (positionInSectionForPosition3 == countForSection3 - 1) {
                                    sectionHeaderView$2.setTag(Integer.valueOf((-sectionHeaderView$2.getHeight()) + paddingTop));
                                } else if (positionInSectionForPosition3 == countForSection3 - 2) {
                                    View childAt3 = getChildAt(positionInSectionForPosition2 - adapterPosition2);
                                    sectionHeaderView$2.setTag(Integer.valueOf(Math.min(childAt3 != null ? childAt3.getTop() + paddingTop : -AndroidUtilities.dp(100.0f), 0)));
                                } else {
                                    sectionHeaderView$2.setTag(0);
                                }
                                positionInSectionForPosition2 = (countForSection3 - this.sectionsAdapter.getPositionInSectionForPosition(adapterPosition2)) + positionInSectionForPosition2;
                            } else {
                                View childAt4 = getChildAt(positionInSectionForPosition2 - adapterPosition2);
                                if (childAt4 != null) {
                                    sectionHeaderView$2.setTag(Integer.valueOf(childAt4.getTop() + paddingTop));
                                } else {
                                    sectionHeaderView$2.setTag(Integer.valueOf(-AndroidUtilities.dp(100.0f)));
                                }
                                positionInSectionForPosition2 += countForSection3;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void chekMultiselect(float f, float f2) {
        MessageObject.GroupedMessages groupedMessages;
        int measuredHeight = getMeasuredHeight();
        int[] iArr = this.listPaddings;
        float fMin = Math.min(measuredHeight - iArr[1], Math.max(f2, iArr[0]));
        float fMin2 = Math.min(getMeasuredWidth(), Math.max(f, 0.0f));
        for (int i = 0; i < getChildCount(); i++) {
            ChatActivity.AnonymousClass11 anonymousClass11 = this.multiSelectionListener;
            int[] iArr2 = this.listPaddings;
            ChatActivity chatActivity = ChatActivity.this;
            iArr2[0] = (int) chatActivity.chatListViewPaddingTop;
            iArr2[1] = chatActivity.blurredViewBottomOffset;
            View childAt = getChildAt(i);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getMeasuredWidth() + childAt.getLeft(), childAt.getMeasuredHeight() + childAt.getTop());
            if (rectF.contains(fMin2, fMin)) {
                int childLayoutPosition = RecyclerView.getChildLayoutPosition(childAt);
                int i2 = this.currentSelectedPosition;
                if (i2 != childLayoutPosition) {
                    int i3 = this.startSelectionFrom;
                    boolean z = i2 > i3 || childLayoutPosition > i3;
                    ChatActivity.AnonymousClass11 anonymousClass12 = this.multiSelectionListener;
                    ChatActivity chatActivity2 = ChatActivity.this;
                    int i4 = childLayoutPosition - chatActivity2.chatAdapter.messagesStartRow;
                    if (i4 >= 0 && i4 < chatActivity2.messages.size()) {
                        ChatActivity chatActivity3 = ChatActivity.this;
                        MessageObject messageObject = (MessageObject) chatActivity3.messages.get(i4);
                        if (messageObject.contentType == 0 && messageObject.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) chatActivity3.groupedMessagesMap.get(messageObject.getGroupId())) != null) {
                            ArrayList<MessageObject> arrayList = groupedMessages.messages;
                            childLayoutPosition = chatActivity3.messages.indexOf(arrayList.get(z ? 0 : arrayList.size() - 1)) + chatActivity3.chatAdapter.messagesStartRow;
                        }
                    }
                    if (z) {
                        int i5 = this.currentSelectedPosition;
                        if (childLayoutPosition <= i5) {
                            while (i5 > childLayoutPosition) {
                                if (i5 != this.startSelectionFrom && this.multiSelectionListener.canSelect(i5)) {
                                    this.multiSelectionListener.onSelectionChanged(fMin2, fMin, i5, false);
                                }
                                i5--;
                            }
                        } else if (!this.multiSelectionListener.limitReached) {
                            while (true) {
                                i5++;
                                if (i5 > childLayoutPosition) {
                                    break;
                                } else if (i5 != this.startSelectionFrom && this.multiSelectionListener.canSelect(i5)) {
                                    this.multiSelectionListener.onSelectionChanged(fMin2, fMin, i5, true);
                                }
                            }
                        }
                    } else {
                        int i6 = this.currentSelectedPosition;
                        if (childLayoutPosition > i6) {
                            while (i6 < childLayoutPosition) {
                                if (i6 != this.startSelectionFrom && this.multiSelectionListener.canSelect(i6)) {
                                    this.multiSelectionListener.onSelectionChanged(fMin2, fMin, i6, false);
                                }
                                i6++;
                            }
                        } else if (!this.multiSelectionListener.limitReached) {
                            for (int i7 = i6 - 1; i7 >= childLayoutPosition; i7--) {
                                if (i7 != this.startSelectionFrom && this.multiSelectionListener.canSelect(i7)) {
                                    this.multiSelectionListener.onSelectionChanged(fMin2, fMin, i7, true);
                                }
                            }
                        }
                    }
                }
                if (this.multiSelectionListener.limitReached) {
                    return;
                }
                this.currentSelectedPosition = childLayoutPosition;
                return;
            }
        }
    }

    public final void clipChild(Canvas canvas, View view) {
        boolean z;
        boolean z2;
        if (view == null || !((Boolean) this.sectionsItemDecoration.isSectionItem.run(view)).booleanValue()) {
            return;
        }
        int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            z2 = false;
            z = false;
        } else {
            View viewFindViewByPosition = findViewByPosition(childAdapterPosition - 1);
            View viewFindViewByPosition2 = findViewByPosition(childAdapterPosition + 1);
            z = viewFindViewByPosition != null && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(viewFindViewByPosition)).booleanValue();
            z2 = viewFindViewByPosition2 != null && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(viewFindViewByPosition2)).booleanValue();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        float x = view.getX();
        float f = -this.sectionRadius;
        int i = R.id.dragging;
        rectF.set(x, Math.max(f, view.getTag(i) != null ? view.getTop() : view.getY()), view.getX() + view.getWidth(), Math.min(getHeight() - (-this.sectionRadius), bottom(view)));
        if (z && z2) {
            z = (view.getTag(i) != null ? (float) view.getTop() : view.getY()) >= rectF.top;
            boolean z3 = bottom(view) <= rectF.bottom;
            if (z && z3) {
                return;
            } else {
                z2 = z3;
            }
        }
        Path path = this.clipPath;
        if (!z && !z2) {
            path.rewind();
            float f2 = this.sectionRadius;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
            canvas.clipPath(path);
            return;
        }
        if (!z) {
            path.rewind();
            path.addRoundRect(rectF, this.sectionRadiusTop, Path.Direction.CW);
            canvas.clipPath(path);
        } else {
            if (z2) {
                return;
            }
            path.rewind();
            path.addRoundRect(rectF, this.sectionRadiusBottom, Path.Direction.CW);
            canvas.clipPath(path);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View view;
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = this.itemsEnterAnimator;
        if (recyclerItemsEnterAnimator != null && (recyclerItemsEnterAnimator.invalidateAlpha || recyclerItemsEnterAnimator.alwaysCheckItemsAlpha)) {
            int i = 0;
            while (true) {
                RecyclerListView recyclerListView = recyclerItemsEnterAnimator.listView;
                if (i >= recyclerListView.getChildCount()) {
                    break;
                }
                View childAt = recyclerListView.getChildAt(i);
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0 && !recyclerItemsEnterAnimator.ignoreView.contains(childAt)) {
                    Float f = (Float) recyclerItemsEnterAnimator.listAlphaItems.get(childAdapterPosition, null);
                    if (f == null) {
                        childAt.setAlpha(1.0f);
                    } else {
                        childAt.setAlpha(f.floatValue());
                    }
                }
                i++;
            }
            recyclerItemsEnterAnimator.invalidateAlpha = false;
        }
        if (this.drawSelection && this.drawSelectorBehind) {
            drawSelectors2(canvas);
        }
        super.dispatchDraw(canvas);
        if (this.drawSelection && !this.drawSelectorBehind) {
            drawSelectors2(canvas);
        }
        ChatActivity.AnonymousClass60 anonymousClass60 = this.overlayContainer;
        if (anonymousClass60 != null) {
            anonymousClass60.draw(canvas);
        }
        if (this.skipDrawSection) {
            return;
        }
        int i2 = this.sectionsType;
        if (i2 == 1) {
            if (this.sectionsAdapter == null || this.headers.isEmpty()) {
                return;
            }
            for (int i3 = 0; i3 < this.headers.size(); i3++) {
                View view2 = (View) this.headers.get(i3);
                int iSave = canvas.save();
                canvas.translate(LocaleController.isRTL ? getWidth() - view2.getWidth() : 0.0f, ((Integer) view2.getTag()).intValue());
                canvas.clipRect(0, 0, getWidth(), view2.getMeasuredHeight());
                view2.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            return;
        }
        if (i2 != 2 || this.sectionsAdapter == null || (view = this.pinnedHeader) == null || view.getAlpha() == 0.0f) {
            return;
        }
        int iSave2 = canvas.save();
        canvas.translate(LocaleController.isRTL ? getWidth() - this.pinnedHeader.getWidth() : 0.0f, ((Integer) this.pinnedHeader.getTag()).intValue());
        Drawable drawable = this.pinnedHeaderShadowDrawable;
        if (drawable != null) {
            drawable.setBounds(0, this.pinnedHeader.getMeasuredHeight(), getWidth(), this.pinnedHeaderShadowDrawable.getIntrinsicHeight() + this.pinnedHeader.getMeasuredHeight());
            this.pinnedHeaderShadowDrawable.setAlpha((int) (this.pinnedHeaderShadowAlpha * 255.0f));
            this.pinnedHeaderShadowDrawable.draw(canvas);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMin = Math.min(20L, jElapsedRealtime - this.lastAlphaAnimationTime);
            this.lastAlphaAnimationTime = jElapsedRealtime;
            float f2 = this.pinnedHeaderShadowAlpha;
            float f3 = this.pinnedHeaderShadowTargetAlpha;
            if (f2 < f3) {
                float f4 = (jMin / 180.0f) + f2;
                this.pinnedHeaderShadowAlpha = f4;
                if (f4 > f3) {
                    this.pinnedHeaderShadowAlpha = f3;
                }
                invalidate();
            } else if (f2 > f3) {
                float f5 = f2 - (jMin / 180.0f);
                this.pinnedHeaderShadowAlpha = f5;
                if (f5 < f3) {
                    this.pinnedHeaderShadowAlpha = f3;
                }
                invalidate();
            }
        }
        canvas.clipRect(0, 0, getWidth(), this.pinnedHeader.getMeasuredHeight());
        this.pinnedHeader.draw(canvas);
        canvas.restoreToCount(iSave2);
    }

    @Override
    public final boolean dispatchNestedPreScroll(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        if (!this.longPressCalled) {
            return super.dispatchNestedPreScroll(i, i2, i3, iArr, iArr2);
        }
        OnItemLongClickListenerExtended onItemLongClickListenerExtended = this.onItemLongClickListenerExtended;
        if (onItemLongClickListenerExtended != null) {
            onItemLongClickListenerExtended.onMove(i2);
        }
        iArr[0] = i;
        iArr[1] = i2;
        return true;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.activeTouches == 0 && this.adaptiveOverScroll) {
                setOverScrollMode(0);
            }
            this.activeTouches++;
        } else if (action == 1 || action == 3) {
            int i = this.activeTouches - 1;
            this.activeTouches = i;
            if (i == 0 && this.adaptiveOverScroll) {
                setOverScrollMode(2);
            }
        }
        FastScroll fastScroll = getFastScroll();
        if ((fastScroll == null || !fastScroll.isVisible || !fastScroll.isMoving || motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && (this.sectionsAdapter == null || (view = this.pinnedHeader) == null || view.getAlpha() == 0.0f || !this.pinnedHeader.dispatchTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (!hasSections() || this.ignoreClipChild) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        clipChild(canvas, view);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public final void drawSectionBackground(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        if (i2 < i || i < 0 || i2 < 0) {
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt != null) {
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                int top = childAt.getTop();
                if (childAdapterPosition >= i && childAdapterPosition <= i2) {
                    iMin = Math.min(top, iMin);
                    iMax = Math.max((int) ((childAt.getAlpha() * childAt.getHeight()) + top), iMax);
                }
            }
        }
        if (iMin < iMax) {
            if (this.backgroundPaint == null) {
                this.backgroundPaint = new Paint(1);
            }
            this.backgroundPaint.setColor(i3);
            canvas.drawRect(0.0f, iMin - i4, getWidth(), iMax + i5, this.backgroundPaint);
        }
    }

    public final void drawSectionsBackgrounds(Canvas canvas) {
        float f;
        float[] fArr;
        float fLerp;
        float fLerp2;
        int i;
        View childAt;
        int i2 = 1;
        if (this.drawSectionBackground == null) {
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = this.mItemAnimator;
        if (itemAnimator == null || !itemAnimator.isRunning()) {
            f = 1.0f;
            int i3 = -1;
            View view = null;
            int i4 = -1;
            View view2 = null;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt2 = getChildAt(i5);
                if (childAt2 == this.emptyView || childAt2.getVisibility() != 0 || childAt2.getAlpha() <= 0.0f || !((Boolean) this.sectionsItemDecoration.isSectionItem.run(childAt2)).booleanValue() || isInsideForcedSection(RecyclerView.getChildAdapterPosition(childAt2))) {
                    drawSectionBackground(canvas, view, view2, hasAbove(i3, view), hasBelow(i4, view2));
                    i3 = -1;
                    view = null;
                    i4 = -1;
                    view2 = null;
                } else {
                    if (view != null && Math.abs(view2.getAlpha() - childAt2.getAlpha()) > 0.1f) {
                        drawSectionBackground(canvas, view, view2, hasAbove(i3, view), hasBelow(i4, view2));
                        i3 = -1;
                        view = null;
                    }
                    if (view == null) {
                        i3 = i5;
                        view = childAt2;
                    }
                    i4 = i5;
                    view2 = childAt2;
                }
            }
            drawSectionBackground(canvas, view, view2, hasAbove(i3, view), hasBelow(i4, view2));
        } else {
            if (this.sections == null) {
                this.sections = new ArrayList();
            }
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt3 = getChildAt(i6);
                if (childAt3 != this.emptyView && childAt3.getVisibility() == 0 && childAt3.getAlpha() > 0.0f && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(childAt3)).booleanValue()) {
                    float top = childAt3.getTag(R.id.dragging) != null ? childAt3.getTop() : childAt3.getY();
                    float fBottom = bottom(childAt3);
                    RecyclerView.ViewHolder childViewHolder = getChildViewHolder(childAt3);
                    if (!childViewHolder.isRemoved() || childAt3.getAlpha() >= 1.0f) {
                        if (!isInsideForcedSection(childViewHolder.getAdapterPosition())) {
                            this.sections.add(new SectionsDrawer.Section(top, fBottom, childAt3.getAlpha()));
                        }
                    } else if (!childViewHolder.isRemoved() || (i = childViewHolder.mOldCompoundPosition) < 0) {
                        this.sections.add(new SectionsDrawer.Section(top, fBottom, childAt3.getAlpha()));
                    } else {
                        int iCeil = ((int) Math.ceil(((double) i) / 1000.0d)) + 1;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= getChildCount()) {
                                childAt = null;
                                break;
                            }
                            childAt = getChildAt(i7);
                            if (childAt != null && childAt != childAt3 && RecyclerView.getChildAdapterPosition(childAt) == iCeil) {
                                break;
                            } else {
                                i7++;
                            }
                        }
                        if (childAt == null || fBottom <= childAt.getY() || !((Boolean) this.sectionsItemDecoration.isSectionItem.run(childAt)).booleanValue() || getChildViewHolder(childAt).isRemoved()) {
                            this.sections.add(new SectionsDrawer.Section(top, fBottom, childAt3.getAlpha()));
                        } else {
                            top -= 1.0f;
                            fBottom = childAt.getY();
                            if (fBottom >= top) {
                                this.sections.add(new SectionsDrawer.Section(top, fBottom, childAt3.getAlpha()));
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = this.sections;
            float f2 = this.sectionRadius;
            ArrayList arrayList2 = SectionsDrawer.groups;
            if (arrayList == null || arrayList.isEmpty()) {
                f = 1.0f;
            } else {
                Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(20));
                ArrayList arrayList3 = SectionsDrawer.groups;
                arrayList3.clear();
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    float fMax = ((SectionsDrawer.Section) arrayList.get(i8)).to;
                    int i9 = i8 + 1;
                    while (i9 < arrayList.size() && ((SectionsDrawer.Section) arrayList.get(i9)).from <= fMax + 1.5f) {
                        fMax = Math.max(fMax, ((SectionsDrawer.Section) arrayList.get(i9)).to);
                        i9 += i2;
                    }
                    float fMin = Float.MAX_VALUE;
                    fMin = Float.MAX_VALUE;
                    float fMax2 = Float.MIN_VALUE;
                    for (int i10 = i8; i10 < i9; i10++) {
                        SectionsDrawer.Section section = (SectionsDrawer.Section) arrayList.get(i10);
                        if (section.alpha >= 0.99f) {
                            fMin = Math.min(fMin, section.from);
                            fMax2 = Math.max(fMax2, section.to);
                        }
                    }
                    boolean z = fMin != Float.MAX_VALUE;
                    float fMax3 = Float.MIN_VALUE;
                    float fMax4 = 0.0f;
                    for (int i11 = i8; i11 < i9; i11++) {
                        SectionsDrawer.Section section2 = (SectionsDrawer.Section) arrayList.get(i11);
                        fMin = Math.min(fMin, section2.from);
                        fMax3 = Math.max(fMax3, section2.to);
                        fMax4 = Math.max(fMax4, section2.alpha);
                    }
                    if (fMax4 >= 0.001f) {
                        if (z) {
                            float f3 = 0.0f;
                            SectionsDrawer.Section section3 = null;
                            for (int i12 = i8; i12 < i9; i12++) {
                                SectionsDrawer.Section section4 = (SectionsDrawer.Section) arrayList.get(i12);
                                float f4 = section4.alpha;
                                if (f4 < 0.99f) {
                                    float f5 = section4.from;
                                    if (f5 < fMin) {
                                        float f6 = (fMin - f5) * f4;
                                        if (f6 > f3) {
                                            section3 = section4;
                                            f3 = f6;
                                        }
                                    }
                                }
                            }
                            SectionsDrawer.Section section5 = null;
                            float f7 = 0.0f;
                            while (i8 < i9) {
                                SectionsDrawer.Section section6 = (SectionsDrawer.Section) arrayList.get(i8);
                                float f8 = section6.alpha;
                                if (f8 < 0.99f) {
                                    float f9 = section6.to;
                                    if (f9 > fMax2) {
                                        float f10 = (f9 - fMax2) * f8;
                                        if (f10 > f7) {
                                            section5 = section6;
                                            f7 = f10;
                                        }
                                    }
                                }
                                i8++;
                            }
                            if (section3 != null) {
                                float f11 = section3.alpha;
                                if (f11 > 0.001f) {
                                    float f12 = section3.from;
                                    float fLerp3 = AndroidUtilities.lerp(fMin, f12, f11);
                                    fLerp = AndroidUtilities.lerp(f2, f11 * f2, (fMin - fLerp3) / ((fMin - f12) + 0.001f));
                                    fMin = fLerp3;
                                } else {
                                    fLerp = f2;
                                }
                            } else {
                                fLerp = f2;
                            }
                            if (section5 != null) {
                                float f13 = section5.alpha;
                                if (f13 > 0.001f) {
                                    float f14 = section5.to;
                                    float fLerp4 = AndroidUtilities.lerp(fMax2, f14, f13);
                                    fLerp2 = AndroidUtilities.lerp(f2, f13 * f2, (fLerp4 - fMax2) / ((f14 - fMax2) + 0.001f));
                                    fMax2 = fLerp4;
                                } else {
                                    fLerp2 = f2;
                                }
                            } else {
                                fLerp2 = f2;
                            }
                            fMax4 = 1.0f;
                        } else {
                            fLerp = f2;
                            fLerp2 = fLerp;
                            fMax2 = fMax3;
                        }
                        if (fMax2 <= fMin) {
                            fArr = null;
                        } else {
                            fArr = new float[]{fMin, fMax2, fLerp, fLerp2, fMax4};
                        }
                    } else {
                        fArr = null;
                    }
                    if (fArr != null) {
                        arrayList3.add(fArr);
                    }
                    i8 = i9;
                    i2 = 1;
                }
                f = 1.0f;
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    float[] fArr2 = (float[]) arrayList3.get(i13);
                    float f15 = fArr2[0];
                    float f16 = fArr2[1];
                    float fMin2 = fArr2[2];
                    float fMin3 = fArr2[3];
                    float f17 = fArr2[4];
                    if (i13 > 0) {
                        float f18 = f15 - ((float[]) arrayList3.get(i13 - 1))[1];
                        float f19 = f2 * 0.2f;
                        if (f18 < f19) {
                            fMin2 = Math.min(fMin2, (f18 / f19) * f2);
                        }
                    }
                    if (i13 < arrayList3.size() - 1) {
                        float f20 = ((float[]) arrayList3.get(i13 + 1))[0] - f16;
                        float f21 = 0.2f * f2;
                        if (f20 < f21) {
                            fMin3 = Math.min(fMin3, (f20 / f21) * f2);
                        }
                    }
                    Float fValueOf = Float.valueOf(fMin2);
                    Float fValueOf2 = Float.valueOf(fMin3);
                    Float fValueOf3 = Float.valueOf(f17);
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft() + this.sectionsItemDecoration.padding, f15, (getWidth() - this.sectionsItemDecoration.padding) - getPaddingRight(), f16);
                    this.drawSectionBackground.mo1067run(canvas, rectF, fValueOf, fValueOf2, fValueOf3);
                }
            }
            this.sections.clear();
        }
        if (this.forcedSections != null) {
            for (int i14 = 0; i14 < this.forcedSections.size(); i14++) {
                long jLongValue = ((Long) this.forcedSections.get(i14)).longValue();
                int iUnpackA = AndroidUtilities.unpackA(jLongValue);
                int iUnpackB = AndroidUtilities.unpackB(jLongValue);
                float height = getHeight();
                float f22 = this.sectionRadius;
                float fMin4 = height + f22;
                float fMax5 = -f22;
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt4 = getChildAt(i15);
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt4);
                    if (childAdapterPosition >= iUnpackA && childAdapterPosition <= iUnpackB) {
                        fMin4 = Math.min(fMin4, childAt4.getTag(R.id.dragging) != null ? childAt4.getTop() : childAt4.getY());
                        fMax5 = Math.max(fMax5, bottom(childAt4));
                    }
                }
                if (fMin4 < fMax5) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(getPaddingLeft() + this.sectionsItemDecoration.padding, fMin4, (getWidth() - getPaddingRight()) - this.sectionsItemDecoration.padding, fMax5);
                    this.drawSectionBackground.mo1067run(canvas, rectF2, Float.valueOf(this.sectionRadius), Float.valueOf(this.sectionRadius), Float.valueOf(f));
                }
            }
        }
    }

    public final void drawSelectors2(Canvas canvas) {
        BaseCell.RippleDrawableSafe rippleDrawableSafe;
        Consumer consumer;
        View view;
        Rect rect = this.selectorRect;
        if (rect.isEmpty() || (rippleDrawableSafe = this.selectorDrawable) == null) {
            return;
        }
        int i = this.translateSelector;
        if ((i == -2 || i == this.selectorPosition) && this.selectorView != null) {
            if (getAdapter() instanceof SelectionAdapter) {
                ((SelectionAdapter) getAdapter()).getClass();
            }
            this.selectorDrawable.setBounds(this.selectorView.getLeft(), this.selectorView.getTop(), this.selectorView.getRight(), this.selectorView.getBottom());
        } else {
            rippleDrawableSafe.setBounds(rect);
        }
        canvas.save();
        int i2 = this.translateSelector;
        if ((i2 == -2 || i2 == this.selectorPosition) && (consumer = this.selectorTransformer) != null) {
            consumer.accept(canvas);
        }
        int i3 = this.translateSelector;
        if ((i3 == -2 || i3 == this.selectorPosition) && (view = this.selectorView) != null) {
            canvas.translate(view.getX() - rect.left, this.selectorView.getY() - rect.top);
            this.selectorDrawable.setAlpha((int) (this.selectorView.getAlpha() * 255.0f));
        }
        if (hasSections()) {
            canvas.save();
            clipChild(canvas, this.selectorView);
            this.selectorDrawable.draw(canvas);
            canvas.restore();
        } else {
            this.selectorDrawable.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        updateSelectorState();
    }

    public boolean emptyViewIsVisible() {
        return (getAdapter() == null || this.fastScrollAnimationRunning || getAdapter().getItemCount() != 0) ? false : true;
    }

    public final void ensurePinnedHeaderLayout(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (view.isLayoutRequested() || z) {
            int i = this.sectionsType;
            if (i == 1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (i == 2) {
                try {
                    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override
    public final View findChildViewUnder(float f, float f2) {
        int childCount = getChildCount();
        int i = 0;
        while (i < 2) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                if ((!(childAt instanceof ChatMessageCell) && !(childAt instanceof ChatActionCell)) || childAt.getVisibility() != 4) {
                    float translationX = i == 0 ? childAt.getTranslationX() : 0.0f;
                    float translationY = i == 0 ? childAt.getTranslationY() : 0.0f;
                    if (f >= childAt.getLeft() + translationX && f <= childAt.getRight() + translationX && f2 >= childAt.getTop() + translationY && f2 <= childAt.getBottom() + translationY) {
                        return childAt;
                    }
                }
            }
            i++;
        }
        return null;
    }

    public final View findViewByPosition(int i) {
        if (i == -1) {
            return null;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && childAdapterPosition == i) {
                return childAt;
            }
        }
        return null;
    }

    public final Drawable getClipBackground(final View view, boolean z) {
        boolean z2;
        boolean z3;
        if (view.getParent() != this || !hasSections() || !((Boolean) this.sectionsItemDecoration.isSectionItem.run(view)).booleanValue()) {
            return null;
        }
        int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            z3 = false;
            z2 = false;
        } else {
            View viewFindViewByPosition = findViewByPosition(childAdapterPosition - 1);
            View viewFindViewByPosition2 = findViewByPosition(childAdapterPosition + 1);
            z2 = viewFindViewByPosition != null && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(viewFindViewByPosition)).booleanValue();
            z3 = viewFindViewByPosition2 != null && ((Boolean) this.sectionsItemDecoration.isSectionItem.run(viewFindViewByPosition2)).booleanValue();
        }
        final RectF rectF = new RectF();
        float x = view.getX();
        int i = R.id.dragging;
        rectF.set(x, Math.max(0.0f, view.getTag(i) != null ? view.getTop() : view.getY()), view.getX() + view.getWidth(), Math.min(getHeight(), bottom(view)));
        if (z2 && z3 && !z) {
            z2 = (view.getTag(i) != null ? (float) view.getTop() : view.getY()) >= rectF.top;
            boolean z4 = bottom(view) <= rectF.bottom;
            if (z2 && z4) {
                return Theme.createRoundRectDrawable(0, Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider));
            }
            z3 = z4;
        }
        final Path path = new Path();
        if ((!z2 && !z3) || z) {
            path.rewind();
            float f = this.sectionRadius;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        } else if (!z2) {
            path.rewind();
            path.addRoundRect(rectF, this.sectionRadiusTop, Path.Direction.CW);
        } else if (!z3) {
            path.rewind();
            path.addRoundRect(rectF, this.sectionRadiusBottom, Path.Direction.CW);
        }
        return new Drawable() {
            public final Paint paint = new Paint(1);

            @Override
            public final void draw(Canvas canvas) {
                canvas.save();
                View view2 = view;
                canvas.translate(-view2.getX(), -view2.getY());
                canvas.clipPath(path);
                Paint paint = this.paint;
                paint.setColor(ColorUtils.setAlphaComponent(Theme.getColor(Theme.key_windowBackgroundWhite, RecyclerListView.this.resourcesProvider), paint.getAlpha()));
                canvas.drawRect(rectF, paint);
                canvas.restore();
            }

            @Override
            public final int getOpacity() {
                return -2;
            }

            @Override
            public final void setAlpha(int i2) {
                this.paint.setAlpha(i2);
            }

            @Override
            public final void setColorFilter(ColorFilter colorFilter) {
            }
        };
    }

    public View getEmptyView() {
        return this.emptyView;
    }

    public FastScroll getFastScroll() {
        return this.fastScroll;
    }

    public ArrayList<View> getHeaders() {
        return this.headers;
    }

    public ArrayList<View> getHeadersCache() {
        return this.headersCache;
    }

    public OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public RecyclerView.OnScrollListener getOnScrollListener() {
        return this.onScrollListener;
    }

    public View getPinnedHeader() {
        return this.pinnedHeader;
    }

    public View getPressedChildView() {
        return this.currentChildView;
    }

    public Integer getSelectorColor(int i) {
        GenericProvider genericProvider = this.getSelectorColor;
        if (genericProvider != null) {
            return (Integer) genericProvider.provide(Integer.valueOf(i));
        }
        return null;
    }

    public Drawable getSelectorDrawable() {
        return this.selectorDrawable;
    }

    public Rect getSelectorRect() {
        return this.selectorRect;
    }

    public ViewParent getTouchParent() {
        return null;
    }

    public final boolean hasAbove(int i, View view) {
        int childAdapterPosition;
        if (view == null || i > 0 || getAdapter() == null || this.isViewTypeSection == null || (childAdapterPosition = RecyclerView.getChildAdapterPosition(view)) == -1 || childAdapterPosition == 0) {
            return false;
        }
        return ((Boolean) this.isViewTypeSection.run(Integer.valueOf(getAdapter().getItemViewType(childAdapterPosition - 1)))).booleanValue();
    }

    public final boolean hasActiveEdgeEffects() {
        for (EdgeEffectTrackerFactory.TrackingEdgeEffect trackingEdgeEffect : this.edgeEffectTrackerFactory.edgeEffects) {
            if (trackingEdgeEffect != null && !trackingEdgeEffect.isFinished() && (Build.VERSION.SDK_INT < 31 || trackingEdgeEffect.getDistance() != 0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasBelow(int i, View view) {
        int childAdapterPosition;
        if (view == null || i < getChildCount() - 1 || getAdapter() == null || this.isViewTypeSection == null || (childAdapterPosition = RecyclerView.getChildAdapterPosition(view)) == -1 || childAdapterPosition == getAdapter().getItemCount() - 1) {
            return false;
        }
        return ((Boolean) this.isViewTypeSection.run(Integer.valueOf(getAdapter().getItemViewType(childAdapterPosition + 1)))).booleanValue();
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean hasSections() {
        return this.sectionsItemDecoration != null;
    }

    public final void hide() {
        if (this.isHidden) {
            return;
        }
        this.isHidden = true;
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        View view = this.emptyView;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        this.emptyView.setVisibility(8);
    }

    public final void hideSelector(boolean z) {
        View view = this.currentChildView;
        if (view != null) {
            onChildPressed(view, 0.0f, 0.0f, false);
            this.currentChildView = null;
            if (z) {
                removeSelection(null, view);
            }
        }
        if (z) {
            return;
        }
        this.selectorDrawable.setState(StateSet.NOTHING);
        this.selectorRect.setEmpty();
    }

    public final void highlightRowInternal(IntReturnCallback intReturnCallback, int i, boolean z) {
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.removeHighlighSelectionRunnable;
        if (seekBarView$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
            this.removeHighlighSelectionRunnable = null;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(intReturnCallback.run());
        if (viewHolderFindViewHolderForAdapterPosition == null) {
            if (z) {
                this.pendingHighlightPosition = intReturnCallback;
                return;
            }
            return;
        }
        int layoutPosition = viewHolderFindViewHolderForAdapterPosition.getLayoutPosition();
        this.highlightPosition = layoutPosition;
        View view = viewHolderFindViewHolderForAdapterPosition.itemView;
        positionSelector$1(layoutPosition, view);
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            Drawable current = rippleDrawableSafe.getCurrent();
            if (current instanceof TransitionDrawable) {
                if (this.onItemLongClickListener == null && this.onItemClickListenerExtended == null) {
                    ((TransitionDrawable) current).resetTransition();
                } else {
                    ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                }
            }
            this.selectorDrawable.setHotspot(view.getMeasuredWidth() / 2, view.getMeasuredHeight() / 2);
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe2 = this.selectorDrawable;
        if (rippleDrawableSafe2 != null && rippleDrawableSafe2.isStateful() && this.selectorDrawable.setState(getDrawableStateForSelector())) {
            invalidateDrawable(this.selectorDrawable);
        }
        if (i > 0) {
            this.pendingHighlightPosition = null;
            SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda2 = new SeekBarView$$ExternalSyntheticLambda1(this, 5);
            this.removeHighlighSelectionRunnable = seekBarView$$ExternalSyntheticLambda2;
            AndroidUtilities.runOnUIThread(seekBarView$$ExternalSyntheticLambda2, i);
        }
    }

    public void invalidateViews() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Theme.Colorable) {
                ((Theme.Colorable) childAt).updateColors$1();
            }
            childAt.invalidate();
        }
    }

    public final boolean isInsideForcedSection(int i) {
        if (this.forcedSections != null && i >= 0) {
            for (int i2 = 0; i2 < this.forcedSections.size(); i2++) {
                long jLongValue = ((Long) this.forcedSections.get(i2)).longValue();
                int iUnpackA = AndroidUtilities.unpackA(jLongValue);
                int iUnpackB = AndroidUtilities.unpackB(jLongValue);
                if (i >= iUnpackA && i <= iUnpackB) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.jumpToCurrentState();
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll == null || fastScroll.getParent() == getParent()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.fastScroll.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.fastScroll);
        }
        ((ViewGroup) getParent()).addView(this.fastScroll);
    }

    @Override
    public final void onChildAttachedToWindow(View view) {
        if (!(getAdapter() instanceof SelectionAdapter)) {
            view.setEnabled(false);
            view.setAccessibilityDelegate(null);
            return;
        }
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder = findContainingViewHolder(view);
        if (viewHolderFindContainingViewHolder != null) {
            view.setEnabled(((SelectionAdapter) getAdapter()).isEnabled(viewHolderFindContainingViewHolder));
            if (this.accessibilityEnabled) {
                view.setAccessibilityDelegate(this.accessibilityDelegate);
            }
        }
    }

    public void onChildPressed(View view, float f, float f2, boolean z) {
        if (this.disableHighlightState || view == null) {
            return;
        }
        view.setPressed(z);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.selectorPosition = -1;
        this.selectorView = null;
        this.selectorRect.setEmpty();
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = this.itemsEnterAnimator;
        if (recyclerItemsEnterAnimator != null) {
            recyclerItemsEnterAnimator.cancel();
        }
        if (this.stoppedAllHeavyOperations) {
            this.stoppedAllHeavyOperations = false;
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!isEnabled()) {
            return false;
        }
        if (this.disallowInterceptTouchEvents && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(true);
            ViewParent touchParent = getTouchParent();
            if (touchParent != null) {
                touchParent.requestDisallowInterceptTouchEvent(true);
            }
        }
        if (this.onInterceptTouchListener != null) {
            int i = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
        } else if (!super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null) {
            this.selfOnLayout = true;
            int paddingTop = i2 + (fastScroll.usePadding ? getPaddingTop() : fastScroll.topOffset);
            FastScroll fastScroll2 = this.fastScroll;
            if (fastScroll2.isRtl) {
                fastScroll2.layout(0, paddingTop, fastScroll2.getMeasuredWidth(), this.fastScroll.getMeasuredHeight() + paddingTop);
            } else {
                int measuredWidth = getMeasuredWidth() - this.fastScroll.getMeasuredWidth();
                FastScroll fastScroll3 = this.fastScroll;
                fastScroll3.layout(measuredWidth, paddingTop, fastScroll3.getMeasuredWidth() + measuredWidth, this.fastScroll.getMeasuredHeight() + paddingTop);
            }
            this.selfOnLayout = false;
        }
        checkSection(false);
        IntReturnCallback intReturnCallback = this.pendingHighlightPosition;
        if (intReturnCallback != null) {
            highlightRowInternal(intReturnCallback, 700, false);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null && fastScroll.getLayoutParams() != null) {
            FastScroll fastScroll2 = this.fastScroll;
            int measuredHeight = (getMeasuredHeight() - (fastScroll2.usePadding ? getPaddingTop() : fastScroll2.topOffset)) - getPaddingBottom();
            this.fastScroll.getLayoutParams().height = measuredHeight;
            this.fastScroll.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(132.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        View view;
        super.onSizeChanged(i, i2, i3, i4);
        ChatActivity.AnonymousClass60 anonymousClass60 = this.overlayContainer;
        if (anonymousClass60 != null) {
            anonymousClass60.requestLayout();
        }
        int i5 = this.sectionsType;
        if (i5 != 1) {
            if (i5 != 2 || this.sectionsAdapter == null || (view = this.pinnedHeader) == null) {
                return;
            }
            ensurePinnedHeaderLayout(view, true);
            return;
        }
        if (this.sectionsAdapter == null || this.headers.isEmpty()) {
            return;
        }
        for (int i6 = 0; i6 < this.headers.size(); i6++) {
            ensurePinnedHeaderLayout((View) this.headers.get(i6), true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null && fastScroll.pressed) {
            return false;
        }
        boolean z = this.multiSelectionGesture;
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.scroller;
        if (!z || motionEvent.getAction() == 0 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.lastX = Float.MAX_VALUE;
            this.lastY = Float.MAX_VALUE;
            this.multiSelectionGesture = false;
            this.multiSelectionGestureStarted = false;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                ViewParent touchParent = getTouchParent();
                if (touchParent != null) {
                    touchParent.requestDisallowInterceptTouchEvent(false);
                }
            }
            this.multiselectScrollRunning = false;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            return super.onTouchEvent(motionEvent);
        }
        if (this.lastX == Float.MAX_VALUE && this.lastY == Float.MAX_VALUE) {
            this.lastX = motionEvent.getX();
            this.lastY = motionEvent.getY();
        }
        if (!this.multiSelectionGestureStarted && Math.abs(motionEvent.getY() - this.lastY) > this.touchSlop) {
            this.multiSelectionGestureStarted = true;
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
                ViewParent touchParent2 = getTouchParent();
                if (touchParent2 != null) {
                    touchParent2.requestDisallowInterceptTouchEvent(true);
                }
            }
        }
        if (this.multiSelectionGestureStarted) {
            chekMultiselect(motionEvent.getX(), motionEvent.getY());
            ChatActivity.AnonymousClass11 anonymousClass11 = this.multiSelectionListener;
            int[] iArr = this.listPaddings;
            ChatActivity chatActivity = ChatActivity.this;
            iArr[0] = (int) chatActivity.chatListViewPaddingTop;
            iArr[1] = chatActivity.blurredViewBottomOffset;
            if (motionEvent.getY() > (getMeasuredHeight() - AndroidUtilities.dp(56.0f)) - this.listPaddings[1] && (this.currentSelectedPosition >= this.startSelectionFrom || !this.multiSelectionListener.limitReached)) {
                this.multiselectScrollToTop = false;
                if (!this.multiselectScrollRunning) {
                    this.multiselectScrollRunning = true;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                    AndroidUtilities.runOnUIThread(anonymousClass1);
                    return true;
                }
            } else if (motionEvent.getY() >= AndroidUtilities.dp(56.0f) + this.listPaddings[0] || (this.currentSelectedPosition > this.startSelectionFrom && this.multiSelectionListener.limitReached)) {
                this.multiselectScrollRunning = false;
                AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            } else {
                this.multiselectScrollToTop = true;
                if (!this.multiselectScrollRunning) {
                    this.multiselectScrollRunning = true;
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                    AndroidUtilities.runOnUIThread(anonymousClass1);
                    return true;
                }
            }
        }
        return true;
    }

    public final void positionSelector$1(int i, View view) {
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.removeHighlighSelectionRunnable;
        if (seekBarView$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
            this.removeHighlighSelectionRunnable = null;
            this.pendingHighlightPosition = null;
        }
        if (this.selectorDrawable == null) {
            return;
        }
        boolean z = i != this.selectorPosition;
        if (getAdapter() instanceof SelectionAdapter) {
            ((SelectionAdapter) getAdapter()).getClass();
        }
        if (i != -1) {
            this.selectorPosition = i;
        }
        this.selectorView = view;
        if (this.selectorType == 8) {
            Theme.setMaskDrawableRad(this.selectorDrawable, this.selectorRadius, 0);
        } else if (this.topBottomSelectorRadius > 0 && getAdapter() != null) {
            Theme.setMaskDrawableRad(this.selectorDrawable, i == 0 ? this.topBottomSelectorRadius : 0, i == getAdapter().getItemCount() + (-2) ? this.topBottomSelectorRadius : 0);
        }
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        Rect rect = this.selectorRect;
        rect.set(left, top, right, bottom);
        boolean zIsEnabled = view.isEnabled();
        if (this.isChildViewEnabled != zIsEnabled) {
            this.isChildViewEnabled = zIsEnabled;
        }
        if (z) {
            this.selectorDrawable.setVisible(false, false);
            this.selectorDrawable.setState(StateSet.NOTHING);
        }
        setListSelectorColor(getSelectorColor(i));
        this.selectorDrawable.setBounds(rect);
        if (z && getVisibility() == 0) {
            this.selectorDrawable.setVisible(true, false);
        }
    }

    public final void removeHighlightRow() {
        int i;
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.removeHighlighSelectionRunnable;
        if (seekBarView$$ExternalSyntheticLambda1 != null) {
            AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
            this.removeHighlighSelectionRunnable.run();
            this.removeHighlighSelectionRunnable = null;
            this.selectorView = null;
            return;
        }
        this.removeHighlighSelectionRunnable = null;
        this.pendingHighlightPosition = null;
        View view = this.selectorView;
        if (view != null && (i = this.highlightPosition) != -1) {
            positionSelector$1(i, view);
            BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
            if (rippleDrawableSafe != null) {
                rippleDrawableSafe.setState(new int[0]);
                invalidateDrawable(this.selectorDrawable);
            }
            this.selectorView = null;
            this.highlightPosition = -1;
            return;
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe2 = this.selectorDrawable;
        if (rippleDrawableSafe2 != null) {
            Drawable current = rippleDrawableSafe2.getCurrent();
            if (current instanceof TransitionDrawable) {
                ((TransitionDrawable) current).resetTransition();
            }
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe3 = this.selectorDrawable;
        if (rippleDrawableSafe3 != null && rippleDrawableSafe3.isStateful() && this.selectorDrawable.setState(StateSet.NOTHING)) {
            invalidateDrawable(this.selectorDrawable);
        }
    }

    public final void removeSelection(MotionEvent motionEvent, View view) {
        if (view != null) {
            Rect rect = this.selectorRect;
            if (rect.isEmpty()) {
                return;
            }
            if (view.isEnabled()) {
                positionSelector$1(this.currentChildPosition, view);
                BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
                if (rippleDrawableSafe != null) {
                    Drawable current = rippleDrawableSafe.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                    if (motionEvent != null) {
                        this.selectorDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                }
            } else {
                rect.setEmpty();
            }
            updateSelectorState();
        }
    }

    @Override
    public void requestLayout() {
        if (this.fastScrollAnimationRunning || this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setAccessibilityEnabled(boolean z) {
        this.accessibilityEnabled = z;
    }

    @Override
    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = getAdapter();
        PaddedListAdapter.AnonymousClass2 anonymousClass2 = this.observer;
        if (adapter2 != null) {
            adapter2.mObservable.unregisterObserver(anonymousClass2);
        }
        ArrayList arrayList = this.headers;
        if (arrayList != null) {
            arrayList.clear();
            this.headersCache.clear();
        }
        this.currentFirst = -1;
        this.selectorPosition = -1;
        this.selectorView = null;
        this.selectorRect.setEmpty();
        this.pinnedHeader = null;
        if (adapter instanceof SectionsAdapter) {
            this.sectionsAdapter = (SectionsAdapter) adapter;
        } else {
            this.sectionsAdapter = null;
        }
        super.setAdapter(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(anonymousClass2);
        }
        checkIfEmpty(false);
    }

    public void setAllowItemsInteractionDuringAnimation(boolean z) {
        this.allowItemsInteractionDuringAnimation = z;
    }

    public void setAllowStopHeaveOperations(boolean z) {
        this.allowStopHeaveOperations = z;
    }

    public final void setAnimateEmptyView(int i, boolean z) {
        this.animateEmptyView = z;
        this.emptyViewAnimationType = i;
    }

    public void setCaptureSectionsDecoratorAllowed(boolean z) {
        this.canCaptureSectionsDecorator = z;
    }

    public void setDisableHighlightState(boolean z) {
        this.disableHighlightState = z;
    }

    public void setDisallowInterceptTouchEvents(boolean z) {
        this.disallowInterceptTouchEvents = z;
    }

    public void setDrawSelection(boolean z) {
        this.drawSelection = z;
    }

    public void setDrawSelectorBehind(boolean z) {
        this.drawSelectorBehind = z;
    }

    public void setEmptyView(View view) {
        View view2 = this.emptyView;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            view2.animate().setListener(null).cancel();
        }
        this.emptyView = view;
        if (this.animateEmptyView && view != null) {
            view.setVisibility(8);
        }
        if (!this.isHidden) {
            this.emptyViewAnimateToVisibility = -1;
            checkIfEmpty(false);
            return;
        }
        View view3 = this.emptyView;
        if (view3 != null) {
            this.emptyViewAnimateToVisibility = 8;
            view3.setVisibility(8);
        }
    }

    public void setFastScrollEnabled(int i) {
        this.fastScroll = new FastScroll(getContext(), i);
        if (getParent() != null) {
            ((ViewGroup) getParent()).addView(this.fastScroll);
        }
    }

    public void setFastScrollVisible(boolean z) {
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll == null) {
            return;
        }
        fastScroll.setVisibility(z ? 0 : 8);
        this.fastScroll.isVisible = z;
    }

    public void setHideIfEmpty(boolean z) {
        this.hideIfEmpty = z;
    }

    public void setInstantClick(boolean z) {
        this.instantClick = z;
    }

    @Override
    public void setItemAnimator(RecyclerView.ItemAnimator itemAnimator) {
        super.setItemAnimator(itemAnimator);
    }

    public void setItemSelectorColorProvider(GenericProvider<Integer, Integer> genericProvider) {
        this.getSelectorColor = genericProvider;
    }

    public void setItemsEnterAnimator(RecyclerItemsEnterAnimator recyclerItemsEnterAnimator) {
        this.itemsEnterAnimator = recyclerItemsEnterAnimator;
    }

    public void setListSelectorColor(Integer num) {
        int iIntValue;
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (num == null) {
            iIntValue = Theme.getColor(hasSections() ? Theme.key_settings_listSelector : Theme.key_listSelector, this.resourcesProvider);
        } else {
            iIntValue = num.intValue();
        }
        Theme.setSelectorDrawableColor(rippleDrawableSafe, iIntValue, true);
    }

    public void setOnInterceptTouchListener(OnInterceptTouchListener onInterceptTouchListener) {
        this.onInterceptTouchListener = onInterceptTouchListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.onItemLongClickListener = onItemLongClickListener;
        PhotoViewer.AnonymousClass18 anonymousClass18 = this.gestureDetector;
        boolean z = onItemLongClickListener != null;
        GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase = (GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) anonymousClass18.this$0;
        gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase.mIsLongpressEnabled = z;
        gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase.mLongpressDuration = longPressTimeout;
    }

    @Override
    public void setOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        this.onScrollListener = onScrollListener;
    }

    public final void setPaddingWithoutRequestLayout(int i, int i2, int i3, int i4) {
        if (getPaddingLeft() == i && getPaddingTop() == i2 && getPaddingRight() == i3 && getPaddingBottom() == i4) {
            return;
        }
        this.ignoreLayout = true;
        setPadding(i, i2, i3, i4);
        this.ignoreLayout = false;
    }

    public void setPinnedHeaderShadowDrawable(Drawable drawable) {
        this.pinnedHeaderShadowDrawable = drawable;
    }

    public void setPinnedSectionOffsetY(int i) {
        this.sectionOffset = i;
        invalidate();
    }

    public void setResetSelectorOnChanged(boolean z) {
        this.resetSelectorOnChanged = z;
    }

    public void setScrollEnabled(boolean z) {
        this.scrollEnabled = z;
    }

    public void setSections() {
        setSections(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
    }

    public void setSectionsType(int i) {
        this.sectionsType = i;
        if (i == 1 || i == 3) {
            this.headers = new ArrayList();
            this.headersCache = new ArrayList();
        }
    }

    public void setSelectorDrawableColor(int i) {
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.setCallback(null);
        }
        int i2 = this.selectorType;
        if (i2 == 8) {
            this.selectorDrawable = Theme.createRadSelectorDrawable(i, this.selectorRadius, 0);
        } else if (i2 == 9) {
            this.selectorDrawable = null;
        } else {
            int i3 = this.topBottomSelectorRadius;
            if (i3 > 0) {
                this.selectorDrawable = Theme.createRadSelectorDrawable(i, i3, i3);
            } else {
                int i4 = this.selectorRadius;
                if (i4 > 0 && i2 != 1) {
                    this.selectorDrawable = Theme.createSimpleSelectorRoundRectDrawable(i4, i4, i4, i4, 0, i, -16777216);
                } else if (i2 == 2) {
                    this.selectorDrawable = Theme.createSelectorDrawable(i, 2, -1);
                } else {
                    this.selectorDrawable = Theme.createSelectorDrawable(i, i2, i4);
                }
            }
        }
        BaseCell.RippleDrawableSafe rippleDrawableSafe2 = this.selectorDrawable;
        if (rippleDrawableSafe2 != null) {
            rippleDrawableSafe2.setCallback(this);
        }
    }

    public void setSelectorRadius(int i) {
        this.selectorRadius = i;
    }

    public void setSelectorTransformer(Consumer consumer) {
        this.selectorTransformer = consumer;
    }

    public void setSelectorType(int i) {
        this.selectorType = i;
    }

    public void setSkipDrawSection(boolean z) {
        this.skipDrawSection = z;
    }

    public void setTopBottomSelectorRadius(int i) {
        this.topBottomSelectorRadius = i;
    }

    public void setTranslateSelector(boolean z) {
        this.translateSelector = z ? -2 : -1;
    }

    public void setTranslateSelectorPosition(int i) {
        if (i <= 0) {
            i = -1;
        }
        this.translateSelector = i;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        FastScroll fastScroll = this.fastScroll;
        if (fastScroll != null) {
            fastScroll.setTranslationY(f);
        }
    }

    @Override
    public void setVerticalScrollBarEnabled(boolean z) {
        if (attributes != null) {
            super.setVerticalScrollBarEnabled(z);
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            this.hiddenByEmptyView = false;
        }
    }

    @Override
    public final void stopScroll() {
        RecyclerView.SmoothScroller smoothScroller;
        try {
            setScrollState(0);
            this.mViewFlinger.stop();
            RecyclerView.LayoutManager layoutManager = this.mLayout;
            if (layoutManager == null || (smoothScroller = layoutManager.mSmoothScroller) == null) {
                return;
            }
            smoothScroller.stop();
        } catch (NullPointerException unused) {
        }
    }

    public final void updateSelectorState() {
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe == null || !rippleDrawableSafe.isStateful()) {
            return;
        }
        if (this.currentChildView != null) {
            if (this.selectorDrawable.setState(getDrawableStateForSelector())) {
                invalidateDrawable(this.selectorDrawable);
            }
        } else if (this.removeHighlighSelectionRunnable == null) {
            this.selectorDrawable.setState(StateSet.NOTHING);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.selectorDrawable == drawable || super.verifyDrawable(drawable);
    }

    public RecyclerListView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.drawSelection = true;
        this.allowItemsInteractionDuringAnimation = true;
        this.currentFirst = -1;
        this.currentVisible = -1;
        this.skipDrawSection = false;
        this.hideIfEmpty = true;
        this.selectorType = 2;
        this.selectorRect = new Rect();
        this.translateSelector = -1;
        this.scrollEnabled = true;
        this.lastX = Float.MAX_VALUE;
        this.lastY = Float.MAX_VALUE;
        this.accessibilityEnabled = true;
        this.accessibilityDelegate = new AnonymousClass1(0);
        this.resetSelectorOnChanged = true;
        this.observer = new PaddedListAdapter.AnonymousClass2(this, 2);
        this.scroller = new BubbleActivity.AnonymousClass1(this, 29);
        this.clipPath = new Path();
        this.resourcesProvider = resourcesProvider;
        EdgeEffectTrackerFactory edgeEffectTrackerFactory = new EdgeEffectTrackerFactory();
        this.edgeEffectTrackerFactory = edgeEffectTrackerFactory;
        setEdgeEffectFactory(edgeEffectTrackerFactory);
        setGlowColor(Theme.getColor(Theme.key_actionBarDefault, resourcesProvider));
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1);
        this.selectorDrawable = rippleDrawableSafeCreateSelectorDrawable;
        rippleDrawableSafeCreateSelectorDrawable.setCallback(this);
        try {
            if (!gotAttributes) {
                int[] iArr = null;
                try {
                    Field field = Class.forName("com.android.internal.R$styleable").getField("View");
                    if (field != null) {
                        iArr = (int[]) field.get(null);
                    }
                } catch (Throwable unused) {
                }
                attributes = iArr;
                if (iArr == null) {
                    attributes = new int[0];
                }
                gotAttributes = true;
            }
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributes);
            Method method = initializeScrollbars;
            if (method != null) {
                method.invoke(this, typedArrayObtainStyledAttributes);
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 5));
        this.mOnItemTouchListeners.add(new ItemTouchHelper.AnonymousClass2(context, this));
    }

    public boolean allowSelectChildAtPosition(View view) {
        return true;
    }

    public void setOnItemClickListener(OnItemClickListenerExtended onItemClickListenerExtended) {
        this.onItemClickListenerExtended = onItemClickListenerExtended;
    }

    public void setSections(boolean z) {
        setSections(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), z);
    }

    public void setSections(int i, float f, boolean z) {
        ChatActivity$$ExternalSyntheticLambda29 chatActivity$$ExternalSyntheticLambda29 = new ChatActivity$$ExternalSyntheticLambda29(4);
        GradientHeaderActivity$$ExternalSyntheticLambda2 gradientHeaderActivity$$ExternalSyntheticLambda2 = new GradientHeaderActivity$$ExternalSyntheticLambda2(this, 1);
        SparseIntArray sparseIntArray = new SparseIntArray();
        Pair pair = new Pair(new StakedDiceSheet$$ExternalSyntheticLambda6(this, chatActivity$$ExternalSyntheticLambda29, sparseIntArray, 3), new WebActionBar$$ExternalSyntheticLambda9(sparseIntArray, 5));
        setSections((Utilities.CallbackReturn) pair.first, (Utilities.CallbackReturn) pair.second, i, f, gradientHeaderActivity$$ExternalSyntheticLambda2, z);
    }

    public void setOnItemLongClickListener(OnItemLongClickListenerExtended onItemLongClickListenerExtended) {
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.onItemLongClickListenerExtended = onItemLongClickListenerExtended;
        PhotoViewer.AnonymousClass18 anonymousClass18 = this.gestureDetector;
        boolean z = onItemLongClickListenerExtended != null;
        GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase = (GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) anonymousClass18.this$0;
        gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase.mIsLongpressEnabled = z;
        gestureDetectorFixDoubleTap$GestureDetectorCompatImplBase.mLongpressDuration = longPressTimeout;
    }

    public final void setSections(Utilities.CallbackReturn callbackReturn, Utilities.CallbackReturn callbackReturn2, int i, float f, Utilities.Callback5 callback5, boolean z) {
        setSelectorDrawableColor(Theme.getColor(Theme.key_settings_listSelector, this.resourcesProvider));
        this.isViewTypeSection = callbackReturn2;
        this.sectionRadius = f;
        this.sectionRadiusTop = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.sectionRadiusBottom = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f};
        this.drawSectionBackground = callback5;
        RecyclerView.ItemDecoration itemDecoration = this.sectionsItemDecoration;
        if (itemDecoration != null) {
            removeItemDecoration(itemDecoration);
        }
        ListSectionsDecoration listSectionsDecoration = new ListSectionsDecoration(this, callbackReturn, i, z);
        this.sectionsItemDecoration = listSectionsDecoration;
        addItemDecoration(listSectionsDecoration);
    }

    public final void drawSectionBackground(Canvas canvas, View view, View view2, boolean z, boolean z2) {
        float y;
        if (view == null || view2 == null) {
            return;
        }
        float bottomInfoMargin = view2 instanceof JoinToSendSettingsView ? ((JoinToSendSettingsView) view2).getBottomInfoMargin() : 0.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float left = view.getLeft();
        float f = -this.sectionRadius;
        if (view.getTag(R.id.dragging) != null) {
            y = view.getTop();
        } else {
            y = view.getY();
        }
        rectF.set(left, Math.max(f, y - (z ? this.sectionRadius : 0.0f)), view.getRight(), Math.min(getHeight() - (-this.sectionRadius), (bottom(view2) + (z2 ? this.sectionRadius : 0.0f)) - bottomInfoMargin));
        if (rectF.bottom < rectF.top) {
            return;
        }
        this.drawSectionBackground.mo1067run(canvas, rectF, Float.valueOf(this.sectionRadius), Float.valueOf(this.sectionRadius), Float.valueOf(view.getAlpha()));
    }
}

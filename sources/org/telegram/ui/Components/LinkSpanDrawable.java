package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.AnimatedEmojiSpan;

public class LinkSpanDrawable {
    private static final ArrayList pathCache = new ArrayList();
    private final Path circlePath;
    private int color;
    private int cornerRadius;
    private final boolean isLite;
    private android.graphics.Rect mBounds;
    private final long mDuration;
    private final long mLongPressDuration;
    private float mMaxRadius;
    private final ArrayList mPathes;
    private int mPathesCount;
    private long mReleaseStart;
    private final Theme.ResourcesProvider mResourcesProvider;
    private int mRippleAlpha;
    private Paint mRipplePaint;
    private int mSelectionAlpha;
    private Paint mSelectionPaint;
    private final CharacterStyle mSpan;
    private long mStart;
    private final boolean mSupportsLongPress;
    private final float mTouchX;
    private final float mTouchY;
    private final float rippleAlpha;
    private final float selectionAlpha;

    public LinkSpanDrawable(CharacterStyle characterStyle, Theme.ResourcesProvider resourcesProvider, float f, float f2) {
        this(characterStyle, resourcesProvider, f, f2, true);
    }

    public LinkSpanDrawable(CharacterStyle characterStyle, Theme.ResourcesProvider resourcesProvider, float f, float f2, boolean z) {
        this.mPathes = new ArrayList();
        this.mPathesCount = 0;
        this.circlePath = new Path();
        this.mStart = -1L;
        this.mReleaseStart = -1L;
        this.selectionAlpha = 0.2f;
        this.rippleAlpha = 0.8f;
        this.isLite = !LiteMode.isEnabled(360928);
        this.mSpan = characterStyle;
        this.mResourcesProvider = resourcesProvider;
        setColor(Theme.getColor(Theme.key_chat_linkSelectBackground, resourcesProvider));
        this.mTouchX = f;
        this.mTouchY = f2;
        long tapTimeout = ViewConfiguration.getTapTimeout();
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.mLongPressDuration = longPressTimeout;
        this.mDuration = (long) Math.min(tapTimeout * 1.8f, longPressTimeout * 0.8f);
        this.mSupportsLongPress = false;
    }

    public void setColor(int i) {
        this.color = i;
        Paint paint = this.mSelectionPaint;
        if (paint != null) {
            paint.setColor(i);
            this.mSelectionAlpha = Color.alpha(i);
        }
        Paint paint2 = this.mRipplePaint;
        if (paint2 != null) {
            paint2.setColor(i);
            this.mRippleAlpha = Color.alpha(i);
        }
    }

    public void release() {
        this.mReleaseStart = Math.max(this.mStart + this.mDuration, SystemClock.elapsedRealtime());
    }

    public LinkPath obtainNewPath() {
        LinkPath linkPath;
        ArrayList arrayList = pathCache;
        if (!arrayList.isEmpty()) {
            linkPath = (LinkPath) arrayList.remove(0);
        } else {
            linkPath = new LinkPath(true);
        }
        linkPath.setUseCornerPathImplementation(!this.isLite);
        linkPath.reset();
        this.mPathes.add(linkPath);
        this.mPathesCount = this.mPathes.size();
        return linkPath;
    }

    public void reset() {
        if (this.mPathes.isEmpty()) {
            return;
        }
        pathCache.addAll(this.mPathes);
        this.mPathes.clear();
        this.mPathesCount = 0;
    }

    public CharacterStyle getSpan() {
        return this.mSpan;
    }

    public boolean draw(Canvas canvas) {
        float f;
        int iDp = this.isLite ? 0 : AndroidUtilities.dp(4.0f);
        boolean z = this.cornerRadius != iDp;
        if (this.mSelectionPaint == null) {
            Paint paint = new Paint(1);
            this.mSelectionPaint = paint;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.mSelectionPaint.setColor(this.color);
            this.mSelectionAlpha = Color.alpha(this.color);
        }
        if (this.mRipplePaint == null) {
            Paint paint2 = new Paint(1);
            this.mRipplePaint = paint2;
            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
            this.mRipplePaint.setColor(this.color);
            this.mRippleAlpha = Color.alpha(this.color);
        }
        if (z) {
            this.cornerRadius = iDp;
            if (iDp <= 0) {
                this.mSelectionPaint.setPathEffect(null);
                this.mRipplePaint.setPathEffect(null);
            } else {
                this.mSelectionPaint.setPathEffect(new CornerPathEffect(this.cornerRadius));
                this.mRipplePaint.setPathEffect(new CornerPathEffect(this.cornerRadius));
            }
        }
        if (this.mBounds == null && this.mPathesCount > 0) {
            LinkPath linkPath = (LinkPath) this.mPathes.get(0);
            RectF rectF = AndroidUtilities.rectTmp;
            linkPath.computeBounds(rectF, false);
            this.mBounds = new android.graphics.Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i = 1; i < this.mPathesCount; i++) {
                LinkPath linkPath2 = (LinkPath) this.mPathes.get(i);
                RectF rectF2 = AndroidUtilities.rectTmp;
                linkPath2.computeBounds(rectF2, false);
                android.graphics.Rect rect = this.mBounds;
                rect.left = Math.min(rect.left, (int) rectF2.left);
                android.graphics.Rect rect2 = this.mBounds;
                rect2.top = Math.min(rect2.top, (int) rectF2.top);
                android.graphics.Rect rect3 = this.mBounds;
                rect3.right = Math.max(rect3.right, (int) rectF2.right);
                android.graphics.Rect rect4 = this.mBounds;
                rect4.bottom = Math.max(rect4.bottom, (int) rectF2.bottom);
            }
            this.mMaxRadius = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.mBounds.left - this.mTouchX, 2.0d) + Math.pow(this.mBounds.top - this.mTouchY, 2.0d), Math.pow(this.mBounds.right - this.mTouchX, 2.0d) + Math.pow(this.mBounds.top - this.mTouchY, 2.0d)), Math.max(Math.pow(this.mBounds.left - this.mTouchX, 2.0d) + Math.pow(this.mBounds.bottom - this.mTouchY, 2.0d), Math.pow(this.mBounds.right - this.mTouchX, 2.0d) + Math.pow(this.mBounds.bottom - this.mTouchY, 2.0d))));
        }
        if (this.isLite) {
            for (int i2 = 0; i2 < this.mPathesCount; i2++) {
                canvas.drawPath((Path) this.mPathes.get(i2), this.mRipplePaint);
            }
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.mStart < 0) {
            this.mStart = jElapsedRealtime;
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(Math.min(1.0f, (jElapsedRealtime - this.mStart) / this.mDuration));
        float fMin = this.mReleaseStart < 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((jElapsedRealtime - 75) - r12) / 100.0f));
        if (this.mSupportsLongPress) {
            long j = jElapsedRealtime - this.mStart;
            long j2 = this.mDuration * 2;
            float fMax = Math.max(0.0f, (j - j2) / (this.mLongPressDuration - j2));
            f = (fMax > 1.0f ? 1.0f - (((jElapsedRealtime - this.mStart) - this.mLongPressDuration) / this.mDuration) : fMax * 0.5f) * (1.0f - fMin);
        } else {
            f = 1.0f;
        }
        float f2 = 1.0f - fMin;
        this.mSelectionPaint.setAlpha((int) (this.mSelectionAlpha * 0.2f * Math.min(1.0f, interpolation * 5.0f) * f2));
        float f3 = 1.0f - f;
        this.mSelectionPaint.setStrokeWidth(Math.min(1.0f, f3) * AndroidUtilities.dp(5.0f));
        for (int i3 = 0; i3 < this.mPathesCount; i3++) {
            ((LinkPath) this.mPathes.get(i3)).closeRects();
            canvas.drawPath((Path) this.mPathes.get(i3), this.mSelectionPaint);
        }
        this.mRipplePaint.setAlpha((int) (this.mRippleAlpha * 0.8f * f2));
        this.mRipplePaint.setStrokeWidth(Math.min(1.0f, f3) * AndroidUtilities.dp(5.0f));
        if (interpolation < 1.0f) {
            float f4 = interpolation * this.mMaxRadius;
            canvas.save();
            this.circlePath.reset();
            this.circlePath.addCircle(this.mTouchX, this.mTouchY, f4, Path.Direction.CW);
            canvas.clipPath(this.circlePath);
            for (int i4 = 0; i4 < this.mPathesCount; i4++) {
                canvas.drawPath((Path) this.mPathes.get(i4), this.mRipplePaint);
            }
            canvas.restore();
        } else {
            for (int i5 = 0; i5 < this.mPathesCount; i5++) {
                canvas.drawPath((Path) this.mPathes.get(i5), this.mRipplePaint);
            }
        }
        return interpolation < 1.0f || this.mReleaseStart >= 0 || (this.mSupportsLongPress && jElapsedRealtime - this.mStart < this.mLongPressDuration + this.mDuration);
    }

    public static class LinkCollector {
        private Runnable additionalInvalidate;
        private ArrayList mLinks = new ArrayList();
        private int mLinksCount = 0;
        private ArrayList mLoading = new ArrayList();
        private int mLoadingCount = 0;
        private View mParent;

        public LinkCollector() {
        }

        public LinkCollector(View view) {
            this.mParent = view;
        }

        public void setAdditionalInvalidate(Runnable runnable) {
            this.additionalInvalidate = runnable;
        }

        public void addLink(LinkSpanDrawable linkSpanDrawable) {
            addLink(linkSpanDrawable, null);
        }

        public void addLink(LinkSpanDrawable linkSpanDrawable, Object obj) {
            this.mLinks.add(new Pair(linkSpanDrawable, obj));
            this.mLinksCount++;
            invalidate(obj);
        }

        public static LoadingDrawable makeLoading(Layout layout, CharacterStyle characterStyle, float f) {
            if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
                return null;
            }
            Spanned spanned = (Spanned) layout.getText();
            LinkPath linkPath = new LinkPath(true);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            linkPath.setCurrentLayout(layout, spanStart, f);
            layout.getSelectionPath(spanStart, spanEnd, linkPath);
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            loadingDrawable.usePath(linkPath);
            loadingDrawable.setAppearByGradient(true);
            loadingDrawable.setRadiiDp(4.0f);
            loadingDrawable.updateBounds();
            return loadingDrawable;
        }

        public void addLoading(LoadingDrawable loadingDrawable) {
            addLoading(loadingDrawable, null);
        }

        public void addLoading(LoadingDrawable loadingDrawable, Object obj) {
            this.mLoading.add(new Pair(loadingDrawable, obj));
            this.mLoadingCount++;
            invalidate(obj);
        }

        public void removeLink(LinkSpanDrawable linkSpanDrawable) {
            removeLink(linkSpanDrawable, true);
        }

        public void removeLink(final LinkSpanDrawable linkSpanDrawable, boolean z) {
            Pair pair;
            if (linkSpanDrawable == null) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= this.mLinksCount) {
                    pair = null;
                    break;
                } else {
                    if (((Pair) this.mLinks.get(i)).first == linkSpanDrawable) {
                        pair = (Pair) this.mLinks.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                return;
            }
            if (!z) {
                this.mLinks.remove(pair);
                linkSpanDrawable.reset();
                this.mLinksCount = this.mLinks.size();
                invalidate(pair.second);
                return;
            }
            if (linkSpanDrawable.mReleaseStart < 0) {
                linkSpanDrawable.release();
                invalidate(pair.second);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$removeLink$0(linkSpanDrawable);
                    }
                }, Math.max(0L, (linkSpanDrawable.mReleaseStart - SystemClock.elapsedRealtime()) + 175));
            }
        }

        public void lambda$removeLink$0(LinkSpanDrawable linkSpanDrawable) {
            removeLink(linkSpanDrawable, false);
        }

        private void removeLink(int i, boolean z) {
            if (i < 0 || i >= this.mLinksCount) {
                return;
            }
            if (z) {
                Pair pair = (Pair) this.mLinks.get(i);
                final LinkSpanDrawable linkSpanDrawable = (LinkSpanDrawable) pair.first;
                if (linkSpanDrawable.mReleaseStart < 0) {
                    linkSpanDrawable.release();
                    invalidate(pair.second);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$removeLink$1(linkSpanDrawable);
                        }
                    }, Math.max(0L, (linkSpanDrawable.mReleaseStart - SystemClock.elapsedRealtime()) + 175));
                    return;
                }
                return;
            }
            Pair pair2 = (Pair) this.mLinks.remove(i);
            ((LinkSpanDrawable) pair2.first).reset();
            this.mLinksCount = this.mLinks.size();
            invalidate(pair2.second);
        }

        public void lambda$removeLink$1(LinkSpanDrawable linkSpanDrawable) {
            removeLink(linkSpanDrawable, false);
        }

        public void removeLoading(LoadingDrawable loadingDrawable, boolean z) {
            if (loadingDrawable == null) {
                return;
            }
            for (int i = 0; i < this.mLoadingCount; i++) {
                if (((Pair) this.mLoading.get(i)).first == loadingDrawable) {
                    removeLoadingAt(i, z);
                    return;
                }
            }
        }

        private void removeLoadingAt(int i, boolean z) {
            Pair pair;
            if (i < 0 || i >= this.mLoadingCount || (pair = (Pair) this.mLoading.get(i)) == null) {
                return;
            }
            final LoadingDrawable loadingDrawable = (LoadingDrawable) pair.first;
            if (z) {
                if (!loadingDrawable.isDisappeared()) {
                    if (!loadingDrawable.isDisappearing()) {
                        loadingDrawable.disappear();
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$removeLoadingAt$2(loadingDrawable);
                        }
                    }, loadingDrawable.timeToDisappear());
                    return;
                }
                removeLoading(loadingDrawable, false);
                return;
            }
            this.mLoading.remove(pair);
            loadingDrawable.reset();
            loadingDrawable.resetDisappear();
            this.mLoadingCount = this.mLoading.size();
            invalidate(pair.second);
        }

        public void lambda$removeLoadingAt$2(LoadingDrawable loadingDrawable) {
            removeLoading(loadingDrawable, false);
        }

        public void clear() {
            clear(true);
        }

        public void clear(boolean z) {
            if (z) {
                for (int i = 0; i < this.mLinksCount; i++) {
                    removeLink(i, true);
                }
            } else if (this.mLinksCount > 0) {
                for (int i2 = 0; i2 < this.mLinksCount; i2++) {
                    ((LinkSpanDrawable) ((Pair) this.mLinks.get(i2)).first).reset();
                    invalidate(((Pair) this.mLinks.get(i2)).second, false);
                }
                this.mLinks.clear();
                this.mLinksCount = 0;
                invalidate();
            }
        }

        public void clearLoading(boolean z) {
            if (z) {
                for (int i = 0; i < this.mLoadingCount; i++) {
                    removeLoadingAt(i, true);
                }
            } else if (this.mLoadingCount > 0) {
                for (int i2 = 0; i2 < this.mLoadingCount; i2++) {
                    ((LoadingDrawable) ((Pair) this.mLoading.get(i2)).first).reset();
                    invalidate(((Pair) this.mLoading.get(i2)).second, false);
                }
                this.mLoading.clear();
                this.mLoadingCount = 0;
                invalidate();
            }
        }

        public void removeLinks(Object obj) {
            removeLinks(obj, true);
        }

        public void removeLinks(Object obj, boolean z) {
            for (int i = 0; i < this.mLinksCount; i++) {
                if (((Pair) this.mLinks.get(i)).second == obj) {
                    removeLink(i, z);
                }
            }
        }

        public boolean draw(Canvas canvas) {
            int i = 0;
            boolean z = false;
            while (i < this.mLoadingCount) {
                ((LoadingDrawable) ((Pair) this.mLoading.get(i)).first).draw(canvas);
                i++;
                z = true;
            }
            for (int i2 = 0; i2 < this.mLinksCount; i2++) {
                z = ((LinkSpanDrawable) ((Pair) this.mLinks.get(i2)).first).draw(canvas) || z;
            }
            return z;
        }

        public boolean draw(Canvas canvas, Object obj) {
            boolean z = false;
            for (int i = 0; i < this.mLoadingCount; i++) {
                if (((Pair) this.mLoading.get(i)).second == obj) {
                    ((LoadingDrawable) ((Pair) this.mLoading.get(i)).first).draw(canvas);
                    z = true;
                }
            }
            for (int i2 = 0; i2 < this.mLinksCount; i2++) {
                if (((Pair) this.mLinks.get(i2)).second == obj) {
                    z = ((LinkSpanDrawable) ((Pair) this.mLinks.get(i2)).first).draw(canvas) || z;
                }
            }
            invalidate(obj, false);
            return z;
        }

        public boolean isEmpty() {
            return this.mLinksCount <= 0;
        }

        private void invalidate() {
            invalidate(null, true);
        }

        private void invalidate(Object obj) {
            invalidate(obj, true);
        }

        private void invalidate(Object obj, boolean z) {
            View view;
            if (obj instanceof View) {
                ((View) obj).invalidate();
            } else if (obj instanceof ArticleViewer.DrawingText) {
                ((ArticleViewer.DrawingText) obj).invalidateParent();
            } else if (z && (view = this.mParent) != null) {
                view.invalidate();
            }
            Runnable runnable = this.additionalInvalidate;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static class LinksTextView extends TextView {
        private CharacterStyle currentLinkLoading;
        private boolean disablePaddingsOffset;
        private boolean disablePaddingsOffsetX;
        private boolean disablePaddingsOffsetY;
        private ColorFilter emojiColorFilter;
        private int emojiColorFilterColor;
        private boolean emojiColorIsLink;
        private boolean isCustomLinkCollector;
        private final LinkCollector links;
        private boolean loggedError;
        private int maxWidth;
        private OnLinkPress onLongPressListener;
        private OnLinkPress onPressListener;
        private LinkSpanDrawable pressedLink;
        private Theme.ResourcesProvider resourcesProvider;
        AnimatedEmojiSpan.EmojiGroupedSpans stack;

        public interface OnLinkPress {
            void run(ClickableSpan clickableSpan);
        }

        protected int emojiCacheType() {
            return 0;
        }

        protected int processColor(int i) {
            return i;
        }

        public void setLoading(CharacterStyle characterStyle) {
            if (this.currentLinkLoading != characterStyle) {
                this.links.clearLoading(true);
                this.currentLinkLoading = characterStyle;
                LoadingDrawable loadingDrawableMakeLoading = LinkCollector.makeLoading(getLayout(), characterStyle, getPaddingTop());
                if (loadingDrawableMakeLoading != null) {
                    int iProcessColor = processColor(Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider));
                    loadingDrawableMakeLoading.setColors(Theme.multAlpha(iProcessColor, 0.8f), Theme.multAlpha(iProcessColor, 1.3f), Theme.multAlpha(iProcessColor, 1.0f), Theme.multAlpha(iProcessColor, 4.0f));
                    loadingDrawableMakeLoading.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    this.links.addLoading(loadingDrawableMakeLoading);
                }
            }
        }

        @Override
        public void setMaxWidth(int i) {
            this.maxWidth = i;
        }

        public LinksTextView(Context context) {
            this(context, null);
        }

        public LinksTextView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.loggedError = false;
            this.emojiColorIsLink = true;
            this.isCustomLinkCollector = false;
            this.links = new LinkCollector(this);
            this.resourcesProvider = resourcesProvider;
        }

        public LinksTextView(Context context, LinkCollector linkCollector, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.loggedError = false;
            this.emojiColorIsLink = true;
            this.isCustomLinkCollector = true;
            this.links = linkCollector;
            this.resourcesProvider = resourcesProvider;
        }

        public void setDisablePaddingsOffset(boolean z) {
            this.disablePaddingsOffset = z;
        }

        public void setDisablePaddingsOffsetX(boolean z) {
            this.disablePaddingsOffsetX = z;
        }

        public void setDisablePaddingsOffsetY(boolean z) {
            this.disablePaddingsOffsetY = z;
        }

        public void setOnLinkPressListener(OnLinkPress onLinkPress) {
            this.onPressListener = onLinkPress;
        }

        public void setOnLinkLongPressListener(OnLinkPress onLinkPress) {
            this.onLongPressListener = onLinkPress;
        }

        public int getTextPaddingTop() {
            int paddingTop = getPaddingTop();
            return (getGravity() != 17 || getLayout() == null) ? paddingTop : paddingTop + Math.max(0, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2);
        }

        public ClickableSpan hit(int i, int i2) {
            Layout layout = getLayout();
            if (layout == null) {
                return null;
            }
            int paddingLeft = i - getPaddingLeft();
            int textPaddingTop = i2 - getTextPaddingTop();
            int lineForVertical = layout.getLineForVertical(textPaddingTop);
            float f = paddingLeft;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            float lineLeft = layout.getLineLeft(lineForVertical);
            if (lineLeft <= f && lineLeft + layout.getLineWidth(lineForVertical) >= f && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                    return clickableSpanArr[0];
                }
            }
            return null;
        }

        public int overrideColor() {
            return Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.links != null) {
                Layout layout = getLayout();
                final ClickableSpan clickableSpanHit = hit((int) motionEvent.getX(), (int) motionEvent.getY());
                if (clickableSpanHit != null && motionEvent.getAction() == 0) {
                    final LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanHit, this.resourcesProvider, motionEvent.getX(), motionEvent.getY());
                    linkSpanDrawable.setColor(overrideColor());
                    this.pressedLink = linkSpanDrawable;
                    this.links.addLink(linkSpanDrawable);
                    SpannableString spannableString = new SpannableString(layout.getText());
                    int spanStart = spannableString.getSpanStart(this.pressedLink.getSpan());
                    int spanEnd = spannableString.getSpanEnd(this.pressedLink.getSpan());
                    LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                    linkPathObtainNewPath.setCurrentLayout(layout, spanStart, getPaddingTop());
                    layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onTouchEvent$0(linkSpanDrawable, clickableSpanHit);
                        }
                    }, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    this.links.clear();
                    LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                    if (linkSpanDrawable2 != null && linkSpanDrawable2.getSpan() == clickableSpanHit) {
                        OnLinkPress onLinkPress = this.onPressListener;
                        if (onLinkPress != null) {
                            onLinkPress.run((ClickableSpan) this.pressedLink.getSpan());
                        } else if (this.pressedLink.getSpan() != null) {
                            ((ClickableSpan) this.pressedLink.getSpan()).onClick(this);
                        }
                        this.pressedLink = null;
                        return true;
                    }
                    this.pressedLink = null;
                }
                if (motionEvent.getAction() == 3) {
                    this.links.clear();
                    this.pressedLink = null;
                }
            }
            return this.pressedLink != null || super.onTouchEvent(motionEvent);
        }

        public void lambda$onTouchEvent$0(LinkSpanDrawable linkSpanDrawable, ClickableSpan clickableSpan) {
            OnLinkPress onLinkPress = this.onLongPressListener;
            if (onLinkPress == null || this.pressedLink != linkSpanDrawable) {
                return;
            }
            onLinkPress.run(clickableSpan);
            this.pressedLink = null;
            this.links.clear();
        }

        @Override
        protected void onDraw(android.graphics.Canvas r16) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.LinkSpanDrawable.LinksTextView.onDraw(android.graphics.Canvas):void");
        }

        public void resetEmojiColor() {
            this.emojiColorIsLink = false;
            this.emojiColorFilter = null;
            invalidate();
        }

        public void setEmojiColor(int i) {
            this.emojiColorIsLink = false;
            this.emojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            invalidate();
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            this.stack = AnimatedEmojiSpan.update(emojiCacheType(), this, this.stack, getLayout());
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int i3 = this.maxWidth;
            if (i3 > 0) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i));
            }
            super.onMeasure(i, i2);
            this.stack = AnimatedEmojiSpan.update(emojiCacheType(), this, this.stack, getLayout());
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.stack = AnimatedEmojiSpan.update(emojiCacheType(), this, this.stack, getLayout());
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiSpan.release(this, this.stack);
        }

        public boolean hasLinks() {
            Layout layout = getLayout();
            if (layout == null) {
                return false;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return false;
            }
            Spanned spanned = (Spanned) text;
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
            return clickableSpanArr != null && clickableSpanArr.length > 0;
        }

        public void clear() {
            this.links.clear(false);
        }
    }

    public static class LinksSimpleTextView extends SimpleTextView {
        private final LinkCollector links;
        private LinkSpanDrawable pressedLink;
        private Theme.ResourcesProvider resourcesProvider;

        public LinksSimpleTextView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.links = new LinkCollector(this);
            this.resourcesProvider = resourcesProvider;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.save();
            canvas.translate(getLayoutX(), getLayoutY());
            if (this.links.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
        }

        public ClickableSpan hit(int i, int i2) {
            Layout layout = getLayout();
            if (layout == null) {
                return null;
            }
            int layoutX = (int) (i - getLayoutX());
            int layoutY = (int) (i2 - getLayoutY());
            int lineForVertical = layout.getLineForVertical(layoutY);
            float f = layoutX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
            float lineLeft = layout.getLineLeft(lineForVertical);
            if (lineLeft <= f && lineLeft + layout.getLineWidth(lineForVertical) >= f && layoutY >= 0 && layoutY <= layout.getHeight()) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                    return clickableSpanArr[0];
                }
            }
            return null;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.links != null) {
                Layout layout = getLayout();
                ClickableSpan clickableSpanHit = hit((int) motionEvent.getX(), (int) motionEvent.getY());
                if (clickableSpanHit != null && motionEvent.getAction() == 0) {
                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanHit, this.resourcesProvider, motionEvent.getX(), motionEvent.getY());
                    this.pressedLink = linkSpanDrawable;
                    this.links.addLink(linkSpanDrawable);
                    SpannableString spannableString = new SpannableString(layout.getText());
                    int spanStart = spannableString.getSpanStart(this.pressedLink.getSpan());
                    int spanEnd = spannableString.getSpanEnd(this.pressedLink.getSpan());
                    LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                    linkPathObtainNewPath.setCurrentLayout(layout, spanStart, 0.0f);
                    layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    this.links.clear();
                    LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                    if (linkSpanDrawable2 != null && linkSpanDrawable2.getSpan() == clickableSpanHit) {
                        if (this.pressedLink.getSpan() instanceof ClickableSpan) {
                            ((ClickableSpan) this.pressedLink.getSpan()).onClick(this);
                        }
                        this.pressedLink = null;
                        return true;
                    }
                    this.pressedLink = null;
                }
                if (motionEvent.getAction() == 3) {
                    this.links.clear();
                    this.pressedLink = null;
                }
            }
            return this.pressedLink != null || super.onTouchEvent(motionEvent);
        }
    }

    public static class ClickableSmallTextView extends SimpleTextView {
        private final Paint linkBackgroundPaint;
        private final LinkCollector links;
        private LinkSpanDrawable pressedLink;
        private Theme.ResourcesProvider resourcesProvider;

        public ClickableSmallTextView(Context context) {
            this(context, null);
        }

        public ClickableSmallTextView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.links = new LinkCollector(this);
            this.linkBackgroundPaint = new Paint(1);
            this.resourcesProvider = resourcesProvider;
        }

        private int getLinkColor() {
            return ColorUtils.setAlphaComponent(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (isClickable()) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getPaddingLeft() + getTextWidth() + getPaddingRight(), getHeight());
                this.linkBackgroundPaint.setColor(getLinkColor());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.linkBackgroundPaint);
            }
            super.onDraw(canvas);
            if (isClickable() && this.links.draw(canvas)) {
                invalidate();
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!isClickable()) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.links != null) {
                if (motionEvent.getAction() == 0) {
                    final LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(null, this.resourcesProvider, motionEvent.getX(), motionEvent.getY());
                    linkSpanDrawable.setColor(getLinkColor());
                    this.pressedLink = linkSpanDrawable;
                    this.links.addLink(linkSpanDrawable);
                    LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                    linkPathObtainNewPath.setCurrentLayout(null, 0, 0.0f, 0.0f);
                    linkPathObtainNewPath.addRect(0.0f, 0.0f, getPaddingLeft() + getTextWidth() + getPaddingRight(), getHeight(), Path.Direction.CW);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onTouchEvent$0(linkSpanDrawable);
                        }
                    }, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    this.links.clear();
                    if (this.pressedLink != null) {
                        performClick();
                    }
                    this.pressedLink = null;
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    this.links.clear();
                    this.pressedLink = null;
                    return true;
                }
            }
            return this.pressedLink != null || super.onTouchEvent(motionEvent);
        }

        public void lambda$onTouchEvent$0(LinkSpanDrawable linkSpanDrawable) {
            if (this.pressedLink == linkSpanDrawable) {
                performLongClick();
                this.pressedLink = null;
                this.links.clear();
            }
        }
    }
}

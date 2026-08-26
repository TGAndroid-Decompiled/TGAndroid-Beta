package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda7;

public final class LinkSpanDrawable {
    public static final ArrayList pathCache = new ArrayList();
    public int color;
    public int cornerRadius;
    public Rect mBounds;
    public final long mDuration;
    public float mMaxRadius;
    public int mRippleAlpha;
    public Paint mRipplePaint;
    public int mSelectionAlpha;
    public Paint mSelectionPaint;
    public final CharacterStyle mSpan;
    public final float mTouchX;
    public final float mTouchY;
    public final ArrayList mPathes = new ArrayList();
    public int mPathesCount = 0;
    public final Path circlePath = new Path();
    public long mStart = -1;
    public long mReleaseStart = -1;
    public final boolean isLite = !LiteMode.isEnabled(360928);

    public class ClickableSmallTextView extends SimpleTextView {
        public final Paint linkBackgroundPaint;
        public final LinkCollector links;
        public LinkSpanDrawable pressedLink;

        public ClickableSmallTextView(Context context) {
            super(context);
            this.links = new LinkCollector(this);
            this.linkBackgroundPaint = new Paint(1);
        }

        private int getLinkColor() {
            return ColorUtils.setAlphaComponent(getTextColor(), (int) (Color.alpha(getTextColor()) * 0.1175f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (isClickable()) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight());
                Paint paint = this.linkBackgroundPaint;
                paint.setColor(getLinkColor());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
            super.onDraw(canvas);
            if (isClickable() && this.links.draw(canvas)) {
                invalidate();
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (!isClickable()) {
                return super.onTouchEvent(motionEvent);
            }
            LinkCollector linkCollector = this.links;
            if (linkCollector != null) {
                if (motionEvent.getAction() == 0) {
                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(null, null, motionEvent.getX(), motionEvent.getY());
                    linkSpanDrawable.setColor(getLinkColor());
                    this.pressedLink = linkSpanDrawable;
                    linkCollector.addLink(linkSpanDrawable, null);
                    LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                    linkPathObtainNewPath.setCurrentLayout(null, 0, 0.0f, 0.0f);
                    linkPathObtainNewPath.addRect(0.0f, 0.0f, getPaddingRight() + getTextWidth() + getPaddingLeft(), getHeight(), Path.Direction.CW);
                    AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(7, this, linkSpanDrawable), ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    linkCollector.clear(true);
                    if (this.pressedLink != null) {
                        performClick();
                    }
                    this.pressedLink = null;
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    linkCollector.clear(true);
                    this.pressedLink = null;
                    return true;
                }
            }
            return this.pressedLink != null || super.onTouchEvent(motionEvent);
        }
    }

    public final class LinkCollector {
        public ChatMessageCell$$ExternalSyntheticLambda7 additionalInvalidate;
        public final ArrayList mLinks = new ArrayList();
        public int mLinksCount = 0;
        public final ArrayList mLoading = new ArrayList();
        public int mLoadingCount = 0;
        public View mParent;

        public LinkCollector() {
        }

        public static LoadingDrawable makeLoading(Layout layout, CharacterStyle characterStyle, float f) {
            if (layout == null || characterStyle == null || !(layout.getText() instanceof Spanned)) {
                return null;
            }
            Spanned spanned = (Spanned) layout.getText();
            LinkPath linkPath = new LinkPath(0);
            int spanStart = spanned.getSpanStart(characterStyle);
            int spanEnd = spanned.getSpanEnd(characterStyle);
            linkPath.setCurrentLayout(layout, spanStart, 0.0f, f);
            layout.getSelectionPath(spanStart, spanEnd, linkPath);
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            loadingDrawable.usePath = linkPath;
            loadingDrawable.appearByGradient = true;
            loadingDrawable.setRadii(AndroidUtilities.dp(4.0f));
            loadingDrawable.updateBounds();
            return loadingDrawable;
        }

        public final void addLink(LinkSpanDrawable linkSpanDrawable, Object obj) {
            this.mLinks.add(new Pair(linkSpanDrawable, obj));
            this.mLinksCount++;
            invalidate(obj, true);
        }

        public final void addLoading(LoadingDrawable loadingDrawable, Object obj) {
            this.mLoading.add(new Pair(loadingDrawable, obj));
            this.mLoadingCount++;
            invalidate(obj, true);
        }

        public final void clear() {
            clear(true);
        }

        public final boolean draw(Canvas canvas) {
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

        public final void invalidate(Object obj, boolean z) {
            View view;
            View view2;
            if (obj instanceof View) {
                ((View) obj).invalidate();
            } else if (obj instanceof ArticleViewer.DrawingText) {
                ArticleViewer.DrawingText drawingText = (ArticleViewer.DrawingText) obj;
                if (!drawingText.isDrawing && (view2 = drawingText.latestParentView) != null) {
                    view2.invalidate();
                }
            } else if (z && (view = this.mParent) != null) {
                view.invalidate();
            }
            ChatMessageCell$$ExternalSyntheticLambda7 chatMessageCell$$ExternalSyntheticLambda7 = this.additionalInvalidate;
            if (chatMessageCell$$ExternalSyntheticLambda7 != null) {
                chatMessageCell$$ExternalSyntheticLambda7.run();
            }
        }

        public final void removeLink(LinkSpanDrawable linkSpanDrawable, boolean z) {
            ArrayList arrayList;
            Pair pair;
            if (linkSpanDrawable == null) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = this.mLinksCount;
                arrayList = this.mLinks;
                if (i >= i2) {
                    pair = null;
                    break;
                } else {
                    if (((Pair) arrayList.get(i)).first == linkSpanDrawable) {
                        pair = (Pair) arrayList.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (pair == null) {
                return;
            }
            if (z) {
                if (linkSpanDrawable.mReleaseStart < 0) {
                    linkSpanDrawable.mReleaseStart = Math.max(linkSpanDrawable.mStart + linkSpanDrawable.mDuration, SystemClock.elapsedRealtime());
                    invalidate(pair.second, true);
                    AndroidUtilities.runOnUIThread(new LinkSpanDrawable$LinkCollector$$ExternalSyntheticLambda1(this, linkSpanDrawable, 1), Math.max(0L, (linkSpanDrawable.mReleaseStart - SystemClock.elapsedRealtime()) + 175));
                    return;
                }
                return;
            }
            arrayList.remove(pair);
            ArrayList arrayList2 = linkSpanDrawable.mPathes;
            if (!arrayList2.isEmpty()) {
                LinkSpanDrawable.pathCache.addAll(arrayList2);
                arrayList2.clear();
                linkSpanDrawable.mPathesCount = 0;
            }
            this.mLinksCount = arrayList.size();
            invalidate(pair.second, true);
        }

        public final void removeLoading(LoadingDrawable loadingDrawable, boolean z) {
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

        public final void removeLoadingAt(int i, boolean z) {
            if (i < 0 || i >= this.mLoadingCount) {
                return;
            }
            ArrayList arrayList = this.mLoading;
            Pair pair = (Pair) arrayList.get(i);
            if (pair == null) {
                return;
            }
            LoadingDrawable loadingDrawable = (LoadingDrawable) pair.first;
            if (!z) {
                arrayList.remove(pair);
                loadingDrawable.start = -1L;
                loadingDrawable.disappearStart = -1L;
                this.mLoadingCount = arrayList.size();
                invalidate(pair.second, true);
                return;
            }
            if (loadingDrawable.isDisappeared()) {
                removeLoading(loadingDrawable, false);
                return;
            }
            if (!loadingDrawable.isDisappearing()) {
                loadingDrawable.disappear();
            }
            AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda2(8, this, loadingDrawable), loadingDrawable.disappearStart > 0 ? 320 - (SystemClock.elapsedRealtime() - loadingDrawable.disappearStart) : 0L);
        }

        public final void clear(boolean z) {
            if (z) {
                for (int i = 0; i < this.mLinksCount; i++) {
                    removeLink(i);
                }
                return;
            }
            if (this.mLinksCount <= 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                int i3 = this.mLinksCount;
                ArrayList arrayList = this.mLinks;
                if (i2 >= i3) {
                    arrayList.clear();
                    this.mLinksCount = 0;
                    invalidate(null, true);
                    return;
                }
                LinkSpanDrawable linkSpanDrawable = (LinkSpanDrawable) ((Pair) arrayList.get(i2)).first;
                if (!linkSpanDrawable.mPathes.isEmpty()) {
                    ArrayList arrayList2 = LinkSpanDrawable.pathCache;
                    ArrayList arrayList3 = linkSpanDrawable.mPathes;
                    arrayList2.addAll(arrayList3);
                    arrayList3.clear();
                    linkSpanDrawable.mPathesCount = 0;
                }
                invalidate(((Pair) arrayList.get(i2)).second, false);
                i2++;
            }
        }

        public final boolean draw(Canvas canvas, Object obj) {
            boolean z = false;
            for (int i = 0; i < this.mLoadingCount; i++) {
                ArrayList arrayList = this.mLoading;
                if (((Pair) arrayList.get(i)).second == obj) {
                    ((LoadingDrawable) ((Pair) arrayList.get(i)).first).draw(canvas);
                    z = true;
                }
            }
            for (int i2 = 0; i2 < this.mLinksCount; i2++) {
                ArrayList arrayList2 = this.mLinks;
                if (((Pair) arrayList2.get(i2)).second == obj) {
                    z = ((LinkSpanDrawable) ((Pair) arrayList2.get(i2)).first).draw(canvas) || z;
                }
            }
            invalidate(obj, false);
            return z;
        }

        public LinkCollector(View view) {
            this.mParent = view;
        }

        public final void removeLink(int i) {
            if (i < 0 || i >= this.mLinksCount) {
                return;
            }
            Pair pair = (Pair) this.mLinks.get(i);
            LinkSpanDrawable linkSpanDrawable = (LinkSpanDrawable) pair.first;
            if (linkSpanDrawable.mReleaseStart < 0) {
                linkSpanDrawable.mReleaseStart = Math.max(linkSpanDrawable.mStart + linkSpanDrawable.mDuration, SystemClock.elapsedRealtime());
                invalidate(pair.second, true);
                AndroidUtilities.runOnUIThread(new LinkSpanDrawable$LinkCollector$$ExternalSyntheticLambda1(this, linkSpanDrawable, 0), Math.max(0L, (linkSpanDrawable.mReleaseStart - SystemClock.elapsedRealtime()) + 175));
            }
        }
    }

    public final class LinksSimpleTextView extends SimpleTextView {
        public final LinkCollector links;
        public LinkSpanDrawable pressedLink;
        public final Theme.ResourcesProvider resourcesProvider;

        public LinksSimpleTextView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.links = new LinkCollector(this);
            this.resourcesProvider = resourcesProvider;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.save();
            canvas.translate(getLayoutX(), getLayoutY());
            if (this.links.draw(canvas)) {
                invalidate();
            }
            canvas.restore();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            ClickableSpan clickableSpan;
            CharacterStyle characterStyle;
            LinkCollector linkCollector = this.links;
            if (linkCollector != null) {
                Layout layout = getLayout();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                Layout layout2 = getLayout();
                if (layout2 == null) {
                    clickableSpan = null;
                } else {
                    int layoutX = (int) (x - getLayoutX());
                    int layoutY = (int) (y - getLayoutY());
                    int lineForVertical = layout2.getLineForVertical(layoutY);
                    float f = layoutX;
                    int offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f);
                    float lineLeft = layout2.getLineLeft(lineForVertical);
                    if (lineLeft > f || layout2.getLineWidth(lineForVertical) + lineLeft < f || layoutY < 0 || layoutY > layout2.getHeight()) {
                        clickableSpan = null;
                    } else {
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout2.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length == 0 || AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            clickableSpan = null;
                        } else {
                            clickableSpan = clickableSpanArr[0];
                        }
                    }
                }
                if (clickableSpan != null && motionEvent.getAction() == 0) {
                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpan, this.resourcesProvider, motionEvent.getX(), motionEvent.getY());
                    this.pressedLink = linkSpanDrawable;
                    linkCollector.addLink(linkSpanDrawable, null);
                    SpannableString spannableString = new SpannableString(layout.getText());
                    int spanStart = spannableString.getSpanStart(this.pressedLink.mSpan);
                    int spanEnd = spannableString.getSpanEnd(this.pressedLink.mSpan);
                    LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                    linkPathObtainNewPath.setCurrentLayout(layout, spanStart, 0.0f, 0.0f);
                    layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    linkCollector.clear(true);
                    LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                    if (linkSpanDrawable2 != null && (characterStyle = linkSpanDrawable2.mSpan) == clickableSpan) {
                        if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        this.pressedLink = null;
                        return true;
                    }
                    this.pressedLink = null;
                }
                if (motionEvent.getAction() == 3) {
                    linkCollector.clear(true);
                    this.pressedLink = null;
                }
            }
            return this.pressedLink != null || super.onTouchEvent(motionEvent);
        }
    }

    public class LinksTextView extends TextView {
        public static Class editorClass;
        public static Field mEditor;
        public static Method mEditorInvalidateDisplayList;
        public CharacterStyle currentLinkLoading;
        public boolean disablePaddingsOffset;
        public boolean disablePaddingsOffsetX;
        public boolean disablePaddingsOffsetY;
        public Object editor;
        public PorterDuffColorFilter emojiColorFilter;
        public int emojiColorFilterColor;
        public boolean emojiColorIsLink;
        public final boolean isCustomLinkCollector;
        public final LinkCollector links;
        public boolean loggedError;
        public int maxWidth;
        public OnLinkPress onLongPressListener;
        public OnLinkPress onPressListener;
        public LinkSpanDrawable pressedLink;
        public final Theme.ResourcesProvider resourcesProvider;
        public AnimatedEmojiSpan.EmojiGroupedSpans stack;
        public boolean triedGetInvalidate;

        public interface OnLinkPress {
            void run(ClickableSpan clickableSpan);
        }

        public LinksTextView(Context context) {
            this(context, null);
        }

        public int emojiCacheType() {
            return 0;
        }

        public int getTextPaddingTop() {
            int paddingTop = getPaddingTop();
            return (getGravity() != 17 || getLayout() == null) ? paddingTop : Math.max(0, (((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2) + paddingTop;
        }

        public final ClickableSpan hit(int i, int i2) {
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
            if (lineLeft <= f && layout.getLineWidth(lineForVertical) + lineLeft >= f && textPaddingTop >= 0 && textPaddingTop <= layout.getHeight()) {
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                    return clickableSpanArr[0];
                }
            }
            return null;
        }

        @Override
        public final void invalidate() {
            if (!this.triedGetInvalidate) {
                this.triedGetInvalidate = true;
                try {
                    if (editorClass == null) {
                        Field declaredField = TextView.class.getDeclaredField("mEditor");
                        mEditor = declaredField;
                        declaredField.setAccessible(true);
                        Class<?> cls = Class.forName("android.widget.Editor");
                        editorClass = cls;
                        try {
                            Method declaredMethod = cls.getDeclaredMethod("invalidateTextDisplayList", null);
                            mEditorInvalidateDisplayList = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            super.invalidate();
            if (isHardwareAccelerated()) {
                try {
                    if (mEditorInvalidateDisplayList != null) {
                        if (this.editor == null) {
                            this.editor = mEditor.get(this);
                        }
                        Object obj = this.editor;
                        if (obj != null) {
                            mEditorInvalidateDisplayList.invoke(obj, null);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.stack = AnimatedEmojiSpan.update(emojiCacheType(), this, this.stack, getLayout());
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiSpan.release(this, this.stack);
        }

        @Override
        public void onDraw(Canvas canvas) {
            Canvas canvas2;
            boolean z;
            float height;
            boolean z2 = false;
            if (!this.isCustomLinkCollector) {
                canvas.save();
                if (!this.disablePaddingsOffset) {
                    canvas.translate(this.disablePaddingsOffsetX ? 0.0f : getPaddingLeft(), this.disablePaddingsOffsetY ? 0.0f : getTextPaddingTop());
                }
                LinkCollector linkCollector = this.links;
                if (linkCollector != null && linkCollector.draw(canvas)) {
                    invalidate();
                }
                canvas.restore();
            }
            super.onDraw(canvas);
            try {
                Layout layout = getLayout();
                if ((getGravity() & 16) == 0 || layout == null) {
                    height = 0.0f;
                } else {
                    height = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - layout.getHeight()) / 2.0f) + getPaddingTop();
                }
                if (height == 0.0f && getPaddingLeft() == 0) {
                    z = false;
                } else {
                    canvas.save();
                    try {
                        canvas.translate(getPaddingLeft(), height);
                        z = true;
                    } catch (Exception e) {
                        e = e;
                        canvas2 = canvas;
                        z2 = true;
                        if (!this.loggedError) {
                            FileLog.e((Throwable) e, true);
                        }
                        this.loggedError = true;
                        z = z2;
                        if (z) {
                            canvas2.restore();
                        }
                    }
                }
                try {
                    int iEmojiCacheType = emojiCacheType();
                    AnimatedEmojiSpan.EmojiGroupedSpans emojiGroupedSpans = this.stack;
                    try {
                        Layout[] layoutArr = new Layout[1];
                        try {
                            layoutArr[0] = getLayout();
                            this.stack = AnimatedEmojiSpan.update(iEmojiCacheType, this, emojiGroupedSpans, layoutArr);
                            if (this.emojiColorIsLink && (this.emojiColorFilter == null || this.emojiColorFilterColor != getPaint().linkColor)) {
                                int i = getPaint().linkColor;
                                this.emojiColorFilterColor = i;
                                this.emojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                            }
                            canvas2 = canvas;
                            try {
                                AnimatedEmojiSpan.drawAnimatedEmojis(canvas2, layout, this.stack, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.emojiColorFilter);
                            } catch (Exception e2) {
                                e = e2;
                                z2 = z;
                                if (!this.loggedError) {
                                    FileLog.e((Throwable) e, true);
                                }
                                this.loggedError = true;
                                z = z2;
                            }
                        } catch (Exception e3) {
                            canvas2 = canvas;
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        canvas2 = canvas;
                    }
                } catch (Exception e5) {
                    e = e5;
                    canvas2 = canvas;
                }
            } catch (Exception e6) {
                e = e6;
                canvas2 = canvas;
            }
            if (z) {
                canvas2.restore();
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3 = this.maxWidth;
            if (i3 > 0) {
                i = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i)), View.MeasureSpec.getMode(i));
            }
            super.onMeasure(i, i2);
            this.stack = AnimatedEmojiSpan.update(emojiCacheType(), this, this.stack, getLayout());
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            CharacterStyle characterStyle;
            LinkCollector linkCollector = this.links;
            if (linkCollector != null) {
                Layout layout = getLayout();
                ClickableSpan clickableSpanHit = hit((int) motionEvent.getX(), (int) motionEvent.getY());
                if (clickableSpanHit != null && motionEvent.getAction() == 0) {
                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanHit, this.resourcesProvider, motionEvent.getX(), motionEvent.getY());
                    linkSpanDrawable.setColor(overrideColor());
                    this.pressedLink = linkSpanDrawable;
                    linkCollector.addLink(linkSpanDrawable, null);
                    SpannableString spannableString = new SpannableString(layout.getText());
                    int spanStart = spannableString.getSpanStart(this.pressedLink.mSpan);
                    int spanEnd = spannableString.getSpanEnd(this.pressedLink.mSpan);
                    LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                    linkPathObtainNewPath.setCurrentLayout(layout, spanStart, 0.0f, getPaddingTop());
                    layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                    AndroidUtilities.runOnUIThread(new FilterGLThread$$ExternalSyntheticLambda1(this, linkSpanDrawable, clickableSpanHit, 15), ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    linkCollector.clear(true);
                    LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                    if (linkSpanDrawable2 != null && (characterStyle = linkSpanDrawable2.mSpan) == clickableSpanHit) {
                        OnLinkPress onLinkPress = this.onPressListener;
                        if (onLinkPress != null) {
                            onLinkPress.run((ClickableSpan) characterStyle);
                        } else if (characterStyle != null) {
                            ((ClickableSpan) characterStyle).onClick(this);
                        }
                        this.pressedLink = null;
                        return true;
                    }
                    this.pressedLink = null;
                }
                if (motionEvent.getAction() == 3) {
                    linkCollector.clear(true);
                    this.pressedLink = null;
                }
            }
            return this.pressedLink != null || super.onTouchEvent(motionEvent);
        }

        public int overrideColor() {
            return Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider);
        }

        public int processColor(int i) {
            return i;
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

        public void setEmojiColor(int i) {
            this.emojiColorIsLink = false;
            this.emojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            invalidate();
        }

        public void setLoading(CharacterStyle characterStyle) {
            LinkCollector linkCollector;
            if (this.currentLinkLoading != characterStyle) {
                int i = 0;
                while (true) {
                    linkCollector = this.links;
                    if (i >= linkCollector.mLoadingCount) {
                        break;
                    }
                    linkCollector.removeLoadingAt(i, true);
                    i++;
                }
                this.currentLinkLoading = characterStyle;
                LoadingDrawable loadingDrawableMakeLoading = LinkCollector.makeLoading(getLayout(), characterStyle, getPaddingTop());
                if (loadingDrawableMakeLoading != null) {
                    int iProcessColor = processColor(Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider));
                    loadingDrawableMakeLoading.setColors(Theme.multAlpha(0.8f, iProcessColor), Theme.multAlpha(1.3f, iProcessColor), Theme.multAlpha(1.0f, iProcessColor), Theme.multAlpha(4.0f, iProcessColor));
                    loadingDrawableMakeLoading.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    linkCollector.addLoading(loadingDrawableMakeLoading, null);
                }
            }
        }

        @Override
        public void setMaxWidth(int i) {
            this.maxWidth = i;
        }

        public void setOnLinkLongPressListener(OnLinkPress onLinkPress) {
            this.onLongPressListener = onLinkPress;
        }

        public void setOnLinkPressListener(OnLinkPress onLinkPress) {
            this.onPressListener = onLinkPress;
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            this.stack = AnimatedEmojiSpan.update(emojiCacheType(), this, this.stack, getLayout());
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
    }

    public LinkSpanDrawable(CharacterStyle characterStyle, Theme.ResourcesProvider resourcesProvider, float f, float f2) {
        this.mSpan = characterStyle;
        setColor(Theme.getColor(Theme.key_chat_linkSelectBackground, resourcesProvider));
        this.mTouchX = f;
        this.mTouchY = f2;
        this.mDuration = (long) Math.min(ViewConfiguration.getTapTimeout() * 1.8f, ViewConfiguration.getLongPressTimeout() * 0.8f);
    }

    public final boolean draw(Canvas canvas) {
        boolean z;
        boolean z2;
        boolean z3 = this.isLite;
        int iDp = z3 ? 0 : AndroidUtilities.dp(4.0f);
        boolean z4 = this.cornerRadius != iDp;
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
        if (z4) {
            this.cornerRadius = iDp;
            if (iDp <= 0) {
                this.mSelectionPaint.setPathEffect(null);
                this.mRipplePaint.setPathEffect(null);
            } else {
                this.mSelectionPaint.setPathEffect(new CornerPathEffect(this.cornerRadius));
                this.mRipplePaint.setPathEffect(new CornerPathEffect(this.cornerRadius));
            }
        }
        Rect rect = this.mBounds;
        float f = this.mTouchY;
        float f2 = this.mTouchX;
        ArrayList arrayList = this.mPathes;
        if (rect != null || this.mPathesCount <= 0) {
            z = false;
            z2 = true;
        } else {
            LinkPath linkPath = (LinkPath) arrayList.get(0);
            RectF rectF = AndroidUtilities.rectTmp;
            linkPath.computeBounds(rectF, false);
            this.mBounds = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            for (int i = 1; i < this.mPathesCount; i++) {
                LinkPath linkPath2 = (LinkPath) arrayList.get(i);
                RectF rectF2 = AndroidUtilities.rectTmp;
                linkPath2.computeBounds(rectF2, false);
                Rect rect2 = this.mBounds;
                rect2.left = Math.min(rect2.left, (int) rectF2.left);
                Rect rect3 = this.mBounds;
                rect3.top = Math.min(rect3.top, (int) rectF2.top);
                Rect rect4 = this.mBounds;
                rect4.right = Math.max(rect4.right, (int) rectF2.right);
                Rect rect5 = this.mBounds;
                rect5.bottom = Math.max(rect5.bottom, (int) rectF2.bottom);
            }
            z = false;
            z2 = true;
            this.mMaxRadius = (float) Math.sqrt(Math.max(Math.max(Math.pow(this.mBounds.top - f, 2.0d) + Math.pow(this.mBounds.left - f2, 2.0d), Math.pow(this.mBounds.top - f, 2.0d) + Math.pow(this.mBounds.right - f2, 2.0d)), Math.max(Math.pow(this.mBounds.bottom - f, 2.0d) + Math.pow(this.mBounds.left - f2, 2.0d), Math.pow(this.mBounds.bottom - f, 2.0d) + Math.pow(this.mBounds.right - f2, 2.0d))));
        }
        if (z3) {
            for (int i2 = 0; i2 < this.mPathesCount; i2++) {
                canvas.drawPath((Path) arrayList.get(i2), this.mRipplePaint);
            }
            return z;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.mStart < 0) {
            this.mStart = jElapsedRealtime;
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(Math.min(1.0f, (jElapsedRealtime - this.mStart) / this.mDuration));
        long j = this.mReleaseStart;
        float fMin = 1.0f - (j < 0 ? 0.0f : Math.min(1.0f, Math.max(0.0f, ((jElapsedRealtime - 75) - j) / 100.0f)));
        this.mSelectionPaint.setAlpha((int) (Math.min(1.0f, interpolation * 5.0f) * this.mSelectionAlpha * 0.2f * fMin));
        this.mSelectionPaint.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
        for (int i3 = 0; i3 < this.mPathesCount; i3++) {
            ((LinkPath) arrayList.get(i3)).closeRects();
            canvas.drawPath((Path) arrayList.get(i3), this.mSelectionPaint);
        }
        this.mRipplePaint.setAlpha((int) (this.mRippleAlpha * 0.8f * fMin));
        this.mRipplePaint.setStrokeWidth(Math.min(1.0f, 0.0f) * AndroidUtilities.dp(5.0f));
        if (interpolation < 1.0f) {
            float f3 = interpolation * this.mMaxRadius;
            canvas.save();
            Path path = this.circlePath;
            path.reset();
            path.addCircle(f2, f, f3, Path.Direction.CW);
            canvas.clipPath(path);
            for (int i4 = 0; i4 < this.mPathesCount; i4++) {
                canvas.drawPath((Path) arrayList.get(i4), this.mRipplePaint);
            }
            canvas.restore();
        } else {
            for (int i5 = 0; i5 < this.mPathesCount; i5++) {
                canvas.drawPath((Path) arrayList.get(i5), this.mRipplePaint);
            }
        }
        return (interpolation < 1.0f || this.mReleaseStart >= 0) ? z2 : z;
    }

    public final LinkPath obtainNewPath() {
        ArrayList arrayList = pathCache;
        LinkPath linkPath = !arrayList.isEmpty() ? (LinkPath) arrayList.remove(0) : new LinkPath(0);
        linkPath.useCornerPathImplementation = !this.isLite;
        linkPath.reset();
        ArrayList arrayList2 = this.mPathes;
        arrayList2.add(linkPath);
        this.mPathesCount = arrayList2.size();
        return linkPath;
    }

    public final void setColor(int i) {
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
}

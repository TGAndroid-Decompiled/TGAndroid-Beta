package org.telegram.ui.Components.spoilers;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda25;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda66;

public class SpoilersTextView extends TextView implements TextSelectionHelper.SimpleSelectabeleView {
    private static Class editorClass;
    private static Field mEditor;
    private static Method mEditorInvalidateDisplayList;
    public boolean allowClickSpoilers;
    private AnimatedEmojiSpan.EmojiGroupedSpans animatedEmoji;
    private ColorFilter animatedEmojiColorFilter;
    public int cacheType;
    private boolean clearLinkOnLongPress;
    private SpoilersClickDetector clickDetector;
    private CharacterStyle currentLinkLoading;
    protected boolean disablePaddingInLinks;
    private boolean disablePaddingsOffset;
    private boolean disablePaddingsOffsetX;
    private boolean disablePaddingsOffsetY;
    private Object editor;
    private boolean isSpoilersRevealed;
    private Layout lastLayout;
    private int lastTextLength;
    private final LinkSpanDrawable.LinkCollector links;
    protected LinkSpanDrawable.LinksTextView.OnLinkPress onLongPressListener;
    protected LinkSpanDrawable.LinksTextView.OnLinkPress onPressListener;
    private Path path;
    private LinkSpanDrawable<ClickableSpan> pressedLink;
    private Theme.ResourcesProvider resourcesProvider;
    protected List<SpoilerEffect> spoilers;
    private Stack<SpoilerEffect> spoilersPool;
    private boolean triedGetInvalidate;
    private boolean useAlphaForEmoji;

    public SpoilersTextView(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack<>();
        this.path = new Path();
        this.allowClickSpoilers = true;
        this.cacheType = 0;
        this.useAlphaForEmoji = true;
        this.clearLinkOnLongPress = true;
        this.disablePaddingInLinks = true;
        this.lastLayout = null;
        this.links = new LinkSpanDrawable.LinkCollector(this);
        this.resourcesProvider = resourcesProvider;
        this.clickDetector = new SpoilersClickDetector(this, this.spoilers, new ChatMessageCell$$ExternalSyntheticLambda25(this, z));
    }

    public void clearLinks() {
        this.links.clear();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.links != null) {
            Layout layout = getLayout();
            ClickableSpan clickableSpanHit = hit((int) motionEvent.getX(), (int) motionEvent.getY());
            if (clickableSpanHit != null && motionEvent.getAction() == 0) {
                LinkSpanDrawable<ClickableSpan> linkSpanDrawable = new LinkSpanDrawable<>(clickableSpanHit, this.resourcesProvider, motionEvent.getX(), motionEvent.getY());
                linkSpanDrawable.setColor(overrideLinkColor());
                this.pressedLink = linkSpanDrawable;
                this.links.addLink(linkSpanDrawable);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.pressedLink.getSpan());
                int spanEnd = spannableString.getSpanEnd(this.pressedLink.getSpan());
                LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                linkPathObtainNewPath.setCurrentLayout(layout, spanStart, this.disablePaddingInLinks ? 0.0f : getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                AndroidUtilities.runOnUIThread(new StarGiftSheet$$ExternalSyntheticLambda66(this, linkSpanDrawable, clickableSpanHit, 8), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                this.links.clear();
                LinkSpanDrawable<ClickableSpan> linkSpanDrawable2 = this.pressedLink;
                if (linkSpanDrawable2 != null && linkSpanDrawable2.getSpan() == clickableSpanHit) {
                    LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = this.onPressListener;
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
        if (this.pressedLink == null && !(this.allowClickSpoilers && this.clickDetector.gestureDetector.mDetector.onTouchEvent(motionEvent))) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public Layout getStaticTextLayout() {
        return getLayout();
    }

    public ClickableSpan hit(int i, int i2) {
        Layout layout = getLayout();
        if (layout == null) {
            return null;
        }
        int paddingLeft = i - getPaddingLeft();
        int paddingTop = i2 - getPaddingTop();
        int lineForVertical = layout.getLineForVertical(paddingTop);
        float f = paddingLeft;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        float lineLeft = layout.getLineLeft(lineForVertical);
        if (lineLeft <= f && layout.getLineWidth(lineForVertical) + lineLeft >= f && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override
    public void invalidate() {
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

    public final void invalidateSpoilers() {
        List<SpoilerEffect> list = this.spoilers;
        if (list == null) {
            return;
        }
        this.spoilersPool.addAll(list);
        this.spoilers.clear();
        if (this.isSpoilersRevealed) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            Stack<SpoilerEffect> stack = this.spoilersPool;
            List<SpoilerEffect> list2 = this.spoilers;
            int i = SpoilerEffect.MAX_PARTICLES_PER_ENTITY;
            int measuredWidth = getMeasuredWidth();
            SpoilerEffect.addSpoilers(this, getLayout(), 0, measuredWidth > 0 ? measuredWidth : -2, (Spanned) getText(), stack, list2, null);
        }
        invalidate();
    }

    public final void lambda$dispatchTouchEvent$3(LinkSpanDrawable linkSpanDrawable, ClickableSpan clickableSpan) {
        LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = this.onLongPressListener;
        if (onLinkPress == null || this.pressedLink != linkSpanDrawable) {
            return;
        }
        onLinkPress.run(clickableSpan);
        this.pressedLink = null;
        this.links.clear();
    }

    public final void lambda$new$0$18() {
        this.isSpoilersRevealed = true;
        invalidateSpoilers();
    }

    public final void lambda$new$1$10() {
        post(new SpoilersTextView$$ExternalSyntheticLambda0(this, 1));
    }

    public final void lambda$new$2(boolean z, SpoilerEffect spoilerEffect, float f, float f2) {
        if (this.isSpoilersRevealed || !z) {
            return;
        }
        spoilerEffect.onRippleEndCallback = new SpoilersTextView$$ExternalSyntheticLambda0(this, 0);
        float fSqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        Iterator<SpoilerEffect> it = this.spoilers.iterator();
        while (it.hasNext()) {
            it.next().startRipple(f, f2, fSqrt, false);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAnimatedEmoji(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        canvas.save();
        if (!this.disablePaddingsOffset) {
            canvas.translate(this.disablePaddingsOffsetX ? 0.0f : paddingLeft, this.disablePaddingsOffsetY ? 0.0f : paddingTop);
        }
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null && linkCollector.draw(canvas)) {
            invalidate();
        }
        canvas.restore();
        if (this.spoilers.isEmpty()) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            this.path.rewind();
            Iterator<SpoilerEffect> it = this.spoilers.iterator();
            while (it.hasNext()) {
                Rect bounds = it.next().getBounds();
                this.path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
            Emoji.emojiDrawingUseAlpha = this.useAlphaForEmoji;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            SpoilerEffect spoilerEffect = this.spoilers.get(0);
            if (spoilerEffect.rippleMaxRadius > 0.0f && spoilerEffect.rippleProgress > 0.0f) {
                canvas.save();
                canvas.clipPath(this.path);
                this.path.rewind();
                this.spoilers.get(0).getRipplePath(this.path);
                canvas.clipPath(this.path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        updateAnimatedEmoji(false);
        if (this.animatedEmoji != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, getLayout(), this.animatedEmoji, 0.0f, this.spoilers, 0.0f, getHeight(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas.restore();
        }
        if (this.spoilers.isEmpty()) {
            return;
        }
        boolean z = this.spoilers.get(0).rippleProgress != -1.0f;
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
        } else {
            canvas.save();
        }
        canvas.translate(paddingLeft, AndroidUtilities.dp(2.0f) + paddingTop);
        for (SpoilerEffect spoilerEffect2 : this.spoilers) {
            spoilerEffect2.setColor(getPaint().getColor());
            spoilerEffect2.draw(canvas);
        }
        if (z) {
            this.path.rewind();
            this.spoilers.get(0).getRipplePath(this.path);
            canvas.drawPath(this.path, Theme.PAINT_CLEAR);
        }
        canvas.restore();
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateSpoilers();
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateSpoilers();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        invalidateSpoilers();
        updateAnimatedEmoji(true);
    }

    public int overrideLinkColor() {
        return Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider);
    }

    public void setClearLinkOnLongPress(boolean z) {
        this.clearLinkOnLongPress = z;
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

    public void setLoading(CharacterStyle characterStyle) {
        if (this.currentLinkLoading != characterStyle) {
            this.links.clearLoading(true);
            this.currentLinkLoading = characterStyle;
            LoadingDrawable loadingDrawableMakeLoading = LinkSpanDrawable.LinkCollector.makeLoading(getLayout(), characterStyle, getPaddingTop());
            if (loadingDrawableMakeLoading != null) {
                int color = Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider);
                loadingDrawableMakeLoading.setColors(Theme.multAlpha(0.8f, color), Theme.multAlpha(1.3f, color), Theme.multAlpha(1.0f, color), Theme.multAlpha(4.0f, color));
                loadingDrawableMakeLoading.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                this.links.addLoading(loadingDrawableMakeLoading);
            }
        }
    }

    public void setOnLinkLongPressListener(LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress) {
        this.onLongPressListener = onLinkPress;
    }

    public void setOnLinkPressListener(LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress) {
        this.onPressListener = onLinkPress;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.isSpoilersRevealed = false;
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setUseAlphaForEmoji(boolean z) {
        this.useAlphaForEmoji = z;
    }

    public void updateAnimatedEmoji(boolean z) {
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (!z && this.lastLayout == getLayout() && this.lastTextLength == length) {
            return;
        }
        this.animatedEmoji = AnimatedEmojiSpan.update(this.cacheType, this, this.animatedEmoji, getLayout());
        this.lastLayout = getLayout();
        this.lastTextLength = length;
    }
}

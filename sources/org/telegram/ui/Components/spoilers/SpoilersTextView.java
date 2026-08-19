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
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;

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
    private LinkSpanDrawable pressedLink;
    private Theme.ResourcesProvider resourcesProvider;
    protected List spoilers;
    private Stack spoilersPool;
    private boolean triedGetInvalidate;
    private boolean useAlphaForEmoji;

    public SpoilersTextView(Context context) {
        this(context, (Theme.ResourcesProvider) null);
    }

    public SpoilersTextView(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, true, resourcesProvider);
    }

    public SpoilersTextView(Context context, boolean z) {
        this(context, z, null);
    }

    public void setClearLinkOnLongPress(boolean z) {
        this.clearLinkOnLongPress = z;
    }

    public void clearLinks() {
        this.links.clear();
    }

    public SpoilersTextView(Context context, final boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.spoilers = new ArrayList();
        this.spoilersPool = new Stack();
        this.path = new Path();
        this.allowClickSpoilers = true;
        this.cacheType = 0;
        this.useAlphaForEmoji = true;
        this.clearLinkOnLongPress = true;
        this.disablePaddingInLinks = true;
        this.lastLayout = null;
        this.links = new LinkSpanDrawable.LinkCollector(this);
        this.resourcesProvider = resourcesProvider;
        this.clickDetector = new SpoilersClickDetector(this, this.spoilers, new SpoilersClickDetector.OnSpoilerClickedListener() {
            @Override
            public final void onSpoilerClicked(SpoilerEffect spoilerEffect, float f, float f2) {
                SpoilersTextView.$r8$lambda$72CtBnIzp_PVVNlwN_tlhPC9zjM(this.f$0, z, spoilerEffect, f, f2);
            }
        });
    }

    public static void $r8$lambda$72CtBnIzp_PVVNlwN_tlhPC9zjM(final SpoilersTextView spoilersTextView, boolean z, SpoilerEffect spoilerEffect, float f, float f2) {
        if (spoilersTextView.isSpoilersRevealed || !z) {
            return;
        }
        spoilerEffect.setOnRippleEndCallback(new Runnable() {
            @Override
            public final void run() {
                SpoilersTextView.$r8$lambda$CdeZ2FFq2oJpD16Kbv_Kk7Oo5v8(this.f$0);
            }
        });
        float fSqrt = (float) Math.sqrt(Math.pow(spoilersTextView.getWidth(), 2.0d) + Math.pow(spoilersTextView.getHeight(), 2.0d));
        Iterator it = spoilersTextView.spoilers.iterator();
        while (it.hasNext()) {
            ((SpoilerEffect) it.next()).startRipple(f, f2, fSqrt);
        }
    }

    public static void $r8$lambda$CdeZ2FFq2oJpD16Kbv_Kk7Oo5v8(final SpoilersTextView spoilersTextView) {
        spoilersTextView.getClass();
        spoilersTextView.post(new Runnable() {
            @Override
            public final void run() {
                SpoilersTextView.$r8$lambda$eSUj1oM8nCmrR4AeTELm6d34Aqg(this.f$0);
            }
        });
    }

    public static void $r8$lambda$eSUj1oM8nCmrR4AeTELm6d34Aqg(SpoilersTextView spoilersTextView) {
        spoilersTextView.isSpoilersRevealed = true;
        spoilersTextView.invalidateSpoilers();
    }

    public void setLoading(CharacterStyle characterStyle) {
        if (this.currentLinkLoading != characterStyle) {
            this.links.clearLoading(true);
            this.currentLinkLoading = characterStyle;
            LoadingDrawable loadingDrawableMakeLoading = LinkSpanDrawable.LinkCollector.makeLoading(getLayout(), characterStyle, getPaddingTop());
            if (loadingDrawableMakeLoading != null) {
                int color = Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider);
                loadingDrawableMakeLoading.setColors(Theme.multAlpha(color, 0.8f), Theme.multAlpha(color, 1.3f), Theme.multAlpha(color, 1.0f), Theme.multAlpha(color, 4.0f));
                loadingDrawableMakeLoading.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                this.links.addLoading(loadingDrawableMakeLoading);
            }
        }
    }

    public void setOnLinkPressListener(LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress) {
        this.onPressListener = onLinkPress;
    }

    public void setOnLinkLongPressListener(LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress) {
        this.onLongPressListener = onLinkPress;
    }

    public int overrideLinkColor() {
        return Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.links != null) {
            Layout layout = getLayout();
            final ClickableSpan clickableSpanHit = hit((int) motionEvent.getX(), (int) motionEvent.getY());
            if (clickableSpanHit != null && motionEvent.getAction() == 0) {
                final LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanHit, this.resourcesProvider, motionEvent.getX(), motionEvent.getY());
                linkSpanDrawable.setColor(overrideLinkColor());
                this.pressedLink = linkSpanDrawable;
                this.links.addLink(linkSpanDrawable);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.pressedLink.getSpan());
                int spanEnd = spannableString.getSpanEnd(this.pressedLink.getSpan());
                LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                linkPathObtainNewPath.setCurrentLayout(layout, spanStart, this.disablePaddingInLinks ? 0.0f : getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SpoilersTextView.m2967$r8$lambda$NPeLUXgdxoyt4INz4etcRGmgxA(this.f$0, linkSpanDrawable, clickableSpanHit);
                    }
                }, ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                this.links.clear();
                LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
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
        if (this.pressedLink != null) {
            return true;
        }
        if (this.allowClickSpoilers && this.clickDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public static void m2967$r8$lambda$NPeLUXgdxoyt4INz4etcRGmgxA(SpoilersTextView spoilersTextView, LinkSpanDrawable linkSpanDrawable, ClickableSpan clickableSpan) {
        LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = spoilersTextView.onLongPressListener;
        if (onLinkPress == null || spoilersTextView.pressedLink != linkSpanDrawable) {
            return;
        }
        onLinkPress.run(clickableSpan);
        spoilersTextView.pressedLink = null;
        spoilersTextView.links.clear();
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.isSpoilersRevealed = false;
        super.setText(charSequence, bufferType);
    }

    public void setUseAlphaForEmoji(boolean z) {
        this.useAlphaForEmoji = z;
    }

    @Override
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        invalidateSpoilers();
        updateAnimatedEmoji(true);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateSpoilers();
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.animatedEmojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
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

    @Override
    protected void onDraw(Canvas canvas) {
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
            Iterator it = this.spoilers.iterator();
            while (it.hasNext()) {
                Rect bounds = ((SpoilerEffect) it.next()).getBounds();
                this.path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(this.path, Region.Op.DIFFERENCE);
            Emoji.emojiDrawingUseAlpha = this.useAlphaForEmoji;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            if (((SpoilerEffect) this.spoilers.get(0)).hasRipplePath()) {
                canvas.save();
                canvas.clipPath(this.path);
                this.path.rewind();
                ((SpoilerEffect) this.spoilers.get(0)).getRipplePath(this.path);
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
        boolean z = ((SpoilerEffect) this.spoilers.get(0)).getRippleProgress() != -1.0f;
        if (z) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
        } else {
            canvas.save();
        }
        canvas.translate(paddingLeft, paddingTop + AndroidUtilities.dp(2.0f));
        for (SpoilerEffect spoilerEffect : this.spoilers) {
            spoilerEffect.setColor(getPaint().getColor());
            spoilerEffect.draw(canvas);
        }
        if (z) {
            this.path.rewind();
            ((SpoilerEffect) this.spoilers.get(0)).getRipplePath(this.path);
            canvas.drawPath(this.path, Theme.PAINT_CLEAR);
        }
        canvas.restore();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAnimatedEmoji(true);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateSpoilers();
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

    private void invalidateSpoilers() {
        List list = this.spoilers;
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
            SpoilerEffect.addSpoilers(this, this.spoilersPool, this.spoilers);
        }
        invalidate();
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
        if (lineLeft <= f && lineLeft + layout.getLineWidth(lineForVertical) >= f && paddingTop >= 0 && paddingTop <= layout.getHeight()) {
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) new SpannableString(layout.getText()).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && !AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                return clickableSpanArr[0];
            }
        }
        return null;
    }

    @Override
    public Layout getStaticTextLayout() {
        return getLayout();
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
}

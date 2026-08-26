package org.telegram.ui.Components.spoilers;

import android.content.Context;
import android.graphics.Canvas;
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
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda168;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;

public class SpoilersTextView extends TextView implements TextSelectionHelper.SimpleSelectabeleView {
    public static Class editorClass;
    public static Field mEditor;
    public static Method mEditorInvalidateDisplayList;
    public boolean allowClickSpoilers;
    public AnimatedEmojiSpan.EmojiGroupedSpans animatedEmoji;
    public PorterDuffColorFilter animatedEmojiColorFilter;
    public int cacheType;
    public final SpoilersClickDetector clickDetector;
    public CharacterStyle currentLinkLoading;
    public final boolean disablePaddingInLinks;
    public boolean disablePaddingsOffset;
    public boolean disablePaddingsOffsetX;
    public boolean disablePaddingsOffsetY;
    public Object editor;
    public boolean isSpoilersRevealed;
    public Layout lastLayout;
    public int lastTextLength;
    public final LinkSpanDrawable.LinkCollector links;
    public LinkSpanDrawable.LinksTextView.OnLinkPress onLongPressListener;
    public LinkSpanDrawable.LinksTextView.OnLinkPress onPressListener;
    public final Path path;
    public LinkSpanDrawable pressedLink;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ArrayList spoilers;
    public final Stack spoilersPool;
    public boolean triedGetInvalidate;
    public boolean useAlphaForEmoji;

    public SpoilersTextView(Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.spoilers = arrayList;
        this.spoilersPool = new Stack();
        this.path = new Path();
        this.allowClickSpoilers = true;
        this.cacheType = 0;
        this.useAlphaForEmoji = true;
        this.disablePaddingInLinks = true;
        this.lastLayout = null;
        this.links = new LinkSpanDrawable.LinkCollector(this);
        this.resourcesProvider = resourcesProvider;
        this.clickDetector = new SpoilersClickDetector(this, arrayList, new ChatActivity$$ExternalSyntheticLambda168(6, this, z));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        CharacterStyle characterStyle;
        LinkSpanDrawable.LinkCollector linkCollector = this.links;
        if (linkCollector != null) {
            Layout layout = getLayout();
            ClickableSpan clickableSpanHit = hit((int) motionEvent.getX(), (int) motionEvent.getY());
            if (clickableSpanHit != null && motionEvent.getAction() == 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
                LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(clickableSpanHit, resourcesProvider, x, y);
                linkSpanDrawable.setColor(Theme.getColor(Theme.key_chat_linkSelectBackground, resourcesProvider));
                this.pressedLink = linkSpanDrawable;
                linkCollector.addLink(linkSpanDrawable, null);
                SpannableString spannableString = new SpannableString(layout.getText());
                int spanStart = spannableString.getSpanStart(this.pressedLink.mSpan);
                int spanEnd = spannableString.getSpanEnd(this.pressedLink.mSpan);
                LinkPath linkPathObtainNewPath = this.pressedLink.obtainNewPath();
                linkPathObtainNewPath.setCurrentLayout(layout, spanStart, 0.0f, this.disablePaddingInLinks ? 0.0f : getPaddingTop());
                layout.getSelectionPath(spanStart, spanEnd, linkPathObtainNewPath);
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(this, linkSpanDrawable, clickableSpanHit, 12), ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (motionEvent.getAction() == 1) {
                linkCollector.clear(true);
                LinkSpanDrawable linkSpanDrawable2 = this.pressedLink;
                if (linkSpanDrawable2 != null && (characterStyle = linkSpanDrawable2.mSpan) == clickableSpanHit) {
                    LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = this.onPressListener;
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
        if (this.pressedLink == null && !(this.allowClickSpoilers && ((GestureDetector) this.clickDetector.gestureDetector.zza).onTouchEvent(motionEvent))) {
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

    public final void invalidateSpoilers() {
        ArrayList arrayList = this.spoilers;
        if (arrayList == null) {
            return;
        }
        Stack stack = this.spoilersPool;
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.isSpoilersRevealed) {
            invalidate();
            return;
        }
        if (getLayout() != null && (getText() instanceof Spanned)) {
            int i = SpoilerEffect.MAX_PARTICLES_PER_ENTITY;
            int measuredWidth = getMeasuredWidth();
            SpoilerEffect.addSpoilers(this, getLayout(), 0, measuredWidth > 0 ? measuredWidth : -2, (Spanned) getText(), stack, arrayList, null);
        }
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAnimatedEmoji(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
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
        ArrayList arrayList = this.spoilers;
        boolean zIsEmpty = arrayList.isEmpty();
        Path path = this.path;
        if (zIsEmpty) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            path.rewind();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Rect bounds = ((SpoilerEffect) obj).getBounds();
                path.addRect(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop, Path.Direction.CW);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            Emoji.emojiDrawingUseAlpha = this.useAlphaForEmoji;
            super.onDraw(canvas);
            Emoji.emojiDrawingUseAlpha = true;
            canvas.restore();
            SpoilerEffect spoilerEffect = (SpoilerEffect) arrayList.get(0);
            if (spoilerEffect.rippleMaxRadius > 0.0f && spoilerEffect.rippleProgress > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((SpoilerEffect) arrayList.get(0)).getRipplePath(path);
                canvas.clipPath(path);
                super.onDraw(canvas);
                canvas.restore();
            }
        }
        updateAnimatedEmoji(false);
        if (this.animatedEmoji != null) {
            canvas.save();
            canvas.translate(paddingLeft, paddingTop);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, getLayout(), this.animatedEmoji, 0.0f, arrayList, 0.0f, getHeight(), 0.0f, 1.0f, this.animatedEmojiColorFilter);
            canvas.restore();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z = ((SpoilerEffect) arrayList.get(0)).rippleProgress != -1.0f;
        if (z) {
            canvas2 = canvas;
            canvas2.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), null, 31);
        } else {
            canvas2 = canvas;
            canvas2.save();
        }
        canvas2.translate(paddingLeft, AndroidUtilities.dp(2.0f) + paddingTop);
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            SpoilerEffect spoilerEffect2 = (SpoilerEffect) obj2;
            spoilerEffect2.setColor(getPaint().getColor());
            spoilerEffect2.draw(canvas2);
        }
        if (z) {
            path.rewind();
            ((SpoilerEffect) arrayList.get(0)).getRipplePath(path);
            canvas2.drawPath(path, Theme.PAINT_CLEAR);
        }
        canvas2.restore();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        invalidateSpoilers();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        invalidateSpoilers();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        invalidateSpoilers();
        updateAnimatedEmoji(true);
    }

    public void setClearLinkOnLongPress(boolean z) {
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
        LinkSpanDrawable.LinkCollector linkCollector;
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
            LoadingDrawable loadingDrawableMakeLoading = LinkSpanDrawable.LinkCollector.makeLoading(getLayout(), characterStyle, getPaddingTop());
            if (loadingDrawableMakeLoading != null) {
                int color = Theme.getColor(Theme.key_chat_linkSelectBackground, this.resourcesProvider);
                loadingDrawableMakeLoading.setColors(Theme.multAlpha(0.8f, color), Theme.multAlpha(1.3f, color), Theme.multAlpha(1.0f, color), Theme.multAlpha(4.0f, color));
                loadingDrawableMakeLoading.strokePaint.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                linkCollector.addLoading(loadingDrawableMakeLoading, null);
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

    public final void updateAnimatedEmoji(boolean z) {
        int length = (getLayout() == null || getLayout().getText() == null) ? 0 : getLayout().getText().length();
        if (!z && this.lastLayout == getLayout() && this.lastTextLength == length) {
            return;
        }
        this.animatedEmoji = AnimatedEmojiSpan.update(this.cacheType, this, this.animatedEmoji, getLayout());
        this.lastLayout = getLayout();
        this.lastTextLength = length;
    }
}

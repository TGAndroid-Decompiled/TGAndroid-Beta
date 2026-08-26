package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.FloatingActionMode;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.URLSpanReplacement;

public final class RichEditText extends EditTextCaption {
    public boolean accentHint;
    public boolean allowNewlines;
    public boolean applyingEmptyHint;
    public boolean autoBold;
    public TL_iv.PageBlock block;
    public boolean centerEmptyHint;
    public int currentAccount;
    public boolean ignoreTextChange;
    public InlineButtonClickListener inlineButtonClickListener;
    public final RichEditText$$ExternalSyntheticLambda2 inlineButtonLongPressRunnable;
    public boolean inlineButtonLongPressed;
    public boolean insertingNewline;
    public Layout lastMarkLayout;
    public int lastMarkTextLength;
    public Listener listener;
    public boolean locked;
    public final RichEditText$$ExternalSyntheticLambda1 lockingFilter;
    public Paint markPaint;
    public LinkPath markPath;
    public boolean markPathDirty;
    public long mathDownTime;
    public float mathDownX;
    public float mathDownY;
    public RichInlineButtonSpan pressedInlineButton;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean softEnterNewline;
    public int textColorKey;
    public int touchSlop;

    public interface InlineButtonClickListener {
    }

    public interface Listener {
        boolean onBackspaceAtStart(RichEditText richEditText);

        void onBackspaceOnEmpty();

        void onEnterPressed(RichEditText richEditText);

        void onLockedInsert(CharSequence charSequence);

        boolean onPaste(RichEditText richEditText);

        void onRequestWindowFocusable(RichEditText richEditText);

        boolean onSelectAll();

        void onSelectionChanged(RichEditText richEditText, int i, int i2);

        void onTab(boolean z);

        void onTextChanged(Editable editable);

        void onTextWillChange(int i, int i2);
    }

    public RichEditText(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.currentAccount = UserConfig.selectedAccount;
        this.lastMarkTextLength = -1;
        this.markPathDirty = true;
        this.lockingFilter = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                RichEditText richEditText = this.f$0;
                if (!richEditText.locked || richEditText.ignoreTextChange) {
                    return null;
                }
                RichEditText.Listener listener = richEditText.listener;
                if (listener != null && charSequence != null && i2 > i && i3 == i4) {
                    listener.onLockedInsert(charSequence.subSequence(i, i2));
                }
                return spanned.subSequence(i3, i4);
            }
        };
        this.textColorKey = Theme.key_windowBackgroundWhiteBlackText;
        this.inlineButtonLongPressRunnable = new RichEditText$$ExternalSyntheticLambda2(this, 0);
        this.resourcesProvider = resourcesProvider;
        this.adaptiveCreateLinkDialog = true;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(0);
        ?? r0 = new ActionMode.Callback() {
            @Override
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return true;
            }

            @Override
            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                if (RichEditText.this.length() != 0) {
                    return false;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    int itemId = menu.getItem(size).getItemId();
                    if (itemId != 16908322 && itemId != 16908337) {
                        menu.removeItem(itemId);
                    }
                }
                return true;
            }
        };
        setCustomSelectionActionModeCallback(anonymousClass1);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(r0);
        }
        setOnLongClickListener(new RichEditor$$ExternalSyntheticLambda12(this, 4));
        setLongClickable(length() == 0);
        setOnEditorActionListener(new RichEditText$$ExternalSyntheticLambda4(this, 0));
        addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                Editable editable2;
                RichEditText richEditText = RichEditText.this;
                if (richEditText.ignoreTextChange || richEditText.listener == null) {
                    return;
                }
                if (!richEditText.autoBold || editable.length() <= 0) {
                    editable2 = editable;
                } else {
                    editable2 = editable;
                    RichTextStyle.setStyle(editable2, 0, editable.length(), 1, true, richEditText.block);
                }
                if (richEditText.allowNewlines || richEditText.insertingNewline || richEditText.softEnterNewline) {
                    richEditText.listener.onTextChanged(editable2);
                    return;
                }
                richEditText.ignoreTextChange = true;
                boolean z = false;
                for (int length = editable2.length() - 1; length >= 0; length--) {
                    if (editable2.charAt(length) == '\n') {
                        editable2.delete(length, length + 1);
                        z = true;
                    }
                }
                richEditText.ignoreTextChange = false;
                if (z) {
                    richEditText.listener.onEnterPressed(richEditText);
                } else {
                    richEditText.listener.onTextChanged(editable2);
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                Listener listener;
                RichEditText richEditText = RichEditText.this;
                if (richEditText.ignoreTextChange || (listener = richEditText.listener) == null) {
                    return;
                }
                listener.onTextWillChange(i2, i3);
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                RichEditText richEditText = RichEditText.this;
                richEditText.markPathDirty = true;
                richEditText.refreshEmptyHintGravity();
                richEditText.setLongClickable(richEditText.length() == 0);
            }
        });
        updateColors();
    }

    @Override
    public final void addStyle(int i, int i2, int i3) {
        int iMin;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (iMin = Math.min(i3, text.length()))) {
            return;
        }
        RichTextStyle.setStyle(text, i2, iMin, i, true, this.block);
        if ((i & 256) != 0) {
            invalidateSpoilers();
        }
        super.notifySpansChanged();
        this.markPathDirty = true;
        invalidate();
    }

    public final void bindInlineButtons() {
        RichEditText richEditText;
        Editable text = getText();
        if (text == null) {
            return;
        }
        RichInlineButtonSpan[] richInlineButtonSpanArr = (RichInlineButtonSpan[]) text.getSpans(0, text.length(), RichInlineButtonSpan.class);
        for (RichInlineButtonSpan richInlineButtonSpan : richInlineButtonSpanArr) {
            richInlineButtonSpan.removeNestedReplacementSpans(text);
        }
        for (RichInlineButtonSpan richInlineButtonSpan2 : richInlineButtonSpanArr) {
            int i = this.currentAccount;
            RichMessageLayout.RichButtonSpan richButtonSpan = richInlineButtonSpan2.renderedSpan;
            if (richButtonSpan != null && (richEditText = richInlineButtonSpan2.attachedView) != null) {
                richButtonSpan.detach(richEditText);
            }
            richInlineButtonSpan2.attachedView = this;
            richInlineButtonSpan2.currentAccount = i;
            richInlineButtonSpan2.resourcesProvider = this.resourcesProvider;
            richInlineButtonSpan2.renderedSpan = null;
            richInlineButtonSpan2.ensureRenderer();
        }
    }

    @Override
    public final URLSpanReplacement createUrlSpan(String str) {
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = 1024;
        return new URLSpanReplacement(str, textStyleRun);
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Listener listener;
        if (keyEvent.getKeyCode() != 61) {
            int keyCode = keyEvent.getKeyCode();
            if ((keyCode != 66 && keyCode != 160) || this.listener == null || this.allowNewlines) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0) {
                boolean z = (keyEvent.getFlags() & 2) != 0;
                if (this.softEnterNewline && (z || keyEvent.isShiftPressed())) {
                    int iMax = Math.max(0, getSelectionStart());
                    int iMax2 = Math.max(0, getSelectionEnd());
                    if (iMax > iMax2) {
                        iMax2 = iMax;
                        iMax = iMax2;
                    }
                    this.insertingNewline = true;
                    getText().replace(iMax, iMax2, "\n");
                    this.insertingNewline = false;
                    setSelection(iMax + 1);
                    return true;
                }
                this.listener.onEnterPressed(this);
            }
        } else if (keyEvent.getAction() == 0 && (listener = this.listener) != null) {
            listener.onTab(keyEvent.isShiftPressed());
            return true;
        }
        return true;
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
    }

    public final void finishActionMode() {
        FloatingActionMode floatingActionMode = this.floatingActionMode;
        if (floatingActionMode != null) {
            try {
                floatingActionMode.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final int getCurrentStyle(int i, int i2) {
        int iMax;
        int iMin;
        Editable text = getText();
        if (text != null && (iMax = Math.max(0, i)) < (iMin = Math.min(i2, text.length()))) {
            return RichTextStyle.stylesFullyCovering(text, iMax, iMin);
        }
        return 0;
    }

    @Override
    public Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    public final RichInlineButtonSpan inlineButtonSpanAt(float f, float f2) {
        int totalPaddingTop;
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0 && (totalPaddingTop = (int) ((f2 - getTotalPaddingTop()) + getScrollY())) >= 0 && totalPaddingTop <= layout.getHeight()) {
            int lineForVertical = layout.getLineForVertical(totalPaddingTop);
            float totalPaddingLeft = (f - getTotalPaddingLeft()) + getScrollX();
            for (RichInlineButtonSpan richInlineButtonSpan : (RichInlineButtonSpan[]) text.getSpans(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical), RichInlineButtonSpan.class)) {
                int spanStart = text.getSpanStart(richInlineButtonSpan);
                int spanEnd = text.getSpanEnd(richInlineButtonSpan);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                    float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
                    if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                        return richInlineButtonSpan;
                    }
                }
            }
        }
        return null;
    }

    public final void notifyInlineContentChanged() {
        super.notifySpansChanged();
        this.markPathDirty = true;
        invalidate();
        requestLayout();
        invalidateEffects();
    }

    @Override
    public final void notifySpansChanged() {
        super.notifySpansChanged();
        this.markPathDirty = true;
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bindInlineButtons();
    }

    @Override
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.inlineButtonLongPressRunnable);
        this.pressedInlineButton = null;
        this.inlineButtonLongPressed = false;
        Editable text = getText();
        if (text != null) {
            for (RichInlineButtonSpan richInlineButtonSpan : (RichInlineButtonSpan[]) text.getSpans(0, text.length(), RichInlineButtonSpan.class)) {
                RichMessageLayout.RichButtonSpan richButtonSpan = richInlineButtonSpan.renderedSpan;
                if (richButtonSpan != null && richInlineButtonSpan.attachedView == this) {
                    richButtonSpan.detach(this);
                    richInlineButtonSpan.attachedView = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iDp;
        int iDp2;
        Layout layout = getLayout();
        LinkPath linkPath = null;
        if (layout == null) {
            this.markPath = null;
            this.lastMarkLayout = null;
            this.lastMarkTextLength = -1;
        } else {
            CharSequence text = layout.getText();
            if (this.markPathDirty || layout != this.lastMarkLayout || text.length() != this.lastMarkTextLength) {
                this.markPathDirty = false;
                this.lastMarkLayout = layout;
                this.lastMarkTextLength = text.length();
                this.markPath = null;
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    TextStyleSpan[] textStyleSpanArr = (TextStyleSpan[]) spanned.getSpans(0, spanned.length(), TextStyleSpan.class);
                    int length = textStyleSpanArr.length;
                    int i = 0;
                    while (i < length) {
                        TextStyleSpan textStyleSpan = textStyleSpanArr[i];
                        int styleFlags = textStyleSpan.getStyleFlags();
                        if ((65536 & styleFlags) != 0) {
                            int spanStart = spanned.getSpanStart(textStyleSpan);
                            int spanEnd = spanned.getSpanEnd(textStyleSpan);
                            if (spanStart < 0) {
                                linkPath = linkPath;
                            } else if (spanEnd > spanStart) {
                                if (linkPath == null) {
                                    LinkPath linkPath2 = new LinkPath(true);
                                    linkPath2.setAllowReset(false);
                                    linkPath = linkPath2;
                                }
                                linkPath.setCurrentLayout(layout, spanStart, 0.0f);
                                if ((32768 & styleFlags) != 0) {
                                    iDp = -AndroidUtilities.dp(6.0f);
                                } else {
                                    iDp = (styleFlags & 16384) != 0 ? AndroidUtilities.dp(2.0f) : 0;
                                }
                                if (iDp != 0) {
                                    iDp2 = AndroidUtilities.dp(iDp > 0 ? 5.0f : -2.0f) + iDp;
                                } else {
                                    iDp2 = 0;
                                }
                                linkPath.setBaselineShift(iDp2);
                                layout.getSelectionPath(spanStart, spanEnd, linkPath);
                            }
                        }
                        i++;
                        linkPath = linkPath;
                    }
                    if (linkPath != null) {
                        linkPath.setAllowReset(true);
                    }
                    this.markPath = linkPath;
                }
            }
        }
        if (this.markPath != null) {
            if (this.markPaint == null) {
                Paint paint = new Paint(1);
                this.markPaint = paint;
                paint.setPathEffect(LinkPath.getRoundedEffect());
            }
            this.markPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkSelection, this.resourcesProvider) & 872415231);
            canvas.save();
            canvas.translate(getPaddingLeft(), this.offsetY);
            canvas.drawPath(this.markPath, this.markPaint);
            canvas.restore();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67 && this.listener != null) {
            if (length() == 0) {
                this.listener.onBackspaceOnEmpty();
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.listener.onBackspaceAtStart(this)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSelectionChanged(this, i, i2);
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        refreshEmptyHintGravity();
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        Listener listener;
        Listener listener2;
        if (i == 16908319 && (listener2 = this.listener) != null && listener2.onSelectAll()) {
            return true;
        }
        if (i == 16908322 && (listener = this.listener) != null && listener.onPaste(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.listener != null && isEnabled() && isFocusable()) {
            this.listener.onRequestWindowFocusable(this);
        }
        if (!this.locked) {
            int action = motionEvent.getAction();
            MathSpan mathSpan = null;
            RichEditText$$ExternalSyntheticLambda2 richEditText$$ExternalSyntheticLambda2 = this.inlineButtonLongPressRunnable;
            if (action == 0) {
                this.mathDownX = motionEvent.getX();
                this.mathDownY = motionEvent.getY();
                this.mathDownTime = motionEvent.getEventTime();
                RichInlineButtonSpan richInlineButtonSpanInlineButtonSpanAt = inlineButtonSpanAt(motionEvent.getX(), motionEvent.getY());
                this.pressedInlineButton = richInlineButtonSpanInlineButtonSpanAt;
                if (richInlineButtonSpanInlineButtonSpanAt != null && this.inlineButtonClickListener != null) {
                    this.inlineButtonLongPressed = false;
                    richInlineButtonSpanInlineButtonSpanAt.ensureRenderer().setPressed(true);
                    AndroidUtilities.cancelRunOnUIThread(richEditText$$ExternalSyntheticLambda2);
                    AndroidUtilities.runOnUIThread(richEditText$$ExternalSyntheticLambda2, ViewConfiguration.getLongPressTimeout());
                    return true;
                }
                this.pressedInlineButton = null;
            } else {
                RichInlineButtonSpan richInlineButtonSpan = this.pressedInlineButton;
                if (richInlineButtonSpan != null) {
                    boolean z = motionEvent.getAction() == 1 || motionEvent.getAction() == 3;
                    boolean z2 = motionEvent.getAction() != 3 && inlineButtonSpanAt(motionEvent.getX(), motionEvent.getY()) == richInlineButtonSpan;
                    if (!z2 || z) {
                        richInlineButtonSpan.ensureRenderer().setPressed(false);
                        AndroidUtilities.cancelRunOnUIThread(richEditText$$ExternalSyntheticLambda2);
                    }
                    if (z) {
                        this.pressedInlineButton = null;
                        if (!this.inlineButtonLongPressed && z2 && motionEvent.getAction() == 1) {
                            ((RichEditorListView$$ExternalSyntheticLambda37) this.inlineButtonClickListener).onInlineButtonClick(this, richInlineButtonSpan, false);
                        }
                        this.inlineButtonLongPressed = false;
                    }
                    return true;
                }
                if (motionEvent.getAction() == 1) {
                    if (this.touchSlop == 0) {
                        this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                    }
                    float x = motionEvent.getX() - this.mathDownX;
                    float y = motionEvent.getY() - this.mathDownY;
                    float f = (y * y) + (x * x);
                    int i = this.touchSlop;
                    if (f <= i * i && motionEvent.getEventTime() - this.mathDownTime < ViewConfiguration.getLongPressTimeout()) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        Layout layout = getLayout();
                        Editable text = getText();
                        if (layout != null && text != null && text.length() != 0) {
                            int lineForVertical = layout.getLineForVertical((int) ((y2 - getTotalPaddingTop()) + getScrollY()));
                            float totalPaddingLeft = (x2 - getTotalPaddingLeft()) + getScrollX();
                            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                                for (MathSpan mathSpan2 : (MathSpan[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), MathSpan.class)) {
                                    int spanStart = text.getSpanStart(mathSpan2);
                                    int spanEnd = text.getSpanEnd(mathSpan2);
                                    if (spanStart >= 0 && spanEnd >= 0) {
                                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                                            mathSpan = mathSpan2;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (mathSpan != null) {
                            ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), mathSpan.source, new RichEditor$$ExternalSyntheticLambda51(3, this, mathSpan), this.resourcesProvider);
                            return true;
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void refreshEmptyHintGravity() {
        if (this.centerEmptyHint) {
            this.applyingEmptyHint = true;
            int iDp = AndroidUtilities.dp(2.0f);
            CharSequence hint = getHint();
            if (length() != 0 || getWidth() <= 0 || TextUtils.isEmpty(hint)) {
                super.setGravity(17);
                setPadding(iDp, getPaddingTop(), iDp, getPaddingBottom());
            } else {
                int iMax = Math.max(0, Math.round(((getWidth() - (iDp * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(iMax + iDp, getPaddingTop(), iDp, getPaddingBottom());
            }
            this.applyingEmptyHint = false;
        }
    }

    @Override
    public final void removeStyle(int i, int i2, int i3) {
        int iMin;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (iMin = Math.min(i3, text.length()))) {
            return;
        }
        if ((i & 1) != 0) {
            this.autoBold = false;
        }
        RichTextStyle.setStyle(text, i2, iMin, i, false, this.block);
        if ((i & 256) != 0) {
            invalidateSpoilers();
        }
        super.notifySpansChanged();
        this.markPathDirty = true;
        invalidate();
    }

    public final void requestEditFocus() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onRequestWindowFocusable(this);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    public final void requestEditFocusRebuild() {
        finishActionMode();
        if (isFocused()) {
            clearFocus();
        }
        requestEditFocus();
        finishActionMode();
        post(new RichEditText$$ExternalSyntheticLambda2(this, 1));
    }

    public void setAccentHint(boolean z) {
        if (this.accentHint == z) {
            return;
        }
        this.accentHint = z;
        updateColors();
    }

    public void setAllowNewlines(boolean z) {
        this.allowNewlines = z;
    }

    public void setAutoBold(boolean z) {
        this.autoBold = z;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.block = pageBlock;
    }

    public void setCenterEmptyHint(boolean z) {
        if (this.centerEmptyHint == z) {
            return;
        }
        this.centerEmptyHint = z;
        if (z) {
            refreshEmptyHintGravity();
        } else {
            int iDp = AndroidUtilities.dp(2.0f);
            setPadding(iDp, getPaddingTop(), iDp, getPaddingBottom());
        }
    }

    @Override
    public void setGravity(int i) {
        if (!this.applyingEmptyHint) {
            this.centerEmptyHint = false;
        }
        super.setGravity(i);
    }

    public void setInlineButtonClickListener(InlineButtonClickListener inlineButtonClickListener) {
        this.inlineButtonClickListener = inlineButtonClickListener;
    }

    public void setInlineButtonContext(int i) {
        this.currentAccount = i;
        bindInlineButtons();
    }

    @Override
    public void setInputType(int i) {
        InputMethodManager inputMethodManager;
        boolean z = getInputType() != i;
        super.setInputType(i);
        if (z && isFocused() && (inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method")) != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setLocked(boolean z) {
        RichEditText$$ExternalSyntheticLambda1 richEditText$$ExternalSyntheticLambda1;
        boolean z2;
        if (this.locked == z) {
            return;
        }
        this.locked = z;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i = 0;
        while (true) {
            richEditText$$ExternalSyntheticLambda1 = this.lockingFilter;
            if (i >= length) {
                z2 = false;
                break;
            } else {
                if (filters[i] == richEditText$$ExternalSyntheticLambda1) {
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        if (z && !z2) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = richEditText$$ExternalSyntheticLambda1;
            setFilters(inputFilterArr);
        }
        boolean z3 = !z;
        setAllowDrawCursor(z3);
        setCursorVisible(z3);
    }

    public void setSoftEnterNewline(boolean z) {
        this.softEnterNewline = z;
    }

    public void setTextColorKey(int i) {
        this.textColorKey = i;
        updateColors();
    }

    public void setTextSilently(CharSequence charSequence) {
        this.ignoreTextChange = true;
        setText(charSequence);
        bindInlineButtons();
        setSelection(length());
        this.ignoreTextChange = false;
    }

    public final void updateColors() {
        int i = this.textColorKey;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        setTextColor(Theme.getColor(i, resourcesProvider));
        setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, resourcesProvider));
        setHintTextColor(this.accentHint ? Theme.multAlpha(0.5f, Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)) : Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        setHandlesColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider));
        bindInlineButtons();
    }

    public final class AnonymousClass1 implements ActionMode.Callback {
        public final int $r8$classId;

        public AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            switch (this.$r8$classId) {
            }
            return false;
        }

        @Override
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            switch (this.$r8$classId) {
            }
            return false;
        }

        @Override
        public final void onDestroyActionMode(ActionMode actionMode) {
            int i = this.$r8$classId;
        }

        @Override
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            switch (this.$r8$classId) {
            }
            return false;
        }

        private final void onDestroyActionMode$org$telegram$ui$ActionBar$ActionBarMenuItem$10(ActionMode actionMode) {
        }

        private final void onDestroyActionMode$org$telegram$ui$iv$RichEditText$1(ActionMode actionMode) {
        }
    }
}

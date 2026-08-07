package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.FloatingActionMode;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.TextStyleSpan;

public class RichEditText extends EditTextCaption {
    private boolean accentHint;
    private boolean allowNewlines;
    private boolean applyingEmptyHint;
    private boolean autoBold;
    public TL_iv.PageBlock block;
    private boolean centerEmptyHint;
    private boolean ignoreTextChange;
    private boolean insertingNewline;
    private Layout lastMarkLayout;
    private int lastMarkTextLength;
    private Listener listener;
    private boolean locked;
    private final InputFilter lockingFilter;
    private Paint markPaint;
    private LinkPath markPath;
    private boolean markPathDirty;
    private long mathDownTime;
    private float mathDownX;
    private float mathDownY;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean softEnterNewline;
    private int textColorKey;
    private int touchSlop;

    public interface Listener {

        public abstract class CC {
            public static boolean $default$onBackspaceAtStart(Listener listener, RichEditText richEditText) {
                return false;
            }

            public static void $default$onBackspaceOnEmpty(Listener listener, RichEditText richEditText) {
            }

            public static void $default$onEnterPressed(Listener listener, RichEditText richEditText) {
            }

            public static void $default$onLockedInsert(Listener listener, RichEditText richEditText, CharSequence charSequence) {
            }

            public static boolean $default$onPaste(Listener listener, RichEditText richEditText) {
                return false;
            }

            public static void $default$onRequestWindowFocusable(Listener listener, RichEditText richEditText, boolean z) {
            }

            public static boolean $default$onSelectAll(Listener listener, RichEditText richEditText) {
                return false;
            }

            public static boolean $default$onTab(Listener listener, RichEditText richEditText, boolean z) {
                return false;
            }

            public static void $default$onTextWillChange(Listener listener, RichEditText richEditText, int i, int i2) {
            }
        }

        boolean onBackspaceAtStart(RichEditText richEditText);

        void onBackspaceOnEmpty(RichEditText richEditText);

        void onEnterPressed(RichEditText richEditText);

        void onLockedInsert(RichEditText richEditText, CharSequence charSequence);

        boolean onPaste(RichEditText richEditText);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        boolean onSelectAll(RichEditText richEditText);

        void onSelectionChanged(RichEditText richEditText, int i, int i2);

        boolean onTab(RichEditText richEditText, boolean z);

        void onTextChanged(RichEditText richEditText, Editable editable);

        void onTextWillChange(RichEditText richEditText, int i, int i2);
    }

    @Override
    protected void extendActionMode(ActionMode actionMode, Menu menu) {
    }

    public CharSequence lambda$new$0(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.locked || this.ignoreTextChange) {
            return null;
        }
        Listener listener = this.listener;
        if (listener != null && charSequence != null && i2 > i && i3 == i4) {
            listener.onLockedInsert(this, charSequence.subSequence(i, i2));
        }
        return spanned.subSequence(i3, i4);
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.block = pageBlock;
    }

    public void setAccentHint(boolean z) {
        if (this.accentHint == z) {
            return;
        }
        this.accentHint = z;
        updateColors();
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

    public void refreshEmptyHintGravity() {
        if (this.centerEmptyHint) {
            this.applyingEmptyHint = true;
            int iDp = AndroidUtilities.dp(2.0f);
            CharSequence hint = getHint();
            if (length() == 0 && getWidth() > 0 && !TextUtils.isEmpty(hint)) {
                int iMax = Math.max(0, Math.round(((getWidth() - (iDp * 2)) - getPaint().measureText(hint.toString())) / 2.0f));
                super.setGravity(51);
                setPadding(iMax + iDp, getPaddingTop(), iDp, getPaddingBottom());
            } else {
                super.setGravity(17);
                setPadding(iDp, getPaddingTop(), iDp, getPaddingBottom());
            }
            this.applyingEmptyHint = false;
        }
    }

    @Override
    public void setGravity(int i) {
        if (!this.applyingEmptyHint) {
            this.centerEmptyHint = false;
        }
        super.setGravity(i);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        refreshEmptyHintGravity();
    }

    public RichEditText(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.lastMarkTextLength = -1;
        this.markPathDirty = true;
        this.lockingFilter = new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.f$0.lambda$new$0(charSequence, i, i2, spanned, i3, i4);
            }
        };
        this.textColorKey = Theme.key_windowBackgroundWhiteBlackText;
        this.resourcesProvider = resourcesProvider;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        ActionMode.Callback callback = new ActionMode.Callback() {
            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        };
        ActionMode.Callback callback2 = new ActionMode.Callback() {
            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return true;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
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
        setCustomSelectionActionModeCallback(callback);
        if (Build.VERSION.SDK_INT >= 23) {
            setCustomInsertionActionModeCallback(callback2);
        }
        setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$new$1(view);
            }
        });
        updateLongClickForEmpty();
        setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f$0.lambda$new$2(textView, i, keyEvent);
            }
        });
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (RichEditText.this.ignoreTextChange || RichEditText.this.listener == null) {
                    return;
                }
                RichEditText.this.listener.onTextWillChange(RichEditText.this, i2, i3);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                RichEditText.this.markPathDirty = true;
                RichEditText.this.refreshEmptyHintGravity();
                RichEditText.this.updateLongClickForEmpty();
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (RichEditText.this.ignoreTextChange || RichEditText.this.listener == null) {
                    return;
                }
                if (RichEditText.this.autoBold && editable.length() > 0) {
                    RichTextStyle.setStyle(editable, 0, editable.length(), 1, true, RichEditText.this.block);
                }
                if (RichEditText.this.allowNewlines || RichEditText.this.insertingNewline || RichEditText.this.softEnterNewline) {
                    RichEditText.this.listener.onTextChanged(RichEditText.this, editable);
                    return;
                }
                RichEditText.this.ignoreTextChange = true;
                boolean z = false;
                for (int length = editable.length() - 1; length >= 0; length--) {
                    if (editable.charAt(length) == '\n') {
                        editable.delete(length, length + 1);
                        z = true;
                    }
                }
                RichEditText.this.ignoreTextChange = false;
                if (z) {
                    RichEditText.this.listener.onEnterPressed(RichEditText.this);
                } else {
                    RichEditText.this.listener.onTextChanged(RichEditText.this, editable);
                }
            }
        });
        updateColors();
    }

    public boolean lambda$new$1(View view) {
        return length() != 0;
    }

    public boolean lambda$new$2(TextView textView, int i, KeyEvent keyEvent) {
        Listener listener;
        if (i != 5 || (listener = this.listener) == null || this.allowNewlines) {
            return false;
        }
        if (this.softEnterNewline) {
            insertNewlineAtSelection();
            return true;
        }
        listener.onEnterPressed(this);
        return true;
    }

    @Override
    protected Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setAllowNewlines(boolean z) {
        this.allowNewlines = z;
    }

    public void setAutoBold(boolean z) {
        this.autoBold = z;
    }

    public boolean isAutoBold() {
        return this.autoBold;
    }

    public void setSoftEnterNewline(boolean z) {
        this.softEnterNewline = z;
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

    public void setTextSilently(CharSequence charSequence) {
        this.ignoreTextChange = true;
        setText(charSequence);
        setSelection(length());
        this.ignoreTextChange = false;
    }

    public void deleteToEndSilently(int i) {
        Editable text = getText();
        if (text == null || i < 0 || i >= text.length()) {
            return;
        }
        this.ignoreTextChange = true;
        text.delete(i, text.length());
        this.ignoreTextChange = false;
    }

    public void appendSilently(CharSequence charSequence) {
        Editable text = getText();
        if (text == null || charSequence == null || charSequence.length() == 0) {
            return;
        }
        this.ignoreTextChange = true;
        text.append(charSequence);
        this.ignoreTextChange = false;
    }

    public void setTextColorKey(int i) {
        this.textColorKey = i;
        updateColors();
    }

    public void updateColors() {
        setTextColor(Theme.getColor(this.textColorKey, this.resourcesProvider));
        setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
        setHintTextColor(this.accentHint ? Theme.multAlpha(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), 0.5f) : Theme.getColor(Theme.key_windowBackgroundWhiteHintText, this.resourcesProvider));
        setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        setHandlesColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider));
    }

    public void setLocked(boolean z) {
        boolean z2;
        if (this.locked == z) {
            return;
        }
        this.locked = z;
        InputFilter[] filters = getFilters();
        int length = filters.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z2 = false;
                break;
            } else {
                if (filters[i] == this.lockingFilter) {
                    z2 = true;
                    break;
                }
                i++;
            }
        }
        if (z && !z2) {
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = this.lockingFilter;
            setFilters(inputFilterArr);
        }
        boolean z3 = !z;
        setAllowDrawCursor(z3);
        setCursorVisible(z3);
    }

    public void requestEditFocus() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onRequestWindowFocusable(this, true);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    public void requestEditFocusRebuild() {
        finishActionMode();
        if (isFocused()) {
            clearFocus();
        }
        requestEditFocus();
        finishActionMode();
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.finishActionMode();
            }
        });
    }

    public void finishActionMode() {
        FloatingActionMode floatingActionMode = this.floatingActionMode;
        if (floatingActionMode != null) {
            try {
                floatingActionMode.finish();
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MathSpan mathSpanMathSpanAt;
        if (motionEvent.getAction() == 0 && this.listener != null && isEnabled() && isFocusable()) {
            this.listener.onRequestWindowFocusable(this, true);
        }
        if (!this.locked) {
            if (motionEvent.getAction() == 0) {
                this.mathDownX = motionEvent.getX();
                this.mathDownY = motionEvent.getY();
                this.mathDownTime = motionEvent.getEventTime();
            } else if (motionEvent.getAction() == 1) {
                if (this.touchSlop == 0) {
                    this.touchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
                }
                float x = motionEvent.getX() - this.mathDownX;
                float y = motionEvent.getY() - this.mathDownY;
                float f = (x * x) + (y * y);
                int i = this.touchSlop;
                if (f <= i * i && motionEvent.getEventTime() - this.mathDownTime < ViewConfiguration.getLongPressTimeout() && (mathSpanMathSpanAt = mathSpanAt(motionEvent.getX(), motionEvent.getY())) != null) {
                    openMathEditor(mathSpanMathSpanAt);
                    return true;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    private MathSpan mathSpanAt(float f, float f2) {
        Layout layout = getLayout();
        Editable text = getText();
        if (layout != null && text != null && text.length() != 0) {
            int lineForVertical = layout.getLineForVertical((int) ((f2 - getTotalPaddingTop()) + getScrollY()));
            float totalPaddingLeft = (f - getTotalPaddingLeft()) + getScrollX();
            if (totalPaddingLeft >= layout.getLineLeft(lineForVertical) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= layout.getLineRight(lineForVertical) + AndroidUtilities.dp(2.0f)) {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, totalPaddingLeft);
                for (MathSpan mathSpan : (MathSpan[]) text.getSpans(Math.max(0, offsetForHorizontal - 1), Math.min(text.length(), offsetForHorizontal + 1), MathSpan.class)) {
                    int spanStart = text.getSpanStart(mathSpan);
                    int spanEnd = text.getSpanEnd(mathSpan);
                    if (spanStart >= 0 && spanEnd >= 0) {
                        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
                        float primaryHorizontal2 = spanEnd <= text.length() ? layout.getPrimaryHorizontal(spanEnd) : primaryHorizontal;
                        if (totalPaddingLeft >= Math.min(primaryHorizontal, primaryHorizontal2) - AndroidUtilities.dp(2.0f) && totalPaddingLeft <= Math.max(primaryHorizontal, primaryHorizontal2) + AndroidUtilities.dp(2.0f)) {
                            return mathSpan;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void openMathEditor(final MathSpan mathSpan) {
        ChatAttachAlertRichLayout.showEditLatexSheet(getContext(), mathSpan.source, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$openMathEditor$3(mathSpan, (String) obj);
            }
        }, this.resourcesProvider);
    }

    public void lambda$openMathEditor$3(MathSpan mathSpan, String str) {
        MathSpan mathSpanCreate;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Editable text = getText();
        int spanStart = text.getSpanStart(mathSpan);
        int spanEnd = text.getSpanEnd(mathSpan);
        if (spanStart < 0 || spanEnd < 0 || (mathSpanCreate = MathSpan.create(str, getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) == null) {
            return;
        }
        boolean z = this.locked;
        if (z) {
            setLocked(false);
        }
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(mathSpanCreate, 0, 1, 33);
        int iMax = Math.max(0, Math.min(spanStart, length()));
        text.replace(iMax, Math.max(iMax, Math.min(spanEnd, length())), spannableString);
        setSelection(Math.min(iMax + 1, length()));
        if (z) {
            setLocked(true);
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Listener listener;
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0 && (listener = this.listener) != null) {
                listener.onTab(this, keyEvent.isShiftPressed());
            }
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if ((keyCode == 66 || keyCode == 160) && this.listener != null && !this.allowNewlines) {
            if (keyEvent.getAction() == 0) {
                boolean z = (keyEvent.getFlags() & 2) != 0;
                if (this.softEnterNewline && (z || keyEvent.isShiftPressed())) {
                    insertNewlineAtSelection();
                } else {
                    this.listener.onEnterPressed(this);
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 67 && this.listener != null) {
            if (length() == 0) {
                this.listener.onBackspaceOnEmpty(this);
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.listener.onBackspaceAtStart(this)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void insertNewlineAtSelection() {
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
    }

    @Override
    public boolean onTextContextMenuItem(int i) {
        Listener listener;
        Listener listener2;
        if (i == 16908319 && (listener2 = this.listener) != null && listener2.onSelectAll(this)) {
            return true;
        }
        if (i == 16908322 && (listener = this.listener) != null && listener.onPaste(this)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void updateLongClickForEmpty() {
        setLongClickable(length() == 0);
    }

    @Override
    protected void notifySpansChanged() {
        super.notifySpansChanged();
        this.markPathDirty = true;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        buildMarkPath();
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

    private void buildMarkPath() {
        int iDp;
        int iDp2;
        Layout layout = getLayout();
        LinkPath linkPath = null;
        if (layout == null) {
            this.markPath = null;
            this.lastMarkLayout = null;
            this.lastMarkTextLength = -1;
            return;
        }
        CharSequence text = layout.getText();
        if (!this.markPathDirty && layout == this.lastMarkLayout && text.length() == this.lastMarkTextLength) {
            return;
        }
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
                    linkPath = linkPath;
                    if (spanStart >= 0 && spanEnd > spanStart) {
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
                            iDp2 = iDp + AndroidUtilities.dp(iDp > 0 ? 5.0f : -2.0f);
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

    @Override
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSelectionChanged(this, i, i2);
        }
    }

    @Override
    public int getCurrentStyle(int i, int i2) {
        int iMax;
        int iMin;
        Editable text = getText();
        if (text != null && (iMax = Math.max(0, i)) < (iMin = Math.min(i2, text.length()))) {
            return RichTextStyle.stylesFullyCovering(text, iMax, iMin);
        }
        return 0;
    }

    @Override
    public void addStyle(int i, int i2, int i3) {
        int iMin;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (iMin = Math.min(i3, text.length()))) {
            return;
        }
        RichTextStyle.setStyle(text, i2, iMin, i, true, this.block);
        if ((i & 256) != 0) {
            invalidateSpoilers();
        }
        notifySpansChanged();
    }

    @Override
    public void removeStyle(int i, int i2, int i3) {
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
        notifySpansChanged();
    }
}

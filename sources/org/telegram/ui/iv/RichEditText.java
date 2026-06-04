package org.telegram.ui.iv;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TypefaceSpan;

public class RichEditText extends EditTextCaption {
    private boolean ignoreTextChange;
    private Listener listener;
    private Theme.ResourcesProvider resourcesProvider;
    private KeyListener savedKeyListener;

    public interface Listener {

        public abstract class CC {
            public static boolean $default$onBackspaceAtStart(Listener listener, RichEditText richEditText) {
                return false;
            }

            public static void $default$onBackspaceOnEmpty(Listener listener, RichEditText richEditText) {
            }

            public static void $default$onEnterPressed(Listener listener, RichEditText richEditText) {
            }
        }

        boolean onBackspaceAtStart(RichEditText richEditText);

        void onBackspaceOnEmpty(RichEditText richEditText);

        void onEnterPressed(RichEditText richEditText);

        void onRequestWindowFocusable(RichEditText richEditText, boolean z);

        void onSelectionChanged(RichEditText richEditText, int i, int i2);

        boolean onTab(RichEditText richEditText, boolean z);

        void onTextChanged(RichEditText richEditText, Editable editable);
    }

    public RichEditText(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.resourcesProvider = resourcesProvider;
        setBackground(null);
        setCursorWidth(1.5f);
        setGravity(8388659);
        setInputType(getInputType() | 147456);
        setImeOptions(5);
        setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return this.f$0.lambda$new$0(textView, i, keyEvent);
            }
        });
        addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (RichEditText.this.ignoreTextChange || RichEditText.this.listener == null) {
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
        applyColors();
    }

    public boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        Listener listener;
        if (i != 5 || (listener = this.listener) == null) {
            return false;
        }
        listener.onEnterPressed(this);
        return true;
    }

    @Override
    protected Theme.ResourcesProvider getResourcesProvider() {
        return this.resourcesProvider;
    }

    @Override
    protected void extendActionMode(ActionMode actionMode, Menu menu) {
        int i = R.id.menu_bold;
        if (menu.findItem(i) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
        int i2 = R.id.menu_groupbolditalic;
        menu.add(i2, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(i2, i, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(i2, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
        spannableStringBuilder3.setSpan(new TypefaceSpan(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
        menu.add(i2, R.id.menu_mono, 9, spannableStringBuilder3);
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
        textStyleRun.flags = 8 | textStyleRun.flags;
        spannableStringBuilder4.setSpan(new TextStyleSpan(textStyleRun), 0, spannableStringBuilder4.length(), 33);
        menu.add(i2, R.id.menu_strike, 10, spannableStringBuilder4);
        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
        TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
        textStyleRun2.flags |= 16;
        spannableStringBuilder5.setSpan(new TextStyleSpan(textStyleRun2), 0, spannableStringBuilder5.length(), 33);
        menu.add(i2, R.id.menu_underline, 11, spannableStringBuilder5);
        menu.add(i2, R.id.menu_link, 12, LocaleController.getString(R.string.CreateLink));
        menu.add(i2, R.id.menu_date, 13, LocaleController.getString(R.string.FormattedDate));
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setTextSilently(CharSequence charSequence) {
        this.ignoreTextChange = true;
        setText(charSequence);
        setSelection(length());
        this.ignoreTextChange = false;
    }

    public void applyColors() {
        int i = Theme.key_windowBackgroundWhiteBlackText;
        setTextColor(Theme.getColor(i, this.resourcesProvider));
        setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, this.resourcesProvider));
        setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, this.resourcesProvider));
        setCursorColor(Theme.getColor(i, this.resourcesProvider));
        setHandlesColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, this.resourcesProvider));
    }

    public void setLocked(boolean z) {
        if (z) {
            if (this.savedKeyListener == null) {
                this.savedKeyListener = getKeyListener();
            }
            setKeyListener(null);
            setCursorVisible(false);
            clearFocus();
            setFocusable(false);
            setFocusableInTouchMode(false);
            AndroidUtilities.hideKeyboard(this);
            return;
        }
        KeyListener keyListener = this.savedKeyListener;
        if (keyListener != null) {
            setKeyListener(keyListener);
            this.savedKeyListener = null;
        }
        setCursorVisible(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void requestEditFocus() {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onRequestWindowFocusable(this, true);
        }
        requestFocus();
        AndroidUtilities.showKeyboard(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.listener != null && isEnabled() && isFocusable()) {
            this.listener.onRequestWindowFocusable(this, true);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 61) {
            if (keyEvent.getAction() == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("RichEditText.dispatchKeyEvent TAB shift=");
                sb.append(keyEvent.isShiftPressed());
                sb.append(" listener=");
                sb.append(this.listener != null);
                Log.d("RICHED", sb.toString());
                Listener listener = this.listener;
                if (listener != null) {
                    listener.onTab(this, keyEvent.isShiftPressed());
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Listener listener;
        if (i == 67 && this.listener != null) {
            if (length() == 0) {
                this.listener.onBackspaceOnEmpty(this);
                return true;
            }
            if (getSelectionStart() == 0 && getSelectionEnd() == 0 && this.listener.onBackspaceAtStart(this)) {
                return true;
            }
        }
        if (i == 66 && (listener = this.listener) != null) {
            listener.onEnterPressed(this);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        Listener listener = this.listener;
        if (listener != null) {
            listener.onSelectionChanged(this, i, i2);
        }
    }
}

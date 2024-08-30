package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;

public class EditTextCell extends FrameLayout {
    public boolean autofocused;
    public final EditTextBoldCursor editText;
    private boolean focused;
    private boolean ignoreEditText;
    AnimatedTextView.AnimatedTextDrawable limit;
    AnimatedColor limitColor;
    private int limitCount;
    private int maxLength;
    private boolean needDivider;
    private boolean showLimitWhenEmpty;
    private boolean showLimitWhenFocused;

    public EditTextCell(Context context, String str, final boolean z, final int i, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.limitColor = new AnimatedColor(this);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.limit = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.limit.setTextSize(AndroidUtilities.dp(15.33f));
        this.limit.setGravity(5);
        this.maxLength = i;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                EditTextCell editTextCell = EditTextCell.this;
                editTextCell.limit.setTextColor(editTextCell.limitColor.set(Theme.getColor(editTextCell.limitCount <= 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                EditTextCell.this.limit.setBounds(getScrollX(), 0, ((getScrollX() + getWidth()) - getPaddingRight()) + AndroidUtilities.dp(42.0f), getHeight());
                EditTextCell.this.limit.draw(canvas);
            }

            @Override
            public void onDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(getScrollX() + getPaddingLeft(), 0, (getScrollX() + getWidth()) - getPaddingRight(), getHeight());
                super.onDraw(canvas);
                canvas.restore();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.onTextChanged(charSequence, i2, i3, i4);
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = EditTextCell.this.limit;
                if (animatedTextDrawable2 == null || i <= 0) {
                    return;
                }
                animatedTextDrawable2.cancelAnimation();
                EditTextCell.this.updateLimitText();
            }

            @Override
            protected boolean verifyDrawable(Drawable drawable) {
                return drawable == EditTextCell.this.limit || super.verifyDrawable(drawable);
            }
        };
        this.editText = editTextBoldCursor;
        this.limit.setCallback(editTextBoldCursor);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editTextBoldCursor.setTextColor(Theme.getColor(i2, resourcesProvider));
        editTextBoldCursor.setBackground(null);
        if (z) {
            editTextBoldCursor.setMaxLines(5);
            editTextBoldCursor.setSingleLine(false);
        } else {
            editTextBoldCursor.setMaxLines(1);
            editTextBoldCursor.setSingleLine(true);
        }
        editTextBoldCursor.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp((i > 0 ? 42 : 0) + 21), AndroidUtilities.dp(15.0f));
        editTextBoldCursor.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editTextBoldCursor.setInputType((z ? 131072 : 0) | 573441);
        editTextBoldCursor.setRawInputType(573441);
        editTextBoldCursor.setHint(str);
        editTextBoldCursor.setCursorColor(Theme.getColor(i2, resourcesProvider));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(19.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable editable) {
                if (!EditTextCell.this.ignoreEditText) {
                    if (i > 0 && editable != null && editable.length() > i) {
                        EditTextCell.this.ignoreEditText = true;
                        EditTextCell.this.editText.setText(editable.subSequence(0, i));
                        EditTextBoldCursor editTextBoldCursor2 = EditTextCell.this.editText;
                        editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                        EditTextCell.this.ignoreEditText = false;
                    }
                    EditTextCell.this.onTextChanged(editable);
                }
                if (!z) {
                    return;
                }
                while (true) {
                    int indexOf = editable.toString().indexOf("\n");
                    if (indexOf < 0) {
                        return;
                    } else {
                        editable.delete(indexOf, indexOf + 1);
                    }
                }
            }

            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                if (EditTextCell.this.ignoreEditText) {
                    return;
                }
                EditTextCell.this.autofocused = false;
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean z2) {
                EditTextCell.this.focused = z2;
                if (EditTextCell.this.showLimitWhenFocused) {
                    EditTextCell.this.updateLimitText();
                }
                EditTextCell.this.onFocusChanged(z2);
            }
        });
        addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -1, 48));
        updateLimitText();
    }

    public void lambda$hideKeyboardOnEnter$0() {
        AndroidUtilities.hideKeyboard(this.editText);
    }

    public void updateLimitText() {
        if (this.editText == null) {
            return;
        }
        this.limitCount = this.maxLength - getText().length();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.showLimitWhenEmpty) && (!this.showLimitWhenFocused || (this.focused && !this.autofocused))) {
            str = "" + this.limitCount;
        }
        animatedTextDrawable.setText(str);
    }

    public CharSequence getText() {
        return this.editText.getText();
    }

    public void hideKeyboardOnEnter() {
        whenHitEnter(new Runnable() {
            @Override
            public final void run() {
                EditTextCell.this.lambda$hideKeyboardOnEnter$0();
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    protected void onFocusChanged(boolean z) {
    }

    public void onTextChanged(CharSequence charSequence) {
    }

    public void setDivider(boolean z) {
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public ImageView setLeftDrawable(Drawable drawable) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(drawable);
        addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.editText.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(24.0f);
        this.editText.setLayoutParams(layoutParams);
        return imageView;
    }

    public void setShowLimitOnFocus(boolean z) {
        this.showLimitWhenFocused = z;
    }

    public void setShowLimitWhenEmpty(boolean z) {
        this.showLimitWhenEmpty = z;
        if (z) {
            updateLimitText();
        }
    }

    public void setText(CharSequence charSequence) {
        this.ignoreEditText = true;
        this.editText.setText(charSequence);
        EditTextBoldCursor editTextBoldCursor = this.editText;
        editTextBoldCursor.setSelection(editTextBoldCursor.getText().length());
        this.ignoreEditText = false;
    }

    public void whenHitEnter(final Runnable runnable) {
        this.editText.setImeOptions(6);
        this.editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                runnable.run();
                return true;
            }
        });
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TypefaceSpan;

public class EditTextCell extends FrameLayout {
    public boolean autofocused;
    public final EditTextCaption editText;
    private boolean focused;
    private boolean ignoreEditText;
    AnimatedTextView.AnimatedTextDrawable limit;
    AnimatedColor limitColor;
    private int limitCount;
    private int maxLength;
    private boolean needDivider;
    private boolean showLimitWhenEmpty;
    private boolean showLimitWhenFocused;
    private int showLimitWhenNear;

    public final class AnonymousClass1 implements TextView.OnEditorActionListener {
        public final int $r8$classId;
        public final Runnable val$whenEnter;

        public AnonymousClass1(int i, Runnable runnable) {
            this.$r8$classId = i;
            this.val$whenEnter = runnable;
        }

        @Override
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (i != 6) {
                        return false;
                    }
                    this.val$whenEnter.run();
                    return true;
                default:
                    if (i != 6) {
                        return false;
                    }
                    this.val$whenEnter.run();
                    return true;
            }
        }
    }

    public final class AnonymousClass4 implements View.OnFocusChangeListener {
        public final int $r8$classId;
        public final FrameLayout this$0;

        public AnonymousClass4(FrameLayout frameLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = frameLayout;
        }

        @Override
        public final void onFocusChange(View view, boolean z) {
            switch (this.$r8$classId) {
                case 0:
                    EditTextCell editTextCell = (EditTextCell) this.this$0;
                    editTextCell.focused = z;
                    if (editTextCell.showLimitWhenFocused) {
                        editTextCell.updateLimitText();
                    }
                    editTextCell.onFocusChanged(z);
                    break;
                default:
                    EditEmojiTextCell editEmojiTextCell = (EditEmojiTextCell) this.this$0;
                    editEmojiTextCell.focused = z;
                    if (editEmojiTextCell.showLimitWhenFocused) {
                        editEmojiTextCell.updateLimitText();
                    }
                    editEmojiTextCell.onFocusChanged(z);
                    break;
            }
        }
    }

    public EditTextCell(Context context, String str, final boolean z, final boolean z2, final int i, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.showLimitWhenNear = -1;
        this.limitColor = new AnimatedColor(this);
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
        this.limit = animatedTextDrawable;
        animatedTextDrawable.setAnimationProperties(0.2f, 0L, 160L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.limit.setTextSize(AndroidUtilities.dp(15.33f));
        this.limit.setGravity(5);
        this.maxLength = i;
        EditTextCaption editTextCaption = new EditTextCaption(context, resourcesProvider) {
            @Override
            public final void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                EditTextCell editTextCell = EditTextCell.this;
                editTextCell.limit.setTextColor(editTextCell.limitColor.set(Theme.getColor(editTextCell.limitCount <= 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider)));
                editTextCell.limit.setBounds(getScrollX(), getHeight() - Math.min(AndroidUtilities.dp(52.0f), getHeight()), AndroidUtilities.dp(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
                editTextCell.limit.draw(canvas);
            }

            @Override
            public final void extendActionMode(ActionMode actionMode, Menu menu) {
                if (z2) {
                    int i2 = R.id.menu_bold;
                    if (menu.findItem(i2) != null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        menu.removeItem(16908341);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
                    spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                    int i3 = R.id.menu_groupbolditalic;
                    menu.add(i3, i2, 6, spannableStringBuilder);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
                    spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
                    menu.add(i3, R.id.menu_italic, 7, spannableStringBuilder2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 8;
                    spannableStringBuilder3.setSpan(new TextStyleSpan(textStyleRun), 0, spannableStringBuilder3.length(), 33);
                    menu.add(i3, R.id.menu_strike, 8, spannableStringBuilder3);
                    menu.add(i3, R.id.menu_regular, 9, LocaleController.getString(R.string.Regular));
                }
            }

            @Override
            public final void onDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
                super.onDraw(canvas);
                canvas.restore();
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.onTextChanged(charSequence, i2, i3, i4);
                EditTextCell editTextCell = EditTextCell.this;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = editTextCell.limit;
                if (animatedTextDrawable2 == null || i <= 0) {
                    return;
                }
                animatedTextDrawable2.cancelAnimation();
                editTextCell.updateLimitText();
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == EditTextCell.this.limit || super.verifyDrawable(drawable);
            }
        };
        this.editText = editTextCaption;
        this.limit.setCallback(editTextCaption);
        editTextCaption.setTextSize(1, 17.0f);
        editTextCaption.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editTextCaption.setTextColor(Theme.getColor(i2, resourcesProvider));
        editTextCaption.setBackground(null);
        if (z) {
            editTextCaption.setMaxLines(5);
            editTextCaption.setSingleLine(false);
        } else {
            editTextCaption.setMaxLines(1);
            editTextCaption.setSingleLine(true);
        }
        editTextCaption.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp((i > 0 ? 42 : 0) + 21), AndroidUtilities.dp(15.0f));
        editTextCaption.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editTextCaption.setInputType((z ? 131072 : 0) | 573441);
        editTextCaption.setRawInputType((z ? 131072 : 0) | 573441);
        editTextCaption.setHint(str);
        editTextCaption.setCursorColor(Theme.getColor(i2, resourcesProvider));
        editTextCaption.setCursorSize(AndroidUtilities.dp(19.0f));
        editTextCaption.setCursorWidth(1.5f);
        editTextCaption.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                EditTextCell editTextCell = EditTextCell.this;
                if (!editTextCell.ignoreEditText) {
                    int i3 = i;
                    if (i3 > 0 && editable != null && editable.length() > i3) {
                        editTextCell.ignoreEditText = true;
                        editTextCell.editText.setText(editable.subSequence(0, i3));
                        EditTextCaption editTextCaption2 = editTextCell.editText;
                        editTextCaption2.setSelection(editTextCaption2.length());
                        editTextCell.ignoreEditText = false;
                    }
                    editTextCell.onTextChanged(editable);
                }
                if (z) {
                    return;
                }
                while (true) {
                    int iIndexOf = editable.toString().indexOf("\n");
                    if (iIndexOf < 0) {
                        return;
                    } else {
                        editable.delete(iIndexOf, iIndexOf + 1);
                    }
                }
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                EditTextCell editTextCell = EditTextCell.this;
                if (editTextCell.ignoreEditText) {
                    return;
                }
                editTextCell.autofocused = false;
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        editTextCaption.setOnFocusChangeListener(new AnonymousClass4(this, 0));
        addView(editTextCaption, LayoutHelper.createFrame(-1, -1, 48));
        updateLimitText();
    }

    public CharSequence getText() {
        return this.editText.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(UserConfig.selectedAccount).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
    }

    public void hideKeyboardOnEnter() {
        whenHitEnter(new EditTextCell$$ExternalSyntheticLambda0(this, 0));
    }

    public final void lambda$hideKeyboardOnEnter$0() {
        AndroidUtilities.hideKeyboard(this.editText);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    public void onFocusChanged(boolean z) {
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

    public void setShowLimitWhenNear(int i) {
        this.showLimitWhenNear = i;
        updateLimitText();
    }

    public void setText(CharSequence charSequence) {
        this.ignoreEditText = true;
        this.editText.setText(charSequence);
        EditTextCaption editTextCaption = this.editText;
        editTextCaption.setSelection(editTextCaption.getText().length());
        this.ignoreEditText = false;
    }

    public final void updateLimitText() {
        int i;
        if (this.editText == null) {
            return;
        }
        this.limitCount = this.maxLength - getText().length();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.limit;
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.showLimitWhenEmpty) && ((!this.showLimitWhenFocused || (this.focused && !this.autofocused)) && ((i = this.showLimitWhenNear) == -1 || this.limitCount <= i))) {
            str = "" + this.limitCount;
        }
        animatedTextDrawable.setText(str);
    }

    public boolean validate() {
        return this.maxLength < 0 || this.editText.getText().length() <= this.maxLength;
    }

    public void whenHitEnter(Runnable runnable) {
        this.editText.setImeOptions(6);
        this.editText.setOnEditorActionListener(new AnonymousClass1(0, runnable));
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.ignoreEditText = true;
        this.editText.setText(MessageObject.formatTextWithEntities(tL_textWithEntities, false));
        EditTextCaption editTextCaption = this.editText;
        editTextCaption.setSelection(editTextCaption.getText().length());
        this.ignoreEditText = false;
    }
}

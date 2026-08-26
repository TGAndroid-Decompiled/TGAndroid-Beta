package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.FrameLayout;
import com.google.zxing.BinaryBitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TypefaceSpan;

public abstract class EditEmojiTextCell extends FrameLayout {
    public boolean allowEntities;
    public final AnonymousClass2 editTextEmoji;
    public boolean focused;
    public boolean ignoreEditText;
    public final AnimatedTextView.AnimatedTextDrawable limit;
    public final AnimatedColor limitColor;
    public int limitCount;
    public final int maxLength;
    public boolean needDivider;
    public boolean showLimitWhenEmpty;
    public boolean showLimitWhenFocused;
    public int showLimitWhenNear;

    public EditEmojiTextCell(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, String str, final boolean z, final int i, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.showLimitWhenNear = -1;
        this.allowEntities = true;
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
        this.limit = animatedTextDrawable;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        animatedTextDrawable.moveAmplitude = 0.2f;
        animatedTextDrawable.animateDuration = 160L;
        animatedTextDrawable.animateWave = 1.0f;
        animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(15.33f));
        animatedTextDrawable.gravity = 5;
        this.maxLength = i;
        ?? r0 = new EditTextEmoji(context, sizeNotifierFrameLayout) {
            @Override
            public final boolean allowEntities() {
                return EditEmojiTextCell.this.allowEntities && super.allowEntities();
            }

            @Override
            public final int emojiCacheType() {
                return EditEmojiTextCell.this.emojiCacheType();
            }

            @Override
            public final void extendActionMode(Menu menu) {
                int i2 = R.id.menu_bold;
                if (menu.findItem(i2) != null) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    menu.removeItem(16908341);
                }
                int i3 = R.id.menu_groupbolditalic;
                menu.add(i3, R.id.menu_spoiler, 6, LocaleController.getString(R.string.Spoiler));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                menu.add(i3, i2, 7, spannableStringBuilder);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
                spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.getTypeface("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
                menu.add(i3, R.id.menu_italic, 8, spannableStringBuilder2);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags = 8 | textStyleRun.flags;
                spannableStringBuilder3.setSpan(new TextStyleSpan(textStyleRun, 0), 0, spannableStringBuilder3.length(), 33);
                menu.add(i3, R.id.menu_strike, 9, spannableStringBuilder3);
                menu.add(i3, R.id.menu_regular, 10, LocaleController.getString(R.string.Regular));
            }

            @Override
            public final void onDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
                super.onDraw(canvas);
                canvas.restore();
                EditEmojiTextCell editEmojiTextCell = EditEmojiTextCell.this;
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = editEmojiTextCell.limit;
                AnimatedColor animatedColor = editEmojiTextCell.limitColor;
                if (animatedColor != null) {
                    int i2 = animatedColor.set(Theme.getColor(editEmojiTextCell.limitCount <= 0 ? Theme.key_text_RedRegular : Theme.key_dialogSearchHint, resourcesProvider), false);
                    animatedTextDrawable2.textPaint.setColor(i2);
                    animatedTextDrawable2.alpha = Color.alpha(i2);
                }
                int iMin = Math.min(AndroidUtilities.dp(48.0f), getHeight());
                boolean z2 = z;
                float f = z2 ? 0.0f : -AndroidUtilities.dp(1.0f);
                animatedTextDrawable2.setBounds(getScrollX(), (getHeight() + f) - iMin, (getWidth() + getScrollX()) - AndroidUtilities.dp((z2 ? 0 : 44) + 12), f + getHeight());
                animatedTextDrawable2.draw(canvas);
            }

            @Override
            public final boolean verifyDrawable(Drawable drawable) {
                return drawable == EditEmojiTextCell.this.limit || super.verifyDrawable(drawable);
            }
        };
        this.editTextEmoji = r0;
        final EditTextCaption editText = r0.getEditText();
        editText.setDelegate(new BinaryBitmap(23, this, editText));
        r0.setWillNotDraw(false);
        this.limitColor = new AnimatedColor(r0);
        animatedTextDrawable.setCallback(r0);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        editText.setTextColor(Theme.getColor(i2, resourcesProvider));
        editText.setBackground(null);
        if (z) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), AndroidUtilities.dp(0.0f), editText.getPaddingBottom());
        editText.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editText.setInputType((z ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        editText.setCursorColor(Theme.getColor(i2, resourcesProvider));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                EditEmojiTextCell editEmojiTextCell = EditEmojiTextCell.this;
                boolean z2 = editEmojiTextCell.ignoreEditText;
                int i3 = i;
                if (!z2) {
                    if (i3 > 0 && editable != null && editable.length() > i3) {
                        editEmojiTextCell.ignoreEditText = true;
                        CharSequence charSequenceSubSequence = editable.subSequence(0, i3);
                        EditTextCaption editTextCaption = editText;
                        editTextCaption.setText(charSequenceSubSequence);
                        editTextCaption.setSelection(editTextCaption.length());
                        editEmojiTextCell.ignoreEditText = false;
                    }
                    editEmojiTextCell.onTextChanged();
                }
                if (z) {
                    while (true) {
                        int iIndexOf = editable.toString().indexOf("\n");
                        if (iIndexOf < 0) {
                            break;
                        } else {
                            editable.delete(iIndexOf, iIndexOf + 1);
                        }
                    }
                }
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = editEmojiTextCell.limit;
                if (animatedTextDrawable2 == null || i3 <= 0) {
                    return;
                }
                animatedTextDrawable2.cancelAnimation();
                editEmojiTextCell.updateLimitText();
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        editText.setOnFocusChangeListener(new EditTextCell.AnonymousClass4(this, 2));
        addView((View) r0, LayoutHelper.createFrame(-1, -1, 48));
        updateLimitText();
    }

    public int emojiCacheType() {
        return AnimatedEmojiDrawable.getCacheTypeForEnterView();
    }

    public CharSequence getText() {
        return getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void onTextChanged() {
    }

    public void setDivider(boolean z) {
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setEmojiViewCacheType(int i) {
        setEmojiViewCacheType(i);
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
        AnonymousClass2 anonymousClass2 = this.editTextEmoji;
        anonymousClass2.setText(charSequence);
        anonymousClass2.setSelection(anonymousClass2.getText().length());
        this.ignoreEditText = false;
    }

    public final void updateLimitText() {
        int i;
        AnonymousClass2 anonymousClass2 = this.editTextEmoji;
        if (anonymousClass2 == null || anonymousClass2.getEditText() == null) {
            return;
        }
        this.limitCount = this.maxLength - getText().length();
        String str = "";
        if ((!TextUtils.isEmpty(getText()) || this.showLimitWhenEmpty) && ((!this.showLimitWhenFocused || this.focused) && ((i = this.showLimitWhenNear) == -1 || this.limitCount <= i))) {
            str = "" + this.limitCount;
        }
        this.limit.setText(str, true, true);
    }
}

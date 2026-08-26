package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public abstract class CodeFieldContainer extends LinearLayout {
    public final Paint bitmapPaint;
    public CodeNumberField[] codeField;
    public boolean ignoreOnTextChange;
    public boolean isFocusSuppressed;
    public final Paint paint;
    public float strokeWidth;

    public CodeFieldContainer(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.paint = paint;
        this.bitmapPaint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof CodeNumberField) {
                CodeNumberField codeNumberField = (CodeNumberField) childAt;
                if (!this.isFocusSuppressed) {
                    if (childAt.isFocused()) {
                        CodeNumberField.animateSpring(codeNumberField.focusedSpringAnimation, 100.0f);
                    } else if (!childAt.isFocused()) {
                        CodeNumberField.animateSpring(codeNumberField.focusedSpringAnimation, 0.0f);
                    }
                }
                float successProgress = codeNumberField.getSuccessProgress();
                int iBlendARGB = ColorUtils.blendARGB(codeNumberField.getErrorProgress(), ColorUtils.blendARGB(codeNumberField.getFocusedProgress(), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false), Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false)), Theme.getColor(null, Theme.key_text_RedBold, false));
                Paint paint = this.paint;
                paint.setColor(ColorUtils.blendARGB(successProgress, iBlendARGB, Theme.getColor(null, Theme.key_checkbox, false)));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f = this.strokeWidth;
                rectF.inset(f, f);
                if (successProgress != 0.0f) {
                    float f2 = -Math.max(0.0f, (codeNumberField.getSuccessScaleProgress() - 1.0f) * this.strokeWidth);
                    rectF.inset(f2, f2);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!(view instanceof CodeNumberField)) {
            return super.drawChild(canvas, view, j);
        }
        CodeNumberField codeNumberField = (CodeNumberField) view;
        canvas.save();
        float f = codeNumberField.enterAnimation;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f2 = this.strokeWidth;
        rectF.inset(f2, f2);
        canvas.clipRect(rectF);
        if (codeNumberField.replaceAnimation) {
            float f3 = (f * 0.5f) + 0.5f;
            view.setAlpha(f);
            canvas.scale(f3, f3, (codeNumberField.getMeasuredWidth() / 2.0f) + codeNumberField.getX(), (codeNumberField.getMeasuredHeight() / 2.0f) + codeNumberField.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j);
        canvas.restore();
        float f4 = codeNumberField.exitAnimation;
        if (f4 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f5 = 1.0f - f4;
        float f6 = (f5 * 0.5f) + 0.5f;
        canvas.scale(f6, f6, (codeNumberField.getMeasuredWidth() / 2.0f) + codeNumberField.getX(), (codeNumberField.getMeasuredHeight() / 2.0f) + codeNumberField.getY());
        Paint paint = this.bitmapPaint;
        paint.setAlpha((int) (f5 * 255.0f));
        canvas.drawBitmap(codeNumberField.exitBitmap, codeNumberField.getX(), codeNumberField.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.codeField == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            CodeNumberField[] codeNumberFieldArr = this.codeField;
            if (i >= codeNumberFieldArr.length) {
                return sb.toString();
            }
            sb.append(PhoneFormat.stripExceptNumbers(codeNumberFieldArr[i].getText().toString(), false));
            i++;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Paint paint = this.paint;
        float fDp = AndroidUtilities.dp(1.5f);
        this.strokeWidth = fDp;
        paint.setStrokeWidth(fDp);
    }

    public abstract void processNextPressed();

    public void setCode(String str) {
        this.codeField[0].setText(str);
    }

    public final void setNumbersCount(final int i, int i2) {
        int i3;
        int i4;
        CodeNumberField[] codeNumberFieldArr = this.codeField;
        int i5 = 0;
        if (codeNumberFieldArr == null || codeNumberFieldArr.length != i) {
            if (codeNumberFieldArr != null) {
                for (CodeNumberField codeNumberField : codeNumberFieldArr) {
                    removeView(codeNumberField);
                }
            }
            this.codeField = new CodeNumberField[i];
            final int i6 = 0;
            while (i6 < i) {
                this.codeField[i6] = new CodeNumberField(getContext()) {
                    @Override
                    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
                        if (keyEvent.getKeyCode() == 4) {
                            return false;
                        }
                        int keyCode = keyEvent.getKeyCode();
                        CodeFieldContainer codeFieldContainer = CodeFieldContainer.this;
                        int length = codeFieldContainer.codeField.length;
                        int i7 = i6;
                        if (i7 >= length) {
                            return false;
                        }
                        if (keyEvent.getAction() != 1) {
                            return isFocused();
                        }
                        if (keyCode == 67 && codeFieldContainer.codeField[i7].length() == 1) {
                            codeFieldContainer.codeField[i7].startExitAnimation();
                            codeFieldContainer.codeField[i7].setText("");
                            return true;
                        }
                        if (keyCode == 67 && codeFieldContainer.codeField[i7].length() == 0 && i7 > 0) {
                            CodeNumberField codeNumberField2 = codeFieldContainer.codeField[i7 - 1];
                            codeNumberField2.setSelection(codeNumberField2.length());
                            for (int i8 = 0; i8 < i7; i8++) {
                                int i9 = i7 - 1;
                                if (i8 == i9) {
                                    codeFieldContainer.codeField[i9].requestFocus();
                                } else {
                                    codeFieldContainer.codeField[i8].clearFocus();
                                }
                            }
                            codeFieldContainer.codeField[i7 - 1].startExitAnimation();
                            codeFieldContainer.codeField[i7 - 1].setText("");
                            return true;
                        }
                        if (keyCode >= 7 && keyCode <= 16) {
                            String string = Integer.toString(keyCode - 7);
                            if (codeFieldContainer.codeField[i7].getText() != null && string.equals(codeFieldContainer.codeField[i7].getText().toString())) {
                                if (i7 >= i - 1) {
                                    codeFieldContainer.processNextPressed();
                                } else {
                                    codeFieldContainer.codeField[i7 + 1].requestFocus();
                                }
                                return true;
                            }
                            if (codeFieldContainer.codeField[i7].length() > 0) {
                                codeFieldContainer.codeField[i7].startExitAnimation();
                            }
                            codeFieldContainer.codeField[i7].setText(string);
                        }
                        return true;
                    }
                };
                this.codeField[i6].setImeOptions(268435461);
                this.codeField[i6].setTextSize(1, 20.0f);
                this.codeField[i6].setMaxLines(1);
                this.codeField[i6].setTypeface(AndroidUtilities.bold());
                this.codeField[i6].setPadding(0, 0, 0, 0);
                this.codeField[i6].setGravity(17);
                if (i2 == 3) {
                    this.codeField[i6].setEnabled(false);
                    this.codeField[i6].setInputType(0);
                    this.codeField[i6].setVisibility(8);
                } else {
                    this.codeField[i6].setInputType(3);
                }
                int i7 = 10;
                if (i2 == 10) {
                    i3 = 42;
                    i4 = 47;
                } else if (i2 == 11) {
                    i7 = 5;
                    i3 = 28;
                    i4 = 34;
                } else {
                    i7 = 7;
                    i3 = 34;
                    i4 = 42;
                }
                addView(this.codeField[i6], LayoutHelper.createLinear(i3, i4, 1, 0, 0, i6 != i + (-1) ? i7 : 0, 0));
                this.codeField[i6].addTextChangedListener(new PassportActivity.AnonymousClass10(this, i6, i));
                this.codeField[i6].setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 4));
                i6++;
            }
            return;
        }
        while (true) {
            CodeNumberField[] codeNumberFieldArr2 = this.codeField;
            if (i5 >= codeNumberFieldArr2.length) {
                return;
            }
            codeNumberFieldArr2[i5].setText("");
            i5++;
        }
    }

    public void setText(String str) {
        setText(str, false);
    }

    public final void setText(String str, boolean z) {
        if (this.codeField == null) {
            return;
        }
        int i = 0;
        if (z) {
            int i2 = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeField;
                if (i2 >= codeNumberFieldArr.length) {
                    break;
                }
                if (codeNumberFieldArr[i2].isFocused()) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        for (int i3 = i; i3 < Math.min(this.codeField.length, str.length() + i); i3++) {
            this.codeField[i3].setText(Character.toString(str.charAt(i3 - i)));
        }
    }
}

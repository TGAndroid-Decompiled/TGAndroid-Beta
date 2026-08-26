package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.GestureDetectorCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;

public class CustomPhoneKeyboardView extends ViewGroup {
    private static final int BUTTON_PADDING = 6;
    public static final int KEYBOARD_HEIGHT_DP = 230;
    private static final int SIDE_PADDING = 10;
    private final ImageView backButton;
    private final Runnable detectLongClick;
    private boolean dispatchBackWhenEmpty;
    private EditText editText;
    private final Runnable onBackButton;
    private boolean postedLongClick;
    private boolean runningLongClick;
    private View viewToFindFocus;
    private final View[] views;

    public static final class NumberButtonView extends View {
        private final String mNumber;
        private final String mSymbols;
        private final TextPaint numberTextPaint;
        private final Rect rect;
        private final TextPaint symbolsTextPaint;

        public NumberButtonView(Context context, String str, String str2) {
            super(context);
            TextPaint textPaint = new TextPaint(1);
            this.numberTextPaint = textPaint;
            TextPaint textPaint2 = new TextPaint(1);
            this.symbolsTextPaint = textPaint2;
            this.rect = new Rect();
            this.mNumber = str;
            this.mSymbols = str2;
            textPaint.setTextSize(AndroidUtilities.dp(24.0f));
            textPaint2.setTextSize(AndroidUtilities.dp(14.0f));
            updateColors();
        }

        public void updateColors() {
            this.numberTextPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.symbolsTextPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        }

        @Override
        public void onDraw(Canvas canvas) {
            float fMeasureText = this.symbolsTextPaint.measureText(this.mSymbols);
            float fMeasureText2 = this.numberTextPaint.measureText(this.mNumber);
            TextPaint textPaint = this.numberTextPaint;
            String str = this.mNumber;
            textPaint.getTextBounds(str, 0, str.length(), this.rect);
            float fHeight = this.rect.height() / 2.0f;
            TextPaint textPaint2 = this.symbolsTextPaint;
            String str2 = this.mSymbols;
            textPaint2.getTextBounds(str2, 0, str2.length(), this.rect);
            float fHeight2 = this.rect.height() / 2.0f;
            canvas.drawText(this.mNumber, (getWidth() * 0.25f) - (fMeasureText2 / 2.0f), (getHeight() / 2.0f) + fHeight, this.numberTextPaint);
            canvas.drawText(this.mSymbols, (getWidth() * 0.7f) - (fMeasureText / 2.0f), (getHeight() / 2.0f) + fHeight2, this.symbolsTextPaint);
        }
    }

    public CustomPhoneKeyboardView(Context context) {
        String str;
        super(context);
        this.views = new View[12];
        final int i = 0;
        this.onBackButton = new Runnable(this) {
            public final CustomPhoneKeyboardView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    default:
                        this.f$0.lambda$new$1();
                        break;
                }
            }
        };
        final int i2 = 1;
        this.detectLongClick = new Runnable(this) {
            public final CustomPhoneKeyboardView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$new$0();
                        break;
                    default:
                        this.f$0.lambda$new$1();
                        break;
                }
            }
        };
        int i3 = 0;
        int i4 = 0;
        while (i4 < 11) {
            if (i4 != 9) {
                switch (i4) {
                    case 1:
                        str = "ABC";
                        break;
                    case 2:
                        str = "DEF";
                        break;
                    case 3:
                        str = "GHI";
                        break;
                    case 4:
                        str = "JKL";
                        break;
                    case 5:
                        str = "MNO";
                        break;
                    case 6:
                        str = "PQRS";
                        break;
                    case 7:
                        str = "TUV";
                        break;
                    case 8:
                        str = "WXYZ";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "+";
                        break;
                }
                String strValueOf = String.valueOf(i4 != 10 ? i4 + 1 : 0);
                this.views[i4] = new NumberButtonView(context, strValueOf, str);
                this.views[i4].setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(23, this, strValueOf));
                addView(this.views[i4]);
            }
            i4++;
        }
        final GestureDetectorCompat gestureDetectorCompat = setupBackButtonDetector(context);
        ImageView imageView = new ImageView(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (CustomPhoneKeyboardView.this.postedLongClick || CustomPhoneKeyboardView.this.runningLongClick)) {
                    CustomPhoneKeyboardView.this.postedLongClick = false;
                    CustomPhoneKeyboardView.this.runningLongClick = false;
                    removeCallbacks(CustomPhoneKeyboardView.this.detectLongClick);
                    removeCallbacks(CustomPhoneKeyboardView.this.onBackButton);
                }
                super.onTouchEvent(motionEvent);
                return gestureDetectorCompat.mDetector.onTouchEvent(motionEvent);
            }
        };
        this.backButton = imageView;
        imageView.setImageResource(R.drawable.msg_clear_input);
        imageView.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        int iDp = AndroidUtilities.dp(11.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new ColorPicker$$ExternalSyntheticLambda4(2));
        this.views[11] = imageView;
        addView(imageView);
        while (true) {
            View[] viewArr = this.views;
            if (i3 >= viewArr.length) {
                return;
            }
            View view = viewArr[i3];
            if (view != null) {
                ScaleStateListAnimator.apply(view, 0.02f, 1.2f);
                view.setBackground(getButtonDrawable(i3));
            }
            i3++;
        }
    }

    private static Drawable getButtonDrawable(int i) {
        boolean z = i < 3;
        int i2 = i % 3;
        boolean z2 = i2 == 0;
        boolean z3 = i2 == 2;
        boolean z4 = i > 8;
        int i3 = Theme.key_listSelector;
        int color = Theme.getColor(null, i3, false);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(null, i3, false), 30);
        float f = 12.0f;
        int iDp = AndroidUtilities.dp((z2 && z) ? 24.0f : 12.0f);
        int iDp2 = AndroidUtilities.dp((z3 && z) ? 24.0f : 12.0f);
        int iDp3 = AndroidUtilities.dp((z3 && z4) ? 24.0f : 12.0f);
        if (z2 && z4) {
            f = 24.0f;
        }
        return Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp2, iDp3, AndroidUtilities.dp(f), color, alphaComponent, alphaComponent);
    }

    public void lambda$new$0() {
        checkFindEditText();
        EditText editText = this.editText;
        if (editText != null) {
            if (editText.length() != 0 || this.dispatchBackWhenEmpty) {
                try {
                    performHapticFeedback(3, 2);
                    playSoundEffect(0);
                } catch (Exception unused) {
                }
                this.editText.dispatchKeyEvent(new KeyEvent(0, 67));
                this.editText.dispatchKeyEvent(new KeyEvent(1, 67));
                if (this.runningLongClick) {
                    postDelayed(this.onBackButton, 50L);
                }
            }
        }
    }

    public void lambda$new$1() {
        this.postedLongClick = false;
        this.runningLongClick = true;
        this.onBackButton.run();
    }

    public void lambda$new$2(String str, View view) {
        int length;
        checkFindEditText();
        if (this.editText == null) {
            return;
        }
        try {
            performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        EditText editText = this.editText;
        if (editText instanceof EditTextBoldCursor) {
            ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
        }
        Editable text = this.editText.getText();
        if (this.editText.getSelectionEnd() == this.editText.length()) {
            length = -1;
        } else {
            length = str.length() + this.editText.getSelectionStart();
        }
        if (this.editText.getSelectionStart() == -1 || this.editText.getSelectionEnd() == -1) {
            this.editText.setText(str);
            EditText editText2 = this.editText;
            editText2.setSelection(editText2.length());
        } else {
            EditText editText3 = this.editText;
            editText3.setText(text.replace(editText3.getSelectionStart(), this.editText.getSelectionEnd(), str));
            EditText editText4 = this.editText;
            if (length == -1) {
                length = editText4.length();
            }
            editText4.setSelection(length);
        }
        EditText editText5 = this.editText;
        if (editText5 instanceof EditTextBoldCursor) {
            ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
        }
    }

    public static void lambda$new$3(View view) {
    }

    private GestureDetectorCompat setupBackButtonDetector(Context context) {
        final int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        return new GestureDetectorCompat(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onDown(MotionEvent motionEvent) {
                if (CustomPhoneKeyboardView.this.postedLongClick) {
                    CustomPhoneKeyboardView customPhoneKeyboardView = CustomPhoneKeyboardView.this;
                    customPhoneKeyboardView.removeCallbacks(customPhoneKeyboardView.detectLongClick);
                }
                CustomPhoneKeyboardView.this.postedLongClick = true;
                CustomPhoneKeyboardView customPhoneKeyboardView2 = CustomPhoneKeyboardView.this;
                customPhoneKeyboardView2.postDelayed(customPhoneKeyboardView2.detectLongClick, 200L);
                CustomPhoneKeyboardView.this.onBackButton.run();
                return true;
            }

            @Override
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if ((CustomPhoneKeyboardView.this.postedLongClick || CustomPhoneKeyboardView.this.runningLongClick) && (Math.abs(f) >= scaledTouchSlop || Math.abs(f2) >= scaledTouchSlop)) {
                    CustomPhoneKeyboardView.this.postedLongClick = false;
                    CustomPhoneKeyboardView.this.runningLongClick = false;
                    CustomPhoneKeyboardView customPhoneKeyboardView = CustomPhoneKeyboardView.this;
                    customPhoneKeyboardView.removeCallbacks(customPhoneKeyboardView.detectLongClick);
                    CustomPhoneKeyboardView customPhoneKeyboardView2 = CustomPhoneKeyboardView.this;
                    customPhoneKeyboardView2.removeCallbacks(customPhoneKeyboardView2.onBackButton);
                }
                return false;
            }
        });
    }

    @Override
    public boolean canScrollHorizontally(int i) {
        return true;
    }

    public void checkFindEditText() {
        View view;
        if (this.editText != null || (view = this.viewToFindFocus) == null) {
            return;
        }
        View viewFindFocus = view.findFocus();
        if (viewFindFocus instanceof EditText) {
            this.editText = (EditText) viewFindFocus;
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM$2 = OKLCH.m$2(32.0f, getWidth(), 3);
        int iM$3 = OKLCH.m$2(42.0f, getHeight(), 4);
        for (int i5 = 0; i5 < this.views.length; i5++) {
            int iDp = AndroidUtilities.dp(6.0f) + iM$2;
            int iDp2 = AndroidUtilities.dp(10.0f) + (iDp * (i5 % 3));
            int iDp3 = AndroidUtilities.dp(6.0f) + iM$3;
            int iDp4 = AndroidUtilities.dp(10.0f) + (iDp3 * (i5 / 3));
            View view = this.views[i5];
            if (view != null) {
                view.layout(iDp2, iDp4, iDp2 + iM$2, iDp4 + iM$3);
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int iM$2 = OKLCH.m$2(32.0f, getWidth(), 3);
        int iM$3 = OKLCH.m$2(42.0f, getHeight(), 4);
        for (View view : this.views) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(iM$2, 1073741824), View.MeasureSpec.makeMeasureSpec(iM$3, 1073741824));
            }
        }
    }

    public void setDispatchBackWhenEmpty(boolean z) {
        this.dispatchBackWhenEmpty = z;
    }

    public void setEditText(EditText editText) {
        this.editText = editText;
        this.dispatchBackWhenEmpty = false;
    }

    public void setViewToFindFocus(View view) {
        this.viewToFindFocus = view;
    }

    public void updateColors() {
        int i = 0;
        this.backButton.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        while (true) {
            View[] viewArr = this.views;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null) {
                view.setBackground(getButtonDrawable(i));
                if (view instanceof NumberButtonView) {
                    ((NumberButtonView) view).updateColors();
                }
            }
            i++;
        }
    }
}

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
import org.telegram.ui.ActionBar.Theme;

public class CustomPhoneKeyboardView extends ViewGroup {
    private final ImageView backButton;
    private final Runnable detectLongClick;
    private boolean dispatchBackWhenEmpty;
    private EditText editText;
    private final Runnable onBackButton;
    private boolean postedLongClick;
    private boolean runningLongClick;
    private View viewToFindFocus;
    private final View[] views;

    public static void m2250$r8$lambda$6OqSL5_VjNohTkANEHGRrcZr5o(View view) {
    }

    @Override
    public boolean canScrollHorizontally(int i) {
        return true;
    }

    public static void m2252$r8$lambda$v7aFgCknfjw2JOhcv_EfIBrUrA(CustomPhoneKeyboardView customPhoneKeyboardView) {
        customPhoneKeyboardView.checkFindEditText();
        EditText editText = customPhoneKeyboardView.editText;
        if (editText != null) {
            if (editText.length() != 0 || customPhoneKeyboardView.dispatchBackWhenEmpty) {
                try {
                    customPhoneKeyboardView.performHapticFeedback(3, 2);
                    customPhoneKeyboardView.playSoundEffect(0);
                } catch (Exception unused) {
                }
                customPhoneKeyboardView.editText.dispatchKeyEvent(new KeyEvent(0, 67));
                customPhoneKeyboardView.editText.dispatchKeyEvent(new KeyEvent(1, 67));
                if (customPhoneKeyboardView.runningLongClick) {
                    customPhoneKeyboardView.postDelayed(customPhoneKeyboardView.onBackButton, 50L);
                }
            }
        }
    }

    public static void $r8$lambda$765hNIjiDguL3Su9dVl3kGc0jNk(CustomPhoneKeyboardView customPhoneKeyboardView) {
        customPhoneKeyboardView.postedLongClick = false;
        customPhoneKeyboardView.runningLongClick = true;
        customPhoneKeyboardView.onBackButton.run();
    }

    public CustomPhoneKeyboardView(Context context) {
        String str;
        super(context);
        this.views = new View[12];
        this.onBackButton = new Runnable() {
            @Override
            public final void run() {
                CustomPhoneKeyboardView.m2252$r8$lambda$v7aFgCknfjw2JOhcv_EfIBrUrA(this.f$0);
            }
        };
        this.detectLongClick = new Runnable() {
            @Override
            public final void run() {
                CustomPhoneKeyboardView.$r8$lambda$765hNIjiDguL3Su9dVl3kGc0jNk(this.f$0);
            }
        };
        int i = 0;
        int i2 = 0;
        while (i2 < 11) {
            if (i2 != 9) {
                switch (i2) {
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
                final String strValueOf = String.valueOf(i2 != 10 ? i2 + 1 : 0);
                this.views[i2] = new NumberButtonView(context, strValueOf, str);
                this.views[i2].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        CustomPhoneKeyboardView.m2251$r8$lambda$Tn6QkrmAsCDloYYCXomSZPh9Bw(this.f$0, strValueOf, view);
                    }
                });
                addView(this.views[i2]);
            }
            i2++;
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
                return gestureDetectorCompat.onTouchEvent(motionEvent);
            }
        };
        this.backButton = imageView;
        imageView.setImageResource(R.drawable.msg_clear_input);
        imageView.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        int iDp = AndroidUtilities.dp(11.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CustomPhoneKeyboardView.m2250$r8$lambda$6OqSL5_VjNohTkANEHGRrcZr5o(view);
            }
        });
        this.views[11] = imageView;
        addView(imageView);
        while (true) {
            View[] viewArr = this.views;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null) {
                ScaleStateListAnimator.apply(view, 0.02f, 1.2f);
                view.setBackground(getButtonDrawable(i));
            }
            i++;
        }
    }

    public static void m2251$r8$lambda$Tn6QkrmAsCDloYYCXomSZPh9Bw(CustomPhoneKeyboardView customPhoneKeyboardView, String str, View view) {
        customPhoneKeyboardView.checkFindEditText();
        if (customPhoneKeyboardView.editText == null) {
            return;
        }
        try {
            customPhoneKeyboardView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        EditText editText = customPhoneKeyboardView.editText;
        if (editText instanceof EditTextBoldCursor) {
            ((EditTextBoldCursor) editText).setTextWatchersSuppressed(true, false);
        }
        Editable text = customPhoneKeyboardView.editText.getText();
        int selectionStart = customPhoneKeyboardView.editText.getSelectionEnd() == customPhoneKeyboardView.editText.length() ? -1 : customPhoneKeyboardView.editText.getSelectionStart() + str.length();
        if (customPhoneKeyboardView.editText.getSelectionStart() != -1 && customPhoneKeyboardView.editText.getSelectionEnd() != -1) {
            EditText editText2 = customPhoneKeyboardView.editText;
            editText2.setText(text.replace(editText2.getSelectionStart(), customPhoneKeyboardView.editText.getSelectionEnd(), str));
            EditText editText3 = customPhoneKeyboardView.editText;
            if (selectionStart == -1) {
                selectionStart = editText3.length();
            }
            editText3.setSelection(selectionStart);
        } else {
            customPhoneKeyboardView.editText.setText(str);
            EditText editText4 = customPhoneKeyboardView.editText;
            editText4.setSelection(editText4.length());
        }
        EditText editText5 = customPhoneKeyboardView.editText;
        if (editText5 instanceof EditTextBoldCursor) {
            ((EditTextBoldCursor) editText5).setTextWatchersSuppressed(false, true);
        }
    }

    public void setDispatchBackWhenEmpty(boolean z) {
        this.dispatchBackWhenEmpty = z;
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

    public void setViewToFindFocus(View view) {
        this.viewToFindFocus = view;
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

    public void setEditText(EditText editText) {
        this.editText = editText;
        this.dispatchBackWhenEmpty = false;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = (getWidth() - AndroidUtilities.dp(32.0f)) / 3;
        int height = (getHeight() - AndroidUtilities.dp(42.0f)) / 4;
        for (int i5 = 0; i5 < this.views.length; i5++) {
            int iDp = ((i5 % 3) * (AndroidUtilities.dp(6.0f) + width)) + AndroidUtilities.dp(10.0f);
            int iDp2 = ((i5 / 3) * (AndroidUtilities.dp(6.0f) + height)) + AndroidUtilities.dp(10.0f);
            View view = this.views[i5];
            if (view != null) {
                view.layout(iDp, iDp2, iDp + width, iDp2 + height);
            }
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int width = (getWidth() - AndroidUtilities.dp(32.0f)) / 3;
        int height = (getHeight() - AndroidUtilities.dp(42.0f)) / 4;
        for (View view : this.views) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            }
        }
    }

    private static Drawable getButtonDrawable(int i) {
        boolean z = i < 3;
        int i2 = i % 3;
        boolean z2 = i2 == 0;
        boolean z3 = i2 == 2;
        boolean z4 = i > 8;
        int i3 = Theme.key_listSelector;
        int color = Theme.getColor(i3);
        int alphaComponent = ColorUtils.setAlphaComponent(Theme.getColor(i3), 30);
        float f = 12.0f;
        int iDp = AndroidUtilities.dp((z2 && z) ? 24.0f : 12.0f);
        int iDp2 = AndroidUtilities.dp((z3 && z) ? 24.0f : 12.0f);
        int iDp3 = AndroidUtilities.dp((z3 && z4) ? 24.0f : 12.0f);
        if (z2 && z4) {
            f = 24.0f;
        }
        return Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp2, iDp3, AndroidUtilities.dp(f), color, alphaComponent, alphaComponent);
    }

    public void updateColors() {
        this.backButton.setColorFilter(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
        int i = 0;
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

    private static final class NumberButtonView extends View {
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
            this.numberTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.symbolsTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
        }

        @Override
        protected void onDraw(Canvas canvas) {
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
}

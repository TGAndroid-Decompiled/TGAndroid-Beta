package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import com.android.billingclient.api.zzcv;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;

public final class CustomPhoneKeyboardView extends ViewGroup {
    public static final int $r8$clinit = 0;
    public final AnonymousClass1 backButton;
    public final CustomPhoneKeyboardView$$ExternalSyntheticLambda0 detectLongClick;
    public boolean dispatchBackWhenEmpty;
    public EditText editText;
    public final CustomPhoneKeyboardView$$ExternalSyntheticLambda0 onBackButton;
    public boolean postedLongClick;
    public boolean runningLongClick;
    public View viewToFindFocus;
    public final View[] views;

    public final class AnonymousClass1 extends ImageView {
        public final int $r8$classId = 0;
        public final ViewGroup this$0;
        public Object val$backDetector;

        public AnonymousClass1(CustomPhoneKeyboardView customPhoneKeyboardView, Context context, zzcv zzcvVar) {
            super(context);
            this.this$0 = customPhoneKeyboardView;
            this.val$backDetector = zzcvVar;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        CustomPhoneKeyboardView customPhoneKeyboardView = (CustomPhoneKeyboardView) this.this$0;
                        if (customPhoneKeyboardView.postedLongClick || customPhoneKeyboardView.runningLongClick) {
                            customPhoneKeyboardView.postedLongClick = false;
                            customPhoneKeyboardView.runningLongClick = false;
                            removeCallbacks(customPhoneKeyboardView.detectLongClick);
                            removeCallbacks(customPhoneKeyboardView.onBackButton);
                        }
                    }
                    super.onTouchEvent(motionEvent);
                    return ((GestureDetector) ((zzcv) this.val$backDetector).zza).onTouchEvent(motionEvent);
                default:
                    return super.onTouchEvent(motionEvent);
            }
        }

        public AnonymousClass1(ReactionsContainerLayout reactionsContainerLayout, Context context) {
            super(context);
            this.this$0 = reactionsContainerLayout;
        }
    }

    public final class NumberButtonView extends View {
        public final String mNumber;
        public final String mSymbols;
        public final TextPaint numberTextPaint;
        public final Rect rect;
        public final TextPaint symbolsTextPaint;

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
            textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            textPaint2.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            TextPaint textPaint = this.symbolsTextPaint;
            String str = this.mSymbols;
            float fMeasureText = textPaint.measureText(str);
            TextPaint textPaint2 = this.numberTextPaint;
            String str2 = this.mNumber;
            float fMeasureText2 = textPaint2.measureText(str2);
            int length = str2.length();
            Rect rect = this.rect;
            textPaint2.getTextBounds(str2, 0, length, rect);
            float fHeight = rect.height() / 2.0f;
            textPaint.getTextBounds(str, 0, str.length(), rect);
            float fHeight2 = rect.height() / 2.0f;
            canvas.drawText(str2, (getWidth() * 0.25f) - (fMeasureText2 / 2.0f), (getHeight() / 2.0f) + fHeight, textPaint2);
            canvas.drawText(str, (getWidth() * 0.7f) - (fMeasureText / 2.0f), (getHeight() / 2.0f) + fHeight2, textPaint);
        }
    }

    public CustomPhoneKeyboardView(Context context) {
        String str;
        super(context);
        this.views = new View[12];
        this.onBackButton = new CustomPhoneKeyboardView$$ExternalSyntheticLambda0(this, 0);
        this.detectLongClick = new CustomPhoneKeyboardView$$ExternalSyntheticLambda0(this, 1);
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
                String strValueOf = String.valueOf(i2 != 10 ? i2 + 1 : 0);
                this.views[i2] = new NumberButtonView(context, strValueOf, str);
                this.views[i2].setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(19, this, strValueOf));
                addView(this.views[i2]);
            }
            i2++;
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, context, new zzcv(context, new PopupSwipeBackLayout.AnonymousClass1(this, ViewConfiguration.get(context).getScaledTouchSlop(), 1)));
        this.backButton = anonymousClass1;
        anonymousClass1.setImageResource(R.drawable.msg_clear_input);
        anonymousClass1.setColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        int iDp = AndroidUtilities.dp(11.0f);
        anonymousClass1.setPadding(iDp, iDp, iDp, iDp);
        anonymousClass1.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda267(4));
        this.views[11] = anonymousClass1;
        addView(anonymousClass1);
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

    public static BaseCell.RippleDrawableSafe getButtonDrawable(int i) {
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

    @Override
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM$2 = OKLCH.m$2(32.0f, getWidth(), 3);
        int iM$3 = OKLCH.m$2(42.0f, getHeight(), 4);
        int i5 = 0;
        while (true) {
            View[] viewArr = this.views;
            if (i5 >= viewArr.length) {
                return;
            }
            int iDp = AndroidUtilities.dp(6.0f) + iM$2;
            int iDp2 = AndroidUtilities.dp(10.0f) + (iDp * (i5 % 3));
            int iDp3 = AndroidUtilities.dp(6.0f) + iM$3;
            int iDp4 = AndroidUtilities.dp(10.0f) + (iDp3 * (i5 / 3));
            View view = viewArr[i5];
            if (view != null) {
                view.layout(iDp2, iDp4, iDp2 + iM$2, iDp4 + iM$3);
            }
            i5++;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
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
}

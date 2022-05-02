package org.telegram.p009ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.ColoredImageSpan;
import org.telegram.p009ui.Components.LayoutHelper;

public class UnlockPremiumView extends FrameLayout {
    TextView buttonTextView;

    public UnlockPremiumView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, LayoutHelper.createFrame(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this, context) {
            boolean inc;
            float progress;
            Shader shader;
            Paint paint = new Paint(1);
            Matrix matrix = new Matrix();

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9015575, -1026983, -1792170}, (float[]) null, Shader.TileMode.CLAMP);
                this.shader = linearGradient;
                this.paint.setShader(linearGradient);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                if (this.shader != null) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    this.shader.setLocalMatrix(this.matrix);
                    Matrix matrix = this.matrix;
                    double measuredWidth = getMeasuredWidth();
                    Double.isNaN(measuredWidth);
                    double d = this.progress;
                    Double.isNaN(d);
                    matrix.setTranslate((float) (measuredWidth * 0.1d * d), 0.0f);
                    canvas.drawRoundRect(rectF, AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(4.0f), this.paint);
                    invalidate();
                    if (this.inc) {
                        float f = this.progress + 0.008f;
                        this.progress = f;
                        if (f > 3.0f) {
                            this.inc = false;
                        }
                    } else {
                        float f2 = this.progress - 0.008f;
                        this.progress = f2;
                        if (f2 < 1.0f) {
                            this.inc = true;
                        }
                    }
                }
                super.onDraw(canvas);
            }
        };
        this.buttonTextView = textView;
        textView.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(-1);
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new ColoredImageSpan(ContextCompat.getDrawable(context, C0952R.C0953drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) LocaleController.getString("UnlockPremiumStickers", C0952R.string.UnlockPremiumStickers));
        this.buttonTextView.setText(spannableStringBuilder);
        linearLayout.addView(this.buttonTextView, LayoutHelper.createLinear(-1, 48, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText", resourcesProvider));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString("UnlockPremiumStickersDescription", C0952R.string.UnlockPremiumStickersDescription));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0, 16, 17, 17, 16));
    }
}

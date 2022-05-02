package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.exoplayer2.util.Log;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;

public class UnlockPremiumView extends FrameLayout {
    TextView buttonTextView;

    public UnlockPremiumView(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        String str;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, LayoutHelper.createFrame(-1, -2, 80));
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(this, context) {
            boolean inc;
            int lastW;
            float progress;
            Shader shader;
            Paint paint = new Paint(1);
            Matrix matrix = new Matrix();

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                if (this.lastW != getMeasuredWidth()) {
                    this.lastW = getMeasuredWidth();
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9015575, -1026983, -1792170}, (float[]) null, Shader.TileMode.CLAMP);
                    this.shader = linearGradient;
                    this.paint.setShader(linearGradient);
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
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
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.paint);
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
                super.dispatchDraw(canvas);
            }
        };
        TextView textView = new TextView(context);
        this.buttonTextView = textView;
        textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(-1);
        this.buttonTextView.setTextSize(1, 14.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        if (i == 0) {
            str = LocaleController.getString("UnlockPremiumStickers", R.string.UnlockPremiumStickers);
        } else {
            str = LocaleController.getString("UnlockPremiumReactions", R.string.UnlockPremiumReactions);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new ColoredImageSpan(ContextCompat.getDrawable(context, R.drawable.msg_premium_normal)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) str);
        this.buttonTextView.setText(spannableStringBuilder);
        this.buttonTextView.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, ColorUtils.setAlphaComponent(-1, 120)));
        this.buttonTextView.setOnClickListener(new View.OnClickListener(this) {
            @Override
            public void onClick(View view) {
                Log.d("kek", " fsdsdfsd");
            }
        });
        frameLayout.addView(this.buttonTextView);
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 48, 0, 16, 0, 16, 0));
        TextView textView2 = new TextView(context);
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText", resourcesProvider));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(17);
        if (i == 0) {
            textView2.setText(LocaleController.getString("UnlockPremiumStickersDescription", R.string.UnlockPremiumStickersDescription));
        } else if (i == 1) {
            textView2.setText(LocaleController.getString("UnlockPremiumReactionsDescription", R.string.UnlockPremiumReactionsDescription));
        }
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 0, 16, 17, 17, 16));
    }
}

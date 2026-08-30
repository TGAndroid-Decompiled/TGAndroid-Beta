package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public class z8 extends FrameLayout {
    public final TextView f22662a;
    public final TextView f22663b;
    public final ImageView f22664c;
    public boolean d;
    public boolean e;

    public z8(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        TextView textView = new TextView(context);
        this.f22662a = textView;
        org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, k7.b6.d(-2, -2.0f, i11 | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22663b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20298z6, false));
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(textView2, k7.b6.d(-2, -2.0f, i13 | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f22664c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20067m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        addView(imageView, k7.b6.d(52, 52.0f, (LocaleController.isRTL ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z4) {
        this.f22662a.setText(str);
        this.f22663b.setText(str2);
        this.d = z4;
        this.f22664c.setVisibility(8);
        setWillNotDraw(!z4);
    }

    public final void b(int i10, String str, String str2, boolean z4) {
        int dp;
        int i11;
        int dp2;
        int i12;
        int i13;
        TextView textView = this.f22662a;
        textView.setText(str);
        TextView textView2 = this.f22663b;
        textView2.setText(str2);
        ImageView imageView = this.f22664c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        if (LocaleController.isRTL) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(50.0f);
        }
        if (LocaleController.isRTL) {
            i11 = AndroidUtilities.dp(50.0f);
        } else {
            i11 = 0;
        }
        textView.setPadding(dp, 0, i11, 0);
        if (LocaleController.isRTL) {
            dp2 = 0;
        } else {
            dp2 = AndroidUtilities.dp(50.0f);
        }
        if (LocaleController.isRTL) {
            i12 = AndroidUtilities.dp(50.0f);
        } else {
            i12 = 0;
        }
        if (this.e) {
            i13 = AndroidUtilities.dp(12.0f);
        } else {
            i13 = 0;
        }
        textView2.setPadding(dp2, 0, i12, i13);
        this.d = z4;
        setWillNotDraw(!z4);
    }

    public TextView getTextView() {
        return this.f22662a;
    }

    public TextView getValueTextView() {
        return this.f22663b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22662a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float dp;
        int i10;
        if (this.d && org.telegram.ui.ActionBar.j6.f20025k0 != null) {
            boolean z4 = LocaleController.isRTL;
            float f11 = 20.0f;
            ImageView imageView = this.f22664c;
            if (z4) {
                dp = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f10 = 71.0f;
                } else {
                    f10 = 20.0f;
                }
                dp = AndroidUtilities.dp(f10);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (imageView.getVisibility() == 0) {
                    f11 = 71.0f;
                }
                i10 = AndroidUtilities.dp(f11);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.d ? 1 : 0), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setMultilineDetail(boolean z4) {
        this.e = z4;
        TextView textView = this.f22663b;
        if (z4) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
            return;
        }
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        this.f22663b.setText(charSequence);
    }
}

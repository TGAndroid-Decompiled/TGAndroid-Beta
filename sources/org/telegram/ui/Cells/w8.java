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
import org.telegram.messenger.rl;

public class w8 extends FrameLayout {

    public final TextView f25854a;

    public final TextView f25855b;

    public final ImageView f25856c;
    public boolean d;

    public boolean f25857e;

    public w8(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f25854a = textView;
        rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25855b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        addView(textView2, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f25856c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23215m6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setVisibility(8);
        addView(imageView, h7.z5.d(52, 52.0f, (LocaleController.isRTL ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        this.f25854a.setText(str);
        this.f25855b.setText(str2);
        this.d = z10;
        this.f25856c.setVisibility(8);
        setWillNotDraw(!z10);
    }

    public final void b(int i10, String str, String str2, boolean z10) {
        TextView textView = this.f25854a;
        textView.setText(str);
        TextView textView2 = this.f25855b;
        textView2.setText(str2);
        ImageView imageView = this.f25856c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        textView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(50.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(50.0f) : 0, 0);
        textView2.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(50.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(50.0f) : 0, this.f25857e ? AndroidUtilities.dp(12.0f) : 0);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public TextView getTextView() {
        return this.f25854a;
    }

    public TextView getValueTextView() {
        return this.f25855b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f25854a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fDp;
        int iDp;
        if (!this.d || org.telegram.ui.ActionBar.g6.f23175k0 == null) {
            return;
        }
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = this.f25856c;
        if (z10) {
            fDp = 0.0f;
        } else {
            fDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        } else {
            iDp = 0;
        }
        canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.f25857e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.d ? 1 : 0), 1073741824));
        }
    }

    public void setMultilineDetail(boolean z10) {
        this.f25857e = z10;
        TextView textView = this.f25855b;
        if (z10) {
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
        this.f25855b.setText(charSequence);
    }
}

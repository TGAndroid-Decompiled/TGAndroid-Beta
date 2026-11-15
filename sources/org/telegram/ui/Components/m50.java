package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class m50 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final ImageView f37056a;
    public final TextView f37057b;
    public final TextView f37058c;
    public int d;
    public int f37059e;
    public final p50 f37060f;

    public m50(p50 p50Var, Context context) {
        super(context);
        this.f37060f = p50Var;
        ImageView imageView = new ImageView(context);
        this.f37056a = imageView;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.M(46, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.R7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231609);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, c8.ja.d(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f37057b = textView;
        i5.c.v(textView, 1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
        addView(textView, c8.ja.d(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f37058c = textView2;
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29241y6, null);
        addView(textView2, c8.ja.d(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.R7, false);
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Y7, false);
        ImageView imageView = this.f37056a;
        if (imageView != null) {
            if (x02 != this.d || x03 != this.f37059e) {
                this.d = x02;
                this.f37059e = x03;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.M(46, x02, x03));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

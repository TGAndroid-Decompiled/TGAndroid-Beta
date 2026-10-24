package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hl0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean f37893a;
    public int f37894b;
    public final int f37895c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.u9 f37896f;
    public final TextView h;
    public final TextView f37897n;
    public final ImageView f37898r;
    public boolean f37899s;
    public String v;

    public hl0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f37895c = i10;
        this.d = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.z5.d(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.f37896f = u9Var;
        u9Var.setImageResource(R.drawable.msg2_permissions);
        a();
        frameLayout.addView(u9Var, w7.z5.e(36, 36, 17));
        TextView b10 = w7.d6.b(context, 15.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        this.h = b10;
        b10.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        b10.setEllipsize(truncateAt);
        addView(b10, w7.z5.d(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.k6.f21572y6;
        TextView b11 = w7.d6.b(context, 13.0f, i11, false, null);
        this.f37897n = b11;
        b11.setSingleLine();
        b11.setEllipsize(truncateAt);
        addView(b11, w7.z5.d(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f37898r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, g6Var);
        addView(imageView, w7.z5.d(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f37894b = org.telegram.ui.ActionBar.k6.o1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d));
        this.f37893a = true;
        this.f37896f.setColorFilter(new PorterDuffColorFilter(this.f37894b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f37899s) {
            Paint V0 = org.telegram.ui.ActionBar.k6.V0("paintDivider", this.d);
            if (V0 == null) {
                V0 = org.telegram.ui.ActionBar.k6.f21305k0;
            }
            Paint paint = V0;
            float f10 = 72.0f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 72.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            float measuredHeight = getMeasuredHeight() - 1;
            int width = getWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width - AndroidUtilities.dp(f10), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.u9 u9Var;
        int o12;
        try {
            if (this.f37893a && (u9Var = this.f37896f) != null && (o12 = org.telegram.ui.ActionBar.k6.o1(0.3f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d))) != this.f37894b) {
                this.f37894b = o12;
                u9Var.setColorFilter(new PorterDuffColorFilter(o12, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

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
public final class ql0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean f42866a;
    public int f42867b;
    public final int f42868c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.y9 f42869f;
    public final TextView h;
    public final TextView f42870n;
    public final ImageView f42871r;
    public boolean f42872s;
    public String v;

    public ql0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f42868c = i10;
        this.d = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, org.telegram.ui.Components.gb1.h(36, 36.0f, 19, 18.5f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f42869f = y9Var;
        y9Var.setImageResource(R.drawable.msg2_permissions);
        a();
        frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.i(36, 36, 17));
        TextView L = org.telegram.ui.Components.gb1.L(context, 15.0f, org.telegram.ui.ActionBar.y6.G6, true, null);
        this.h = L;
        L.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        L.setEllipsize(truncateAt);
        addView(L, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 72.0f, 8.0f, 46.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.y6.f23748y6;
        TextView L2 = org.telegram.ui.Components.gb1.L(context, 13.0f, i11, false, null);
        this.f42870n = L2;
        L2.setSingleLine();
        L2.setEllipsize(truncateAt);
        addView(L2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 72.0f, 31.0f, 46.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f42871r = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.f7.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, u6Var);
        addView(imageView, org.telegram.ui.Components.gb1.h(32, 32.0f, 21, 0.0f, 0.0f, 13.0f, 0.0f));
    }

    public final void a() {
        this.f42867b = org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.d));
        this.f42866a = true;
        this.f42869f.setColorFilter(new PorterDuffColorFilter(this.f42867b, PorterDuff.Mode.SRC_IN));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        super.onDraw(canvas);
        if (this.f42872s) {
            Paint V0 = org.telegram.ui.ActionBar.y6.V0("paintDivider", this.d);
            if (V0 == null) {
                V0 = org.telegram.ui.ActionBar.y6.f23478k0;
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
        org.telegram.ui.Components.y9 y9Var;
        int o12;
        try {
            if (this.f42866a && (y9Var = this.f42869f) != null && (o12 = org.telegram.ui.ActionBar.y6.o1(0.3f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, this.d))) != this.f42867b) {
                this.f42867b = o12;
                y9Var.setColorFilter(new PorterDuffColorFilter(o12, PorterDuff.Mode.SRC_IN));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

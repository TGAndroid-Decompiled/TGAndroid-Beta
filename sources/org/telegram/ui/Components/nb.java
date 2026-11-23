package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class nb extends db {
    public final qh0 f37751a;
    public TextView f37752b;
    public int f37753c;

    public nb(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        ?? imageView = new ImageView(context);
        this.f37751a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.na.h(56.0f, 48.0f, 8388627));
        bi.w2 w2Var = new bi.w2(3, context, null);
        w2Var.setDisablePaddingsOffset(true);
        this.f37752b = w2Var;
        org.telegram.messenger.ks.i(w2Var);
        this.f37752b.setSingleLine();
        this.f37752b.setTypeface(Typeface.SANS_SERIF);
        this.f37752b.setTextSize(1, 15.0f);
        this.f37752b.setEllipsize(TextUtils.TruncateAt.END);
        this.f37752b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f37752b, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.G(this.f37752b, org.telegram.ui.ActionBar.n6.xj, i6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        qh0 qh0Var = this.f37751a;
        qh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            qh0Var.h(this.f37753c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        qh0 qh0Var = this.f37751a;
        qh0Var.setAutoRepeat(true);
        qh0Var.g(36, 36, document);
        for (String str : strArr) {
            qh0Var.h(this.f37753c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f37752b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f37751a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.f37751a.setLayoutParams(c8.na.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.f37753c = i7;
        this.f37752b.setTextColor(i7);
    }

    public nb(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}

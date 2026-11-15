package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class fb extends va {
    public final fh0 f34551a;
    public TextView f34552b;
    public int f34553c;

    public fb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        ?? imageView = new ImageView(context);
        this.f34551a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ja.h(56.0f, 48.0f, 8388627));
        bi.w1 w1Var = new bi.w1(3, context, null);
        w1Var.setDisablePaddingsOffset(true);
        this.f34552b = w1Var;
        org.telegram.messenger.ns.i(w1Var);
        this.f34552b.setSingleLine();
        this.f34552b.setTypeface(Typeface.SANS_SERIF);
        this.f34552b.setTextSize(1, 15.0f);
        this.f34552b.setEllipsize(TextUtils.TruncateAt.END);
        this.f34552b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f34552b, c8.ja.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.q6.G(this.f34552b, org.telegram.ui.ActionBar.j6.xj, e6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.wj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        fh0 fh0Var = this.f34551a;
        fh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            fh0Var.h(this.f34553c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        fh0 fh0Var = this.f34551a;
        fh0Var.setAutoRepeat(true);
        fh0Var.g(36, 36, document);
        for (String str : strArr) {
            fh0Var.h(this.f34553c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f34552b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f34551a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.f34551a.setLayoutParams(c8.ja.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.f34553c = i7;
        this.f34552b.setTextColor(i7);
    }

    public fb(int i7, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}

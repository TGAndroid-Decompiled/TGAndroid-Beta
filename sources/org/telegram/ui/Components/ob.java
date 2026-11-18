package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class ob extends eb {
    public final ph0 f38054a;
    public TextView f38055b;
    public int f38056c;

    public ob(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        ?? imageView = new ImageView(context);
        this.f38054a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ma.h(56.0f, 48.0f, 8388627));
        bi.q2 q2Var = new bi.q2(3, context, null);
        q2Var.setDisablePaddingsOffset(true);
        this.f38055b = q2Var;
        org.telegram.messenger.ks.i(q2Var);
        this.f38055b.setSingleLine();
        this.f38055b.setTypeface(Typeface.SANS_SERIF);
        this.f38055b.setTextSize(1, 15.0f);
        this.f38055b.setEllipsize(TextUtils.TruncateAt.END);
        this.f38055b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f38055b, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.G(this.f38055b, org.telegram.ui.ActionBar.n6.xj, i6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.n6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.n6.wj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        ph0 ph0Var = this.f38054a;
        ph0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            ph0Var.h(this.f38056c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ph0 ph0Var = this.f38054a;
        ph0Var.setAutoRepeat(true);
        ph0Var.g(36, 36, document);
        for (String str : strArr) {
            ph0Var.h(this.f38056c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f38055b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f38054a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.f38054a.setLayoutParams(c8.ma.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.f38056c = i7;
        this.f38055b.setTextColor(i7);
    }

    public ob(int i7, int i10, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(context, i6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}

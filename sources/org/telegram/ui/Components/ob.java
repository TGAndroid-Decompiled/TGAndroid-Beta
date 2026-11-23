package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class ob extends eb {
    public final rh0 f38156a;
    public TextView f38157b;
    public int f38158c;

    public ob(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        ?? imageView = new ImageView(context);
        this.f38156a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ma.h(56.0f, 48.0f, 8388627));
        bi.u2 u2Var = new bi.u2(3, context, null);
        u2Var.setDisablePaddingsOffset(true);
        this.f38157b = u2Var;
        org.telegram.messenger.ls.i(u2Var);
        this.f38157b.setSingleLine();
        this.f38157b.setTypeface(Typeface.SANS_SERIF);
        this.f38157b.setTextSize(1, 15.0f);
        this.f38157b.setEllipsize(TextUtils.TruncateAt.END);
        this.f38157b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f38157b, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.G(this.f38157b, org.telegram.ui.ActionBar.m6.xj, h6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        rh0 rh0Var = this.f38156a;
        rh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            rh0Var.h(this.f38158c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        rh0 rh0Var = this.f38156a;
        rh0Var.setAutoRepeat(true);
        rh0Var.g(36, 36, document);
        for (String str : strArr) {
            rh0Var.h(this.f38158c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f38157b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f38156a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.f38156a.setLayoutParams(c8.ma.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.f38158c = i7;
        this.f38157b.setTextColor(i7);
    }

    public ob(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, h6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}

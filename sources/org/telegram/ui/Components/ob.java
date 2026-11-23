package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class ob extends eb {
    public final rh0 f38123a;
    public TextView f38124b;
    public int f38125c;

    public ob(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        ?? imageView = new ImageView(context);
        this.f38123a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.na.h(56.0f, 48.0f, 8388627));
        bi.w2 w2Var = new bi.w2(3, context, null);
        w2Var.setDisablePaddingsOffset(true);
        this.f38124b = w2Var;
        org.telegram.messenger.ls.i(w2Var);
        this.f38124b.setSingleLine();
        this.f38124b.setTypeface(Typeface.SANS_SERIF);
        this.f38124b.setTextSize(1, 15.0f);
        this.f38124b.setEllipsize(TextUtils.TruncateAt.END);
        this.f38124b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f38124b, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.G(this.f38124b, org.telegram.ui.ActionBar.m6.xj, h6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.yj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.wj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        rh0 rh0Var = this.f38123a;
        rh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            rh0Var.h(this.f38125c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        rh0 rh0Var = this.f38123a;
        rh0Var.setAutoRepeat(true);
        rh0Var.g(36, 36, document);
        for (String str : strArr) {
            rh0Var.h(this.f38125c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f38124b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f38123a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.f38123a.setLayoutParams(c8.na.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.f38125c = i7;
        this.f38124b.setTextColor(i7);
    }

    public ob(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, h6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}

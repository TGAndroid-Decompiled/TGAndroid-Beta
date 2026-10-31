package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class eb extends ta {
    public final ei0 f25744a;
    public TextView f25745b;
    public int f25746c;

    public eb(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        ?? imageView = new ImageView(context);
        this.f25744a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.b6.h(56.0f, 48.0f, 8388627));
        kg.t1 t1Var = new kg.t1(1, context, null);
        t1Var.setDisablePaddingsOffset(true);
        this.f25745b = t1Var;
        org.telegram.messenger.zs.i(t1Var);
        this.f25745b.setSingleLine();
        this.f25745b.setTypeface(Typeface.SANS_SERIF);
        this.f25745b.setTextSize(1, 15.0f);
        this.f25745b.setEllipsize(TextUtils.TruncateAt.END);
        this.f25745b.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        addView(this.f25745b, w7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.H(this.f25745b, org.telegram.ui.ActionBar.t6.uj, p6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.t6.tj));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ei0 ei0Var = this.f25744a;
        ei0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ei0Var.h(this.f25746c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ei0 ei0Var = this.f25744a;
        ei0Var.setAutoRepeat(true);
        ei0Var.g(36, 36, document);
        for (String str : strArr) {
            ei0Var.h(this.f25746c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f25745b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f25744a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f25744a.setLayoutParams(w7.b6.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f25746c = i10;
        this.f25745b.setTextColor(i10);
    }

    public eb(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(context, p6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

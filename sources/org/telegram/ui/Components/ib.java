package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class ib extends ya {
    public final fh0 f34650a;
    public TextView f34651b;
    public int f34652c;

    public ib(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        ?? imageView = new ImageView(context);
        this.f34650a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, b8.mf.h(56.0f, 48.0f, 8388627));
        ai.e2 e2Var = new ai.e2(3, context, null);
        e2Var.setDisablePaddingsOffset(true);
        this.f34651b = e2Var;
        org.telegram.messenger.hs.i(e2Var);
        this.f34651b.setSingleLine();
        this.f34651b.setTypeface(Typeface.SANS_SERIF);
        this.f34651b.setTextSize(1, 15.0f);
        this.f34651b.setEllipsize(TextUtils.TruncateAt.END);
        this.f34651b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f34651b, b8.mf.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.H(this.f34651b, org.telegram.ui.ActionBar.k6.uj, e6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
    }

    public final void c(int i3, int i10, int i11, String... strArr) {
        fh0 fh0Var = this.f34650a;
        fh0Var.f(i3, i10, i11, null);
        for (String str : strArr) {
            fh0Var.h(this.f34652c, str);
        }
    }

    public final void d(int i3, String... strArr) {
        c(i3, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        fh0 fh0Var = this.f34650a;
        fh0Var.setAutoRepeat(true);
        fh0Var.g(36, 36, document);
        for (String str : strArr) {
            fh0Var.h(this.f34652c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f34651b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f34650a.d();
    }

    public void setIconPaddingBottom(int i3) {
        this.f34650a.setLayoutParams(b8.mf.i(56.0f, 48 - i3, 8388627, 0.0f, 0.0f, 0.0f, i3));
    }

    public void setTextColor(int i3) {
        this.f34652c = i3;
        this.f34651b.setTextColor(i3);
    }

    public ib(int i3, int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var);
        setBackground(i3);
        setTextColor(i10);
    }
}

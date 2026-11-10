package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class jb extends ya {
    public final ch0 f34882a;
    public TextView f34883b;
    public int f34884c;

    public jb(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        ?? imageView = new ImageView(context);
        this.f34882a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.h(56.0f, 48.0f, 8388627));
        ib ibVar = new ib(0, context, null);
        ibVar.setDisablePaddingsOffset(true);
        this.f34883b = ibVar;
        org.telegram.messenger.qs.i(ibVar);
        this.f34883b.setSingleLine();
        this.f34883b.setTypeface(Typeface.SANS_SERIF);
        this.f34883b.setTextSize(1, 15.0f);
        this.f34883b.setEllipsize(TextUtils.TruncateAt.END);
        this.f34883b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f34883b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.G(this.f34883b, org.telegram.ui.ActionBar.m6.uj, h6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.m6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.m6.tj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        ch0 ch0Var = this.f34882a;
        ch0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            ch0Var.h(this.f34884c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ch0 ch0Var = this.f34882a;
        ch0Var.setAutoRepeat(true);
        ch0Var.g(36, 36, document);
        for (String str : strArr) {
            ch0Var.h(this.f34884c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f34883b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f34882a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.f34882a.setLayoutParams(c8.ha.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.f34884c = i7;
        this.f34883b.setTextColor(i7);
    }

    public jb(int i7, int i10, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(context, h6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}

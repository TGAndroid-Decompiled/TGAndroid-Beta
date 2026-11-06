package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class kb extends za {
    public final ch0 f35251a;
    public TextView f35252b;
    public int f35253c;

    public kb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        ?? imageView = new ImageView(context);
        this.f35251a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.h(56.0f, 48.0f, 8388627));
        jb jbVar = new jb(0, context, null);
        jbVar.setDisablePaddingsOffset(true);
        this.f35252b = jbVar;
        org.telegram.messenger.qs.i(jbVar);
        this.f35252b.setSingleLine();
        this.f35252b.setTypeface(Typeface.SANS_SERIF);
        this.f35252b.setTextSize(1, 15.0f);
        this.f35252b.setEllipsize(TextUtils.TruncateAt.END);
        this.f35252b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f35252b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.H(this.f35252b, org.telegram.ui.ActionBar.k6.uj, f6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.tj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        ch0 ch0Var = this.f35251a;
        ch0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            ch0Var.h(this.f35253c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ch0 ch0Var = this.f35251a;
        ch0Var.setAutoRepeat(true);
        ch0Var.g(36, 36, document);
        for (String str : strArr) {
            ch0Var.h(this.f35253c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f35252b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f35251a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.f35251a.setLayoutParams(c8.ha.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.f35253c = i7;
        this.f35252b.setTextColor(i7);
    }

    public kb(int i7, int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}

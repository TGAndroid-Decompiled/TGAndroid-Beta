package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public class kb extends za {
    public final dh0 f35291a;
    public TextView f35292b;
    public int f35293c;

    public kb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        ?? imageView = new ImageView(context);
        this.f35291a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, c8.ha.h(56.0f, 48.0f, 8388627));
        jb jbVar = new jb(0, context, null);
        jbVar.setDisablePaddingsOffset(true);
        this.f35292b = jbVar;
        org.telegram.messenger.qs.i(jbVar);
        this.f35292b.setSingleLine();
        this.f35292b.setTypeface(Typeface.SANS_SERIF);
        this.f35292b.setTextSize(1, 15.0f);
        this.f35292b.setEllipsize(TextUtils.TruncateAt.END);
        this.f35292b.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        addView(this.f35292b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.s6.G(this.f35292b, org.telegram.ui.ActionBar.l6.uj, g6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.l6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.l6.tj));
    }

    public final void c(int i7, int i10, int i11, String... strArr) {
        dh0 dh0Var = this.f35291a;
        dh0Var.f(i7, i10, i11, null);
        for (String str : strArr) {
            dh0Var.h(this.f35293c, str);
        }
    }

    public final void d(int i7, String... strArr) {
        c(i7, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        dh0 dh0Var = this.f35291a;
        dh0Var.setAutoRepeat(true);
        dh0Var.g(36, 36, document);
        for (String str : strArr) {
            dh0Var.h(this.f35293c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f35292b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f35291a.d();
    }

    public void setIconPaddingBottom(int i7) {
        this.f35291a.setLayoutParams(c8.ha.i(56.0f, 48 - i7, 8388627, 0.0f, 0.0f, 0.0f, i7));
    }

    public void setTextColor(int i7) {
        this.f35293c = i7;
        this.f35292b.setTextColor(i7);
    }

    public kb(int i7, int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var);
        setBackground(i7);
        setTextColor(i10);
    }
}

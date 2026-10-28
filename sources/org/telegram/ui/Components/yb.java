package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public class yb extends nb {
    public final bk0 f35027a;
    public TextView f35028b;
    public int f35029c;

    public yb(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        ?? imageView = new ImageView(context);
        this.f35027a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, kb1.l(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.f35028b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.f35028b.setSingleLine();
        this.f35028b.setTypeface(Typeface.SANS_SERIF);
        this.f35028b.setTextSize(1, 15.0f);
        this.f35028b.setEllipsize(TextUtils.TruncateAt.END);
        this.f35028b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f35028b, kb1.m(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.f7.H(this.f35028b, org.telegram.ui.ActionBar.y6.Gi, u6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bk0 bk0Var = this.f35027a;
        bk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bk0Var.h(this.f35029c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        bk0 bk0Var = this.f35027a;
        bk0Var.setAutoRepeat(true);
        bk0Var.g(36, 36, document);
        for (String str : strArr) {
            bk0Var.h(this.f35029c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f35028b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f35027a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f35027a.setLayoutParams(kb1.m(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f35029c = i10;
        this.f35028b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, u6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

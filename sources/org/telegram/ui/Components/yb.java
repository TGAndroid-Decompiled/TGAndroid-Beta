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
    public final ak0 f35000a;
    public TextView f35001b;
    public int f35002c;

    public yb(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        ?? imageView = new ImageView(context);
        this.f35000a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, gb1.l(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.f35001b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.f35001b.setSingleLine();
        this.f35001b.setTypeface(Typeface.SANS_SERIF);
        this.f35001b.setTextSize(1, 15.0f);
        this.f35001b.setEllipsize(TextUtils.TruncateAt.END);
        this.f35001b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f35001b, gb1.m(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.f7.H(this.f35001b, org.telegram.ui.ActionBar.y6.Gi, u6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ak0 ak0Var = this.f35000a;
        ak0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ak0Var.h(this.f35002c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ak0 ak0Var = this.f35000a;
        ak0Var.setAutoRepeat(true);
        ak0Var.g(36, 36, document);
        for (String str : strArr) {
            ak0Var.h(this.f35002c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f35001b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f35000a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f35000a.setLayoutParams(gb1.m(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f35002c = i10;
        this.f35001b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, u6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

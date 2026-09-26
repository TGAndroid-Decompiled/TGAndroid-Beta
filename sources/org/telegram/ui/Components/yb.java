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
    public final mj0 f30615a;
    public TextView f30616b;
    public int f30617c;

    public yb(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        ?? imageView = new ImageView(context);
        this.f30615a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.h(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.f30616b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.f30616b.setSingleLine();
        this.f30616b.setTypeface(Typeface.SANS_SERIF);
        this.f30616b.setTextSize(1, 15.0f);
        this.f30616b.setEllipsize(TextUtils.TruncateAt.END);
        this.f30616b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f30616b, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f30616b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        mj0 mj0Var = this.f30615a;
        mj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            mj0Var.h(this.f30617c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        mj0 mj0Var = this.f30615a;
        mj0Var.setAutoRepeat(true);
        mj0Var.g(36, 36, document);
        for (String str : strArr) {
            mj0Var.h(this.f30617c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30616b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f30615a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f30615a.setLayoutParams(w7.y5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f30617c = i10;
        this.f30616b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

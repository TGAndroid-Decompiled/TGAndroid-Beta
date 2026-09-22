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
public class xb extends mb {
    public final nj0 f30298a;
    public TextView f30299b;
    public int f30300c;

    public xb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        ?? imageView = new ImageView(context);
        this.f30298a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.h(56.0f, 48.0f, 8388627));
        wb wbVar = new wb(context, 0, null);
        wbVar.setDisablePaddingsOffset(true);
        this.f30299b = wbVar;
        NotificationCenter.listenEmojiLoading(wbVar);
        this.f30299b.setSingleLine();
        this.f30299b.setTypeface(Typeface.SANS_SERIF);
        this.f30299b.setTextSize(1, 15.0f);
        this.f30299b.setEllipsize(TextUtils.TruncateAt.END);
        this.f30299b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f30299b, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f30299b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        nj0 nj0Var = this.f30298a;
        nj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            nj0Var.h(this.f30300c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        nj0 nj0Var = this.f30298a;
        nj0Var.setAutoRepeat(true);
        nj0Var.g(36, 36, document);
        for (String str : strArr) {
            nj0Var.h(this.f30300c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30299b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f30298a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f30298a.setLayoutParams(w7.y5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f30300c = i10;
        this.f30299b.setTextColor(i10);
    }

    public xb(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

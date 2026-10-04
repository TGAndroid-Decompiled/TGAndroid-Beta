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
public class zb extends ob {
    public final nj0 f33471a;
    public TextView f33472b;
    public int f33473c;

    public zb(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        ?? imageView = new ImageView(context);
        this.f33471a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.h(56.0f, 48.0f, 8388627));
        yb ybVar = new yb(context, 0, null);
        ybVar.setDisablePaddingsOffset(true);
        this.f33472b = ybVar;
        NotificationCenter.listenEmojiLoading(ybVar);
        this.f33472b.setSingleLine();
        this.f33472b.setTypeface(Typeface.SANS_SERIF);
        this.f33472b.setTextSize(1, 15.0f);
        this.f33472b.setEllipsize(TextUtils.TruncateAt.END);
        this.f33472b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f33472b, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f33472b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        nj0 nj0Var = this.f33471a;
        nj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            nj0Var.h(this.f33473c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        nj0 nj0Var = this.f33471a;
        nj0Var.setAutoRepeat(true);
        nj0Var.g(36, 36, document);
        for (String str : strArr) {
            nj0Var.h(this.f33473c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f33472b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f33471a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f33471a.setLayoutParams(w7.z5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f33473c = i10;
        this.f33472b.setTextColor(i10);
    }

    public zb(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

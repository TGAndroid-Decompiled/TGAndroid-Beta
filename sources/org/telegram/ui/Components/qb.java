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
public class qb extends eb {
    public final lj0 f30358a;
    public TextView f30359b;
    public int f30360c;

    public qb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        ?? imageView = new ImageView(context);
        this.f30358a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.c6.h(56.0f, 48.0f, 8388627));
        fg.a2 a2Var = new fg.a2(context, 2, null);
        a2Var.setDisablePaddingsOffset(true);
        this.f30359b = a2Var;
        NotificationCenter.listenEmojiLoading(a2Var);
        this.f30359b.setSingleLine();
        this.f30359b.setTypeface(Typeface.SANS_SERIF);
        this.f30359b.setTextSize(1, 15.0f);
        this.f30359b.setEllipsize(TextUtils.TruncateAt.END);
        this.f30359b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f30359b, k7.c6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f30359b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        lj0 lj0Var = this.f30358a;
        lj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            lj0Var.h(this.f30360c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        lj0 lj0Var = this.f30358a;
        lj0Var.setAutoRepeat(true);
        lj0Var.g(36, 36, document);
        for (String str : strArr) {
            lj0Var.h(this.f30360c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30359b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f30358a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f30358a.setLayoutParams(k7.c6.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f30360c = i10;
        this.f30359b.setTextColor(i10);
    }

    public qb(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

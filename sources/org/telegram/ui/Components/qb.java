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
    public final kj0 f30374a;
    public TextView f30375b;
    public int f30376c;

    public qb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        ?? imageView = new ImageView(context);
        this.f30374a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.c6.h(56.0f, 48.0f, 8388627));
        fg.a2 a2Var = new fg.a2(context, 2, null);
        a2Var.setDisablePaddingsOffset(true);
        this.f30375b = a2Var;
        NotificationCenter.listenEmojiLoading(a2Var);
        this.f30375b.setSingleLine();
        this.f30375b.setTypeface(Typeface.SANS_SERIF);
        this.f30375b.setTextSize(1, 15.0f);
        this.f30375b.setEllipsize(TextUtils.TruncateAt.END);
        this.f30375b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f30375b, k7.c6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f30375b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        kj0 kj0Var = this.f30374a;
        kj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            kj0Var.h(this.f30376c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        kj0 kj0Var = this.f30374a;
        kj0Var.setAutoRepeat(true);
        kj0Var.g(36, 36, document);
        for (String str : strArr) {
            kj0Var.h(this.f30376c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30375b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f30374a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f30374a.setLayoutParams(k7.c6.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f30376c = i10;
        this.f30375b.setTextColor(i10);
    }

    public qb(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

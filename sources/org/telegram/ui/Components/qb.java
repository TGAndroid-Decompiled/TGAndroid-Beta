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
    public final jj0 f28136a;
    public TextView f28137b;
    public int f28138c;

    public qb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        ?? imageView = new ImageView(context);
        this.f28136a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, k7.b6.h(56.0f, 48.0f, 8388627));
        eg.b2 b2Var = new eg.b2(context, 2, null);
        b2Var.setDisablePaddingsOffset(true);
        this.f28137b = b2Var;
        NotificationCenter.listenEmojiLoading(b2Var);
        this.f28137b.setSingleLine();
        this.f28137b.setTypeface(Typeface.SANS_SERIF);
        this.f28137b.setTextSize(1, 15.0f);
        this.f28137b.setEllipsize(TextUtils.TruncateAt.END);
        this.f28137b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f28137b, k7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f28137b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        jj0 jj0Var = this.f28136a;
        jj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            jj0Var.h(this.f28138c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        jj0 jj0Var = this.f28136a;
        jj0Var.setAutoRepeat(true);
        jj0Var.g(36, 36, document);
        for (String str : strArr) {
            jj0Var.h(this.f28138c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f28137b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f28136a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f28136a.setLayoutParams(k7.b6.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f28138c = i10;
        this.f28137b.setTextColor(i10);
    }

    public qb(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

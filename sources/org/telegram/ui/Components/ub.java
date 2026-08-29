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
public class ub extends jb {
    public final aj0 f33184a;
    public TextView f33185b;
    public int f33186c;

    public ub(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        ?? imageView = new ImageView(context);
        this.f33184a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, i7.f6.h(56.0f, 48.0f, 8388627));
        cg.c2 c2Var = new cg.c2(context, 2, null);
        c2Var.setDisablePaddingsOffset(true);
        this.f33185b = c2Var;
        NotificationCenter.listenEmojiLoading(c2Var);
        this.f33185b.setSingleLine();
        this.f33185b.setTypeface(Typeface.SANS_SERIF);
        this.f33185b.setTextSize(1, 15.0f);
        this.f33185b.setEllipsize(TextUtils.TruncateAt.END);
        this.f33185b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f33185b, i7.f6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f33185b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        aj0 aj0Var = this.f33184a;
        aj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            aj0Var.h(this.f33186c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        aj0 aj0Var = this.f33184a;
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        for (String str : strArr) {
            aj0Var.h(this.f33186c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f33185b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f33184a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f33184a.setLayoutParams(i7.f6.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f33186c = i10;
        this.f33185b.setTextColor(i10);
    }

    public ub(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

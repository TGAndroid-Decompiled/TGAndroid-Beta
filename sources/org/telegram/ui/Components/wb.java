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
public class wb extends lb {
    public final aj0 f29681a;
    public TextView f29682b;
    public int f29683c;

    public wb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        ?? imageView = new ImageView(context);
        this.f29681a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        vb vbVar = new vb(context, 0, null);
        vbVar.setDisablePaddingsOffset(true);
        this.f29682b = vbVar;
        NotificationCenter.listenEmojiLoading(vbVar);
        this.f29682b.setSingleLine();
        this.f29682b.setTypeface(Typeface.SANS_SERIF);
        this.f29682b.setTextSize(1, 15.0f);
        this.f29682b.setEllipsize(TextUtils.TruncateAt.END);
        this.f29682b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f29682b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f29682b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        aj0 aj0Var = this.f29681a;
        aj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            aj0Var.h(this.f29683c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        aj0 aj0Var = this.f29681a;
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        for (String str : strArr) {
            aj0Var.h(this.f29683c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29682b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f29681a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f29681a.setLayoutParams(w7.x5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f29683c = i10;
        this.f29682b.setTextColor(i10);
    }

    public wb(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

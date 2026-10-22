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
    public final yj0 f32627a;
    public TextView f32628b;
    public int f32629c;

    public yb(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        ?? imageView = new ImageView(context);
        this.f32627a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.h(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.f32628b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.f32628b.setSingleLine();
        this.f32628b.setTypeface(Typeface.SANS_SERIF);
        this.f32628b.setTextSize(1, 15.0f);
        this.f32628b.setEllipsize(TextUtils.TruncateAt.END);
        this.f32628b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f32628b, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f32628b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        yj0 yj0Var = this.f32627a;
        yj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            yj0Var.h(this.f32629c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        yj0 yj0Var = this.f32627a;
        yj0Var.setAutoRepeat(true);
        yj0Var.g(36, 36, document);
        for (String str : strArr) {
            yj0Var.h(this.f32629c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f32628b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f32627a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f32627a.setLayoutParams(w7.z5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f32629c = i10;
        this.f32628b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

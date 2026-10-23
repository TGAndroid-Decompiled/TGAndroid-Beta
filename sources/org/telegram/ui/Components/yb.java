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
    public final bk0 f32862a;
    public TextView f32863b;
    public int f32864c;

    public yb(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        ?? imageView = new ImageView(context);
        this.f32862a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.z5.h(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.f32863b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.f32863b.setSingleLine();
        this.f32863b.setTypeface(Typeface.SANS_SERIF);
        this.f32863b.setTextSize(1, 15.0f);
        this.f32863b.setEllipsize(TextUtils.TruncateAt.END);
        this.f32863b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f32863b, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.I(this.f32863b, org.telegram.ui.ActionBar.k6.Gi, g6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.k6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bk0 bk0Var = this.f32862a;
        bk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bk0Var.h(this.f32864c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        bk0 bk0Var = this.f32862a;
        bk0Var.setAutoRepeat(true);
        bk0Var.g(36, 36, document);
        for (String str : strArr) {
            bk0Var.h(this.f32864c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f32863b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f32862a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f32862a.setLayoutParams(w7.z5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f32864c = i10;
        this.f32863b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, g6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

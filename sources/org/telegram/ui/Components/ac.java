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
public class ac extends pb {
    public final hk0 f24487a;
    public TextView f24488b;
    public int f24489c;

    public ac(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        ?? imageView = new ImageView(context);
        this.f24487a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        zb zbVar = new zb(context, 0, null);
        zbVar.setDisablePaddingsOffset(true);
        this.f24488b = zbVar;
        NotificationCenter.listenEmojiLoading(zbVar);
        this.f24488b.setSingleLine();
        this.f24488b.setTypeface(Typeface.SANS_SERIF);
        this.f24488b.setTextSize(1, 15.0f);
        this.f24488b.setEllipsize(TextUtils.TruncateAt.END);
        this.f24488b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f24488b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f24488b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        hk0 hk0Var = this.f24487a;
        hk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            hk0Var.h(this.f24489c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        hk0 hk0Var = this.f24487a;
        hk0Var.setAutoRepeat(true);
        hk0Var.g(36, 36, document);
        for (String str : strArr) {
            hk0Var.h(this.f24489c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f24488b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f24487a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f24487a.setLayoutParams(w7.x5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f24489c = i10;
        this.f24488b.setTextColor(i10);
    }

    public ac(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

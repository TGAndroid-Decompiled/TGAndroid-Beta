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
    public final bk0 f23512a;
    public TextView f23513b;
    public int f23514c;

    public ac(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        ?? imageView = new ImageView(context);
        this.f23512a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.a6.h(56.0f, 48.0f, 8388627));
        zb zbVar = new zb(context, 0, null);
        zbVar.setDisablePaddingsOffset(true);
        this.f23513b = zbVar;
        NotificationCenter.listenEmojiLoading(zbVar);
        this.f23513b.setSingleLine();
        this.f23513b.setTypeface(Typeface.SANS_SERIF);
        this.f23513b.setTextSize(1, 15.0f);
        this.f23513b.setEllipsize(TextUtils.TruncateAt.END);
        this.f23513b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f23513b, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f23513b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bk0 bk0Var = this.f23512a;
        bk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bk0Var.h(this.f23514c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        bk0 bk0Var = this.f23512a;
        bk0Var.setAutoRepeat(true);
        bk0Var.g(36, 36, document);
        for (String str : strArr) {
            bk0Var.h(this.f23514c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f23513b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f23512a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f23512a.setLayoutParams(w7.a6.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f23514c = i10;
        this.f23513b.setTextColor(i10);
    }

    public ac(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

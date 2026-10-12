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
    public final ik0 f24275a;
    public TextView f24276b;
    public int f24277c;

    public ac(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        ?? imageView = new ImageView(context);
        this.f24275a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.w5.h(56.0f, 48.0f, 8388627));
        zb zbVar = new zb(context, 0, null);
        zbVar.setDisablePaddingsOffset(true);
        this.f24276b = zbVar;
        NotificationCenter.listenEmojiLoading(zbVar);
        this.f24276b.setSingleLine();
        this.f24276b.setTypeface(Typeface.SANS_SERIF);
        this.f24276b.setTextSize(1, 15.0f);
        this.f24276b.setEllipsize(TextUtils.TruncateAt.END);
        this.f24276b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f24276b, w7.w5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f24276b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ik0 ik0Var = this.f24275a;
        ik0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ik0Var.h(this.f24277c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ik0 ik0Var = this.f24275a;
        ik0Var.setAutoRepeat(true);
        ik0Var.g(36, 36, document);
        for (String str : strArr) {
            ik0Var.h(this.f24277c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f24276b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f24275a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f24275a.setLayoutParams(w7.w5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f24277c = i10;
        this.f24276b.setTextColor(i10);
    }

    public ac(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

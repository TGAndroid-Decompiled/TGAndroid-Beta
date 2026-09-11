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
    public final aj0 f32875a;
    public TextView f32876b;
    public int f32877c;

    public yb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        ?? imageView = new ImageView(context);
        this.f32875a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.f32876b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.f32876b.setSingleLine();
        this.f32876b.setTypeface(Typeface.SANS_SERIF);
        this.f32876b.setTextSize(1, 15.0f);
        this.f32876b.setEllipsize(TextUtils.TruncateAt.END);
        this.f32876b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f32876b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f32876b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        aj0 aj0Var = this.f32875a;
        aj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            aj0Var.h(this.f32877c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        aj0 aj0Var = this.f32875a;
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        for (String str : strArr) {
            aj0Var.h(this.f32877c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f32876b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f32875a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f32875a.setLayoutParams(w7.x5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f32877c = i10;
        this.f32876b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

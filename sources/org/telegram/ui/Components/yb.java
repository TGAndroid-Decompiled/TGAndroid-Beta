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
    public final aj0 f32902a;
    public TextView f32903b;
    public int f32904c;

    public yb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        ?? imageView = new ImageView(context);
        this.f32902a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.f32903b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.f32903b.setSingleLine();
        this.f32903b.setTypeface(Typeface.SANS_SERIF);
        this.f32903b.setTextSize(1, 15.0f);
        this.f32903b.setEllipsize(TextUtils.TruncateAt.END);
        this.f32903b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f32903b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f32903b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        aj0 aj0Var = this.f32902a;
        aj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            aj0Var.h(this.f32904c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        aj0 aj0Var = this.f32902a;
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        for (String str : strArr) {
            aj0Var.h(this.f32904c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f32903b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f32902a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f32902a.setLayoutParams(w7.x5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f32904c = i10;
        this.f32903b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

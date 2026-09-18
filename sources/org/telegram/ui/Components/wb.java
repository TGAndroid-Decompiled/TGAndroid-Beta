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
    public final bj0 f29625a;
    public TextView f29626b;
    public int f29627c;

    public wb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        ?? imageView = new ImageView(context);
        this.f29625a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        vb vbVar = new vb(context, 0, null);
        vbVar.setDisablePaddingsOffset(true);
        this.f29626b = vbVar;
        NotificationCenter.listenEmojiLoading(vbVar);
        this.f29626b.setSingleLine();
        this.f29626b.setTypeface(Typeface.SANS_SERIF);
        this.f29626b.setTextSize(1, 15.0f);
        this.f29626b.setEllipsize(TextUtils.TruncateAt.END);
        this.f29626b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f29626b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f29626b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bj0 bj0Var = this.f29625a;
        bj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bj0Var.h(this.f29627c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        bj0 bj0Var = this.f29625a;
        bj0Var.setAutoRepeat(true);
        bj0Var.g(36, 36, document);
        for (String str : strArr) {
            bj0Var.h(this.f29627c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29626b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f29625a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f29625a.setLayoutParams(w7.x5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f29627c = i10;
        this.f29626b.setTextColor(i10);
    }

    public wb(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

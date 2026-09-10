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
public class xb extends mb {
    public final kj0 f28999a;
    public TextView f29000b;
    public int f29001c;

    public xb(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        ?? imageView = new ImageView(context);
        this.f28999a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.a6.h(56.0f, 48.0f, 8388627));
        wb wbVar = new wb(context, 0, null);
        wbVar.setDisablePaddingsOffset(true);
        this.f29000b = wbVar;
        NotificationCenter.listenEmojiLoading(wbVar);
        this.f29000b.setSingleLine();
        this.f29000b.setTypeface(Typeface.SANS_SERIF);
        this.f29000b.setTextSize(1, 15.0f);
        this.f29000b.setEllipsize(TextUtils.TruncateAt.END);
        this.f29000b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f29000b, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f29000b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        kj0 kj0Var = this.f28999a;
        kj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            kj0Var.h(this.f29001c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        kj0 kj0Var = this.f28999a;
        kj0Var.setAutoRepeat(true);
        kj0Var.g(36, 36, document);
        for (String str : strArr) {
            kj0Var.h(this.f29001c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f29000b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f28999a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f28999a.setLayoutParams(w7.a6.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f29001c = i10;
        this.f29000b.setTextColor(i10);
    }

    public xb(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, f6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

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
public class zb extends ob {
    public final oj0 f30941a;
    public TextView f30942b;
    public int f30943c;

    public zb(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        ?? imageView = new ImageView(context);
        this.f30941a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.y5.h(56.0f, 48.0f, 8388627));
        yb ybVar = new yb(context, 0, null);
        ybVar.setDisablePaddingsOffset(true);
        this.f30942b = ybVar;
        NotificationCenter.listenEmojiLoading(ybVar);
        this.f30942b.setSingleLine();
        this.f30942b.setTypeface(Typeface.SANS_SERIF);
        this.f30942b.setTextSize(1, 15.0f);
        this.f30942b.setEllipsize(TextUtils.TruncateAt.END);
        this.f30942b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f30942b, w7.y5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f30942b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        oj0 oj0Var = this.f30941a;
        oj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            oj0Var.h(this.f30943c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        oj0 oj0Var = this.f30941a;
        oj0Var.setAutoRepeat(true);
        oj0Var.g(36, 36, document);
        for (String str : strArr) {
            oj0Var.h(this.f30943c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f30942b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f30941a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f30941a.setLayoutParams(w7.y5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f30943c = i10;
        this.f30942b.setTextColor(i10);
    }

    public zb(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

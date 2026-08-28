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
public class ob extends eb {
    public final pi0 f31342a;
    public TextView f31343b;
    public int f31344c;

    public ob(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        ?? imageView = new ImageView(context);
        this.f31342a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, g7.e6.h(56.0f, 48.0f, 8388627));
        fh.e4 e4Var = new fh.e4(context, 1, null);
        e4Var.setDisablePaddingsOffset(true);
        this.f31343b = e4Var;
        NotificationCenter.listenEmojiLoading(e4Var);
        this.f31343b.setSingleLine();
        this.f31343b.setTypeface(Typeface.SANS_SERIF);
        this.f31343b.setTextSize(1, 15.0f);
        this.f31343b.setEllipsize(TextUtils.TruncateAt.END);
        this.f31343b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f31343b, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f31343b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
    }

    public final void c(int i9, int i10, int i11, String... strArr) {
        pi0 pi0Var = this.f31342a;
        pi0Var.f(i9, i10, i11, null);
        for (String str : strArr) {
            pi0Var.h(this.f31344c, str);
        }
    }

    public final void d(int i9, String... strArr) {
        c(i9, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        pi0 pi0Var = this.f31342a;
        pi0Var.setAutoRepeat(true);
        pi0Var.g(36, 36, document);
        for (String str : strArr) {
            pi0Var.h(this.f31344c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f31343b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f31342a.d();
    }

    public void setIconPaddingBottom(int i9) {
        this.f31342a.setLayoutParams(g7.e6.i(56.0f, 48 - i9, 8388627, 0.0f, 0.0f, 0.0f, i9));
    }

    public void setTextColor(int i9) {
        this.f31344c = i9;
        this.f31343b.setTextColor(i9);
    }

    public ob(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, b6Var);
        setBackground(i9);
        setTextColor(i10);
    }
}

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
public class bc extends qb {
    public final fk0 f24966a;
    public TextView f24967b;
    public int f24968c;

    public bc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        ?? imageView = new ImageView(context);
        this.f24966a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView((View) imageView, w7.x5.h(56.0f, 48.0f, 8388627));
        ac acVar = new ac(context, 0, null);
        acVar.setDisablePaddingsOffset(true);
        this.f24967b = acVar;
        NotificationCenter.listenEmojiLoading(acVar);
        this.f24967b.setSingleLine();
        this.f24967b.setTypeface(Typeface.SANS_SERIF);
        this.f24967b.setTextSize(1, 15.0f);
        this.f24967b.setEllipsize(TextUtils.TruncateAt.END);
        this.f24967b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.f24967b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.f24967b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        fk0 fk0Var = this.f24966a;
        fk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            fk0Var.h(this.f24968c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        fk0 fk0Var = this.f24966a;
        fk0Var.setAutoRepeat(true);
        fk0Var.g(36, 36, document);
        for (String str : strArr) {
            fk0Var.h(this.f24968c, str);
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f24967b.getText();
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f24966a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.f24966a.setLayoutParams(w7.x5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.f24968c = i10;
        this.f24967b.setTextColor(i10);
    }

    public bc(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}

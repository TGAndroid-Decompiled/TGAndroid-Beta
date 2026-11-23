package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f30993a;
    public final TextView f30994b;
    public final org.telegram.ui.Components.p9 f30995c;
    public final ImageView d;
    public final org.telegram.ui.Components.a9 f30996e;
    public int f30997f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.f30996e = a9Var;
        a9Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
        this.f30995c = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(p9Var, c8.na.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(activity);
        this.f30993a = n5Var;
        n5Var.setTextSize(15);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setEllipsizeByGradient(true);
        n5Var.setMaxLines(1);
        n5Var.setGravity(19);
        if (z10) {
            addView(n5Var, c8.na.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29480eh, null);
            n5Var.l(gd.N0(2131743136, null), false);
            TextView textView = new TextView(activity);
            this.f30994b = textView;
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29497fh, null);
            m10.q(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(org.telegram.messenger.g0.L(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, c8.na.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(n5Var, c8.na.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(2131230862);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.H9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.na.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f30997f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30994b == null) {
            org.telegram.ui.ActionBar.u6.X(this.f30993a, org.telegram.ui.ActionBar.n6.G9, null);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11;
        float f10;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f30994b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
                float L = org.telegram.messenger.g0.L(196.0f);
                if (imageView != null) {
                    i11 = 50;
                } else {
                    i11 = 0;
                }
                float L2 = org.telegram.messenger.g0.L(i11 + 69);
                org.telegram.ui.ActionBar.n5 n5Var = this.f30993a;
                float measureText = n5Var.getTextPaint().measureText(n5Var.getText().toString());
                if (textView != null) {
                    f10 = textView.getPaint().measureText(textView.getText().toString());
                } else {
                    f10 = 0.0f;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(measureText, f10) + L2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            }
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        String str;
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.p9 p9Var = this.f30995c;
        TextView textView = this.f30994b;
        org.telegram.ui.Components.a9 a9Var = this.f30996e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            a9Var.r(user);
            textView.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
            p9Var.f(user, a9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        a9Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        p9Var.f(chat, a9Var);
    }
}

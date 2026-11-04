package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f29461a;
    public final TextView f29462b;
    public final org.telegram.ui.Components.k9 f29463c;
    public final ImageView d;
    public final org.telegram.ui.Components.u8 f29464e;
    public int f29465f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f29464e = u8Var;
        u8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
        this.f29463c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(k9Var, mf.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.f29461a = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setEllipsizeByGradient(true);
        k5Var.setMaxLines(1);
        k5Var.setGravity(19);
        if (z10) {
            addView(k5Var, mf.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27853bh, null);
            k5Var.l(bd.M0(2131743396, null), false);
            TextView textView = new TextView(activity);
            this.f29462b = textView;
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27870ch, null);
            org.telegram.messenger.camera.q.n(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(org.telegram.messenger.g0.L(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, mf.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(k5Var, mf.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(2131230862);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.H9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, mf.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f29465f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29462b == null) {
            org.telegram.ui.ActionBar.r6.Y(this.f29461a, org.telegram.ui.ActionBar.k6.G9, null);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        TextView textView;
        int i11;
        float f10;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f29462b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
                float L = org.telegram.messenger.g0.L(196.0f);
                if (imageView != null) {
                    i11 = 50;
                } else {
                    i11 = 0;
                }
                float L2 = org.telegram.messenger.g0.L(i11 + 69);
                org.telegram.ui.ActionBar.k5 k5Var = this.f29461a;
                float measureText = k5Var.getTextPaint().measureText(k5Var.getText().toString());
                if (textView != null) {
                    f10 = textView.getPaint().measureText(textView.getText().toString());
                } else {
                    f10 = 0.0f;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(measureText, f10) + L2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
                return;
            }
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        String str;
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.k9 k9Var = this.f29463c;
        TextView textView = this.f29462b;
        org.telegram.ui.Components.u8 u8Var = this.f29464e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            u8Var.r(user);
            textView.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
            k9Var.e(user, u8Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        u8Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        k9Var.e(chat, u8Var);
    }
}

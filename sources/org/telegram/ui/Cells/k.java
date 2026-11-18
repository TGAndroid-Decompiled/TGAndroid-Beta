package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 f30904a;
    public final TextView f30905b;
    public final org.telegram.ui.Components.q9 f30906c;
    public final ImageView d;
    public final org.telegram.ui.Components.b9 f30907e;
    public int f30908f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.f30907e = b9Var;
        b9Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(activity);
        this.f30906c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(q9Var, c8.ma.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(activity);
        this.f30904a = n5Var;
        n5Var.setTextSize(15);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setEllipsizeByGradient(true);
        n5Var.setMaxLines(1);
        n5Var.setGravity(19);
        if (z10) {
            addView(n5Var, c8.ma.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.f29423eh, null);
            n5Var.l(gd.M0(2131743149, null), false);
            TextView textView = new TextView(activity);
            this.f30905b = textView;
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29440fh, null);
            n10.q(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(org.telegram.messenger.g0.L(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, c8.ma.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(n5Var, c8.ma.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(2131230862);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.H9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ma.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f30908f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30905b == null) {
            org.telegram.ui.ActionBar.u6.X(this.f30904a, org.telegram.ui.ActionBar.n6.G9, null);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11;
        float f10;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f30905b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
                float L = org.telegram.messenger.g0.L(196.0f);
                if (imageView != null) {
                    i11 = 50;
                } else {
                    i11 = 0;
                }
                float L2 = org.telegram.messenger.g0.L(i11 + 69);
                org.telegram.ui.ActionBar.n5 n5Var = this.f30904a;
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
        org.telegram.ui.Components.q9 q9Var = this.f30906c;
        TextView textView = this.f30905b;
        org.telegram.ui.Components.b9 b9Var = this.f30907e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            b9Var.r(user);
            textView.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
            q9Var.f(user, b9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        b9Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        q9Var.f(chat, b9Var);
    }
}

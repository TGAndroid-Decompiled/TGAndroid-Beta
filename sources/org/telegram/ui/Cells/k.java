package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f29384a;
    public final TextView f29385b;
    public final org.telegram.ui.Components.l9 f29386c;
    public final ImageView d;
    public final org.telegram.ui.Components.w8 f29387e;
    public int f29388f;

    public k(Activity activity, boolean z9) {
        super(activity);
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.f29387e = w8Var;
        w8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(activity);
        this.f29386c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(l9Var, c8.ha.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.f29384a = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setEllipsizeByGradient(true);
        k5Var.setMaxLines(1);
        k5Var.setGravity(19);
        if (z9) {
            addView(k5Var, c8.ha.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.f27822bh, null);
            k5Var.l(hd.M0(2131743387, null), false);
            TextView textView = new TextView(activity);
            this.f29385b = textView;
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27842ch, null);
            org.telegram.messenger.camera.q.n(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(org.telegram.messenger.g0.L(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, c8.ha.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(k5Var, c8.ha.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(2131230862);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.H9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f29388f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29385b == null) {
            org.telegram.ui.ActionBar.r6.Y(this.f29384a, org.telegram.ui.ActionBar.k6.G9, null);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11;
        float f10;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f29385b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
                float L = org.telegram.messenger.g0.L(196.0f);
                if (imageView != null) {
                    i11 = 50;
                } else {
                    i11 = 0;
                }
                float L2 = org.telegram.messenger.g0.L(i11 + 69);
                org.telegram.ui.ActionBar.k5 k5Var = this.f29384a;
                float measureText = k5Var.getTextPaint().measureText(k5Var.getText().toString());
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
        boolean z9 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.l9 l9Var = this.f29386c;
        TextView textView = this.f29385b;
        org.telegram.ui.Components.w8 w8Var = this.f29387e;
        if (z9) {
            TLRPC.User user = (TLRPC.User) tLObject;
            w8Var.r(user);
            textView.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
            l9Var.e(user, w8Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        w8Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        l9Var.e(chat, w8Var);
    }
}

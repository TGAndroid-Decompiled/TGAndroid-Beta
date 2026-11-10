package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.m5 f29402a;
    public final TextView f29403b;
    public final org.telegram.ui.Components.k9 f29404c;
    public final ImageView d;
    public final org.telegram.ui.Components.v8 f29405e;
    public int f29406f;

    public k(Activity activity, boolean z9) {
        super(activity);
        setMinimumWidth(org.telegram.messenger.g0.L(196.0f));
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f29405e = v8Var;
        v8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
        this.f29404c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        addView(k9Var, c8.ha.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(activity);
        this.f29402a = m5Var;
        m5Var.setTextSize(15);
        m5Var.setTypeface(org.telegram.messenger.g0.o());
        m5Var.setEllipsizeByGradient(true);
        m5Var.setMaxLines(1);
        m5Var.setGravity(19);
        if (z9) {
            addView(m5Var, c8.ha.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.f27863bh, null);
            m5Var.l(id.M0(2131743386, null), false);
            TextView textView = new TextView(activity);
            this.f29403b = textView;
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f27883ch, null);
            org.telegram.messenger.camera.q.n(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(org.telegram.messenger.g0.L(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, c8.ha.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(m5Var, c8.ha.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(2131230862);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.H9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, c8.ha.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f29406f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29403b == null) {
            org.telegram.ui.ActionBar.t6.X(this.f29402a, org.telegram.ui.ActionBar.m6.G9, null);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextView textView;
        int i11;
        float f10;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f29403b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
                float L = org.telegram.messenger.g0.L(196.0f);
                if (imageView != null) {
                    i11 = 50;
                } else {
                    i11 = 0;
                }
                float L2 = org.telegram.messenger.g0.L(i11 + 69);
                org.telegram.ui.ActionBar.m5 m5Var = this.f29402a;
                float measureText = m5Var.getTextPaint().measureText(m5Var.getText().toString());
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
        org.telegram.ui.Components.k9 k9Var = this.f29404c;
        TextView textView = this.f29403b;
        org.telegram.ui.Components.v8 v8Var = this.f29405e;
        if (z9) {
            TLRPC.User user = (TLRPC.User) tLObject;
            v8Var.r(user);
            textView.setText(org.telegram.messenger.g5.m(0, user.first_name, user.last_name));
            k9Var.e(user, v8Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        v8Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        k9Var.e(chat, v8Var);
    }
}

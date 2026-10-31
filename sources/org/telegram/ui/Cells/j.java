package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 f22054a;
    public final TextView f22055b;
    public final org.telegram.ui.Components.g9 f22056c;
    public final ImageView d;
    public final org.telegram.ui.Components.r8 e;
    public int f22057f;

    public j(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.e = r8Var;
        r8Var.u(org.telegram.messenger.i0.L(12.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
        this.f22056c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
        addView(g9Var, w7.b6.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(activity);
        this.f22054a = u5Var;
        u5Var.setTextSize(15);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setEllipsizeByGradient(true);
        u5Var.setMaxLines(1);
        u5Var.setGravity(19);
        if (z10) {
            addView(u5Var, w7.b6.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.f20901bh, null);
            u5Var.l(cd.L0(2131743412, null), false);
            TextView textView = new TextView(activity);
            this.f22055b = textView;
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f20921ch, null);
            z20.o(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(org.telegram.messenger.i0.L(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, w7.b6.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(u5Var, w7.b6.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(2131230862);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.H9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f22057f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22055b == null) {
            org.telegram.ui.ActionBar.a7.Y(this.f22054a, org.telegram.ui.ActionBar.t6.G9, null);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12;
        float f7;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f22055b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                float L = org.telegram.messenger.i0.L(196.0f);
                if (imageView != null) {
                    i12 = 50;
                } else {
                    i12 = 0;
                }
                float L2 = org.telegram.messenger.i0.L(i12 + 69);
                org.telegram.ui.ActionBar.u5 u5Var = this.f22054a;
                float measureText = u5Var.getTextPaint().measureText(u5Var.getText().toString());
                if (textView != null) {
                    f7 = textView.getPaint().measureText(textView.getText().toString());
                } else {
                    f7 = 0.0f;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(L, Math.max(measureText, f7) + L2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
                return;
            }
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        String str;
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.g9 g9Var = this.f22056c;
        TextView textView = this.f22055b;
        org.telegram.ui.Components.r8 r8Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            r8Var.r(user);
            textView.setText(org.telegram.messenger.i5.m(0, user.first_name, user.last_name));
            g9Var.e(user, r8Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        r8Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        g9Var.e(chat, r8Var);
    }
}

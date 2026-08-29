package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f24568a;
    public final TextView f24569b;
    public final org.telegram.ui.Components.t9 f24570c;
    public final ImageView d;
    public final org.telegram.ui.Components.e9 f24571e;
    public int f24572f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.f24571e = e9Var;
        e9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(activity);
        this.f24570c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(t9Var, i7.f6.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f24568a = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setEllipsizeByGradient(true);
        h5Var.setMaxLines(1);
        h5Var.setGravity(19);
        if (z10) {
            addView(h5Var, i7.f6.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
            h5Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
            TextView textView = new TextView(activity);
            this.f24569b = textView;
            org.telegram.ui.b.r(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269og, false), 1, 15.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setMaxWidth(AndroidUtilities.dp(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, i7.f6.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(h5Var, i7.f6.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(R.drawable.account_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H9, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, i7.f6.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f24572f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24569b == null) {
            this.f24568a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G9, false));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12;
        float f9;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f24569b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                float dp = AndroidUtilities.dp(196.0f);
                if (imageView != null) {
                    i12 = 50;
                } else {
                    i12 = 0;
                }
                float dp2 = AndroidUtilities.dp(i12 + 69);
                org.telegram.ui.ActionBar.h5 h5Var = this.f24568a;
                float measureText = h5Var.getTextPaint().measureText(h5Var.getText().toString());
                if (textView != null) {
                    f9 = textView.getPaint().measureText(textView.getText().toString());
                } else {
                    f9 = 0.0f;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(dp, Math.max(measureText, f9) + dp2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            }
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        String str;
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.t9 t9Var = this.f24570c;
        TextView textView = this.f24569b;
        org.telegram.ui.Components.e9 e9Var = this.f24571e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            e9Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            t9Var.e(user, e9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        e9Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        t9Var.e(chat, e9Var);
    }
}

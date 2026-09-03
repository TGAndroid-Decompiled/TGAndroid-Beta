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
    public final org.telegram.ui.ActionBar.k5 f21250a;
    public final TextView f21251b;
    public final org.telegram.ui.Components.p9 f21252c;
    public final ImageView d;
    public final org.telegram.ui.Components.z8 e;
    public int f21253f;

    public k(Activity activity, boolean z4) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.e = z8Var;
        z8Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(activity);
        this.f21252c = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(p9Var, k7.b6.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.f21250a = k5Var;
        k5Var.setTextSize(15);
        k5Var.setTypeface(AndroidUtilities.bold());
        k5Var.setEllipsizeByGradient(true);
        k5Var.setMaxLines(1);
        k5Var.setGravity(19);
        if (z4) {
            addView(k5Var, k7.b6.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20069ng, false));
            k5Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
            TextView textView = new TextView(activity);
            this.f21251b = textView;
            org.telegram.ui.b.q(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20087og, false), 1, 15.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setMaxWidth(AndroidUtilities.dp(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, k7.b6.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(k5Var, k7.b6.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(R.drawable.account_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H9, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.b6.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f21253f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21251b == null) {
            this.f21250a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G9, false));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12;
        float f10;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f21251b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                float dp = AndroidUtilities.dp(196.0f);
                if (imageView != null) {
                    i12 = 50;
                } else {
                    i12 = 0;
                }
                float dp2 = AndroidUtilities.dp(i12 + 69);
                org.telegram.ui.ActionBar.k5 k5Var = this.f21250a;
                float measureText = k5Var.getTextPaint().measureText(k5Var.getText().toString());
                if (textView != null) {
                    f10 = textView.getPaint().measureText(textView.getText().toString());
                } else {
                    f10 = 0.0f;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(dp, Math.max(measureText, f10) + dp2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                return;
            }
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        String str;
        boolean z4 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.p9 p9Var = this.f21252c;
        TextView textView = this.f21251b;
        org.telegram.ui.Components.z8 z8Var = this.e;
        if (z4) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z8Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            p9Var.e(user, z8Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        z8Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        p9Var.e(chat, z8Var);
    }
}

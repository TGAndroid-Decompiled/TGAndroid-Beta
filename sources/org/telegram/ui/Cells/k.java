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
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 f21126a;
    public final TextView f21127b;
    public final org.telegram.ui.Components.z9 f21128c;
    public final ImageView d;
    public final org.telegram.ui.Components.k9 e;
    public int f21129f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.e = k9Var;
        k9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(activity);
        this.f21128c = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(z9Var, w7.z5.a(36.0f, 10.0f, 10.0f, 0.0f, 0.0f, 36, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f21126a = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setEllipsizeByGradient(true);
        h5Var.setMaxLines(1);
        h5Var.setGravity(19);
        if (z10) {
            addView(h5Var, w7.z5.a(-2.0f, 61.0f, 7.0f, 8.0f, 0.0f, -2, 51));
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19794ng, false));
            h5Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
            TextView textView = new TextView(activity);
            this.f21127b = textView;
            sk.u(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19812og, false), 1, 15.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setMaxWidth(AndroidUtilities.dp(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, w7.z5.a(-2.0f, 61.0f, 27.0f, 8.0f, 0.0f, -2, 51));
            return;
        }
        addView(h5Var, w7.z5.a(-1.0f, 61.0f, 0.0f, 52.0f, 0.0f, -1, 51));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E8, false));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(R.drawable.account_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.H9, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.a(-1.0f, 0.0f, 0.0f, 6.0f, 0.0f, 40, 53));
    }

    public int getAccountNumber() {
        return this.f21129f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21127b == null) {
            this.f21126a.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G9, false));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12;
        float f7;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f21127b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                float dp = AndroidUtilities.dp(196.0f);
                if (imageView != null) {
                    i12 = 50;
                } else {
                    i12 = 0;
                }
                float dp2 = AndroidUtilities.dp(i12 + 69);
                org.telegram.ui.ActionBar.h5 h5Var = this.f21126a;
                float measureText = h5Var.getTextPaint().measureText(h5Var.getText().toString());
                if (textView != null) {
                    f7 = textView.getPaint().measureText(textView.getText().toString());
                } else {
                    f7 = 0.0f;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(dp, Math.max(measureText, f7) + dp2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
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
        org.telegram.ui.Components.z9 z9Var = this.f21128c;
        TextView textView = this.f21127b;
        org.telegram.ui.Components.k9 k9Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            k9Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            z9Var.e(user, k9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        k9Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        z9Var.e(chat, k9Var);
    }
}

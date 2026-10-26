package org.telegram.ui.Cells;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gb1;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f24301a;
    public final TextView f24302b;
    public final org.telegram.ui.Components.y9 f24303c;
    public final ImageView d;
    public final org.telegram.ui.Components.j9 e;
    public int f24304f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.e = j9Var;
        j9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
        this.f24303c = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(y9Var, gb1.h(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(activity);
        this.f24301a = b6Var;
        b6Var.setTextSize(15);
        b6Var.setTypeface(AndroidUtilities.bold());
        b6Var.setEllipsizeByGradient(true);
        b6Var.setMaxLines(1);
        b6Var.setGravity(19);
        if (z10) {
            addView(b6Var, gb1.h(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.f23550ng, null);
            b6Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
            TextView textView = new TextView(activity);
            this.f24302b = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23570og, null);
            vh.r(textView, 1, 15.0f, 1, 1);
            textView.setSingleLine(true);
            textView.setMaxWidth(AndroidUtilities.dp(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, gb1.h(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(b6Var, gb1.h(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.E8, null);
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(R.drawable.account_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.H9, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, gb1.h(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f24304f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24302b == null) {
            org.telegram.ui.ActionBar.f7.Y(this.f24301a, org.telegram.ui.ActionBar.y6.G9, null);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12;
        float f7;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f24302b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                float dp = AndroidUtilities.dp(196.0f);
                if (imageView != null) {
                    i12 = 50;
                } else {
                    i12 = 0;
                }
                float dp2 = AndroidUtilities.dp(i12 + 69);
                org.telegram.ui.ActionBar.b6 b6Var = this.f24301a;
                float measureText = b6Var.getTextPaint().measureText(b6Var.getText().toString());
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
        org.telegram.ui.Components.y9 y9Var = this.f24303c;
        TextView textView = this.f24302b;
        org.telegram.ui.Components.j9 j9Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            j9Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            y9Var.f(user, j9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        j9Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        y9Var.f(chat, j9Var);
    }
}

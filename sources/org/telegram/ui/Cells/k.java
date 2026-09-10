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
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 f19392a;
    public final TextView f19393b;
    public final org.telegram.ui.Components.w9 f19394c;
    public final ImageView d;
    public final org.telegram.ui.Components.g9 e;
    public int f19395f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.e = g9Var;
        g9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
        this.f19394c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(w9Var, w7.a6.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.f19392a = l5Var;
        l5Var.setTextSize(15);
        l5Var.setTypeface(AndroidUtilities.bold());
        l5Var.setEllipsizeByGradient(true);
        l5Var.setMaxLines(1);
        l5Var.setGravity(19);
        if (z10) {
            addView(l5Var, w7.a6.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
            l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18117ng, false));
            l5Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
            TextView textView = new TextView(activity);
            this.f19393b = textView;
            em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18135og, false), 1, 15.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setMaxWidth(AndroidUtilities.dp(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, w7.a6.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
            return;
        }
        addView(l5Var, w7.a6.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(R.drawable.account_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H9, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.a6.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f19395f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19393b == null) {
            this.f19392a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G9, false));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12;
        float f7;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f19393b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                float dp = AndroidUtilities.dp(196.0f);
                if (imageView != null) {
                    i12 = 50;
                } else {
                    i12 = 0;
                }
                float dp2 = AndroidUtilities.dp(i12 + 69);
                org.telegram.ui.ActionBar.l5 l5Var = this.f19392a;
                float measureText = l5Var.getTextPaint().measureText(l5Var.getText().toString());
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
        org.telegram.ui.Components.w9 w9Var = this.f19394c;
        TextView textView = this.f19393b;
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            g9Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            w9Var.e(user, g9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        g9Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        w9Var.e(chat, g9Var);
    }
}

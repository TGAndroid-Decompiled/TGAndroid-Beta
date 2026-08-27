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
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class k extends FrameLayout {

    public final org.telegram.ui.ActionBar.h5 f24547a;

    public final TextView f24548b;

    public final org.telegram.ui.Components.n9 f24549c;
    public final ImageView d;

    public final org.telegram.ui.Components.y8 f24550e;

    public int f24551f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f24550e = y8Var;
        y8Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(activity);
        this.f24549c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(n9Var, h7.z5.d(36, 36.0f, 51, 10.0f, 10.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(activity);
        this.f24547a = h5Var;
        h5Var.setTextSize(15);
        h5Var.setTypeface(AndroidUtilities.bold());
        h5Var.setEllipsizeByGradient(true);
        h5Var.setMaxLines(1);
        h5Var.setGravity(19);
        if (!z10) {
            addView(h5Var, h7.z5.d(-1, -1.0f, 51, 61.0f, 0.0f, 52.0f, 0.0f));
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
            ImageView imageView = new ImageView(activity);
            this.d = imageView;
            imageView.setImageResource(R.drawable.account_check);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H9, false), PorterDuff.Mode.MULTIPLY));
            addView(imageView, h7.z5.d(40, -1.0f, 53, 0.0f, 0.0f, 6.0f, 0.0f));
            return;
        }
        addView(h5Var, h7.z5.d(-2, -2.0f, 51, 61.0f, 7.0f, 8.0f, 0.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false));
        h5Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
        TextView textView = new TextView(activity);
        this.f24548b = textView;
        rl.p(textView, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23260og, false), 1, 15.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setMaxWidth(AndroidUtilities.dp(320.0f));
        textView.setGravity(51);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, h7.z5.d(-2, -2.0f, 51, 61.0f, 27.0f, 8.0f, 0.0f));
    }

    public int getAccountNumber() {
        return this.f24551f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24548b == null) {
            this.f24547a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G9, false));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        ImageView imageView = this.d;
        if (imageView != null || ((textView = this.f24548b) != null && getLayoutParams().width != -2)) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            return;
        }
        if (View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
            return;
        }
        float fDp = AndroidUtilities.dp(196.0f);
        float fDp2 = AndroidUtilities.dp((imageView != null ? 50 : 0) + 69);
        org.telegram.ui.ActionBar.h5 h5Var = this.f24547a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.max(fDp, Math.max(h5Var.getTextPaint().measureText(h5Var.getText().toString()), textView != null ? textView.getPaint().measureText(textView.getText().toString()) : 0.0f) + fDp2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setObject(TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.User;
        org.telegram.ui.Components.n9 n9Var = this.f24549c;
        TextView textView = this.f24548b;
        org.telegram.ui.Components.y8 y8Var = this.f24550e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            y8Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            n9Var.e(user, y8Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        y8Var.q(chat);
        textView.setText(chat == null ? "" : chat.title);
        n9Var.e(chat, y8Var);
    }
}

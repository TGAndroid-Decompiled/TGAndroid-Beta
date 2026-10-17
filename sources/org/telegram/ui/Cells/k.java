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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 f22493a;
    public final TextView f22494b;
    public final org.telegram.ui.Components.w9 f22495c;
    public final ImageView d;
    public final org.telegram.ui.Components.h9 e;
    public int f22496f;

    public k(Activity activity, boolean z10) {
        super(activity);
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.e = h9Var;
        h9Var.u(AndroidUtilities.dp(12.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(activity);
        this.f22495c = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
        addView(w9Var, w7.z5.a(36.0f, 10.0f, 10.0f, 0.0f, 0.0f, 36, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(activity);
        this.f22493a = j5Var;
        j5Var.setTextSize(15);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setEllipsizeByGradient(true);
        j5Var.setMaxLines(1);
        j5Var.setGravity(19);
        if (z10) {
            addView(j5Var, w7.z5.a(-2.0f, 61.0f, 7.0f, 8.0f, 0.0f, -2, 51));
            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21179ng, false));
            j5Var.l(LocaleController.getString(R.string.VoipGroupDisplayAs), false);
            TextView textView = new TextView(activity);
            this.f22494b = textView;
            wh.u(textView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21197og, false), 1, 15.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setMaxWidth(AndroidUtilities.dp(320.0f));
            textView.setGravity(51);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            addView(textView, w7.z5.a(-2.0f, 61.0f, 27.0f, 8.0f, 0.0f, -2, 51));
            return;
        }
        addView(j5Var, w7.z5.a(-1.0f, 61.0f, 0.0f, 52.0f, 0.0f, -1, 51));
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        imageView.setImageResource(R.drawable.account_check);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.H9, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, w7.z5.a(-1.0f, 0.0f, 0.0f, 6.0f, 0.0f, 40, 53));
    }

    public int getAccountNumber() {
        return this.f22496f;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f22494b == null) {
            this.f22493a.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G9, false));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextView textView;
        int i12;
        float f7;
        ImageView imageView = this.d;
        if (imageView == null && ((textView = this.f22494b) == null || getLayoutParams().width == -2)) {
            if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
                float dp = AndroidUtilities.dp(196.0f);
                if (imageView != null) {
                    i12 = 50;
                } else {
                    i12 = 0;
                }
                float dp2 = AndroidUtilities.dp(i12 + 69);
                org.telegram.ui.ActionBar.j5 j5Var = this.f22493a;
                float measureText = j5Var.getTextPaint().measureText(j5Var.getText().toString());
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
        org.telegram.ui.Components.w9 w9Var = this.f22495c;
        TextView textView = this.f22494b;
        org.telegram.ui.Components.h9 h9Var = this.e;
        if (z10) {
            TLRPC.User user = (TLRPC.User) tLObject;
            h9Var.r(user);
            textView.setText(ContactsController.formatName(user.first_name, user.last_name));
            w9Var.e(user, h9Var);
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
        h9Var.q(chat);
        if (chat == null) {
            str = "";
        } else {
            str = chat.title;
        }
        textView.setText(str);
        w9Var.e(chat, h9Var);
    }
}

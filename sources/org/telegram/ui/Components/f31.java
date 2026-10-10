package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f31 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f26265a;
    public final y9 f26266b;
    public final fa0 f26267c;
    public final fa0 d;
    public int f26268e;
    public int f26269f;

    public f31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f26268e = 90;
        this.f26265a = e6Var;
        setOrientation(1);
        y9 y9Var = new y9(context);
        this.f26266b = y9Var;
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        y9Var.getImageReceiver().setAutoRepeat(1);
        y9Var.setOnClickListener(new c90(this, 21));
        addView(y9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        fa0 fa0Var = new fa0(context, null);
        this.f26267c = fa0Var;
        fa0Var.setTextSize(1, 20.0f);
        fa0Var.setGravity(17);
        fa0Var.setTypeface(AndroidUtilities.bold());
        fa0Var.setTextAlignment(4);
        addView(fa0Var, w7.x5.t(-1, -2, 17, 48, 0, 48, 10));
        fa0 fa0Var2 = new fa0(context, null);
        this.d = fa0Var2;
        fa0Var2.setTextSize(1, 14.0f);
        fa0Var2.setGravity(17);
        fa0Var2.setTextAlignment(4);
        addView(fa0Var2, w7.x5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        fa0 fa0Var = this.f26267c;
        fa0Var.setText(charSequence);
        fa0Var.setVisibility(0);
        fa0 fa0Var2 = this.d;
        fa0Var2.setText(charSequence2);
        fa0Var2.setMaxWidth(ci.d4.a(charSequence2, fa0Var2.getPaint()));
        fa0Var2.requestLayout();
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f26265a;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        fa0 fa0Var = this.f26267c;
        fa0Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.i6.gc;
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        if (fa0Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.i6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        fa0 fa0Var2 = this.d;
        fa0Var2.setTextColor(w03);
        fa0Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        int i13 = this.f26268e;
        if (fa0Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f26266b.setLayoutParams(w7.x5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f26269f != i10) {
            this.f26269f = i10;
            dk0 dk0Var = new dk0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            y9 y9Var = this.f26266b;
            y9Var.setImageDrawable(dk0Var);
            y9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f26268e != i10) {
            this.f26268e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f26269f != i10) {
            y9 y9Var = this.f26266b;
            y9Var.b();
            this.f26269f = i10;
            y9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26267c.setVisibility(8);
        fa0 fa0Var = this.d;
        fa0Var.setText(charSequence);
        fa0Var.setMaxWidth(ci.d4.a(charSequence, fa0Var.getPaint()));
        fa0Var.requestLayout();
        e();
    }
}

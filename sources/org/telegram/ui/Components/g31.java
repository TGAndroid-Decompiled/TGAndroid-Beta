package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g31 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f26594a;
    public final y9 f26595b;
    public final fa0 f26596c;
    public final fa0 d;
    public int f26597e;
    public int f26598f;

    public g31(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f26597e = 90;
        this.f26594a = d6Var;
        setOrientation(1);
        y9 y9Var = new y9(context);
        this.f26595b = y9Var;
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        y9Var.getImageReceiver().setAutoRepeat(1);
        y9Var.setOnClickListener(new c90(this, 21));
        addView(y9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        fa0 fa0Var = new fa0(context, null);
        this.f26596c = fa0Var;
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
        fa0 fa0Var = this.f26596c;
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
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26594a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        fa0 fa0Var = this.f26596c;
        fa0Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        fa0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        if (fa0Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        fa0 fa0Var2 = this.d;
        fa0Var2.setTextColor(w03);
        fa0Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        int i13 = this.f26597e;
        if (fa0Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f26595b.setLayoutParams(w7.x5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f26598f != i10) {
            this.f26598f = i10;
            ek0 ek0Var = new ek0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            y9 y9Var = this.f26595b;
            y9Var.setImageDrawable(ek0Var);
            y9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f26597e != i10) {
            this.f26597e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f26598f != i10) {
            y9 y9Var = this.f26595b;
            y9Var.b();
            this.f26598f = i10;
            y9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26596c.setVisibility(8);
        fa0 fa0Var = this.d;
        fa0Var.setText(charSequence);
        fa0Var.setMaxWidth(ci.d4.a(charSequence, fa0Var.getPaint()));
        fa0Var.requestLayout();
        e();
    }
}

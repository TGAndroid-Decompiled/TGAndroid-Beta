package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f31 extends LinearLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f26307a;
    public final y9 f26308b;
    public final ea0 f26309c;
    public final ea0 d;
    public int f26310e;
    public int f26311f;

    public f31(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f26310e = 90;
        this.f26307a = d6Var;
        setOrientation(1);
        y9 y9Var = new y9(context);
        this.f26308b = y9Var;
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        y9Var.getImageReceiver().setAutoRepeat(1);
        y9Var.setOnClickListener(new b90(this, 21));
        addView(y9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        ea0 ea0Var = new ea0(context, null);
        this.f26309c = ea0Var;
        ea0Var.setTextSize(1, 20.0f);
        ea0Var.setGravity(17);
        ea0Var.setTypeface(AndroidUtilities.bold());
        ea0Var.setTextAlignment(4);
        addView(ea0Var, w7.x5.t(-1, -2, 17, 48, 0, 48, 10));
        ea0 ea0Var2 = new ea0(context, null);
        this.d = ea0Var2;
        ea0Var2.setTextSize(1, 14.0f);
        ea0Var2.setGravity(17);
        ea0Var2.setTextAlignment(4);
        addView(ea0Var2, w7.x5.t(-1, -2, 17, 48, 0, 48, 17));
        e();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        ea0 ea0Var = this.f26309c;
        ea0Var.setText(charSequence);
        ea0Var.setVisibility(0);
        ea0 ea0Var2 = this.d;
        ea0Var2.setText(charSequence2);
        ea0Var2.setMaxWidth(ci.d4.a(charSequence2, ea0Var2.getPaint()));
        ea0Var2.requestLayout();
        e();
    }

    @Override
    public final void e() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f26307a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        ea0 ea0Var = this.f26309c;
        ea0Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        if (ea0Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.h6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        ea0 ea0Var2 = this.d;
        ea0Var2.setTextColor(w03);
        ea0Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        int i13 = this.f26310e;
        if (ea0Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f26308b.setLayoutParams(w7.x5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f26311f != i10) {
            this.f26311f = i10;
            dk0 dk0Var = new dk0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            y9 y9Var = this.f26308b;
            y9Var.setImageDrawable(dk0Var);
            y9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f26310e != i10) {
            this.f26310e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f26311f != i10) {
            y9 y9Var = this.f26308b;
            y9Var.b();
            this.f26311f = i10;
            y9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f26309c.setVisibility(8);
        ea0 ea0Var = this.d;
        ea0Var.setText(charSequence);
        ea0Var.setMaxWidth(ci.d4.a(charSequence, ea0Var.getPaint()));
        ea0Var.requestLayout();
        e();
    }
}

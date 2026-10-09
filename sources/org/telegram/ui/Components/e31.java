package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public final class e31 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f25935a;
    public final y9 f25936b;
    public final ea0 f25937c;
    public final ea0 d;
    public int f25938e;
    public int f25939f;

    public e31(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f25938e = 90;
        this.f25935a = e6Var;
        setOrientation(1);
        y9 y9Var = new y9(context);
        this.f25936b = y9Var;
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        y9Var.getImageReceiver().setAutoRepeat(1);
        y9Var.setOnClickListener(new b90(this, 21));
        addView(y9Var, w7.x5.t(90, 90, 17, 0, 9, 0, 9));
        ea0 ea0Var = new ea0(context, null);
        this.f25937c = ea0Var;
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
        ea0 ea0Var = this.f25937c;
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
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f25935a;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        ea0 ea0Var = this.f25937c;
        ea0Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.i6.gc;
        ea0Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        if (ea0Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.i6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        ea0 ea0Var2 = this.d;
        ea0Var2.setTextColor(w03);
        ea0Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        int i13 = this.f25938e;
        if (ea0Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f25936b.setLayoutParams(w7.x5.t(i13, i13, 17, 0, i10, 0, 9));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f25939f != i10) {
            this.f25939f = i10;
            ck0 ck0Var = new ck0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            y9 y9Var = this.f25936b;
            y9Var.setImageDrawable(ck0Var);
            y9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.f25938e != i10) {
            this.f25938e = i10;
            e();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f25939f != i10) {
            y9 y9Var = this.f25936b;
            y9Var.b();
            this.f25939f = i10;
            y9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f25937c.setVisibility(8);
        ea0 ea0Var = this.d;
        ea0Var.setText(charSequence);
        ea0Var.setMaxWidth(ci.d4.a(charSequence, ea0Var.getPaint()));
        ea0Var.requestLayout();
        e();
    }
}

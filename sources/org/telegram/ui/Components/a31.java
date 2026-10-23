package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
public final class a31 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f24618a;
    public final w9 f24619b;
    public final y90 f24620c;
    public final y90 d;
    public int e;
    public int f24621f;

    public a31(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = 90;
        this.f24618a = g6Var;
        setOrientation(1);
        w9 w9Var = new w9(context);
        this.f24619b = w9Var;
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        w9Var.getImageReceiver().setAutoRepeat(1);
        w9Var.setOnClickListener(new v80(this, 21));
        addView(w9Var, w7.z5.t(90, 90, 17, 0, 9, 0, 9));
        y90 y90Var = new y90(context, null);
        this.f24620c = y90Var;
        y90Var.setTextSize(1, 20.0f);
        y90Var.setGravity(17);
        y90Var.setTypeface(AndroidUtilities.bold());
        y90Var.setTextAlignment(4);
        addView(y90Var, w7.z5.t(-1, -2, 17, 48, 0, 48, 10));
        y90 y90Var2 = new y90(context, null);
        this.d = y90Var2;
        y90Var2.setTextSize(1, 14.0f);
        y90Var2.setGravity(17);
        y90Var2.setTextAlignment(4);
        addView(y90Var2, w7.z5.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        y90 y90Var = this.f24620c;
        y90Var.setText(charSequence);
        y90Var.setVisibility(0);
        y90 y90Var2 = this.d;
        y90Var2.setText(charSequence2);
        y90Var2.setMaxWidth(ei.x3.a(charSequence2, y90Var2.getPaint()));
        y90Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21242gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f24621f != i10) {
            this.f24621f = i10;
            yj0 yj0Var = new yj0(i10, AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            w9 w9Var = this.f24619b;
            w9Var.setImageDrawable(yj0Var);
            w9Var.getImageReceiver().setAutoRepeat(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            updateColors();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f24621f != i10) {
            w9 w9Var = this.f24619b;
            w9Var.b();
            this.f24621f = i10;
            w9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f24620c.setVisibility(8);
        y90 y90Var = this.d;
        y90Var.setText(charSequence);
        y90Var.setMaxWidth(ei.x3.a(charSequence, y90Var.getPaint()));
        y90Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f24618a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        y90 y90Var = this.f24620c;
        y90Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.k6.f21242gc;
        y90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        if (y90Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.k6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        y90 y90Var2 = this.d;
        y90Var2.setTextColor(w03);
        y90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i12, g6Var));
        int i13 = this.e;
        if (y90Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f24619b.setLayoutParams(w7.z5.t(i13, i13, 17, 0, i10, 0, 9));
    }
}

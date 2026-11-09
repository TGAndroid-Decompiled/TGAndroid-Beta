package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class f01 extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f33540a;
    public final l9 f33541b;
    public final x70 f33542c;
    public final x70 d;
    public int f33543e;
    public int f33544f;

    public f01(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f33543e = 90;
        this.f33540a = g6Var;
        setOrientation(1);
        l9 l9Var = new l9(context);
        this.f33541b = l9Var;
        l9Var.getImageReceiver().X(1);
        l9Var.getImageReceiver().W(1);
        l9Var.setOnClickListener(new ma0(this, 18));
        addView(l9Var, c8.ha.t(90, 90, 17, 0, 9, 0, 9));
        x70 x70Var = new x70(context, null);
        this.f33542c = x70Var;
        x70Var.setTextSize(1, 20.0f);
        x70Var.setGravity(17);
        x70Var.setTypeface(org.telegram.messenger.g0.o());
        x70Var.setTextAlignment(4);
        addView(x70Var, c8.ha.t(-1, -2, 17, 48, 0, 48, 10));
        x70 x70Var2 = new x70(context, null);
        this.d = x70Var2;
        x70Var2.setTextSize(1, 14.0f);
        x70Var2.setGravity(17);
        x70Var2.setTextAlignment(4);
        addView(x70Var2, c8.ha.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        x70 x70Var = this.f33542c;
        x70Var.setText(charSequence);
        x70Var.setVisibility(0);
        x70 x70Var2 = this.d;
        x70Var2.setText(charSequence2);
        x70Var2.setMaxWidth(fi.m3.a(charSequence2, x70Var2.getPaint()));
        x70Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setEmoji(int i7) {
        if (this.f33544f != i7) {
            this.f33544f = i7;
            ah0 ah0Var = new ah0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            l9 l9Var = this.f33541b;
            l9Var.setImageDrawable(ah0Var);
            l9Var.getImageReceiver().W(2);
        }
    }

    public void setEmojiSize(int i7) {
        if (this.f33543e != i7) {
            this.f33543e = i7;
            updateColors();
        }
    }

    public void setEmojiStatic(int i7) {
        if (this.f33544f != i7) {
            l9 l9Var = this.f33541b;
            l9Var.b();
            this.f33544f = i7;
            l9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f33542c.setVisibility(8);
        x70 x70Var = this.d;
        x70Var.setText(charSequence);
        x70Var.setMaxWidth(fi.m3.a(charSequence, x70Var.getPaint()));
        x70Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f33540a;
        int w02 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        x70 x70Var = this.f33542c;
        x70Var.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.l6.Uc;
        x70Var.setLinkTextColor(org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
        if (x70Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.l6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.l6.w0(i10, g6Var);
        x70 x70Var2 = this.d;
        x70Var2.setTextColor(w03);
        x70Var2.setLinkTextColor(org.telegram.ui.ActionBar.l6.w0(i11, g6Var));
        int i12 = this.f33543e;
        if (x70Var.getVisibility() == 0) {
            i7 = 0;
        } else {
            i7 = 9;
        }
        this.f33541b.setLayoutParams(c8.ha.t(i12, i12, 17, 0, i7, 0, 9));
    }
}

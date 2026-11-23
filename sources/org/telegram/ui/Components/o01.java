package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class o01 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f37971a;
    public final p9 f37972b;
    public final j80 f37973c;
    public final j80 d;
    public int f37974e;
    public int f37975f;

    public o01(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f37974e = 90;
        this.f37971a = i6Var;
        setOrientation(1);
        p9 p9Var = new p9(context);
        this.f37972b = p9Var;
        p9Var.getImageReceiver().Y(1);
        p9Var.getImageReceiver().X(1);
        p9Var.setOnClickListener(new g70(this, 20));
        addView(p9Var, c8.na.t(90, 90, 17, 0, 9, 0, 9));
        j80 j80Var = new j80(context, null);
        this.f37973c = j80Var;
        j80Var.setTextSize(1, 20.0f);
        j80Var.setGravity(17);
        j80Var.setTypeface(org.telegram.messenger.g0.o());
        j80Var.setTextAlignment(4);
        addView(j80Var, c8.na.t(-1, -2, 17, 48, 0, 48, 10));
        j80 j80Var2 = new j80(context, null);
        this.d = j80Var2;
        j80Var2.setTextSize(1, 14.0f);
        j80Var2.setGravity(17);
        j80Var2.setTextAlignment(4);
        addView(j80Var2, c8.na.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        j80 j80Var = this.f37973c;
        j80Var.setText(charSequence);
        j80Var.setVisibility(0);
        j80 j80Var2 = this.d;
        j80Var2.setText(charSequence2);
        j80Var2.setMaxWidth(hi.u3.a(charSequence2, j80Var2.getPaint()));
        j80Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setEmoji(int i7) {
        if (this.f37975f != i7) {
            this.f37975f = i7;
            nh0 nh0Var = new nh0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            p9 p9Var = this.f37972b;
            p9Var.setImageDrawable(nh0Var);
            p9Var.getImageReceiver().X(2);
        }
    }

    public void setEmojiSize(int i7) {
        if (this.f37974e != i7) {
            this.f37974e = i7;
            updateColors();
        }
    }

    public void setEmojiStatic(int i7) {
        if (this.f37975f != i7) {
            p9 p9Var = this.f37972b;
            p9Var.b();
            this.f37975f = i7;
            p9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f37973c.setVisibility(8);
        j80 j80Var = this.d;
        j80Var.setText(charSequence);
        j80Var.setMaxWidth(hi.u3.a(charSequence, j80Var.getPaint()));
        j80Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f37971a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        j80 j80Var = this.f37973c;
        j80Var.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.n6.Xc;
        j80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        if (j80Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.n6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        j80 j80Var2 = this.d;
        j80Var2.setTextColor(w03);
        j80Var2.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        int i12 = this.f37974e;
        if (j80Var.getVisibility() == 0) {
            i7 = 0;
        } else {
            i7 = 9;
        }
        this.f37972b.setLayoutParams(c8.na.t(i12, i12, 17, 0, i7, 0, 9));
    }
}

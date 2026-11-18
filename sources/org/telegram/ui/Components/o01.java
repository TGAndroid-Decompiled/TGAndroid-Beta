package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class o01 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f37920a;
    public final q9 f37921b;
    public final k80 f37922c;
    public final k80 d;
    public int f37923e;
    public int f37924f;

    public o01(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f37923e = 90;
        this.f37920a = i6Var;
        setOrientation(1);
        q9 q9Var = new q9(context);
        this.f37921b = q9Var;
        q9Var.getImageReceiver().X(1);
        q9Var.getImageReceiver().W(1);
        q9Var.setOnClickListener(new h70(this, 19));
        addView(q9Var, c8.ma.t(90, 90, 17, 0, 9, 0, 9));
        k80 k80Var = new k80(context, null);
        this.f37922c = k80Var;
        k80Var.setTextSize(1, 20.0f);
        k80Var.setGravity(17);
        k80Var.setTypeface(org.telegram.messenger.g0.o());
        k80Var.setTextAlignment(4);
        addView(k80Var, c8.ma.t(-1, -2, 17, 48, 0, 48, 10));
        k80 k80Var2 = new k80(context, null);
        this.d = k80Var2;
        k80Var2.setTextSize(1, 14.0f);
        k80Var2.setGravity(17);
        k80Var2.setTextAlignment(4);
        addView(k80Var2, c8.ma.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        k80 k80Var = this.f37922c;
        k80Var.setText(charSequence);
        k80Var.setVisibility(0);
        k80 k80Var2 = this.d;
        k80Var2.setText(charSequence2);
        k80Var2.setMaxWidth(hi.m3.a(charSequence2, k80Var2.getPaint()));
        k80Var2.requestLayout();
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
        if (this.f37924f != i7) {
            this.f37924f = i7;
            mh0 mh0Var = new mh0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            q9 q9Var = this.f37921b;
            q9Var.setImageDrawable(mh0Var);
            q9Var.getImageReceiver().W(2);
        }
    }

    public void setEmojiSize(int i7) {
        if (this.f37923e != i7) {
            this.f37923e = i7;
            updateColors();
        }
    }

    public void setEmojiStatic(int i7) {
        if (this.f37924f != i7) {
            q9 q9Var = this.f37921b;
            q9Var.b();
            this.f37924f = i7;
            q9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f37922c.setVisibility(8);
        k80 k80Var = this.d;
        k80Var.setText(charSequence);
        k80Var.setMaxWidth(hi.m3.a(charSequence, k80Var.getPaint()));
        k80Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f37920a;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        k80 k80Var = this.f37922c;
        k80Var.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.n6.Xc;
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        if (k80Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.n6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        k80 k80Var2 = this.d;
        k80Var2.setTextColor(w03);
        k80Var2.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
        int i12 = this.f37923e;
        if (k80Var.getVisibility() == 0) {
            i7 = 0;
        } else {
            i7 = 9;
        }
        this.f37921b.setLayoutParams(c8.ma.t(i12, i12, 17, 0, i7, 0, 9));
    }
}

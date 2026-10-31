package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class j11 extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 f27193a;
    public final g9 f27194b;
    public final p80 f27195c;
    public final p80 d;
    public int e;
    public int f27196f;

    public j11(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = 90;
        this.f27193a = p6Var;
        setOrientation(1);
        g9 g9Var = new g9(context);
        this.f27194b = g9Var;
        g9Var.getImageReceiver().X(1);
        g9Var.getImageReceiver().W(1);
        g9Var.setOnClickListener(new db0(this, 19));
        addView(g9Var, w7.b6.t(90, 90, 17, 0, 9, 0, 9));
        p80 p80Var = new p80(context, null);
        this.f27195c = p80Var;
        p80Var.setTextSize(1, 20.0f);
        p80Var.setGravity(17);
        p80Var.setTypeface(org.telegram.messenger.i0.o());
        p80Var.setTextAlignment(4);
        addView(p80Var, w7.b6.t(-1, -2, 17, 48, 0, 48, 10));
        p80 p80Var2 = new p80(context, null);
        this.d = p80Var2;
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setGravity(17);
        p80Var2.setTextAlignment(4);
        addView(p80Var2, w7.b6.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        p80 p80Var = this.f27195c;
        p80Var.setText(charSequence);
        p80Var.setVisibility(0);
        p80 p80Var2 = this.d;
        p80Var2.setText(charSequence2);
        p80Var2.setMaxWidth(vh.p2.a(charSequence2, p80Var2.getPaint()));
        p80Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setEmoji(int i10) {
        if (this.f27196f != i10) {
            this.f27196f = i10;
            bi0 bi0Var = new bi0(i10, org.telegram.messenger.i0.L(90.0f), org.telegram.messenger.i0.L(90.0f));
            g9 g9Var = this.f27194b;
            g9Var.setImageDrawable(bi0Var);
            g9Var.getImageReceiver().W(2);
        }
    }

    public void setEmojiSize(int i10) {
        if (this.e != i10) {
            this.e = i10;
            updateColors();
        }
    }

    public void setEmojiStatic(int i10) {
        if (this.f27196f != i10) {
            g9 g9Var = this.f27194b;
            g9Var.b();
            this.f27196f = i10;
            g9Var.setImageResource(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f27195c.setVisibility(8);
        p80 p80Var = this.d;
        p80Var.setText(charSequence);
        p80Var.setMaxWidth(vh.p2.a(charSequence, p80Var.getPaint()));
        p80Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.f27193a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        p80 p80Var = this.f27195c;
        p80Var.setTextColor(w02);
        int i12 = org.telegram.ui.ActionBar.t6.Uc;
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        if (p80Var.getVisibility() != 0) {
            i11 = org.telegram.ui.ActionBar.t6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        p80 p80Var2 = this.d;
        p80Var2.setTextColor(w03);
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        int i13 = this.e;
        if (p80Var.getVisibility() == 0) {
            i10 = 0;
        } else {
            i10 = 9;
        }
        this.f27194b.setLayoutParams(w7.b6.t(i13, i13, 17, 0, i10, 0, 9));
    }
}

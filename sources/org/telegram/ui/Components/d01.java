package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class d01 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f32882a;
    public final k9 f32883b;
    public final s70 f32884c;
    public final s70 d;
    public int f32885e;
    public int f32886f;

    public d01(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32885e = 90;
        this.f32882a = e6Var;
        setOrientation(1);
        k9 k9Var = new k9(context);
        this.f32883b = k9Var;
        k9Var.getImageReceiver().X(1);
        k9Var.getImageReceiver().W(1);
        k9Var.setOnClickListener(new ga0(this, 19));
        addView(k9Var, b8.mf.t(90, 90, 17, 0, 9, 0, 9));
        s70 s70Var = new s70(context, null);
        this.f32884c = s70Var;
        s70Var.setTextSize(1, 20.0f);
        s70Var.setGravity(17);
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        s70Var.setTextAlignment(4);
        addView(s70Var, b8.mf.t(-1, -2, 17, 48, 0, 48, 10));
        s70 s70Var2 = new s70(context, null);
        this.d = s70Var2;
        s70Var2.setTextSize(1, 14.0f);
        s70Var2.setGravity(17);
        s70Var2.setTextAlignment(4);
        addView(s70Var2, b8.mf.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        s70 s70Var = this.f32884c;
        s70Var.setText(charSequence);
        s70Var.setVisibility(0);
        s70 s70Var2 = this.d;
        s70Var2.setText(charSequence2);
        s70Var2.setMaxWidth(gi.l3.a(charSequence2, s70Var2.getPaint()));
        s70Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setEmoji(int i3) {
        if (this.f32886f != i3) {
            this.f32886f = i3;
            ch0 ch0Var = new ch0(i3, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            k9 k9Var = this.f32883b;
            k9Var.setImageDrawable(ch0Var);
            k9Var.getImageReceiver().W(2);
        }
    }

    public void setEmojiSize(int i3) {
        if (this.f32885e != i3) {
            this.f32885e = i3;
            updateColors();
        }
    }

    public void setEmojiStatic(int i3) {
        if (this.f32886f != i3) {
            k9 k9Var = this.f32883b;
            k9Var.b();
            this.f32886f = i3;
            k9Var.setImageResource(i3);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f32884c.setVisibility(8);
        s70 s70Var = this.d;
        s70Var.setText(charSequence);
        s70Var.setMaxWidth(gi.l3.a(charSequence, s70Var.getPaint()));
        s70Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i3;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32882a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        s70 s70Var = this.f32884c;
        s70Var.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.k6.Uc;
        s70Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        if (s70Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.k6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, e6Var);
        s70 s70Var2 = this.d;
        s70Var2.setTextColor(w03);
        s70Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
        int i12 = this.f32885e;
        if (s70Var.getVisibility() == 0) {
            i3 = 0;
        } else {
            i3 = 9;
        }
        this.f32883b.setLayoutParams(b8.mf.t(i12, i12, 17, 0, i3, 0, 9));
    }
}

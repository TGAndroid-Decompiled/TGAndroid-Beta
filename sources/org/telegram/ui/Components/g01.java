package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashSet;
public final class g01 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f34766a;
    public final i9 f34767b;
    public final z70 f34768c;
    public final z70 d;
    public int f34769e;
    public int f34770f;

    public g01(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f34769e = 90;
        this.f34766a = e6Var;
        setOrientation(1);
        i9 i9Var = new i9(context);
        this.f34767b = i9Var;
        i9Var.getImageReceiver().X(1);
        i9Var.getImageReceiver().W(1);
        i9Var.setOnClickListener(new y60(this, 19));
        addView(i9Var, c8.ja.t(90, 90, 17, 0, 9, 0, 9));
        z70 z70Var = new z70(context, null);
        this.f34768c = z70Var;
        z70Var.setTextSize(1, 20.0f);
        z70Var.setGravity(17);
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        z70Var.setTextAlignment(4);
        addView(z70Var, c8.ja.t(-1, -2, 17, 48, 0, 48, 10));
        z70 z70Var2 = new z70(context, null);
        this.d = z70Var2;
        z70Var2.setTextSize(1, 14.0f);
        z70Var2.setGravity(17);
        z70Var2.setTextAlignment(4);
        addView(z70Var2, c8.ja.t(-1, -2, 17, 48, 0, 48, 17));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2) {
        z70 z70Var = this.f34768c;
        z70Var.setText(charSequence);
        z70Var.setVisibility(0);
        z70 z70Var2 = this.d;
        z70Var2.setText(charSequence2);
        z70Var2.setMaxWidth(hi.l3.a(charSequence2, z70Var2.getPaint()));
        z70Var2.requestLayout();
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setEmoji(int i7) {
        if (this.f34770f != i7) {
            this.f34770f = i7;
            ch0 ch0Var = new ch0(i7, org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            i9 i9Var = this.f34767b;
            i9Var.setImageDrawable(ch0Var);
            i9Var.getImageReceiver().W(2);
        }
    }

    public void setEmojiSize(int i7) {
        if (this.f34769e != i7) {
            this.f34769e = i7;
            updateColors();
        }
    }

    public void setEmojiStatic(int i7) {
        if (this.f34770f != i7) {
            i9 i9Var = this.f34767b;
            i9Var.b();
            this.f34770f = i7;
            i9Var.setImageResource(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.f34768c.setVisibility(8);
        z70 z70Var = this.d;
        z70Var.setText(charSequence);
        z70Var.setMaxWidth(hi.l3.a(charSequence, z70Var.getPaint()));
        z70Var.requestLayout();
        updateColors();
    }

    @Override
    public final void updateColors() {
        int i7;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f34766a;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        z70 z70Var = this.f34768c;
        z70Var.setTextColor(w02);
        int i11 = org.telegram.ui.ActionBar.j6.Xc;
        z70Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        if (z70Var.getVisibility() != 0) {
            i10 = org.telegram.ui.ActionBar.j6.B6;
        }
        int w03 = org.telegram.ui.ActionBar.j6.w0(i10, e6Var);
        z70 z70Var2 = this.d;
        z70Var2.setTextColor(w03);
        z70Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
        int i12 = this.f34769e;
        if (z70Var.getVisibility() == 0) {
            i7 = 0;
        } else {
            i7 = 9;
        }
        this.f34767b.setLayoutParams(c8.ja.t(i12, i12, 17, 0, i7, 0, 9));
    }
}

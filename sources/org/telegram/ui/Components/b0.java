package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_aicompose;
public final class b0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f33113a;
    public final org.telegram.ui.ActionBar.e6 f33114b;
    public int f33115c;
    public boolean d;
    public TL_aicompose.AiComposeTone f33116e;
    public boolean f33117f;
    public final i9 h;
    public final TextView f33118n;
    public float f33119r;

    public b0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = true;
        this.f33113a = i7;
        this.f33114b = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ja.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        i9 i9Var = new i9(context);
        this.h = i9Var;
        org.telegram.messenger.ns.i(i9Var);
        linearLayout.addView(i9Var, c8.ja.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f33118n = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, c8.ja.t(-2, -2, 49, 0, 2, 0, 0));
        c8.na.b(this, 0.05f, 1.5f);
        a(true, 0.0f);
    }

    public final void a(boolean z10, float f10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f10 - this.f33119r) < 0.01f) {
            return;
        }
        this.f33119r = f10;
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33114b;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.Fi;
        int f11 = i0.a.f(f10, w02, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        int f12 = i0.a.f(f10, org.telegram.ui.ActionBar.j6.w0(i7, e6Var), org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        if (!this.f33117f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        i9 i9Var = this.h;
        i9Var.setColorFilter(porterDuffColorFilter);
        i9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        i9Var.invalidate();
        this.f33118n.setTextColor(f12);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
    }

    @Override
    public final void updateColors() {
        int w02;
        a(true, this.f33119r);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = this.f33114b;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.j6.r1(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, e6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28941i6, e6Var);
        }
        int i7 = this.f33115c;
        setBackground(org.telegram.ui.ActionBar.j6.a0(w02, i7, i7));
    }
}

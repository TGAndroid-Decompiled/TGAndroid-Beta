package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_aicompose;
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f32485a;
    public final org.telegram.ui.ActionBar.e6 f32486b;
    public int f32487c;
    public boolean d;
    public TL_aicompose.AiComposeTone f32488e;
    public boolean f32489f;
    public final k9 h;
    public final TextView f32490n;
    public float f32491r;

    public c0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.d = true;
        this.f32485a = i3;
        this.f32486b = e6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        k9 k9Var = new k9(context);
        this.h = k9Var;
        org.telegram.messenger.hs.i(k9Var);
        linearLayout.addView(k9Var, b8.mf.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f32490n = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, b8.mf.t(-2, -2, 49, 0, 2, 0, 0));
        b8.pf.b(this, 0.05f, 1.5f);
        a(true, 0.0f);
    }

    public final void a(boolean z10, float f10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f10 - this.f32491r) < 0.01f) {
            return;
        }
        this.f32491r = f10;
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32486b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.Ci;
        int f11 = i0.a.f(f10, w02, org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        int f12 = i0.a.f(f10, org.telegram.ui.ActionBar.k6.w0(i3, e6Var), org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        if (!this.f32489f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        k9 k9Var = this.h;
        k9Var.setColorFilter(porterDuffColorFilter);
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(f11, PorterDuff.Mode.SRC_IN));
        k9Var.invalidate();
        this.f32490n.setTextColor(f12);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
    }

    @Override
    public final void updateColors() {
        int w02;
        a(true, this.f32491r);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = this.f32486b;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27972i6, e6Var);
        }
        int i3 = this.f32487c;
        setBackground(org.telegram.ui.ActionBar.k6.a0(w02, i3, i3));
    }
}

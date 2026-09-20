package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_aicompose;
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final int f23086a;
    public final org.telegram.ui.ActionBar.f6 f23087b;
    public int f23088c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f23089f;
    public final v9 h;
    public final TextView f23090n;
    public float f23091r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = true;
        this.f23086a = i10;
        this.f23087b = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        v9 v9Var = new v9(context);
        this.h = v9Var;
        NotificationCenter.listenEmojiLoading(v9Var);
        linearLayout.addView(v9Var, w7.y5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f23090n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, w7.y5.t(-2, -2, 49, 0, 2, 0, 0));
        w7.b6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f7 - this.f23091r) < 0.01f) {
            return;
        }
        this.f23091r = f7;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23087b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int d = i0.a.d(f7, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (!this.f23089f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        v9 v9Var = this.h;
        v9Var.setColorFilter(porterDuffColorFilter);
        v9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        v9Var.invalidate();
        this.f23090n.setTextColor(d10);
    }

    @Override
    public final void e() {
        int v02;
        a(this.f23091r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = this.f23087b;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, f6Var);
        }
        int i10 = this.f23088c;
        setBackground(org.telegram.ui.ActionBar.j6.Y(v02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}

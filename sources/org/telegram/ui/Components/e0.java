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
public final class e0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int f27894a;
    public final org.telegram.ui.ActionBar.c6 f27895b;
    public int f27896c;
    public boolean d;
    public TL_aicompose.AiComposeTone f27897e;
    public boolean f27898f;
    public final t9 h;
    public final TextView f27899n;
    public float f27900r;

    public e0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = true;
        this.f27894a = i10;
        this.f27895b = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, i7.f6.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        t9 t9Var = new t9(context);
        this.h = t9Var;
        NotificationCenter.listenEmojiLoading(t9Var);
        linearLayout.addView(t9Var, i7.f6.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f27899n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, i7.f6.t(-2, -2, 49, 0, 2, 0, 0));
        i7.h6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f9, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f9 - this.f27900r) < 0.01f) {
            return;
        }
        this.f27900r = f9;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27895b;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        int d = i0.a.d(f9, v02, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        int d10 = i0.a.d(f9, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        if (!this.f27898f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        t9 t9Var = this.h;
        t9Var.setColorFilter(porterDuffColorFilter);
        t9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        t9Var.invalidate();
        this.f27899n.setTextColor(d10);
    }

    @Override
    public final void e() {
        int v02;
        a(this.f27900r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27895b;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var);
        }
        int i10 = this.f27896c;
        setBackground(org.telegram.ui.ActionBar.g6.Y(v02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}

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
public final class d0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final int f26079a;
    public final org.telegram.ui.ActionBar.g6 f26080b;
    public int f26081c;
    public boolean d;
    public TL_aicompose.AiComposeTone f26082e;
    public boolean f26083f;
    public final p9 h;
    public final TextView f26084n;
    public float f26085r;

    public d0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = true;
        this.f26079a = i10;
        this.f26080b = g6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.c6.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        p9 p9Var = new p9(context);
        this.h = p9Var;
        NotificationCenter.listenEmojiLoading(p9Var);
        linearLayout.addView(p9Var, k7.c6.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f26084n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, k7.c6.t(-2, -2, 49, 0, 2, 0, 0));
        k7.e6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f10, boolean z4) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z4 && Math.abs(f10 - this.f26085r) < 0.01f) {
            return;
        }
        this.f26085r = f10;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f26080b;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        int d = i0.a.d(f10, v02, org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        int d10 = i0.a.d(f10, org.telegram.ui.ActionBar.k6.v0(i10, g6Var), org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        if (!this.f26083f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        p9 p9Var = this.h;
        p9Var.setColorFilter(porterDuffColorFilter);
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        p9Var.invalidate();
        this.f26084n.setTextColor(d10);
    }

    @Override
    public final void e() {
        int v02;
        a(this.f26085r, true);
        boolean z4 = this.d;
        org.telegram.ui.ActionBar.g6 g6Var = this.f26080b;
        if (z4) {
            v02 = org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var);
        }
        int i10 = this.f26081c;
        setBackground(org.telegram.ui.ActionBar.k6.Y(v02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}

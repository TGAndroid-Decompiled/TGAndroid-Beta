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
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final int f23102a;
    public final org.telegram.ui.ActionBar.d6 f23103b;
    public int f23104c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f23105f;
    public final w9 h;
    public final TextView f23106n;
    public float f23107r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.d = true;
        this.f23102a = i10;
        this.f23103b = d6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.y5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        w9 w9Var = new w9(context);
        this.h = w9Var;
        NotificationCenter.listenEmojiLoading(w9Var);
        linearLayout.addView(w9Var, w7.y5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f23106n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, w7.y5.t(-2, -2, 49, 0, 2, 0, 0));
        w7.a6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f7 - this.f23107r) < 0.01f) {
            return;
        }
        this.f23107r = f7;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23103b;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int d = i0.a.d(f7, v02, org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.h6.v0(i10, d6Var), org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        if (!this.f23105f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        w9 w9Var = this.h;
        w9Var.setColorFilter(porterDuffColorFilter);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        w9Var.invalidate();
        this.f23106n.setTextColor(d10);
    }

    @Override
    public final void e() {
        int v02;
        a(this.f23107r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23103b;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19134i6, d6Var);
        }
        int i10 = this.f23104c;
        setBackground(org.telegram.ui.ActionBar.h6.Y(v02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}

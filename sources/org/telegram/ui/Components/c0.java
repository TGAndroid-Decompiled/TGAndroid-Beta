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
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final int f22851a;
    public final org.telegram.ui.ActionBar.f6 f22852b;
    public int f22853c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f22854f;
    public final u9 h;
    public final TextView f22855n;
    public float f22856r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = true;
        this.f22851a = i10;
        this.f22852b = f6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        u9 u9Var = new u9(context);
        this.h = u9Var;
        NotificationCenter.listenEmojiLoading(u9Var);
        linearLayout.addView(u9Var, w7.x5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f22855n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, w7.x5.t(-2, -2, 49, 0, 2, 0, 0));
        w7.z5.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f7 - this.f22856r) < 0.01f) {
            return;
        }
        this.f22856r = f7;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22852b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int d = i0.a.d(f7, v02, org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        int d10 = i0.a.d(f7, org.telegram.ui.ActionBar.j6.v0(i10, f6Var), org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (!this.f22854f) {
            porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        u9 u9Var = this.h;
        u9Var.setColorFilter(porterDuffColorFilter);
        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
        u9Var.invalidate();
        this.f22855n.setTextColor(d10);
    }

    @Override
    public final void e() {
        int v02;
        a(this.f22856r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = this.f22852b;
        if (z10) {
            v02 = org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18952i6, f6Var);
        }
        int i10 = this.f22853c;
        setBackground(org.telegram.ui.ActionBar.j6.Y(v02, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}

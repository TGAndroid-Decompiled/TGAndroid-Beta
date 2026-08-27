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

    public final int f27234a;

    public final org.telegram.ui.ActionBar.c6 f27235b;

    public int f27236c;
    public boolean d;

    public TL_aicompose.AiComposeTone f27237e;

    public boolean f27238f;
    public final n9 h;

    public final TextView f27239n;

    public float f27240r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = true;
        this.f27234a = i10;
        this.f27235b = c6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, h7.z5.d(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        n9 n9Var = new n9(context);
        this.h = n9Var;
        NotificationCenter.listenEmojiLoading(n9Var);
        linearLayout.addView(n9Var, h7.z5.t(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f27239n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, h7.z5.t(-2, -2, 49, 0, 2, 0, 0));
        h7.b6.b(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f10, boolean z10) {
        if (z10 || Math.abs(f10 - this.f27240r) >= 0.01f) {
            this.f27240r = f10;
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f27235b;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
            int i11 = org.telegram.ui.ActionBar.g6.Oh;
            int iD = i0.b.d(f10, iV0, org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            int iD2 = i0.b.d(f10, org.telegram.ui.ActionBar.g6.v0(i10, c6Var), org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            PorterDuffColorFilter porterDuffColorFilter = !this.f27238f ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
            n9 n9Var = this.h;
            n9Var.setColorFilter(porterDuffColorFilter);
            n9Var.setEmojiColorFilter(new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN));
            n9Var.invalidate();
            this.f27239n.setTextColor(iD2);
        }
    }

    @Override
    public final void d() {
        a(this.f27240r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = this.f27235b;
        int iL1 = z10 ? org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)) : org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var);
        int i10 = this.f27236c;
        setBackground(org.telegram.ui.ActionBar.g6.Y(iL1, i10, i10));
    }

    public int[] getColorKeys() {
        return null;
    }
}

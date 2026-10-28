package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.tl.TL_aicompose;
public final class c0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final int f27006a;
    public final org.telegram.ui.ActionBar.u6 f27007b;
    public int f27008c;
    public boolean d;
    public TL_aicompose.AiComposeTone e;
    public boolean f27009f;
    public final y9 h;
    public final TextView f27010n;
    public float f27011r;

    public c0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.d = true;
        this.f27006a = i10;
        this.f27007b = u6Var;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        addView(linearLayout, kb1.h(-2, -2.0f, 17, 0.0f, 2.0f, 0.0f, 2.0f));
        y9 y9Var = new y9(context);
        this.h = y9Var;
        NotificationCenter.listenEmojiLoading(y9Var);
        linearLayout.addView(y9Var, kb1.x(24, 24, 49, 0, 4, 0, 0));
        TextView textView = new TextView(context);
        this.f27010n = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        textView.setGravity(17);
        textView.setSingleLine();
        linearLayout.addView(textView, kb1.x(-2, -2, 49, 0, 2, 0, 0));
        kb1.c(this, 0.05f, 1.5f);
        a(0.0f, true);
    }

    public final void a(float f7, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (!z10 && Math.abs(f7 - this.f27011r) < 0.01f) {
            return;
        }
        this.f27011r = f7;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27007b;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        int f10 = i0.a.f(f7, w02, org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        int f11 = i0.a.f(f7, org.telegram.ui.ActionBar.y6.w0(i10, u6Var), org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        if (!this.f27009f) {
            porterDuffColorFilter = new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        y9 y9Var = this.h;
        y9Var.setColorFilter(porterDuffColorFilter);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
        y9Var.invalidate();
        this.f27010n.setTextColor(f11);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
    }

    @Override
    public final void updateColors() {
        int w02;
        a(this.f27011r, true);
        boolean z10 = this.d;
        org.telegram.ui.ActionBar.u6 u6Var = this.f27007b;
        if (z10) {
            w02 = org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
        } else {
            w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23449i6, u6Var);
        }
        int i10 = this.f27008c;
        setBackground(org.telegram.ui.ActionBar.y6.Z(w02, i10, i10));
    }
}

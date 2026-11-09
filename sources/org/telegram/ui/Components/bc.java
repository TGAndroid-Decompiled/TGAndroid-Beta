package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class bc extends za {
    public final z8 f32206a;
    public final x70 f32207b;
    public final x70 f32208c;
    public final LinearLayout d;

    public bc(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context, g6Var);
        z8 z8Var = new z8(context, false);
        this.f32206a = z8Var;
        z8Var.setStyle(11);
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        addView(z8Var, c8.ha.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z9) {
            jb jbVar = new jb(1, context, null);
            this.f32207b = jbVar;
            org.telegram.messenger.qs.i(jbVar);
            jbVar.setTypeface(Typeface.SANS_SERIF);
            jbVar.setTextSize(1, 15.0f);
            jbVar.setEllipsize(TextUtils.TruncateAt.END);
            jbVar.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
            jbVar.setGravity(org.telegram.messenger.id.f23157a0 ? 5 : 3);
            addView(jbVar, c8.ha.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, c8.ha.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            jb jbVar2 = new jb(2, context, null);
            this.f32207b = jbVar2;
            org.telegram.messenger.qs.i(jbVar2);
            Typeface typeface = Typeface.SANS_SERIF;
            jbVar2.setTypeface(typeface);
            jbVar2.setTextSize(1, 14.0f);
            jbVar2.setTypeface(org.telegram.messenger.g0.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            jbVar2.setEllipsize(truncateAt);
            jbVar2.setMaxLines(1);
            linearLayout.addView(jbVar2);
            x70 x70Var = new x70(context, null);
            this.f32208c = x70Var;
            x70Var.setTypeface(typeface);
            x70Var.setTextSize(1, 12.0f);
            x70Var.setEllipsize(truncateAt);
            x70Var.setSingleLine(false);
            x70Var.setMaxLines(3);
            org.telegram.ui.ActionBar.s6.G(x70Var, org.telegram.ui.ActionBar.l6.uj, g6Var);
            linearLayout.addView(x70Var, c8.ha.t(-2, -2, 0, 0, 0, 0, 0));
        }
        org.telegram.ui.ActionBar.s6.G(this.f32207b, org.telegram.ui.ActionBar.l6.uj, g6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.l6.vj));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.l6.tj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f32207b.getText();
    }

    public void setTextColor(int i7) {
        this.f32207b.setTextColor(i7);
        x70 x70Var = this.f32208c;
        if (x70Var != null) {
            x70Var.setTextColor(i7);
        }
    }
}

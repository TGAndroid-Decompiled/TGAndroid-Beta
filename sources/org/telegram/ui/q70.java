package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q70 extends LinearLayout {
    public final org.telegram.ui.Components.bu f36784a;
    public boolean f36785b;
    public int f36786c;
    public yt d;
    public String e;
    public final p70 f36787f;
    public final t70 h;

    public q70(t70 t70Var, Context context) {
        super(context);
        this.h = t70Var;
        this.f36787f = new p70(this);
        TextView f7 = org.telegram.messenger.l0.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19201j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.bu buVar = new org.telegram.ui.Components.bu(context, null);
        this.f36784a = buVar;
        buVar.setLines(1);
        buVar.setSingleLine(true);
        buVar.setInputType(16384);
        buVar.setTextSize(1, 16.0f);
        buVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        buVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19171hc, false));
        buVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19416uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        buVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        buVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        buVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        buVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19433vf, false));
        buVar.setBackground(null);
        buVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(buVar, w7.y5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36785b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f19216k0);
        }
    }
}

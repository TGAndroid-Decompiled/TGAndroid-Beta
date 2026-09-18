package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q70 extends LinearLayout {
    public final org.telegram.ui.Components.bu f36706a;
    public boolean f36707b;
    public int f36708c;
    public cu d;
    public String e;
    public final p70 f36709f;
    public final t70 h;

    public q70(t70 t70Var, Context context) {
        super(context);
        this.h = t70Var;
        this.f36709f = new p70(this);
        TextView g10 = org.telegram.messenger.q.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19169j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.bu buVar = new org.telegram.ui.Components.bu(context, null);
        this.f36706a = buVar;
        buVar.setLines(1);
        buVar.setSingleLine(true);
        buVar.setInputType(16384);
        buVar.setTextSize(1, 16.0f);
        buVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        buVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19139hc, false));
        buVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19384uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        buVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        buVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        buVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        buVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19401vf, false));
        buVar.setBackground(null);
        buVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.y5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(buVar, w7.y5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f36707b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f19184k0);
        }
    }
}

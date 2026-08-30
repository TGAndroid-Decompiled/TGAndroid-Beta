package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class j70 extends LinearLayout {
    public final org.telegram.ui.Components.vt f35249a;
    public boolean f35250b;
    public int f35251c;
    public g00 d;
    public String e;
    public final i70 f35252f;
    public final m70 h;

    public j70(m70 m70Var, Context context) {
        super(context);
        this.h = m70Var;
        this.f35252f = new i70(this);
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.vt vtVar = new org.telegram.ui.Components.vt(context, null);
        this.f35249a = vtVar;
        vtVar.setLines(1);
        vtVar.setSingleLine(true);
        vtVar.setInputType(16384);
        vtVar.setTextSize(1, 16.0f);
        vtVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ud, false));
        vtVar.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19983hc, false));
        vtVar.setHighlightColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20216uf, false));
        int i10 = org.telegram.ui.ActionBar.j6.Vd;
        vtVar.setHintColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        vtVar.setHintTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        vtVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Wd, false));
        vtVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20234vf, false));
        vtVar.setBackground(null);
        vtVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, k7.b6.t(-2, -2, 16, 20, 0, 0, 0));
        addView(vtVar, k7.b6.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35250b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }
}

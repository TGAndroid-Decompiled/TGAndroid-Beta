package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p70 extends LinearLayout {
    public final org.telegram.ui.Components.su f40772a;
    public boolean f40773b;
    public int f40774c;
    public n70 d;
    public String f40775e;
    public final o70 f40776f;
    public final s70 h;

    public p70(s70 s70Var, Context context) {
        super(context);
        this.h = s70Var;
        this.f40776f = new o70(this);
        TextView f7 = org.telegram.messenger.q.f(context, 1, 16.0f);
        f7.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20894j5, false));
        f7.setText("t.me/addemoji/");
        org.telegram.ui.Components.su suVar = new org.telegram.ui.Components.su(context, null);
        this.f40772a = suVar;
        suVar.setLines(1);
        suVar.setSingleLine(true);
        suVar.setInputType(16384);
        suVar.setTextSize(1, 16.0f);
        suVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        suVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20863hc, false));
        suVar.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21109uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        suVar.setHintColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        suVar.setHintTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        suVar.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        suVar.setHandlesColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21126vf, false));
        suVar.setBackground(null);
        suVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(f7, w7.x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(suVar, w7.x5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40773b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f20908k0);
        }
    }
}

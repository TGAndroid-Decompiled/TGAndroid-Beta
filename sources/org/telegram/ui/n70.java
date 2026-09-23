package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n70 extends LinearLayout {
    public final org.telegram.ui.Components.cu f35444a;
    public boolean f35445b;
    public int f35446c;
    public hw d;
    public String e;
    public final m70 f35447f;
    public final q70 h;

    public n70(q70 q70Var, Context context) {
        super(context);
        this.h = q70Var;
        this.f35447f = new m70(this);
        TextView g10 = org.telegram.messenger.z0.g(context, 1, 16.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18895j5, false));
        g10.setText("t.me/addemoji/");
        org.telegram.ui.Components.cu cuVar = new org.telegram.ui.Components.cu(context, null);
        this.f35444a = cuVar;
        cuVar.setLines(1);
        cuVar.setSingleLine(true);
        cuVar.setInputType(16384);
        cuVar.setTextSize(1, 16.0f);
        cuVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ud, false));
        cuVar.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18865hc, false));
        cuVar.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19109uf, false));
        int i10 = org.telegram.ui.ActionBar.h6.Vd;
        cuVar.setHintColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        cuVar.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        cuVar.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Wd, false));
        cuVar.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19126vf, false));
        cuVar.setBackground(null);
        cuVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g10, w7.x5.t(-2, -2, 16, 20, 0, 0, 0));
        addView(cuVar, w7.x5.t(-1, -2, 16, -4, 0, 0, 0));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false));
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f35445b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.h6.f18910k0);
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e70 extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.ju f38769a;
    public boolean f38770b;
    public int f38771c;
    public kz d;
    public String e;
    public final d70 f38772f;
    public final h70 h;

    public e70(h70 h70Var, Context context) {
        super(context);
        this.h = h70Var;
        this.f38772f = new d70(this);
        TextView g7 = org.telegram.messenger.t.g(context, 1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(g7, org.telegram.ui.ActionBar.y6.f23465j5, null);
        g7.setText("t.me/addemoji/");
        org.telegram.ui.Components.ju juVar = new org.telegram.ui.Components.ju(context, null);
        this.f38769a = juVar;
        juVar.setLines(1);
        juVar.setSingleLine(true);
        juVar.setInputType(16384);
        juVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(juVar, org.telegram.ui.ActionBar.y6.Ud, null);
        org.telegram.ui.ActionBar.f7.H(juVar, org.telegram.ui.ActionBar.y6.f23435hc, null);
        org.telegram.ui.ActionBar.f7.D(juVar, org.telegram.ui.ActionBar.y6.f23683uf, null);
        int i10 = org.telegram.ui.ActionBar.y6.Vd;
        org.telegram.ui.ActionBar.f7.m(juVar, 34, i10, null);
        org.telegram.ui.ActionBar.f7.E(juVar, i10, null);
        org.telegram.ui.ActionBar.f7.m(juVar, 30, org.telegram.ui.ActionBar.y6.Wd, null);
        org.telegram.ui.ActionBar.f7.m(juVar, 36, org.telegram.ui.ActionBar.y6.f23701vf, null);
        juVar.setBackground(null);
        juVar.setHint(LocaleController.getString(R.string.AddEmojiPackLinkHint));
        addView(g7, org.telegram.ui.Components.kb1.x(-2, -2, 16, 20, 0, 0, 0));
        addView(juVar, org.telegram.ui.Components.kb1.x(-1, -2, 16, -4, 0, 0, 0));
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, this, null);
        setPadding(0, AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38770b) {
            canvas.drawLine(AndroidUtilities.dp(20.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.ju juVar = this.f38769a;
        try {
            juVar.setHintColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vd, false));
            juVar.setCursorColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Wd, false));
            juVar.setHandlesColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23701vf, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

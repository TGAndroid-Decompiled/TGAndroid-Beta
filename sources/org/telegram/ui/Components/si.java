package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class si extends ti {
    public int f30806b;
    public final yi f30807c;

    public si(yi yiVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        this.f30807c = yiVar;
        setWillNotDraw(false);
        setFocusable(true);
        e6Var = ((org.telegram.ui.ActionBar.f3) yiVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = e6Var;
        bVar.Q = true;
        TextView textView = bVar.f17139a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f17140b.setLayoutParams(w7.x5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f17147w = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.f17146s = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.bl, e6Var);
        bVar.f();
        this.f31189a = bVar;
        addView(bVar, w7.x5.d(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
        this.f31189a.setText(str);
        this.f31189a.setTabAnimation(aVar);
        this.f30806b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f30806b == this.f30807c.Z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31189a.e(z10, false);
    }
}

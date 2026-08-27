package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class ai extends bi {

    public int f26746b;

    public final gi f26747c;

    public ai(gi giVar, Context context) {
        super(context);
        this.f26747c = giVar;
        setWillNotDraw(false);
        setFocusable(true);
        org.telegram.ui.ActionBar.c6 c6Var = ((org.telegram.ui.ActionBar.e3) giVar).resourcesProvider;
        xg.b bVar = new xg.b(context);
        bVar.d = c6Var;
        bVar.M = true;
        TextView textView = bVar.f49427a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f49428b.setLayoutParams(h7.z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f49435w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f49434s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        this.f27104a = bVar;
        addView(bVar, h7.z5.c(-1.0f, -1));
    }

    public final void a(int i10, String str, xg.a aVar) {
        this.f27104a.setText(str);
        this.f27104a.setTabAnimation(aVar);
        this.f26746b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27104a.e(((long) this.f26746b) == this.f26747c.S0, false);
    }
}

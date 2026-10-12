package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ui extends vi {
    public int f31167b;
    public final aj f31168c;

    public ui(aj ajVar, Context context) {
        super(context);
        org.telegram.ui.ActionBar.c6 c6Var;
        this.f31168c = ajVar;
        setWillNotDraw(false);
        setFocusable(true);
        c6Var = ((org.telegram.ui.ActionBar.e3) ajVar).resourcesProvider;
        oh.b bVar = new oh.b(context);
        bVar.d = c6Var;
        bVar.Q = true;
        TextView textView = bVar.f16891a;
        textView.setTextSize(1, 11.0f);
        textView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        bVar.a(false);
        bVar.f16892b.setLayoutParams(w7.w5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f16899w = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.cl, c6Var);
        bVar.f16898s = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.bl, c6Var);
        bVar.f();
        this.f31525a = bVar;
        addView(bVar, w7.w5.d(-1.0f, -1));
    }

    public final void a(int i10, String str, oh.a aVar) {
        this.f31525a.setText(str);
        this.f31525a.setTabAnimation(aVar);
        this.f31167b = i10;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        if (this.f31167b == this.f31168c.Z0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31525a.e(z10, false);
    }
}

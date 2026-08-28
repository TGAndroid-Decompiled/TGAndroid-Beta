package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
public final class ca extends ja {
    public final int F = 0;
    public final org.telegram.ui.Components.vk0 G;

    public ca(da daVar, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity, b6Var);
        this.G = daVar;
        this.f39414a = true;
    }

    @Override
    public final String getUsernameEditable() {
        switch (this.F) {
            case 0:
                return ((da) this.G).f37485c.f40367r;
            default:
                fg.g gVar = ((to) this.G).f43045c.W2.f43524a;
                if (gVar == null) {
                    return null;
                }
                return gVar.getText().toString();
        }
    }

    public ca(to toVar, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.G = toVar;
    }
}

package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public abstract class m extends FrameLayout implements ud.i {

    public final c6 f23652a;

    public final com.google.firebase.messaging.l f23653b;

    public final ud.j f23654c;

    public m(Context context, c6 c6Var, com.google.firebase.messaging.l lVar) {
        super(context);
        this.f23654c = new ud.j(this, er.h, 350L);
        this.f23652a = c6Var;
        this.f23653b = lVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        CharSequence charSequence2;
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        ud.j jVar = this.f23654c;
        if (zIsEmpty) {
            jVar.f48521a.r(null, true);
            return;
        }
        int iIndexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.l lVar = this.f23653b;
        if (iIndexOf >= 0) {
            SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
            lVar.u(spannableStringValueOf, iIndexOf);
            z10 = true;
            charSequence2 = spannableStringValueOf;
        } else {
            z10 = false;
            charSequence2 = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = g6.gl;
        c6 c6Var = this.f23652a;
        lVar2.setTextColor(g6.v0(i10, c6Var));
        lVar2.setLinkTextColor(g6.v0(i10, c6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(charSequence2);
        if (z10) {
            lVar.c(lVar2);
        }
        addView(lVar2, h7.z5.c(-2.0f, -2));
        jVar.i(lVar2, true);
    }

    public void c(ud.j jVar) {
        for (ud.e eVar : this.f23654c) {
            float fC = eVar.c();
            Object obj = eVar.f48505a;
            float fLerp = AndroidUtilities.lerp(0.85f, 1.0f, fC);
            l lVar = (l) obj;
            lVar.setAlpha(fC);
            lVar.setScaleX(fLerp);
            lVar.setScaleY(fLerp);
            lVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(!eVar.h ? 9.0f : -9.0f), 0, fC));
        }
    }

    public final void d() {
        for (ud.e eVar : this.f23654c) {
            l lVar = (l) eVar.f48505a;
            int i10 = g6.gl;
            c6 c6Var = this.f23652a;
            lVar.setTextColor(g6.v0(i10, c6Var));
            ((l) eVar.f48505a).setLinkTextColor(g6.v0(i10, c6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f23654c.f48521a.d.f48512c.f48522a;
    }

    @Override
    public final void b() {
    }
}

package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Iterator;
import org.telegram.ui.Components.xq;
public abstract class m extends FrameLayout implements te.i {
    public final f6 f28293a;
    public final ab.q f28294b;
    public final te.j f28295c;

    public m(Context context, f6 f6Var, ab.q qVar) {
        super(context);
        this.f28295c = new te.j(this, xq.h, 350L);
        this.f28293a = f6Var;
        this.f28294b = qVar;
    }

    public final void b(CharSequence charSequence, boolean z9) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        te.j jVar = this.f28295c;
        if (isEmpty) {
            jVar.f55395a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ab.q qVar = this.f28294b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            qVar.E(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        l lVar = new l(this, getContext());
        int i7 = k6.Ul;
        f6 f6Var = this.f28293a;
        r6.V(lVar, i7, f6Var);
        r6.H(lVar, i7, f6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(spannableString);
        if (z10) {
            qVar.c(lVar);
        }
        addView(lVar, ha.c(-2.0f, -2));
        jVar.f(lVar, true);
    }

    public final void c() {
        Iterator it = this.f28295c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            int i7 = k6.Ul;
            f6 f6Var = this.f28293a;
            ((l) eVar.f55379a).setTextColor(k6.w0(i7, f6Var));
            ((l) eVar.f55379a).setLinkTextColor(k6.w0(i7, f6Var));
        }
    }

    public void f(te.j jVar) {
        float f10;
        Iterator it = this.f28295c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f55379a;
            float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, c10);
            l lVar = (l) obj;
            lVar.setAlpha(c10);
            lVar.setScaleX(T1);
            lVar.setScaleY(T1);
            if (!eVar.h) {
                f10 = 9.0f;
            } else {
                f10 = -9.0f;
            }
            lVar.setTranslationY(org.telegram.messenger.g0.W1(c10, org.telegram.messenger.g0.L(f10), 0));
        }
    }

    public float getTotalVisibility() {
        return this.f28295c.f55395a.d.f55386c.f55396a;
    }

    @Override
    public final void a() {
    }
}

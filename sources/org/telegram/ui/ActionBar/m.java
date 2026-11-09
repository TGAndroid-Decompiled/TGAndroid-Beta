package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Iterator;
import org.telegram.ui.Components.xq;
public abstract class m extends FrameLayout implements te.i {
    public final g6 f28286a;
    public final ab.q f28287b;
    public final te.j f28288c;

    public m(Context context, g6 g6Var, ab.q qVar) {
        super(context);
        this.f28288c = new te.j(this, xq.h, 350L);
        this.f28286a = g6Var;
        this.f28287b = qVar;
    }

    public final void b(CharSequence charSequence, boolean z9) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        te.j jVar = this.f28288c;
        if (isEmpty) {
            jVar.f55524a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ab.q qVar = this.f28287b;
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
        int i7 = l6.Ul;
        g6 g6Var = this.f28286a;
        s6.U(lVar, i7, g6Var);
        s6.G(lVar, i7, g6Var);
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
        Iterator it = this.f28288c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            int i7 = l6.Ul;
            g6 g6Var = this.f28286a;
            ((l) eVar.f55508a).setTextColor(l6.w0(i7, g6Var));
            ((l) eVar.f55508a).setLinkTextColor(l6.w0(i7, g6Var));
        }
    }

    public void f(te.j jVar) {
        float f10;
        Iterator it = this.f28288c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f55508a;
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
        return this.f28288c.f55524a.d.f55515c.f55525a;
    }

    @Override
    public final void a() {
    }
}

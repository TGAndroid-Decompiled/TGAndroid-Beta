package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ma;
import java.util.Iterator;
import org.telegram.ui.Components.nr;
public abstract class m extends FrameLayout implements te.i {
    public final h6 f29251a;
    public final ab.q f29252b;
    public final te.j f29253c;

    public m(Context context, h6 h6Var, ab.q qVar) {
        super(context);
        this.f29253c = new te.j(this, nr.h, 350L);
        this.f29251a = h6Var;
        this.f29252b = qVar;
    }

    public final void b(CharSequence charSequence, boolean z10) {
        boolean z11;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        te.j jVar = this.f29253c;
        if (isEmpty) {
            jVar.f57721a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ab.q qVar = this.f29252b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            qVar.F(valueOf, indexOf);
            z11 = true;
            spannableString = valueOf;
        } else {
            z11 = false;
            spannableString = charSequence;
        }
        l lVar = new l(this, getContext());
        int i7 = m6.Xl;
        h6 h6Var = this.f29251a;
        t6.U(lVar, i7, h6Var);
        t6.G(lVar, i7, h6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(spannableString);
        if (z11) {
            qVar.c(lVar);
        }
        addView(lVar, ma.c(-2.0f, -2));
        jVar.f(lVar, true);
    }

    public final void c() {
        Iterator it = this.f29253c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            int i7 = m6.Xl;
            h6 h6Var = this.f29251a;
            ((l) eVar.f57705a).setTextColor(m6.w0(i7, h6Var));
            ((l) eVar.f57705a).setLinkTextColor(m6.w0(i7, h6Var));
        }
    }

    public void f(te.j jVar) {
        float f10;
        Iterator it = this.f29253c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f57705a;
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
        return this.f29253c.f57721a.d.f57712c.f57722a;
    }

    @Override
    public final void a() {
    }
}

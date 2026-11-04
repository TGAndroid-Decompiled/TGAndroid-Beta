package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import b8.mf;
import java.util.Iterator;
import org.telegram.ui.Components.xq;
public abstract class m extends FrameLayout implements qe.i {
    public final e6 f28327a;
    public final b4.n f28328b;
    public final qe.j f28329c;

    public m(Context context, e6 e6Var, b4.n nVar) {
        super(context);
        this.f28329c = new qe.j(this, xq.h, 350L);
        this.f28327a = e6Var;
        this.f28328b = nVar;
    }

    public void b(qe.j jVar) {
        float f10;
        Iterator it = this.f28329c.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            float c2 = eVar.c();
            Object obj = eVar.f53849a;
            float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, c2);
            l lVar = (l) obj;
            lVar.setAlpha(c2);
            lVar.setScaleX(T1);
            lVar.setScaleY(T1);
            if (!eVar.h) {
                f10 = 9.0f;
            } else {
                f10 = -9.0f;
            }
            lVar.setTranslationY(org.telegram.messenger.g0.W1(c2, org.telegram.messenger.g0.L(f10), 0));
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        boolean z11;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        qe.j jVar = this.f28329c;
        if (isEmpty) {
            jVar.f53865a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        b4.n nVar = this.f28328b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            nVar.E(valueOf, indexOf);
            z11 = true;
            spannableString = valueOf;
        } else {
            z11 = false;
            spannableString = charSequence;
        }
        l lVar = new l(this, getContext());
        int i3 = k6.Ul;
        e6 e6Var = this.f28327a;
        r6.V(lVar, i3, e6Var);
        r6.H(lVar, i3, e6Var);
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(spannableString);
        if (z11) {
            nVar.c(lVar);
        }
        addView(lVar, mf.c(-2.0f, -2));
        jVar.h(lVar, true);
    }

    public final void d() {
        Iterator it = this.f28329c.iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            int i3 = k6.Ul;
            e6 e6Var = this.f28327a;
            ((l) eVar.f53849a).setTextColor(k6.w0(i3, e6Var));
            ((l) eVar.f53849a).setLinkTextColor(k6.w0(i3, e6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f28329c.f53865a.d.f53856c.f53866a;
    }

    @Override
    public final void a() {
    }
}

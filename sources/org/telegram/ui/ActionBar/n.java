package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Iterator;
import org.telegram.ui.Components.wq;
public abstract class n extends FrameLayout implements te.i {
    public final h6 f28311a;
    public final ab.q f28312b;
    public final te.j f28313c;

    public n(Context context, h6 h6Var, ab.q qVar) {
        super(context);
        this.f28313c = new te.j(this, wq.h, 350L);
        this.f28311a = h6Var;
        this.f28312b = qVar;
    }

    public final void b(CharSequence charSequence, boolean z9) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        te.j jVar = this.f28313c;
        if (isEmpty) {
            jVar.f55523a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ab.q qVar = this.f28312b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            qVar.E(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        m mVar = new m(this, getContext());
        int i7 = m6.Ul;
        h6 h6Var = this.f28311a;
        t6.U(mVar, i7, h6Var);
        t6.G(mVar, i7, h6Var);
        mVar.setTextSize(1, 14.0f);
        mVar.setAlpha(0.0f);
        mVar.setText(spannableString);
        if (z10) {
            qVar.c(mVar);
        }
        addView(mVar, ha.c(-2.0f, -2));
        jVar.f(mVar, true);
    }

    public final void c() {
        Iterator it = this.f28313c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            int i7 = m6.Ul;
            h6 h6Var = this.f28311a;
            ((m) eVar.f55507a).setTextColor(m6.w0(i7, h6Var));
            ((m) eVar.f55507a).setLinkTextColor(m6.w0(i7, h6Var));
        }
    }

    public void f(te.j jVar) {
        float f10;
        Iterator it = this.f28313c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f55507a;
            float T1 = org.telegram.messenger.g0.T1(0.85f, 1.0f, c10);
            m mVar = (m) obj;
            mVar.setAlpha(c10);
            mVar.setScaleX(T1);
            mVar.setScaleY(T1);
            if (!eVar.h) {
                f10 = 9.0f;
            } else {
                f10 = -9.0f;
            }
            mVar.setTranslationY(org.telegram.messenger.g0.W1(c10, org.telegram.messenger.g0.L(f10), 0));
        }
    }

    public float getTotalVisibility() {
        return this.f28313c.f55523a.d.f55514c.f55524a;
    }

    @Override
    public final void a() {
    }
}

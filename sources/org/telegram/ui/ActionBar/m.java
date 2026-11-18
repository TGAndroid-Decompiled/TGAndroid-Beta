package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import c8.ma;
import java.util.Iterator;
import org.telegram.ui.Components.lr;
public abstract class m extends FrameLayout implements te.i {
    public final i6 f29209a;
    public final ab.q f29210b;
    public final te.j f29211c;

    public m(Context context, i6 i6Var, ab.q qVar) {
        super(context);
        this.f29211c = new te.j(this, lr.h, 350L);
        this.f29209a = i6Var;
        this.f29210b = qVar;
    }

    public final void b(CharSequence charSequence, boolean z10) {
        boolean z11;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        te.j jVar = this.f29211c;
        if (isEmpty) {
            jVar.f57682a.m(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ab.q qVar = this.f29210b;
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
        int i7 = n6.Xl;
        i6 i6Var = this.f29209a;
        u6.U(lVar, i7, i6Var);
        u6.G(lVar, i7, i6Var);
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
        Iterator it = this.f29211c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            int i7 = n6.Xl;
            i6 i6Var = this.f29209a;
            ((l) eVar.f57666a).setTextColor(n6.w0(i7, i6Var));
            ((l) eVar.f57666a).setLinkTextColor(n6.w0(i7, i6Var));
        }
    }

    public void f(te.j jVar) {
        float f10;
        Iterator it = this.f29211c.iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f57666a;
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
        return this.f29211c.f57682a.d.f57673c.f57683a;
    }

    @Override
    public final void a() {
    }
}

package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.ui.Components.gr;
public abstract class n extends FrameLayout implements fe.l {
    public final p6 f20606a;
    public final ac.a f20607b;
    public final fe.m f20608c;

    public n(Context context, p6 p6Var, ac.a aVar) {
        super(context);
        this.f20608c = new fe.m(this, gr.h, 350L);
        this.f20606a = p6Var;
        this.f20607b = aVar;
    }

    public void b(fe.m mVar) {
        float f7;
        Iterator it = this.f20608c.iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f7035a;
            float T1 = org.telegram.messenger.i0.T1(0.85f, 1.0f, c10);
            m mVar2 = (m) obj;
            mVar2.setAlpha(c10);
            mVar2.setScaleX(T1);
            mVar2.setScaleY(T1);
            if (!hVar.h) {
                f7 = 9.0f;
            } else {
                f7 = -9.0f;
            }
            mVar2.setTranslationY(org.telegram.messenger.i0.W1(c10, org.telegram.messenger.i0.L(f7), 0));
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        boolean z11;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        fe.m mVar = this.f20608c;
        if (isEmpty) {
            mVar.f7048a.q(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ac.a aVar = this.f20607b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            aVar.D(valueOf, indexOf);
            z11 = true;
            spannableString = valueOf;
        } else {
            z11 = false;
            spannableString = charSequence;
        }
        m mVar2 = new m(this, getContext());
        int i10 = t6.Ul;
        p6 p6Var = this.f20606a;
        a7.V(mVar2, i10, p6Var);
        a7.H(mVar2, i10, p6Var);
        mVar2.setTextSize(1, 14.0f);
        mVar2.setAlpha(0.0f);
        mVar2.setText(spannableString);
        if (z11) {
            aVar.c(mVar2);
        }
        addView(mVar2, w7.b6.c(-2.0f, -2));
        mVar.l(mVar2, true);
    }

    public final void d() {
        Iterator it = this.f20608c.iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            int i10 = t6.Ul;
            p6 p6Var = this.f20606a;
            ((m) hVar.f7035a).setTextColor(t6.w0(i10, p6Var));
            ((m) hVar.f7035a).setLinkTextColor(t6.w0(i10, p6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f20608c.f7048a.d.f7041c.f7049a;
    }

    @Override
    public final void a() {
    }
}

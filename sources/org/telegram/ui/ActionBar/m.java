package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public abstract class m extends FrameLayout implements ne.k {
    public final g6 f21621a;
    public final c2.b f21622b;
    public final ne.l f21623c;

    public m(Context context, g6 g6Var, c2.b bVar) {
        super(context);
        this.f21623c = new ne.l(this, bs.h, 350L);
        this.f21621a = g6Var;
        this.f21622b = bVar;
    }

    public final void b(CharSequence charSequence, boolean z10) {
        boolean z11;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ne.l lVar = this.f21623c;
        if (isEmpty) {
            lVar.f17469a.q(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        c2.b bVar = this.f21622b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            bVar.A(valueOf, indexOf);
            z11 = true;
            spannableString = valueOf;
        } else {
            z11 = false;
            spannableString = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = k6.gl;
        g6 g6Var = this.f21621a;
        r6.W(lVar2, i10, g6Var);
        r6.I(lVar2, i10, g6Var);
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z11) {
            bVar.c(lVar2);
        }
        addView(lVar2, w7.z5.c(-2.0f, -2));
        lVar.h(lVar2, true);
    }

    public final void c() {
        Iterator it = this.f21623c.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            int i10 = k6.gl;
            g6 g6Var = this.f21621a;
            ((l) gVar.f17456a).setTextColor(k6.w0(i10, g6Var));
            ((l) gVar.f17456a).setLinkTextColor(k6.w0(i10, g6Var));
        }
    }

    public void e(ne.l lVar) {
        float f7;
        Iterator it = this.f21623c.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f17456a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            l lVar2 = (l) obj;
            lVar2.setAlpha(c10);
            lVar2.setScaleX(lerp);
            lVar2.setScaleY(lerp);
            if (!gVar.h) {
                f7 = 9.0f;
            } else {
                f7 = -9.0f;
            }
            lVar2.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(f7), 0, c10));
        }
    }

    public float getTotalVisibility() {
        return this.f21623c.f17469a.d.f17462c.f17470a;
    }

    @Override
    public final void a() {
    }
}

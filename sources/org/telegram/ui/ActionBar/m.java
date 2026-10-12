package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public abstract class m extends FrameLayout implements ne.k {
    public final c6 f20511a;
    public final c2.b f20512b;
    public final ne.l f20513c;

    public m(Context context, c6 c6Var, c2.b bVar) {
        super(context);
        this.f20513c = new ne.l(this, es.h, 350L);
        this.f20511a = c6Var;
        this.f20512b = bVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ne.l lVar = this.f20513c;
        if (isEmpty) {
            lVar.f16315a.q(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        c2.b bVar = this.f20512b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            bVar.A(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = g6.gl;
        c6 c6Var = this.f20511a;
        lVar2.setTextColor(g6.w0(i10, c6Var));
        lVar2.setLinkTextColor(g6.w0(i10, c6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z10) {
            bVar.c(lVar2);
        }
        addView(lVar2, w7.a6.d(-2.0f, -2));
        lVar.h(lVar2, true);
    }

    public final void b() {
        Iterator it = this.f20513c.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            int i10 = g6.gl;
            c6 c6Var = this.f20511a;
            ((l) gVar.f16302a).setTextColor(g6.w0(i10, c6Var));
            ((l) gVar.f16302a).setLinkTextColor(g6.w0(i10, c6Var));
        }
    }

    public void e(ne.l lVar) {
        float f7;
        Iterator it = this.f20513c.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f16302a;
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
        return this.f20513c.f16315a.d.f16308c.f16316a;
    }

    @Override
    public final void c() {
    }
}

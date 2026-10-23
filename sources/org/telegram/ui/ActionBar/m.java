package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public abstract class m extends FrameLayout implements ne.k {
    public final d6 f21571a;
    public final c2.b f21572b;
    public final ne.l f21573c;

    public m(Context context, d6 d6Var, c2.b bVar) {
        super(context);
        this.f21573c = new ne.l(this, bs.h, 350L);
        this.f21571a = d6Var;
        this.f21572b = bVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ne.l lVar = this.f21573c;
        if (isEmpty) {
            lVar.f17406a.q(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        c2.b bVar = this.f21572b;
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
        int i10 = h6.gl;
        d6 d6Var = this.f21571a;
        lVar2.setTextColor(h6.w0(i10, d6Var));
        lVar2.setLinkTextColor(h6.w0(i10, d6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z10) {
            bVar.c(lVar2);
        }
        addView(lVar2, w7.z5.c(-2.0f, -2));
        lVar.h(lVar2, true);
    }

    public final void b() {
        Iterator it = this.f21573c.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            int i10 = h6.gl;
            d6 d6Var = this.f21571a;
            ((l) gVar.f17393a).setTextColor(h6.w0(i10, d6Var));
            ((l) gVar.f17393a).setLinkTextColor(h6.w0(i10, d6Var));
        }
    }

    public void e(ne.l lVar) {
        float f7;
        Iterator it = this.f21573c.iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f17393a;
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
        return this.f21573c.f17406a.d.f17399c.f17407a;
    }

    @Override
    public final void c() {
    }
}

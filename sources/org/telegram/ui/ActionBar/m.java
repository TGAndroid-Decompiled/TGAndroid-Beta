package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public abstract class m extends FrameLayout implements oe.k {
    public final u6 f22855a;
    public final c2.b f22856b;
    public final oe.l f22857c;

    public m(Context context, u6 u6Var, c2.b bVar) {
        super(context);
        this.f22857c = new oe.l(this, ds.h, 350L);
        this.f22855a = u6Var;
        this.f22856b = bVar;
    }

    public void b(oe.l lVar) {
        float f7;
        Iterator it = this.f22857c.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f19337a;
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

    public final void c(CharSequence charSequence, boolean z10) {
        boolean z11;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        oe.l lVar = this.f22857c;
        if (isEmpty) {
            lVar.f19350a.q(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        c2.b bVar = this.f22856b;
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
        int i10 = y6.gl;
        u6 u6Var = this.f22855a;
        f7.V(lVar2, i10, u6Var);
        f7.H(lVar2, i10, u6Var);
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z11) {
            bVar.c(lVar2);
        }
        addView(lVar2, gb1.g(-2.0f, -2));
        lVar.h(lVar2, true);
    }

    public final void d() {
        Iterator it = this.f22857c.iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            int i10 = y6.gl;
            u6 u6Var = this.f22855a;
            ((l) gVar.f19337a).setTextColor(y6.w0(i10, u6Var));
            ((l) gVar.f19337a).setLinkTextColor(y6.w0(i10, u6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f22857c.f19350a.d.f19343c.f19351a;
    }

    @Override
    public final void a() {
    }
}

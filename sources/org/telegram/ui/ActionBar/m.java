package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public abstract class m extends FrameLayout implements td.i {
    public final b6 f23648a;
    public final com.google.firebase.messaging.l f23649b;
    public final td.j f23650c;

    public m(Context context, b6 b6Var, com.google.firebase.messaging.l lVar) {
        super(context);
        this.f23650c = new td.j(this, gr.h, 350L);
        this.f23648a = b6Var;
        this.f23649b = lVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        td.j jVar = this.f23650c;
        if (isEmpty) {
            jVar.f47799a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.l lVar = this.f23649b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            lVar.u(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i9 = f6.gl;
        b6 b6Var = this.f23648a;
        lVar2.setTextColor(f6.v0(i9, b6Var));
        lVar2.setLinkTextColor(f6.v0(i9, b6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z10) {
            lVar.c(lVar2);
        }
        addView(lVar2, g7.e6.c(-2.0f, -2));
        jVar.i(lVar2, true);
    }

    public void c(td.j jVar) {
        float f10;
        Iterator it = this.f23650c.iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            float c10 = eVar.c();
            Object obj = eVar.f47783a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            l lVar = (l) obj;
            lVar.setAlpha(c10);
            lVar.setScaleX(lerp);
            lVar.setScaleY(lerp);
            if (!eVar.h) {
                f10 = 9.0f;
            } else {
                f10 = -9.0f;
            }
            lVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(f10), 0, c10));
        }
    }

    public final void d() {
        Iterator it = this.f23650c.iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            int i9 = f6.gl;
            b6 b6Var = this.f23648a;
            ((l) eVar.f47783a).setTextColor(f6.v0(i9, b6Var));
            ((l) eVar.f47783a).setLinkTextColor(f6.v0(i9, b6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f23650c.f47799a.d.f47790c.f47800a;
    }

    @Override
    public final void b() {
    }
}

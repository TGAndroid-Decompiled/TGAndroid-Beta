package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public abstract class m extends FrameLayout implements xd.i {
    public final g6 f22126a;
    public final cb.m f22127b;
    public final xd.j f22128c;

    public m(Context context, g6 g6Var, cb.m mVar) {
        super(context);
        this.f22128c = new xd.j(this, pr.h, 350L);
        this.f22126a = g6Var;
        this.f22127b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z4;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        xd.j jVar = this.f22128c;
        if (isEmpty) {
            jVar.f50565a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        cb.m mVar = this.f22127b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar.x(valueOf, indexOf);
            z4 = true;
            spannableString = valueOf;
        } else {
            z4 = false;
            spannableString = charSequence;
        }
        l lVar = new l(this, getContext());
        int i10 = k6.gl;
        g6 g6Var = this.f22126a;
        lVar.setTextColor(k6.v0(i10, g6Var));
        lVar.setLinkTextColor(k6.v0(i10, g6Var));
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(spannableString);
        if (z4) {
            mVar.c(lVar);
        }
        addView(lVar, k7.c6.c(-2.0f, -2));
        jVar.i(lVar, true);
    }

    public final void c() {
        Iterator it = this.f22128c.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            int i10 = k6.gl;
            g6 g6Var = this.f22126a;
            ((l) eVar.f50549a).setTextColor(k6.v0(i10, g6Var));
            ((l) eVar.f50549a).setLinkTextColor(k6.v0(i10, g6Var));
        }
    }

    public void e(xd.j jVar) {
        float f10;
        Iterator it = this.f22128c.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.f50549a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c3);
            l lVar = (l) obj;
            lVar.setAlpha(c3);
            lVar.setScaleX(lerp);
            lVar.setScaleY(lerp);
            if (!eVar.h) {
                f10 = 9.0f;
            } else {
                f10 = -9.0f;
            }
            lVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(f10), 0, c3));
        }
    }

    public float getTotalVisibility() {
        return this.f22128c.f50565a.d.f50556c.f50566a;
    }

    @Override
    public final void a() {
    }
}

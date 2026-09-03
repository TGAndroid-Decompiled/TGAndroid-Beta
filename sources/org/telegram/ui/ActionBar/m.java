package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
public abstract class m extends FrameLayout implements xd.i {
    public final f6 f20418a;
    public final cb.m f20419b;
    public final xd.j f20420c;

    public m(Context context, f6 f6Var, cb.m mVar) {
        super(context);
        this.f20420c = new xd.j(this, mr.h, 350L);
        this.f20418a = f6Var;
        this.f20419b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z4;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        xd.j jVar = this.f20420c;
        if (isEmpty) {
            jVar.f46980a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        cb.m mVar = this.f20419b;
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
        int i10 = j6.gl;
        f6 f6Var = this.f20418a;
        lVar.setTextColor(j6.v0(i10, f6Var));
        lVar.setLinkTextColor(j6.v0(i10, f6Var));
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(spannableString);
        if (z4) {
            mVar.c(lVar);
        }
        addView(lVar, k7.b6.c(-2.0f, -2));
        jVar.i(lVar, true);
    }

    public final void c() {
        Iterator it = this.f20420c.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            int i10 = j6.gl;
            f6 f6Var = this.f20418a;
            ((l) eVar.f46967a).setTextColor(j6.v0(i10, f6Var));
            ((l) eVar.f46967a).setLinkTextColor(j6.v0(i10, f6Var));
        }
    }

    public void e(xd.j jVar) {
        float f10;
        Iterator it = this.f20420c.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.f46967a;
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
        return this.f20420c.f46980a.d.f46973c.f46981a;
    }

    @Override
    public final void a() {
    }
}

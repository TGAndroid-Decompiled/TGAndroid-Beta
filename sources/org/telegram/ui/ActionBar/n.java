package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public abstract class n extends FrameLayout implements vd.j {
    public final c6 f23692a;
    public final ab.m f23693b;
    public final vd.k f23694c;

    public n(Context context, c6 c6Var, ab.m mVar) {
        super(context);
        this.f23694c = new vd.k(this, jr.h, 350L);
        this.f23692a = c6Var;
        this.f23693b = mVar;
    }

    public void b(vd.k kVar) {
        float f9;
        Iterator it = this.f23694c.iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            float c3 = fVar.c();
            Object obj = fVar.f49514a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c3);
            m mVar = (m) obj;
            mVar.setAlpha(c3);
            mVar.setScaleX(lerp);
            mVar.setScaleY(lerp);
            if (!fVar.h) {
                f9 = 9.0f;
            } else {
                f9 = -9.0f;
            }
            mVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(f9), 0, c3));
        }
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        vd.k kVar = this.f23694c;
        if (isEmpty) {
            kVar.f49530a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        ab.m mVar = this.f23693b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar.u(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        m mVar2 = new m(this, getContext());
        int i10 = g6.gl;
        c6 c6Var = this.f23692a;
        mVar2.setTextColor(g6.v0(i10, c6Var));
        mVar2.setLinkTextColor(g6.v0(i10, c6Var));
        mVar2.setTextSize(1, 14.0f);
        mVar2.setAlpha(0.0f);
        mVar2.setText(spannableString);
        if (z10) {
            mVar.c(mVar2);
        }
        addView(mVar2, i7.f6.c(-2.0f, -2));
        kVar.i(mVar2, true);
    }

    public final void d() {
        Iterator it = this.f23694c.iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            int i10 = g6.gl;
            c6 c6Var = this.f23692a;
            ((m) fVar.f49514a).setTextColor(g6.v0(i10, c6Var));
            ((m) fVar.f49514a).setLinkTextColor(g6.v0(i10, c6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f23694c.f49530a.d.f49521c.f49531a;
    }

    @Override
    public final void a() {
    }
}

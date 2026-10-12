package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.js;
public abstract class m extends FrameLayout implements me.k {
    public final c6 f21135a;
    public final com.google.firebase.messaging.m f21136b;
    public final me.l f21137c;

    public m(Context context, c6 c6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.f21137c = new me.l(this, js.h, 350L);
        this.f21135a = c6Var;
        this.f21136b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        me.l lVar = this.f21137c;
        if (isEmpty) {
            lVar.f16114a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar = this.f21136b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar.A(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = h6.gl;
        c6 c6Var = this.f21135a;
        lVar2.setTextColor(h6.w0(i10, c6Var));
        lVar2.setLinkTextColor(h6.w0(i10, c6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z10) {
            mVar.c(lVar2);
        }
        addView(lVar2, w7.w5.d(-2.0f, -2));
        lVar.i(lVar2, true);
    }

    public void c(me.l lVar) {
        float f7;
        Iterator it = this.f21137c.iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f16098a;
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

    public final void d() {
        Iterator it = this.f21137c.iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            int i10 = h6.gl;
            c6 c6Var = this.f21135a;
            ((l) gVar.f16098a).setTextColor(h6.w0(i10, c6Var));
            ((l) gVar.f16098a).setLinkTextColor(h6.w0(i10, c6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f21137c.f16114a.d.f16105c.f16115a;
    }

    @Override
    public final void a() {
    }
}

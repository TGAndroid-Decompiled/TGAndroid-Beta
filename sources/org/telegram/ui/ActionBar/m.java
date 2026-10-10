package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
public abstract class m extends FrameLayout implements me.k {
    public final e6 f21373a;
    public final com.google.firebase.messaging.m f21374b;
    public final me.l f21375c;

    public m(Context context, e6 e6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.f21375c = new me.l(this, is.h, 350L);
        this.f21373a = e6Var;
        this.f21374b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        me.l lVar = this.f21375c;
        if (isEmpty) {
            lVar.f16368a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar = this.f21374b;
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
        int i10 = i6.gl;
        e6 e6Var = this.f21373a;
        lVar2.setTextColor(i6.w0(i10, e6Var));
        lVar2.setLinkTextColor(i6.w0(i10, e6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z10) {
            mVar.c(lVar2);
        }
        addView(lVar2, w7.x5.d(-2.0f, -2));
        lVar.i(lVar2, true);
    }

    public void c(me.l lVar) {
        float f7;
        Iterator it = this.f21375c.iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f16352a;
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
        Iterator it = this.f21375c.iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            int i10 = i6.gl;
            e6 e6Var = this.f21373a;
            ((l) gVar.f16352a).setTextColor(i6.w0(i10, e6Var));
            ((l) gVar.f16352a).setLinkTextColor(i6.w0(i10, e6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f21375c.f16368a.d.f16359c.f16369a;
    }

    @Override
    public final void a() {
    }
}

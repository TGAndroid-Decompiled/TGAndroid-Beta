package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public abstract class m extends FrameLayout implements le.k {
    public final d6 f21367a;
    public final com.google.firebase.messaging.m f21368b;
    public final le.l f21369c;

    public m(Context context, d6 d6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.f21369c = new le.l(this, tr.h, 350L);
        this.f21367a = d6Var;
        this.f21368b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        le.l lVar = this.f21369c;
        if (isEmpty) {
            lVar.f15463a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar = this.f21368b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar.x(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        l lVar2 = new l(this, getContext());
        int i10 = i6.gl;
        d6 d6Var = this.f21367a;
        lVar2.setTextColor(i6.v0(i10, d6Var));
        lVar2.setLinkTextColor(i6.v0(i10, d6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z10) {
            mVar.c(lVar2);
        }
        addView(lVar2, w7.z5.c(-2.0f, -2));
        lVar.i(lVar2, true);
    }

    public void c(le.l lVar) {
        float f7;
        Iterator it = this.f21369c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f15447a;
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
        Iterator it = this.f21369c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            int i10 = i6.gl;
            d6 d6Var = this.f21367a;
            ((l) gVar.f15447a).setTextColor(i6.v0(i10, d6Var));
            ((l) gVar.f15447a).setLinkTextColor(i6.v0(i10, d6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f21369c.f15463a.d.f15454c.f15464a;
    }

    @Override
    public final void a() {
    }
}

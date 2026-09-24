package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
public abstract class m extends FrameLayout implements le.l {
    public final d6 f19611a;
    public final com.google.firebase.messaging.m f19612b;
    public final le.m f19613c;

    public m(Context context, d6 d6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.f19613c = new le.m(this, rr.h, 350L);
        this.f19611a = d6Var;
        this.f19612b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        le.m mVar = this.f19613c;
        if (isEmpty) {
            mVar.f14208a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar2 = this.f19612b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar2.x(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        l lVar = new l(this, getContext());
        int i10 = h6.gl;
        d6 d6Var = this.f19611a;
        lVar.setTextColor(h6.v0(i10, d6Var));
        lVar.setLinkTextColor(h6.v0(i10, d6Var));
        lVar.setTextSize(1, 14.0f);
        lVar.setAlpha(0.0f);
        lVar.setText(spannableString);
        if (z10) {
            mVar2.c(lVar);
        }
        addView(lVar, w7.y5.c(-2.0f, -2));
        mVar.i(lVar, true);
    }

    public void c(le.m mVar) {
        float f7;
        Iterator it = this.f19613c.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f14195a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            l lVar = (l) obj;
            lVar.setAlpha(c10);
            lVar.setScaleX(lerp);
            lVar.setScaleY(lerp);
            if (!hVar.h) {
                f7 = 9.0f;
            } else {
                f7 = -9.0f;
            }
            lVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(f7), 0, c10));
        }
    }

    public final void d() {
        Iterator it = this.f19613c.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            int i10 = h6.gl;
            d6 d6Var = this.f19611a;
            ((l) hVar.f14195a).setTextColor(h6.v0(i10, d6Var));
            ((l) hVar.f14195a).setLinkTextColor(h6.v0(i10, d6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f19613c.f14208a.d.f14201c.f14209a;
    }

    @Override
    public final void a() {
    }
}

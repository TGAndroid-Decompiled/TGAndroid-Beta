package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public abstract class m extends FrameLayout implements le.k {
    public final d6 f21363a;
    public final com.google.firebase.messaging.m f21364b;
    public final le.l f21365c;

    public m(Context context, d6 d6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.f21365c = new le.l(this, tr.h, 350L);
        this.f21363a = d6Var;
        this.f21364b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        le.l lVar = this.f21365c;
        if (isEmpty) {
            lVar.f15462a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar = this.f21364b;
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
        d6 d6Var = this.f21363a;
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
        Iterator it = this.f21365c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f15446a;
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
        Iterator it = this.f21365c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            int i10 = i6.gl;
            d6 d6Var = this.f21363a;
            ((l) gVar.f15446a).setTextColor(i6.v0(i10, d6Var));
            ((l) gVar.f15446a).setLinkTextColor(i6.v0(i10, d6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f21365c.f15462a.d.f15453c.f15463a;
    }

    @Override
    public final void a() {
    }
}

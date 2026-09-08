package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public abstract class m extends FrameLayout implements le.k {
    public final f6 f21213a;
    public final com.google.firebase.messaging.m f21214b;
    public final le.l f21215c;

    public m(Context context, f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.f21215c = new le.l(this, pr.h, 350L);
        this.f21213a = f6Var;
        this.f21214b = mVar;
    }

    public final void a(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        le.l lVar = this.f21215c;
        if (isEmpty) {
            lVar.f15422a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar = this.f21214b;
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
        int i10 = j6.gl;
        f6 f6Var = this.f21213a;
        lVar2.setTextColor(j6.v0(i10, f6Var));
        lVar2.setLinkTextColor(j6.v0(i10, f6Var));
        lVar2.setTextSize(1, 14.0f);
        lVar2.setAlpha(0.0f);
        lVar2.setText(spannableString);
        if (z10) {
            mVar.c(lVar2);
        }
        addView(lVar2, w7.x5.c(-2.0f, -2));
        lVar.i(lVar2, true);
    }

    public final void b() {
        Iterator it = this.f21215c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            int i10 = j6.gl;
            f6 f6Var = this.f21213a;
            ((l) gVar.f15406a).setTextColor(j6.v0(i10, f6Var));
            ((l) gVar.f15406a).setLinkTextColor(j6.v0(i10, f6Var));
        }
    }

    public void e(le.l lVar) {
        float f7;
        Iterator it = this.f21215c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f15406a;
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

    public float getTotalVisibility() {
        return this.f21215c.f15422a.d.f15413c.f15423a;
    }

    @Override
    public final void c() {
    }
}

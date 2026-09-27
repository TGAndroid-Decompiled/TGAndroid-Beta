package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
public abstract class n extends FrameLayout implements le.l {
    public final e6 f19643a;
    public final com.google.firebase.messaging.m f19644b;
    public final le.m f19645c;

    public n(Context context, e6 e6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.f19645c = new le.m(this, sr.h, 350L);
        this.f19643a = e6Var;
        this.f19644b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        le.m mVar = this.f19645c;
        if (isEmpty) {
            mVar.f14225a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar2 = this.f19644b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar2.x(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        m mVar3 = new m(this, getContext());
        int i10 = i6.gl;
        e6 e6Var = this.f19643a;
        mVar3.setTextColor(i6.v0(i10, e6Var));
        mVar3.setLinkTextColor(i6.v0(i10, e6Var));
        mVar3.setTextSize(1, 14.0f);
        mVar3.setAlpha(0.0f);
        mVar3.setText(spannableString);
        if (z10) {
            mVar2.c(mVar3);
        }
        addView(mVar3, w7.y5.c(-2.0f, -2));
        mVar.i(mVar3, true);
    }

    public void c(le.m mVar) {
        float f7;
        Iterator it = this.f19645c.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.f14212a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            m mVar2 = (m) obj;
            mVar2.setAlpha(c10);
            mVar2.setScaleX(lerp);
            mVar2.setScaleY(lerp);
            if (!hVar.h) {
                f7 = 9.0f;
            } else {
                f7 = -9.0f;
            }
            mVar2.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(f7), 0, c10));
        }
    }

    public final void d() {
        Iterator it = this.f19645c.iterator();
        while (it.hasNext()) {
            le.h hVar = (le.h) it.next();
            int i10 = i6.gl;
            e6 e6Var = this.f19643a;
            ((m) hVar.f14212a).setTextColor(i6.v0(i10, e6Var));
            ((m) hVar.f14212a).setLinkTextColor(i6.v0(i10, e6Var));
        }
    }

    public float getTotalVisibility() {
        return this.f19645c.f14225a.d.f14218c.f14226a;
    }

    @Override
    public final void a() {
    }
}

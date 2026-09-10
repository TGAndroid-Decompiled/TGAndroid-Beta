package org.telegram.ui.ActionBar;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public abstract class n extends FrameLayout implements le.k {
    public final f6 f18479a;
    public final com.google.firebase.messaging.m f18480b;
    public final le.l f18481c;

    public n(Context context, f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context);
        this.f18481c = new le.l(this, wr.h, 350L);
        this.f18479a = f6Var;
        this.f18480b = mVar;
    }

    public final void b(CharSequence charSequence) {
        boolean z10;
        SpannableString spannableString;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        le.l lVar = this.f18481c;
        if (isEmpty) {
            lVar.f12892a.r(null, true);
            return;
        }
        int indexOf = TextUtils.indexOf(charSequence, "...");
        com.google.firebase.messaging.m mVar = this.f18480b;
        if (indexOf >= 0) {
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            mVar.x(valueOf, indexOf);
            z10 = true;
            spannableString = valueOf;
        } else {
            z10 = false;
            spannableString = charSequence;
        }
        m mVar2 = new m(this, getContext());
        int i10 = j6.gl;
        f6 f6Var = this.f18479a;
        mVar2.setTextColor(j6.v0(i10, f6Var));
        mVar2.setLinkTextColor(j6.v0(i10, f6Var));
        mVar2.setTextSize(1, 14.0f);
        mVar2.setAlpha(0.0f);
        mVar2.setText(spannableString);
        if (z10) {
            mVar.c(mVar2);
        }
        addView(mVar2, w7.a6.c(-2.0f, -2));
        lVar.i(mVar2, true);
    }

    public final void c() {
        Iterator it = this.f18481c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            int i10 = j6.gl;
            f6 f6Var = this.f18479a;
            ((m) gVar.f12879a).setTextColor(j6.v0(i10, f6Var));
            ((m) gVar.f12879a).setLinkTextColor(j6.v0(i10, f6Var));
        }
    }

    public void e(le.l lVar) {
        float f7;
        Iterator it = this.f18481c.iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            float c10 = gVar.c();
            Object obj = gVar.f12879a;
            float lerp = AndroidUtilities.lerp(0.85f, 1.0f, c10);
            m mVar = (m) obj;
            mVar.setAlpha(c10);
            mVar.setScaleX(lerp);
            mVar.setScaleY(lerp);
            if (!gVar.h) {
                f7 = 9.0f;
            } else {
                f7 = -9.0f;
            }
            mVar.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(f7), 0, c10));
        }
    }

    public float getTotalVisibility() {
        return this.f18481c.f12892a.d.f12885c.f12893a;
    }

    @Override
    public final void a() {
    }
}

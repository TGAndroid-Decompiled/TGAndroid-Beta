package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
public final class l extends qw0 {
    public final m U0;

    public l(m mVar, Context context, int i) {
        super(i, null, context, false);
        this.U0 = mVar;
    }

    @Override
    public final void B(boolean z, String str) {
        String str2;
        String M0;
        boolean z2;
        m mVar = this.U0;
        if (z) {
            if (mVar.r == null) {
                ix ixVar = mVar.e;
                cx cxVar = new cx(mVar.getContext());
                mVar.r = cxVar;
                ixVar.addView(cxVar, qoe.c(-1.0f, -1));
                mVar.r.h.setOnClickListener(new j1(mVar, (byte) 12));
                gm.T3(mVar.r, mVar.n, 1.0f, true, false);
            }
            cx cxVar2 = mVar.r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = cxVar2.e;
            cxVar2.d.setText(jb6.M0(2131742585, null));
            String r = qw0.r(str2);
            if (r != null && Uri.parse(r) != null && Uri.parse(r).getAuthority() != null) {
                M0 = jb6.a0(null, null, 2131742586, Uri.parse(r).getAuthority());
            } else {
                M0 = jb6.M0(2131742588, null);
            }
            textView.setText(gw3.m(gm.S2(M0), textView.getPaint().getFontMetricsInt(), false, null, 0));
            cxVar2.f.setText(str);
            cx cxVar3 = mVar.r;
            int i = cmb.Fl;
            if (gm.B(cmb.w0(null, i, false)) <= 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            cxVar3.b(z2, false);
            anb.h(i, null, mVar.r);
        }
        cx cxVar4 = mVar.r;
        mVar.n = z;
        gm.T3(cxVar4, z, 1.0f, true, false);
        invalidate();
    }

    @Override
    public final void F() {
        this.U0.M.g0(true);
    }

    @Override
    public final void G(boolean z, boolean z2) {
        float f;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        m mVar = this.U0;
        mVar.s = !z;
        mVar.w = !z2;
        o oVar = mVar.M;
        oVar.g0(true);
        if (mVar == oVar.v0[0]) {
            wu wuVar = oVar.i0;
            if (!wuVar.a0 && !wuVar.U) {
                ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f) {
                    if (!oVar.G() && oVar.e0.size() <= 1) {
                        oVar.i0.setBackButtonCached(false);
                        oVar.i0.Q.c();
                    } else {
                        ee0 ee0Var = oVar.i0.N;
                        if (!mVar.s && oVar.e0.size() <= 1) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        ee0Var.c(true, f);
                        wu wuVar2 = oVar.i0;
                        if (!mVar.s && oVar.e0.size() <= 1) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        wuVar2.setBackButtonCached(z3);
                        oVar.i0.Q.c();
                    }
                    oVar.i0.setHasForward(mVar.w);
                    wu wuVar3 = oVar.i0;
                    m mVar2 = oVar.v0[0];
                    if (mVar2 != null && mVar2.d()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    wuVar3.setIsTonsite(z4);
                    wu wuVar4 = oVar.i0;
                    m mVar3 = oVar.v0[0];
                    if (mVar3 == null || !mVar3.c()) {
                        z5 = false;
                    }
                    wuVar4.setIsLocal(z5);
                }
            }
        }
    }

    @Override
    public final void H(mw0 mw0Var) {
        this.U0.e.setWebView(mw0Var);
    }

    @Override
    public final void S(String str, boolean z) {
        bvc bvcVar;
        m mVar = this.U0;
        o oVar = mVar.M;
        if (oVar.i0 != null && mVar == oVar.v0[0] && (bvcVar = mVar.F) != null && bvcVar.b() == null) {
            mVar.F.d(getWebView());
        }
        super.S(str, z);
    }
}

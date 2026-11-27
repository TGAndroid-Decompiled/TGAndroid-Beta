package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
public final class l extends rv0 {
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
                jw jwVar = mVar.e;
                dw dwVar = new dw(mVar.getContext());
                mVar.r = dwVar;
                jwVar.addView(dwVar, tre.c(-1.0f, -1));
                mVar.r.h.setOnClickListener(new k1(mVar, (byte) 11));
                hl.T3(mVar.r, mVar.n, 1.0f, true, false);
            }
            dw dwVar2 = mVar.r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = dwVar2.e;
            dwVar2.d.setText(ob6.M0(2131742553, null));
            String r = rv0.r(str2);
            if (r != null && Uri.parse(r) != null && Uri.parse(r).getAuthority() != null) {
                M0 = ob6.a0(null, null, 2131742554, Uri.parse(r).getAuthority());
            } else {
                M0 = ob6.M0(2131742556, null);
            }
            textView.setText(pv3.m(hl.S2(M0), textView.getPaint().getFontMetricsInt(), false, null, 0));
            dwVar2.f.setText(str);
            dw dwVar3 = mVar.r;
            int i = aob.Gl;
            if (hl.B(aob.w0(null, i, false)) <= 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            dwVar3.b(z2, false);
            yob.h(i, null, mVar.r);
        }
        dw dwVar4 = mVar.r;
        mVar.n = z;
        hl.T3(dwVar4, z, 1.0f, true, false);
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
            xt xtVar = oVar.i0;
            if (!xtVar.a0 && !xtVar.U) {
                ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f) {
                    if (!oVar.G() && oVar.e0.size() <= 1) {
                        oVar.i0.setBackButtonCached(false);
                        oVar.i0.Q.c();
                    } else {
                        gd0 gd0Var = oVar.i0.N;
                        if (!mVar.s && oVar.e0.size() <= 1) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        gd0Var.c(true, f);
                        xt xtVar2 = oVar.i0;
                        if (!mVar.s && oVar.e0.size() <= 1) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        xtVar2.setBackButtonCached(z3);
                        oVar.i0.Q.c();
                    }
                    oVar.i0.setHasForward(mVar.w);
                    xt xtVar3 = oVar.i0;
                    m mVar2 = oVar.v0[0];
                    if (mVar2 != null && mVar2.d()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xtVar3.setIsTonsite(z4);
                    xt xtVar4 = oVar.i0;
                    m mVar3 = oVar.v0[0];
                    if (mVar3 == null || !mVar3.c()) {
                        z5 = false;
                    }
                    xtVar4.setIsLocal(z5);
                }
            }
        }
    }

    @Override
    public final void H(nv0 nv0Var) {
        this.U0.e.setWebView(nv0Var);
    }

    @Override
    public final void S(String str, boolean z) {
        pxc pxcVar;
        m mVar = this.U0;
        o oVar = mVar.M;
        if (oVar.i0 != null && mVar == oVar.v0[0] && (pxcVar = mVar.F) != null && pxcVar.b() == null) {
            mVar.F.d(getWebView());
        }
        super.S(str, z);
    }
}

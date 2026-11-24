package org.telegram.ui;

import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
public final class l extends hv0 {
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
                iw iwVar = mVar.e;
                cw cwVar = new cw(mVar.getContext());
                mVar.r = cwVar;
                iwVar.addView(cwVar, nme.c(-1.0f, -1));
                mVar.r.h.setOnClickListener(new j1(mVar, (byte) 11));
                gl.U3(mVar.r, mVar.n, 1.0f, true, false);
            }
            cw cwVar2 = mVar.r;
            if (getWebView() != null) {
                str2 = getWebView().getUrl();
            } else {
                str2 = null;
            }
            TextView textView = cwVar2.e;
            cwVar2.d.setText(k96.M0(2131742659, null));
            String r = hv0.r(str2);
            if (r != null && Uri.parse(r) != null && Uri.parse(r).getAuthority() != null) {
                M0 = k96.a0(null, null, 2131742660, Uri.parse(r).getAuthority());
            } else {
                M0 = k96.M0(2131742662, null);
            }
            textView.setText(vu3.m(gl.T2(M0), textView.getPaint().getFontMetricsInt(), false, null, 0));
            cwVar2.f.setText(str);
            cw cwVar3 = mVar.r;
            int i = bkb.Fl;
            if (gl.B(bkb.w0(null, i, false)) <= 0.721f) {
                z2 = true;
            } else {
                z2 = false;
            }
            cwVar3.b(z2, false);
            zkb.h(i, null, mVar.r);
        }
        cw cwVar4 = mVar.r;
        mVar.n = z;
        gl.U3(cwVar4, z, 1.0f, true, false);
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
            wt wtVar = oVar.i0;
            if (!wtVar.a0 && !wtVar.U) {
                ArticleViewer$WindowView articleViewer$WindowView = oVar.g0;
                if (!articleViewer$WindowView.e && !articleViewer$WindowView.f) {
                    if (!oVar.G() && oVar.e0.size() <= 1) {
                        oVar.i0.setBackButtonCached(false);
                        oVar.i0.Q.c();
                    } else {
                        ed0 ed0Var = oVar.i0.N;
                        if (!mVar.s && oVar.e0.size() <= 1) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                        }
                        ed0Var.c(true, f);
                        wt wtVar2 = oVar.i0;
                        if (!mVar.s && oVar.e0.size() <= 1) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        wtVar2.setBackButtonCached(z3);
                        oVar.i0.Q.c();
                    }
                    oVar.i0.setHasForward(mVar.w);
                    wt wtVar3 = oVar.i0;
                    m mVar2 = oVar.v0[0];
                    if (mVar2 != null && mVar2.d()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    wtVar3.setIsTonsite(z4);
                    wt wtVar4 = oVar.i0;
                    m mVar3 = oVar.v0[0];
                    if (mVar3 == null || !mVar3.c()) {
                        z5 = false;
                    }
                    wtVar4.setIsLocal(z5);
                }
            }
        }
    }

    @Override
    public final void H(cv0 cv0Var) {
        this.U0.e.setWebView(cv0Var);
    }

    @Override
    public final void S(String str, boolean z) {
        atc atcVar;
        m mVar = this.U0;
        o oVar = mVar.M;
        if (oVar.i0 != null && mVar == oVar.v0[0] && (atcVar = mVar.F) != null && atcVar.b() == null) {
            mVar.F.d(getWebView());
        }
        super.S(str, z);
    }
}

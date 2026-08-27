package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

public final class k71 extends yk0 {

    public final int f30033c = 0;
    public final Context d;

    public final FrameLayout f30034e;

    public k71(vf.i iVar, LaunchActivity launchActivity) {
        this.f30034e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        switch (this.f30033c) {
            case 0:
                return true;
            default:
                return m1.j.c(3)[o1Var.f5793f] == 1;
        }
    }

    @Override
    public final int h() {
        switch (this.f30033c) {
            case 0:
                return ((o71) this.f30034e).h.size();
            default:
                return ((vf.i) this.f30034e).A.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f30033c) {
            case 0:
                return ((l71) ((o71) this.f30034e).h.get(i10)).f30318a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f30033c) {
            case 0:
                return 0;
            default:
                return m1.j.b(((vf.a) ((vf.i) this.f30034e).A.get(i10)).f48882b);
        }
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        n71 n71Var;
        switch (this.f30033c) {
            case 0:
                m71 m71Var = (m71) o1Var.f5789a;
                o71 o71Var = (o71) this.f30034e;
                l71 l71Var = (l71) o71Var.h.get(i10);
                m71Var.f30609a = l71Var;
                m71Var.setContentDescription(l71Var.f30319b);
                m71Var.setAlpha(1.0f);
                m71Var.requestLayout();
                m71Var.setReordering(o71Var.f31217i0 && (n71Var = o71Var.f31227y) != null && ((m5.o) n71Var).q(i10));
                break;
            default:
                View view = o1Var.f5789a;
                vf.a aVar = (vf.a) ((vf.i) this.f30034e).A.get(i10);
                int i11 = aVar.f48882b;
                l6 l6Var = aVar.f48885f;
                CharSequence charSequence = aVar.f48881a;
                int iB = m1.j.b(i11);
                if (iB == 0) {
                    org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) view;
                    x1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23161j5, false));
                    x1Var.a(0, charSequence);
                    break;
                } else if (iB == 1) {
                    org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                    j4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                    j4Var.setText(charSequence);
                    break;
                } else if (iB == 2) {
                    vf.h hVar = (vf.h) view;
                    hVar.f48904f = charSequence.toString();
                    hVar.d = ((Float) l6Var.get(null)).floatValue();
                    hVar.f48901b = aVar.d;
                    hVar.f48902c = aVar.f48884e;
                    hVar.f48903e = l6Var;
                    hVar.invalidate();
                    break;
                }
                break;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        switch (this.f30033c) {
            case 0:
                return new lk0(new m71((o71) this.f30034e, this.d));
            default:
                int iB = m1.j.b(m1.j.c(3)[i10]);
                Context context = this.d;
                if (iB == 1) {
                    j4Var = new org.telegram.ui.Cells.j4(context);
                } else if (iB != 2) {
                    j4Var = new org.telegram.ui.ActionBar.x1(context, null);
                } else {
                    vf.h hVar = new vf.h(context);
                    hVar.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    hVar.h = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                    qn0 qn0Var = new qn0(context);
                    hVar.f48900a = qn0Var;
                    qn0Var.setReportChanges(true);
                    qn0Var.setDelegate(new n2.b0(hVar, 24));
                    qn0Var.setImportantForAccessibility(2);
                    hVar.addView(qn0Var, h7.z5.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    j4Var = hVar;
                }
                j4Var.setLayoutParams(new f2.y0(-1, -2));
                return new lk0(j4Var);
        }
    }

    public k71(o71 o71Var, Context context) {
        this.f30034e = o71Var;
        this.d = context;
    }
}

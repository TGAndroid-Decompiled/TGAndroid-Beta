package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class i71 extends vk0 {
    public final int f29371c = 0;
    public final Context d;
    public final FrameLayout f29372e;

    public i71(uf.h hVar, LaunchActivity launchActivity) {
        this.f29372e = hVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        switch (this.f29371c) {
            case 0:
                return true;
            default:
                if (m1.j.c(3)[q1Var.f5505f] == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f29371c) {
            case 0:
                return ((m71) this.f29372e).h.size();
            default:
                return ((uf.h) this.f29372e).A.size();
        }
    }

    @Override
    public long i(int i9) {
        switch (this.f29371c) {
            case 0:
                return ((j71) ((m71) this.f29372e).h.get(i9)).f29664a;
            default:
                return super.i(i9);
        }
    }

    @Override
    public final int j(int i9) {
        switch (this.f29371c) {
            case 0:
                return 0;
            default:
                return m1.j.b(((uf.a) ((uf.h) this.f29372e).A.get(i9)).f48197b);
        }
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        l71 l71Var;
        switch (this.f29371c) {
            case 0:
                k71 k71Var = (k71) q1Var.f5501a;
                m71 m71Var = (m71) this.f29372e;
                j71 j71Var = (j71) m71Var.h.get(i9);
                k71Var.f30022a = j71Var;
                k71Var.setContentDescription(j71Var.f29665b);
                k71Var.setAlpha(1.0f);
                k71Var.requestLayout();
                if (m71Var.f30749i0 && (l71Var = m71Var.f30759y) != null && ((n2.p) l71Var).o(i9)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                k71Var.setReordering(z10);
                return;
            default:
                View view = q1Var.f5501a;
                uf.a aVar = (uf.a) ((uf.h) this.f29372e).A.get(i9);
                int i10 = aVar.f48197b;
                l6 l6Var = aVar.f48200f;
                CharSequence charSequence = aVar.f48196a;
                int b10 = m1.j.b(i10);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            uf.g gVar = (uf.g) view;
                            gVar.f48216f = charSequence.toString();
                            gVar.d = ((Float) l6Var.get(null)).floatValue();
                            gVar.f48213b = aVar.d;
                            gVar.f48214c = aVar.f48199e;
                            gVar.f48215e = l6Var;
                            gVar.invalidate();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L6, false));
                    m4Var.setText(charSequence);
                    return;
                }
                org.telegram.ui.ActionBar.y1 y1Var = (org.telegram.ui.ActionBar.y1) view;
                y1Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23108j5, false));
                y1Var.a(0, charSequence);
                return;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        switch (this.f29371c) {
            case 0:
                return new f2.q1(new k71((m71) this.f29372e, this.d));
            default:
                int b10 = m1.j.b(m1.j.c(3)[i9]);
                Context context = this.d;
                if (b10 != 1) {
                    if (b10 != 2) {
                        frameLayout = new org.telegram.ui.ActionBar.y1(context, null);
                    } else {
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.h = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                        pn0 pn0Var = new pn0(context);
                        frameLayout2.f48212a = pn0Var;
                        pn0Var.setReportChanges(true);
                        pn0Var.setDelegate(new n5.a0((Object) frameLayout2, 18));
                        pn0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(pn0Var, g7.e6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.m4(context);
                }
                frameLayout.setLayoutParams(new f2.a1(-1, -2));
                return new f2.q1(frameLayout);
        }
    }

    public i71(m71 m71Var, Context context) {
        this.f29372e = m71Var;
        this.d = context;
    }
}

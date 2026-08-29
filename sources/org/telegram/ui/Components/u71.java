package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class u71 extends il0 {
    public final int f33155c = 0;
    public final Context d;
    public final FrameLayout f33156e;

    public u71(xf.j jVar, LaunchActivity launchActivity) {
        this.f33156e = jVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        switch (this.f33155c) {
            case 0:
                return true;
            default:
                if (m1.j.c(3)[n1Var.f6436f] == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f33155c) {
            case 0:
                return ((y71) this.f33156e).h.size();
            default:
                return ((xf.j) this.f33156e).A.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f33155c) {
            case 0:
                return ((v71) ((y71) this.f33156e).h.get(i10)).f33488a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f33155c) {
            case 0:
                return 0;
            default:
                return m1.j.b(((xf.a) ((xf.j) this.f33156e).A.get(i10)).f50117b);
        }
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        x71 x71Var;
        switch (this.f33155c) {
            case 0:
                w71 w71Var = (w71) n1Var.f6432a;
                y71 y71Var = (y71) this.f33156e;
                v71 v71Var = (v71) y71Var.h.get(i10);
                w71Var.f34343a = v71Var;
                w71Var.setContentDescription(v71Var.f33489b);
                w71Var.setAlpha(1.0f);
                w71Var.requestLayout();
                if (y71Var.f34953i0 && (x71Var = y71Var.f34963y) != null && ((n) x71Var).f(i10)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w71Var.setReordering(z10);
                return;
            default:
                View view = n1Var.f6432a;
                xf.a aVar = (xf.a) ((xf.j) this.f33156e).A.get(i10);
                int i11 = aVar.f50117b;
                q6 q6Var = aVar.f50120f;
                CharSequence charSequence = aVar.f50116a;
                int b10 = m1.j.b(i11);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            xf.i iVar = (xf.i) view;
                            iVar.f50139f = charSequence.toString();
                            iVar.d = ((Float) q6Var.get(null)).floatValue();
                            iVar.f50136b = aVar.d;
                            iVar.f50137c = aVar.f50119e;
                            iVar.f50138e = q6Var;
                            iVar.invalidate();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                    k4Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L6, false));
                    k4Var.setText(charSequence);
                    return;
                }
                org.telegram.ui.ActionBar.y1 y1Var = (org.telegram.ui.ActionBar.y1) view;
                y1Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                y1Var.a(0, charSequence);
                return;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f33155c) {
            case 0:
                return new f2.n1(new w71((y71) this.f33156e, this.d));
            default:
                int b10 = m1.j.b(m1.j.c(3)[i10]);
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
                        ao0 ao0Var = new ao0(context);
                        frameLayout2.f50135a = ao0Var;
                        ao0Var.setReportChanges(true);
                        ao0Var.setDelegate(new xf.h(frameLayout2));
                        ao0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(ao0Var, i7.f6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.k4(context);
                }
                frameLayout.setLayoutParams(new f2.x0(-1, -2));
                return new f2.n1(frameLayout);
        }
    }

    public u71(y71 y71Var, Context context) {
        this.f33156e = y71Var;
        this.d = context;
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class g81 extends ql0 {
    public final int f25086c = 0;
    public final Context d;
    public final FrameLayout e;

    public g81(zf.h hVar, LaunchActivity launchActivity) {
        this.e = hVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        switch (this.f25086c) {
            case 0:
                return true;
            default:
                if (m1.j.d(3)[l1Var.f5777f] == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f25086c) {
            case 0:
                return ((k81) this.e).h.size();
            default:
                return ((zf.h) this.e).B.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f25086c) {
            case 0:
                return ((h81) ((k81) this.e).h.get(i10)).f25336a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f25086c) {
            case 0:
                return 0;
            default:
                return m1.j.c(((zf.a) ((zf.h) this.e).B.get(i10)).f47475b);
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        j81 j81Var;
        switch (this.f25086c) {
            case 0:
                i81 i81Var = (i81) l1Var.f5774a;
                k81 k81Var = (k81) this.e;
                h81 h81Var = (h81) k81Var.h.get(i10);
                i81Var.f25643a = h81Var;
                i81Var.setContentDescription(h81Var.f25337b);
                i81Var.setAlpha(1.0f);
                i81Var.requestLayout();
                if (k81Var.f26221j0 && (j81Var = k81Var.f26231y) != null && ((tp0) j81Var).j(i10)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i81Var.setReordering(z4);
                return;
            default:
                View view = l1Var.f5774a;
                zf.a aVar = (zf.a) ((zf.h) this.e).B.get(i10);
                int i11 = aVar.f47475b;
                m6 m6Var = aVar.f47477f;
                CharSequence charSequence = aVar.f47474a;
                int c3 = m1.j.c(i11);
                if (c3 != 0) {
                    if (c3 != 1) {
                        if (c3 == 2) {
                            zf.g gVar = (zf.g) view;
                            gVar.f47492f = charSequence.toString();
                            gVar.d = ((Float) m6Var.get(null)).floatValue();
                            gVar.f47490b = aVar.d;
                            gVar.f47491c = aVar.e;
                            gVar.e = m6Var;
                            gVar.invalidate();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                    l4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
                    l4Var.setText(charSequence);
                    return;
                }
                org.telegram.ui.ActionBar.z1 z1Var = (org.telegram.ui.ActionBar.z1) view;
                z1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19987j5, false));
                z1Var.a(0, charSequence);
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f25086c) {
            case 0:
                return new f2.l1(new i81((k81) this.e, this.d));
            default:
                int c3 = m1.j.c(m1.j.d(3)[i10]);
                Context context = this.d;
                if (c3 != 1) {
                    if (c3 != 2) {
                        frameLayout = new org.telegram.ui.ActionBar.z1(context, null);
                    } else {
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.h = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                        jo0 jo0Var = new jo0(context);
                        frameLayout2.f47489a = jo0Var;
                        jo0Var.setReportChanges(true);
                        jo0Var.setDelegate(new zz((Object) frameLayout2, 26));
                        jo0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(jo0Var, k7.b6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.l4(context);
                }
                frameLayout.setLayoutParams(new f2.w0(-1, -2));
                return new f2.l1(frameLayout);
        }
    }

    public g81(k81 k81Var, Context context) {
        this.e = k81Var;
        this.d = context;
    }
}

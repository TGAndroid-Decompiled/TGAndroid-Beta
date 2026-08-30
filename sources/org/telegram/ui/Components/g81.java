package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;
public final class g81 extends rl0 {
    public final int f25081c = 0;
    public final Context d;
    public final FrameLayout e;

    public g81(zf.i iVar, LaunchActivity launchActivity) {
        this.e = iVar;
        this.d = launchActivity;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        switch (this.f25081c) {
            case 0:
                return true;
            default:
                if (m1.j.c(3)[l1Var.f5788f] == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int h() {
        switch (this.f25081c) {
            case 0:
                return ((k81) this.e).h.size();
            default:
                return ((zf.i) this.e).B.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f25081c) {
            case 0:
                return ((h81) ((k81) this.e).h.get(i10)).f25354a;
            default:
                return super.i(i10);
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f25081c) {
            case 0:
                return 0;
            default:
                return m1.j.b(((zf.a) ((zf.i) this.e).B.get(i10)).f47403b);
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        j81 j81Var;
        switch (this.f25081c) {
            case 0:
                i81 i81Var = (i81) l1Var.f5785a;
                k81 k81Var = (k81) this.e;
                h81 h81Var = (h81) k81Var.h.get(i10);
                i81Var.f25622a = h81Var;
                i81Var.setContentDescription(h81Var.f25355b);
                i81Var.setAlpha(1.0f);
                i81Var.requestLayout();
                if (k81Var.f26219j0 && (j81Var = k81Var.f26229y) != null && ((o2.o) j81Var).j(i10)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i81Var.setReordering(z4);
                return;
            default:
                View view = l1Var.f5785a;
                zf.a aVar = (zf.a) ((zf.i) this.e).B.get(i10);
                int i11 = aVar.f47403b;
                m6 m6Var = aVar.f47405f;
                CharSequence charSequence = aVar.f47402a;
                int b10 = m1.j.b(i11);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            zf.h hVar = (zf.h) view;
                            hVar.f47421f = charSequence.toString();
                            hVar.d = ((Float) m6Var.get(null)).floatValue();
                            hVar.f47419b = aVar.d;
                            hVar.f47420c = aVar.e;
                            hVar.e = m6Var;
                            hVar.invalidate();
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    m4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
                    m4Var.setText(charSequence);
                    return;
                }
                org.telegram.ui.ActionBar.z1 z1Var = (org.telegram.ui.ActionBar.z1) view;
                z1Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20012j5, false));
                z1Var.a(0, charSequence);
                return;
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        switch (this.f25081c) {
            case 0:
                return new f2.l1(new i81((k81) this.e, this.d));
            default:
                int b10 = m1.j.b(m1.j.c(3)[i10]);
                Context context = this.d;
                if (b10 != 1) {
                    if (b10 != 2) {
                        frameLayout = new org.telegram.ui.ActionBar.z1(context, null);
                    } else {
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.setWillNotDraw(false);
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.h = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
                        ko0 ko0Var = new ko0(context);
                        frameLayout2.f47418a = ko0Var;
                        ko0Var.setReportChanges(true);
                        ko0Var.setDelegate(new zf.g(frameLayout2));
                        ko0Var.setImportantForAccessibility(2);
                        frameLayout2.addView(ko0Var, k7.b6.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                        frameLayout = frameLayout2;
                    }
                } else {
                    frameLayout = new org.telegram.ui.Cells.m4(context);
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

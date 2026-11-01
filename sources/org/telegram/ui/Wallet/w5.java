package org.telegram.ui.Wallet;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.z60;
public final class w5 extends ClickableSpan {
    public final int f35366a = 0;
    public final int f35367b;
    public final Object f35368c;
    public final Object d;

    public w5(xh.z2 z2Var, int i10, rh.p pVar) {
        this.d = z2Var;
        this.f35367b = i10;
        this.f35368c = pVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        int i10 = this.f35366a;
        Object obj = this.d;
        switch (i10) {
            case 0:
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                final rh.p pVar = (rh.p) this.f35368c;
                z60 H = z60.H((xh.z2) obj, view);
                boolean z12 = true;
                int i11 = this.f35367b;
                if (i11 == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H.i(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                rh.p pVar2 = pVar;
                                if (pVar2.f47313g != 3) {
                                    pVar2.f47313g = 3;
                                    pVar2.f47311c = 0;
                                    pVar2.d = false;
                                    pVar2.f47314i = false;
                                    pVar2.f47312f = 0L;
                                    pVar2.f47315j = null;
                                    pVar2.h = false;
                                    pVar2.a();
                                    return;
                                }
                                return;
                            case 1:
                                rh.p pVar3 = pVar;
                                if (pVar3.f47313g != 2) {
                                    pVar3.f47313g = 2;
                                    pVar3.f47311c = 0;
                                    pVar3.d = false;
                                    pVar3.f47314i = false;
                                    pVar3.f47312f = 0L;
                                    pVar3.f47315j = null;
                                    pVar3.h = false;
                                    pVar3.a();
                                    return;
                                }
                                return;
                            default:
                                rh.p pVar4 = pVar;
                                if (pVar4.f47313g != 1) {
                                    pVar4.f47313g = 1;
                                    pVar4.f47311c = 0;
                                    pVar4.d = false;
                                    pVar4.f47314i = false;
                                    pVar4.f47312f = 0L;
                                    pVar4.f47315j = null;
                                    pVar4.h = false;
                                    pVar4.a();
                                    return;
                                }
                                return;
                        }
                    }
                }, dd.L0(2131752478, null), z10);
                if (i11 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.i(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                rh.p pVar2 = pVar;
                                if (pVar2.f47313g != 3) {
                                    pVar2.f47313g = 3;
                                    pVar2.f47311c = 0;
                                    pVar2.d = false;
                                    pVar2.f47314i = false;
                                    pVar2.f47312f = 0L;
                                    pVar2.f47315j = null;
                                    pVar2.h = false;
                                    pVar2.a();
                                    return;
                                }
                                return;
                            case 1:
                                rh.p pVar3 = pVar;
                                if (pVar3.f47313g != 2) {
                                    pVar3.f47313g = 2;
                                    pVar3.f47311c = 0;
                                    pVar3.d = false;
                                    pVar3.f47314i = false;
                                    pVar3.f47312f = 0L;
                                    pVar3.f47315j = null;
                                    pVar3.h = false;
                                    pVar3.a();
                                    return;
                                }
                                return;
                            default:
                                rh.p pVar4 = pVar;
                                if (pVar4.f47313g != 1) {
                                    pVar4.f47313g = 1;
                                    pVar4.f47311c = 0;
                                    pVar4.d = false;
                                    pVar4.f47314i = false;
                                    pVar4.f47312f = 0L;
                                    pVar4.f47315j = null;
                                    pVar4.h = false;
                                    pVar4.a();
                                    return;
                                }
                                return;
                        }
                    }
                }, dd.L0(2131752476, null), z11);
                if (i11 != 1) {
                    z12 = false;
                }
                H.i(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                rh.p pVar2 = pVar;
                                if (pVar2.f47313g != 3) {
                                    pVar2.f47313g = 3;
                                    pVar2.f47311c = 0;
                                    pVar2.d = false;
                                    pVar2.f47314i = false;
                                    pVar2.f47312f = 0L;
                                    pVar2.f47315j = null;
                                    pVar2.h = false;
                                    pVar2.a();
                                    return;
                                }
                                return;
                            case 1:
                                rh.p pVar3 = pVar;
                                if (pVar3.f47313g != 2) {
                                    pVar3.f47313g = 2;
                                    pVar3.f47311c = 0;
                                    pVar3.d = false;
                                    pVar3.f47314i = false;
                                    pVar3.f47312f = 0L;
                                    pVar3.f47315j = null;
                                    pVar3.h = false;
                                    pVar3.a();
                                    return;
                                }
                                return;
                            default:
                                rh.p pVar4 = pVar;
                                if (pVar4.f47313g != 1) {
                                    pVar4.f47313g = 1;
                                    pVar4.f47311c = 0;
                                    pVar4.d = false;
                                    pVar4.f47314i = false;
                                    pVar4.f47312f = 0L;
                                    pVar4.f47315j = null;
                                    pVar4.h = false;
                                    pVar4.a();
                                    return;
                                }
                                return;
                        }
                    }
                }, dd.L0(2131752477, null), z12);
                H.V(5);
                H.f33045t = false;
                H.f33044s = 0;
                H.a0(org.telegram.messenger.i0.L(24.0f), -org.telegram.messenger.i0.L(24.0f));
                H.Z();
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f35366a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(this.f35367b, (org.telegram.ui.ActionBar.p6) this.f35368c));
                return;
            default:
                textPaint.setUnderlineText(false);
                textPaint.setColor(textPaint.linkColor);
                return;
        }
    }

    public w5(int i10, org.telegram.ui.ActionBar.p6 p6Var, Runnable runnable) {
        this.f35367b = i10;
        this.f35368c = p6Var;
        this.d = runnable;
    }
}

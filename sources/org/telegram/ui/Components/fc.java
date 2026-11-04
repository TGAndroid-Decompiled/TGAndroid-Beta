package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class fc {
    public final org.telegram.ui.ActionBar.d2 f33772a;
    public final FrameLayout f33773b;
    public final org.telegram.ui.ActionBar.e6 f33774c;

    public fc(org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var != null && d2Var.getLastStoryViewer() != null && d2Var.getLastStoryViewer().y()) {
            this.f33772a = null;
            ei.j4 currentPeerView = d2Var.getLastStoryViewer().f10939o0.getCurrentPeerView();
            this.f33773b = currentPeerView != null ? currentPeerView.M0 : null;
            this.f33774c = d2Var.getLastStoryViewer().E;
            return;
        }
        this.f33772a = d2Var;
        this.f33773b = null;
        this.f33774c = d2Var != null ? d2Var.getResourceProvider() : null;
    }

    public static ac A(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        if (z10) {
            i3 = 3;
        } else {
            i3 = 4;
        }
        return z(d2Var, i3, 0, e6Var);
    }

    public static ac B(org.telegram.ui.ActionBar.d2 d2Var, boolean z10, bi.q0 q0Var, org.telegram.ui.ge geVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i3;
        String str;
        int i10;
        int i11;
        ib ibVar = new ib(d2Var.getParentActivity(), e6Var);
        if (z10) {
            i3 = 2131624054;
        } else {
            i3 = 2131624060;
        }
        ibVar.c(i3, 28, 28, "Pin", "Line");
        TextView textView = ibVar.f34651b;
        if (z10) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z10) {
            i10 = 2131748552;
        } else {
            i10 = 2131748474;
        }
        textView.setText(org.telegram.messenger.bd.M0(i10, str));
        if (!z10) {
            yb ybVar = new yb(d2Var.getParentActivity(), e6Var, true);
            ybVar.f40672b = q0Var;
            ybVar.f40673c = geVar;
            ibVar.setButton(ybVar);
        }
        if (z10) {
            i11 = 1500;
        } else {
            i11 = 5000;
        }
        return ac.g(d2Var, ibVar, i11);
    }

    public static ac C(String str, org.telegram.ui.ActionBar.d2 d2Var) {
        ib ibVar = new ib(d2Var.getParentActivity(), d2Var.getResourceProvider());
        ibVar.d(2131624048, "Shield");
        org.telegram.messenger.k5.r("UserSetAsAdminHint", null, 2131743690, new Object[]{str}, ibVar.f34651b);
        return ac.g(d2Var, ibVar, 1500);
    }

    public static ac D(org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, String str) {
        String str2;
        ib ibVar = new ib(d2Var.getParentActivity(), d2Var.getResourceProvider());
        ibVar.d(2131624049, "Hand");
        if (user.deleted) {
            str2 = org.telegram.messenger.bd.a0("HiddenName", null, 2131749336, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        org.telegram.messenger.k5.r("UserRemovedFromChatHint", null, 2131743741, new Object[]{str2, str}, ibVar.f34651b);
        return ac.g(d2Var, ibVar, 1500);
    }

    public static ac F(FrameLayout frameLayout, boolean z10) {
        ec ecVar;
        fc fcVar = new fc(frameLayout, null);
        if (z10) {
            ecVar = ec.h;
        } else {
            ecVar = ec.f33345e;
        }
        return fcVar.m(ecVar, 1, -115203550, -1, null);
    }

    public static ac S(int i3, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String M0;
        ib ibVar = new ib(d2Var.getParentActivity(), e6Var);
        boolean z10 = true;
        if (i3 != 0) {
            if (i3 == 1) {
                M0 = org.telegram.messenger.bd.M0(2131745286, null);
                z10 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            M0 = org.telegram.messenger.bd.M0(2131745284, null);
        }
        if (z10) {
            ibVar.d(2131624202, new String[0]);
        } else {
            ibVar.d(2131624201, new String[0]);
        }
        ibVar.f34651b.setText(M0);
        return ac.g(d2Var, ibVar, 1500);
    }

    public static fc X() {
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return new fc(wa.a(org.telegram.messenger.t0.f25457b), null);
        }
        Dialog dialog = T.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.t2) {
            return new fc(((org.telegram.ui.ActionBar.t2) dialog).f28589c, T.getResourceProvider());
        }
        return a0(T);
    }

    public static fc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        return new fc(frameLayout, e6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var != null && d2Var.getParentActivity() != null && d2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static fc a0(org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var == null) {
            return X();
        }
        return new fc(d2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.G1) {
            return;
        }
        X().t(org.telegram.messenger.bd.a0(null, null, 2131743888, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        if (!LaunchActivity.G1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        ac t10 = new fc(frameLayout, e6Var).t(org.telegram.messenger.bd.a0(null, null, 2131743888, str), null);
        t10.f31800r = false;
        t10.j();
    }

    public static ac d(org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        String M0;
        ib ibVar = new ib(d2Var.getParentActivity(), d2Var.getResourceProvider());
        if (z10) {
            ibVar.d(2131624049, "Hand");
            M0 = org.telegram.messenger.bd.M0(2131743771, null);
        } else {
            ibVar.d(2131624058, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.bd.M0(2131743685, null);
        }
        ibVar.f34651b.setText(org.telegram.messenger.g0.X2(M0));
        return ac.g(d2Var, ibVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.G1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(org.telegram.messenger.bd.a0(null, null, 2131743888, tL_error.text), null).j();
        }
    }

    public static ac j(org.telegram.ui.ActionBar.d2 d2Var) {
        return a0(d2Var).k(false);
    }

    public static ac l(String str, org.telegram.ui.ActionBar.d2 d2Var, boolean z10) {
        int i3;
        String M0;
        int i10;
        int i11;
        ib ibVar = new ib(d2Var.getParentActivity(), d2Var.getResourceProvider());
        if (str != null) {
            if (z10) {
                i11 = 2131751413;
            } else {
                i11 = 2131751411;
            }
            M0 = org.telegram.messenger.bd.a0(null, null, i11, str);
        } else {
            if (z10) {
                i3 = 2131751414;
            } else {
                i3 = 2131751412;
            }
            M0 = org.telegram.messenger.bd.M0(i3, null);
        }
        ibVar.f34651b.setText(org.telegram.messenger.g0.X2(M0));
        if (!z10 && str == null) {
            i10 = 2131623989;
        } else {
            i10 = 2131624006;
        }
        ibVar.d(i10, new String[0]);
        return ac.g(d2Var, ibVar, 5000);
    }

    public static ac v(Context context, org.telegram.ui.ActionBar.d2 d2Var, FrameLayout frameLayout, int i3, long j10, int i10, int i11, int i12, int i13, boolean z10, ai.r1 r1Var) {
        ib ibVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z11;
        org.telegram.ui.lo loVar;
        int i14;
        SpannableStringBuilder X2;
        ac g7;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i15;
        int i16;
        org.telegram.messenger.hc hcVar;
        if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q() && d2Var != null && i3 <= 1 && j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f22848n && !z10) {
            ibVar = new lb(i10, d2Var);
        } else {
            if (d2Var != null) {
                e6Var = d2Var.getResourceProvider();
            } else {
                e6Var = null;
            }
            ibVar = new ib(i11, i12, context, e6Var);
        }
        ib ibVar2 = ibVar;
        if (r1Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (r1Var != null) {
            loVar = new org.telegram.ui.lo(9, zArr, r1Var);
        } else {
            loVar = null;
        }
        if (i3 <= 1) {
            if (j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f22848n) {
                if (i10 <= 1) {
                    String M0 = org.telegram.messenger.bd.M0(2131750506, null);
                    if (z10) {
                        hcVar = new org.telegram.messenger.hc(25);
                    } else {
                        hcVar = new org.telegram.messenger.hc(23);
                    }
                    X2 = org.telegram.messenger.g0.S2(M0, -1, 2, hcVar, null);
                } else {
                    X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750499, null), -1, 2, new org.telegram.messenger.hc(23), null);
                }
                ibVar2.c(2131624190, 30, 30, new String[0]);
                i14 = 2;
            } else {
                i14 = 2;
                ai.r1 r1Var2 = new ai.r1(loVar, d2Var, j10, 20);
                if (org.telegram.messenger.m5.z(j10)) {
                    TLRPC.Chat M02 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).M0(Long.valueOf(-j10));
                    if (i10 <= 1) {
                        if (d2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, 2131750510, M02.title), -1, 2, r1Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750510, M02.title));
                        }
                    } else if (d2Var != null) {
                        X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, 2131750503, M02.title), -1, 2, r1Var2, null);
                    } else {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131750503, M02.title));
                    }
                } else {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).a2(Long.valueOf(j10));
                    if (i10 <= 1) {
                        if (z11) {
                            i16 = 2131750504;
                        } else {
                            i16 = 2131750505;
                        }
                        if (d2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, i16, org.telegram.messenger.l10.j(a22, true)), -1, 2, r1Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i16, org.telegram.messenger.l10.j(a22, true)));
                        }
                    } else {
                        if (z11) {
                            i15 = 2131750497;
                        } else {
                            i15 = 2131750498;
                        }
                        if (d2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.a0(null, null, i15, org.telegram.messenger.l10.j(a22, true)), -1, 2, r1Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i15, org.telegram.messenger.l10.j(a22, true)));
                        }
                    }
                }
                ibVar2.c(2131624028, 30, 30, new String[0]);
            }
        } else {
            i14 = 2;
            if (i10 <= 1) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i3, "FwdMessageToManyChats", new Object[0]));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i3, "FwdMessagesToManyChats", new Object[0]));
            }
            ibVar2.c(2131624028, 30, 30, new String[0]);
        }
        ibVar2.f34651b.setText(X2);
        if (z11) {
            Context context2 = ibVar2.getContext();
            if (d2Var != null) {
                e6Var2 = d2Var.getResourceProvider();
            } else {
                e6Var2 = null;
            }
            yb ybVar = new yb(context2, e6Var2, true, true);
            ybVar.f40672b = null;
            ybVar.f40673c = loVar;
            ibVar2.setButton(ybVar);
        }
        ibVar2.postDelayed(new bc(ibVar2, 1), 300);
        if (frameLayout != null) {
            g7 = ac.f(frameLayout, ibVar2, i13);
        } else if (d2Var != null) {
            g7 = ac.g(d2Var, ibVar2, i13);
        } else {
            throw new IllegalArgumentException();
        }
        if (ibVar2 instanceof lb) {
            ibVar2.f34651b.setSingleLine(false);
            ibVar2.f34651b.setMaxLines(i14);
            ((lb) ibVar2).setBulletin(g7);
            g7.f31800r = false;
        }
        return g7;
    }

    public static org.telegram.ui.Components.ac x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.ac");
    }

    public static org.telegram.ui.Components.ac z(org.telegram.ui.ActionBar.d2 r6, int r7, int r8, org.telegram.ui.ActionBar.e6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fc.z(org.telegram.ui.ActionBar.d2, int, int, org.telegram.ui.ActionBar.e6):org.telegram.ui.Components.ac");
    }

    public final ac E(org.telegram.ui.ActionBar.e6 e6Var) {
        ib ibVar = new ib(W(), e6Var);
        ibVar.d(2131623981, new String[0]);
        ibVar.f34651b.setText(org.telegram.messenger.bd.M0(2131746232, null));
        return b(ibVar, 1500);
    }

    public final ac G(int i3, int i10, CharSequence charSequence) {
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        ib ibVar = new ib(W(), this.f33774c);
        ibVar.c(i3, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            }
            int i12 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i12 >= i10) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i12++;
            }
            charSequence = spannableStringBuilder;
        }
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(i10);
        ibVar.f34651b.setText(charSequence);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ibVar, i11);
    }

    public final ac H(int i3, CharSequence charSequence) {
        return Q(i3, 36, charSequence);
    }

    public final ac I(int i3, CharSequence charSequence, CharSequence charSequence2) {
        int i10;
        xb xbVar = new xb(W(), this.f33774c);
        xbVar.c(i3, 36, 36, new String[0]);
        xbVar.f40303b.setText(charSequence);
        xbVar.f40304c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(xbVar, i10);
    }

    public final ac J(int i3, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        ib ibVar = new ib(W, e6Var);
        if (i3 != 0) {
            ibVar.c(i3, 36, 36, new String[0]);
        } else {
            ibVar.f34650a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ibVar.f34651b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        ibVar.f34651b.setTextSize(1, 14.0f);
        ibVar.f34651b.setTextDirection(5);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(3);
        ibVar.f34651b.setText(charSequence);
        yb ybVar = new yb(W(), e6Var, true, z10);
        ybVar.e(charSequence2);
        ybVar.f40672b = runnable;
        ibVar.setButton(ybVar);
        return b(ibVar, i10);
    }

    public final ac K(int i3, CharSequence charSequence, String str, Runnable runnable) {
        int i10;
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return J(i3, charSequence, str, i10, false, runnable);
    }

    public final ac L(int i3, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        xb xbVar = new xb(W, e6Var);
        xbVar.c(i3, 36, 36, new String[0]);
        xbVar.f40303b.setText(str);
        xbVar.f40304c.setText(charSequence);
        yb ybVar = new yb(W(), e6Var, true);
        ybVar.e(str2);
        ybVar.f40672b = runnable;
        xbVar.setButton(ybVar);
        return b(xbVar, 5000);
    }

    public final ac M(Drawable drawable, CharSequence charSequence) {
        ib ibVar = new ib(W(), this.f33774c);
        ibVar.f34650a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.xl0) {
            ((org.telegram.ui.xl0) drawable).e(ibVar.f34650a);
        }
        ibVar.f34651b.setText(charSequence);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(2);
        return b(ibVar, 2750);
    }

    public final ac N(String str, String str2) {
        xb xbVar = new xb(W(), this.f33774c);
        xbVar.f40302a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) xbVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        xbVar.f40303b.setText(str);
        xbVar.f40304c.setText(str2);
        return b(xbVar, 5000);
    }

    public final ac O(TLRPC.Document document, String str, String str2) {
        int i3;
        if (document == null) {
            return new ac();
        }
        wb wbVar = new wb(W(), this.f33774c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.ac c2 = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.ac c10 = org.telegram.messenger.ac.c(w10, document);
        k9 k9Var = wbVar.f39978a;
        k9Var.g(0, 0L, null, "28_28", "28_28", null, c2, c10);
        k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = wbVar.f39979b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = wbVar.f39980c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(wbVar, i3);
    }

    public final ac P(int i3, CharSequence charSequence) {
        int i10;
        ib ibVar = new ib(W(), this.f33774c);
        ibVar.c(i3, 36, 36, new String[0]);
        ibVar.f34651b.setText(charSequence);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setTextSize(1, 14.0f);
        ibVar.f34651b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ibVar, i10);
    }

    public final ac Q(int i3, int i10, CharSequence charSequence) {
        int i11;
        ib ibVar = new ib(W(), this.f33774c);
        ibVar.c(i3, i10, i10, new String[0]);
        ibVar.f34651b.setText(charSequence);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ibVar, i11);
    }

    public final ac R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i3;
        if (document == null) {
            return new ac();
        }
        wb wbVar = new wb(W(), this.f33774c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.ac c2 = org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.ac c10 = org.telegram.messenger.ac.c(w10, document);
        k9 k9Var = wbVar.f39978a;
        k9Var.g(0, 0L, null, "28_28", "28_28", null, c2, c10);
        k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = wbVar.f39979b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        wbVar.f39980c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(wbVar, i3);
    }

    public final ac T(String str) {
        ib ibVar = new ib(W(), null);
        ibVar.d(2131623989, new String[0]);
        ibVar.f34651b.setText(str);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(2);
        return b(ibVar, 1500);
    }

    public final ac U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        xb xbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        if (!isEmpty) {
            xb xbVar2 = new xb(W(), e6Var);
            xbVar2.f40303b.setText(str);
            xbVar2.f40304c.setText((CharSequence) null);
            xbVar = xbVar2;
        } else {
            ib ibVar = new ib(W(), e6Var);
            ibVar.f34651b.setText(str);
            ibVar.f34651b.setSingleLine(false);
            ibVar.f34651b.setMaxLines(2);
            xbVar = ibVar;
        }
        xbVar.setTimer();
        yb ybVar = new yb(W(), e6Var, true, z10);
        ybVar.e(org.telegram.messenger.bd.M0(2131743895, null));
        ybVar.f40672b = runnable;
        ybVar.f40673c = runnable2;
        xbVar.setButton(ybVar);
        return b(xbVar, 5000);
    }

    public final ac V(List list, CharSequence charSequence, CharSequence charSequence2, m2.t tVar) {
        boolean z10;
        float f10;
        int i3;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        zb zbVar = new zb(W, e6Var, z10);
        x8 x8Var = zbVar.f40994a;
        if (list != null) {
            int i10 = 0;
            i3 = 0;
            for (int i11 = 3; i10 < list.size() && i3 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i3 + 1;
                    x8Var.setCount(i12);
                    x8Var.b(i3, org.telegram.messenger.h10.f22829t0, tLObject);
                    i3 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                x8Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                x8Var.setScaleX(1.2f);
                x8Var.setScaleY(1.2f);
            } else {
                x8Var.setScaleX(1.0f);
                x8Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i3 = 0;
        }
        x8Var.a(false);
        s70 s70Var = zbVar.f40995b;
        if (charSequence2 != null) {
            s70Var.setSingleLine(true);
            s70Var.setMaxLines(1);
            s70Var.setText(charSequence);
            s70 s70Var2 = zbVar.f40996c;
            s70Var2.setText(charSequence2);
            s70Var2.setSingleLine(false);
            s70Var2.setMaxLines(3);
            LinearLayout linearLayout = zbVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i3) * 12));
                if (i3 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.bd.f21784a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            s70Var.setSingleLine(false);
            s70Var.setMaxLines(4);
            s70Var.setText(charSequence);
            if (s70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i3) * 12));
                if (i3 == 1) {
                    s70Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.bd.f21784a0) {
                    ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) s70Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (tVar != null) {
            yb ybVar = new yb(W(), e6Var, true);
            ybVar.e(org.telegram.messenger.bd.M0(2131743895, null));
            ybVar.f40672b = (Runnable) tVar.f19006b;
            ybVar.f40673c = (Runnable) tVar.f19007c;
            zbVar.setButton(ybVar);
        }
        return b(zbVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.d2 d2Var = this.f33772a;
        if (d2Var != null) {
            context = d2Var.getParentActivity();
            if (context == null && this.f33772a.getLayoutContainer() != null) {
                context = this.f33772a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f33773b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return org.telegram.messenger.t0.f25457b;
        }
        return context;
    }

    public final ac Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.G1) {
            return new ac();
        }
        if (tL_error == null) {
            return t(org.telegram.messenger.bd.a0(null, null, 2131743889, new Object[0]), null);
        }
        return t(org.telegram.messenger.bd.a0(null, null, 2131743888, tL_error.text), null);
    }

    public final ac b(ya yaVar, int i3) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f33772a;
        if (d2Var != null) {
            return ac.g(d2Var, yaVar, i3);
        }
        return ac.f(this.f33773b, yaVar, i3);
    }

    public final ac c(CharSequence charSequence) {
        if (W() == null) {
            return new ac();
        }
        ib ibVar = new ib(W(), this.f33774c);
        ibVar.d(2131624048, "Shield");
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(3);
        ibVar.f34651b.setText(charSequence);
        return b(ibVar, 2750);
    }

    public final ac e(boolean z10) {
        String M0;
        ib ibVar = new ib(W(), this.f33774c);
        if (z10) {
            ibVar.d(2131624049, "Hand");
            M0 = org.telegram.messenger.bd.M0(2131743771, null);
        } else {
            ibVar.d(2131624058, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.bd.M0(2131743685, null);
        }
        ibVar.f34651b.setText(org.telegram.messenger.g0.X2(M0));
        return b(ibVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (!LaunchActivity.G1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ac t10 = t(org.telegram.messenger.bd.a0(null, null, 2131743889, new Object[0]), null);
            t10.f31800r = false;
            t10.k(z10);
            return;
        }
        ac t11 = t(org.telegram.messenger.bd.a0(null, null, 2131743888, str), null);
        t11.f31800r = false;
        t11.k(z10);
    }

    public final ac f(int i3, Runnable runnable) {
        ib ibVar = new ib(W(), null);
        ibVar.d(2131623970, new String[0]);
        String G = org.telegram.messenger.bd.G(i3, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.X2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        ibVar.f34651b.setText(valueOf);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(3);
        return b(ibVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.G1) {
            if (tL_error == null) {
                ac t10 = t(org.telegram.messenger.bd.a0(null, null, 2131743889, new Object[0]), null);
                t10.f31800r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                ac t11 = t(org.telegram.messenger.bd.a0(null, null, 2131743888, tL_error.text), null);
                t11.f31800r = false;
                t11.k(z10);
            }
        }
    }

    public final ac g(String str, ArrayList arrayList) {
        zb zbVar = new zb(W(), this.f33774c, false);
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i3 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i3 + 1;
                zbVar.f40994a.setCount(i11);
                zbVar.f40994a.b(i3, org.telegram.messenger.h10.f22829t0, tLObject);
                i3 = i11;
            }
        }
        if (arrayList.size() == 1) {
            zbVar.f40994a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            zbVar.f40994a.setScaleX(1.2f);
            zbVar.f40994a.setScaleY(1.2f);
        } else {
            zbVar.f40994a.setScaleX(1.0f);
            zbVar.f40994a.setScaleY(1.0f);
        }
        zbVar.f40994a.a(false);
        zbVar.f40995b.setSingleLine(false);
        zbVar.f40995b.setMaxLines(2);
        zbVar.f40995b.setText(str);
        if (zbVar.f40995b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i3) * 12));
            if (org.telegram.messenger.bd.f21784a0) {
                ((ViewGroup.MarginLayoutParams) zbVar.f40995b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) zbVar.f40995b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.bd.f21784a0) {
            zbVar.f40994a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i3 - 1) * 12)));
        }
        return b(zbVar, 5000);
    }

    public final boolean g0(int i3, long j10) {
        org.telegram.ui.ActionBar.d2 d2Var;
        SpannableStringBuilder S2;
        if (org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q() && (d2Var = this.f33772a) != null) {
            lb lbVar = new lb(i3, d2Var);
            if (j10 == org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f22848n) {
                if (i3 <= 1) {
                    S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750506, null), -1, 2, new org.telegram.messenger.hc(23), null);
                } else {
                    S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131750499, null), -1, 2, new org.telegram.messenger.hc(23), null);
                }
                lbVar.c(2131624190, 36, 36, new String[0]);
                lbVar.f34651b.setText(S2);
                lbVar.f34651b.setSingleLine(false);
                lbVar.f34651b.setMaxLines(2);
                ac b10 = b(lbVar, 3500);
                lbVar.setBulletin(b10);
                b10.f31800r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final ac h(TLRPC.Document document, int i3, final org.telegram.messenger.u10 u10Var) {
        SpannableStringBuilder spannableStringBuilder;
        x70 x70Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder X2;
        final TLRPC.InputStickerSet j12 = org.telegram.messenger.zi.j1(document);
        if (j12 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).m0(j12, true);
        if (m0 != null && (stickerSet = m0.set) != null) {
            if (i3 == 1) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("TopicContainsEmojiPackSingle", null, 2131744032, stickerSet.title));
            } else if (i3 == 2) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StoryContainsEmojiPackSingle", null, 2131744709, stickerSet.title));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("MessageContainsEmojiPackSingle", null, 2131748604, stickerSet.title));
            }
            return r(document, X2, org.telegram.messenger.bd.M0(2131743573, null), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            u10Var.a(j12);
                            return;
                        default:
                            u10Var.a(j12);
                            return;
                    }
                }
            });
        }
        if (i3 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("TopicContainsEmojiPackSingle", null, 2131744032, "<{LOADING}>")));
        } else if (i3 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("StoryContainsEmojiPackSingle", null, 2131744709, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("MessageContainsEmojiPackSingle", null, 2131748604, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        if (indexOf >= 0) {
            x70Var = new x70(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), e6Var);
            spannableStringBuilder.setSpan(x70Var, indexOf, indexOf + 11, 33);
            int i10 = org.telegram.ui.ActionBar.k6.vj;
            x70Var.a(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 32), i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 72));
        } else {
            x70Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.bd.M0(2131743573, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        u10Var.a(j12);
                        return;
                    default:
                        u10Var.a(j12);
                        return;
                }
            }
        };
        Context W = W();
        ?? ibVar = new ib(W, e6Var);
        s70 s70Var = new s70(W, null);
        ibVar.d = s70Var;
        s70Var.setDisablePaddingsOffset(true);
        s70Var.setSingleLine();
        s70Var.setTypeface(Typeface.SANS_SERIF);
        s70Var.setTextSize(1, 15.0f);
        s70Var.setEllipsize(TextUtils.TruncateAt.END);
        s70Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        ibVar.f34651b.setVisibility(8);
        ibVar.addView(s70Var, b8.mf.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.k6.vj;
        ibVar.setTextColor(ibVar.getThemedColor(i11));
        if (org.telegram.messenger.zi.D4(document)) {
            inputStickerSet = j12;
            org.telegram.ui.ActionBar.r6.t(ibVar.f34650a, i11, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = j12;
        }
        ibVar.e(document, new String[0]);
        ibVar.f34651b.setTextSize(1, 14.0f);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(3);
        s70Var.setText(spannableStringBuilder);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setSingleLine(false);
        s70Var.setMaxLines(3);
        yb ybVar = new yb(W(), e6Var, true);
        ybVar.e(M0);
        ybVar.f40672b = runnable;
        ibVar.setButton(ybVar);
        ac b10 = b(ibVar, 2750);
        if (x70Var != null) {
            fb fbVar = b10.f31788e;
            if (fbVar instanceof hb) {
                x70Var.f40260b = ((hb) fbVar).d;
            }
        }
        org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).l0(inputStickerSet, null, false, false, new ci.q3(i3, b10, currentTimeMillis));
        return b10;
    }

    public final ac i(String str) {
        if (!org.telegram.messenger.g0.I3()) {
            return new ac();
        }
        ib ibVar = new ib(W(), null);
        ibVar.c(2131623993, 36, 36, "NULL ROTATION", "Back", "Front");
        ibVar.f34651b.setText(str);
        return b(ibVar, 1500);
    }

    public final ac k(boolean z10) {
        if (!org.telegram.messenger.g0.I3()) {
            return new ac();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        if (z10) {
            xb xbVar = new xb(W(), e6Var);
            xbVar.c(2131624345, 36, 36, "Wibe", "Circle");
            xbVar.f40303b.setText(org.telegram.messenger.bd.M0(2131748929, null));
            xbVar.f40304c.setText(org.telegram.messenger.bd.M0(2131748927, null));
            return b(xbVar, 2750);
        }
        ib ibVar = new ib(W(), e6Var);
        ibVar.c(2131624345, 36, 36, "Wibe", "Circle");
        ibVar.f34651b.setText(org.telegram.messenger.bd.M0(2131748929, null));
        return b(ibVar, 1500);
    }

    public final ac m(ec ecVar, int i3, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        ib ibVar;
        String M0;
        dc dcVar = ecVar.d;
        if (i10 != 0 && i11 != 0) {
            ibVar = new ib(i10, i11, W(), e6Var);
        } else {
            ibVar = new ib(W(), e6Var);
        }
        ibVar.d(dcVar.f33050a, dcVar.f33051b);
        TextView textView = ibVar.f34651b;
        String str = ecVar.f33353a;
        if (ecVar.f33355c) {
            M0 = org.telegram.messenger.bd.G(i3, str, new Object[0]);
        } else {
            M0 = org.telegram.messenger.bd.M0(ecVar.f33354b, str);
        }
        textView.setText(org.telegram.messenger.g0.U2(M0, new org.telegram.messenger.hc(24)));
        int i12 = dcVar.f33052c;
        if (i12 != 0) {
            ibVar.setIconPaddingBottom(i12);
        }
        return b(ibVar, 1500);
    }

    public final ac n(ec ecVar, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(ecVar, i3, 0, 0, e6Var);
    }

    public final ac o(ec ecVar, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(ecVar, 1, 0, 0, e6Var);
    }

    public final ac p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        vb vbVar = new vb(W, e6Var);
        g5 g5Var = new g5(1, org.telegram.messenger.h10.f22829t0, j10);
        k9 k9Var = vbVar.f39058a;
        k9Var.setAnimatedEmojiDrawable(g5Var);
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        vbVar.f39059b.setText(str);
        vbVar.f39060c.setText(str2);
        return b(vbVar, 2750);
    }

    public final ac q(TLRPC.Document document, CharSequence charSequence) {
        ib ibVar = new ib(W(), this.f33774c);
        if (org.telegram.messenger.zi.D4(document)) {
            org.telegram.ui.ActionBar.r6.t(ibVar.f34650a, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ibVar.e(document, new String[0]);
        ibVar.f34651b.setText(charSequence);
        ibVar.f34651b.setTextSize(1, 14.0f);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(3);
        return b(ibVar, 2750);
    }

    public final ac r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        ib ibVar = new ib(W, e6Var);
        if (org.telegram.messenger.zi.D4(document)) {
            org.telegram.ui.ActionBar.r6.t(ibVar.f34650a, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ibVar.e(document, new String[0]);
        if (ibVar.f34650a.getImageReceiver() != null) {
            ibVar.f34650a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        ibVar.f34651b.setText(charSequence);
        ibVar.f34651b.setTextSize(1, 14.0f);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(3);
        yb ybVar = new yb(W(), e6Var, true);
        ybVar.e(str);
        ybVar.f40672b = runnable;
        ibVar.setButton(ybVar);
        return b(ibVar, 2750);
    }

    public final ac s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i3;
        xb xbVar = new xb(W(), this.f33774c);
        boolean D4 = org.telegram.messenger.zi.D4(document);
        fh0 fh0Var = xbVar.f40302a;
        if (D4) {
            org.telegram.ui.ActionBar.r6.t(fh0Var, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        fh0Var.setAutoRepeat(true);
        fh0Var.g(36, 36, document);
        xbVar.f40303b.setText(str);
        xbVar.f40304c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i3 = 1500;
        } else {
            i3 = 2750;
        }
        return b(xbVar, i3);
    }

    public final ac t(CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        ib ibVar = new ib(W(), e6Var);
        ibVar.d(2131623981, new String[0]);
        ibVar.f34651b.setText(charSequence);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setMaxLines(2);
        return b(ibVar, 1500);
    }

    public final ac u(String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        xb xbVar = new xb(W(), e6Var);
        xbVar.c(2131623981, 32, 32, new String[0]);
        xbVar.f40303b.setText(str);
        xbVar.f40304c.setText(str2);
        return b(xbVar, 1500);
    }

    public final ac w(int i3, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        ib ibVar = new ib(W, e6Var);
        ibVar.setBackground(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, e6Var), 12);
        ibVar.f34650a.setImageResource(i3);
        ibVar.f34651b.setText(charSequence);
        ibVar.f34651b.setSingleLine(false);
        ibVar.f34651b.setLines(2);
        ibVar.f34651b.setMaxLines(4);
        TextView textView = ibVar.f34651b;
        textView.setMaxWidth(gi.l3.a(textView.getText(), ibVar.f34651b.getPaint()));
        ibVar.f34651b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ibVar.f34651b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        ibVar.setWrapWidth();
        return b(ibVar, 5000);
    }

    public final ac y(int i3, TLRPC.Document document, k2.u uVar) {
        String M0;
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33774c;
        ib ibVar = new ib(W, e6Var);
        ibVar.c(2131624285, 36, 36, new String[0]);
        ibVar.removeView(ibVar.f34651b);
        o5 o5Var = new o5(ibVar.getContext());
        ibVar.f34651b = o5Var;
        o5Var.setTypeface(Typeface.SANS_SERIF);
        ibVar.f34651b.setTextSize(1, 15.0f);
        ibVar.f34651b.setEllipsize(TextUtils.TruncateAt.END);
        ibVar.f34651b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new p5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = ibVar.f34651b;
        if (i3 > 1) {
            M0 = org.telegram.messenger.bd.G(i3, "SavedTagMessagesTagged", new Object[0]);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131745888, null);
        }
        textView.setText(new SpannableStringBuilder(M0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (uVar != null) {
            yb ybVar = new yb(W(), e6Var, true);
            ybVar.e(org.telegram.messenger.bd.M0(2131743573, null));
            ybVar.f40672b = uVar;
            ibVar.setButton(ybVar);
        }
        ibVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, e6Var));
        ibVar.addView(ibVar.f34651b, b8.mf.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ibVar, 2750);
    }

    public fc(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33773b = frameLayout;
        this.f33772a = null;
        this.f33774c = e6Var;
    }
}

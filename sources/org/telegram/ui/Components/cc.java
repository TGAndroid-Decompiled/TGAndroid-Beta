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
public final class cc {
    public final org.telegram.ui.ActionBar.e2 f33534a;
    public final FrameLayout f33535b;
    public final org.telegram.ui.ActionBar.e6 f33536c;

    public cc(org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var != null && e2Var.getLastStoryViewer() != null && e2Var.getLastStoryViewer().y()) {
            this.f33534a = null;
            fi.b4 currentPeerView = e2Var.getLastStoryViewer().f11861o0.getCurrentPeerView();
            this.f33535b = currentPeerView != null ? currentPeerView.M0 : null;
            this.f33536c = e2Var.getLastStoryViewer().E;
            return;
        }
        this.f33534a = e2Var;
        this.f33535b = null;
        this.f33536c = e2Var != null ? e2Var.getResourceProvider() : null;
    }

    public static xb A(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 4;
        }
        return z(e2Var, i7, 0, e6Var);
    }

    public static xb B(org.telegram.ui.ActionBar.e2 e2Var, boolean z10, ci.p0 p0Var, org.telegram.ui.fe feVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i7;
        String str;
        int i10;
        int i11;
        fb fbVar = new fb(e2Var.getParentActivity(), e6Var);
        if (z10) {
            i7 = 2131624055;
        } else {
            i7 = 2131624061;
        }
        fbVar.c(i7, 28, 28, "Pin", "Line");
        TextView textView = fbVar.f34556b;
        if (z10) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z10) {
            i10 = 2131748544;
        } else {
            i10 = 2131748466;
        }
        textView.setText(org.telegram.messenger.hd.M0(i10, str));
        if (!z10) {
            vb vbVar = new vb(e2Var.getParentActivity(), e6Var, true);
            vbVar.f40372b = p0Var;
            vbVar.f40373c = feVar;
            fbVar.setButton(vbVar);
        }
        if (z10) {
            i11 = 1500;
        } else {
            i11 = 5000;
        }
        return xb.g(e2Var, fbVar, i11);
    }

    public static xb C(String str, org.telegram.ui.ActionBar.e2 e2Var) {
        fb fbVar = new fb(e2Var.getParentActivity(), e2Var.getResourceProvider());
        fbVar.d(2131624049, "Shield");
        org.telegram.messenger.k5.q("UserSetAsAdminHint", null, 2131743680, new Object[]{str}, fbVar.f34556b);
        return xb.g(e2Var, fbVar, 1500);
    }

    public static xb D(org.telegram.ui.ActionBar.e2 e2Var, TLRPC.User user, String str) {
        String str2;
        fb fbVar = new fb(e2Var.getParentActivity(), e2Var.getResourceProvider());
        fbVar.d(2131624050, "Hand");
        if (user.deleted) {
            str2 = org.telegram.messenger.hd.a0("HiddenName", null, 2131749328, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        org.telegram.messenger.k5.q("UserRemovedFromChatHint", null, 2131743731, new Object[]{str2, str}, fbVar.f34556b);
        return xb.g(e2Var, fbVar, 1500);
    }

    public static xb F(FrameLayout frameLayout, boolean z10) {
        bc bcVar;
        cc ccVar = new cc(frameLayout, null);
        if (z10) {
            bcVar = bc.h;
        } else {
            bcVar = bc.f33238e;
        }
        return ccVar.m(bcVar, 1, -115203550, -1, null);
    }

    public static xb S(int i7, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String M0;
        fb fbVar = new fb(e2Var.getParentActivity(), e6Var);
        boolean z10 = true;
        if (i7 != 0) {
            if (i7 == 1) {
                M0 = org.telegram.messenger.hd.M0(2131745276, null);
                z10 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            M0 = org.telegram.messenger.hd.M0(2131745274, null);
        }
        if (z10) {
            fbVar.d(2131624203, new String[0]);
        } else {
            fbVar.d(2131624202, new String[0]);
        }
        fbVar.f34556b.setText(M0);
        return xb.g(e2Var, fbVar, 1500);
    }

    public static cc X() {
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return new cc(ta.a(org.telegram.messenger.t0.f26609b), null);
        }
        Dialog dialog = T.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.u2) {
            return new cc(((org.telegram.ui.ActionBar.u2) dialog).f29685c, T.getResourceProvider());
        }
        return a0(T);
    }

    public static cc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        return new cc(frameLayout, e6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var != null && e2Var.getParentActivity() != null && e2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static cc a0(org.telegram.ui.ActionBar.e2 e2Var) {
        if (e2Var == null) {
            return X();
        }
        return new cc(e2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        X().t(org.telegram.messenger.hd.a0(null, null, 2131743878, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        xb t6 = new cc(frameLayout, e6Var).t(org.telegram.messenger.hd.a0(null, null, 2131743878, str), null);
        t6.f41643r = false;
        t6.j();
    }

    public static xb d(org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        String M0;
        fb fbVar = new fb(e2Var.getParentActivity(), e2Var.getResourceProvider());
        if (z10) {
            fbVar.d(2131624050, "Hand");
            M0 = org.telegram.messenger.hd.M0(2131743761, null);
        } else {
            fbVar.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.hd.M0(2131743675, null);
        }
        fbVar.f34556b.setText(org.telegram.messenger.g0.X2(M0));
        return xb.g(e2Var, fbVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(org.telegram.messenger.hd.a0(null, null, 2131743878, tL_error.text), null).j();
        }
    }

    public static xb j(org.telegram.ui.ActionBar.e2 e2Var) {
        return a0(e2Var).k(false);
    }

    public static xb l(String str, org.telegram.ui.ActionBar.e2 e2Var, boolean z10) {
        int i7;
        String M0;
        int i10;
        int i11;
        fb fbVar = new fb(e2Var.getParentActivity(), e2Var.getResourceProvider());
        if (str != null) {
            if (z10) {
                i11 = 2131751412;
            } else {
                i11 = 2131751410;
            }
            M0 = org.telegram.messenger.hd.a0(null, null, i11, str);
        } else {
            if (z10) {
                i7 = 2131751413;
            } else {
                i7 = 2131751411;
            }
            M0 = org.telegram.messenger.hd.M0(i7, null);
        }
        fbVar.f34556b.setText(org.telegram.messenger.g0.X2(M0));
        if (!z10 && str == null) {
            i10 = 2131623990;
        } else {
            i10 = 2131624007;
        }
        fbVar.d(i10, new String[0]);
        return xb.g(e2Var, fbVar, 5000);
    }

    public static xb v(Context context, org.telegram.ui.ActionBar.e2 e2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z10, bi.m1 m1Var) {
        fb fbVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z11;
        org.telegram.ui.zg zgVar;
        int i14;
        SpannableStringBuilder X2;
        xb g10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i15;
        int i16;
        org.telegram.messenger.c6 c6Var;
        if (org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q() && e2Var != null && i7 <= 1 && j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).f24959n && !z10) {
            fbVar = new ib(i10, e2Var);
        } else {
            if (e2Var != null) {
                e6Var = e2Var.getResourceProvider();
            } else {
                e6Var = null;
            }
            fbVar = new fb(i11, i12, context, e6Var);
        }
        fb fbVar2 = fbVar;
        if (m1Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (m1Var != null) {
            zgVar = new org.telegram.ui.zg(23, zArr, m1Var);
        } else {
            zgVar = null;
        }
        if (i7 <= 1) {
            if (j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).f24959n) {
                if (i10 <= 1) {
                    String M0 = org.telegram.messenger.hd.M0(2131750498, null);
                    if (z10) {
                        c6Var = new org.telegram.messenger.c6(27);
                    } else {
                        c6Var = new org.telegram.messenger.c6(25);
                    }
                    X2 = org.telegram.messenger.g0.S2(M0, -1, 2, c6Var, null);
                } else {
                    X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750491, null), -1, 2, new org.telegram.messenger.c6(25), null);
                }
                fbVar2.c(2131624191, 30, 30, new String[0]);
                i14 = 2;
            } else {
                i14 = 2;
                bi.m1 m1Var2 = new bi.m1(zgVar, e2Var, j3, 20);
                if (org.telegram.messenger.m5.z(j3)) {
                    TLRPC.Chat M02 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).M0(Long.valueOf(-j3));
                    if (i10 <= 1) {
                        if (e2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131750502, M02.title), -1, 2, m1Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750502, M02.title));
                        }
                    } else if (e2Var != null) {
                        X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131750495, M02.title), -1, 2, m1Var2, null);
                    } else {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750495, M02.title));
                    }
                } else {
                    TLRPC.User a22 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).a2(Long.valueOf(j3));
                    if (i10 <= 1) {
                        if (z11) {
                            i16 = 2131750496;
                        } else {
                            i16 = 2131750497;
                        }
                        if (e2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, i16, org.telegram.messenger.q10.j(a22, true)), -1, 2, m1Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i16, org.telegram.messenger.q10.j(a22, true)));
                        }
                    } else {
                        if (z11) {
                            i15 = 2131750489;
                        } else {
                            i15 = 2131750490;
                        }
                        if (e2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, i15, org.telegram.messenger.q10.j(a22, true)), -1, 2, m1Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i15, org.telegram.messenger.q10.j(a22, true)));
                        }
                    }
                }
                fbVar2.c(2131624029, 30, 30, new String[0]);
            }
        } else {
            i14 = 2;
            if (i10 <= 1) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, "FwdMessageToManyChats", new Object[0]));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, "FwdMessagesToManyChats", new Object[0]));
            }
            fbVar2.c(2131624029, 30, 30, new String[0]);
        }
        fbVar2.f34556b.setText(X2);
        if (z11) {
            Context context2 = fbVar2.getContext();
            if (e2Var != null) {
                e6Var2 = e2Var.getResourceProvider();
            } else {
                e6Var2 = null;
            }
            vb vbVar = new vb(context2, e6Var2, true, true);
            vbVar.f40372b = null;
            vbVar.f40373c = zgVar;
            fbVar2.setButton(vbVar);
        }
        fbVar2.postDelayed(new yb(fbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = xb.f(frameLayout, fbVar2, i13);
        } else if (e2Var != null) {
            g10 = xb.g(e2Var, fbVar2, i13);
        } else {
            throw new IllegalArgumentException();
        }
        if (fbVar2 instanceof ib) {
            fbVar2.f34556b.setSingleLine(false);
            fbVar2.f34556b.setMaxLines(i14);
            ((ib) fbVar2).setBulletin(g10);
            g10.f41643r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.xb x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.xb");
    }

    public static org.telegram.ui.Components.xb z(org.telegram.ui.ActionBar.e2 r6, int r7, int r8, org.telegram.ui.ActionBar.e6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cc.z(org.telegram.ui.ActionBar.e2, int, int, org.telegram.ui.ActionBar.e6):org.telegram.ui.Components.xb");
    }

    public final xb E(org.telegram.ui.ActionBar.e6 e6Var) {
        fb fbVar = new fb(W(), e6Var);
        fbVar.d(2131623982, new String[0]);
        fbVar.f34556b.setText(org.telegram.messenger.hd.M0(2131746222, null));
        return b(fbVar, 1500);
    }

    public final xb G(int i7, int i10, CharSequence charSequence) {
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        fb fbVar = new fb(W(), this.f33536c);
        fbVar.c(i7, 36, 36, new String[0]);
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
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(i10);
        fbVar.f34556b.setText(charSequence);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(fbVar, i11);
    }

    public final xb H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final xb I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        int i10;
        ub ubVar = new ub(W(), this.f33536c);
        ubVar.c(i7, 36, 36, new String[0]);
        ubVar.f39988b.setText(charSequence);
        ubVar.f39989c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ubVar, i10);
    }

    public final xb J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        fb fbVar = new fb(W, e6Var);
        if (i7 != 0) {
            fbVar.c(i7, 36, 36, new String[0]);
        } else {
            fbVar.f34555a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) fbVar.f34556b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        fbVar.f34556b.setTextSize(1, 14.0f);
        fbVar.f34556b.setTextDirection(5);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(3);
        fbVar.f34556b.setText(charSequence);
        vb vbVar = new vb(W(), e6Var, true, z10);
        vbVar.e(charSequence2);
        vbVar.f40372b = runnable;
        fbVar.setButton(vbVar);
        return b(fbVar, i10);
    }

    public final xb K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        int i10;
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return J(i7, charSequence, str, i10, false, runnable);
    }

    public final xb L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        ub ubVar = new ub(W, e6Var);
        ubVar.c(i7, 36, 36, new String[0]);
        ubVar.f39988b.setText(str);
        ubVar.f39989c.setText(charSequence);
        vb vbVar = new vb(W(), e6Var, true);
        vbVar.e(str2);
        vbVar.f40372b = runnable;
        ubVar.setButton(vbVar);
        return b(ubVar, 5000);
    }

    public final xb M(Drawable drawable, CharSequence charSequence) {
        fb fbVar = new fb(W(), this.f33536c);
        fbVar.f34555a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.em0) {
            ((org.telegram.ui.em0) drawable).e(fbVar.f34555a);
        }
        fbVar.f34556b.setText(charSequence);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(2);
        return b(fbVar, 2750);
    }

    public final xb N(String str, String str2) {
        ub ubVar = new ub(W(), this.f33536c);
        ubVar.f39987a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ubVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        ubVar.f39988b.setText(str);
        ubVar.f39989c.setText(str2);
        return b(ubVar, 5000);
    }

    public final xb O(TLRPC.Document document, String str, String str2) {
        int i7;
        if (document == null) {
            return new xb();
        }
        tb tbVar = new tb(W(), this.f33536c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.gc c10 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.gc c11 = org.telegram.messenger.gc.c(w10, document);
        i9 i9Var = tbVar.f39625a;
        i9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = tbVar.f39626b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = tbVar.f39627c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(tbVar, i7);
    }

    public final xb P(int i7, CharSequence charSequence) {
        int i10;
        fb fbVar = new fb(W(), this.f33536c);
        fbVar.c(i7, 36, 36, new String[0]);
        fbVar.f34556b.setText(charSequence);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setTextSize(1, 14.0f);
        fbVar.f34556b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(fbVar, i10);
    }

    public final xb Q(int i7, int i10, CharSequence charSequence) {
        int i11;
        fb fbVar = new fb(W(), this.f33536c);
        fbVar.c(i7, i10, i10, new String[0]);
        fbVar.f34556b.setText(charSequence);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(fbVar, i11);
    }

    public final xb R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i7;
        if (document == null) {
            return new xb();
        }
        tb tbVar = new tb(W(), this.f33536c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.gc c10 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.gc c11 = org.telegram.messenger.gc.c(w10, document);
        i9 i9Var = tbVar.f39625a;
        i9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        i9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = tbVar.f39626b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        tbVar.f39627c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(tbVar, i7);
    }

    public final xb T(String str) {
        fb fbVar = new fb(W(), null);
        fbVar.d(2131623990, new String[0]);
        fbVar.f34556b.setText(str);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(2);
        return b(fbVar, 1500);
    }

    public final xb U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        ub ubVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        if (!isEmpty) {
            ub ubVar2 = new ub(W(), e6Var);
            ubVar2.f39988b.setText(str);
            ubVar2.f39989c.setText((CharSequence) null);
            ubVar = ubVar2;
        } else {
            fb fbVar = new fb(W(), e6Var);
            fbVar.f34556b.setText(str);
            fbVar.f34556b.setSingleLine(false);
            fbVar.f34556b.setMaxLines(2);
            ubVar = fbVar;
        }
        ubVar.setTimer();
        vb vbVar = new vb(W(), e6Var, true, z10);
        vbVar.e(org.telegram.messenger.hd.M0(2131743885, null));
        vbVar.f40372b = runnable;
        vbVar.f40373c = runnable2;
        ubVar.setButton(vbVar);
        return b(ubVar, 5000);
    }

    public final xb V(List list, CharSequence charSequence, CharSequence charSequence2, k8.a aVar) {
        boolean z10;
        float f10;
        int i7;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        wb wbVar = new wb(W, e6Var, z10);
        w8 w8Var = wbVar.f41323a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    w8Var.setCount(i12);
                    w8Var.b(i7, org.telegram.messenger.m10.f24940t0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                w8Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                w8Var.setScaleX(1.2f);
                w8Var.setScaleY(1.2f);
            } else {
                w8Var.setScaleX(1.0f);
                w8Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        w8Var.a(false);
        z70 z70Var = wbVar.f41324b;
        if (charSequence2 != null) {
            z70Var.setSingleLine(true);
            z70Var.setMaxLines(1);
            z70Var.setText(charSequence);
            z70 z70Var2 = wbVar.f41325c;
            z70Var2.setText(charSequence2);
            z70Var2.setSingleLine(false);
            z70Var2.setMaxLines(3);
            LinearLayout linearLayout = wbVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.hd.f24104a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            z70Var.setSingleLine(false);
            z70Var.setMaxLines(4);
            z70Var.setText(charSequence);
            if (z70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    z70Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.hd.f24104a0) {
                    ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) z70Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (aVar != null) {
            vb vbVar = new vb(W(), e6Var, true);
            vbVar.e(org.telegram.messenger.hd.M0(2131743885, null));
            vbVar.f40372b = (Runnable) aVar.f17788b;
            vbVar.f40373c = (Runnable) aVar.f17789c;
            wbVar.setButton(vbVar);
        }
        return b(wbVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.e2 e2Var = this.f33534a;
        if (e2Var != null) {
            context = e2Var.getParentActivity();
            if (context == null && this.f33534a.getLayoutContainer() != null) {
                context = this.f33534a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f33535b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return org.telegram.messenger.t0.f26609b;
        }
        return context;
    }

    public final xb Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new xb();
        }
        if (tL_error == null) {
            return t(org.telegram.messenger.hd.a0(null, null, 2131743879, new Object[0]), null);
        }
        return t(org.telegram.messenger.hd.a0(null, null, 2131743878, tL_error.text), null);
    }

    public final xb b(va vaVar, int i7) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f33534a;
        if (e2Var != null) {
            return xb.g(e2Var, vaVar, i7);
        }
        return xb.f(this.f33535b, vaVar, i7);
    }

    public final xb c(CharSequence charSequence) {
        if (W() == null) {
            return new xb();
        }
        fb fbVar = new fb(W(), this.f33536c);
        fbVar.d(2131624049, "Shield");
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(3);
        fbVar.f34556b.setText(charSequence);
        return b(fbVar, 2750);
    }

    public final xb e(boolean z10) {
        String M0;
        fb fbVar = new fb(W(), this.f33536c);
        if (z10) {
            fbVar.d(2131624050, "Hand");
            M0 = org.telegram.messenger.hd.M0(2131743761, null);
        } else {
            fbVar.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.hd.M0(2131743675, null);
        }
        fbVar.f34556b.setText(org.telegram.messenger.g0.X2(M0));
        return b(fbVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            xb t6 = t(org.telegram.messenger.hd.a0(null, null, 2131743879, new Object[0]), null);
            t6.f41643r = false;
            t6.k(z10);
            return;
        }
        xb t10 = t(org.telegram.messenger.hd.a0(null, null, 2131743878, str), null);
        t10.f41643r = false;
        t10.k(z10);
    }

    public final xb f(int i7, Runnable runnable) {
        fb fbVar = new fb(W(), null);
        fbVar.d(2131623970, new String[0]);
        String G = org.telegram.messenger.hd.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.X2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        fbVar.f34556b.setText(valueOf);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(3);
        return b(fbVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                xb t6 = t(org.telegram.messenger.hd.a0(null, null, 2131743879, new Object[0]), null);
                t6.f41643r = false;
                t6.k(z10);
            } else if (tL_error.code != 406) {
                xb t10 = t(org.telegram.messenger.hd.a0(null, null, 2131743878, tL_error.text), null);
                t10.f41643r = false;
                t10.k(z10);
            }
        }
    }

    public final xb g(String str, ArrayList arrayList) {
        wb wbVar = new wb(W(), this.f33536c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                wbVar.f41323a.setCount(i11);
                wbVar.f41323a.b(i7, org.telegram.messenger.m10.f24940t0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            wbVar.f41323a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            wbVar.f41323a.setScaleX(1.2f);
            wbVar.f41323a.setScaleY(1.2f);
        } else {
            wbVar.f41323a.setScaleX(1.0f);
            wbVar.f41323a.setScaleY(1.0f);
        }
        wbVar.f41323a.a(false);
        wbVar.f41324b.setSingleLine(false);
        wbVar.f41324b.setMaxLines(2);
        wbVar.f41324b.setText(str);
        if (wbVar.f41324b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.hd.f24104a0) {
                ((ViewGroup.MarginLayoutParams) wbVar.f41324b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) wbVar.f41324b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.hd.f24104a0) {
            wbVar.f41323a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(wbVar, 5000);
    }

    public final boolean g0(int i7, long j3) {
        org.telegram.ui.ActionBar.e2 e2Var;
        SpannableStringBuilder S2;
        if (org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).q() && (e2Var = this.f33534a) != null) {
            ib ibVar = new ib(i7, e2Var);
            if (j3 == org.telegram.messenger.m10.i(org.telegram.messenger.m10.f24940t0).f24959n) {
                if (i7 <= 1) {
                    S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750498, null), -1, 2, new org.telegram.messenger.c6(25), null);
                } else {
                    S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750491, null), -1, 2, new org.telegram.messenger.c6(25), null);
                }
                ibVar.c(2131624191, 36, 36, new String[0]);
                ibVar.f34556b.setText(S2);
                ibVar.f34556b.setSingleLine(false);
                ibVar.f34556b.setMaxLines(2);
                xb b10 = b(ibVar, 3500);
                ibVar.setBulletin(b10);
                b10.f41643r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final xb h(TLRPC.Document document, int i7, final org.telegram.messenger.z10 z10Var) {
        SpannableStringBuilder spannableStringBuilder;
        e80 e80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder X2;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.gj.i1(document);
        if (i12 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).m0(i12, true);
        if (m0 != null && (stickerSet = m0.set) != null) {
            if (i7 == 1) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131744022, stickerSet.title));
            } else if (i7 == 2) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744699, stickerSet.title));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748596, stickerSet.title));
            }
            return r(document, X2, org.telegram.messenger.hd.M0(2131743563, null), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            z10Var.a(i12);
                            return;
                        default:
                            z10Var.a(i12);
                            return;
                    }
                }
            });
        }
        if (i7 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131744022, "<{LOADING}>")));
        } else if (i7 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744699, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748596, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        if (indexOf >= 0) {
            e80Var = new e80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), e6Var);
            spannableStringBuilder.setSpan(e80Var, indexOf, indexOf + 11, 33);
            int i10 = org.telegram.ui.ActionBar.j6.yj;
            e80Var.a(i0.a.o(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 32), i0.a.o(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), 72));
        } else {
            e80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.hd.M0(2131743563, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        z10Var.a(i12);
                        return;
                    default:
                        z10Var.a(i12);
                        return;
                }
            }
        };
        Context W = W();
        ?? fbVar = new fb(W, e6Var);
        z70 z70Var = new z70(W, null);
        fbVar.d = z70Var;
        z70Var.setDisablePaddingsOffset(true);
        z70Var.setSingleLine();
        z70Var.setTypeface(Typeface.SANS_SERIF);
        z70Var.setTextSize(1, 15.0f);
        z70Var.setEllipsize(TextUtils.TruncateAt.END);
        z70Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        fbVar.f34556b.setVisibility(8);
        fbVar.addView(z70Var, c8.ja.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.j6.yj;
        fbVar.setTextColor(fbVar.getThemedColor(i11));
        if (org.telegram.messenger.gj.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.q6.s(fbVar.f34555a, i11, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        fbVar.e(document, new String[0]);
        fbVar.f34556b.setTextSize(1, 14.0f);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(3);
        z70Var.setText(spannableStringBuilder);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setSingleLine(false);
        z70Var.setMaxLines(3);
        vb vbVar = new vb(W(), e6Var, true);
        vbVar.e(M0);
        vbVar.f40372b = runnable;
        fbVar.setButton(vbVar);
        xb b10 = b(fbVar, 2750);
        if (e80Var != null) {
            cb cbVar = b10.f41631e;
            if (cbVar instanceof eb) {
                e80Var.f34241b = ((eb) cbVar).d;
            }
        }
        org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24940t0).l0(inputStickerSet, null, false, false, new di.h3(i7, b10, currentTimeMillis));
        return b10;
    }

    public final xb i(String str) {
        if (!org.telegram.messenger.g0.H3()) {
            return new xb();
        }
        fb fbVar = new fb(W(), null);
        fbVar.c(2131623994, 36, 36, "NULL ROTATION", "Back", "Front");
        fbVar.f34556b.setText(str);
        return b(fbVar, 1500);
    }

    public final xb k(boolean z10) {
        if (!org.telegram.messenger.g0.H3()) {
            return new xb();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        if (z10) {
            ub ubVar = new ub(W(), e6Var);
            ubVar.c(2131624346, 36, 36, "Wibe", "Circle");
            ubVar.f39988b.setText(org.telegram.messenger.hd.M0(2131748921, null));
            ubVar.f39989c.setText(org.telegram.messenger.hd.M0(2131748919, null));
            return b(ubVar, 2750);
        }
        fb fbVar = new fb(W(), e6Var);
        fbVar.c(2131624346, 36, 36, "Wibe", "Circle");
        fbVar.f34556b.setText(org.telegram.messenger.hd.M0(2131748921, null));
        return b(fbVar, 1500);
    }

    public final xb m(bc bcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        fb fbVar;
        String M0;
        ac acVar = bcVar.d;
        if (i10 != 0 && i11 != 0) {
            fbVar = new fb(i10, i11, W(), e6Var);
        } else {
            fbVar = new fb(W(), e6Var);
        }
        fbVar.d(acVar.f32955a, acVar.f32956b);
        TextView textView = fbVar.f34556b;
        String str = bcVar.f33246a;
        if (bcVar.f33248c) {
            M0 = org.telegram.messenger.hd.G(i7, str, new Object[0]);
        } else {
            M0 = org.telegram.messenger.hd.M0(bcVar.f33247b, str);
        }
        textView.setText(org.telegram.messenger.g0.U2(M0, new org.telegram.messenger.c6(26)));
        int i12 = acVar.f32957c;
        if (i12 != 0) {
            fbVar.setIconPaddingBottom(i12);
        }
        return b(fbVar, 1500);
    }

    public final xb n(bc bcVar, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(bcVar, i7, 0, 0, e6Var);
    }

    public final xb o(bc bcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(bcVar, 1, 0, 0, e6Var);
    }

    public final xb p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        sb sbVar = new sb(W, e6Var);
        g5 g5Var = new g5(1, org.telegram.messenger.m10.f24940t0, j3);
        i9 i9Var = sbVar.f39265a;
        i9Var.setAnimatedEmojiDrawable(g5Var);
        i9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        sbVar.f39266b.setText(str);
        sbVar.f39267c.setText(str2);
        return b(sbVar, 2750);
    }

    public final xb q(TLRPC.Document document, CharSequence charSequence) {
        fb fbVar = new fb(W(), this.f33536c);
        if (org.telegram.messenger.gj.C4(document)) {
            org.telegram.ui.ActionBar.q6.s(fbVar.f34555a, org.telegram.ui.ActionBar.j6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        fbVar.e(document, new String[0]);
        fbVar.f34556b.setText(charSequence);
        fbVar.f34556b.setTextSize(1, 14.0f);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(3);
        return b(fbVar, 2750);
    }

    public final xb r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        fb fbVar = new fb(W, e6Var);
        if (org.telegram.messenger.gj.C4(document)) {
            org.telegram.ui.ActionBar.q6.s(fbVar.f34555a, org.telegram.ui.ActionBar.j6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        fbVar.e(document, new String[0]);
        if (fbVar.f34555a.getImageReceiver() != null) {
            fbVar.f34555a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        fbVar.f34556b.setText(charSequence);
        fbVar.f34556b.setTextSize(1, 14.0f);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(3);
        vb vbVar = new vb(W(), e6Var, true);
        vbVar.e(str);
        vbVar.f40372b = runnable;
        fbVar.setButton(vbVar);
        return b(fbVar, 2750);
    }

    public final xb s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i7;
        ub ubVar = new ub(W(), this.f33536c);
        boolean C4 = org.telegram.messenger.gj.C4(document);
        fh0 fh0Var = ubVar.f39987a;
        if (C4) {
            org.telegram.ui.ActionBar.q6.s(fh0Var, org.telegram.ui.ActionBar.j6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        fh0Var.setAutoRepeat(true);
        fh0Var.g(36, 36, document);
        ubVar.f39988b.setText(str);
        ubVar.f39989c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(ubVar, i7);
    }

    public final xb t(CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        fb fbVar = new fb(W(), e6Var);
        fbVar.d(2131623982, new String[0]);
        fbVar.f34556b.setText(charSequence);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setMaxLines(2);
        return b(fbVar, 1500);
    }

    public final xb u(String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        ub ubVar = new ub(W(), e6Var);
        ubVar.c(2131623982, 32, 32, new String[0]);
        ubVar.f39988b.setText(str);
        ubVar.f39989c.setText(str2);
        return b(ubVar, 1500);
    }

    public final xb w(int i7, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        fb fbVar = new fb(W, e6Var);
        fbVar.setBackground(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.wj, e6Var), 12);
        fbVar.f34555a.setImageResource(i7);
        fbVar.f34556b.setText(charSequence);
        fbVar.f34556b.setSingleLine(false);
        fbVar.f34556b.setLines(2);
        fbVar.f34556b.setMaxLines(4);
        TextView textView = fbVar.f34556b;
        textView.setMaxWidth(hi.l3.a(textView.getText(), fbVar.f34556b.getPaint()));
        fbVar.f34556b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) fbVar.f34556b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        fbVar.setWrapWidth();
        return b(fbVar, 5000);
    }

    public final xb y(int i7, TLRPC.Document document, jg.q qVar) {
        String M0;
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f33536c;
        fb fbVar = new fb(W, e6Var);
        fbVar.c(2131624286, 36, 36, new String[0]);
        fbVar.removeView(fbVar.f34556b);
        o5 o5Var = new o5(fbVar.getContext());
        fbVar.f34556b = o5Var;
        o5Var.setTypeface(Typeface.SANS_SERIF);
        fbVar.f34556b.setTextSize(1, 15.0f);
        fbVar.f34556b.setEllipsize(TextUtils.TruncateAt.END);
        fbVar.f34556b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new p5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = fbVar.f34556b;
        if (i7 > 1) {
            M0 = org.telegram.messenger.hd.G(i7, "SavedTagMessagesTagged", new Object[0]);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131745878, null);
        }
        textView.setText(new SpannableStringBuilder(M0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (qVar != null) {
            vb vbVar = new vb(W(), e6Var, true);
            vbVar.e(org.telegram.messenger.hd.M0(2131743563, null));
            vbVar.f40372b = qVar;
            fbVar.setButton(vbVar);
        }
        fbVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.yj, e6Var));
        fbVar.addView(fbVar.f34556b, c8.ja.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(fbVar, 2750);
    }

    public cc(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f33535b = frameLayout;
        this.f33534a = null;
        this.f33536c = e6Var;
    }
}

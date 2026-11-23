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
public final class kc {
    public final org.telegram.ui.ActionBar.g2 f36698a;
    public final FrameLayout f36699b;
    public final org.telegram.ui.ActionBar.i6 f36700c;

    public kc(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var != null && g2Var.getLastStoryViewer() != null && g2Var.getLastStoryViewer().y()) {
            this.f36698a = null;
            fi.z3 currentPeerView = g2Var.getLastStoryViewer().f11989o0.getCurrentPeerView();
            this.f36699b = currentPeerView != null ? currentPeerView.M0 : null;
            this.f36700c = g2Var.getLastStoryViewer().E;
            return;
        }
        this.f36698a = g2Var;
        this.f36699b = null;
        this.f36700c = g2Var != null ? g2Var.getResourceProvider() : null;
    }

    public static fc A(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 4;
        }
        return z(g2Var, i7, 0, i6Var);
    }

    public static fc B(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, ai.x0 x0Var, org.telegram.ui.he heVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        String str;
        int i10;
        int i11;
        nb nbVar = new nb(g2Var.getParentActivity(), i6Var);
        if (z10) {
            i7 = 2131624055;
        } else {
            i7 = 2131624061;
        }
        nbVar.c(i7, 28, 28, "Pin", "Line");
        TextView textView = nbVar.f37752b;
        if (z10) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z10) {
            i10 = 2131748351;
        } else {
            i10 = 2131748273;
        }
        textView.setText(org.telegram.messenger.gd.N0(i10, str));
        if (!z10) {
            dc dcVar = new dc(g2Var.getParentActivity(), i6Var, true);
            dcVar.f34267b = x0Var;
            dcVar.f34268c = heVar;
            nbVar.setButton(dcVar);
        }
        if (z10) {
            i11 = 1500;
        } else {
            i11 = 5000;
        }
        return fc.g(g2Var, nbVar, i11);
    }

    public static fc C(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        nb nbVar = new nb(g2Var.getParentActivity(), g2Var.getResourceProvider());
        nbVar.d(2131624049, "Shield");
        org.telegram.messenger.f3.q("UserSetAsAdminHint", null, 2131743433, new Object[]{str}, nbVar.f37752b);
        return fc.g(g2Var, nbVar, 1500);
    }

    public static fc D(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        String str2;
        nb nbVar = new nb(g2Var.getParentActivity(), g2Var.getResourceProvider());
        nbVar.d(2131624050, "Hand");
        if (user.deleted) {
            str2 = org.telegram.messenger.gd.a0("HiddenName", null, 2131749135, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        org.telegram.messenger.f3.q("UserRemovedFromChatHint", null, 2131743484, new Object[]{str2, str}, nbVar.f37752b);
        return fc.g(g2Var, nbVar, 1500);
    }

    public static fc F(FrameLayout frameLayout, boolean z10) {
        jc jcVar;
        kc kcVar = new kc(frameLayout, null);
        if (z10) {
            jcVar = jc.h;
        } else {
            jcVar = jc.f36372e;
        }
        return kcVar.m(jcVar, 1, -115203550, -1, null);
    }

    public static fc S(int i7, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        String N0;
        nb nbVar = new nb(g2Var.getParentActivity(), i6Var);
        boolean z10 = true;
        if (i7 != 0) {
            if (i7 == 1) {
                N0 = org.telegram.messenger.gd.N0(2131745080, null);
                z10 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            N0 = org.telegram.messenger.gd.N0(2131745078, null);
        }
        if (z10) {
            nbVar.d(2131624203, new String[0]);
        } else {
            nbVar.d(2131624202, new String[0]);
        }
        nbVar.f37752b.setText(N0);
        return fc.g(g2Var, nbVar, 1500);
    }

    public static String W(String str) {
        if ("STARGIFT_ALREADY_TRANSFERRED".equals(str)) {
            return org.telegram.messenger.gd.N0(2131749735, null);
        }
        return org.telegram.messenger.gd.a0(null, null, 2131743631, str);
    }

    public static kc Y() {
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null) {
            return new kc(bb.a(org.telegram.messenger.t0.f27013b), null);
        }
        Dialog dialog = T.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.w2) {
            return new kc(((org.telegram.ui.ActionBar.w2) dialog).f30229c, T.getResourceProvider());
        }
        return b0(T);
    }

    public static boolean a(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var != null && g2Var.getParentActivity() != null && g2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static kc a0(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        return new kc(frameLayout, i6Var);
    }

    public static kc b0(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var == null) {
            return Y();
        }
        return new kc(g2Var);
    }

    public static void c0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        Y().t(W(str), null).j();
    }

    public static fc d(org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        String N0;
        nb nbVar = new nb(g2Var.getParentActivity(), g2Var.getResourceProvider());
        if (z10) {
            nbVar.d(2131624050, "Hand");
            N0 = org.telegram.messenger.gd.N0(2131743514, null);
        } else {
            nbVar.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            N0 = org.telegram.messenger.gd.N0(2131743428, null);
        }
        nbVar.f37752b.setText(org.telegram.messenger.g0.W2(N0));
        return fc.g(g2Var, nbVar, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            c0(str);
            return;
        }
        fc t6 = new kc(frameLayout, i6Var).t(W(str), null);
        t6.f35099r = false;
        t6.j();
    }

    public static void e0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            Y().t(W(tL_error.text), null).j();
        }
    }

    public static fc j(org.telegram.ui.ActionBar.g2 g2Var) {
        return b0(g2Var).k(false);
    }

    public static fc l(String str, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        int i7;
        String N0;
        int i10;
        int i11;
        nb nbVar = new nb(g2Var.getParentActivity(), g2Var.getResourceProvider());
        if (str != null) {
            if (z10) {
                i11 = 2131751400;
            } else {
                i11 = 2131751398;
            }
            N0 = org.telegram.messenger.gd.a0(null, null, i11, str);
        } else {
            if (z10) {
                i7 = 2131751401;
            } else {
                i7 = 2131751399;
            }
            N0 = org.telegram.messenger.gd.N0(i7, null);
        }
        nbVar.f37752b.setText(org.telegram.messenger.g0.W2(N0));
        if (!z10 && str == null) {
            i10 = 2131623990;
        } else {
            i10 = 2131624007;
        }
        nbVar.d(i10, new String[0]);
        return fc.g(g2Var, nbVar, 5000);
    }

    public static fc v(Context context, org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z10, bi.s2 s2Var) {
        nb nbVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z11;
        org.telegram.ui.ah ahVar;
        int i14;
        SpannableStringBuilder W2;
        fc g10;
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i15;
        int i16;
        org.telegram.messenger.j2 j2Var;
        if (org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q() && g2Var != null && i7 <= 1 && j3 == org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f24656n && !z10) {
            nbVar = new qb(i10, g2Var);
        } else {
            if (g2Var != null) {
                i6Var = g2Var.getResourceProvider();
            } else {
                i6Var = null;
            }
            nbVar = new nb(i11, i12, context, i6Var);
        }
        nb nbVar2 = nbVar;
        if (s2Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (s2Var != null) {
            ahVar = new org.telegram.ui.ah(23, zArr, s2Var);
        } else {
            ahVar = null;
        }
        if (i7 <= 1) {
            if (j3 == org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f24656n) {
                if (i10 <= 1) {
                    String N0 = org.telegram.messenger.gd.N0(2131750481, null);
                    if (z10) {
                        j2Var = new org.telegram.messenger.j2(29);
                    } else {
                        j2Var = new org.telegram.messenger.j2(27);
                    }
                    W2 = org.telegram.messenger.g0.R2(N0, -1, 2, j2Var, null);
                } else {
                    W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750474, null), -1, 2, new org.telegram.messenger.j2(27), null);
                }
                nbVar2.c(2131624191, 30, 30, new String[0]);
                i14 = 2;
            } else {
                i14 = 2;
                bi.s2 s2Var2 = new bi.s2(ahVar, g2Var, j3, 20);
                if (org.telegram.messenger.n5.z(j3)) {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).O0(Long.valueOf(-j3));
                    if (i10 <= 1) {
                        if (g2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131750485, O0.title), -1, 2, s2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750485, O0.title));
                        }
                    } else if (g2Var != null) {
                        W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131750478, O0.title), -1, 2, s2Var2, null);
                    } else {
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750478, O0.title));
                    }
                } else {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).c2(Long.valueOf(j3));
                    if (i10 <= 1) {
                        if (z11) {
                            i16 = 2131750479;
                        } else {
                            i16 = 2131750480;
                        }
                        if (g2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, i16, org.telegram.messenger.n10.k(c22, true)), -1, 2, s2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i16, org.telegram.messenger.n10.k(c22, true)));
                        }
                    } else {
                        if (z11) {
                            i15 = 2131750472;
                        } else {
                            i15 = 2131750473;
                        }
                        if (g2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, i15, org.telegram.messenger.n10.k(c22, true)), -1, 2, s2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i15, org.telegram.messenger.n10.k(c22, true)));
                        }
                    }
                }
                nbVar2.c(2131624029, 30, 30, new String[0]);
            }
        } else {
            i14 = 2;
            if (i10 <= 1) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "FwdMessageToManyChats", new Object[0]));
            } else {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "FwdMessagesToManyChats", new Object[0]));
            }
            nbVar2.c(2131624029, 30, 30, new String[0]);
        }
        nbVar2.f37752b.setText(W2);
        if (z11) {
            Context context2 = nbVar2.getContext();
            if (g2Var != null) {
                i6Var2 = g2Var.getResourceProvider();
            } else {
                i6Var2 = null;
            }
            dc dcVar = new dc(context2, i6Var2, true, true);
            dcVar.f34267b = null;
            dcVar.f34268c = ahVar;
            nbVar2.setButton(dcVar);
        }
        nbVar2.postDelayed(new gc(nbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = fc.f(frameLayout, nbVar2, i13);
        } else if (g2Var != null) {
            g10 = fc.g(g2Var, nbVar2, i13);
        } else {
            throw new IllegalArgumentException();
        }
        if (nbVar2 instanceof qb) {
            nbVar2.f37752b.setSingleLine(false);
            nbVar2.f37752b.setMaxLines(i14);
            ((qb) nbVar2).setBulletin(g10);
            g10.f35099r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.fc x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.fc");
    }

    public static org.telegram.ui.Components.fc z(org.telegram.ui.ActionBar.g2 r6, int r7, int r8, org.telegram.ui.ActionBar.i6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kc.z(org.telegram.ui.ActionBar.g2, int, int, org.telegram.ui.ActionBar.i6):org.telegram.ui.Components.fc");
    }

    public final fc E(org.telegram.ui.ActionBar.i6 i6Var) {
        nb nbVar = new nb(X(), i6Var);
        nbVar.d(2131623982, new String[0]);
        nbVar.f37752b.setText(org.telegram.messenger.gd.N0(2131746026, null));
        return b(nbVar, 1500);
    }

    public final fc G(int i7, int i10, CharSequence charSequence) {
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        nb nbVar = new nb(X(), this.f36700c);
        nbVar.c(i7, 36, 36, new String[0]);
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
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(i10);
        nbVar.f37752b.setText(charSequence);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(nbVar, i11);
    }

    public final fc H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final fc I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        int i10;
        cc ccVar = new cc(X(), this.f36700c);
        ccVar.c(i7, 36, 36, new String[0]);
        ccVar.f34013b.setText(charSequence);
        ccVar.f34014c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ccVar, i10);
    }

    public final fc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        nb nbVar = new nb(X, i6Var);
        if (i7 != 0) {
            nbVar.c(i7, 36, 36, new String[0]);
        } else {
            nbVar.f37751a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) nbVar.f37752b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        nbVar.f37752b.setTextSize(1, 14.0f);
        nbVar.f37752b.setTextDirection(5);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(3);
        nbVar.f37752b.setText(charSequence);
        dc dcVar = new dc(X(), i6Var, true, z10);
        dcVar.e(charSequence2);
        dcVar.f34267b = runnable;
        nbVar.setButton(dcVar);
        return b(nbVar, i10);
    }

    public final fc K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        int i10;
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return J(i7, charSequence, str, i10, false, runnable);
    }

    public final fc L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        cc ccVar = new cc(X, i6Var);
        ccVar.c(i7, 36, 36, new String[0]);
        ccVar.f34013b.setText(str);
        ccVar.f34014c.setText(charSequence);
        dc dcVar = new dc(X(), i6Var, true);
        dcVar.e(str2);
        dcVar.f34267b = runnable;
        ccVar.setButton(dcVar);
        return b(ccVar, 5000);
    }

    public final fc M(Drawable drawable, CharSequence charSequence) {
        nb nbVar = new nb(X(), this.f36700c);
        nbVar.f37751a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.em0) {
            ((org.telegram.ui.em0) drawable).e(nbVar.f37751a);
        }
        nbVar.f37752b.setText(charSequence);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(2);
        return b(nbVar, 2750);
    }

    public final fc N(String str, String str2) {
        cc ccVar = new cc(X(), this.f36700c);
        ccVar.f34012a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ccVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        ccVar.f34013b.setText(str);
        ccVar.f34014c.setText(str2);
        return b(ccVar, 5000);
    }

    public final fc O(TLRPC.Document document, String str, String str2) {
        int i7;
        if (document == null) {
            return new fc();
        }
        bc bcVar = new bc(X(), this.f36700c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.fc c11 = org.telegram.messenger.fc.c(w10, document);
        p9 p9Var = bcVar.f33733a;
        p9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        p9Var.getImageReceiver().K0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = bcVar.f33734b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = bcVar.f33735c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(bcVar, i7);
    }

    public final fc P(int i7, CharSequence charSequence) {
        int i10;
        nb nbVar = new nb(X(), this.f36700c);
        nbVar.c(i7, 36, 36, new String[0]);
        nbVar.f37752b.setText(charSequence);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setTextSize(1, 14.0f);
        nbVar.f37752b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(nbVar, i10);
    }

    public final fc Q(int i7, int i10, CharSequence charSequence) {
        int i11;
        nb nbVar = new nb(X(), this.f36700c);
        nbVar.c(i7, i10, i10, new String[0]);
        nbVar.f37752b.setText(charSequence);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(nbVar, i11);
    }

    public final fc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i7;
        if (document == null) {
            return new fc();
        }
        bc bcVar = new bc(X(), this.f36700c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.fc c11 = org.telegram.messenger.fc.c(w10, document);
        p9 p9Var = bcVar.f33733a;
        p9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        p9Var.getImageReceiver().K0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = bcVar.f33734b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        bcVar.f33735c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(bcVar, i7);
    }

    public final fc T(String str) {
        nb nbVar = new nb(X(), null);
        nbVar.d(2131623990, new String[0]);
        nbVar.f37752b.setText(str);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(2);
        return b(nbVar, 1500);
    }

    public final fc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        cc ccVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        if (!isEmpty) {
            cc ccVar2 = new cc(X(), i6Var);
            ccVar2.f34013b.setText(str);
            ccVar2.f34014c.setText((CharSequence) null);
            ccVar = ccVar2;
        } else {
            nb nbVar = new nb(X(), i6Var);
            nbVar.f37752b.setText(str);
            nbVar.f37752b.setSingleLine(false);
            nbVar.f37752b.setMaxLines(2);
            ccVar = nbVar;
        }
        ccVar.setTimer();
        dc dcVar = new dc(X(), i6Var, true, z10);
        dcVar.e(org.telegram.messenger.gd.N0(2131743638, null));
        dcVar.f34267b = runnable;
        dcVar.f34268c = runnable2;
        ccVar.setButton(dcVar);
        return b(ccVar, 5000);
    }

    public final fc V(List list, CharSequence charSequence, CharSequence charSequence2, jb.m mVar) {
        boolean z10;
        float f10;
        int i7;
        Context X = X();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        ec ecVar = new ec(X, i6Var, z10);
        d9 d9Var = ecVar.f34685a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    d9Var.setCount(i12);
                    d9Var.b(i7, org.telegram.messenger.i10.f24637t0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                d9Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                d9Var.setScaleX(1.2f);
                d9Var.setScaleY(1.2f);
            } else {
                d9Var.setScaleX(1.0f);
                d9Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        d9Var.a(false);
        j80 j80Var = ecVar.f34686b;
        if (charSequence2 != null) {
            j80Var.setSingleLine(true);
            j80Var.setMaxLines(1);
            j80Var.setText(charSequence);
            j80 j80Var2 = ecVar.f34687c;
            j80Var2.setText(charSequence2);
            j80Var2.setSingleLine(false);
            j80Var2.setMaxLines(3);
            LinearLayout linearLayout = ecVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.gd.f24314a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            j80Var.setSingleLine(false);
            j80Var.setMaxLines(4);
            j80Var.setText(charSequence);
            if (j80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    j80Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.gd.f24314a0) {
                    ((ViewGroup.MarginLayoutParams) j80Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) j80Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (mVar != null) {
            dc dcVar = new dc(X(), i6Var, true);
            dcVar.e(org.telegram.messenger.gd.N0(2131743638, null));
            dcVar.f34267b = (Runnable) mVar.f17464b;
            dcVar.f34268c = (Runnable) mVar.f17465c;
            ecVar.setButton(dcVar);
        }
        return b(ecVar, 5000);
    }

    public final Context X() {
        Context context;
        org.telegram.ui.ActionBar.g2 g2Var = this.f36698a;
        if (g2Var != null) {
            context = g2Var.getParentActivity();
            if (context == null && this.f36698a.getLayoutContainer() != null) {
                context = this.f36698a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f36699b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return org.telegram.messenger.t0.f27013b;
        }
        return context;
    }

    public final fc Z(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new fc();
        }
        if (tL_error == null) {
            return t(org.telegram.messenger.gd.a0(null, null, 2131743632, new Object[0]), null);
        }
        return t(W(tL_error.text), null);
    }

    public final fc b(db dbVar, int i7) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f36698a;
        if (g2Var != null) {
            return fc.g(g2Var, dbVar, i7);
        }
        return fc.f(this.f36699b, dbVar, i7);
    }

    public final fc c(CharSequence charSequence) {
        if (X() == null) {
            return new fc();
        }
        nb nbVar = new nb(X(), this.f36700c);
        nbVar.d(2131624049, "Shield");
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(3);
        nbVar.f37752b.setText(charSequence);
        return b(nbVar, 2750);
    }

    public final fc e(boolean z10) {
        String N0;
        nb nbVar = new nb(X(), this.f36700c);
        if (z10) {
            nbVar.d(2131624050, "Hand");
            N0 = org.telegram.messenger.gd.N0(2131743514, null);
        } else {
            nbVar.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            N0 = org.telegram.messenger.gd.N0(2131743428, null);
        }
        nbVar.f37752b.setText(org.telegram.messenger.g0.W2(N0));
        return b(nbVar, 1500);
    }

    public final fc f(int i7, Runnable runnable) {
        nb nbVar = new nb(X(), null);
        nbVar.d(2131623970, new String[0]);
        String G = org.telegram.messenger.gd.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.W2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        nbVar.f37752b.setText(valueOf);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(3);
        return b(nbVar, 5000);
    }

    public final void f0(String str, boolean z10) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            fc t6 = t(org.telegram.messenger.gd.a0(null, null, 2131743632, new Object[0]), null);
            t6.f35099r = false;
            t6.k(z10);
            return;
        }
        fc t10 = t(W(str), null);
        t10.f35099r = false;
        t10.k(z10);
    }

    public final fc g(String str, ArrayList arrayList) {
        ec ecVar = new ec(X(), this.f36700c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                ecVar.f34685a.setCount(i11);
                ecVar.f34685a.b(i7, org.telegram.messenger.i10.f24637t0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            ecVar.f34685a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            ecVar.f34685a.setScaleX(1.2f);
            ecVar.f34685a.setScaleY(1.2f);
        } else {
            ecVar.f34685a.setScaleX(1.0f);
            ecVar.f34685a.setScaleY(1.0f);
        }
        ecVar.f34685a.a(false);
        ecVar.f34686b.setSingleLine(false);
        ecVar.f34686b.setMaxLines(2);
        ecVar.f34686b.setText(str);
        if (ecVar.f34686b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.gd.f24314a0) {
                ((ViewGroup.MarginLayoutParams) ecVar.f34686b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) ecVar.f34686b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.gd.f24314a0) {
            ecVar.f34685a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(ecVar, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                fc t6 = t(org.telegram.messenger.gd.a0(null, null, 2131743632, new Object[0]), null);
                t6.f35099r = false;
                t6.k(z10);
            } else if (tL_error.code != 406) {
                fc t10 = t(W(tL_error.text), null);
                t10.f35099r = false;
                t10.k(z10);
            }
        }
    }

    public final fc h(TLRPC.Document document, int i7, final org.telegram.messenger.w10 w10Var) {
        SpannableStringBuilder spannableStringBuilder;
        o80 o80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder W2;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.fj.i1(document);
        if (i12 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).o0(i12, true);
        if (o02 != null && (stickerSet = o02.set) != null) {
            if (i7 == 1) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("TopicContainsEmojiPackSingle", null, 2131743777, stickerSet.title));
            } else if (i7 == 2) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoryContainsEmojiPackSingle", null, 2131744455, stickerSet.title));
            } else {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MessageContainsEmojiPackSingle", null, 2131748403, stickerSet.title));
            }
            return r(document, W2, org.telegram.messenger.gd.N0(2131743313, null), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            w10Var.a(i12);
                            return;
                        default:
                            w10Var.a(i12);
                            return;
                    }
                }
            });
        }
        if (i7 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("TopicContainsEmojiPackSingle", null, 2131743777, "<{LOADING}>")));
        } else if (i7 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoryContainsEmojiPackSingle", null, 2131744455, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MessageContainsEmojiPackSingle", null, 2131748403, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        if (indexOf >= 0) {
            o80Var = new o80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), i6Var);
            spannableStringBuilder.setSpan(o80Var, indexOf, indexOf + 11, 33);
            int i10 = org.telegram.ui.ActionBar.n6.yj;
            o80Var.a(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 32), i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 72));
        } else {
            o80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String N0 = org.telegram.messenger.gd.N0(2131743313, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        w10Var.a(i12);
                        return;
                    default:
                        w10Var.a(i12);
                        return;
                }
            }
        };
        Context X = X();
        ?? nbVar = new nb(X, i6Var);
        j80 j80Var = new j80(X, null);
        nbVar.d = j80Var;
        j80Var.setDisablePaddingsOffset(true);
        j80Var.setSingleLine();
        j80Var.setTypeface(Typeface.SANS_SERIF);
        j80Var.setTextSize(1, 15.0f);
        j80Var.setEllipsize(TextUtils.TruncateAt.END);
        j80Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        nbVar.f37752b.setVisibility(8);
        nbVar.addView(j80Var, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.n6.yj;
        nbVar.setTextColor(nbVar.getThemedColor(i11));
        if (org.telegram.messenger.fj.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.u6.s(nbVar.f37751a, i11, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        nbVar.e(document, new String[0]);
        nbVar.f37752b.setTextSize(1, 14.0f);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(3);
        j80Var.setText(spannableStringBuilder);
        j80Var.setTextSize(1, 14.0f);
        j80Var.setSingleLine(false);
        j80Var.setMaxLines(3);
        dc dcVar = new dc(X(), i6Var, true);
        dcVar.e(N0);
        dcVar.f34267b = runnable;
        nbVar.setButton(dcVar);
        fc b10 = b(nbVar, 2750);
        if (o80Var != null) {
            kb kbVar = b10.f35087e;
            if (kbVar instanceof mb) {
                o80Var.f38063b = ((mb) kbVar).d;
            }
        }
        org.telegram.messenger.ri.d0(org.telegram.messenger.i10.f24637t0).n0(inputStickerSet, null, false, false, new bi.d5(i7, b10, currentTimeMillis));
        return b10;
    }

    public final boolean h0(int i7, long j3) {
        org.telegram.ui.ActionBar.g2 g2Var;
        SpannableStringBuilder R2;
        if (org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).q() && (g2Var = this.f36698a) != null) {
            qb qbVar = new qb(i7, g2Var);
            if (j3 == org.telegram.messenger.i10.i(org.telegram.messenger.i10.f24637t0).f24656n) {
                if (i7 <= 1) {
                    R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750481, null), -1, 2, new org.telegram.messenger.j2(27), null);
                } else {
                    R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131750474, null), -1, 2, new org.telegram.messenger.j2(27), null);
                }
                qbVar.c(2131624191, 36, 36, new String[0]);
                qbVar.f37752b.setText(R2);
                qbVar.f37752b.setSingleLine(false);
                qbVar.f37752b.setMaxLines(2);
                fc b10 = b(qbVar, 3500);
                qbVar.setBulletin(b10);
                b10.f35099r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final fc i(String str) {
        if (!org.telegram.messenger.g0.G3()) {
            return new fc();
        }
        nb nbVar = new nb(X(), null);
        nbVar.c(2131623994, 36, 36, "NULL ROTATION", "Back", "Front");
        nbVar.f37752b.setText(str);
        return b(nbVar, 1500);
    }

    public final fc k(boolean z10) {
        if (!org.telegram.messenger.g0.G3()) {
            return new fc();
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        if (z10) {
            cc ccVar = new cc(X(), i6Var);
            ccVar.c(2131624346, 36, 36, "Wibe", "Circle");
            ccVar.f34013b.setText(org.telegram.messenger.gd.N0(2131748728, null));
            ccVar.f34014c.setText(org.telegram.messenger.gd.N0(2131748726, null));
            return b(ccVar, 2750);
        }
        nb nbVar = new nb(X(), i6Var);
        nbVar.c(2131624346, 36, 36, "Wibe", "Circle");
        nbVar.f37752b.setText(org.telegram.messenger.gd.N0(2131748728, null));
        return b(nbVar, 1500);
    }

    public final fc m(jc jcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.i6 i6Var) {
        nb nbVar;
        String N0;
        ic icVar = jcVar.d;
        if (i10 != 0 && i11 != 0) {
            nbVar = new nb(i10, i11, X(), i6Var);
        } else {
            nbVar = new nb(X(), i6Var);
        }
        nbVar.d(icVar.f35983a, icVar.f35984b);
        TextView textView = nbVar.f37752b;
        String str = jcVar.f36380a;
        if (jcVar.f36382c) {
            N0 = org.telegram.messenger.gd.G(i7, str, new Object[0]);
        } else {
            N0 = org.telegram.messenger.gd.N0(jcVar.f36381b, str);
        }
        textView.setText(org.telegram.messenger.g0.T2(N0, new org.telegram.messenger.j2(28)));
        int i12 = icVar.f35985c;
        if (i12 != 0) {
            nbVar.setIconPaddingBottom(i12);
        }
        return b(nbVar, 1500);
    }

    public final fc n(jc jcVar, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return m(jcVar, i7, 0, 0, i6Var);
    }

    public final fc o(jc jcVar, org.telegram.ui.ActionBar.i6 i6Var) {
        return m(jcVar, 1, 0, 0, i6Var);
    }

    public final fc p(long j3, String str, String str2) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        ac acVar = new ac(X, i6Var);
        o5 o5Var = new o5(1, org.telegram.messenger.i10.f24637t0, j3);
        p9 p9Var = acVar.f33456a;
        p9Var.setAnimatedEmojiDrawable(o5Var);
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var), PorterDuff.Mode.SRC_IN));
        acVar.f33457b.setText(str);
        acVar.f33458c.setText(str2);
        return b(acVar, 2750);
    }

    public final fc q(TLRPC.Document document, CharSequence charSequence) {
        nb nbVar = new nb(X(), this.f36700c);
        if (org.telegram.messenger.fj.C4(document)) {
            org.telegram.ui.ActionBar.u6.s(nbVar.f37751a, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        nbVar.e(document, new String[0]);
        nbVar.f37752b.setText(charSequence);
        nbVar.f37752b.setTextSize(1, 14.0f);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(3);
        return b(nbVar, 2750);
    }

    public final fc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        nb nbVar = new nb(X, i6Var);
        if (org.telegram.messenger.fj.C4(document)) {
            org.telegram.ui.ActionBar.u6.s(nbVar.f37751a, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        nbVar.e(document, new String[0]);
        if (nbVar.f37751a.getImageReceiver() != null) {
            nbVar.f37751a.getImageReceiver().K0(org.telegram.messenger.g0.L(4.0f));
        }
        nbVar.f37752b.setText(charSequence);
        nbVar.f37752b.setTextSize(1, 14.0f);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(3);
        dc dcVar = new dc(X(), i6Var, true);
        dcVar.e(str);
        dcVar.f34267b = runnable;
        nbVar.setButton(dcVar);
        return b(nbVar, 2750);
    }

    public final fc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i7;
        cc ccVar = new cc(X(), this.f36700c);
        boolean C4 = org.telegram.messenger.fj.C4(document);
        qh0 qh0Var = ccVar.f34012a;
        if (C4) {
            org.telegram.ui.ActionBar.u6.s(qh0Var, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        qh0Var.setAutoRepeat(true);
        qh0Var.g(36, 36, document);
        ccVar.f34013b.setText(str);
        ccVar.f34014c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(ccVar, i7);
    }

    public final fc t(CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        nb nbVar = new nb(X(), i6Var);
        nbVar.d(2131623982, new String[0]);
        nbVar.f37752b.setText(charSequence);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setMaxLines(2);
        return b(nbVar, 1500);
    }

    public final fc u(String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        cc ccVar = new cc(X(), i6Var);
        ccVar.c(2131623982, 32, 32, new String[0]);
        ccVar.f34013b.setText(str);
        ccVar.f34014c.setText(str2);
        return b(ccVar, 1500);
    }

    public final fc w(int i7, CharSequence charSequence) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        nb nbVar = new nb(X, i6Var);
        nbVar.setBackground(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, i6Var), 12);
        nbVar.f37751a.setImageResource(i7);
        nbVar.f37752b.setText(charSequence);
        nbVar.f37752b.setSingleLine(false);
        nbVar.f37752b.setLines(2);
        nbVar.f37752b.setMaxLines(4);
        TextView textView = nbVar.f37752b;
        textView.setMaxWidth(hi.u3.a(textView.getText(), nbVar.f37752b.getPaint()));
        nbVar.f37752b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) nbVar.f37752b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        nbVar.setWrapWidth();
        return b(nbVar, 5000);
    }

    public final fc y(int i7, TLRPC.Document document, jg.q qVar) {
        String N0;
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f36700c;
        nb nbVar = new nb(X, i6Var);
        nbVar.c(2131624286, 36, 36, new String[0]);
        nbVar.removeView(nbVar.f37752b);
        w5 w5Var = new w5(nbVar.getContext());
        nbVar.f37752b = w5Var;
        w5Var.setTypeface(Typeface.SANS_SERIF);
        nbVar.f37752b.setTextSize(1, 15.0f);
        nbVar.f37752b.setEllipsize(TextUtils.TruncateAt.END);
        nbVar.f37752b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new x5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = nbVar.f37752b;
        if (i7 > 1) {
            N0 = org.telegram.messenger.gd.G(i7, "SavedTagMessagesTagged", new Object[0]);
        } else {
            N0 = org.telegram.messenger.gd.N0(2131745682, null);
        }
        textView.setText(new SpannableStringBuilder(N0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (qVar != null) {
            dc dcVar = new dc(X(), i6Var, true);
            dcVar.e(org.telegram.messenger.gd.N0(2131743313, null));
            dcVar.f34267b = qVar;
            nbVar.setButton(dcVar);
        }
        nbVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, i6Var));
        nbVar.addView(nbVar.f37752b, c8.na.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(nbVar, 2750);
    }

    public kc(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f36699b = frameLayout;
        this.f36698a = null;
        this.f36700c = i6Var;
    }
}

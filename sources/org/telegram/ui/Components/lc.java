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
public final class lc {
    public final org.telegram.ui.ActionBar.g2 f37161a;
    public final FrameLayout f37162b;
    public final org.telegram.ui.ActionBar.h6 f37163c;

    public lc(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var != null && g2Var.getLastStoryViewer() != null && g2Var.getLastStoryViewer().y()) {
            this.f37161a = null;
            fi.z3 currentPeerView = g2Var.getLastStoryViewer().f12027o0.getCurrentPeerView();
            this.f37162b = currentPeerView != null ? currentPeerView.M0 : null;
            this.f37163c = g2Var.getLastStoryViewer().E;
            return;
        }
        this.f37161a = g2Var;
        this.f37162b = null;
        this.f37163c = g2Var != null ? g2Var.getResourceProvider() : null;
    }

    public static gc A(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 4;
        }
        return z(g2Var, i7, 0, h6Var);
    }

    public static gc B(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, ai.b1 b1Var, org.telegram.ui.he heVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        String str;
        int i10;
        int i11;
        ob obVar = new ob(g2Var.getParentActivity(), h6Var);
        if (z10) {
            i7 = 2131624055;
        } else {
            i7 = 2131624061;
        }
        obVar.c(i7, 28, 28, "Pin", "Line");
        TextView textView = obVar.f38158b;
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
        textView.setText(org.telegram.messenger.hd.N0(i10, str));
        if (!z10) {
            ec ecVar = new ec(g2Var.getParentActivity(), h6Var, true);
            ecVar.f34725b = b1Var;
            ecVar.f34726c = heVar;
            obVar.setButton(ecVar);
        }
        if (z10) {
            i11 = 1500;
        } else {
            i11 = 5000;
        }
        return gc.g(g2Var, obVar, i11);
    }

    public static gc C(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        ob obVar = new ob(g2Var.getParentActivity(), g2Var.getResourceProvider());
        obVar.d(2131624049, "Shield");
        org.telegram.messenger.f3.q("UserSetAsAdminHint", null, 2131743435, new Object[]{str}, obVar.f38158b);
        return gc.g(g2Var, obVar, 1500);
    }

    public static gc D(org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User user, String str) {
        String str2;
        ob obVar = new ob(g2Var.getParentActivity(), g2Var.getResourceProvider());
        obVar.d(2131624050, "Hand");
        if (user.deleted) {
            str2 = org.telegram.messenger.hd.a0("HiddenName", null, 2131749135, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        org.telegram.messenger.f3.q("UserRemovedFromChatHint", null, 2131743486, new Object[]{str2, str}, obVar.f38158b);
        return gc.g(g2Var, obVar, 1500);
    }

    public static gc F(FrameLayout frameLayout, boolean z10) {
        kc kcVar;
        lc lcVar = new lc(frameLayout, null);
        if (z10) {
            kcVar = kc.h;
        } else {
            kcVar = kc.f36875e;
        }
        return lcVar.m(kcVar, 1, -115203550, -1, null);
    }

    public static gc S(int i7, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        String N0;
        ob obVar = new ob(g2Var.getParentActivity(), h6Var);
        boolean z10 = true;
        if (i7 != 0) {
            if (i7 == 1) {
                N0 = org.telegram.messenger.hd.N0(2131745080, null);
                z10 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            N0 = org.telegram.messenger.hd.N0(2131745078, null);
        }
        if (z10) {
            obVar.d(2131624203, new String[0]);
        } else {
            obVar.d(2131624202, new String[0]);
        }
        obVar.f38158b.setText(N0);
        return gc.g(g2Var, obVar, 1500);
    }

    public static String W(String str) {
        if ("STARGIFT_ALREADY_TRANSFERRED".equals(str)) {
            return org.telegram.messenger.hd.N0(2131749735, null);
        }
        return org.telegram.messenger.hd.a0(null, null, 2131743633, str);
    }

    public static lc Y() {
        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
        if (T == null) {
            return new lc(cb.a(org.telegram.messenger.t0.f26931b), null);
        }
        Dialog dialog = T.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.w2) {
            return new lc(((org.telegram.ui.ActionBar.w2) dialog).f30179c, T.getResourceProvider());
        }
        return b0(T);
    }

    public static boolean a(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var != null && g2Var.getParentActivity() != null && g2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static lc a0(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        return new lc(frameLayout, h6Var);
    }

    public static lc b0(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var == null) {
            return Y();
        }
        return new lc(g2Var);
    }

    public static void c0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        Y().t(W(str), null).j();
    }

    public static gc d(org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        String N0;
        ob obVar = new ob(g2Var.getParentActivity(), g2Var.getResourceProvider());
        if (z10) {
            obVar.d(2131624050, "Hand");
            N0 = org.telegram.messenger.hd.N0(2131743516, null);
        } else {
            obVar.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            N0 = org.telegram.messenger.hd.N0(2131743430, null);
        }
        obVar.f38158b.setText(org.telegram.messenger.g0.W2(N0));
        return gc.g(g2Var, obVar, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            c0(str);
            return;
        }
        gc t6 = new lc(frameLayout, h6Var).t(W(str), null);
        t6.f35535r = false;
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

    public static gc j(org.telegram.ui.ActionBar.g2 g2Var) {
        return b0(g2Var).k(false);
    }

    public static gc l(String str, org.telegram.ui.ActionBar.g2 g2Var, boolean z10) {
        int i7;
        String N0;
        int i10;
        int i11;
        ob obVar = new ob(g2Var.getParentActivity(), g2Var.getResourceProvider());
        if (str != null) {
            if (z10) {
                i11 = 2131751400;
            } else {
                i11 = 2131751398;
            }
            N0 = org.telegram.messenger.hd.a0(null, null, i11, str);
        } else {
            if (z10) {
                i7 = 2131751401;
            } else {
                i7 = 2131751399;
            }
            N0 = org.telegram.messenger.hd.N0(i7, null);
        }
        obVar.f38158b.setText(org.telegram.messenger.g0.W2(N0));
        if (!z10 && str == null) {
            i10 = 2131623990;
        } else {
            i10 = 2131624007;
        }
        obVar.d(i10, new String[0]);
        return gc.g(g2Var, obVar, 5000);
    }

    public static gc v(Context context, org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z10, bi.q2 q2Var) {
        ob obVar;
        org.telegram.ui.ActionBar.h6 h6Var;
        boolean z11;
        org.telegram.ui.eh ehVar;
        int i14;
        SpannableStringBuilder W2;
        gc g10;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i15;
        int i16;
        org.telegram.messenger.j2 j2Var;
        if (org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q() && g2Var != null && i7 <= 1 && j3 == org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).f24987n && !z10) {
            obVar = new rb(i10, g2Var);
        } else {
            if (g2Var != null) {
                h6Var = g2Var.getResourceProvider();
            } else {
                h6Var = null;
            }
            obVar = new ob(i11, i12, context, h6Var);
        }
        ob obVar2 = obVar;
        if (q2Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (q2Var != null) {
            ehVar = new org.telegram.ui.eh(21, zArr, q2Var);
        } else {
            ehVar = null;
        }
        if (i7 <= 1) {
            if (j3 == org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).f24987n) {
                if (i10 <= 1) {
                    String N0 = org.telegram.messenger.hd.N0(2131750481, null);
                    if (z10) {
                        j2Var = new org.telegram.messenger.j2(29);
                    } else {
                        j2Var = new org.telegram.messenger.j2(27);
                    }
                    W2 = org.telegram.messenger.g0.R2(N0, -1, 2, j2Var, null);
                } else {
                    W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131750474, null), -1, 2, new org.telegram.messenger.j2(27), null);
                }
                obVar2.c(2131624191, 30, 30, new String[0]);
                i14 = 2;
            } else {
                i14 = 2;
                bi.q2 q2Var2 = new bi.q2(ehVar, g2Var, j3, 20);
                if (org.telegram.messenger.n5.z(j3)) {
                    TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).O0(Long.valueOf(-j3));
                    if (i10 <= 1) {
                        if (g2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.hd.a0(null, null, 2131750485, O0.title), -1, 2, q2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131750485, O0.title));
                        }
                    } else if (g2Var != null) {
                        W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.hd.a0(null, null, 2131750478, O0.title), -1, 2, q2Var2, null);
                    } else {
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, 2131750478, O0.title));
                    }
                } else {
                    TLRPC.User c22 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).c2(Long.valueOf(j3));
                    if (i10 <= 1) {
                        if (z11) {
                            i16 = 2131750479;
                        } else {
                            i16 = 2131750480;
                        }
                        if (g2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.hd.a0(null, null, i16, org.telegram.messenger.p10.k(c22, true)), -1, 2, q2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, i16, org.telegram.messenger.p10.k(c22, true)));
                        }
                    } else {
                        if (z11) {
                            i15 = 2131750472;
                        } else {
                            i15 = 2131750473;
                        }
                        if (g2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.hd.a0(null, null, i15, org.telegram.messenger.p10.k(c22, true)), -1, 2, q2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, i15, org.telegram.messenger.p10.k(c22, true)));
                        }
                    }
                }
                obVar2.c(2131624029, 30, 30, new String[0]);
            }
        } else {
            i14 = 2;
            if (i10 <= 1) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i7, "FwdMessageToManyChats", new Object[0]));
            } else {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i7, "FwdMessagesToManyChats", new Object[0]));
            }
            obVar2.c(2131624029, 30, 30, new String[0]);
        }
        obVar2.f38158b.setText(W2);
        if (z11) {
            Context context2 = obVar2.getContext();
            if (g2Var != null) {
                h6Var2 = g2Var.getResourceProvider();
            } else {
                h6Var2 = null;
            }
            ec ecVar = new ec(context2, h6Var2, true, true);
            ecVar.f34725b = null;
            ecVar.f34726c = ehVar;
            obVar2.setButton(ecVar);
        }
        obVar2.postDelayed(new hc(obVar2, 1), 300);
        if (frameLayout != null) {
            g10 = gc.f(frameLayout, obVar2, i13);
        } else if (g2Var != null) {
            g10 = gc.g(g2Var, obVar2, i13);
        } else {
            throw new IllegalArgumentException();
        }
        if (obVar2 instanceof rb) {
            obVar2.f38158b.setSingleLine(false);
            obVar2.f38158b.setMaxLines(i14);
            ((rb) obVar2).setBulletin(g10);
            g10.f35535r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.gc x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.gc");
    }

    public static org.telegram.ui.Components.gc z(org.telegram.ui.ActionBar.g2 r6, int r7, int r8, org.telegram.ui.ActionBar.h6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lc.z(org.telegram.ui.ActionBar.g2, int, int, org.telegram.ui.ActionBar.h6):org.telegram.ui.Components.gc");
    }

    public final gc E(org.telegram.ui.ActionBar.h6 h6Var) {
        ob obVar = new ob(X(), h6Var);
        obVar.d(2131623982, new String[0]);
        obVar.f38158b.setText(org.telegram.messenger.hd.N0(2131746026, null));
        return b(obVar, 1500);
    }

    public final gc G(int i7, int i10, CharSequence charSequence) {
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        ob obVar = new ob(X(), this.f37163c);
        obVar.c(i7, 36, 36, new String[0]);
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
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(i10);
        obVar.f38158b.setText(charSequence);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(obVar, i11);
    }

    public final gc H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final gc I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        int i10;
        dc dcVar = new dc(X(), this.f37163c);
        dcVar.c(i7, 36, 36, new String[0]);
        dcVar.f34467b.setText(charSequence);
        dcVar.f34468c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(dcVar, i10);
    }

    public final gc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        ob obVar = new ob(X, h6Var);
        if (i7 != 0) {
            obVar.c(i7, 36, 36, new String[0]);
        } else {
            obVar.f38157a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) obVar.f38158b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        obVar.f38158b.setTextSize(1, 14.0f);
        obVar.f38158b.setTextDirection(5);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(3);
        obVar.f38158b.setText(charSequence);
        ec ecVar = new ec(X(), h6Var, true, z10);
        ecVar.e(charSequence2);
        ecVar.f34725b = runnable;
        obVar.setButton(ecVar);
        return b(obVar, i10);
    }

    public final gc K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        int i10;
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return J(i7, charSequence, str, i10, false, runnable);
    }

    public final gc L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        dc dcVar = new dc(X, h6Var);
        dcVar.c(i7, 36, 36, new String[0]);
        dcVar.f34467b.setText(str);
        dcVar.f34468c.setText(charSequence);
        ec ecVar = new ec(X(), h6Var, true);
        ecVar.e(str2);
        ecVar.f34725b = runnable;
        dcVar.setButton(ecVar);
        return b(dcVar, 5000);
    }

    public final gc M(Drawable drawable, CharSequence charSequence) {
        ob obVar = new ob(X(), this.f37163c);
        obVar.f38157a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.gm0) {
            ((org.telegram.ui.gm0) drawable).e(obVar.f38157a);
        }
        obVar.f38158b.setText(charSequence);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(2);
        return b(obVar, 2750);
    }

    public final gc N(String str, String str2) {
        dc dcVar = new dc(X(), this.f37163c);
        dcVar.f34466a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        dcVar.f34467b.setText(str);
        dcVar.f34468c.setText(str2);
        return b(dcVar, 5000);
    }

    public final gc O(TLRPC.Document document, String str, String str2) {
        int i7;
        if (document == null) {
            return new gc();
        }
        cc ccVar = new cc(X(), this.f37163c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.gc c10 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.gc c11 = org.telegram.messenger.gc.c(w10, document);
        q9 q9Var = ccVar.f34170a;
        q9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ccVar.f34171b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = ccVar.f34172c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(ccVar, i7);
    }

    public final gc P(int i7, CharSequence charSequence) {
        int i10;
        ob obVar = new ob(X(), this.f37163c);
        obVar.c(i7, 36, 36, new String[0]);
        obVar.f38158b.setText(charSequence);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setTextSize(1, 14.0f);
        obVar.f38158b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(obVar, i10);
    }

    public final gc Q(int i7, int i10, CharSequence charSequence) {
        int i11;
        ob obVar = new ob(X(), this.f37163c);
        obVar.c(i7, i10, i10, new String[0]);
        obVar.f38158b.setText(charSequence);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(obVar, i11);
    }

    public final gc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i7;
        if (document == null) {
            return new gc();
        }
        cc ccVar = new cc(X(), this.f37163c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.gc c10 = org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.gc c11 = org.telegram.messenger.gc.c(w10, document);
        q9 q9Var = ccVar.f34170a;
        q9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ccVar.f34171b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ccVar.f34172c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(ccVar, i7);
    }

    public final gc T(String str) {
        ob obVar = new ob(X(), null);
        obVar.d(2131623990, new String[0]);
        obVar.f38158b.setText(str);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        dc dcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        if (!isEmpty) {
            dc dcVar2 = new dc(X(), h6Var);
            dcVar2.f34467b.setText(str);
            dcVar2.f34468c.setText((CharSequence) null);
            dcVar = dcVar2;
        } else {
            ob obVar = new ob(X(), h6Var);
            obVar.f38158b.setText(str);
            obVar.f38158b.setSingleLine(false);
            obVar.f38158b.setMaxLines(2);
            dcVar = obVar;
        }
        dcVar.setTimer();
        ec ecVar = new ec(X(), h6Var, true, z10);
        ecVar.e(org.telegram.messenger.hd.N0(2131743640, null));
        ecVar.f34725b = runnable;
        ecVar.f34726c = runnable2;
        dcVar.setButton(ecVar);
        return b(dcVar, 5000);
    }

    public final gc V(List list, CharSequence charSequence, CharSequence charSequence2, k8.a aVar) {
        boolean z10;
        float f10;
        int i7;
        Context X = X();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        fc fcVar = new fc(X, h6Var, z10);
        e9 e9Var = fcVar.f35200a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    e9Var.setCount(i12);
                    e9Var.b(i7, org.telegram.messenger.k10.f24968t0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                e9Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                e9Var.setScaleX(1.2f);
                e9Var.setScaleY(1.2f);
            } else {
                e9Var.setScaleX(1.0f);
                e9Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        e9Var.a(false);
        m80 m80Var = fcVar.f35201b;
        if (charSequence2 != null) {
            m80Var.setSingleLine(true);
            m80Var.setMaxLines(1);
            m80Var.setText(charSequence);
            m80 m80Var2 = fcVar.f35202c;
            m80Var2.setText(charSequence2);
            m80Var2.setSingleLine(false);
            m80Var2.setMaxLines(3);
            LinearLayout linearLayout = fcVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.hd.f24444a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            m80Var.setSingleLine(false);
            m80Var.setMaxLines(4);
            m80Var.setText(charSequence);
            if (m80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    m80Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.hd.f24444a0) {
                    ((ViewGroup.MarginLayoutParams) m80Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) m80Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (aVar != null) {
            ec ecVar = new ec(X(), h6Var, true);
            ecVar.e(org.telegram.messenger.hd.N0(2131743640, null));
            ecVar.f34725b = (Runnable) aVar.f18214b;
            ecVar.f34726c = (Runnable) aVar.f18215c;
            fcVar.setButton(ecVar);
        }
        return b(fcVar, 5000);
    }

    public final Context X() {
        Context context;
        org.telegram.ui.ActionBar.g2 g2Var = this.f37161a;
        if (g2Var != null) {
            context = g2Var.getParentActivity();
            if (context == null && this.f37161a.getLayoutContainer() != null) {
                context = this.f37161a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f37162b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return org.telegram.messenger.t0.f26931b;
        }
        return context;
    }

    public final gc Z(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new gc();
        }
        if (tL_error == null) {
            return t(org.telegram.messenger.hd.a0(null, null, 2131743634, new Object[0]), null);
        }
        return t(W(tL_error.text), null);
    }

    public final gc b(eb ebVar, int i7) {
        org.telegram.ui.ActionBar.g2 g2Var = this.f37161a;
        if (g2Var != null) {
            return gc.g(g2Var, ebVar, i7);
        }
        return gc.f(this.f37162b, ebVar, i7);
    }

    public final gc c(CharSequence charSequence) {
        if (X() == null) {
            return new gc();
        }
        ob obVar = new ob(X(), this.f37163c);
        obVar.d(2131624049, "Shield");
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(3);
        obVar.f38158b.setText(charSequence);
        return b(obVar, 2750);
    }

    public final gc e(boolean z10) {
        String N0;
        ob obVar = new ob(X(), this.f37163c);
        if (z10) {
            obVar.d(2131624050, "Hand");
            N0 = org.telegram.messenger.hd.N0(2131743516, null);
        } else {
            obVar.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            N0 = org.telegram.messenger.hd.N0(2131743430, null);
        }
        obVar.f38158b.setText(org.telegram.messenger.g0.W2(N0));
        return b(obVar, 1500);
    }

    public final gc f(int i7, Runnable runnable) {
        ob obVar = new ob(X(), null);
        obVar.d(2131623970, new String[0]);
        String G = org.telegram.messenger.hd.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.W2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        obVar.f38158b.setText(valueOf);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(3);
        return b(obVar, 5000);
    }

    public final void f0(String str, boolean z10) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            gc t6 = t(org.telegram.messenger.hd.a0(null, null, 2131743634, new Object[0]), null);
            t6.f35535r = false;
            t6.k(z10);
            return;
        }
        gc t10 = t(W(str), null);
        t10.f35535r = false;
        t10.k(z10);
    }

    public final gc g(String str, ArrayList arrayList) {
        fc fcVar = new fc(X(), this.f37163c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                fcVar.f35200a.setCount(i11);
                fcVar.f35200a.b(i7, org.telegram.messenger.k10.f24968t0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            fcVar.f35200a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            fcVar.f35200a.setScaleX(1.2f);
            fcVar.f35200a.setScaleY(1.2f);
        } else {
            fcVar.f35200a.setScaleX(1.0f);
            fcVar.f35200a.setScaleY(1.0f);
        }
        fcVar.f35200a.a(false);
        fcVar.f35201b.setSingleLine(false);
        fcVar.f35201b.setMaxLines(2);
        fcVar.f35201b.setText(str);
        if (fcVar.f35201b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.hd.f24444a0) {
                ((ViewGroup.MarginLayoutParams) fcVar.f35201b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) fcVar.f35201b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.hd.f24444a0) {
            fcVar.f35200a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(fcVar, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                gc t6 = t(org.telegram.messenger.hd.a0(null, null, 2131743634, new Object[0]), null);
                t6.f35535r = false;
                t6.k(z10);
            } else if (tL_error.code != 406) {
                gc t10 = t(W(tL_error.text), null);
                t10.f35535r = false;
                t10.k(z10);
            }
        }
    }

    public final gc h(TLRPC.Document document, int i7, final org.telegram.messenger.y10 y10Var) {
        SpannableStringBuilder spannableStringBuilder;
        r80 r80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder W2;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.gj.i1(document);
        if (i12 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).o0(i12, true);
        if (o02 != null && (stickerSet = o02.set) != null) {
            if (i7 == 1) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131743779, stickerSet.title));
            } else if (i7 == 2) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744456, stickerSet.title));
            } else {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748403, stickerSet.title));
            }
            return r(document, W2, org.telegram.messenger.hd.N0(2131743318, null), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            y10Var.a(i12);
                            return;
                        default:
                            y10Var.a(i12);
                            return;
                    }
                }
            });
        }
        if (i7 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131743779, "<{LOADING}>")));
        } else if (i7 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744456, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748403, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        if (indexOf >= 0) {
            r80Var = new r80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), h6Var);
            spannableStringBuilder.setSpan(r80Var, indexOf, indexOf + 11, 33);
            int i10 = org.telegram.ui.ActionBar.m6.yj;
            r80Var.a(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 32), i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 72));
        } else {
            r80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String N0 = org.telegram.messenger.hd.N0(2131743318, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        y10Var.a(i12);
                        return;
                    default:
                        y10Var.a(i12);
                        return;
                }
            }
        };
        Context X = X();
        ?? obVar = new ob(X, h6Var);
        m80 m80Var = new m80(X, null);
        obVar.d = m80Var;
        m80Var.setDisablePaddingsOffset(true);
        m80Var.setSingleLine();
        m80Var.setTypeface(Typeface.SANS_SERIF);
        m80Var.setTextSize(1, 15.0f);
        m80Var.setEllipsize(TextUtils.TruncateAt.END);
        m80Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        obVar.f38158b.setVisibility(8);
        obVar.addView(m80Var, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.m6.yj;
        obVar.setTextColor(obVar.getThemedColor(i11));
        if (org.telegram.messenger.gj.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.t6.s(obVar.f38157a, i11, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        obVar.e(document, new String[0]);
        obVar.f38158b.setTextSize(1, 14.0f);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(3);
        m80Var.setText(spannableStringBuilder);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setSingleLine(false);
        m80Var.setMaxLines(3);
        ec ecVar = new ec(X(), h6Var, true);
        ecVar.e(N0);
        ecVar.f34725b = runnable;
        obVar.setButton(ecVar);
        gc b10 = b(obVar, 2750);
        if (r80Var != null) {
            lb lbVar = b10.f35523e;
            if (lbVar instanceof nb) {
                r80Var.f39116b = ((nb) lbVar).d;
            }
        }
        org.telegram.messenger.si.d0(org.telegram.messenger.k10.f24968t0).n0(inputStickerSet, null, false, false, new bi.a5(i7, b10, currentTimeMillis));
        return b10;
    }

    public final boolean h0(int i7, long j3) {
        org.telegram.ui.ActionBar.g2 g2Var;
        SpannableStringBuilder R2;
        if (org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).q() && (g2Var = this.f37161a) != null) {
            rb rbVar = new rb(i7, g2Var);
            if (j3 == org.telegram.messenger.k10.i(org.telegram.messenger.k10.f24968t0).f24987n) {
                if (i7 <= 1) {
                    R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131750481, null), -1, 2, new org.telegram.messenger.j2(27), null);
                } else {
                    R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131750474, null), -1, 2, new org.telegram.messenger.j2(27), null);
                }
                rbVar.c(2131624191, 36, 36, new String[0]);
                rbVar.f38158b.setText(R2);
                rbVar.f38158b.setSingleLine(false);
                rbVar.f38158b.setMaxLines(2);
                gc b10 = b(rbVar, 3500);
                rbVar.setBulletin(b10);
                b10.f35535r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final gc i(String str) {
        if (!org.telegram.messenger.g0.G3()) {
            return new gc();
        }
        ob obVar = new ob(X(), null);
        obVar.c(2131623994, 36, 36, "NULL ROTATION", "Back", "Front");
        obVar.f38158b.setText(str);
        return b(obVar, 1500);
    }

    public final gc k(boolean z10) {
        if (!org.telegram.messenger.g0.G3()) {
            return new gc();
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        if (z10) {
            dc dcVar = new dc(X(), h6Var);
            dcVar.c(2131624346, 36, 36, "Wibe", "Circle");
            dcVar.f34467b.setText(org.telegram.messenger.hd.N0(2131748728, null));
            dcVar.f34468c.setText(org.telegram.messenger.hd.N0(2131748726, null));
            return b(dcVar, 2750);
        }
        ob obVar = new ob(X(), h6Var);
        obVar.c(2131624346, 36, 36, "Wibe", "Circle");
        obVar.f38158b.setText(org.telegram.messenger.hd.N0(2131748728, null));
        return b(obVar, 1500);
    }

    public final gc m(kc kcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.h6 h6Var) {
        ob obVar;
        String N0;
        jc jcVar = kcVar.d;
        if (i10 != 0 && i11 != 0) {
            obVar = new ob(i10, i11, X(), h6Var);
        } else {
            obVar = new ob(X(), h6Var);
        }
        obVar.d(jcVar.f36464a, jcVar.f36465b);
        TextView textView = obVar.f38158b;
        String str = kcVar.f36883a;
        if (kcVar.f36885c) {
            N0 = org.telegram.messenger.hd.G(i7, str, new Object[0]);
        } else {
            N0 = org.telegram.messenger.hd.N0(kcVar.f36884b, str);
        }
        textView.setText(org.telegram.messenger.g0.T2(N0, new org.telegram.messenger.j2(28)));
        int i12 = jcVar.f36466c;
        if (i12 != 0) {
            obVar.setIconPaddingBottom(i12);
        }
        return b(obVar, 1500);
    }

    public final gc n(kc kcVar, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return m(kcVar, i7, 0, 0, h6Var);
    }

    public final gc o(kc kcVar, org.telegram.ui.ActionBar.h6 h6Var) {
        return m(kcVar, 1, 0, 0, h6Var);
    }

    public final gc p(long j3, String str, String str2) {
        Context X = X();
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        bc bcVar = new bc(X, h6Var);
        p5 p5Var = new p5(1, org.telegram.messenger.k10.f24968t0, j3);
        q9 q9Var = bcVar.f33822a;
        q9Var.setAnimatedEmojiDrawable(p5Var);
        q9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var), PorterDuff.Mode.SRC_IN));
        bcVar.f33823b.setText(str);
        bcVar.f33824c.setText(str2);
        return b(bcVar, 2750);
    }

    public final gc q(TLRPC.Document document, CharSequence charSequence) {
        ob obVar = new ob(X(), this.f37163c);
        if (org.telegram.messenger.gj.C4(document)) {
            org.telegram.ui.ActionBar.t6.s(obVar.f38157a, org.telegram.ui.ActionBar.m6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        obVar.e(document, new String[0]);
        obVar.f38158b.setText(charSequence);
        obVar.f38158b.setTextSize(1, 14.0f);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(3);
        return b(obVar, 2750);
    }

    public final gc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        ob obVar = new ob(X, h6Var);
        if (org.telegram.messenger.gj.C4(document)) {
            org.telegram.ui.ActionBar.t6.s(obVar.f38157a, org.telegram.ui.ActionBar.m6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        obVar.e(document, new String[0]);
        if (obVar.f38157a.getImageReceiver() != null) {
            obVar.f38157a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        obVar.f38158b.setText(charSequence);
        obVar.f38158b.setTextSize(1, 14.0f);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(3);
        ec ecVar = new ec(X(), h6Var, true);
        ecVar.e(str);
        ecVar.f34725b = runnable;
        obVar.setButton(ecVar);
        return b(obVar, 2750);
    }

    public final gc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i7;
        dc dcVar = new dc(X(), this.f37163c);
        boolean C4 = org.telegram.messenger.gj.C4(document);
        rh0 rh0Var = dcVar.f34466a;
        if (C4) {
            org.telegram.ui.ActionBar.t6.s(rh0Var, org.telegram.ui.ActionBar.m6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        rh0Var.setAutoRepeat(true);
        rh0Var.g(36, 36, document);
        dcVar.f34467b.setText(str);
        dcVar.f34468c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(dcVar, i7);
    }

    public final gc t(CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        ob obVar = new ob(X(), h6Var);
        obVar.d(2131623982, new String[0]);
        obVar.f38158b.setText(charSequence);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc u(String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        dc dcVar = new dc(X(), h6Var);
        dcVar.c(2131623982, 32, 32, new String[0]);
        dcVar.f34467b.setText(str);
        dcVar.f34468c.setText(str2);
        return b(dcVar, 1500);
    }

    public final gc w(int i7, CharSequence charSequence) {
        Context X = X();
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        ob obVar = new ob(X, h6Var);
        obVar.setBackground(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.wj, h6Var), 12);
        obVar.f38157a.setImageResource(i7);
        obVar.f38158b.setText(charSequence);
        obVar.f38158b.setSingleLine(false);
        obVar.f38158b.setLines(2);
        obVar.f38158b.setMaxLines(4);
        TextView textView = obVar.f38158b;
        textView.setMaxWidth(hi.l3.a(textView.getText(), obVar.f38158b.getPaint()));
        obVar.f38158b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) obVar.f38158b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        obVar.setWrapWidth();
        return b(obVar, 5000);
    }

    public final gc y(int i7, TLRPC.Document document, jg.q qVar) {
        String N0;
        Context X = X();
        org.telegram.ui.ActionBar.h6 h6Var = this.f37163c;
        ob obVar = new ob(X, h6Var);
        obVar.c(2131624286, 36, 36, new String[0]);
        obVar.removeView(obVar.f38158b);
        x5 x5Var = new x5(obVar.getContext());
        obVar.f38158b = x5Var;
        x5Var.setTypeface(Typeface.SANS_SERIF);
        obVar.f38158b.setTextSize(1, 15.0f);
        obVar.f38158b.setEllipsize(TextUtils.TruncateAt.END);
        obVar.f38158b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new y5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = obVar.f38158b;
        if (i7 > 1) {
            N0 = org.telegram.messenger.hd.G(i7, "SavedTagMessagesTagged", new Object[0]);
        } else {
            N0 = org.telegram.messenger.hd.N0(2131745682, null);
        }
        textView.setText(new SpannableStringBuilder(N0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (qVar != null) {
            ec ecVar = new ec(X(), h6Var, true);
            ecVar.e(org.telegram.messenger.hd.N0(2131743318, null));
            ecVar.f34725b = qVar;
            obVar.setButton(ecVar);
        }
        obVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yj, h6Var));
        obVar.addView(obVar.f38158b, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(obVar, 2750);
    }

    public lc(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f37162b = frameLayout;
        this.f37161a = null;
        this.f37163c = h6Var;
    }
}

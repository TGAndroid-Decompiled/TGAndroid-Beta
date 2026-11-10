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
public final class gc {
    public final org.telegram.ui.ActionBar.f2 f33871a;
    public final FrameLayout f33872b;
    public final org.telegram.ui.ActionBar.h6 f33873c;

    public gc(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var != null && f2Var.getLastStoryViewer() != null && f2Var.getLastStoryViewer().y()) {
            this.f33871a = null;
            di.j4 currentPeerView = f2Var.getLastStoryViewer().f9629n0.getCurrentPeerView();
            this.f33872b = currentPeerView != null ? currentPeerView.L0 : null;
            this.f33873c = f2Var.getLastStoryViewer().D;
            return;
        }
        this.f33871a = f2Var;
        this.f33872b = null;
        this.f33873c = f2Var != null ? f2Var.getResourceProvider() : null;
    }

    public static bc A(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        if (z9) {
            i7 = 3;
        } else {
            i7 = 4;
        }
        return z(f2Var, i7, 0, h6Var);
    }

    public static bc B(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, ai.a1 a1Var, org.telegram.ui.ie ieVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int i7;
        String str;
        int i10;
        int i11;
        jb jbVar = new jb(f2Var.getParentActivity(), h6Var);
        if (z9) {
            i7 = 2131624054;
        } else {
            i7 = 2131624060;
        }
        jbVar.c(i7, 28, 28, "Pin", "Line");
        TextView textView = jbVar.f34883b;
        if (z9) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z9) {
            i10 = 2131748544;
        } else {
            i10 = 2131748466;
        }
        textView.setText(org.telegram.messenger.id.M0(i10, str));
        if (!z9) {
            zb zbVar = new zb(f2Var.getParentActivity(), h6Var, true);
            zbVar.f40908b = a1Var;
            zbVar.f40909c = ieVar;
            jbVar.setButton(zbVar);
        }
        if (z9) {
            i11 = 1500;
        } else {
            i11 = 5000;
        }
        return bc.g(f2Var, jbVar, i11);
    }

    public static bc C(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        jb jbVar = new jb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        jbVar.d(2131624048, "Shield");
        org.telegram.messenger.k5.r("UserSetAsAdminHint", null, 2131743680, new Object[]{str}, jbVar.f34883b);
        return bc.g(f2Var, jbVar, 1500);
    }

    public static bc D(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        String str2;
        jb jbVar = new jb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        jbVar.d(2131624049, "Hand");
        if (user.deleted) {
            str2 = org.telegram.messenger.id.a0("HiddenName", null, 2131749328, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        org.telegram.messenger.k5.r("UserRemovedFromChatHint", null, 2131743731, new Object[]{str2, str}, jbVar.f34883b);
        return bc.g(f2Var, jbVar, 1500);
    }

    public static bc F(FrameLayout frameLayout, boolean z9) {
        fc fcVar;
        gc gcVar = new gc(frameLayout, null);
        if (z9) {
            fcVar = fc.h;
        } else {
            fcVar = fc.f33512e;
        }
        return gcVar.m(fcVar, 1, -115203550, -1, null);
    }

    public static bc S(int i7, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        String M0;
        jb jbVar = new jb(f2Var.getParentActivity(), h6Var);
        boolean z9 = true;
        if (i7 != 0) {
            if (i7 == 1) {
                M0 = org.telegram.messenger.id.M0(2131745276, null);
                z9 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            M0 = org.telegram.messenger.id.M0(2131745274, null);
        }
        if (z9) {
            jbVar.d(2131624202, new String[0]);
        } else {
            jbVar.d(2131624201, new String[0]);
        }
        jbVar.f34883b.setText(M0);
        return bc.g(f2Var, jbVar, 1500);
    }

    public static gc X() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return new gc(wa.a(org.telegram.messenger.t0.f25570b), null);
        }
        Dialog dialog = T.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.w2) {
            return new gc(((org.telegram.ui.ActionBar.w2) dialog).f28675c, T.getResourceProvider());
        }
        return a0(T);
    }

    public static gc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        return new gc(frameLayout, h6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var != null && f2Var.getParentActivity() != null && f2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static gc a0(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var == null) {
            return X();
        }
        return new gc(f2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.D1) {
            return;
        }
        X().t(org.telegram.messenger.id.a0(null, null, 2131743878, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        if (!LaunchActivity.D1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        bc t6 = new gc(frameLayout, h6Var).t(org.telegram.messenger.id.a0(null, null, 2131743878, str), null);
        t6.f32211r = false;
        t6.j();
    }

    public static bc d(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        String M0;
        jb jbVar = new jb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        if (z9) {
            jbVar.d(2131624049, "Hand");
            M0 = org.telegram.messenger.id.M0(2131743761, null);
        } else {
            jbVar.d(2131624058, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.id.M0(2131743675, null);
        }
        jbVar.f34883b.setText(org.telegram.messenger.g0.X2(M0));
        return bc.g(f2Var, jbVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.D1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null).j();
        }
    }

    public static bc j(org.telegram.ui.ActionBar.f2 f2Var) {
        return a0(f2Var).k(false);
    }

    public static bc l(String str, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        int i7;
        String M0;
        int i10;
        int i11;
        jb jbVar = new jb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        if (str != null) {
            if (z9) {
                i11 = 2131751412;
            } else {
                i11 = 2131751410;
            }
            M0 = org.telegram.messenger.id.a0(null, null, i11, str);
        } else {
            if (z9) {
                i7 = 2131751413;
            } else {
                i7 = 2131751411;
            }
            M0 = org.telegram.messenger.id.M0(i7, null);
        }
        jbVar.f34883b.setText(org.telegram.messenger.g0.X2(M0));
        if (!z9 && str == null) {
            i10 = 2131623989;
        } else {
            i10 = 2131624006;
        }
        jbVar.d(i10, new String[0]);
        return bc.g(f2Var, jbVar, 5000);
    }

    public static bc v(Context context, org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z9, bi.d3 d3Var) {
        jb jbVar;
        org.telegram.ui.ActionBar.h6 h6Var;
        boolean z10;
        org.telegram.ui.fq fqVar;
        int i14;
        SpannableStringBuilder X2;
        bc g10;
        org.telegram.ui.ActionBar.h6 h6Var2;
        int i15;
        int i16;
        org.telegram.messenger.rc rcVar;
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q() && f2Var != null && i7 <= 1 && j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).f24493n && !z9) {
            jbVar = new mb(i10, f2Var);
        } else {
            if (f2Var != null) {
                h6Var = f2Var.getResourceProvider();
            } else {
                h6Var = null;
            }
            jbVar = new jb(i11, i12, context, h6Var);
        }
        jb jbVar2 = jbVar;
        if (d3Var == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean[] zArr = {false};
        if (d3Var != null) {
            fqVar = new org.telegram.ui.fq(5, zArr, d3Var);
        } else {
            fqVar = null;
        }
        if (i7 <= 1) {
            if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).f24493n) {
                if (i10 <= 1) {
                    String M0 = org.telegram.messenger.id.M0(2131750498, null);
                    if (z9) {
                        rcVar = new org.telegram.messenger.rc(23);
                    } else {
                        rcVar = new org.telegram.messenger.rc(21);
                    }
                    X2 = org.telegram.messenger.g0.S2(M0, -1, 2, rcVar, null);
                } else {
                    X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750491, null), -1, 2, new org.telegram.messenger.rc(21), null);
                }
                jbVar2.c(2131624190, 30, 30, new String[0]);
                i14 = 2;
            } else {
                i14 = 2;
                bi.d3 d3Var2 = new bi.d3(fqVar, f2Var, j3, 19);
                if (org.telegram.messenger.m5.z(j3)) {
                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).M0(Long.valueOf(-j3));
                    if (i10 <= 1) {
                        if (f2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131750502, M02.title), -1, 2, d3Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750502, M02.title));
                        }
                    } else if (f2Var != null) {
                        X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, 2131750495, M02.title), -1, 2, d3Var2, null);
                    } else {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131750495, M02.title));
                    }
                } else {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).a2(Long.valueOf(j3));
                    if (i10 <= 1) {
                        if (z10) {
                            i16 = 2131750496;
                        } else {
                            i16 = 2131750497;
                        }
                        if (f2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, i16, org.telegram.messenger.t10.j(a22, true)), -1, 2, d3Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i16, org.telegram.messenger.t10.j(a22, true)));
                        }
                    } else {
                        if (z10) {
                            i15 = 2131750489;
                        } else {
                            i15 = 2131750490;
                        }
                        if (f2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.a0(null, null, i15, org.telegram.messenger.t10.j(a22, true)), -1, 2, d3Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i15, org.telegram.messenger.t10.j(a22, true)));
                        }
                    }
                }
                jbVar2.c(2131624028, 30, 30, new String[0]);
            }
        } else {
            i14 = 2;
            if (i10 <= 1) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i7, "FwdMessageToManyChats", new Object[0]));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i7, "FwdMessagesToManyChats", new Object[0]));
            }
            jbVar2.c(2131624028, 30, 30, new String[0]);
        }
        jbVar2.f34883b.setText(X2);
        if (z10) {
            Context context2 = jbVar2.getContext();
            if (f2Var != null) {
                h6Var2 = f2Var.getResourceProvider();
            } else {
                h6Var2 = null;
            }
            zb zbVar = new zb(context2, h6Var2, true, true);
            zbVar.f40908b = null;
            zbVar.f40909c = fqVar;
            jbVar2.setButton(zbVar);
        }
        jbVar2.postDelayed(new cc(jbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = bc.f(frameLayout, jbVar2, i13);
        } else if (f2Var != null) {
            g10 = bc.g(f2Var, jbVar2, i13);
        } else {
            throw new IllegalArgumentException();
        }
        if (jbVar2 instanceof mb) {
            jbVar2.f34883b.setSingleLine(false);
            jbVar2.f34883b.setMaxLines(i14);
            ((mb) jbVar2).setBulletin(g10);
            g10.f32211r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.bc x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.bc");
    }

    public static org.telegram.ui.Components.bc z(org.telegram.ui.ActionBar.f2 r6, int r7, int r8, org.telegram.ui.ActionBar.h6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gc.z(org.telegram.ui.ActionBar.f2, int, int, org.telegram.ui.ActionBar.h6):org.telegram.ui.Components.bc");
    }

    public final bc E(org.telegram.ui.ActionBar.h6 h6Var) {
        jb jbVar = new jb(W(), h6Var);
        jbVar.d(2131623981, new String[0]);
        jbVar.f34883b.setText(org.telegram.messenger.id.M0(2131746222, null));
        return b(jbVar, 1500);
    }

    public final bc G(int i7, int i10, CharSequence charSequence) {
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        jb jbVar = new jb(W(), this.f33873c);
        jbVar.c(i7, 36, 36, new String[0]);
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
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(i10);
        jbVar.f34883b.setText(charSequence);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(jbVar, i11);
    }

    public final bc H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final bc I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        int i10;
        yb ybVar = new yb(W(), this.f33873c);
        ybVar.c(i7, 36, 36, new String[0]);
        ybVar.f40545b.setText(charSequence);
        ybVar.f40546c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ybVar, i10);
    }

    public final bc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z9, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        jb jbVar = new jb(W, h6Var);
        if (i7 != 0) {
            jbVar.c(i7, 36, 36, new String[0]);
        } else {
            jbVar.f34882a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) jbVar.f34883b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        jbVar.f34883b.setTextSize(1, 14.0f);
        jbVar.f34883b.setTextDirection(5);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(3);
        jbVar.f34883b.setText(charSequence);
        zb zbVar = new zb(W(), h6Var, true, z9);
        zbVar.e(charSequence2);
        zbVar.f40908b = runnable;
        jbVar.setButton(zbVar);
        return b(jbVar, i10);
    }

    public final bc K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        int i10;
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return J(i7, charSequence, str, i10, false, runnable);
    }

    public final bc L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        yb ybVar = new yb(W, h6Var);
        ybVar.c(i7, 36, 36, new String[0]);
        ybVar.f40545b.setText(str);
        ybVar.f40546c.setText(charSequence);
        zb zbVar = new zb(W(), h6Var, true);
        zbVar.e(str2);
        zbVar.f40908b = runnable;
        ybVar.setButton(zbVar);
        return b(ybVar, 5000);
    }

    public final bc M(Drawable drawable, CharSequence charSequence) {
        jb jbVar = new jb(W(), this.f33873c);
        jbVar.f34882a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.fm0) {
            ((org.telegram.ui.fm0) drawable).e(jbVar.f34882a);
        }
        jbVar.f34883b.setText(charSequence);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(2);
        return b(jbVar, 2750);
    }

    public final bc N(String str, String str2) {
        yb ybVar = new yb(W(), this.f33873c);
        ybVar.f40544a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ybVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        ybVar.f40545b.setText(str);
        ybVar.f40546c.setText(str2);
        return b(ybVar, 5000);
    }

    public final bc O(TLRPC.Document document, String str, String str2) {
        int i7;
        if (document == null) {
            return new bc();
        }
        xb xbVar = new xb(W(), this.f33873c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, document);
        k9 k9Var = xbVar.f40279a;
        k9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = xbVar.f40280b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = xbVar.f40281c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(xbVar, i7);
    }

    public final bc P(int i7, CharSequence charSequence) {
        int i10;
        jb jbVar = new jb(W(), this.f33873c);
        jbVar.c(i7, 36, 36, new String[0]);
        jbVar.f34883b.setText(charSequence);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setTextSize(1, 14.0f);
        jbVar.f34883b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(jbVar, i10);
    }

    public final bc Q(int i7, int i10, CharSequence charSequence) {
        int i11;
        jb jbVar = new jb(W(), this.f33873c);
        jbVar.c(i7, i10, i10, new String[0]);
        jbVar.f34883b.setText(charSequence);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(jbVar, i11);
    }

    public final bc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i7;
        if (document == null) {
            return new bc();
        }
        xb xbVar = new xb(W(), this.f33873c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, document);
        k9 k9Var = xbVar.f40279a;
        k9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        k9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = xbVar.f40280b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        xbVar.f40281c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(xbVar, i7);
    }

    public final bc T(String str) {
        jb jbVar = new jb(W(), null);
        jbVar.d(2131623989, new String[0]);
        jbVar.f34883b.setText(str);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(2);
        return b(jbVar, 1500);
    }

    public final bc U(String str, boolean z9, Runnable runnable, Runnable runnable2) {
        yb ybVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        if (!isEmpty) {
            yb ybVar2 = new yb(W(), h6Var);
            ybVar2.f40545b.setText(str);
            ybVar2.f40546c.setText((CharSequence) null);
            ybVar = ybVar2;
        } else {
            jb jbVar = new jb(W(), h6Var);
            jbVar.f34883b.setText(str);
            jbVar.f34883b.setSingleLine(false);
            jbVar.f34883b.setMaxLines(2);
            ybVar = jbVar;
        }
        ybVar.setTimer();
        zb zbVar = new zb(W(), h6Var, true, z9);
        zbVar.e(org.telegram.messenger.id.M0(2131743885, null));
        zbVar.f40908b = runnable;
        zbVar.f40909c = runnable2;
        ybVar.setButton(zbVar);
        return b(ybVar, 5000);
    }

    public final bc V(List list, CharSequence charSequence, CharSequence charSequence2, m4.d0 d0Var) {
        boolean z9;
        float f10;
        int i7;
        Context W = W();
        if (charSequence2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        ac acVar = new ac(W, h6Var, z9);
        y8 y8Var = acVar.f31812a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    y8Var.setCount(i12);
                    y8Var.b(i7, org.telegram.messenger.p10.f24474s0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                y8Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                y8Var.setScaleX(1.2f);
                y8Var.setScaleY(1.2f);
            } else {
                y8Var.setScaleX(1.0f);
                y8Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        y8Var.a(false);
        w70 w70Var = acVar.f31813b;
        if (charSequence2 != null) {
            w70Var.setSingleLine(true);
            w70Var.setMaxLines(1);
            w70Var.setText(charSequence);
            w70 w70Var2 = acVar.f31814c;
            w70Var2.setText(charSequence2);
            w70Var2.setSingleLine(false);
            w70Var2.setMaxLines(3);
            LinearLayout linearLayout = acVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.id.f23161a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            w70Var.setSingleLine(false);
            w70Var.setMaxLines(4);
            w70Var.setText(charSequence);
            if (w70Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    w70Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.id.f23161a0) {
                    ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (d0Var != null) {
            zb zbVar = new zb(W(), h6Var, true);
            zbVar.e(org.telegram.messenger.id.M0(2131743885, null));
            zbVar.f40908b = (Runnable) d0Var.f19616a;
            zbVar.f40909c = (Runnable) d0Var.f19617b;
            acVar.setButton(zbVar);
        }
        return b(acVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.f2 f2Var = this.f33871a;
        if (f2Var != null) {
            context = f2Var.getParentActivity();
            if (context == null && this.f33871a.getLayoutContainer() != null) {
                context = this.f33871a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f33872b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return org.telegram.messenger.t0.f25570b;
        }
        return context;
    }

    public final bc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.D1) {
            return new bc();
        }
        if (tL_error == null) {
            return t(org.telegram.messenger.id.a0(null, null, 2131743879, new Object[0]), null);
        }
        return t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null);
    }

    public final bc b(ya yaVar, int i7) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f33871a;
        if (f2Var != null) {
            return bc.g(f2Var, yaVar, i7);
        }
        return bc.f(this.f33872b, yaVar, i7);
    }

    public final bc c(CharSequence charSequence) {
        if (W() == null) {
            return new bc();
        }
        jb jbVar = new jb(W(), this.f33873c);
        jbVar.d(2131624048, "Shield");
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(3);
        jbVar.f34883b.setText(charSequence);
        return b(jbVar, 2750);
    }

    public final bc e(boolean z9) {
        String M0;
        jb jbVar = new jb(W(), this.f33873c);
        if (z9) {
            jbVar.d(2131624049, "Hand");
            M0 = org.telegram.messenger.id.M0(2131743761, null);
        } else {
            jbVar.d(2131624058, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.id.M0(2131743675, null);
        }
        jbVar.f34883b.setText(org.telegram.messenger.g0.X2(M0));
        return b(jbVar, 1500);
    }

    public final void e0(String str, boolean z9) {
        if (!LaunchActivity.D1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            bc t6 = t(org.telegram.messenger.id.a0(null, null, 2131743879, new Object[0]), null);
            t6.f32211r = false;
            t6.k(z9);
            return;
        }
        bc t10 = t(org.telegram.messenger.id.a0(null, null, 2131743878, str), null);
        t10.f32211r = false;
        t10.k(z9);
    }

    public final bc f(int i7, Runnable runnable) {
        jb jbVar = new jb(W(), null);
        jbVar.d(2131623970, new String[0]);
        String G = org.telegram.messenger.id.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.X2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        jbVar.f34883b.setText(valueOf);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(3);
        return b(jbVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z9) {
        if (LaunchActivity.D1) {
            if (tL_error == null) {
                bc t6 = t(org.telegram.messenger.id.a0(null, null, 2131743879, new Object[0]), null);
                t6.f32211r = false;
                t6.k(z9);
            } else if (tL_error.code != 406) {
                bc t10 = t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null);
                t10.f32211r = false;
                t10.k(z9);
            }
        }
    }

    public final bc g(String str, ArrayList arrayList) {
        ac acVar = new ac(W(), this.f33873c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                acVar.f31812a.setCount(i11);
                acVar.f31812a.b(i7, org.telegram.messenger.p10.f24474s0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            acVar.f31812a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            acVar.f31812a.setScaleX(1.2f);
            acVar.f31812a.setScaleY(1.2f);
        } else {
            acVar.f31812a.setScaleX(1.0f);
            acVar.f31812a.setScaleY(1.0f);
        }
        acVar.f31812a.a(false);
        acVar.f31813b.setSingleLine(false);
        acVar.f31813b.setMaxLines(2);
        acVar.f31813b.setText(str);
        if (acVar.f31813b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.id.f23161a0) {
                ((ViewGroup.MarginLayoutParams) acVar.f31813b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) acVar.f31813b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.id.f23161a0) {
            acVar.f31812a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(acVar, 5000);
    }

    public final boolean g0(int i7, long j3) {
        org.telegram.ui.ActionBar.f2 f2Var;
        SpannableStringBuilder S2;
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).q() && (f2Var = this.f33871a) != null) {
            mb mbVar = new mb(i7, f2Var);
            if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24474s0).f24493n) {
                if (i7 <= 1) {
                    S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750498, null), -1, 2, new org.telegram.messenger.rc(21), null);
                } else {
                    S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131750491, null), -1, 2, new org.telegram.messenger.rc(21), null);
                }
                mbVar.c(2131624190, 36, 36, new String[0]);
                mbVar.f34883b.setText(S2);
                mbVar.f34883b.setSingleLine(false);
                mbVar.f34883b.setMaxLines(2);
                bc b10 = b(mbVar, 3500);
                mbVar.setBulletin(b10);
                b10.f32211r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final bc h(TLRPC.Document document, int i7, final org.telegram.messenger.c20 c20Var) {
        SpannableStringBuilder spannableStringBuilder;
        b80 b80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder X2;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.ij.i1(document);
        if (i12 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).m0(i12, true);
        if (m0 != null && (stickerSet = m0.set) != null) {
            if (i7 == 1) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("TopicContainsEmojiPackSingle", null, 2131744022, stickerSet.title));
            } else if (i7 == 2) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoryContainsEmojiPackSingle", null, 2131744699, stickerSet.title));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MessageContainsEmojiPackSingle", null, 2131748596, stickerSet.title));
            }
            return r(document, X2, org.telegram.messenger.id.M0(2131743563, null), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c20Var.a(i12);
                            return;
                        default:
                            c20Var.a(i12);
                            return;
                    }
                }
            });
        }
        if (i7 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("TopicContainsEmojiPackSingle", null, 2131744022, "<{LOADING}>")));
        } else if (i7 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("StoryContainsEmojiPackSingle", null, 2131744699, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("MessageContainsEmojiPackSingle", null, 2131748596, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        if (indexOf >= 0) {
            b80Var = new b80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), h6Var);
            spannableStringBuilder.setSpan(b80Var, indexOf, indexOf + 11, 33);
            int i10 = org.telegram.ui.ActionBar.m6.vj;
            b80Var.a(i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 32), i0.a.o(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 72));
        } else {
            b80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.id.M0(2131743563, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        c20Var.a(i12);
                        return;
                    default:
                        c20Var.a(i12);
                        return;
                }
            }
        };
        Context W = W();
        ?? jbVar = new jb(W, h6Var);
        w70 w70Var = new w70(W, null);
        jbVar.d = w70Var;
        w70Var.setDisablePaddingsOffset(true);
        w70Var.setSingleLine();
        w70Var.setTypeface(Typeface.SANS_SERIF);
        w70Var.setTextSize(1, 15.0f);
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
        w70Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        jbVar.f34883b.setVisibility(8);
        jbVar.addView(w70Var, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.m6.vj;
        jbVar.setTextColor(jbVar.getThemedColor(i11));
        if (org.telegram.messenger.ij.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.t6.s(jbVar.f34882a, i11, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        jbVar.e(document, new String[0]);
        jbVar.f34883b.setTextSize(1, 14.0f);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(3);
        w70Var.setText(spannableStringBuilder);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setSingleLine(false);
        w70Var.setMaxLines(3);
        zb zbVar = new zb(W(), h6Var, true);
        zbVar.e(M0);
        zbVar.f40908b = runnable;
        jbVar.setButton(zbVar);
        bc b10 = b(jbVar, 2750);
        if (b80Var != null) {
            fb fbVar = b10.f32199e;
            if (fbVar instanceof hb) {
                b80Var.f32160b = ((hb) fbVar).d;
            }
        }
        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24474s0).l0(inputStickerSet, null, false, false, new bi.f4(i7, b10, currentTimeMillis));
        return b10;
    }

    public final bc i(String str) {
        if (!org.telegram.messenger.g0.I3()) {
            return new bc();
        }
        jb jbVar = new jb(W(), null);
        jbVar.c(2131623993, 36, 36, "NULL ROTATION", "Back", "Front");
        jbVar.f34883b.setText(str);
        return b(jbVar, 1500);
    }

    public final bc k(boolean z9) {
        if (!org.telegram.messenger.g0.I3()) {
            return new bc();
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        if (z9) {
            yb ybVar = new yb(W(), h6Var);
            ybVar.c(2131624345, 36, 36, "Wibe", "Circle");
            ybVar.f40545b.setText(org.telegram.messenger.id.M0(2131748921, null));
            ybVar.f40546c.setText(org.telegram.messenger.id.M0(2131748919, null));
            return b(ybVar, 2750);
        }
        jb jbVar = new jb(W(), h6Var);
        jbVar.c(2131624345, 36, 36, "Wibe", "Circle");
        jbVar.f34883b.setText(org.telegram.messenger.id.M0(2131748921, null));
        return b(jbVar, 1500);
    }

    public final bc m(fc fcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.h6 h6Var) {
        jb jbVar;
        String M0;
        ec ecVar = fcVar.d;
        if (i10 != 0 && i11 != 0) {
            jbVar = new jb(i10, i11, W(), h6Var);
        } else {
            jbVar = new jb(W(), h6Var);
        }
        jbVar.d(ecVar.f33200a, ecVar.f33201b);
        TextView textView = jbVar.f34883b;
        String str = fcVar.f33520a;
        if (fcVar.f33522c) {
            M0 = org.telegram.messenger.id.G(i7, str, new Object[0]);
        } else {
            M0 = org.telegram.messenger.id.M0(fcVar.f33521b, str);
        }
        textView.setText(org.telegram.messenger.g0.U2(M0, new org.telegram.messenger.rc(22)));
        int i12 = ecVar.f33202c;
        if (i12 != 0) {
            jbVar.setIconPaddingBottom(i12);
        }
        return b(jbVar, 1500);
    }

    public final bc n(fc fcVar, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return m(fcVar, i7, 0, 0, h6Var);
    }

    public final bc o(fc fcVar, org.telegram.ui.ActionBar.h6 h6Var) {
        return m(fcVar, 1, 0, 0, h6Var);
    }

    public final bc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        wb wbVar = new wb(W, h6Var);
        h5 h5Var = new h5(1, org.telegram.messenger.p10.f24474s0, j3);
        k9 k9Var = wbVar.f39937a;
        k9Var.setAnimatedEmojiDrawable(h5Var);
        k9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var), PorterDuff.Mode.SRC_IN));
        wbVar.f39938b.setText(str);
        wbVar.f39939c.setText(str2);
        return b(wbVar, 2750);
    }

    public final bc q(TLRPC.Document document, CharSequence charSequence) {
        jb jbVar = new jb(W(), this.f33873c);
        if (org.telegram.messenger.ij.C4(document)) {
            org.telegram.ui.ActionBar.t6.s(jbVar.f34882a, org.telegram.ui.ActionBar.m6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        jbVar.e(document, new String[0]);
        jbVar.f34883b.setText(charSequence);
        jbVar.f34883b.setTextSize(1, 14.0f);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(3);
        return b(jbVar, 2750);
    }

    public final bc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        jb jbVar = new jb(W, h6Var);
        if (org.telegram.messenger.ij.C4(document)) {
            org.telegram.ui.ActionBar.t6.s(jbVar.f34882a, org.telegram.ui.ActionBar.m6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        jbVar.e(document, new String[0]);
        if (jbVar.f34882a.getImageReceiver() != null) {
            jbVar.f34882a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        jbVar.f34883b.setText(charSequence);
        jbVar.f34883b.setTextSize(1, 14.0f);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(3);
        zb zbVar = new zb(W(), h6Var, true);
        zbVar.e(str);
        zbVar.f40908b = runnable;
        jbVar.setButton(zbVar);
        return b(jbVar, 2750);
    }

    public final bc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i7;
        yb ybVar = new yb(W(), this.f33873c);
        boolean C4 = org.telegram.messenger.ij.C4(document);
        ch0 ch0Var = ybVar.f40544a;
        if (C4) {
            org.telegram.ui.ActionBar.t6.s(ch0Var, org.telegram.ui.ActionBar.m6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ch0Var.setAutoRepeat(true);
        ch0Var.g(36, 36, document);
        ybVar.f40545b.setText(str);
        ybVar.f40546c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(ybVar, i7);
    }

    public final bc t(CharSequence charSequence, org.telegram.ui.ActionBar.h6 h6Var) {
        jb jbVar = new jb(W(), h6Var);
        jbVar.d(2131623981, new String[0]);
        jbVar.f34883b.setText(charSequence);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setMaxLines(2);
        return b(jbVar, 1500);
    }

    public final bc u(String str, String str2, org.telegram.ui.ActionBar.h6 h6Var) {
        yb ybVar = new yb(W(), h6Var);
        ybVar.c(2131623981, 32, 32, new String[0]);
        ybVar.f40545b.setText(str);
        ybVar.f40546c.setText(str2);
        return b(ybVar, 1500);
    }

    public final bc w(int i7, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        jb jbVar = new jb(W, h6Var);
        jbVar.setBackground(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.tj, h6Var), 12);
        jbVar.f34882a.setImageResource(i7);
        jbVar.f34883b.setText(charSequence);
        jbVar.f34883b.setSingleLine(false);
        jbVar.f34883b.setLines(2);
        jbVar.f34883b.setMaxLines(4);
        TextView textView = jbVar.f34883b;
        textView.setMaxWidth(fi.m3.a(textView.getText(), jbVar.f34883b.getPaint()));
        jbVar.f34883b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) jbVar.f34883b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        jbVar.setWrapWidth();
        return b(jbVar, 5000);
    }

    public final bc y(int i7, TLRPC.Document document, jg.r rVar) {
        String M0;
        Context W = W();
        org.telegram.ui.ActionBar.h6 h6Var = this.f33873c;
        jb jbVar = new jb(W, h6Var);
        jbVar.c(2131624285, 36, 36, new String[0]);
        jbVar.removeView(jbVar.f34883b);
        p5 p5Var = new p5(jbVar.getContext());
        jbVar.f34883b = p5Var;
        p5Var.setTypeface(Typeface.SANS_SERIF);
        jbVar.f34883b.setTextSize(1, 15.0f);
        jbVar.f34883b.setEllipsize(TextUtils.TruncateAt.END);
        jbVar.f34883b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new q5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = jbVar.f34883b;
        if (i7 > 1) {
            M0 = org.telegram.messenger.id.G(i7, "SavedTagMessagesTagged", new Object[0]);
        } else {
            M0 = org.telegram.messenger.id.M0(2131745878, null);
        }
        textView.setText(new SpannableStringBuilder(M0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (rVar != null) {
            zb zbVar = new zb(W(), h6Var, true);
            zbVar.e(org.telegram.messenger.id.M0(2131743563, null));
            zbVar.f40908b = rVar;
            jbVar.setButton(zbVar);
        }
        jbVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.vj, h6Var));
        jbVar.addView(jbVar.f34883b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(jbVar, 2750);
    }

    public gc(FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33872b = frameLayout;
        this.f33871a = null;
        this.f33873c = h6Var;
    }
}

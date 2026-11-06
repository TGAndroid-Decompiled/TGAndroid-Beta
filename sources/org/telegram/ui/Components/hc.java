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
public final class hc {
    public final org.telegram.ui.ActionBar.f2 f34237a;
    public final FrameLayout f34238b;
    public final org.telegram.ui.ActionBar.f6 f34239c;

    public hc(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var != null && f2Var.getLastStoryViewer() != null && f2Var.getLastStoryViewer().y()) {
            this.f34237a = null;
            di.i4 currentPeerView = f2Var.getLastStoryViewer().f9559n0.getCurrentPeerView();
            this.f34238b = currentPeerView != null ? currentPeerView.L0 : null;
            this.f34239c = f2Var.getLastStoryViewer().D;
            return;
        }
        this.f34237a = f2Var;
        this.f34238b = null;
        this.f34239c = f2Var != null ? f2Var.getResourceProvider() : null;
    }

    public static cc A(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        if (z9) {
            i7 = 3;
        } else {
            i7 = 4;
        }
        return z(f2Var, i7, 0, f6Var);
    }

    public static cc B(org.telegram.ui.ActionBar.f2 f2Var, boolean z9, ai.a1 a1Var, org.telegram.ui.ie ieVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i7;
        String str;
        int i10;
        int i11;
        kb kbVar = new kb(f2Var.getParentActivity(), f6Var);
        if (z9) {
            i7 = 2131624054;
        } else {
            i7 = 2131624060;
        }
        kbVar.c(i7, 28, 28, "Pin", "Line");
        TextView textView = kbVar.f35252b;
        if (z9) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z9) {
            i10 = 2131748543;
        } else {
            i10 = 2131748465;
        }
        textView.setText(org.telegram.messenger.hd.M0(i10, str));
        if (!z9) {
            ac acVar = new ac(f2Var.getParentActivity(), f6Var, true);
            acVar.f31760b = a1Var;
            acVar.f31761c = ieVar;
            kbVar.setButton(acVar);
        }
        if (z9) {
            i11 = 1500;
        } else {
            i11 = 5000;
        }
        return cc.g(f2Var, kbVar, i11);
    }

    public static cc C(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        kb kbVar = new kb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        kbVar.d(2131624048, "Shield");
        org.telegram.messenger.k5.r("UserSetAsAdminHint", null, 2131743681, new Object[]{str}, kbVar.f35252b);
        return cc.g(f2Var, kbVar, 1500);
    }

    public static cc D(org.telegram.ui.ActionBar.f2 f2Var, TLRPC.User user, String str) {
        String str2;
        kb kbVar = new kb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        kbVar.d(2131624049, "Hand");
        if (user.deleted) {
            str2 = org.telegram.messenger.hd.a0("HiddenName", null, 2131749327, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        org.telegram.messenger.k5.r("UserRemovedFromChatHint", null, 2131743732, new Object[]{str2, str}, kbVar.f35252b);
        return cc.g(f2Var, kbVar, 1500);
    }

    public static cc F(FrameLayout frameLayout, boolean z9) {
        gc gcVar;
        hc hcVar = new hc(frameLayout, null);
        if (z9) {
            gcVar = gc.h;
        } else {
            gcVar = gc.f33882e;
        }
        return hcVar.m(gcVar, 1, -115203550, -1, null);
    }

    public static cc S(int i7, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String M0;
        kb kbVar = new kb(f2Var.getParentActivity(), f6Var);
        boolean z9 = true;
        if (i7 != 0) {
            if (i7 == 1) {
                M0 = org.telegram.messenger.hd.M0(2131745277, null);
                z9 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            M0 = org.telegram.messenger.hd.M0(2131745275, null);
        }
        if (z9) {
            kbVar.d(2131624202, new String[0]);
        } else {
            kbVar.d(2131624201, new String[0]);
        }
        kbVar.f35252b.setText(M0);
        return cc.g(f2Var, kbVar, 1500);
    }

    public static hc X() {
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return new hc(xa.a(org.telegram.messenger.t0.f25555b), null);
        }
        Dialog dialog = T.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.v2) {
            return new hc(((org.telegram.ui.ActionBar.v2) dialog).f28618c, T.getResourceProvider());
        }
        return a0(T);
    }

    public static hc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        return new hc(frameLayout, f6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var != null && f2Var.getParentActivity() != null && f2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static hc a0(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var == null) {
            return X();
        }
        return new hc(f2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.D1) {
            return;
        }
        X().t(org.telegram.messenger.hd.a0(null, null, 2131743879, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        if (!LaunchActivity.D1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        cc t6 = new hc(frameLayout, f6Var).t(org.telegram.messenger.hd.a0(null, null, 2131743879, str), null);
        t6.f32535r = false;
        t6.j();
    }

    public static cc d(org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        String M0;
        kb kbVar = new kb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        if (z9) {
            kbVar.d(2131624049, "Hand");
            M0 = org.telegram.messenger.hd.M0(2131743762, null);
        } else {
            kbVar.d(2131624058, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.hd.M0(2131743676, null);
        }
        kbVar.f35252b.setText(org.telegram.messenger.g0.X2(M0));
        return cc.g(f2Var, kbVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.D1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(org.telegram.messenger.hd.a0(null, null, 2131743879, tL_error.text), null).j();
        }
    }

    public static cc j(org.telegram.ui.ActionBar.f2 f2Var) {
        return a0(f2Var).k(false);
    }

    public static cc l(String str, org.telegram.ui.ActionBar.f2 f2Var, boolean z9) {
        int i7;
        String M0;
        int i10;
        int i11;
        kb kbVar = new kb(f2Var.getParentActivity(), f2Var.getResourceProvider());
        if (str != null) {
            if (z9) {
                i11 = 2131751413;
            } else {
                i11 = 2131751411;
            }
            M0 = org.telegram.messenger.hd.a0(null, null, i11, str);
        } else {
            if (z9) {
                i7 = 2131751414;
            } else {
                i7 = 2131751412;
            }
            M0 = org.telegram.messenger.hd.M0(i7, null);
        }
        kbVar.f35252b.setText(org.telegram.messenger.g0.X2(M0));
        if (!z9 && str == null) {
            i10 = 2131623989;
        } else {
            i10 = 2131624006;
        }
        kbVar.d(i10, new String[0]);
        return cc.g(f2Var, kbVar, 5000);
    }

    public static cc v(Context context, org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z9, bi.d3 d3Var) {
        kb kbVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z10;
        f fVar;
        int i14;
        SpannableStringBuilder X2;
        cc g10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i15;
        int i16;
        org.telegram.messenger.pd pdVar;
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q() && f2Var != null && i7 <= 1 && j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).f24478n && !z9) {
            kbVar = new nb(i10, f2Var);
        } else {
            if (f2Var != null) {
                f6Var = f2Var.getResourceProvider();
            } else {
                f6Var = null;
            }
            kbVar = new kb(i11, i12, context, f6Var);
        }
        kb kbVar2 = kbVar;
        if (d3Var == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean[] zArr = {false};
        if (d3Var != null) {
            fVar = new f(4, zArr, d3Var);
        } else {
            fVar = null;
        }
        if (i7 <= 1) {
            if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).f24478n) {
                if (i10 <= 1) {
                    String M0 = org.telegram.messenger.hd.M0(2131750497, null);
                    if (z9) {
                        pdVar = new org.telegram.messenger.pd(21);
                    } else {
                        pdVar = new org.telegram.messenger.pd(19);
                    }
                    X2 = org.telegram.messenger.g0.S2(M0, -1, 2, pdVar, null);
                } else {
                    X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750490, null), -1, 2, new org.telegram.messenger.pd(19), null);
                }
                kbVar2.c(2131624190, 30, 30, new String[0]);
                i14 = 2;
            } else {
                i14 = 2;
                bi.d3 d3Var2 = new bi.d3(fVar, f2Var, j3, 19);
                if (org.telegram.messenger.m5.z(j3)) {
                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).M0(Long.valueOf(-j3));
                    if (i10 <= 1) {
                        if (f2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131750501, M02.title), -1, 2, d3Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750501, M02.title));
                        }
                    } else if (f2Var != null) {
                        X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, 2131750494, M02.title), -1, 2, d3Var2, null);
                    } else {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, 2131750494, M02.title));
                    }
                } else {
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24459s0).a2(Long.valueOf(j3));
                    if (i10 <= 1) {
                        if (z10) {
                            i16 = 2131750495;
                        } else {
                            i16 = 2131750496;
                        }
                        if (f2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, i16, org.telegram.messenger.t10.j(a22, true)), -1, 2, d3Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i16, org.telegram.messenger.t10.j(a22, true)));
                        }
                    } else {
                        if (z10) {
                            i15 = 2131750488;
                        } else {
                            i15 = 2131750489;
                        }
                        if (f2Var != null) {
                            X2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.a0(null, null, i15, org.telegram.messenger.t10.j(a22, true)), -1, 2, d3Var2, null);
                        } else {
                            X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i15, org.telegram.messenger.t10.j(a22, true)));
                        }
                    }
                }
                kbVar2.c(2131624028, 30, 30, new String[0]);
            }
        } else {
            i14 = 2;
            if (i10 <= 1) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, "FwdMessageToManyChats", new Object[0]));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, "FwdMessagesToManyChats", new Object[0]));
            }
            kbVar2.c(2131624028, 30, 30, new String[0]);
        }
        kbVar2.f35252b.setText(X2);
        if (z10) {
            Context context2 = kbVar2.getContext();
            if (f2Var != null) {
                f6Var2 = f2Var.getResourceProvider();
            } else {
                f6Var2 = null;
            }
            ac acVar = new ac(context2, f6Var2, true, true);
            acVar.f31760b = null;
            acVar.f31761c = fVar;
            kbVar2.setButton(acVar);
        }
        kbVar2.postDelayed(new dc(kbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = cc.f(frameLayout, kbVar2, i13);
        } else if (f2Var != null) {
            g10 = cc.g(f2Var, kbVar2, i13);
        } else {
            throw new IllegalArgumentException();
        }
        if (kbVar2 instanceof nb) {
            kbVar2.f35252b.setSingleLine(false);
            kbVar2.f35252b.setMaxLines(i14);
            ((nb) kbVar2).setBulletin(g10);
            g10.f32535r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.cc x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.cc");
    }

    public static org.telegram.ui.Components.cc z(org.telegram.ui.ActionBar.f2 r6, int r7, int r8, org.telegram.ui.ActionBar.f6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hc.z(org.telegram.ui.ActionBar.f2, int, int, org.telegram.ui.ActionBar.f6):org.telegram.ui.Components.cc");
    }

    public final cc E(org.telegram.ui.ActionBar.f6 f6Var) {
        kb kbVar = new kb(W(), f6Var);
        kbVar.d(2131623981, new String[0]);
        kbVar.f35252b.setText(org.telegram.messenger.hd.M0(2131746223, null));
        return b(kbVar, 1500);
    }

    public final cc G(int i7, int i10, CharSequence charSequence) {
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        kb kbVar = new kb(W(), this.f34239c);
        kbVar.c(i7, 36, 36, new String[0]);
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
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(i10);
        kbVar.f35252b.setText(charSequence);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(kbVar, i11);
    }

    public final cc H(int i7, CharSequence charSequence) {
        return Q(i7, 36, charSequence);
    }

    public final cc I(int i7, CharSequence charSequence, CharSequence charSequence2) {
        int i10;
        zb zbVar = new zb(W(), this.f34239c);
        zbVar.c(i7, 36, 36, new String[0]);
        zbVar.f40908b.setText(charSequence);
        zbVar.f40909c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(zbVar, i10);
    }

    public final cc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z9, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        kb kbVar = new kb(W, f6Var);
        if (i7 != 0) {
            kbVar.c(i7, 36, 36, new String[0]);
        } else {
            kbVar.f35251a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) kbVar.f35252b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        kbVar.f35252b.setTextSize(1, 14.0f);
        kbVar.f35252b.setTextDirection(5);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(3);
        kbVar.f35252b.setText(charSequence);
        ac acVar = new ac(W(), f6Var, true, z9);
        acVar.e(charSequence2);
        acVar.f31760b = runnable;
        kbVar.setButton(acVar);
        return b(kbVar, i10);
    }

    public final cc K(int i7, CharSequence charSequence, String str, Runnable runnable) {
        int i10;
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return J(i7, charSequence, str, i10, false, runnable);
    }

    public final cc L(int i7, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        zb zbVar = new zb(W, f6Var);
        zbVar.c(i7, 36, 36, new String[0]);
        zbVar.f40908b.setText(str);
        zbVar.f40909c.setText(charSequence);
        ac acVar = new ac(W(), f6Var, true);
        acVar.e(str2);
        acVar.f31760b = runnable;
        zbVar.setButton(acVar);
        return b(zbVar, 5000);
    }

    public final cc M(Drawable drawable, CharSequence charSequence) {
        kb kbVar = new kb(W(), this.f34239c);
        kbVar.f35251a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.cm0) {
            ((org.telegram.ui.cm0) drawable).e(kbVar.f35251a);
        }
        kbVar.f35252b.setText(charSequence);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(2);
        return b(kbVar, 2750);
    }

    public final cc N(String str, String str2) {
        zb zbVar = new zb(W(), this.f34239c);
        zbVar.f40907a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) zbVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        zbVar.f40908b.setText(str);
        zbVar.f40909c.setText(str2);
        return b(zbVar, 5000);
    }

    public final cc O(TLRPC.Document document, String str, String str2) {
        int i7;
        if (document == null) {
            return new cc();
        }
        yb ybVar = new yb(W(), this.f34239c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, document);
        l9 l9Var = ybVar.f40601a;
        l9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ybVar.f40602b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = ybVar.f40603c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(ybVar, i7);
    }

    public final cc P(int i7, CharSequence charSequence) {
        int i10;
        kb kbVar = new kb(W(), this.f34239c);
        kbVar.c(i7, 36, 36, new String[0]);
        kbVar.f35252b.setText(charSequence);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setTextSize(1, 14.0f);
        kbVar.f35252b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(kbVar, i10);
    }

    public final cc Q(int i7, int i10, CharSequence charSequence) {
        int i11;
        kb kbVar = new kb(W(), this.f34239c);
        kbVar.c(i7, i10, i10, new String[0]);
        kbVar.f35252b.setText(charSequence);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(kbVar, i11);
    }

    public final cc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i7;
        if (document == null) {
            return new cc();
        }
        yb ybVar = new yb(W(), this.f34239c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.hc c10 = org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.hc c11 = org.telegram.messenger.hc.c(w10, document);
        l9 l9Var = ybVar.f40601a;
        l9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ybVar.f40602b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ybVar.f40603c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(ybVar, i7);
    }

    public final cc T(String str) {
        kb kbVar = new kb(W(), null);
        kbVar.d(2131623989, new String[0]);
        kbVar.f35252b.setText(str);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(2);
        return b(kbVar, 1500);
    }

    public final cc U(String str, boolean z9, Runnable runnable, Runnable runnable2) {
        zb zbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        if (!isEmpty) {
            zb zbVar2 = new zb(W(), f6Var);
            zbVar2.f40908b.setText(str);
            zbVar2.f40909c.setText((CharSequence) null);
            zbVar = zbVar2;
        } else {
            kb kbVar = new kb(W(), f6Var);
            kbVar.f35252b.setText(str);
            kbVar.f35252b.setSingleLine(false);
            kbVar.f35252b.setMaxLines(2);
            zbVar = kbVar;
        }
        zbVar.setTimer();
        ac acVar = new ac(W(), f6Var, true, z9);
        acVar.e(org.telegram.messenger.hd.M0(2131743886, null));
        acVar.f31760b = runnable;
        acVar.f31761c = runnable2;
        zbVar.setButton(acVar);
        return b(zbVar, 5000);
    }

    public final cc V(List list, CharSequence charSequence, CharSequence charSequence2, m4.d0 d0Var) {
        boolean z9;
        float f10;
        int i7;
        Context W = W();
        if (charSequence2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        bc bcVar = new bc(W, f6Var, z9);
        z8 z8Var = bcVar.f32093a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    z8Var.setCount(i12);
                    z8Var.b(i7, org.telegram.messenger.p10.f24459s0, tLObject);
                    i7 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                z8Var.setTranslationX(org.telegram.messenger.g0.L(4.0f));
                z8Var.setScaleX(1.2f);
                z8Var.setScaleY(1.2f);
            } else {
                z8Var.setScaleX(1.0f);
                z8Var.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i7 = 0;
        }
        z8Var.a(false);
        w70 w70Var = bcVar.f32094b;
        if (charSequence2 != null) {
            w70Var.setSingleLine(true);
            w70Var.setMaxLines(1);
            w70Var.setText(charSequence);
            w70 w70Var2 = bcVar.f32095c;
            w70Var2.setText(charSequence2);
            w70Var2.setSingleLine(false);
            w70Var2.setMaxLines(3);
            LinearLayout linearLayout = bcVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.hd.f22871a0) {
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
                if (org.telegram.messenger.hd.f22871a0) {
                    ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) w70Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (d0Var != null) {
            ac acVar = new ac(W(), f6Var, true);
            acVar.e(org.telegram.messenger.hd.M0(2131743886, null));
            acVar.f31760b = (Runnable) d0Var.f19608a;
            acVar.f31761c = (Runnable) d0Var.f19609b;
            bcVar.setButton(acVar);
        }
        return b(bcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.f2 f2Var = this.f34237a;
        if (f2Var != null) {
            context = f2Var.getParentActivity();
            if (context == null && this.f34237a.getLayoutContainer() != null) {
                context = this.f34237a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f34238b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return org.telegram.messenger.t0.f25555b;
        }
        return context;
    }

    public final cc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.D1) {
            return new cc();
        }
        if (tL_error == null) {
            return t(org.telegram.messenger.hd.a0(null, null, 2131743880, new Object[0]), null);
        }
        return t(org.telegram.messenger.hd.a0(null, null, 2131743879, tL_error.text), null);
    }

    public final cc b(za zaVar, int i7) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f34237a;
        if (f2Var != null) {
            return cc.g(f2Var, zaVar, i7);
        }
        return cc.f(this.f34238b, zaVar, i7);
    }

    public final cc c(CharSequence charSequence) {
        if (W() == null) {
            return new cc();
        }
        kb kbVar = new kb(W(), this.f34239c);
        kbVar.d(2131624048, "Shield");
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(3);
        kbVar.f35252b.setText(charSequence);
        return b(kbVar, 2750);
    }

    public final cc e(boolean z9) {
        String M0;
        kb kbVar = new kb(W(), this.f34239c);
        if (z9) {
            kbVar.d(2131624049, "Hand");
            M0 = org.telegram.messenger.hd.M0(2131743762, null);
        } else {
            kbVar.d(2131624058, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.hd.M0(2131743676, null);
        }
        kbVar.f35252b.setText(org.telegram.messenger.g0.X2(M0));
        return b(kbVar, 1500);
    }

    public final void e0(String str, boolean z9) {
        if (!LaunchActivity.D1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            cc t6 = t(org.telegram.messenger.hd.a0(null, null, 2131743880, new Object[0]), null);
            t6.f32535r = false;
            t6.k(z9);
            return;
        }
        cc t10 = t(org.telegram.messenger.hd.a0(null, null, 2131743879, str), null);
        t10.f32535r = false;
        t10.k(z9);
    }

    public final cc f(int i7, Runnable runnable) {
        kb kbVar = new kb(W(), null);
        kbVar.d(2131623970, new String[0]);
        String G = org.telegram.messenger.hd.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.X2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        kbVar.f35252b.setText(valueOf);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(3);
        return b(kbVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z9) {
        if (LaunchActivity.D1) {
            if (tL_error == null) {
                cc t6 = t(org.telegram.messenger.hd.a0(null, null, 2131743880, new Object[0]), null);
                t6.f32535r = false;
                t6.k(z9);
            } else if (tL_error.code != 406) {
                cc t10 = t(org.telegram.messenger.hd.a0(null, null, 2131743879, tL_error.text), null);
                t10.f32535r = false;
                t10.k(z9);
            }
        }
    }

    public final cc g(String str, ArrayList arrayList) {
        bc bcVar = new bc(W(), this.f34239c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                bcVar.f32093a.setCount(i11);
                bcVar.f32093a.b(i7, org.telegram.messenger.p10.f24459s0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            bcVar.f32093a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            bcVar.f32093a.setScaleX(1.2f);
            bcVar.f32093a.setScaleY(1.2f);
        } else {
            bcVar.f32093a.setScaleX(1.0f);
            bcVar.f32093a.setScaleY(1.0f);
        }
        bcVar.f32093a.a(false);
        bcVar.f32094b.setSingleLine(false);
        bcVar.f32094b.setMaxLines(2);
        bcVar.f32094b.setText(str);
        if (bcVar.f32094b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.hd.f22871a0) {
                ((ViewGroup.MarginLayoutParams) bcVar.f32094b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) bcVar.f32094b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.hd.f22871a0) {
            bcVar.f32093a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(bcVar, 5000);
    }

    public final boolean g0(int i7, long j3) {
        org.telegram.ui.ActionBar.f2 f2Var;
        SpannableStringBuilder S2;
        if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).q() && (f2Var = this.f34237a) != null) {
            nb nbVar = new nb(i7, f2Var);
            if (j3 == org.telegram.messenger.p10.i(org.telegram.messenger.p10.f24459s0).f24478n) {
                if (i7 <= 1) {
                    S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750497, null), -1, 2, new org.telegram.messenger.pd(19), null);
                } else {
                    S2 = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131750490, null), -1, 2, new org.telegram.messenger.pd(19), null);
                }
                nbVar.c(2131624190, 36, 36, new String[0]);
                nbVar.f35252b.setText(S2);
                nbVar.f35252b.setSingleLine(false);
                nbVar.f35252b.setMaxLines(2);
                cc b10 = b(nbVar, 3500);
                nbVar.setBulletin(b10);
                b10.f32535r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final cc h(TLRPC.Document document, int i7, final org.telegram.messenger.c20 c20Var) {
        SpannableStringBuilder spannableStringBuilder;
        b80 b80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder X2;
        final TLRPC.InputStickerSet j12 = org.telegram.messenger.ij.j1(document);
        if (j12 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24459s0).m0(j12, true);
        if (m0 != null && (stickerSet = m0.set) != null) {
            if (i7 == 1) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131744023, stickerSet.title));
            } else if (i7 == 2) {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744700, stickerSet.title));
            } else {
                X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748595, stickerSet.title));
            }
            return r(document, X2, org.telegram.messenger.hd.M0(2131743564, null), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            c20Var.a(j12);
                            return;
                        default:
                            c20Var.a(j12);
                            return;
                    }
                }
            });
        }
        if (i7 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("TopicContainsEmojiPackSingle", null, 2131744023, "<{LOADING}>")));
        } else if (i7 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("StoryContainsEmojiPackSingle", null, 2131744700, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0("MessageContainsEmojiPackSingle", null, 2131748595, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        if (indexOf >= 0) {
            b80Var = new b80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), f6Var);
            spannableStringBuilder.setSpan(b80Var, indexOf, indexOf + 11, 33);
            int i10 = org.telegram.ui.ActionBar.k6.vj;
            b80Var.a(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 32), i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 72));
        } else {
            b80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.hd.M0(2131743564, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        c20Var.a(j12);
                        return;
                    default:
                        c20Var.a(j12);
                        return;
                }
            }
        };
        Context W = W();
        ?? kbVar = new kb(W, f6Var);
        w70 w70Var = new w70(W, null);
        kbVar.d = w70Var;
        w70Var.setDisablePaddingsOffset(true);
        w70Var.setSingleLine();
        w70Var.setTypeface(Typeface.SANS_SERIF);
        w70Var.setTextSize(1, 15.0f);
        w70Var.setEllipsize(TextUtils.TruncateAt.END);
        w70Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        kbVar.f35252b.setVisibility(8);
        kbVar.addView(w70Var, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.k6.vj;
        kbVar.setTextColor(kbVar.getThemedColor(i11));
        if (org.telegram.messenger.ij.D4(document)) {
            inputStickerSet = j12;
            org.telegram.ui.ActionBar.r6.t(kbVar.f35251a, i11, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = j12;
        }
        kbVar.e(document, new String[0]);
        kbVar.f35252b.setTextSize(1, 14.0f);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(3);
        w70Var.setText(spannableStringBuilder);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setSingleLine(false);
        w70Var.setMaxLines(3);
        ac acVar = new ac(W(), f6Var, true);
        acVar.e(M0);
        acVar.f31760b = runnable;
        kbVar.setButton(acVar);
        cc b10 = b(kbVar, 2750);
        if (b80Var != null) {
            gb gbVar = b10.f32523e;
            if (gbVar instanceof ib) {
                b80Var.f32070b = ((ib) gbVar).d;
            }
        }
        org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24459s0).l0(inputStickerSet, null, false, false, new bi.f4(i7, b10, currentTimeMillis));
        return b10;
    }

    public final cc i(String str) {
        if (!org.telegram.messenger.g0.I3()) {
            return new cc();
        }
        kb kbVar = new kb(W(), null);
        kbVar.c(2131623993, 36, 36, "NULL ROTATION", "Back", "Front");
        kbVar.f35252b.setText(str);
        return b(kbVar, 1500);
    }

    public final cc k(boolean z9) {
        if (!org.telegram.messenger.g0.I3()) {
            return new cc();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        if (z9) {
            zb zbVar = new zb(W(), f6Var);
            zbVar.c(2131624345, 36, 36, "Wibe", "Circle");
            zbVar.f40908b.setText(org.telegram.messenger.hd.M0(2131748920, null));
            zbVar.f40909c.setText(org.telegram.messenger.hd.M0(2131748918, null));
            return b(zbVar, 2750);
        }
        kb kbVar = new kb(W(), f6Var);
        kbVar.c(2131624345, 36, 36, "Wibe", "Circle");
        kbVar.f35252b.setText(org.telegram.messenger.hd.M0(2131748920, null));
        return b(kbVar, 1500);
    }

    public final cc m(gc gcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        kb kbVar;
        String M0;
        fc fcVar = gcVar.d;
        if (i10 != 0 && i11 != 0) {
            kbVar = new kb(i10, i11, W(), f6Var);
        } else {
            kbVar = new kb(W(), f6Var);
        }
        kbVar.d(fcVar.f33498a, fcVar.f33499b);
        TextView textView = kbVar.f35252b;
        String str = gcVar.f33890a;
        if (gcVar.f33892c) {
            M0 = org.telegram.messenger.hd.G(i7, str, new Object[0]);
        } else {
            M0 = org.telegram.messenger.hd.M0(gcVar.f33891b, str);
        }
        textView.setText(org.telegram.messenger.g0.U2(M0, new org.telegram.messenger.pd(20)));
        int i12 = fcVar.f33500c;
        if (i12 != 0) {
            kbVar.setIconPaddingBottom(i12);
        }
        return b(kbVar, 1500);
    }

    public final cc n(gc gcVar, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(gcVar, i7, 0, 0, f6Var);
    }

    public final cc o(gc gcVar, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(gcVar, 1, 0, 0, f6Var);
    }

    public final cc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        xb xbVar = new xb(W, f6Var);
        i5 i5Var = new i5(1, org.telegram.messenger.p10.f24459s0, j3);
        l9 l9Var = xbVar.f40245a;
        l9Var.setAnimatedEmojiDrawable(i5Var);
        l9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        xbVar.f40246b.setText(str);
        xbVar.f40247c.setText(str2);
        return b(xbVar, 2750);
    }

    public final cc q(TLRPC.Document document, CharSequence charSequence) {
        kb kbVar = new kb(W(), this.f34239c);
        if (org.telegram.messenger.ij.D4(document)) {
            org.telegram.ui.ActionBar.r6.t(kbVar.f35251a, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        kbVar.e(document, new String[0]);
        kbVar.f35252b.setText(charSequence);
        kbVar.f35252b.setTextSize(1, 14.0f);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(3);
        return b(kbVar, 2750);
    }

    public final cc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        kb kbVar = new kb(W, f6Var);
        if (org.telegram.messenger.ij.D4(document)) {
            org.telegram.ui.ActionBar.r6.t(kbVar.f35251a, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        kbVar.e(document, new String[0]);
        if (kbVar.f35251a.getImageReceiver() != null) {
            kbVar.f35251a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        kbVar.f35252b.setText(charSequence);
        kbVar.f35252b.setTextSize(1, 14.0f);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(3);
        ac acVar = new ac(W(), f6Var, true);
        acVar.e(str);
        acVar.f31760b = runnable;
        kbVar.setButton(acVar);
        return b(kbVar, 2750);
    }

    public final cc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i7;
        zb zbVar = new zb(W(), this.f34239c);
        boolean D4 = org.telegram.messenger.ij.D4(document);
        ch0 ch0Var = zbVar.f40907a;
        if (D4) {
            org.telegram.ui.ActionBar.r6.t(ch0Var, org.telegram.ui.ActionBar.k6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ch0Var.setAutoRepeat(true);
        ch0Var.g(36, 36, document);
        zbVar.f40908b.setText(str);
        zbVar.f40909c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(zbVar, i7);
    }

    public final cc t(CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        kb kbVar = new kb(W(), f6Var);
        kbVar.d(2131623981, new String[0]);
        kbVar.f35252b.setText(charSequence);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setMaxLines(2);
        return b(kbVar, 1500);
    }

    public final cc u(String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        zb zbVar = new zb(W(), f6Var);
        zbVar.c(2131623981, 32, 32, new String[0]);
        zbVar.f40908b.setText(str);
        zbVar.f40909c.setText(str2);
        return b(zbVar, 1500);
    }

    public final cc w(int i7, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        kb kbVar = new kb(W, f6Var);
        kbVar.setBackground(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, f6Var), 12);
        kbVar.f35251a.setImageResource(i7);
        kbVar.f35252b.setText(charSequence);
        kbVar.f35252b.setSingleLine(false);
        kbVar.f35252b.setLines(2);
        kbVar.f35252b.setMaxLines(4);
        TextView textView = kbVar.f35252b;
        textView.setMaxWidth(fi.m3.a(textView.getText(), kbVar.f35252b.getPaint()));
        kbVar.f35252b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) kbVar.f35252b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        kbVar.setWrapWidth();
        return b(kbVar, 5000);
    }

    public final cc y(int i7, TLRPC.Document document, jg.r rVar) {
        String M0;
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f34239c;
        kb kbVar = new kb(W, f6Var);
        kbVar.c(2131624285, 36, 36, new String[0]);
        kbVar.removeView(kbVar.f35252b);
        q5 q5Var = new q5(kbVar.getContext());
        kbVar.f35252b = q5Var;
        q5Var.setTypeface(Typeface.SANS_SERIF);
        kbVar.f35252b.setTextSize(1, 15.0f);
        kbVar.f35252b.setEllipsize(TextUtils.TruncateAt.END);
        kbVar.f35252b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new r5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = kbVar.f35252b;
        if (i7 > 1) {
            M0 = org.telegram.messenger.hd.G(i7, "SavedTagMessagesTagged", new Object[0]);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131745879, null);
        }
        textView.setText(new SpannableStringBuilder(M0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (rVar != null) {
            ac acVar = new ac(W(), f6Var, true);
            acVar.e(org.telegram.messenger.hd.M0(2131743564, null));
            acVar.f31760b = rVar;
            kbVar.setButton(acVar);
        }
        kbVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, f6Var));
        kbVar.addView(kbVar.f35252b, c8.ha.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(kbVar, 2750);
    }

    public hc(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f34238b = frameLayout;
        this.f34237a = null;
        this.f34239c = f6Var;
    }
}

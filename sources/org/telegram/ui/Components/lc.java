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
    public final org.telegram.ui.ActionBar.h2 f37091a;
    public final FrameLayout f37092b;
    public final org.telegram.ui.ActionBar.i6 f37093c;

    public lc(org.telegram.ui.ActionBar.h2 h2Var) {
        if (h2Var != null && h2Var.getLastStoryViewer() != null && h2Var.getLastStoryViewer().y()) {
            this.f37091a = null;
            fi.z3 currentPeerView = h2Var.getLastStoryViewer().f11986o0.getCurrentPeerView();
            this.f37092b = currentPeerView != null ? currentPeerView.M0 : null;
            this.f37093c = h2Var.getLastStoryViewer().E;
            return;
        }
        this.f37091a = h2Var;
        this.f37092b = null;
        this.f37093c = h2Var != null ? h2Var.getResourceProvider() : null;
    }

    public static gc A(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 4;
        }
        return z(h2Var, i7, 0, i6Var);
    }

    public static gc B(org.telegram.ui.ActionBar.h2 h2Var, boolean z10, bi.u4 u4Var, org.telegram.ui.he heVar, org.telegram.ui.ActionBar.i6 i6Var) {
        int i7;
        String str;
        int i10;
        int i11;
        ob obVar = new ob(h2Var.getParentActivity(), i6Var);
        if (z10) {
            i7 = 2131624055;
        } else {
            i7 = 2131624061;
        }
        obVar.c(i7, 28, 28, "Pin", "Line");
        TextView textView = obVar.f38055b;
        if (z10) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z10) {
            i10 = 2131748352;
        } else {
            i10 = 2131748274;
        }
        textView.setText(org.telegram.messenger.gd.M0(i10, str));
        if (!z10) {
            ec ecVar = new ec(h2Var.getParentActivity(), i6Var, true);
            ecVar.f34666b = u4Var;
            ecVar.f34667c = heVar;
            obVar.setButton(ecVar);
        }
        if (z10) {
            i11 = 1500;
        } else {
            i11 = 5000;
        }
        return gc.g(h2Var, obVar, i11);
    }

    public static gc C(String str, org.telegram.ui.ActionBar.h2 h2Var) {
        ob obVar = new ob(h2Var.getParentActivity(), h2Var.getResourceProvider());
        obVar.d(2131624049, "Shield");
        org.telegram.messenger.f3.q("UserSetAsAdminHint", null, 2131743443, new Object[]{str}, obVar.f38055b);
        return gc.g(h2Var, obVar, 1500);
    }

    public static gc D(org.telegram.ui.ActionBar.h2 h2Var, TLRPC.User user, String str) {
        String str2;
        ob obVar = new ob(h2Var.getParentActivity(), h2Var.getResourceProvider());
        obVar.d(2131624050, "Hand");
        if (user.deleted) {
            str2 = org.telegram.messenger.gd.a0("HiddenName", null, 2131749136, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        org.telegram.messenger.f3.q("UserRemovedFromChatHint", null, 2131743494, new Object[]{str2, str}, obVar.f38055b);
        return gc.g(h2Var, obVar, 1500);
    }

    public static gc F(FrameLayout frameLayout, boolean z10) {
        kc kcVar;
        lc lcVar = new lc(frameLayout, null);
        if (z10) {
            kcVar = kc.h;
        } else {
            kcVar = kc.f36726e;
        }
        return lcVar.m(kcVar, 1, -115203550, -1, null);
    }

    public static gc S(int i7, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        String M0;
        ob obVar = new ob(h2Var.getParentActivity(), i6Var);
        boolean z10 = true;
        if (i7 != 0) {
            if (i7 == 1) {
                M0 = org.telegram.messenger.gd.M0(2131745081, null);
                z10 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            M0 = org.telegram.messenger.gd.M0(2131745079, null);
        }
        if (z10) {
            obVar.d(2131624203, new String[0]);
        } else {
            obVar.d(2131624202, new String[0]);
        }
        obVar.f38055b.setText(M0);
        return gc.g(h2Var, obVar, 1500);
    }

    public static String W(String str) {
        if ("STARGIFT_ALREADY_TRANSFERRED".equals(str)) {
            return org.telegram.messenger.gd.M0(2131749736, null);
        }
        return org.telegram.messenger.gd.a0(null, null, 2131743641, str);
    }

    public static lc Y() {
        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
        if (T == null) {
            return new lc(cb.a(org.telegram.messenger.t0.f26915b), null);
        }
        Dialog dialog = T.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.x2) {
            return new lc(((org.telegram.ui.ActionBar.x2) dialog).f30195c, T.getResourceProvider());
        }
        return b0(T);
    }

    public static boolean a(org.telegram.ui.ActionBar.h2 h2Var) {
        if (h2Var != null && h2Var.getParentActivity() != null && h2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static lc a0(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        return new lc(frameLayout, i6Var);
    }

    public static lc b0(org.telegram.ui.ActionBar.h2 h2Var) {
        if (h2Var == null) {
            return Y();
        }
        return new lc(h2Var);
    }

    public static void c0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        Y().t(W(str), null).j();
    }

    public static gc d(org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        String M0;
        ob obVar = new ob(h2Var.getParentActivity(), h2Var.getResourceProvider());
        if (z10) {
            obVar.d(2131624050, "Hand");
            M0 = org.telegram.messenger.gd.M0(2131743524, null);
        } else {
            obVar.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.gd.M0(2131743438, null);
        }
        obVar.f38055b.setText(org.telegram.messenger.g0.W2(M0));
        return gc.g(h2Var, obVar, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            c0(str);
            return;
        }
        gc t6 = new lc(frameLayout, i6Var).t(W(str), null);
        t6.f35469r = false;
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

    public static gc j(org.telegram.ui.ActionBar.h2 h2Var) {
        return b0(h2Var).k(false);
    }

    public static gc l(String str, org.telegram.ui.ActionBar.h2 h2Var, boolean z10) {
        int i7;
        String M0;
        int i10;
        int i11;
        ob obVar = new ob(h2Var.getParentActivity(), h2Var.getResourceProvider());
        if (str != null) {
            if (z10) {
                i11 = 2131751401;
            } else {
                i11 = 2131751399;
            }
            M0 = org.telegram.messenger.gd.a0(null, null, i11, str);
        } else {
            if (z10) {
                i7 = 2131751402;
            } else {
                i7 = 2131751400;
            }
            M0 = org.telegram.messenger.gd.M0(i7, null);
        }
        obVar.f38055b.setText(org.telegram.messenger.g0.W2(M0));
        if (!z10 && str == null) {
            i10 = 2131623990;
        } else {
            i10 = 2131624007;
        }
        obVar.d(i10, new String[0]);
        return gc.g(h2Var, obVar, 5000);
    }

    public static gc v(Context context, org.telegram.ui.ActionBar.h2 h2Var, FrameLayout frameLayout, int i7, long j3, int i10, int i11, int i12, int i13, boolean z10, bi.m2 m2Var) {
        ob obVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z11;
        org.telegram.ui.ci ciVar;
        int i14;
        SpannableStringBuilder W2;
        gc g10;
        org.telegram.ui.ActionBar.i6 i6Var2;
        int i15;
        int i16;
        org.telegram.messenger.j2 j2Var;
        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q() && h2Var != null && i7 <= 1 && j3 == org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).f24792n && !z10) {
            obVar = new rb(i10, h2Var);
        } else {
            if (h2Var != null) {
                i6Var = h2Var.getResourceProvider();
            } else {
                i6Var = null;
            }
            obVar = new ob(i11, i12, context, i6Var);
        }
        ob obVar2 = obVar;
        if (m2Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (m2Var != null) {
            ciVar = new org.telegram.ui.ci(19, zArr, m2Var);
        } else {
            ciVar = null;
        }
        if (i7 <= 1) {
            if (j3 == org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).f24792n) {
                if (i10 <= 1) {
                    String M0 = org.telegram.messenger.gd.M0(2131750482, null);
                    if (z10) {
                        j2Var = new org.telegram.messenger.j2(29);
                    } else {
                        j2Var = new org.telegram.messenger.j2(27);
                    }
                    W2 = org.telegram.messenger.g0.R2(M0, -1, 2, j2Var, null);
                } else {
                    W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131750475, null), -1, 2, new org.telegram.messenger.j2(27), null);
                }
                obVar2.c(2131624191, 30, 30, new String[0]);
                i14 = 2;
            } else {
                i14 = 2;
                bi.m2 m2Var2 = new bi.m2(ciVar, h2Var, j3, 20);
                if (org.telegram.messenger.n5.z(j3)) {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).O0(Long.valueOf(-j3));
                    if (i10 <= 1) {
                        if (h2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131750486, O0.title), -1, 2, m2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750486, O0.title));
                        }
                    } else if (h2Var != null) {
                        W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, 2131750479, O0.title), -1, 2, m2Var2, null);
                    } else {
                        W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131750479, O0.title));
                    }
                } else {
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0).c2(Long.valueOf(j3));
                    if (i10 <= 1) {
                        if (z11) {
                            i16 = 2131750480;
                        } else {
                            i16 = 2131750481;
                        }
                        if (h2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, i16, org.telegram.messenger.o10.k(c22, true)), -1, 2, m2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i16, org.telegram.messenger.o10.k(c22, true)));
                        }
                    } else {
                        if (z11) {
                            i15 = 2131750473;
                        } else {
                            i15 = 2131750474;
                        }
                        if (h2Var != null) {
                            W2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.a0(null, null, i15, org.telegram.messenger.o10.k(c22, true)), -1, 2, m2Var2, null);
                        } else {
                            W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i15, org.telegram.messenger.o10.k(c22, true)));
                        }
                    }
                }
                obVar2.c(2131624029, 30, 30, new String[0]);
            }
        } else {
            i14 = 2;
            if (i10 <= 1) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "FwdMessageToManyChats", new Object[0]));
            } else {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "FwdMessagesToManyChats", new Object[0]));
            }
            obVar2.c(2131624029, 30, 30, new String[0]);
        }
        obVar2.f38055b.setText(W2);
        if (z11) {
            Context context2 = obVar2.getContext();
            if (h2Var != null) {
                i6Var2 = h2Var.getResourceProvider();
            } else {
                i6Var2 = null;
            }
            ec ecVar = new ec(context2, i6Var2, true, true);
            ecVar.f34666b = null;
            ecVar.f34667c = ciVar;
            obVar2.setButton(ecVar);
        }
        obVar2.postDelayed(new hc(obVar2, 1), 300);
        if (frameLayout != null) {
            g10 = gc.f(frameLayout, obVar2, i13);
        } else if (h2Var != null) {
            g10 = gc.g(h2Var, obVar2, i13);
        } else {
            throw new IllegalArgumentException();
        }
        if (obVar2 instanceof rb) {
            obVar2.f38055b.setSingleLine(false);
            obVar2.f38055b.setMaxLines(i14);
            ((rb) obVar2).setBulletin(g10);
            g10.f35469r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.gc x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.gc");
    }

    public static org.telegram.ui.Components.gc z(org.telegram.ui.ActionBar.h2 r6, int r7, int r8, org.telegram.ui.ActionBar.i6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lc.z(org.telegram.ui.ActionBar.h2, int, int, org.telegram.ui.ActionBar.i6):org.telegram.ui.Components.gc");
    }

    public final gc E(org.telegram.ui.ActionBar.i6 i6Var) {
        ob obVar = new ob(X(), i6Var);
        obVar.d(2131623982, new String[0]);
        obVar.f38055b.setText(org.telegram.messenger.gd.M0(2131746027, null));
        return b(obVar, 1500);
    }

    public final gc G(int i7, int i10, CharSequence charSequence) {
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        ob obVar = new ob(X(), this.f37093c);
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
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(i10);
        obVar.f38055b.setText(charSequence);
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
        dc dcVar = new dc(X(), this.f37093c);
        dcVar.c(i7, 36, 36, new String[0]);
        dcVar.f34370b.setText(charSequence);
        dcVar.f34371c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(dcVar, i10);
    }

    public final gc J(int i7, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        ob obVar = new ob(X, i6Var);
        if (i7 != 0) {
            obVar.c(i7, 36, 36, new String[0]);
        } else {
            obVar.f38054a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) obVar.f38055b.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(16.0f);
        }
        obVar.f38055b.setTextSize(1, 14.0f);
        obVar.f38055b.setTextDirection(5);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(3);
        obVar.f38055b.setText(charSequence);
        ec ecVar = new ec(X(), i6Var, true, z10);
        ecVar.e(charSequence2);
        ecVar.f34666b = runnable;
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        dc dcVar = new dc(X, i6Var);
        dcVar.c(i7, 36, 36, new String[0]);
        dcVar.f34370b.setText(str);
        dcVar.f34371c.setText(charSequence);
        ec ecVar = new ec(X(), i6Var, true);
        ecVar.e(str2);
        ecVar.f34666b = runnable;
        dcVar.setButton(ecVar);
        return b(dcVar, 5000);
    }

    public final gc M(Drawable drawable, CharSequence charSequence) {
        ob obVar = new ob(X(), this.f37093c);
        obVar.f38054a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.gm0) {
            ((org.telegram.ui.gm0) drawable).e(obVar.f38054a);
        }
        obVar.f38055b.setText(charSequence);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(2);
        return b(obVar, 2750);
    }

    public final gc N(String str, String str2) {
        dc dcVar = new dc(X(), this.f37093c);
        dcVar.f34369a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.g0.L(10.0f));
        dcVar.f34370b.setText(str);
        dcVar.f34371c.setText(str2);
        return b(dcVar, 5000);
    }

    public final gc O(TLRPC.Document document, String str, String str2) {
        int i7;
        if (document == null) {
            return new gc();
        }
        cc ccVar = new cc(X(), this.f37093c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.fc c11 = org.telegram.messenger.fc.c(w10, document);
        q9 q9Var = ccVar.f33963a;
        q9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ccVar.f33964b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = ccVar.f33965c;
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
        ob obVar = new ob(X(), this.f37093c);
        obVar.c(i7, 36, 36, new String[0]);
        obVar.f38055b.setText(charSequence);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setTextSize(1, 14.0f);
        obVar.f38055b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(obVar, i10);
    }

    public final gc Q(int i7, int i10, CharSequence charSequence) {
        int i11;
        ob obVar = new ob(X(), this.f37093c);
        obVar.c(i7, i10, i10, new String[0]);
        obVar.f38055b.setText(charSequence);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(2);
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
        cc ccVar = new cc(X(), this.f37093c);
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, null, false);
        org.telegram.messenger.fc c10 = org.telegram.messenger.fc.c(org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(28.0f), true, w10, true), document);
        org.telegram.messenger.fc c11 = org.telegram.messenger.fc.c(w10, document);
        q9 q9Var = ccVar.f33963a;
        q9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        q9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(5.0f));
        TextView textView = ccVar.f33964b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ccVar.f33965c.setVisibility(8);
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
        obVar.f38055b.setText(str);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        dc dcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        if (!isEmpty) {
            dc dcVar2 = new dc(X(), i6Var);
            dcVar2.f34370b.setText(str);
            dcVar2.f34371c.setText((CharSequence) null);
            dcVar = dcVar2;
        } else {
            ob obVar = new ob(X(), i6Var);
            obVar.f38055b.setText(str);
            obVar.f38055b.setSingleLine(false);
            obVar.f38055b.setMaxLines(2);
            dcVar = obVar;
        }
        dcVar.setTimer();
        ec ecVar = new ec(X(), i6Var, true, z10);
        ecVar.e(org.telegram.messenger.gd.M0(2131743648, null));
        ecVar.f34666b = runnable;
        ecVar.f34667c = runnable2;
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        fc fcVar = new fc(X, i6Var, z10);
        e9 e9Var = fcVar.f35063a;
        if (list != null) {
            int i10 = 0;
            i7 = 0;
            for (int i11 = 3; i10 < list.size() && i7 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i7 + 1;
                    e9Var.setCount(i12);
                    e9Var.b(i7, org.telegram.messenger.j10.f24773t0, tLObject);
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
        k80 k80Var = fcVar.f35064b;
        if (charSequence2 != null) {
            k80Var.setSingleLine(true);
            k80Var.setMaxLines(1);
            k80Var.setText(charSequence);
            k80 k80Var2 = fcVar.f35065c;
            k80Var2.setText(charSequence2);
            k80Var2.setSingleLine(false);
            k80Var2.setMaxLines(3);
            LinearLayout linearLayout = fcVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    L += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.gd.f24216a0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            k80Var.setSingleLine(false);
            k80Var.setMaxLines(4);
            k80Var.setText(charSequence);
            if (k80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.g0.L(70 - ((3 - i7) * 12));
                if (i7 == 1) {
                    k80Var.setTranslationY(-org.telegram.messenger.g0.L(1.0f));
                    L2 += org.telegram.messenger.g0.L(f10);
                }
                if (org.telegram.messenger.gd.f24216a0) {
                    ((ViewGroup.MarginLayoutParams) k80Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) k80Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (aVar != null) {
            ec ecVar = new ec(X(), i6Var, true);
            ecVar.e(org.telegram.messenger.gd.M0(2131743648, null));
            ecVar.f34666b = (Runnable) aVar.f18183b;
            ecVar.f34667c = (Runnable) aVar.f18184c;
            fcVar.setButton(ecVar);
        }
        return b(fcVar, 5000);
    }

    public final Context X() {
        Context context;
        org.telegram.ui.ActionBar.h2 h2Var = this.f37091a;
        if (h2Var != null) {
            context = h2Var.getParentActivity();
            if (context == null && this.f37091a.getLayoutContainer() != null) {
                context = this.f37091a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f37092b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return org.telegram.messenger.t0.f26915b;
        }
        return context;
    }

    public final gc Z(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new gc();
        }
        if (tL_error == null) {
            return t(org.telegram.messenger.gd.a0(null, null, 2131743642, new Object[0]), null);
        }
        return t(W(tL_error.text), null);
    }

    public final gc b(eb ebVar, int i7) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f37091a;
        if (h2Var != null) {
            return gc.g(h2Var, ebVar, i7);
        }
        return gc.f(this.f37092b, ebVar, i7);
    }

    public final gc c(CharSequence charSequence) {
        if (X() == null) {
            return new gc();
        }
        ob obVar = new ob(X(), this.f37093c);
        obVar.d(2131624049, "Shield");
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(3);
        obVar.f38055b.setText(charSequence);
        return b(obVar, 2750);
    }

    public final gc e(boolean z10) {
        String M0;
        ob obVar = new ob(X(), this.f37093c);
        if (z10) {
            obVar.d(2131624050, "Hand");
            M0 = org.telegram.messenger.gd.M0(2131743524, null);
        } else {
            obVar.d(2131624059, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            M0 = org.telegram.messenger.gd.M0(2131743438, null);
        }
        obVar.f38055b.setText(org.telegram.messenger.g0.W2(M0));
        return b(obVar, 1500);
    }

    public final gc f(int i7, Runnable runnable) {
        ob obVar = new ob(X(), null);
        obVar.d(2131623970, new String[0]);
        String G = org.telegram.messenger.gd.G(i7, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.g0.W2(G));
        int indexOf = G.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i10, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.w(2, runnable), indexOf, indexOf2 - 1, 33);
        obVar.f38055b.setText(valueOf);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(3);
        return b(obVar, 5000);
    }

    public final void f0(String str, boolean z10) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            gc t6 = t(org.telegram.messenger.gd.a0(null, null, 2131743642, new Object[0]), null);
            t6.f35469r = false;
            t6.k(z10);
            return;
        }
        gc t10 = t(W(str), null);
        t10.f35469r = false;
        t10.k(z10);
    }

    public final gc g(String str, ArrayList arrayList) {
        fc fcVar = new fc(X(), this.f37093c, false);
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i7 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i7 + 1;
                fcVar.f35063a.setCount(i11);
                fcVar.f35063a.b(i7, org.telegram.messenger.j10.f24773t0, tLObject);
                i7 = i11;
            }
        }
        if (arrayList.size() == 1) {
            fcVar.f35063a.setTranslationX(org.telegram.messenger.g0.L(4.0f));
            fcVar.f35063a.setScaleX(1.2f);
            fcVar.f35063a.setScaleY(1.2f);
        } else {
            fcVar.f35063a.setScaleX(1.0f);
            fcVar.f35063a.setScaleY(1.0f);
        }
        fcVar.f35063a.a(false);
        fcVar.f35064b.setSingleLine(false);
        fcVar.f35064b.setMaxLines(2);
        fcVar.f35064b.setText(str);
        if (fcVar.f35064b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.g0.L(74 - ((3 - i7) * 12));
            if (org.telegram.messenger.gd.f24216a0) {
                ((ViewGroup.MarginLayoutParams) fcVar.f35064b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) fcVar.f35064b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.gd.f24216a0) {
            fcVar.f35063a.setTranslationX(org.telegram.messenger.g0.L(32 - ((i7 - 1) * 12)));
        }
        return b(fcVar, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                gc t6 = t(org.telegram.messenger.gd.a0(null, null, 2131743642, new Object[0]), null);
                t6.f35469r = false;
                t6.k(z10);
            } else if (tL_error.code != 406) {
                gc t10 = t(W(tL_error.text), null);
                t10.f35469r = false;
                t10.k(z10);
            }
        }
    }

    public final gc h(TLRPC.Document document, int i7, final org.telegram.messenger.x10 x10Var) {
        SpannableStringBuilder spannableStringBuilder;
        p80 p80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder W2;
        final TLRPC.InputStickerSet i12 = org.telegram.messenger.fj.i1(document);
        if (i12 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).o0(i12, true);
        if (o02 != null && (stickerSet = o02.set) != null) {
            if (i7 == 1) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("TopicContainsEmojiPackSingle", null, 2131743787, stickerSet.title));
            } else if (i7 == 2) {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoryContainsEmojiPackSingle", null, 2131744464, stickerSet.title));
            } else {
                W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MessageContainsEmojiPackSingle", null, 2131748404, stickerSet.title));
            }
            return r(document, W2, org.telegram.messenger.gd.M0(2131743326, null), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            x10Var.a(i12);
                            return;
                        default:
                            x10Var.a(i12);
                            return;
                    }
                }
            });
        }
        if (i7 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("TopicContainsEmojiPackSingle", null, 2131743787, "<{LOADING}>")));
        } else if (i7 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("StoryContainsEmojiPackSingle", null, 2131744464, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("MessageContainsEmojiPackSingle", null, 2131748404, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        if (indexOf >= 0) {
            p80Var = new p80(null, org.telegram.messenger.g0.L(100.0f), org.telegram.messenger.g0.L(2.0f), i6Var);
            spannableStringBuilder.setSpan(p80Var, indexOf, indexOf + 11, 33);
            int i10 = org.telegram.ui.ActionBar.n6.yj;
            p80Var.a(i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 32), i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), 72));
        } else {
            p80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String M0 = org.telegram.messenger.gd.M0(2131743326, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        x10Var.a(i12);
                        return;
                    default:
                        x10Var.a(i12);
                        return;
                }
            }
        };
        Context X = X();
        ?? obVar = new ob(X, i6Var);
        k80 k80Var = new k80(X, null);
        obVar.d = k80Var;
        k80Var.setDisablePaddingsOffset(true);
        k80Var.setSingleLine();
        k80Var.setTypeface(Typeface.SANS_SERIF);
        k80Var.setTextSize(1, 15.0f);
        k80Var.setEllipsize(TextUtils.TruncateAt.END);
        k80Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
        obVar.f38055b.setVisibility(8);
        obVar.addView(k80Var, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.n6.yj;
        obVar.setTextColor(obVar.getThemedColor(i11));
        if (org.telegram.messenger.fj.C4(document)) {
            inputStickerSet = i12;
            org.telegram.ui.ActionBar.u6.s(obVar.f38054a, i11, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = i12;
        }
        obVar.e(document, new String[0]);
        obVar.f38055b.setTextSize(1, 14.0f);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(3);
        k80Var.setText(spannableStringBuilder);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setSingleLine(false);
        k80Var.setMaxLines(3);
        ec ecVar = new ec(X(), i6Var, true);
        ecVar.e(M0);
        ecVar.f34666b = runnable;
        obVar.setButton(ecVar);
        gc b10 = b(obVar, 2750);
        if (p80Var != null) {
            lb lbVar = b10.f35457e;
            if (lbVar instanceof nb) {
                p80Var.f38316b = ((nb) lbVar).d;
            }
        }
        org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).n0(inputStickerSet, null, false, false, new bi.y4(i7, b10, currentTimeMillis));
        return b10;
    }

    public final boolean h0(int i7, long j3) {
        org.telegram.ui.ActionBar.h2 h2Var;
        SpannableStringBuilder R2;
        if (org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).q() && (h2Var = this.f37091a) != null) {
            rb rbVar = new rb(i7, h2Var);
            if (j3 == org.telegram.messenger.j10.i(org.telegram.messenger.j10.f24773t0).f24792n) {
                if (i7 <= 1) {
                    R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131750482, null), -1, 2, new org.telegram.messenger.j2(27), null);
                } else {
                    R2 = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131750475, null), -1, 2, new org.telegram.messenger.j2(27), null);
                }
                rbVar.c(2131624191, 36, 36, new String[0]);
                rbVar.f38055b.setText(R2);
                rbVar.f38055b.setSingleLine(false);
                rbVar.f38055b.setMaxLines(2);
                gc b10 = b(rbVar, 3500);
                rbVar.setBulletin(b10);
                b10.f35469r = false;
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
        obVar.f38055b.setText(str);
        return b(obVar, 1500);
    }

    public final gc k(boolean z10) {
        if (!org.telegram.messenger.g0.G3()) {
            return new gc();
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        if (z10) {
            dc dcVar = new dc(X(), i6Var);
            dcVar.c(2131624346, 36, 36, "Wibe", "Circle");
            dcVar.f34370b.setText(org.telegram.messenger.gd.M0(2131748729, null));
            dcVar.f34371c.setText(org.telegram.messenger.gd.M0(2131748727, null));
            return b(dcVar, 2750);
        }
        ob obVar = new ob(X(), i6Var);
        obVar.c(2131624346, 36, 36, "Wibe", "Circle");
        obVar.f38055b.setText(org.telegram.messenger.gd.M0(2131748729, null));
        return b(obVar, 1500);
    }

    public final gc m(kc kcVar, int i7, int i10, int i11, org.telegram.ui.ActionBar.i6 i6Var) {
        ob obVar;
        String M0;
        jc jcVar = kcVar.d;
        if (i10 != 0 && i11 != 0) {
            obVar = new ob(i10, i11, X(), i6Var);
        } else {
            obVar = new ob(X(), i6Var);
        }
        obVar.d(jcVar.f36401a, jcVar.f36402b);
        TextView textView = obVar.f38055b;
        String str = kcVar.f36734a;
        if (kcVar.f36736c) {
            M0 = org.telegram.messenger.gd.G(i7, str, new Object[0]);
        } else {
            M0 = org.telegram.messenger.gd.M0(kcVar.f36735b, str);
        }
        textView.setText(org.telegram.messenger.g0.T2(M0, new org.telegram.messenger.j2(28)));
        int i12 = jcVar.f36403c;
        if (i12 != 0) {
            obVar.setIconPaddingBottom(i12);
        }
        return b(obVar, 1500);
    }

    public final gc n(kc kcVar, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return m(kcVar, i7, 0, 0, i6Var);
    }

    public final gc o(kc kcVar, org.telegram.ui.ActionBar.i6 i6Var) {
        return m(kcVar, 1, 0, 0, i6Var);
    }

    public final gc p(long j3, String str, String str2) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        bc bcVar = new bc(X, i6Var);
        o5 o5Var = new o5(1, org.telegram.messenger.j10.f24773t0, j3);
        q9 q9Var = bcVar.f33650a;
        q9Var.setAnimatedEmojiDrawable(o5Var);
        q9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var), PorterDuff.Mode.SRC_IN));
        bcVar.f33651b.setText(str);
        bcVar.f33652c.setText(str2);
        return b(bcVar, 2750);
    }

    public final gc q(TLRPC.Document document, CharSequence charSequence) {
        ob obVar = new ob(X(), this.f37093c);
        if (org.telegram.messenger.fj.C4(document)) {
            org.telegram.ui.ActionBar.u6.s(obVar.f38054a, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        obVar.e(document, new String[0]);
        obVar.f38055b.setText(charSequence);
        obVar.f38055b.setTextSize(1, 14.0f);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(3);
        return b(obVar, 2750);
    }

    public final gc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        ob obVar = new ob(X, i6Var);
        if (org.telegram.messenger.fj.C4(document)) {
            org.telegram.ui.ActionBar.u6.s(obVar.f38054a, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        obVar.e(document, new String[0]);
        if (obVar.f38054a.getImageReceiver() != null) {
            obVar.f38054a.getImageReceiver().J0(org.telegram.messenger.g0.L(4.0f));
        }
        obVar.f38055b.setText(charSequence);
        obVar.f38055b.setTextSize(1, 14.0f);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(3);
        ec ecVar = new ec(X(), i6Var, true);
        ecVar.e(str);
        ecVar.f34666b = runnable;
        obVar.setButton(ecVar);
        return b(obVar, 2750);
    }

    public final gc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i7;
        dc dcVar = new dc(X(), this.f37093c);
        boolean C4 = org.telegram.messenger.fj.C4(document);
        ph0 ph0Var = dcVar.f34369a;
        if (C4) {
            org.telegram.ui.ActionBar.u6.s(ph0Var, org.telegram.ui.ActionBar.n6.yj, null, PorterDuff.Mode.SRC_IN);
        }
        ph0Var.setAutoRepeat(true);
        ph0Var.g(36, 36, document);
        dcVar.f34370b.setText(str);
        dcVar.f34371c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i7 = 1500;
        } else {
            i7 = 2750;
        }
        return b(dcVar, i7);
    }

    public final gc t(CharSequence charSequence, org.telegram.ui.ActionBar.i6 i6Var) {
        ob obVar = new ob(X(), i6Var);
        obVar.d(2131623982, new String[0]);
        obVar.f38055b.setText(charSequence);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc u(String str, String str2, org.telegram.ui.ActionBar.i6 i6Var) {
        dc dcVar = new dc(X(), i6Var);
        dcVar.c(2131623982, 32, 32, new String[0]);
        dcVar.f34370b.setText(str);
        dcVar.f34371c.setText(str2);
        return b(dcVar, 1500);
    }

    public final gc w(int i7, CharSequence charSequence) {
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        ob obVar = new ob(X, i6Var);
        obVar.setBackground(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.wj, i6Var), 12);
        obVar.f38054a.setImageResource(i7);
        obVar.f38055b.setText(charSequence);
        obVar.f38055b.setSingleLine(false);
        obVar.f38055b.setLines(2);
        obVar.f38055b.setMaxLines(4);
        TextView textView = obVar.f38055b;
        textView.setMaxWidth(hi.m3.a(textView.getText(), obVar.f38055b.getPaint()));
        obVar.f38055b.setLineSpacing(org.telegram.messenger.g0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) obVar.f38055b.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        obVar.setWrapWidth();
        return b(obVar, 5000);
    }

    public final gc y(int i7, TLRPC.Document document, jg.q qVar) {
        String M0;
        Context X = X();
        org.telegram.ui.ActionBar.i6 i6Var = this.f37093c;
        ob obVar = new ob(X, i6Var);
        obVar.c(2131624286, 36, 36, new String[0]);
        obVar.removeView(obVar.f38055b);
        w5 w5Var = new w5(obVar.getContext());
        obVar.f38055b = w5Var;
        w5Var.setTypeface(Typeface.SANS_SERIF);
        obVar.f38055b.setTextSize(1, 15.0f);
        obVar.f38055b.setEllipsize(TextUtils.TruncateAt.END);
        obVar.f38055b.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new x5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = obVar.f38055b;
        if (i7 > 1) {
            M0 = org.telegram.messenger.gd.G(i7, "SavedTagMessagesTagged", new Object[0]);
        } else {
            M0 = org.telegram.messenger.gd.M0(2131745683, null);
        }
        textView.setText(new SpannableStringBuilder(M0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (qVar != null) {
            ec ecVar = new ec(X(), i6Var, true);
            ecVar.e(org.telegram.messenger.gd.M0(2131743326, null));
            ecVar.f34666b = qVar;
            obVar.setButton(ecVar);
        }
        obVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.yj, i6Var));
        obVar.addView(obVar.f38055b, c8.ma.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(obVar, 2750);
    }

    public lc(FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f37092b = frameLayout;
        this.f37091a = null;
        this.f37093c = i6Var;
    }
}

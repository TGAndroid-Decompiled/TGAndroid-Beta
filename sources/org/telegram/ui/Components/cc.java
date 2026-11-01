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
    public final org.telegram.ui.ActionBar.k2 f25076a;
    public final FrameLayout f25077b;
    public final org.telegram.ui.ActionBar.p6 f25078c;

    public cc(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var != null && k2Var.getLastStoryViewer() != null && k2Var.getLastStoryViewer().z()) {
            this.f25076a = null;
            th.z2 currentPeerView = k2Var.getLastStoryViewer().f49333n0.getCurrentPeerView();
            this.f25077b = currentPeerView != null ? currentPeerView.L0 : null;
            this.f25078c = k2Var.getLastStoryViewer().D;
            return;
        }
        this.f25076a = k2Var;
        this.f25077b = null;
        this.f25078c = k2Var != null ? k2Var.getResourceProvider() : null;
    }

    public static wb A(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(k2Var, i10, 0, p6Var);
    }

    public static wb B(org.telegram.ui.ActionBar.k2 k2Var, boolean z10, ag.g3 g3Var, org.telegram.ui.ue ueVar, org.telegram.ui.ActionBar.p6 p6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        eb ebVar = new eb(k2Var.getParentActivity(), p6Var);
        if (z10) {
            i10 = 2131624053;
        } else {
            i10 = 2131624059;
        }
        ebVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = ebVar.f25779b;
        if (z10) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z10) {
            i11 = 2131748559;
        } else {
            i11 = 2131748481;
        }
        textView.setText(org.telegram.messenger.dd.L0(i11, str));
        if (!z10) {
            ub ubVar = new ub(k2Var.getParentActivity(), p6Var, true);
            ubVar.f30924b = g3Var;
            ubVar.f30925c = ueVar;
            ebVar.setButton(ubVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return wb.g(k2Var, ebVar, i12);
    }

    public static wb C(String str, org.telegram.ui.ActionBar.k2 k2Var) {
        eb ebVar = new eb(k2Var.getParentActivity(), k2Var.getResourceProvider());
        ebVar.d(2131624047, "Shield");
        org.telegram.messenger.m5.q("UserSetAsAdminHint", null, 2131743706, new Object[]{str}, ebVar.f25779b);
        return wb.g(k2Var, ebVar, 1500);
    }

    public static wb D(org.telegram.ui.ActionBar.k2 k2Var, TLRPC.User user, String str) {
        String str2;
        eb ebVar = new eb(k2Var.getParentActivity(), k2Var.getResourceProvider());
        ebVar.d(2131624048, "Hand");
        if (user.deleted) {
            str2 = org.telegram.messenger.dd.a0("HiddenName", null, 2131749337, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        org.telegram.messenger.m5.q("UserRemovedFromChatHint", null, 2131743757, new Object[]{str2, str}, ebVar.f25779b);
        return wb.g(k2Var, ebVar, 1500);
    }

    public static wb F(FrameLayout frameLayout, boolean z10) {
        bc bcVar;
        cc ccVar = new cc(frameLayout, null);
        if (z10) {
            bcVar = bc.h;
        } else {
            bcVar = bc.e;
        }
        return ccVar.m(bcVar, 1, -115203550, -1, null);
    }

    public static wb S(int i10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        String L0;
        eb ebVar = new eb(k2Var.getParentActivity(), p6Var);
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                L0 = org.telegram.messenger.dd.L0(2131745294, null);
                z10 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            L0 = org.telegram.messenger.dd.L0(2131745292, null);
        }
        if (z10) {
            ebVar.d(2131624200, new String[0]);
        } else {
            ebVar.d(2131624199, new String[0]);
        }
        ebVar.f25779b.setText(L0);
        return wb.g(k2Var, ebVar, 1500);
    }

    public static cc X() {
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return new cc(ra.a(org.telegram.messenger.w0.f18945b), null);
        }
        Dialog dialog = T.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.z2) {
            return new cc(((org.telegram.ui.ActionBar.z2) dialog).f21590c, T.getResourceProvider());
        }
        return a0(T);
    }

    public static cc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var) {
        return new cc(frameLayout, p6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var != null && k2Var.getParentActivity() != null && k2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static cc a0(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var == null) {
            return X();
        }
        return new cc(k2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        X().t(org.telegram.messenger.dd.a0(null, null, 2131743903, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        wb t10 = new cc(frameLayout, p6Var).t(org.telegram.messenger.dd.a0(null, null, 2131743903, str), null);
        t10.f32209r = false;
        t10.j();
    }

    public static wb d(org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        String L0;
        eb ebVar = new eb(k2Var.getParentActivity(), k2Var.getResourceProvider());
        if (z10) {
            ebVar.d(2131624048, "Hand");
            L0 = org.telegram.messenger.dd.L0(2131743787, null);
        } else {
            ebVar.d(2131624057, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            L0 = org.telegram.messenger.dd.L0(2131743701, null);
        }
        ebVar.f25779b.setText(org.telegram.messenger.i0.W2(L0));
        return wb.g(k2Var, ebVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(org.telegram.messenger.dd.a0(null, null, 2131743903, tL_error.text), null).j();
        }
    }

    public static wb j(org.telegram.ui.ActionBar.k2 k2Var) {
        return a0(k2Var).k(false);
    }

    public static wb l(String str, org.telegram.ui.ActionBar.k2 k2Var, boolean z10) {
        int i10;
        String L0;
        int i11;
        int i12;
        eb ebVar = new eb(k2Var.getParentActivity(), k2Var.getResourceProvider());
        if (str != null) {
            if (z10) {
                i12 = 2131751413;
            } else {
                i12 = 2131751411;
            }
            L0 = org.telegram.messenger.dd.a0(null, null, i12, str);
        } else {
            if (z10) {
                i10 = 2131751414;
            } else {
                i10 = 2131751412;
            }
            L0 = org.telegram.messenger.dd.L0(i10, null);
        }
        ebVar.f25779b.setText(org.telegram.messenger.i0.W2(L0));
        if (!z10 && str == null) {
            i11 = 2131623989;
        } else {
            i11 = 2131624006;
        }
        ebVar.d(i11, new String[0]);
        return wb.g(k2Var, ebVar, 5000);
    }

    public static wb v(Context context, org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, a3.i0 i0Var) {
        eb ebVar;
        org.telegram.ui.ActionBar.p6 p6Var;
        boolean z11;
        org.telegram.ui.ch chVar;
        int i15;
        SpannableStringBuilder W2;
        wb g10;
        org.telegram.ui.ActionBar.p6 p6Var2;
        int i16;
        int i17;
        org.telegram.messenger.sz szVar;
        if (org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q() && k2Var != null && i10 <= 1 && j10 == org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f15524n && !z10) {
            ebVar = new hb(i11, k2Var);
        } else {
            if (k2Var != null) {
                p6Var = k2Var.getResourceProvider();
            } else {
                p6Var = null;
            }
            ebVar = new eb(i12, i13, context, p6Var);
        }
        eb ebVar2 = ebVar;
        if (i0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (i0Var != null) {
            chVar = new org.telegram.ui.ch(28, zArr, i0Var);
        } else {
            chVar = null;
        }
        if (i10 <= 1) {
            if (j10 == org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f15524n) {
                if (i11 <= 1) {
                    String L0 = org.telegram.messenger.dd.L0(2131750507, null);
                    if (z10) {
                        szVar = new org.telegram.messenger.sz(12);
                    } else {
                        szVar = new org.telegram.messenger.sz(10);
                    }
                    W2 = org.telegram.messenger.i0.R2(L0, -1, 2, szVar, null);
                } else {
                    W2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131750500, null), -1, 2, new org.telegram.messenger.sz(10), null);
                }
                ebVar2.c(2131624188, 30, 30, new String[0]);
                i15 = 2;
            } else {
                i15 = 2;
                a3.i0 i0Var2 = new a3.i0(chVar, k2Var, j10, 10);
                if (org.telegram.messenger.o5.z(j10)) {
                    TLRPC.Chat L02 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).L0(Long.valueOf(-j10));
                    if (i11 <= 1) {
                        if (k2Var != null) {
                            W2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.a0(null, null, 2131750511, L02.title), -1, 2, i0Var2, null);
                        } else {
                            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131750511, L02.title));
                        }
                    } else if (k2Var != null) {
                        W2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.a0(null, null, 2131750504, L02.title), -1, 2, i0Var2, null);
                    } else {
                        W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, 2131750504, L02.title));
                    }
                } else {
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.f15506s0).Z1(Long.valueOf(j10));
                    if (i11 <= 1) {
                        if (z11) {
                            i17 = 2131750505;
                        } else {
                            i17 = 2131750506;
                        }
                        if (k2Var != null) {
                            W2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.a0(null, null, i17, org.telegram.messenger.i20.j(Z1, true)), -1, 2, i0Var2, null);
                        } else {
                            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, i17, org.telegram.messenger.i20.j(Z1, true)));
                        }
                    } else {
                        if (z11) {
                            i16 = 2131750498;
                        } else {
                            i16 = 2131750499;
                        }
                        if (k2Var != null) {
                            W2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.a0(null, null, i16, org.telegram.messenger.i20.j(Z1, true)), -1, 2, i0Var2, null);
                        } else {
                            W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, i16, org.telegram.messenger.i20.j(Z1, true)));
                        }
                    }
                }
                ebVar2.c(2131624027, 30, 30, new String[0]);
            }
        } else {
            i15 = 2;
            if (i11 <= 1) {
                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(i10, "FwdMessageToManyChats", new Object[0]));
            } else {
                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(i10, "FwdMessagesToManyChats", new Object[0]));
            }
            ebVar2.c(2131624027, 30, 30, new String[0]);
        }
        ebVar2.f25779b.setText(W2);
        if (z11) {
            Context context2 = ebVar2.getContext();
            if (k2Var != null) {
                p6Var2 = k2Var.getResourceProvider();
            } else {
                p6Var2 = null;
            }
            ub ubVar = new ub(context2, p6Var2, true, true);
            ubVar.f30924b = null;
            ubVar.f30925c = chVar;
            ebVar2.setButton(ubVar);
        }
        ebVar2.postDelayed(new xb(ebVar2, 1), 300);
        if (frameLayout != null) {
            g10 = wb.f(frameLayout, ebVar2, i14);
        } else if (k2Var != null) {
            g10 = wb.g(k2Var, ebVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (ebVar2 instanceof hb) {
            ebVar2.f25779b.setSingleLine(false);
            ebVar2.f25779b.setMaxLines(i15);
            ((hb) ebVar2).setBulletin(g10);
            g10.f32209r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.wb x(android.app.Activity r7, android.widget.FrameLayout r8, int r9, long r10, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.wb");
    }

    public static org.telegram.ui.Components.wb z(org.telegram.ui.ActionBar.k2 r6, int r7, int r8, org.telegram.ui.ActionBar.p6 r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cc.z(org.telegram.ui.ActionBar.k2, int, int, org.telegram.ui.ActionBar.p6):org.telegram.ui.Components.wb");
    }

    public final wb E(org.telegram.ui.ActionBar.p6 p6Var) {
        eb ebVar = new eb(W(), p6Var);
        ebVar.d(2131623981, new String[0]);
        ebVar.f25779b.setText(org.telegram.messenger.dd.L0(2131746239, null));
        return b(ebVar, 1500);
    }

    public final wb G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        eb ebVar = new eb(W(), this.f25078c);
        ebVar.c(i10, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            }
            int i13 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i13 >= i11) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i13++;
            }
            charSequence = spannableStringBuilder;
        }
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(i11);
        ebVar.f25779b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(ebVar, i12);
    }

    public final wb H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final wb I(int i10, CharSequence charSequence, CharSequence charSequence2) {
        int i11;
        tb tbVar = new tb(W(), this.f25078c);
        tbVar.c(i10, 36, 36, new String[0]);
        tbVar.f30619b.setText(charSequence);
        tbVar.f30620c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(tbVar, i11);
    }

    public final wb J(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        eb ebVar = new eb(W, p6Var);
        if (i10 != 0) {
            ebVar.c(i10, 36, 36, new String[0]);
        } else {
            ebVar.f25778a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ebVar.f25779b.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(16.0f);
        }
        ebVar.f25779b.setTextSize(1, 14.0f);
        ebVar.f25779b.setTextDirection(5);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(3);
        ebVar.f25779b.setText(charSequence);
        ub ubVar = new ub(W(), p6Var, true, z10);
        ubVar.e(charSequence2);
        ubVar.f30924b = runnable;
        ebVar.setButton(ubVar);
        return b(ebVar, i11);
    }

    public final wb K(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return J(i10, charSequence, str, i11, false, runnable);
    }

    public final wb L(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        tb tbVar = new tb(W, p6Var);
        tbVar.c(i10, 36, 36, new String[0]);
        tbVar.f30619b.setText(str);
        tbVar.f30620c.setText(charSequence);
        ub ubVar = new ub(W(), p6Var, true);
        ubVar.e(str2);
        ubVar.f30924b = runnable;
        tbVar.setButton(ubVar);
        return b(tbVar, 5000);
    }

    public final wb M(Drawable drawable, CharSequence charSequence) {
        eb ebVar = new eb(W(), this.f25078c);
        ebVar.f25778a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.mn0) {
            ((org.telegram.ui.mn0) drawable).e(ebVar.f25778a);
        }
        ebVar.f25779b.setText(charSequence);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(2);
        return b(ebVar, 2750);
    }

    public final wb N(String str, String str2) {
        tb tbVar = new tb(W(), this.f25078c);
        tbVar.f30618a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) tbVar.d.getLayoutParams()).setMarginStart(org.telegram.messenger.i0.L(10.0f));
        tbVar.f30619b.setText(str);
        tbVar.f30620c.setText(str2);
        return b(tbVar, 5000);
    }

    public final wb O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new wb();
        }
        sb sbVar = new sb(W(), this.f25078c);
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(28.0f), true, null, false);
        org.telegram.messenger.jc c10 = org.telegram.messenger.jc.c(org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(28.0f), true, w9, true), document);
        org.telegram.messenger.jc c11 = org.telegram.messenger.jc.c(w9, document);
        g9 g9Var = sbVar.f30254a;
        g9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(5.0f));
        TextView textView = sbVar.f30255b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        TextView textView2 = sbVar.f30256c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(sbVar, i10);
    }

    public final wb P(int i10, CharSequence charSequence) {
        int i11;
        eb ebVar = new eb(W(), this.f25078c);
        ebVar.c(i10, 36, 36, new String[0]);
        ebVar.f25779b.setText(charSequence);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setTextSize(1, 14.0f);
        ebVar.f25779b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ebVar, i11);
    }

    public final wb Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        eb ebVar = new eb(W(), this.f25078c);
        ebVar.c(i10, i11, i11, new String[0]);
        ebVar.f25779b.setText(charSequence);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(ebVar, i12);
    }

    public final wb R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new wb();
        }
        sb sbVar = new sb(W(), this.f25078c);
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(28.0f), true, null, false);
        org.telegram.messenger.jc c10 = org.telegram.messenger.jc.c(org.telegram.messenger.b8.w(document.thumbs, org.telegram.messenger.i0.L(28.0f), true, w9, true), document);
        org.telegram.messenger.jc c11 = org.telegram.messenger.jc.c(w9, document);
        g9 g9Var = sbVar.f30254a;
        g9Var.g(0, 0L, null, "28_28", "28_28", null, c10, c11);
        g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(5.0f));
        TextView textView = sbVar.f30255b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        sbVar.f30256c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(sbVar, i10);
    }

    public final wb T(String str) {
        eb ebVar = new eb(W(), null);
        ebVar.d(2131623989, new String[0]);
        ebVar.f25779b.setText(str);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(2);
        return b(ebVar, 1500);
    }

    public final wb U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        tb tbVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        if (!isEmpty) {
            tb tbVar2 = new tb(W(), p6Var);
            tbVar2.f30619b.setText(str);
            tbVar2.f30620c.setText((CharSequence) null);
            tbVar = tbVar2;
        } else {
            eb ebVar = new eb(W(), p6Var);
            ebVar.f25779b.setText(str);
            ebVar.f25779b.setSingleLine(false);
            ebVar.f25779b.setMaxLines(2);
            tbVar = ebVar;
        }
        tbVar.setTimer();
        ub ubVar = new ub(W(), p6Var, true, z10);
        ubVar.e(org.telegram.messenger.dd.L0(2131743910, null));
        ubVar.f30924b = runnable;
        ubVar.f30925c = runnable2;
        tbVar.setButton(ubVar);
        return b(tbVar, 5000);
    }

    public final wb V(List list, CharSequence charSequence, CharSequence charSequence2, m4.c cVar) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        vb vbVar = new vb(W, p6Var, z10);
        u8 u8Var = vbVar.f31241a;
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    u8Var.setCount(i13);
                    u8Var.b(i10, org.telegram.messenger.e20.f15506s0, tLObject);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                u8Var.setTranslationX(org.telegram.messenger.i0.L(4.0f));
                u8Var.setScaleX(1.2f);
                u8Var.setScaleY(1.2f);
            } else {
                u8Var.setScaleX(1.0f);
                u8Var.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        u8Var.a(false);
        p80 p80Var = vbVar.f31242b;
        if (charSequence2 != null) {
            p80Var.setSingleLine(true);
            p80Var.setMaxLines(1);
            p80Var.setText(charSequence);
            p80 p80Var2 = vbVar.f31243c;
            p80Var2.setText(charSequence2);
            p80Var2.setSingleLine(false);
            p80Var2.setMaxLines(3);
            LinearLayout linearLayout = vbVar.d;
            if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L = org.telegram.messenger.i0.L(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    L += org.telegram.messenger.i0.L(f7);
                }
                if (org.telegram.messenger.dd.X) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).rightMargin = L;
                } else {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).leftMargin = L;
                }
            }
        } else {
            p80Var.setSingleLine(false);
            p80Var.setMaxLines(4);
            p80Var.setText(charSequence);
            if (p80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int L2 = org.telegram.messenger.i0.L(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    p80Var.setTranslationY(-org.telegram.messenger.i0.L(1.0f));
                    L2 += org.telegram.messenger.i0.L(f7);
                }
                if (org.telegram.messenger.dd.X) {
                    ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).rightMargin = L2;
                } else {
                    ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).leftMargin = L2;
                }
            }
        }
        if (cVar != null) {
            ub ubVar = new ub(W(), p6Var, true);
            ubVar.e(org.telegram.messenger.dd.L0(2131743910, null));
            ubVar.f30924b = (Runnable) cVar.f12706b;
            ubVar.f30925c = (Runnable) cVar.f12707c;
            vbVar.setButton(ubVar);
        }
        return b(vbVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.k2 k2Var = this.f25076a;
        if (k2Var != null) {
            context = k2Var.getParentActivity();
            if (context == null && this.f25076a.getLayoutContainer() != null) {
                context = this.f25076a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f25077b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return org.telegram.messenger.w0.f18945b;
        }
        return context;
    }

    public final wb Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new wb();
        }
        if (tL_error == null) {
            return t(org.telegram.messenger.dd.a0(null, null, 2131743904, new Object[0]), null);
        }
        return t(org.telegram.messenger.dd.a0(null, null, 2131743903, tL_error.text), null);
    }

    public final wb b(ta taVar, int i10) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f25076a;
        if (k2Var != null) {
            return wb.g(k2Var, taVar, i10);
        }
        return wb.f(this.f25077b, taVar, i10);
    }

    public final wb c(CharSequence charSequence) {
        if (W() == null) {
            return new wb();
        }
        eb ebVar = new eb(W(), this.f25078c);
        ebVar.d(2131624047, "Shield");
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(3);
        ebVar.f25779b.setText(charSequence);
        return b(ebVar, 2750);
    }

    public final wb e(boolean z10) {
        String L0;
        eb ebVar = new eb(W(), this.f25078c);
        if (z10) {
            ebVar.d(2131624048, "Hand");
            L0 = org.telegram.messenger.dd.L0(2131743787, null);
        } else {
            ebVar.d(2131624057, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            L0 = org.telegram.messenger.dd.L0(2131743701, null);
        }
        ebVar.f25779b.setText(org.telegram.messenger.i0.W2(L0));
        return b(ebVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            wb t10 = t(org.telegram.messenger.dd.a0(null, null, 2131743904, new Object[0]), null);
            t10.f32209r = false;
            t10.k(z10);
            return;
        }
        wb t11 = t(org.telegram.messenger.dd.a0(null, null, 2131743903, str), null);
        t11.f32209r = false;
        t11.k(z10);
    }

    public final wb f(int i10, Runnable runnable) {
        eb ebVar = new eb(W(), null);
        ebVar.d(2131623970, new String[0]);
        String G = org.telegram.messenger.dd.G(i10, "ChannelCaptionLimitPremiumPromo", new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.i0.W2(G));
        int indexOf = G.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = G.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) G.substring(i11, indexOf2));
        valueOf.setSpan(new org.telegram.messenger.y(2, runnable), indexOf, indexOf2 - 1, 33);
        ebVar.f25779b.setText(valueOf);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(3);
        return b(ebVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                wb t10 = t(org.telegram.messenger.dd.a0(null, null, 2131743904, new Object[0]), null);
                t10.f32209r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                wb t11 = t(org.telegram.messenger.dd.a0(null, null, 2131743903, tL_error.text), null);
                t11.f32209r = false;
                t11.k(z10);
            }
        }
    }

    public final wb g(String str, ArrayList arrayList) {
        vb vbVar = new vb(W(), this.f25078c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                vbVar.f31241a.setCount(i12);
                vbVar.f31241a.b(i10, org.telegram.messenger.e20.f15506s0, tLObject);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            vbVar.f31241a.setTranslationX(org.telegram.messenger.i0.L(4.0f));
            vbVar.f31241a.setScaleX(1.2f);
            vbVar.f31241a.setScaleY(1.2f);
        } else {
            vbVar.f31241a.setScaleX(1.0f);
            vbVar.f31241a.setScaleY(1.0f);
        }
        vbVar.f31241a.a(false);
        vbVar.f31242b.setSingleLine(false);
        vbVar.f31242b.setMaxLines(2);
        vbVar.f31242b.setText(str);
        if (vbVar.f31242b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int L = org.telegram.messenger.i0.L(74 - ((3 - i10) * 12));
            if (org.telegram.messenger.dd.X) {
                ((ViewGroup.MarginLayoutParams) vbVar.f31242b.getLayoutParams()).rightMargin = L;
            } else {
                ((ViewGroup.MarginLayoutParams) vbVar.f31242b.getLayoutParams()).leftMargin = L;
            }
        }
        if (org.telegram.messenger.dd.X) {
            vbVar.f31241a.setTranslationX(org.telegram.messenger.i0.L(32 - ((i10 - 1) * 12)));
        }
        return b(vbVar, 5000);
    }

    public final boolean g0(int i10, long j10) {
        org.telegram.ui.ActionBar.k2 k2Var;
        SpannableStringBuilder R2;
        if (org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).q() && (k2Var = this.f25076a) != null) {
            hb hbVar = new hb(i10, k2Var);
            if (j10 == org.telegram.messenger.e20.i(org.telegram.messenger.e20.f15506s0).f15524n) {
                if (i10 <= 1) {
                    R2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131750507, null), -1, 2, new org.telegram.messenger.sz(10), null);
                } else {
                    R2 = org.telegram.messenger.i0.R2(org.telegram.messenger.dd.L0(2131750500, null), -1, 2, new org.telegram.messenger.sz(10), null);
                }
                hbVar.c(2131624188, 36, 36, new String[0]);
                hbVar.f25779b.setText(R2);
                hbVar.f25779b.setSingleLine(false);
                hbVar.f25779b.setMaxLines(2);
                wb b10 = b(hbVar, 3500);
                hbVar.setBulletin(b10);
                b10.f32209r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final wb h(TLRPC.Document document, int i10, final org.telegram.messenger.r20 r20Var) {
        SpannableStringBuilder spannableStringBuilder;
        u80 u80Var;
        TLRPC.InputStickerSet inputStickerSet;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder W2;
        final TLRPC.InputStickerSet j12 = org.telegram.messenger.kj.j1(document);
        if (j12 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).m0(j12, true);
        if (m0 != null && (stickerSet = m0.set) != null) {
            if (i10 == 1) {
                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("TopicContainsEmojiPackSingle", null, 2131744047, stickerSet.title));
            } else if (i10 == 2) {
                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("StoryContainsEmojiPackSingle", null, 2131744717, stickerSet.title));
            } else {
                W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("MessageContainsEmojiPackSingle", null, 2131748611, stickerSet.title));
            }
            return r(document, W2, org.telegram.messenger.dd.L0(2131743589, null), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            r20Var.a(j12);
                            return;
                        default:
                            r20Var.a(j12);
                            return;
                    }
                }
            });
        }
        if (i10 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("TopicContainsEmojiPackSingle", null, 2131744047, "<{LOADING}>")));
        } else if (i10 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("StoryContainsEmojiPackSingle", null, 2131744717, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("MessageContainsEmojiPackSingle", null, 2131748611, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        if (indexOf >= 0) {
            u80Var = new u80(null, org.telegram.messenger.i0.L(100.0f), org.telegram.messenger.i0.L(2.0f), p6Var);
            spannableStringBuilder.setSpan(u80Var, indexOf, indexOf + 11, 33);
            int i11 = org.telegram.ui.ActionBar.t6.vj;
            u80Var.a(i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 32), i0.b.o(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 72));
        } else {
            u80Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String L0 = org.telegram.messenger.dd.L0(2131743589, null);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        r20Var.a(j12);
                        return;
                    default:
                        r20Var.a(j12);
                        return;
                }
            }
        };
        Context W = W();
        ?? ebVar = new eb(W, p6Var);
        p80 p80Var = new p80(W, null);
        ebVar.d = p80Var;
        p80Var.setDisablePaddingsOffset(true);
        p80Var.setSingleLine();
        p80Var.setTypeface(Typeface.SANS_SERIF);
        p80Var.setTextSize(1, 15.0f);
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        p80Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        ebVar.f25779b.setVisibility(8);
        ebVar.addView(p80Var, w7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.t6.vj;
        ebVar.setTextColor(ebVar.getThemedColor(i12));
        if (org.telegram.messenger.kj.C4(document)) {
            inputStickerSet = j12;
            org.telegram.ui.ActionBar.a7.t(ebVar.f25778a, i12, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = j12;
        }
        ebVar.e(document, new String[0]);
        ebVar.f25779b.setTextSize(1, 14.0f);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(3);
        p80Var.setText(spannableStringBuilder);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(false);
        p80Var.setMaxLines(3);
        ub ubVar = new ub(W(), p6Var, true);
        ubVar.e(L0);
        ubVar.f30924b = runnable;
        ebVar.setButton(ubVar);
        wb b10 = b(ebVar, 2750);
        if (u80Var != null) {
            bb bbVar = b10.e;
            if (bbVar instanceof db) {
                u80Var.f30901b = ((db) bbVar).d;
            }
        }
        org.telegram.messenger.vi.b0(org.telegram.messenger.e20.f15506s0).l0(inputStickerSet, null, false, false, new zb(i10, b10, currentTimeMillis));
        return b10;
    }

    public final wb i(String str) {
        if (!org.telegram.messenger.i0.H3()) {
            return new wb();
        }
        eb ebVar = new eb(W(), null);
        ebVar.c(2131623993, 36, 36, "NULL ROTATION", "Back", "Front");
        ebVar.f25779b.setText(str);
        return b(ebVar, 1500);
    }

    public final wb k(boolean z10) {
        if (!org.telegram.messenger.i0.H3()) {
            return new wb();
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        if (z10) {
            tb tbVar = new tb(W(), p6Var);
            tbVar.c(2131624343, 36, 36, "Wibe", "Circle");
            tbVar.f30619b.setText(org.telegram.messenger.dd.L0(2131748931, null));
            tbVar.f30620c.setText(org.telegram.messenger.dd.L0(2131748929, null));
            return b(tbVar, 2750);
        }
        eb ebVar = new eb(W(), p6Var);
        ebVar.c(2131624343, 36, 36, "Wibe", "Circle");
        ebVar.f25779b.setText(org.telegram.messenger.dd.L0(2131748931, null));
        return b(ebVar, 1500);
    }

    public final wb m(bc bcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.p6 p6Var) {
        eb ebVar;
        String L0;
        ac acVar = bcVar.d;
        if (i11 != 0 && i12 != 0) {
            ebVar = new eb(i11, i12, W(), p6Var);
        } else {
            ebVar = new eb(W(), p6Var);
        }
        ebVar.d(acVar.f24348a, acVar.f24349b);
        TextView textView = ebVar.f25779b;
        String str = bcVar.f24704a;
        if (bcVar.f24706c) {
            L0 = org.telegram.messenger.dd.G(i10, str, new Object[0]);
        } else {
            L0 = org.telegram.messenger.dd.L0(bcVar.f24705b, str);
        }
        textView.setText(org.telegram.messenger.i0.T2(L0, new org.telegram.messenger.sz(11)));
        int i13 = acVar.f24350c;
        if (i13 != 0) {
            ebVar.setIconPaddingBottom(i13);
        }
        return b(ebVar, 1500);
    }

    public final wb n(bc bcVar, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return m(bcVar, i10, 0, 0, p6Var);
    }

    public final wb o(bc bcVar, org.telegram.ui.ActionBar.p6 p6Var) {
        return m(bcVar, 1, 0, 0, p6Var);
    }

    public final wb p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        rb rbVar = new rb(W, p6Var);
        f5 f5Var = new f5(1, org.telegram.messenger.e20.f15506s0, j10);
        g9 g9Var = rbVar.f29970a;
        g9Var.setAnimatedEmojiDrawable(f5Var);
        g9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var), PorterDuff.Mode.SRC_IN));
        rbVar.f29971b.setText(str);
        rbVar.f29972c.setText(str2);
        return b(rbVar, 2750);
    }

    public final wb q(TLRPC.Document document, CharSequence charSequence) {
        eb ebVar = new eb(W(), this.f25078c);
        if (org.telegram.messenger.kj.C4(document)) {
            org.telegram.ui.ActionBar.a7.t(ebVar.f25778a, org.telegram.ui.ActionBar.t6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ebVar.e(document, new String[0]);
        ebVar.f25779b.setText(charSequence);
        ebVar.f25779b.setTextSize(1, 14.0f);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(3);
        return b(ebVar, 2750);
    }

    public final wb r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        eb ebVar = new eb(W, p6Var);
        if (org.telegram.messenger.kj.C4(document)) {
            org.telegram.ui.ActionBar.a7.t(ebVar.f25778a, org.telegram.ui.ActionBar.t6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        ebVar.e(document, new String[0]);
        if (ebVar.f25778a.getImageReceiver() != null) {
            ebVar.f25778a.getImageReceiver().J0(org.telegram.messenger.i0.L(4.0f));
        }
        ebVar.f25779b.setText(charSequence);
        ebVar.f25779b.setTextSize(1, 14.0f);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(3);
        ub ubVar = new ub(W(), p6Var, true);
        ubVar.e(str);
        ubVar.f30924b = runnable;
        ebVar.setButton(ubVar);
        return b(ebVar, 2750);
    }

    public final wb s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        tb tbVar = new tb(W(), this.f25078c);
        boolean C4 = org.telegram.messenger.kj.C4(document);
        fi0 fi0Var = tbVar.f30618a;
        if (C4) {
            org.telegram.ui.ActionBar.a7.t(fi0Var, org.telegram.ui.ActionBar.t6.vj, null, PorterDuff.Mode.SRC_IN);
        }
        fi0Var.setAutoRepeat(true);
        fi0Var.g(36, 36, document);
        tbVar.f30619b.setText(str);
        tbVar.f30620c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(tbVar, i10);
    }

    public final wb t(CharSequence charSequence, org.telegram.ui.ActionBar.p6 p6Var) {
        eb ebVar = new eb(W(), p6Var);
        ebVar.d(2131623981, new String[0]);
        ebVar.f25779b.setText(charSequence);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setMaxLines(2);
        return b(ebVar, 1500);
    }

    public final wb u(String str, String str2, org.telegram.ui.ActionBar.p6 p6Var) {
        tb tbVar = new tb(W(), p6Var);
        tbVar.c(2131623981, 32, 32, new String[0]);
        tbVar.f30619b.setText(str);
        tbVar.f30620c.setText(str2);
        return b(tbVar, 1500);
    }

    public final wb w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        eb ebVar = new eb(W, p6Var);
        ebVar.setBackground(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.tj, p6Var), 12);
        ebVar.f25778a.setImageResource(i10);
        ebVar.f25779b.setText(charSequence);
        ebVar.f25779b.setSingleLine(false);
        ebVar.f25779b.setLines(2);
        ebVar.f25779b.setMaxLines(4);
        TextView textView = ebVar.f25779b;
        textView.setMaxWidth(vh.p2.a(textView.getText(), ebVar.f25779b.getPaint()));
        ebVar.f25779b.setLineSpacing(org.telegram.messenger.i0.L(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ebVar.f25779b.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(12.0f);
        ebVar.setWrapWidth();
        return b(ebVar, 5000);
    }

    public final wb y(int i10, TLRPC.Document document, i2.u uVar) {
        String L0;
        Context W = W();
        org.telegram.ui.ActionBar.p6 p6Var = this.f25078c;
        eb ebVar = new eb(W, p6Var);
        ebVar.c(2131624283, 36, 36, new String[0]);
        ebVar.removeView(ebVar.f25779b);
        n5 n5Var = new n5(ebVar.getContext());
        ebVar.f25779b = n5Var;
        n5Var.setTypeface(Typeface.SANS_SERIF);
        ebVar.f25779b.setTextSize(1, 15.0f);
        ebVar.f25779b.setEllipsize(TextUtils.TruncateAt.END);
        ebVar.f25779b.setPadding(0, 0, 0, org.telegram.messenger.i0.L(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(org.telegram.messenger.i0.L(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new o5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = ebVar.f25779b;
        if (i10 > 1) {
            L0 = org.telegram.messenger.dd.G(i10, "SavedTagMessagesTagged", new Object[0]);
        } else {
            L0 = org.telegram.messenger.dd.L0(2131745895, null);
        }
        textView.setText(new SpannableStringBuilder(L0).append((CharSequence) " ").append((CharSequence) spannableString));
        if (uVar != null) {
            ub ubVar = new ub(W(), p6Var, true);
            ubVar.e(org.telegram.messenger.dd.L0(2131743589, null));
            ubVar.f30924b = uVar;
            ebVar.setButton(ubVar);
        }
        ebVar.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.vj, p6Var));
        ebVar.addView(ebVar.f25779b, w7.b6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ebVar, 2750);
    }

    public cc(FrameLayout frameLayout, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f25077b = frameLayout;
        this.f25076a = null;
        this.f25078c = p6Var;
    }
}

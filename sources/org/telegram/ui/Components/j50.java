package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
public final class j50 implements Runnable {
    public final int f34963a;
    public final Object f34964b;
    public final Object f34965c;

    public j50(int i3, Object obj, Object obj2) {
        this.f34963a = i3;
        this.f34964b = obj;
        this.f34965c = obj2;
    }

    @Override
    public final void run() {
        ci.v6 v6Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        long j11;
        int indexOf;
        int K;
        int i3;
        boolean z14 = false;
        long j12 = 0;
        int i10 = 2;
        boolean z15 = false;
        boolean z16 = true;
        switch (this.f34963a) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f34965c;
                ((t50) this.f34964b).A0(true);
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.h3(new zs(editTextBoldCursor, 4));
                return;
            case 1:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ((TLRPC.ChatFull) this.f34964b).guard_bot_id);
                ((org.telegram.ui.bo) this.f34965c).presentFragment(new ProfileActivity(bundle, null));
                return;
            case 2:
                o70 o70Var = (o70) this.f34964b;
                if (o70Var.P0 == ((t70) this.f34965c)) {
                    o70Var.performLongClick();
                    o70Var.P0 = null;
                    o70Var.N0.f(true);
                    return;
                }
                return;
            case 3:
                ((m2.p0) this.f34964b).n((w70) this.f34965c, false);
                return;
            case 4:
                r80 r80Var = (r80) this.f34964b;
                if (!((boolean[]) this.f34965c)[0] && (v6Var = r80Var.R) != null) {
                    v6Var.run();
                }
                r80Var.R = null;
                return;
            case 5:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) this.f34965c;
                ((zh.b) this.f34964b).A0(true);
                editTextBoldCursor2.requestFocus();
                org.telegram.messenger.g0.h3(new zs(editTextBoldCursor2, 6));
                return;
            case 6:
                i9 i9Var = (i9) this.f34964b;
                Runnable runnable = (Runnable) this.f34965c;
                i9Var.getClass();
                runnable.run();
                ((HashMap) i9Var.f34636b).remove(runnable);
                return;
            case 7:
                bf0 bf0Var = (bf0) this.f34964b;
                TLObject tLObject = (TLObject) this.f34965c;
                bf0Var.N = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    bf0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        bf0Var.a(false);
                        return;
                    }
                    bf0Var.d();
                    bf0Var.f32170c.f35594g3.O(true);
                    return;
                }
                return;
            case 8:
                gf0 gf0Var = (gf0) this.f34964b;
                ArrayList arrayList = (ArrayList) this.f34965c;
                ArrayList arrayList2 = gf0Var.f34074a;
                int i11 = gf0Var.f34083s;
                int size = arrayList.size();
                gf0Var.f34083s = size;
                if (i11 != size && gf0Var.Q != null) {
                    gf0Var.g();
                }
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    df0 df0Var = (df0) arrayList2.get(i12);
                    if (df0Var.f33076o && !df0Var.f33077p) {
                        arrayList.add(df0Var);
                    } else if (gf0.i(df0Var.f33064a, arrayList) == null) {
                        gf0 gf0Var2 = df0Var.f33085y;
                        float f10 = gf0Var2.L;
                        RectF rectF = df0Var.f33066c;
                        RectF rectF2 = df0Var.f33068f;
                        w70 w70Var = df0Var.f33079r;
                        if (w70Var != null) {
                            w70Var.a();
                            df0Var.f33081t = z15;
                            df0Var.f33080s = z15;
                        }
                        df0Var.f33076o = z16;
                        if (rectF.left - 1.0f <= f10) {
                            z10 = z16;
                        } else {
                            z10 = z15;
                        }
                        if (rectF.right + 1.0f >= gf0Var2.getMeasuredWidth() - f10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && z11) {
                            z10 = false;
                            z11 = false;
                        }
                        df0Var.f33069g.set(rectF);
                        rectF2.set(rectF);
                        if (z10) {
                            rectF2.right = rectF2.left;
                        } else if (z11) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i13 = df0Var.f33064a;
                            if (i13 != 3 && i13 != 2) {
                                z12 = true;
                            } else {
                                z12 = true;
                                if (gf0Var2.F == 1) {
                                    rectF2.left = rectF2.right;
                                    z13 = false;
                                    df0Var.f33067e.e(z12, 0.0f);
                                    arrayList.add(df0Var);
                                    i12++;
                                    z14 = z13;
                                    z15 = false;
                                    z16 = true;
                                }
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            z13 = false;
                            df0Var.f33067e.e(z12, 0.0f);
                            arrayList.add(df0Var);
                            i12++;
                            z14 = z13;
                            z15 = false;
                            z16 = true;
                        }
                        z12 = true;
                        z13 = false;
                        df0Var.f33067e.e(z12, 0.0f);
                        arrayList.add(df0Var);
                        i12++;
                        z14 = z13;
                        z15 = false;
                        z16 = true;
                    }
                    z13 = z14;
                    i12++;
                    z14 = z13;
                    z15 = false;
                    z16 = true;
                }
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                gf0Var.invalidate();
                return;
            case 9:
                df0 df0Var2 = (df0) this.f34965c;
                ff0 ff0Var = ((gf0) this.f34964b).f34086y;
                int i14 = df0Var2.f33064a;
                RectF rectF3 = df0Var2.d;
                ProfileActivity.m0(((org.telegram.ui.jt0) ff0Var).f46687b, i14, rectF3.left, rectF3.top);
                return;
            case 10:
                RLottieNative rLottieNative = (RLottieNative) this.f34964b;
                RLottieNative rLottieNative2 = (RLottieNative) this.f34965c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 11:
                kh0 kh0Var = (kh0) this.f34964b;
                ArrayList arrayList3 = (ArrayList) this.f34965c;
                ArrayList arrayList4 = kh0Var.f35415r;
                kh0Var.f35414n.addAll(arrayList3);
                int size3 = arrayList3.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    jh0 jh0Var = (jh0) obj;
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            TLObject tLObject2 = ((jh0) arrayList4.get(i16)).f35072a;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                j10 = -((TLRPC.Chat) tLObject2).f27001id;
                            } else if (tLObject2 instanceof TLRPC.User) {
                                j10 = ((TLRPC.User) tLObject2).f27150id;
                            } else {
                                j10 = 0;
                            }
                            TLObject tLObject3 = jh0Var.f35072a;
                            if (tLObject3 instanceof TLRPC.Chat) {
                                j11 = -((TLRPC.Chat) tLObject3).f27001id;
                            } else if (tLObject3 instanceof TLRPC.User) {
                                j11 = ((TLRPC.User) tLObject3).f27150id;
                            } else {
                                j11 = 0;
                            }
                            if (j10 == j11) {
                                if (jh0Var.f35074c > 0) {
                                    ((jh0) arrayList4.get(i16)).f35074c = jh0Var.f35074c;
                                }
                            } else {
                                i16++;
                            }
                        } else {
                            arrayList4.add(jh0Var);
                        }
                    }
                }
                q0.a aVar = kh0Var.f35418x;
                if (aVar != null) {
                    aVar.accept(arrayList3);
                }
                kh0Var.a();
                return;
            case 12:
                bm0 bm0Var = (bm0) this.f34964b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.f34965c;
                ArrayList arrayList5 = bm0Var.L;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = bm0Var.K()) < bm0Var.b()) {
                    arrayList5.remove(indexOf);
                    bm0Var.s(K + 1 + indexOf);
                    int size4 = bm0Var.f16969k0.f17209e.size();
                    int size5 = arrayList5.size();
                    if (bm0Var.H0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        bm0Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((bm0) this.f34964b).S();
                fc.a0((org.telegram.ui.uw) this.f34965c).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                return;
            case 14:
                ((nm0) this.f34964b).sendAccessibilityEvent((View) this.f34965c, 4);
                return;
            case 15:
                le leVar = (le) this.f34964b;
                org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.f34965c;
                if (wmVar != null) {
                    wmVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    leVar.dismiss();
                    return;
                }
                return;
            case 16:
                ((WindowManager) this.f34965c).removeView(((le) this.f34964b).B);
                return;
            case 17:
                oo0 oo0Var = (oo0) this.f34964b;
                TLObject tLObject4 = (TLObject) this.f34965c;
                if (tLObject4 != null) {
                    oo0Var.f36877d2 = (TLRPC.TL_exportedMessageLink) tLObject4;
                    oo0Var.a1();
                    if (oo0Var.f36879f2) {
                        oo0Var.M0();
                    }
                }
                oo0Var.f36878e2 = false;
                return;
            case 18:
                ei.s6 s6Var = (ei.s6) this.f34965c;
                yp0 yp0Var = ((ws0) this.f34964b).f40076c0;
                if (yp0Var != null) {
                    int i17 = s6Var.f11008a;
                    yp0Var.f44467b.d(i17, yp0Var.d.i(i17));
                    return;
                }
                return;
            case 19:
                rr0 rr0Var = (rr0) this.f34964b;
                ai.d2 d2Var = (ai.d2) this.f34965c;
                rr0Var.G = null;
                rr0Var.H = null;
                d2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new a60(d2Var, 20)).start();
                return;
            case 20:
                ci.v8 v8Var = (ci.v8) this.f34964b;
                v8Var.f6197e = !v8Var.f6197e;
                ((Runnable[]) this.f34965c)[0].run();
                v8Var.j(true);
                return;
            case 21:
                fc.a0(((ir0) this.f34964b).f34804f.f40142y1).Q(2131623989, 36, org.telegram.messenger.bd.a0(null, null, 2131742846, ((TLRPC.Chat) this.f34965c).title)).k(true);
                return;
            case 22:
                tr0 tr0Var = (tr0) this.f34964b;
                String str = (String) this.f34965c;
                if (!tr0Var.f38544w.f40136w1[tr0Var.f38542r].f35854a.isEmpty() && ((i3 = tr0Var.f38542r) == 1 || i3 == 4)) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, tr0Var.f38544w.f40136w1[i3].f35854a);
                    int f12 = ziVar.f1();
                    long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
                    ws0 ws0Var = tr0Var.f38544w;
                    if (ws0Var.m1 == ws0Var.f40142y1.getUserConfig().e()) {
                        j12 = ziVar.Q1();
                    }
                    tr0Var.F(f12, B0, j12, str);
                } else if (tr0Var.f38542r == 3) {
                    ws0 ws0Var2 = tr0Var.f38544w;
                    tr0Var.F(0, ws0Var2.m1, ws0Var2.G, str);
                }
                int i18 = tr0Var.f38542r;
                if (i18 == 1 || i18 == 4) {
                    ArrayList arrayList6 = new ArrayList(tr0Var.f38544w.f40136w1[tr0Var.f38542r].f35854a);
                    tr0Var.f38543s++;
                    Utilities.f21389g.c(new e7(tr0Var, str, arrayList6, 28));
                    return;
                }
                return;
            case 23:
                tr0 tr0Var2 = (tr0) this.f34964b;
                ArrayList arrayList7 = (ArrayList) this.f34965c;
                ws0 ws0Var3 = tr0Var2.f38544w;
                boolean z17 = ws0Var3.Y0;
                rr0[] rr0VarArr = ws0Var3.f40108n0;
                if (z17) {
                    tr0Var2.f38543s--;
                    int b10 = tr0Var2.b();
                    tr0Var2.d = arrayList7;
                    int b11 = tr0Var2.b();
                    if (tr0Var2.f38543s == 0 || b11 != 0) {
                        ws0Var3.z1(false);
                    }
                    for (int i19 = 0; i19 < rr0VarArr.length; i19++) {
                        rr0 rr0Var2 = rr0VarArr[i19];
                        if (rr0Var2.F == tr0Var2.f38542r) {
                            if (tr0Var2.f38543s == 0 && b11 == 0) {
                                rr0Var2.f37790w.d.setText(org.telegram.messenger.bd.M0(2131748175, "NoResult"));
                                rr0VarArr[i19].f37790w.f41129f.setVisibility(8);
                                rr0VarArr[i19].f37790w.e(false, true);
                            } else if (b10 == 0) {
                                ws0Var3.D(rr0Var2.h, 0, null);
                            }
                        }
                    }
                    tr0Var2.f();
                    return;
                }
                return;
            case 24:
                org.telegram.messenger.hs f11 = org.telegram.messenger.hs.f(org.telegram.messenger.h10.f22829t0);
                Boolean bool = Boolean.FALSE;
                f11.m(215, bool, (TLObject) this.f34964b, (TLRPC.Document) this.f34965c, null, bool);
                return;
            case 25:
                org.telegram.messenger.hp.s1(((jw0) this.f34964b).f35205a.f36958a).h5((TLRPC.EmojiStatus) this.f34965c, null);
                return;
            case 26:
                n01 n01Var = (n01) this.f34964b;
                String str2 = (String) this.f34965c;
                n01Var.P = null;
                org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(n01Var.f36308a).f23102q7;
                long j13 = -n01Var.f36310b;
                ei eiVar = new ei(10, n01Var, str2);
                c00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = c00Var.getMessagesController().j1(-j13);
                tL_messages_getForumTopics.f27221q = str2;
                tL_messages_getForumTopics.limit = 50;
                n01Var.O = c00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.fj(c00Var, j13, eiVar, 10));
                return;
            case 27:
                g11 g11Var = (g11) this.f34964b;
                org.telegram.messenger.hp.s1(g11Var.f33925e).f23102q7.d((ArrayList) this.f34965c, -g11Var.f33927f);
                int i20 = g11.m0;
                return;
            case 28:
                g11 g11Var2 = (g11) this.f34964b;
                g11Var2.getClass();
                org.telegram.messenger.hp.s1(g11Var2.f33925e).V2(0, ((TLRPC.Updates) this.f34965c).chats.get(0).f27001id, true);
                return;
            default:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.f34964b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.f34965c;
                if (l1Var != null) {
                    if (tL_messages_transcribedAudio.trial_remains_num > 0) {
                        i10 = 1;
                    }
                    l1Var.e0(i10);
                    return;
                }
                return;
        }
    }

    public j50(Object obj, Object obj2, Object obj3, int i3) {
        this.f34963a = i3;
        this.f34964b = obj;
        this.f34965c = obj2;
    }
}

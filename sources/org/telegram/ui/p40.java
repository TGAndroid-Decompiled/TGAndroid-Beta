package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p40 extends org.telegram.ui.Components.zi0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final r40 J;
    public final Context f48454c;
    public final kg.v1 f48456f;
    public Runnable h;
    public boolean f48457n;
    public int f48459s;
    public int f48460w;
    public int f48461x;
    public int f48462y;
    public ArrayList d = new ArrayList();
    public ArrayList f48455e = new ArrayList();
    public final ArrayList f48458r = new ArrayList();

    public p40(r40 r40Var, Context context) {
        TLRPC.Chat M0;
        String substring;
        String substring2;
        TLRPC.User a22;
        this.J = r40Var;
        this.f48454c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.g5 contactsController = r40Var.getContactsController();
        boolean z10 = r40Var.R;
        ArrayList arrayList = contactsController.f22653f0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.User a23 = r40Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i3)).user_id));
            if (a23 != null && !a23.self && !a23.deleted) {
                this.f48458r.add(a23);
                hashSet.add(Long.valueOf(a23.f27150id));
            }
        }
        if (r40Var.Q || r40Var.P || z10) {
            ArrayList arrayList2 = r40Var.getMessagesController().f23169y;
            if (z10) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.m5.E(dialog.f27005id) && !hashSet.contains(Long.valueOf(dialog.f27005id)) && (a22 = r40Var.getMessagesController().a2(Long.valueOf(dialog.f27005id))) != null && !org.telegram.messenger.l10.x(a22) && !org.telegram.messenger.l10.B(a22) && !org.telegram.messenger.l10.t(a22) && !org.telegram.messenger.l10.A(dialog.f27005id) && !org.telegram.messenger.hp.F2(a22)) {
                        this.f48458r.add(a22);
                        hashSet.add(Long.valueOf(a22.f27150id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.m5.z(dialog2.f27005id) && (M0 = r40Var.getMessagesController().M0(Long.valueOf(-dialog2.f27005id))) != null && M0.migrated_to == null && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) {
                        this.f48458r.add(M0);
                    }
                }
            }
            Collections.sort(this.f48458r, new Object());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.f48458r.size()) {
                TLObject tLObject2 = (TLObject) this.f48458r.get(i12);
                if (tLObject != null) {
                    String a10 = l40.a(tLObject);
                    if (TextUtils.isEmpty(a10)) {
                        substring = "";
                    } else {
                        substring = a10.substring(0, 1);
                    }
                    String a11 = l40.a(tLObject2);
                    if (TextUtils.isEmpty(a11)) {
                        substring2 = "";
                    } else {
                        substring2 = a11.substring(0, 1);
                    }
                    if (substring.equals(substring2)) {
                        i12++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.f48458r;
                String a12 = l40.a(tLObject2);
                arrayList3.add(i12, new q40(TextUtils.isEmpty(a12) ? "" : a12.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        kg.v1 v1Var = new kg.v1(false);
        this.f48456f = v1Var;
        v1Var.f17206a = new ur(this, 13);
    }

    @Override
    public final void A(u4.d1 d1Var) {
        View view = d1Var.f55540a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).f29326a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f != 0) {
            r40 r40Var = this.J;
            if (r40Var.K != null) {
                View view = d1Var.f55540a;
                if (view instanceof org.telegram.ui.Cells.h4) {
                    Object object = ((org.telegram.ui.Cells.h4) view).getObject();
                    if ((object instanceof TLRPC.User) && r40Var.K.h(((TLRPC.User) object).f27150id) >= 0) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i3) {
        String str;
        String str2;
        if (!this.f48457n && i3 >= this.F) {
            ArrayList arrayList = this.f48458r;
            int size = arrayList.size();
            int i10 = this.F;
            if (i3 < size + i10) {
                TLObject tLObject = (TLObject) arrayList.get(i3 - i10);
                if (tLObject instanceof q40) {
                    return ((q40) tLObject).f48749a;
                }
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    str = user.first_name;
                    str2 = user.last_name;
                } else {
                    str = ((TLRPC.Chat) tLObject).title;
                    str2 = "";
                }
                if (org.telegram.messenger.bd.f21785b0 == 1) {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2.substring(0, 1).toUpperCase();
                    }
                } else if (!TextUtils.isEmpty(str2)) {
                    return str2.substring(0, 1).toUpperCase();
                } else {
                    if (!TextUtils.isEmpty(str)) {
                        return str.substring(0, 1).toUpperCase();
                    }
                }
                return "";
            }
            return null;
        }
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        if (this.h != null) {
            Utilities.f21389g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.f48455e.clear();
        this.f48456f.f(null, null);
        kg.v1 v1Var = this.f48456f;
        r40 r40Var = this.J;
        if (!r40Var.P && !r40Var.Q) {
            z10 = false;
        } else {
            z10 = true;
        }
        v1Var.g(null, true, z10, false, false, 0L, false, 0, 0);
        f();
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.f21389g;
            o40 o40Var = new o40(this, str, 0);
            this.h = o40Var;
            p5Var.e(o40Var, 300L);
        }
    }

    @Override
    public final int b() {
        int i3;
        int i10;
        r40 r40Var = this.J;
        long j10 = r40Var.I;
        long j11 = r40Var.H;
        this.H = -1;
        this.f48459s = -1;
        this.f48461x = -1;
        this.f48460w = -1;
        this.f48462y = -1;
        this.E = -1;
        if (this.f48457n) {
            int size = this.d.size();
            kg.v1 v1Var = this.f48456f;
            int size2 = v1Var.d.size();
            int size3 = v1Var.f17209e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.I = i11;
            return i11;
        }
        if (r40Var.R) {
            this.f48461x = 0;
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (r40Var.W) {
            int i12 = i3 + 1;
            this.f48460w = i3;
            this.f48459s = i3;
            i3 += 2;
            this.f48462y = i12;
        } else if (r40Var.X) {
            int i13 = i3 + 1;
            this.f48460w = i3;
            this.f48459s = i3;
            i3 += 2;
            this.E = i13;
        } else {
            this.f48460w = i3;
        }
        this.F = i3;
        int size4 = this.f48458r.size() + i3;
        if (r40Var.S) {
            if (j11 != 0) {
                this.G = org.telegram.messenger.t3.y(3, r40Var.getMessagesController().M0(Long.valueOf(j11))) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat M0 = r40Var.getMessagesController().M0(Long.valueOf(j10));
                if (org.telegram.messenger.t3.y(3, M0) && !org.telegram.messenger.t3.t0(M0)) {
                    i10 = 2;
                } else {
                    i10 = 0;
                }
                this.G = i10;
            } else {
                this.G = 0;
            }
            if (this.G != 0) {
                this.F++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.H = 0;
            size4++;
        }
        this.I = size4;
        return size4;
    }

    @Override
    public final int d(int i3) {
        if (this.f48457n) {
            if (i3 == this.f48456f.d.size() + this.d.size()) {
                return 0;
            }
            return 1;
        } else if (i3 != this.f48461x) {
            if (i3 != this.f48459s) {
                if (i3 != this.f48462y && i3 != this.E) {
                    if (this.G != 0 && i3 == 0) {
                        return 2;
                    }
                    if (this.H == i3) {
                        return 3;
                    }
                    int i10 = i3 - this.F;
                    if (i10 >= 0) {
                        ArrayList arrayList = this.f48458r;
                        if (i10 < arrayList.size() && (arrayList.get(i3 - this.F) instanceof q40)) {
                            return 0;
                        }
                        return 1;
                    }
                    return 1;
                }
                return 1;
            }
            return 0;
        } else {
            return 2;
        }
    }

    @Override
    public final void f() {
        super.f();
        this.J.w0();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String M0;
        TLObject tLObject;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        boolean z10;
        CharSequence charSequence;
        String K;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        ArrayList arrayList = this.f48458r;
        r40 r40Var = this.J;
        SpannableStringBuilder spannableStringBuilder2 = null;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                    if (i3 == this.f48461x) {
                        l8Var.o(2131231841, org.telegram.messenger.bd.M0(2131749493, null), false);
                        l8Var.g(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
                        return;
                    } else if (this.G == 2) {
                        l8Var.o(2131232204, org.telegram.messenger.bd.M0(2131752402, null), false);
                        l8Var.g(org.telegram.ui.ActionBar.k6.f28043m6, org.telegram.ui.ActionBar.k6.G6);
                        return;
                    } else {
                        l8Var.o(2131232204, org.telegram.messenger.bd.M0(2131749118, null), false);
                        l8Var.g(org.telegram.ui.ActionBar.k6.f28043m6, org.telegram.ui.ActionBar.k6.G6);
                        return;
                    }
                }
                return;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (this.f48457n) {
                int size = this.d.size();
                kg.v1 v1Var = this.f48456f;
                ArrayList arrayList2 = v1Var.f17209e;
                ArrayList arrayList3 = v1Var.d;
                int size2 = arrayList2.size();
                int size3 = arrayList3.size();
                if (i3 >= 0 && i3 < size) {
                    tLObject = (TLObject) this.d.get(i3);
                } else if (i3 >= size && i3 < size3 + size) {
                    tLObject = (TLObject) arrayList3.get(i3 - size);
                } else if (i3 > size + size3 && i3 <= size2 + size + size3) {
                    tLObject = (TLObject) v1Var.f17209e.get(((i3 - size) - size3) - 1);
                } else {
                    tLObject = null;
                }
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.User) {
                        K = ((TLRPC.User) tLObject).username;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        K = org.telegram.messenger.t3.K((TLRPC.Chat) tLObject, false);
                    } else {
                        return;
                    }
                    if (i3 < size) {
                        charSequence = (CharSequence) this.f48455e.get(i3);
                        if (charSequence != null && !TextUtils.isEmpty(K)) {
                            if (charSequence.toString().startsWith("@" + K)) {
                                spannableStringBuilder2 = charSequence;
                                charSequence = null;
                            }
                        }
                    } else if (i3 > size && !TextUtils.isEmpty(K)) {
                        String str = v1Var.f17208c;
                        if (str.startsWith("@")) {
                            str = str.substring(1);
                        }
                        try {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                            spannableStringBuilder3.append((CharSequence) "@");
                            spannableStringBuilder3.append((CharSequence) K);
                            int A1 = org.telegram.messenger.g0.A1(K, str);
                            if (A1 != -1) {
                                int length = str.length();
                                if (A1 == 0) {
                                    length++;
                                } else {
                                    A1++;
                                }
                                spannableStringBuilder3.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.f28121q6, null), A1, length + A1, 33);
                            }
                            charSequence = null;
                            spannableStringBuilder2 = spannableStringBuilder3;
                        } catch (Exception unused) {
                            charSequence = null;
                            spannableStringBuilder2 = K;
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    spannableStringBuilder2 = charSequence;
                    spannableStringBuilder = spannableStringBuilder4;
                }
                charSequence = null;
                SpannableStringBuilder spannableStringBuilder42 = spannableStringBuilder2;
                spannableStringBuilder2 = charSequence;
                spannableStringBuilder = spannableStringBuilder42;
            } else if (i3 == this.f48462y) {
                h4Var.f29332r = true;
                h4Var.f29330f = "premium";
                h4Var.f29326a.setImageDrawable(org.telegram.ui.Cells.h4.b(h4Var.getContext(), false));
                h4Var.f29327b.l(org.telegram.messenger.bd.M0(2131746788, null), false);
                org.telegram.ui.ActionBar.k5 k5Var = h4Var.f29328c;
                int i11 = org.telegram.ui.ActionBar.k6.f28273y6;
                k5Var.setTag(Integer.valueOf(i11));
                if (h4Var.L) {
                    i11 = org.telegram.ui.ActionBar.k6.f27870ch;
                }
                org.telegram.ui.ActionBar.r6.Y(k5Var, i11, h4Var.N);
                k5Var.setEmojiColor(k5Var.getTextColor());
                k5Var.l(org.telegram.messenger.bd.M0(2131746786, null), false);
                if (r40Var.Y == null) {
                    z11 = false;
                }
                h4Var.c(z11, false);
                return;
            } else if (i3 == this.E) {
                h4Var.f29333s = true;
                h4Var.f29330f = "miniapps";
                org.telegram.ui.Components.k9 k9Var = h4Var.f29326a;
                h4Var.getContext();
                k9Var.setImageDrawable(org.telegram.ui.Cells.h4.a(false));
                h4Var.f29327b.l(org.telegram.messenger.bd.M0(2131746814, null), false);
                org.telegram.ui.ActionBar.k5 k5Var2 = h4Var.f29328c;
                int i12 = org.telegram.ui.ActionBar.k6.f28273y6;
                k5Var2.setTag(Integer.valueOf(i12));
                if (h4Var.L) {
                    i12 = org.telegram.ui.ActionBar.k6.f27870ch;
                }
                org.telegram.ui.ActionBar.r6.Y(k5Var2, i12, h4Var.N);
                k5Var2.setEmojiColor(k5Var2.getTextColor());
                k5Var2.l(org.telegram.messenger.bd.M0(2131746813, null), false);
                if (r40Var.Z == null) {
                    z11 = false;
                }
                h4Var.c(z11, false);
                return;
            } else {
                tLObject = (TLObject) arrayList.get(i3 - this.F);
                spannableStringBuilder = null;
            }
            h4Var.d(tLObject, spannableStringBuilder2, spannableStringBuilder);
            if (tLObject instanceof TLRPC.User) {
                j10 = ((TLRPC.User) tLObject).f27150id;
            } else if (tLObject instanceof TLRPC.Chat) {
                j10 = -((TLRPC.Chat) tLObject).f27001id;
            } else {
                j10 = 0;
            }
            if (j10 != 0) {
                a0.h hVar = r40Var.K;
                if (hVar != null && hVar.h(j10) >= 0) {
                    h4Var.c(true, false);
                    h4Var.setCheckBoxEnabled(false);
                    return;
                }
                if (r40Var.f49032a0.h(j10) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h4Var.c(z10, false);
                h4Var.setCheckBoxEnabled(true);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
        if (this.f48457n) {
            x3Var.setText(org.telegram.messenger.bd.M0(2131749543, null));
        } else if (i3 == this.f48459s) {
            x3Var.setText(org.telegram.messenger.bd.M0(2131746776, null));
        } else {
            int i13 = i3 - this.F;
            if (i13 >= 0 && i13 < arrayList.size()) {
                TLObject tLObject2 = (TLObject) arrayList.get(i3 - this.F);
                if (tLObject2 instanceof q40) {
                    x3Var.setText(((q40) tLObject2).f48749a.toUpperCase());
                }
            }
        }
        if (i3 == this.f48460w) {
            if (r40Var.Y == null && r40Var.f49032a0.i()) {
                M0 = "";
            } else {
                M0 = org.telegram.messenger.bd.M0(2131751458, null);
            }
            x3Var.a(M0, new b40(this, 1));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View x3Var;
        Context context = this.f48454c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 3) {
                    x3Var = new org.telegram.ui.Cells.l8(context);
                } else {
                    org.telegram.ui.Components.m50 m50Var = new org.telegram.ui.Components.m50(context, null, 0, null, 1);
                    m50Var.setLayoutParams(new u4.p0(-1, -1));
                    m50Var.f41128e.setVisibility(8);
                    m50Var.d.setText(org.telegram.messenger.bd.M0(2131748231, null));
                    m50Var.setAnimateLayoutChange(true);
                    x3Var = m50Var;
                }
            } else {
                x3Var = new org.telegram.ui.Cells.h4(context, 1, 0, false);
            }
        } else {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        }
        return new u4.d1(x3Var);
    }
}

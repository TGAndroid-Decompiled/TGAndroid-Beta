package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ec1;
public final class dq0 extends kl0 {
    public int G;
    public cq0 H;
    public int J;
    public final hq0 K;
    public final Context f25468c;
    public final bq0 f25469e;
    public aq0 f25470f;
    public aq0 h;
    public String f25471n;
    public int f25472r;
    public int f25473s;
    public int v;
    public ArrayList d = new ArrayList();
    public int f25474w = -1;
    public int f25475x = -1;
    public int f25476y = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public dq0(hq0 hq0Var, Context context) {
        this.K = hq0Var;
        this.f25468c = context;
        ?? b2Var = new hg.b2(false);
        this.f25469e = b2Var;
        b2Var.f11005a = new ji.u4(this, 14);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f45770f;
        if (i10 != 1 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        if (str != null && str.equals(this.f25471n)) {
            return;
        }
        this.f25471n = str;
        if (this.f25470f != null) {
            Utilities.searchQueue.cancelRunnable(this.f25470f);
            this.f25470f = null;
        }
        aq0 aq0Var = this.h;
        if (aq0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(aq0Var);
            this.h = null;
        }
        this.d.clear();
        this.f25469e.f(null, null);
        this.f25469e.g(null, true, true, true, true, 0L, false, 0, 0);
        l();
        this.K.K0(true);
        if (TextUtils.isEmpty(str)) {
            hq0.F0(this.K);
            this.f25472r = -1;
            this.I = false;
        } else {
            this.I = true;
            int i10 = this.f25472r + 1;
            this.f25472r = i10;
            this.K.Q.e(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            aq0 aq0Var2 = new aq0(this, str, i10, 0);
            this.f25470f = aq0Var2;
            dispatchQueue.postRunnable(aq0Var2, 300L);
        }
        this.K.K0(false);
    }

    @Override
    public final int h() {
        this.G = 0;
        this.f25474w = -1;
        this.f25475x = -1;
        this.E = -1;
        this.F = -1;
        if (TextUtils.isEmpty(this.f25471n)) {
            int i10 = this.G;
            this.f25476y = i10;
            this.G = i10 + 2;
            this.f25474w = i10 + 1;
            hq0 hq0Var = this.K;
            if (hq0Var.E0.size() > 0) {
                int i11 = this.G;
                int i12 = i11 + 1;
                this.G = i12;
                this.f25475x = i11;
                this.E = i12;
                this.G = hq0Var.E0.size() + i12;
            }
            int i13 = this.G;
            int i14 = i13 + 1;
            this.G = i14;
            this.F = i13;
            this.J = i14;
            return i14;
        }
        int i15 = this.G;
        int i16 = i15 + 1;
        this.G = i16;
        this.f25476y = i15;
        int size = this.f25469e.d.size() + this.d.size() + i16;
        this.G = size;
        if (size == 1) {
            this.f25476y = -1;
            this.G = 0;
            this.J = 0;
            return 0;
        }
        int i17 = size + 1;
        this.G = i17;
        this.F = size;
        this.J = i17;
        return i17;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.F) {
            return 4;
        }
        if (i10 == this.f25476y) {
            return 1;
        }
        if (i10 == this.f25474w) {
            return 2;
        }
        if (i10 == this.f25475x) {
            return 3;
        }
        if (TextUtils.isEmpty(this.f25471n)) {
            return 0;
        }
        return 5;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        long j3;
        String str;
        String str2;
        TLObject tLObject;
        long j10;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z10;
        boolean z11;
        TLObject tLObject2;
        String str3;
        boolean z12;
        boolean z13;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        hq0 hq0Var = this.K;
        a0.i iVar = hq0Var.U;
        int i12 = c1Var.f45770f;
        View view = c1Var.f45766a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((ll0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f25471n);
        String str4 = null;
        bq0 bq0Var = this.f25469e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (isEmpty) {
            int i13 = this.E;
            long j11 = 0;
            if (i13 >= 0 && i10 >= i13) {
                TLObject tLObject3 = ((hg.h0) hq0Var.E0.get(i10 - i13)).f11088a;
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j11 = user.f20043id;
                    str4 = ContactsController.formatName(user.first_name, user.last_name);
                } else if (tLObject3 instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j11 = -chat.f19896id;
                    str4 = chat.title;
                } else if (tLObject3 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject3;
                    i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                    if (user2 != null) {
                        j11 = user2.f20043id;
                        str4 = ContactsController.formatName(user2.first_name, user2.last_name);
                    }
                }
                String str5 = bq0Var.f11007c;
                if (!TextUtils.isEmpty(str5) && str4 != null && (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str5)) != -1) {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str4);
                    int i14 = org.telegram.ui.ActionBar.j6.q6;
                    f6Var2 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new e10(i14, f6Var2), indexOfIgnoreCase2, str5.length() + indexOfIgnoreCase2, 33);
                    tLObject2 = tLObject3;
                    str3 = spannableStringBuilder;
                } else {
                    tLObject2 = tLObject3;
                    str3 = str4;
                }
            } else {
                tLObject2 = null;
                str3 = null;
            }
            TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                h6Var.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
                if (i10 < h() - 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                h6Var.M = z13;
                return;
            }
            String str6 = str3;
            if (view instanceof org.telegram.ui.Cells.f7) {
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                if (iVar.h(j11) >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f7Var.c(j11, z12, str6);
                return;
            }
            return;
        }
        int i15 = i10 - 1;
        if (i15 < this.d.size()) {
            vp0 vp0Var = (vp0) this.d.get(i15);
            j10 = vp0Var.f31986a.f19900id;
            str2 = vp0Var.d;
            tLObject = null;
        } else {
            i15 -= this.d.size();
            TLObject tLObject4 = (TLObject) bq0Var.d.get(i15);
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user3 = (TLRPC.User) tLObject4;
                j3 = user3.f20043id;
                str = ContactsController.formatName(user3.first_name, user3.last_name);
            } else {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j3 = -chat2.f19896id;
                str = chat2.title;
            }
            String str7 = bq0Var.f11007c;
            if (!TextUtils.isEmpty(str7) && str != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str7)) != -1) {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                int i16 = org.telegram.ui.ActionBar.j6.q6;
                f6Var = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new e10(i16, f6Var), indexOfIgnoreCase, str7.length() + indexOfIgnoreCase, 33);
                tLObject = tLObject4;
                str2 = spannableStringBuilder2;
            } else {
                str2 = str;
                tLObject = tLObject4;
            }
            j10 = j3;
        }
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.t(tLObject, null, str2, null, false, false);
            if (i15 < h() - 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            h6Var2.M = z11;
            return;
        }
        String str8 = str2;
        if (view instanceof org.telegram.ui.Cells.f7) {
            org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) view;
            if (iVar.h(j10) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            f7Var2.c(j10, z10, str8);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.Cells.u3 u3Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        float f7;
        Context context = this.f25468c;
        hq0 hq0Var = this.K;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, f6Var);
            h6Var.E0 = true;
            h6Var.f22067l0 = true;
            u3Var = h6Var;
        } else if (i10 == 2) {
            f6Var2 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            ec1 ec1Var = new ec1(context, 6, f6Var2);
            ec1Var.setItemAnimator(null);
            ec1Var.setLayoutAnimation(null);
            hg.b0 b0Var = new hg.b0(11);
            b0Var.j1(0);
            ec1Var.setLayoutManager(b0Var);
            i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
            f6Var3 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            cq0 cq0Var = new cq0(this, context, i11, f6Var3);
            this.H = cq0Var;
            ec1Var.setAdapter(cq0Var);
            ec1Var.setOnItemClickListener(new k(this, 12));
            u3Var = ec1Var;
        } else if (i10 == 3) {
            f6Var4 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            org.telegram.ui.Cells.u3 u3Var2 = new org.telegram.ui.Cells.u3(context, f6Var4);
            u3Var2.setTextColor(org.telegram.ui.ActionBar.j6.f7);
            u3Var2.setBackgroundColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.e7));
            u3Var2.setText(LocaleController.getString(R.string.Recent));
            u3Var = u3Var2;
        } else if (i10 != 4) {
            if (i10 == 5) {
                f6Var5 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
                View f7Var = new org.telegram.ui.Cells.f7(context, 0, f6Var5);
                f7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
                u3Var = f7Var;
            } else {
                View view = new View(context);
                if (hq0Var.f26825h0 && hq0Var.f26832o0[1] != null) {
                    f7 = 109.0f;
                } else {
                    f7 = 56.0f;
                }
                view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(f7)));
                u3Var = view;
            }
        } else {
            u3Var = new di.eb(this, context, 22);
        }
        return new s4.c1(u3Var);
    }
}

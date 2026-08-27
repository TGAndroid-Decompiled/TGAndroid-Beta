package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class kr extends org.telegram.ui.Components.yk0 {

    public final Context f39837c;
    public final pf.j1 h;

    public ir f39840n;

    public boolean f39842s;
    public int v;

    public int f39843w;

    public int f39844x;

    public final lr f39845y;
    public ArrayList d = new ArrayList();

    public a0.h f39838e = new a0.h();

    public ArrayList f39839f = new ArrayList();

    public int f39841r = 0;

    public kr(lr lrVar, Context context) {
        this.f39845y = lrVar;
        this.f39837c = context;
        pf.j1 j1Var = new pf.j1(true);
        this.h = j1Var;
        j1Var.f45836a = new jr(this);
    }

    @Override
    public final void A(f2.o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof org.telegram.ui.Cells.y4) {
            ((org.telegram.ui.Cells.y4) view).a();
        }
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f != 1;
    }

    public final TLObject E(int i10) {
        pf.j1 j1Var = this.h;
        int size = j1Var.f45841g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) j1Var.f45841g.get(i10 - 1);
            }
            i10 -= i11;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i12 = size2 + 1;
            if (i12 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i10 - 1);
            }
            i10 -= i12;
        }
        int size3 = j1Var.f45839e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) j1Var.f45839e.get(i10 - 1);
    }

    public final void F(String str) {
        if (this.f39840n != null) {
            Utilities.searchQueue.cancelRunnable(this.f39840n);
            this.f39840n = null;
        }
        this.d.clear();
        this.f39838e.b();
        this.f39839f.clear();
        this.h.f(null, null);
        pf.j1 j1Var = this.h;
        lr lrVar = this.f39845y;
        j1Var.g(null, lrVar.K != 0, false, true, false, ChatObject.isChannel(lrVar.f40217r) ? this.f39845y.J : 0L, false, this.f39845y.K, 0);
        l();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f39842s = true;
        this.f39845y.f40182b.e(true, true);
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ir irVar = new ir(this, str, 0);
        this.f39840n = irVar;
        dispatchQueue.postRunnable(irVar, 300L);
    }

    @Override
    public final int h() {
        return this.f39841r;
    }

    @Override
    public final int j(int i10) {
        return (i10 == this.f39844x || i10 == this.v || i10 == this.f39843w) ? 1 : 0;
    }

    @Override
    public final void l() {
        hh.f1 f1Var;
        this.f39841r = 0;
        pf.j1 j1Var = this.h;
        int size = j1Var.f45841g.size();
        if (size != 0) {
            this.v = 0;
            this.f39841r = size + 1 + this.f39841r;
        } else {
            this.v = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.f39841r;
            this.f39843w = i10;
            this.f39841r = size2 + 1 + i10;
        } else {
            this.f39843w = -1;
        }
        int size3 = j1Var.f45839e.size();
        if (size3 != 0) {
            int i11 = this.f39841r;
            this.f39844x = i11;
            this.f39841r = size3 + 1 + i11;
        } else {
            this.f39844x = -1;
        }
        lr lrVar = this.f39845y;
        if (lrVar.f40205k1 && (f1Var = lrVar.f40185c) != null) {
            f2.q0 adapter = f1Var.getAdapter();
            kr krVar = lrVar.f40190e;
            if (adapter != krVar) {
                hh.f1 f1Var2 = lrVar.f40185c;
                f1Var2.U1 = true;
                f1Var2.V1 = 0;
                f1Var2.setAdapter(krVar);
                lrVar.f40185c.setFastScrollVisible(false);
                lrVar.f40185c.setVerticalScrollBarEnabled(true);
            }
        }
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.Chat chat;
        String publicUsername;
        TLRPC.User user;
        TLObject tLObject;
        String str;
        boolean z10;
        CharSequence charSequence;
        ?? spannableStringBuilder;
        int size;
        int size2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        TLObject user2;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        lr lrVar = this.f39845y;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 != this.v) {
                if (i10 == this.f39844x) {
                    s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                } else {
                    if (i10 == this.f39843w) {
                        s3Var.setText(LocaleController.getString(R.string.Contacts));
                        return;
                    }
                    return;
                }
            }
            int i12 = lrVar.K;
            if (i12 == 0) {
                s3Var.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                return;
            }
            if (i12 == 3) {
                s3Var.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                return;
            } else if (lrVar.v) {
                s3Var.setText(LocaleController.getString(R.string.ChannelSubscribers));
                return;
            } else {
                s3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            }
        }
        TLObject tLObjectE = E(i10);
        if (tLObjectE instanceof TLRPC.User) {
            user2 = tLObjectE;
            user2 = chat;
            user2 = tLObjectE;
            user2 = user;
            user2 = tLObjectE;
            publicUsername = null;
            tLObject = user2;
        } else {
            if (tLObjectE instanceof TLRPC.ChannelParticipant) {
                long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObjectE).peer);
                if (peerId >= 0) {
                    user = lrVar.getMessagesController().getUser(Long.valueOf(peerId));
                    if (user != null) {
                        user2 = tLObjectE;
                        user2 = user;
                        publicUsername = UserObject.getPublicUsername(user);
                        tLObject = user;
                    }
                } else {
                    chat = lrVar.getMessagesController().getChat(Long.valueOf(-peerId));
                    if (chat != null) {
                        user2 = tLObjectE;
                        user2 = chat;
                        publicUsername = ChatObject.getPublicUsername(chat);
                        tLObject = chat;
                    }
                }
            } else if (!(tLObjectE instanceof TLRPC.ChatParticipant)) {
                user2 = tLObjectE;
                return;
            } else {
                user2 = tLObjectE;
                user2 = lrVar.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) tLObjectE).user_id));
            }
            user2 = tLObjectE;
            user2 = chat;
            user2 = tLObjectE;
            user2 = user;
            user2 = tLObjectE;
            publicUsername = null;
            tLObject = user2;
        }
        pf.j1 j1Var = this.h;
        int size3 = j1Var.f45841g.size();
        if (size3 == 0) {
            str = null;
            z10 = false;
        } else {
            int i13 = size3 + 1;
            if (i13 > i10) {
                str = j1Var.f45847n;
                z10 = true;
            } else {
                i10 -= i13;
                str = null;
                z10 = false;
            }
        }
        if (z10 || (size2 = this.d.size()) == 0) {
            charSequence = null;
            spannableStringBuilder = 0;
        } else {
            int i14 = size2 + 1;
            if (i14 > i10) {
                CharSequence charSequence4 = (CharSequence) this.f39839f.get(i10 - 1);
                if (charSequence4 == null || TextUtils.isEmpty(publicUsername)) {
                    charSequence2 = null;
                    charSequence3 = charSequence4;
                } else {
                    if (charSequence4.toString().startsWith("@" + publicUsername)) {
                        charSequence3 = null;
                        charSequence2 = charSequence4;
                    } else {
                        charSequence2 = null;
                        charSequence3 = charSequence4;
                    }
                }
                z10 = true;
                charSequence = charSequence2;
                spannableStringBuilder = charSequence3;
            } else {
                i10 -= i14;
                charSequence = null;
                spannableStringBuilder = 0;
            }
        }
        CharSequence charSequence5 = charSequence;
        charSequence5 = charSequence;
        if (!z10 && publicUsername != null && (size = j1Var.f45839e.size()) != 0 && size + 1 > i10) {
            String strSubstring = j1Var.f45838c;
            if (strSubstring.startsWith("@")) {
                charSequence5 = charSequence;
                charSequence5 = charSequence;
                strSubstring = strSubstring.substring(1);
            }
            try {
                charSequence5 = charSequence;
                charSequence5 = charSequence;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "@");
                spannableStringBuilder2.append((CharSequence) publicUsername);
                int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                charSequence5 = spannableStringBuilder2;
                if (iIndexOfIgnoreCase != -1) {
                    int length = strSubstring.length();
                    if (iIndexOfIgnoreCase == 0) {
                        length++;
                    } else {
                        iIndexOfIgnoreCase++;
                    }
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                    charSequence5 = spannableStringBuilder2;
                }
            } catch (Exception e9) {
                FileLog.e(e9);
                charSequence5 = publicUsername;
            }
        }
        if (str != null && publicUsername != null) {
            spannableStringBuilder = new SpannableStringBuilder(publicUsername);
            int iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
            if (iIndexOfIgnoreCase2 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false)), iIndexOfIgnoreCase2, str.length() + iIndexOfIgnoreCase2, 33);
            }
        }
        ?? r14 = (org.telegram.ui.Cells.y4) view;
        r14.setTag(Integer.valueOf(i10));
        r14.b(tLObject, spannableStringBuilder, charSequence5, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View s3Var;
        lr lrVar = this.f39845y;
        if (i10 != 0) {
            s3Var = new org.telegram.ui.Cells.s3(this.f39837c, 26, ((org.telegram.ui.ActionBar.n2) lrVar).resourceProvider);
            s3Var.setBackground(null);
        } else {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(2, 2, this.f39837c, null, lrVar.f40181a1 == 0);
            y4Var.C = true;
            y4Var.setDelegate(new jr(this));
            s3Var = y4Var;
        }
        return new org.telegram.ui.Components.lk0(s3Var);
    }
}

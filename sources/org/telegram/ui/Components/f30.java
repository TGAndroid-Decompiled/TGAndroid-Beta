package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class f30 extends yk0 {

    public final Context f28243c;
    public final pf.j1 d;

    public d30 f28244e;

    public int f28245f;
    public boolean h;

    public int f28246n;

    public int f28247r;

    public int f28248s;
    public int v;

    public final g30 f28249w;

    public f30(g30 g30Var, Context context) {
        this.f28249w = g30Var;
        this.f28243c = context;
        pf.j1 j1Var = new pf.j1(true);
        this.d = j1Var;
        j1Var.f45836a = new e30(this);
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
        View view = o1Var.f5789a;
        return !((view instanceof org.telegram.ui.Cells.y4) && this.f28249w.f28514b0.contains(Long.valueOf(((org.telegram.ui.Cells.y4) view).getUserId()))) && o1Var.f5793f == 0;
    }

    @Override
    public final int h() {
        return this.f28245f;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.f28247r) {
            return 3;
        }
        return (i10 == this.v || i10 == this.f28248s) ? 1 : 0;
    }

    @Override
    public final void l() {
        this.f28245f = 1;
        pf.j1 j1Var = this.d;
        int size = j1Var.f45841g.size();
        if (size != 0) {
            int i10 = this.f28245f;
            this.f28248s = i10;
            this.f28245f = size + 1 + i10;
        } else {
            this.f28248s = -1;
        }
        int size2 = j1Var.f45839e.size();
        if (size2 != 0) {
            int i11 = this.f28245f;
            this.v = i11;
            this.f28245f = size2 + 1 + i11;
        } else {
            this.v = -1;
        }
        int i12 = this.f28245f;
        this.f28245f = i12 + 1;
        this.f28247r = i12;
        super.l();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        TLObject tLObject;
        TLRPC.User user;
        String str;
        boolean z10;
        CharSequence charSequence;
        int size;
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.s3 s3Var = (org.telegram.ui.Cells.s3) view;
            if (i10 == this.f28248s) {
                s3Var.setText(LocaleController.getString(R.string.ChannelMembers));
                return;
            } else {
                if (i10 == this.v) {
                    s3Var.setText(LocaleController.getString(R.string.GlobalSearch));
                    return;
                }
                return;
            }
        }
        int i13 = this.f28248s;
        pf.j1 j1Var = this.d;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i13 < 0 || i10 <= i13) {
            i11 = this.v;
            if (i11 >= 0 || i10 <= i11) {
                tLObject = null;
            } else if (i10 < j1Var.f45839e.size() + i11 + 1) {
                tLObject = (TLObject) j1Var.f45839e.get((i10 - this.v) - 1);
            } else {
                tLObject = null;
            }
        } else if (i10 < j1Var.f45841g.size() + i13 + 1) {
            tLObject = (TLObject) j1Var.f45841g.get((i10 - this.f28248s) - 1);
        } else {
            i11 = this.v;
            if (i11 >= 0) {
                tLObject = null;
            } else {
                tLObject = null;
            }
        }
        boolean z11 = tLObject instanceof TLRPC.User;
        g30 g30Var = this.f28249w;
        if (z11) {
            user = (TLRPC.User) tLObject;
        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
            user = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) g30Var).currentAccount).getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer)));
        } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
            return;
        } else {
            user = MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) g30Var).currentAccount).getUser(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
        }
        String publicUsername = UserObject.getPublicUsername(user);
        int size2 = j1Var.f45841g.size();
        if (size2 == 0) {
            str = null;
            z10 = false;
        } else {
            int i14 = size2 + 1;
            if (i14 > i10) {
                str = j1Var.f45847n;
                z10 = true;
            } else {
                i10 -= i14;
                str = null;
                z10 = false;
            }
        }
        if (z10 || publicUsername == null || (size = j1Var.f45839e.size()) == 0 || size + 1 <= i10) {
            charSequence = null;
        } else {
            String strSubstring = j1Var.f45838c;
            if (strSubstring.startsWith("@")) {
                strSubstring = strSubstring.substring(1);
            }
            try {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "@");
                spannableStringBuilder2.append((CharSequence) publicUsername);
                int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                if (iIndexOfIgnoreCase != -1) {
                    int length = strSubstring.length();
                    if (iIndexOfIgnoreCase == 0) {
                        length++;
                    } else {
                        iIndexOfIgnoreCase++;
                    }
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                }
                charSequence = spannableStringBuilder2;
            } catch (Exception e9) {
                FileLog.e(e9);
                charSequence = publicUsername;
            }
        }
        if (str != null) {
            String userName = UserObject.getUserName(user);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(userName);
            int iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(userName, str);
            if (iIndexOfIgnoreCase2 != -1) {
                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false)), iIndexOfIgnoreCase2, str.length() + iIndexOfIgnoreCase2, 33);
            }
            spannableStringBuilder = spannableStringBuilder3;
        }
        org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
        y4Var.setTag(Integer.valueOf(i10));
        y4Var.setCustomImageVisible(g30Var.f28514b0.contains(Long.valueOf(user.f22527id)));
        y4Var.b(user, spannableStringBuilder, charSequence, false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        if (i10 != 0) {
            Context context = this.f28243c;
            if (i10 == 1) {
                org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, null);
                s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23172jg, false));
                s3Var.setTextColor(org.telegram.ui.ActionBar.g6.Qg);
                view = s3Var;
            } else if (i10 != 2) {
                view = new View(context);
            } else {
                view = new View(context);
                view.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            }
        } else {
            org.telegram.ui.Cells.y4 y4Var = new org.telegram.ui.Cells.y4(2, 2, this.f28243c, null, false);
            y4Var.setCustomRightImage(R.drawable.msg_invited);
            y4Var.setNameColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false));
            int iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23207lg, false);
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false);
            y4Var.D = iW0;
            y4Var.E = iW1;
            y4Var.setDividerColor(org.telegram.ui.ActionBar.g6.f23349tg);
            view = y4Var;
        }
        return new lk0(view);
    }
}
